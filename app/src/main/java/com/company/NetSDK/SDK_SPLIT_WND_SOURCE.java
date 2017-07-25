package com.company.NetSDK;

import java.io.Serializable;
/**
 * \if ENGLISH_LANG
 *  source of window display info 
 * \else
 * ������ʾԴ��Ϣ
 * \endif
 */
public class SDK_SPLIT_WND_SOURCE implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * enable 
	 * \else
	 * ��ʾԴ�Ƿ���Ч
	 * \endif
	 */
	public boolean                 bEnable; 
	
	/**
	 * \if ENGLISH_LANG
	 *  device ID
	 * \else
	 * �豸ID
	 * \endif
	 */
	public byte[]                  szDeviceID = new byte[FinalVar.SDK_DEV_ID_LEN];      
    
	/**
	 * \if ENGLISH_LANG
	 *  control ID
	 * \else
	 * ����ID
	 * \endif
	 */
	public byte[]                  szControlID = new byte[FinalVar.SDK_DEV_ID_LEN];     
    
	/**
	 * \if ENGLISH_LANG
	 * video channel ID
	 * \else
	 * ��Ƶͨ����
	 * \endif
	 */
	public int                     nVideoChannel;
    
	/**
	 * \if ENGLISH_LANG
	 *  video stream type
	 * \else
	 * ��Ƶ��������
	 * \endif
	 */
	public int                     nVideoStream;
    
	/**
	 * \if ENGLISH_LANG
	 *  audio channel ID
	 * \else
	 * ��Ƶͨ��
	 * \endif
	 */
	public int                     nAudioChannel; 
    
	/**
	 * \if ENGLISH_LANG
	 * audio stream type
	 * \else
	 * ��Ƶ��������
	 * \endif
	 */
	public int                     nAudioStream;
    
	/**
	 * \if ENGLISH_LANG
	 *  unique channel,read only
	 * \else
	 * �豸��ͳһ��ŵ�Ψһͨ����, ֻ��
	 * \endif
	 */
	public int                     nUniqueChannel;
    
	/**
	 * \if ENGLISH_LANG
	 *  support remote device
	 * \else
	 *  �Ƿ�Զ���豸
	 * \endif
	 */
	public boolean                 bRemoteDevice;                 
    
	/**
	 * \if ENGLISH_LANG
	 *  info of remote device
	 * \else
	 * Զ���豸��Ϣ
	 * \endif
	 */
	public SDK_REMOTE_DEVICE       stuRemoteDevice = new SDK_REMOTE_DEVICE();                
}
