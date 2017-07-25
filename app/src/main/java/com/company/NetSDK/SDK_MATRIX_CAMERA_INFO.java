package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * available according to the source of information
 * \else
 * ���õ���ʾԴ��Ϣ
 * \endif
 */
public class SDK_MATRIX_CAMERA_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * name
	 * \else
	 * ����
	 * \endif
	 */
	public byte                szName[] = new byte[FinalVar.SDK_DEV_ID_LEN_EX];

	/**
	 * \if ENGLISH_LANG
	 * device ID
	 * \else
	 * �豸ID
	 * \endif
	 */
	public byte                szDevID[] = new byte[FinalVar.SDK_DEV_ID_LEN_EX];

	/**
	 * \if ENGLISH_LANG
	 * control ID
	 * \else
	 * ����ID
	 * \endif
	 */
	public byte                szControlID[] = new byte[FinalVar.SDK_DEV_ID_LEN_EX];

	/**
	 * \if ENGLISH_LANG
	 * channel ID, DeviceID is unique
	 * \else
	 * ͨ����, DeviceID�豸��Ψһ
	 * \endif
	 */
	public int                 nChannelID;

	/**
	 * \if ENGLISH_LANG
	 * unique channel
	 * \else
	 * �豸��ͳһ��ŵ�Ψһͨ����
	 * \endif
	 */
	public int                 nUniqueChannel;

	/**
	 * \if ENGLISH_LANG
	 * support remote device or not
	 * \else
	 * �Ƿ�Զ���豸
	 * \endif
	 */
	public boolean                bRemoteDevice;

	/**
	 * \if ENGLISH_LANG
	 * info of remote device
	 * \else
	 * Զ���豸��Ϣ
	 * \endif
	 */
	public SDK_REMOTE_DEVICE    stuRemoteDevice;
	
	/**
	 * \if ENGLISH_LANG
	 * stream type, NET_STREAM_TYPE
	 * \else
	 * ��Ƶ��������, NET_STREAM_TYPE
	 * \endif
	 */
	public int                 emStreamType;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel Types, NET_LOGIC_CHN_TYPE
	 * \else
	 * ͨ������, NET_LOGIC_CHN_TYPE
	 * \endif
	 */
	public int                 emChannelType;
	
	public SDK_MATRIX_CAMERA_INFO()
	{
		 stuRemoteDevice = new SDK_REMOTE_DEVICE();
	}
	
	public SDK_MATRIX_CAMERA_INFO(int nMaxVideoInputCount)
	{
		if(nMaxVideoInputCount > 0)
		{
			stuRemoteDevice = new SDK_REMOTE_DEVICE(nMaxVideoInputCount);
		}
	}
	
}
