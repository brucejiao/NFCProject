package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Bypass Status Change Event Info
 * \else
 * ��·״̬�仯�¼�����Ϣ
 * \endif
 */
public class ALARM_BYPASSMODE_CHANGE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel No.
	 * \else
	 * ͨ����
	 * \endif
	 */
	public int                     nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Event Time
	 * \else
	 * �����¼�������ʱ��
	 * \endif
	 */
	public NET_TIME                stuTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * Armed Zone Type {@link com.company.NetSDK.NET_DEFENCEAREA_TYPE NET_DEFENCEAREA_TYPE}
	 * \else
	 * �������� {@link com.company.NetSDK.NET_DEFENCEAREA_TYPE NET_DEFENCEAREA_TYPE}
	 * \endif
	 */
	public int                     emDefenceType;
	
	/**
	 * \if ENGLISH_LANG
	 * Whether as extension (channel) armed zone or not, 1: extension channel, 0: non-extension channel
	 * \else
	 * �Ƿ�Ϊ��չ(ͨ��)����, 1:��չͨ��, 0: ����չͨ��
	 * \endif
	 */
	public int                     nIsExtend;
	
	/**
	 * \if ENGLISH_LANG
	 * Mode After Change {@link com.company.NetSDK.NET_BYPASS_MODE NET_BYPASS_MODE}
	 * \else
	 * �仯���ģʽ {@link com.company.NetSDK.NET_BYPASS_MODE NET_BYPASS_MODE}
	 * \endif
	 */
	public int                    emMode;
	
	/**
	 * \if ENGLISH_LANG
	 * ID number, remote control number or keypad address, emTriggerMode=0 when belong to NET_EM_TRIGGER_MODE_NET
	 * \else
	 * ID��, ң������Ż���̵�ַ, emTriggerModeΪNET_EM_TRIGGER_MODE_NET����ʱΪ0
	 * \endif
	 */
	public int                     dwID; 
	
	/**
	 * \if ENGLISH_LANG
	 * trigger mode, NET_EM_TRIGGER_MODE
	 * \else
	 * ������ʽ, NET_EM_TRIGGER_MODE
	 * \endif
	 */
	public int                     emTriggerMode; 
}
