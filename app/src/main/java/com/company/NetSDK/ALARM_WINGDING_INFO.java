package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * CoilFault alarm event
 * \else
 * ��Ȧ / ����������
 * \endif
 */
public class ALARM_WINGDING_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * road number
	 * \else
	 * ������
	 * \endif
	 */
	public int                 nDriveWayID;
	
 	/**
	 * \if ENGLISH_LANG
	 * coil ID
	 * \else
	 * ��ȦID
	 * \endif
	 */
	public int                 nWindingID;
	
 	/**
	 * \if ENGLISH_LANG
	 * event happen time 
	 * \else
	 * ��������ʱ��
	 * \endif
	 */
	public NET_TIME            stuTime = new NET_TIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * Device state,0 indicate fault recover,1 indicate fault happen
	 * \else
	 * �豸״̬��0��ʾ���ϻָ���1��ʾ��������
	 * \endif
	 */
	public int                 nState;
 	/**
	 * \if ENGLISH_LANG
	 * Channel of alarm
	 * \else
	 * ������ͨ����
	 * \endif
	 */
	public int                 dwChannel;
}
