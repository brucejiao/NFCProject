package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * traffic light fault alarm
 * \else
 * ��ͨ�ƹ��ϱ���	
 * \endif
 */
public class ALARM_TRAFFIC_LIGHT_FAULT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * alarm time
	 * \else
	 * ��������ʱ��
	 * \endif
	 */
	public NET_TIME           stTime = new NET_TIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * info number
	 * \else
	 * ������Ϣ��
	 * \endif
	 */
	public int                nInfoNumber;
	
 	/**
	 * \if ENGLISH_LANG
	 * info
	 * \else
	 * ��ͨ�ƹ�����Ϣ
	 * \endif
	 */
	public LIGHT_INFO         stLightInfo[] = new LIGHT_INFO[8];
	
	public ALARM_TRAFFIC_LIGHT_FAULT() {
		for (int i = 0; i < 8; i++) {
			stLightInfo[i] = new LIGHT_INFO();
		}
	}
}
