package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Remote Device Structure
 * \else
 * Զ���豸
 * \endif
 */
public class AV_CFG_RemoteDevice implements Serializable { 	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
 	/**
	 * \if ENGLISH_LANG
	 * Enable 
	 * \else
	 * ʹ��
	 * \endif
	 */
	public boolean			bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Device ID 
	 * \else
	 * �豸ID
	 * \endif
	 */
	public byte[]			szID = new byte[FinalVar.AV_CFG_Device_ID_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Device IP 
	 * \else
	 * �豸IP
	 * \endif
	 */
	public byte[]			szIP = new byte[FinalVar.AV_CFG_IP_Address_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Port 
	 * \else
	 * �˿�
	 * \endif
	 */
	public int				nPort;
	
 	/**
	 * \if ENGLISH_LANG
	 * Protoco
	 * \else
	 * Э������
	 * \endif
	 */
	public byte[]			szProtocol = new byte[FinalVar.AV_CFG_Protocol_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Username 
	 * \else
	 * �û���
	 * \endif
	 */
	public byte[]			szUser = new byte[FinalVar.AV_CFG_User_Name_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Password 
	 * \else
	 * ����
	 * \endif
	 */
	public byte[]			szPassword = new byte[FinalVar.AV_CFG_Password_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Device Serial No.
	 * \else
	 * �豸���к�
	 * \endif
	 */
	public byte[]			szSerial = new byte[FinalVar.AV_CFG_Serial_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Device Class 
	 * \else
	 * �豸����
	 * \endif
	 */
	public byte[]			szDevClass = new byte[FinalVar.AV_CFG_Device_Class_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Device Type 
	 * \else
	 * �豸�ͺ�
	 * \endif
	 */
	public byte[]			szDevType = new byte[FinalVar.AV_CFG_Device_Type_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Device Name 
	 * \else
	 * ��������
	 * \endif
	 */
	public byte[]			szName = new byte[FinalVar.AV_CFG_Device_Name_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Device Address 
	 * \else
	 * ��������ص�
	 * \endif
	 */
	public byte[]			szAddress = new byte[FinalVar.AV_CFG_Address_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Device Group 
	 * \else
	 * ��������
	 * \endif
	 */
	public byte[]			szGroup = new byte[FinalVar.AV_CFG_Group_Name_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Definition, 0-Standard Definition, 1-High Definition 
	 * \else
	 * ������, 0-����, 1-����
	 * \endif
	 */
	public int				nDefinition;
	
 	/**
	 * \if ENGLISH_LANG
	 * Video Channel Input Number 
	 * \else
	 * ��Ƶ����ͨ����
	 * \endif
	 */
	public int				nVideoChannel;
	
 	/**
	 * \if ENGLISH_LANG
	 * Audio Channel Input Number 
	 * \else
	 * ��Ƶ����ͨ����
	 * \endif
	 */
	public int				nAudioChannel;
	
 	/**
	 * \if ENGLISH_LANG
	 * Rtsp port no. 
	 * \else
	 * Rtsp�˿ں�
	 * \endif
	 */
	public int				nRtspPort;
	
 	/**
	 * \if ENGLISH_LANG
	 * Device input type 
	 * \else
	 * �豸��������
	 * \endif
	 */
	public byte[]			szVendor = new byte[FinalVar.MAX_PATH];
	
 	/**
	 * \if ENGLISH_LANG
	 * Video input channel��user apply for nMaxVideoInputs CFG_RemoteDeviceVideoInputSpace 
	 * \else
	 * ��Ƶ����ͨ�����û�����nMaxVideoInputs��CFG_RemoteDeviceVideoInput�ռ�
	 * \endif
	 */
	public CFG_RemoteDeviceVideoInput[]			pVideoInput;

	public int				nMaxVideoInputs;

	public int				nRetVideoInputs;
	
 	/**
	 * \if ENGLISH_LANG
	 * http port
	 * \else
	 * http�˿ں�
	 * \endif
	 */
	public int				nHttpPort;						
	
	public AV_CFG_RemoteDevice(int nMaxVideoInputs) {
		this.nMaxVideoInputs = nMaxVideoInputs;
		this.pVideoInput = new CFG_RemoteDeviceVideoInput[this.nMaxVideoInputs];
		for (int i = 0; i < this.nMaxVideoInputs; ++i) {
			this.pVideoInput[i] = new CFG_RemoteDeviceVideoInput();
		}
	}
}

