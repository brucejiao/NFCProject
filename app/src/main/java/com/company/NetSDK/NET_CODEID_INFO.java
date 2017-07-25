package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Code info
 * \else
 * ������Ϣ
 * \endif
 */
public class NET_CODEID_INFO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private static final int SDK_WIRELESS_DEVICE_SERIAL_NUMBER_MAX_LEN = 32;
	
	/**
	 * \if ENGLISH_LANG
	 * Wireless ID
	 * \else
	 * ����ID��
	 * \endif
	 */
	public long	nWirelessId;  
	
	/**
	 * \if ENGLISH_LANG
	 * The device type of wireless
	 * \else
	 * �����豸����
	 * \endif
	 * @see NET_WIRELESS_DEVICE_TYPE
	 */
	public int	emType;
	
	/**
	 * \if ENGLISH_LANG
	 * User name
	 * \else
	 * �û���
	 * \endif
	 */
	public byte[]	szName = new byte[FinalVar.SDK_USER_NAME_LENGTH];        
	
	/**
	 * \if ENGLISH_LANG
	 * If enable the device
	 * \else
	 * �Ƿ������˴��豸
	 * \endif
	 */
	public boolean bEnable;                            
	
	/**
	 * \if ENGLISH_LANG
	 * Custom name
	 * \else
	 * �Զ�������
	 * \endif
	 */
	public byte[] szCustomName = new byte[FinalVar.SDK_COMMON_STRING_64];  
	
	/**
	 * \if ENGLISH_LANG
	 * It only to be valid when emType is NET_WIRELESS_DEVICE_TYPE_DEFENCE
	 * \else 
	 * ���߷�����alarmͨ����, Alarm���õ��±�,ֻ�� emType Ϊ NET_WIRELESS_DEVICE_TYPE_DEFENCE ʱ���ֶβ���Ч��
	 * \endif
	 */
	public int	nChannel;                           
	
	/**
	 * \if ENGLISH_LANG
	 * Wireless Device Mode.
	 * \else
	 * �����豸����ģʽ
	 * \endif
	 * @see EM_WIRELESS_DEVICE_MODE
	 */
	public int	emMode;                            
	
	/**
	 * \if ENGLISH_LANG
	 * The sense method
	 * \else
	 * ��������ʽ
	 * \endif
	 * @see EM_CODEID_SENSE_METHOD_TYPE
	 */
	public int	emSenseMethod;                      
	
	/**
	 * \if ENGLISH_LANG
	 * Wireless Device SN
	 * \else
	 * �����豸���к�
	 * \endif
	 */
	public byte[] szSerialNumber = new byte[SDK_WIRELESS_DEVICE_SERIAL_NUMBER_MAX_LEN]; 
}
