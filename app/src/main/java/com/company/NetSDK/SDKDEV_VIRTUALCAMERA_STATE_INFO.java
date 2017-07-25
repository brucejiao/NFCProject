package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device VIRTUALCAMERA informaiton 
 * \else
 * ��������ͷ״̬��ѯ
 * \endif
 */
public class SDKDEV_VIRTUALCAMERA_STATE_INFO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel
	 * \else
	 * ͨ����
	 * \endif
	 */
	public int					nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * connect state, see CONNECT_STATE
	 * \else
	 * ����״̬���鿴CONNECT_STATE
	 * \endif
	 */
    public int                 emConnectState;
	
	/**
	 * \if ENGLISH_LANG
	 * uiPOEPort
	 * \else
	 * ����������ͷ�����ӵ�POE�˿ںţ�0��ʾ����POE���� 
	 * \endif
	 */
	public int					uiPOEPort;
	
	/**
	 * \if ENGLISH_LANG
	 * DeviceName
	 * \else
	 * �豸����
	 * \endif
	 */
	public byte                	szDeviceName[] = new byte[64];
	
	/**
	 * \if ENGLISH_LANG
	 * DeviceType
	 * \else
	 * �豸����
	 * \endif
	 */
	public byte                	szDeviceType[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * SystemType
	 * \else
	 * ϵͳ�汾
	 * \endif
	 */
	public byte                	szSystemType[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * SerialNumber
	 * \else
	 * ���к�
	 * \endif
	 */
	public byte                	szSerialNo[] = new byte[48];
	
	/**
	 * \if ENGLISH_LANG
	 * VideoInput
	 * \else
	 * ��Ƶ����ͨ����
	 * \endif
	 */
	public int					nVideoInput;
	
	/**
	 * \if ENGLISH_LANG
	 * AudioInput
	 * \else
	 * ��Ƶ����ͨ����
	 * \endif
	 */
	public int					nAudioInput;
	
	/**
	 * \if ENGLISH_LANG
	 * AlarmOutput
	 * \else
	 * �ⲿ����ͨ����
	 * \endif
	 */
	public int					nAlarmOutput;

}
