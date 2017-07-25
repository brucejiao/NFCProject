package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Light CompensationDevice Fault Alarm
 * \else
 * �����豸���ϱ���
 * \endif
 */
public class ALARM_EQUIPMENT_FILL_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * Vehicle Lane No. 
	 * \else
	 * ������
	 * \endif
	 */
	public int                 nDriveWayID;
	
 	/**
	 * \if ENGLISH_LANG
	 * Alarm Occuring Time 
	 * \else
	 * ��������ʱ��
	 * \endif
	 */
	public NET_TIME            stuTime = new NET_TIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * Device Status��0 Means Fault Recovery��1 Means Fault Occurs 
	 * \else
	 * �豸״̬��0��ʾ���ϻָ���1��ʾ��������
	 * \endif
	 */
	public int                 nState;
	
 	/**
	 * \if ENGLISH_LANG
	 * Alarm Channel No. 
	 * \else
	 * ������ͨ����
	 * \endif
	 */
	public int                 dwChannel;
}
