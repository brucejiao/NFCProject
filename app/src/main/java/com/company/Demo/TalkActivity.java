package com.company.Demo;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;

import com.company.CodecSDK.AAC_ENC_Format;
import com.company.CodecSDK.AudioBuf;
import com.company.CodecSDK.ICodecSDK;
import com.company.CodecSDK.Setformat;
import com.company.NetSDK.CB_pfAudioDataCallBack;
import com.company.NetSDK.EM_USEDEV_MODE;
import com.company.NetSDK.FinalVar;
import com.company.NetSDK.INetSDK;
import com.company.NetSDK.NET_SPEAK_PARAM;
import com.company.NetSDK.NET_TALK_TRANSFER_PARAM;
import com.company.NetSDK.SDKDEV_TALKFORMAT_LIST;
import com.company.NetSDK.SDK_TALK_CODING_TYPE;
import com.company.PlaySDK.IPlaySDK;
import com.company.PlaySDK.IPlaySDKCallBack.pCallFunction;
import com.nfcproject.R;

import java.util.ArrayList;

public class TalkActivity extends Activity 
{
	long m_TalkHandle = 0;
	boolean m_bRecordStatus = false;
	Button 		m_btStartTalk;
	Button		m_btStopTalk;
	Spinner 	m_spCodeType;
	CheckBox 	m_cbSpeakOnly;
	CheckBox	m_cbEnableWait;

	SDKDEV_TALKFORMAT_LIST m_TalkFormatList = new SDKDEV_TALKFORMAT_LIST();

	int nCurType = 0;
	boolean m_bOpenAudioRecord = false;

	long m_aacHandle = 0;
	long m_amrHandle = 0;

	Resources res;

	public class AudioDataCallBack implements CB_pfAudioDataCallBack
	{
		public void invoke(long lTalkHandle, byte pDataBuf[], byte byAudioFlag)
		{
			ToolKits.writeLog("AudioDataCallBack received " + byAudioFlag);
			if(m_TalkHandle == lTalkHandle)
			{
				if(1 == byAudioFlag)
				{
					//It means it has received the audio data from the device.
					//netsdk.AudioDec(pDataBuf);
					int nPort = 99;
					//For PCM format withour header , please add 128.
					if (m_TalkFormatList.type[nCurType].encodeType == SDK_TALK_CODING_TYPE.SDK_TALK_DEFAULT)
					{
						nPort = 100;
						for (int i = 0; i < pDataBuf.length; i++)
						{
							pDataBuf[i] += 128;
						}
					}

					//You can use PLAY SDK to decode to get PCM and then encode to other formats if you to get a uniform formats.
					IPlaySDK.PLAYInputData(nPort, pDataBuf, pDataBuf.length);
				}
			}
		}
	}

	public class TestAudioRecord implements pCallFunction
	{
		public void invoke(byte[] pDataBuffer,int nBufferLen, long pUserData)
		{
			try
			{
				//encode
				ToolKits.writeLog("AudioRecord send " + nBufferLen);
				byte encode[] = AudioRecord(pDataBuffer);

				//It means it is the audio data from the local m_TalkHandle
				long lSendLen = INetSDK.TalkSendData(m_TalkHandle, encode);
				if(lSendLen != (long)encode.length)
				{
					//Error occurred when sending the user audio data to the device
				}

			}
			catch(Exception e)
			{
			}
		}
	}

	byte[] AudioRecord(byte[] pDataBuffer)
	{
		int DataLength = pDataBuffer.length;

		if (m_TalkFormatList.type[nCurType].encodeType == SDK_TALK_CODING_TYPE.SDK_TALK_DEFAULT
				|| m_TalkFormatList.type[nCurType].encodeType == SDK_TALK_CODING_TYPE.SDK_TALK_PCM)
		{
			byte pCbData[] = null;
			pCbData = new byte[8+DataLength];

			if (m_TalkFormatList.type[nCurType].nAudioBit == 8)
			{
				for( int j = 0 ; j < DataLength; j++)
				{
					pDataBuffer[j] += 128;
				}
			}

			pCbData[0]=(byte)0x00;
			pCbData[1]=(byte)0x00;
			pCbData[2]=(byte)0x01;
			pCbData[3]=(byte)0xF0;

			pCbData[4]=(byte)(m_TalkFormatList.type[nCurType].nAudioBit==8?0x07:0x0C);
			if( 8000 == m_TalkFormatList.type[nCurType].dwSampleRate )
			{
				pCbData[5]=0x02;//8k
			}
			else if(16000 == m_TalkFormatList.type[nCurType].dwSampleRate)
			{
				pCbData[5] = 0x04;
			}
			else if(48000 == m_TalkFormatList.type[nCurType].dwSampleRate)
			{
				pCbData[5] = 0x09;
			}
			else if(32000 == m_TalkFormatList.type[nCurType].dwSampleRate)
			{
				pCbData[5] = 0x07;
			}
			pCbData[6]=(byte)(DataLength & 0x00FF);
			pCbData[7]=(byte)(DataLength>>8);
			System.arraycopy(pDataBuffer, 0, pCbData, 8, DataLength);
			return pCbData;
		}
		else if (m_TalkFormatList.type[nCurType].encodeType == SDK_TALK_CODING_TYPE.SDK_TALK_G711a)
		{
			byte pbOut[] = new byte[102400];
			int iCbLen = INetSDK.g711aEncode(pDataBuffer, pbOut, DataLength);

			byte pCbData[] = null;
			pCbData = new byte[iCbLen + 8];

			// bit stream format frame head
			pCbData[0]=0x00;
			pCbData[1]=0x00;
			pCbData[2]=0x01;
			pCbData[3]=(byte)0xF0;

			pCbData[4]=0x0E; //G711A
			if( 8000 == m_TalkFormatList.type[nCurType].dwSampleRate )
			{
				pCbData[5]=0x02;//8k
			}
			else if(16000 == m_TalkFormatList.type[nCurType].dwSampleRate)
			{
				pCbData[5] = 0x04;
			}
			else if(48000 == m_TalkFormatList.type[nCurType].dwSampleRate)
			{
				pCbData[5] = 0x09;
			}
			else if(32000 == m_TalkFormatList.type[nCurType].dwSampleRate)
			{
				pCbData[5] = 0x07;
			}
			pCbData[6]=(byte)(iCbLen&0xff);
			pCbData[7]=(byte)(iCbLen>>8);
			System.arraycopy(pbOut, 0, pCbData, 8, iCbLen);
			return pCbData;
		}
		else if (m_TalkFormatList.type[nCurType].encodeType == SDK_TALK_CODING_TYPE.SDK_TALK_G711u)
		{
			byte pbOut[] = new byte[102400];
			int iCbLen = INetSDK.g711uEncode(pDataBuffer, pbOut, DataLength);

			byte pCbData[] = null;
			pCbData = new byte[iCbLen + 8];

			// bit stream format frame head
			pCbData[0]=0x00;
			pCbData[1]=0x00;
			pCbData[2]=0x01;
			pCbData[3]=(byte)0xF0;

			pCbData[4]=0x0A; //G711u
			if( 8000 == m_TalkFormatList.type[nCurType].dwSampleRate )
			{
				pCbData[5]=0x02;//8k
			}
			else if(16000 == m_TalkFormatList.type[nCurType].dwSampleRate)
			{
				pCbData[5] = 0x04;
			}
			else if(48000 == m_TalkFormatList.type[nCurType].dwSampleRate)
			{
				pCbData[5] = 0x09;
			}
			else if(32000 == m_TalkFormatList.type[nCurType].dwSampleRate)
			{
				pCbData[5] = 0x07;
			}
			pCbData[6]=(byte)(iCbLen&0xff);
			pCbData[7]=(byte)(iCbLen>>8);
			System.arraycopy(pbOut, 0, pCbData, 8, iCbLen);
			return pCbData;
		}
		else if (m_TalkFormatList.type[nCurType].encodeType == SDK_TALK_CODING_TYPE.SDK_TALK_AMR)
		{
			// code haven't been debug
			//AMR encode
			byte pbOut[] = new byte[102400];

			AudioBuf stBuf = new AudioBuf();
			stBuf.pData = pDataBuffer;
			stBuf.channels = 1;
			stBuf.offset = 2;
			stBuf.depth = 16;
			stBuf.dataLen = pDataBuffer.length;
			stBuf.frequency = m_TalkFormatList.type[nCurType].dwSampleRate;
			Integer nOutlen = new Integer(0);
			int nRet = ICodecSDK.amrEncEncode(m_amrHandle, stBuf, pbOut, nOutlen);
			if ((0 == nRet)
					|| (nOutlen.intValue() > 0))
			{
				int iCbLen = nOutlen.intValue();
				byte pCbData[] = null;
				pCbData = new byte[iCbLen + 8];

				pCbData[0]=0x00;
				pCbData[1]=0x00;
				pCbData[2]=0x01;
				pCbData[3]=(byte)0xF0;

				pCbData[4]=0x14; //AMR
				if( 8000 == m_TalkFormatList.type[nCurType].dwSampleRate )
				{
					pCbData[5]=0x02;//8k
				}
				else if(16000 == m_TalkFormatList.type[nCurType].dwSampleRate)
				{
					pCbData[5] = 0x04;
				}
				else if(48000 == m_TalkFormatList.type[nCurType].dwSampleRate)
				{
					pCbData[5] = 0x09;
				}
				else if(32000 == m_TalkFormatList.type[nCurType].dwSampleRate)
				{
					pCbData[5] = 0x07;
				}

				pCbData[6]=(byte)(iCbLen&0xff);
				pCbData[7]=(byte)(iCbLen>>8);

				System.arraycopy(pbOut, 0, pCbData, 8, iCbLen);
				return pCbData;
			}
		}
		else if (m_TalkFormatList.type[nCurType].encodeType == SDK_TALK_CODING_TYPE.SDK_TALK_AAC)
		{
			// code haven't been debug
			//先单通道转双通道
			byte outBuf[] = new byte[DataLength*2];

			int i = 0;
			for (i = (DataLength/2 - 1); i >= 0; i--)
			{
				outBuf[4 * i]     = pDataBuffer[2 * i];
				outBuf[4 * i + 1] = pDataBuffer[2 * i + 1];
				outBuf[4 * i + 2] = pDataBuffer[2 * i];
				outBuf[4 * i + 3] = pDataBuffer[2 * i + 1];
			}

			//AAC encode
			if(m_aacHandle != 0)
			{
				byte pbOut[] = new byte[102400];

				Integer nOutlen = new Integer(0);
				AudioBuf stBuf = new AudioBuf();
				stBuf.pData = outBuf;
				stBuf.channels = 2;
				stBuf.offset = 4;
				stBuf.depth = 16;
				stBuf.dataLen = outBuf.length;
				stBuf.frequency = m_TalkFormatList.type[nCurType].dwSampleRate;
				int nRet = ICodecSDK.AACEncEncode(m_aacHandle, stBuf, pbOut, nOutlen);
				if ((0 == nRet)
						&& (nOutlen.intValue() > 0))
				{
					int iCbLen = nOutlen.intValue();
					byte pCbData[] = null;
					pCbData = new byte[iCbLen + 8];

					pCbData[0]=0x00;
					pCbData[1]=0x00;
					pCbData[2]=0x01;
					pCbData[3]=(byte)0xF0;

					pCbData[4]=0x1A; //AAC
					if( 8000 == m_TalkFormatList.type[nCurType].dwSampleRate )
					{
						pCbData[5]=0x02;//8k
					}
					else if(16000 == m_TalkFormatList.type[nCurType].dwSampleRate)
					{
						pCbData[5] = 0x04;
					}
					else if(48000 == m_TalkFormatList.type[nCurType].dwSampleRate)
					{
						pCbData[5] = 0x09;
					}
					else if(32000 == m_TalkFormatList.type[nCurType].dwSampleRate)
					{
						pCbData[5] = 0x07;
					}

					pCbData[6]=(byte)(iCbLen&0xff);
					pCbData[7]=(byte)(iCbLen>>8);

					System.arraycopy(pbOut, 0, pCbData, 8, iCbLen);
					return pCbData;
				}
			}
		}

		return null;
	}

	boolean StartAudioRecord()	{
		//	First confirm decode port.DH_TALK_DEFAULT is 100 port number and then rest is 99 port number.
		int nPort = 99;
		if (m_TalkFormatList.type[nCurType].encodeType == SDK_TALK_CODING_TYPE.SDK_TALK_DEFAULT)
		{
			nPort = 100;
		}

		//	Then specify frame length
		int nFrameLength = 1024;
		switch(m_TalkFormatList.type[nCurType].encodeType)
		{
			case SDK_TALK_CODING_TYPE.SDK_TALK_DEFAULT:
			case SDK_TALK_CODING_TYPE.SDK_TALK_PCM:
				nFrameLength = 1024;
				break;
			case SDK_TALK_CODING_TYPE.SDK_TALK_G711a:
				nFrameLength = 1280;
				break;
			case SDK_TALK_CODING_TYPE.SDK_TALK_AMR:
				nFrameLength = 320;
				break;
			case SDK_TALK_CODING_TYPE.SDK_TALK_G711u:
				nFrameLength = 320;
				break;
			case SDK_TALK_CODING_TYPE.SDK_TALK_G726:
				nFrameLength = 320;
				break;
			case SDK_TALK_CODING_TYPE.SDK_TALK_AAC:
				nFrameLength = 1024;
			default:
				break;
		}

		if (m_TalkFormatList.type[nCurType].dwSampleRate == 48000)//如果采样率48K，更新音频长度
		{
			nFrameLength = 48*40*2; // 采样率*40*2
		}

		boolean bRet = false;

		//	Then call PLAYSDK library to begin recording audio
		boolean bOpenRet = IPlaySDK.PLAYOpenStream(nPort,null,0,1024*1024) == 0? false : true;
		if(bOpenRet)
		{
			boolean bPlayRet = IPlaySDK.PLAYPlay(nPort, null) == 0 ? false : true;
			if(bPlayRet)
			{
				IPlaySDK.PLAYPlaySoundShare(nPort);
				TestAudioRecord m_audiorecordcallback = new TestAudioRecord();
				boolean bSuccess = IPlaySDK.PLAYOpenAudioRecord(m_audiorecordcallback,m_TalkFormatList.type[nCurType].nAudioBit,m_TalkFormatList.type[nCurType].dwSampleRate,nFrameLength,0) == 0? false : true;
				if(bSuccess)
				{
					bRet = true;
				}
				else
				{
					IPlaySDK.PLAYStopSoundShare(nPort);
					IPlaySDK.PLAYStop(nPort);
					IPlaySDK.PLAYCloseStream(nPort);
				}
			}
			else
			{
				IPlaySDK.PLAYCloseStream(nPort);
			}
		}

		return bRet;
	}

	String changeListType(int nCodeType)
	{
		String strCodeType = "";
		switch(nCodeType)
		{
			case SDK_TALK_CODING_TYPE.SDK_TALK_DEFAULT:
			case SDK_TALK_CODING_TYPE.SDK_TALK_PCM:
				strCodeType = "PCM";
				break;

			case SDK_TALK_CODING_TYPE.SDK_TALK_G711a:
				strCodeType = "G711a";
				break;

			case SDK_TALK_CODING_TYPE.SDK_TALK_AMR:
				strCodeType = "AMR";
				break;

			case SDK_TALK_CODING_TYPE.SDK_TALK_G711u:
				strCodeType =" G711u";
				break;

			case SDK_TALK_CODING_TYPE.SDK_TALK_G726:
				strCodeType = "G726";
				break;

			case SDK_TALK_CODING_TYPE.SDK_TALK_AAC:
				strCodeType = "AAC";
				break;

			case  SDK_TALK_CODING_TYPE.SDK_TALK_MP3:
				strCodeType = "MP3";
				break;

			default:
				strCodeType = "Unknow";
				break;
		}

		return strCodeType;
	}

	void getCodeType(Spinner sp)
	{
		if( INetSDK.QueryDevState(TestNetSDKActivity.m_loginHandle, FinalVar.SDK_DEVSTATE_TALK_ECTYPE,
				m_TalkFormatList, 4000))
		{
			ToolKits.showMessage(this , "QueryDevState SDK_DEVSTATE_TALK_ECTYPE " + res.getString(R.string.info_success));
		}
		else
		{
			ToolKits.showErrorMessage(this, "QueryDevState SDK_DEVSTATE_TALK_ECTYPE " + res.getString(R.string.info_failed));
			return ;
		}

		ArrayList<String> codeTypeList   = new ArrayList<String>();
		for(int i=0 ; i<m_TalkFormatList.nSupportNum ; i++)
		{
			codeTypeList.add(  changeListType( m_TalkFormatList.type[i].encodeType)  + "_" + m_TalkFormatList.type[i].dwSampleRate + "bps" );
		}

		ArrayAdapter<String> apCodeType = new ArrayAdapter<String>(this ,
				android.R.layout.simple_spinner_dropdown_item , codeTypeList);
		sp.setAdapter(apCodeType);
	}

	void startTalk()
	{
		nCurType = m_spCodeType.getSelectedItemPosition();

		if (m_TalkFormatList.type[nCurType].encodeType == SDK_TALK_CODING_TYPE.SDK_TALK_AAC) {
			m_aacHandle = ICodecSDK.AACEncInit();
			if (0 == m_aacHandle) {
				ToolKits.showMessage(this, "AACEncInit " + res.getString(R.string.info_failed));
				return;
			}

			AAC_ENC_Format stFormatAac = new AAC_ENC_Format();
			stFormatAac.frequency = m_TalkFormatList.type[nCurType].dwSampleRate;
			stFormatAac.channels = 2;
			stFormatAac.bitRate = 64000;
			m_aacHandle = ICodecSDK.AACEncSetFormat(stFormatAac, m_aacHandle);
			if (0 == m_aacHandle) {
				ToolKits.showMessage(this, "AACEncSetFormat " + res.getString(R.string.info_failed));
				return;
			}
		}

		if (m_TalkFormatList.type[nCurType].encodeType == SDK_TALK_CODING_TYPE.SDK_TALK_AMR) {
			m_amrHandle = ICodecSDK.amrEncInit();
			if (0 == m_amrHandle) {
				ToolKits.showMessage(this, "amrEncInit " + res.getString(R.string.info_failed));
				return;
			}

			Setformat stFormatAmr = new Setformat();
			stFormatAmr.outbits = 0;
			stFormatAmr.dtx = 1;
			if (0 != ICodecSDK.amrEncSetFormat(m_amrHandle, stFormatAmr)) {
				ToolKits.showMessage(this, "amrEncSetFormat" + res.getString(R.string.info_failed));
				return;
			}
		}

		//Set Talk Code Type
		if( false == INetSDK.SetDeviceMode(TestNetSDKActivity.m_loginHandle , EM_USEDEV_MODE.SDK_TALK_ENCODE_TYPE,
				m_TalkFormatList.type[nCurType]) )
		{
			ToolKits.showErrorMessage(this, "SetDeviceMode SDK_TALK_ENCODE_TYPE " + res.getString(R.string.info_failed));
			return;
		}
		ToolKits.writeLog("Set Code Type Success");

		if( false == INetSDK.SetDeviceMode(TestNetSDKActivity.m_loginHandle ,EM_USEDEV_MODE.SDK_TALK_SERVER_MODE, null))
		{
			ToolKits.showErrorMessage(this, "SetDeviceMode SDK_TALK_SERVER_MODE " + res.getString(R.string.info_failed));
			return;
		}
		ToolKits.writeLog("Set Server Mode Success");

		NET_TALK_TRANSFER_PARAM stTalkTransf = new NET_TALK_TRANSFER_PARAM();
		if( false == INetSDK.SetDeviceMode(TestNetSDKActivity.m_loginHandle ,EM_USEDEV_MODE.SDK_TALK_TRANSFER_MODE, stTalkTransf))
		{
			ToolKits.showErrorMessage(this, "SetDeviceMode SDK_TALK_TRANSFER_MODE " + res.getString(R.string.info_failed));
			return;
		}
		ToolKits.writeLog("Set Transfer Mode Success");

		//Set Speak Mode
		NET_SPEAK_PARAM stSpeakParam = new NET_SPEAK_PARAM();
		stSpeakParam.nSpeakerChannel = 0;
		stSpeakParam.nMode = m_cbSpeakOnly.isChecked() ? 1 : 0;
		stSpeakParam.nEnableWait = m_cbEnableWait.isChecked() ? 1 : 0;

		if( false == INetSDK.SetDeviceMode(TestNetSDKActivity.m_loginHandle ,EM_USEDEV_MODE.SDK_TALK_SPEAK_PARAM,
				stSpeakParam) )
		{
			ToolKits.showErrorMessage(this, "SetDeviceMode SDK_TALK_SPEAK_PARAM " + res.getString(R.string.info_failed));
			return;
		}
		ToolKits.writeLog("Set Speak Mode Success");

		//Start Talk
		AudioDataCallBack audiaDatacb = new AudioDataCallBack();
		m_TalkHandle = INetSDK.StartTalkEx(TestNetSDKActivity.m_loginHandle, audiaDatacb);
		if(0 != m_TalkHandle)
		{
			//	Then enbale local record function.(Does not call it if it is a one-direction audio talk.)
			//netsdk.RecordStart();
			boolean bSuccess = StartAudioRecord();
			if(bSuccess)
			{
				m_bOpenAudioRecord = true;
				m_btStartTalk.setEnabled(false);
				m_btStopTalk.setEnabled(true);
				m_bRecordStatus = true;
			}
			else
			{
				INetSDK.StopTalkEx(m_TalkHandle);
				ToolKits.showErrorMessage(this, "StartAudioRecord " + res.getString(R.string.info_failed));
			}
		}
		else
		{
			ToolKits.showErrorMessage(this, "StartTalkEx " + res.getString(R.string.info_failed));
			ToolKits.writeErrorLog("Open talk failed!");
		}
	}

	void stopTalk()
	{
		if (m_bOpenAudioRecord)
		{
			boolean bSuccess = IPlaySDK.PLAYCloseAudioRecord() == 0 ? false : true;
			if(bSuccess)
			{
				m_bOpenAudioRecord = false;
				IPlaySDK.PLAYStop(100);
				IPlaySDK.PLAYStop(99);
				IPlaySDK.PLAYStopSoundShare(100);
				IPlaySDK.PLAYStopSoundShare(99);
				IPlaySDK.PLAYCloseStream(100);
				IPlaySDK.PLAYCloseStream(99);
			}
		}

		if(m_bRecordStatus)
		{
			//Stop local record
			//netsdk.RecordStop();
			m_bRecordStatus = false;
		}

		if(0 != m_TalkHandle)
		{
			//Stop audio talk to the device
			boolean bSuccess = INetSDK.StopTalkEx(m_TalkHandle);
			if(bSuccess)
			{
				m_TalkHandle = 0;
				m_btStartTalk.setEnabled(true);
				m_btStopTalk.setEnabled(false);
			}
			else
			{
				ToolKits.showErrorMessage(this, "StopTalkEx " + res.getString(R.string.info_failed));
			}
		}

		if (0 != m_aacHandle) {
			ICodecSDK.AACEncDeInit(m_aacHandle);
			m_aacHandle = 0;
		}

		if (0 != m_amrHandle) {
			ICodecSDK.amrEncDeInit(m_amrHandle);
			m_amrHandle = 0;
		}
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.talkview);

		// 一般不需要这个函数，偶尔出现过 程序退入后台较长时间，无法找到native方法的情况
		INetSDK.LoadLibrarys();

		res = this.getResources();

		m_btStartTalk = (Button)findViewById(R.id.btStartTalk);
		m_btStopTalk  = (Button)findViewById(R.id.btStopTalk);
		m_spCodeType  = (Spinner)findViewById(R.id.spCodeType);
		m_cbSpeakOnly = (CheckBox)findViewById(R.id.cbSpeakOnly);
		m_cbEnableWait = (CheckBox)findViewById(R.id.cbEnableWait);

		getCodeType(m_spCodeType);

		m_btStartTalk.setOnClickListener( new OnClickListener() {
			public void onClick(View v)
			{
				startTalk();
			}
		});
		m_btStartTalk.setEnabled(true);

		m_btStopTalk.setOnClickListener( new OnClickListener() {
			public void onClick(View v)
			{
				stopTalk();
			}
		});
		m_btStopTalk.setEnabled(false);
	}

	@Override
	protected void onDestroy()
	{
		stopTalk();
		super.onDestroy();
	}
}
