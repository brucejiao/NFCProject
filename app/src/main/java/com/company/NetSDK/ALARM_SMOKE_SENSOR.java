package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of smoke sensor
 * \else
 * �̸б���
 * \endif
 */
public class ALARM_SMOKE_SENSOR implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * current time
	 * \else
	 * ��ǰʱ��
	 * \endif
	 */
	public NET_TIME        stuCurTime = new NET_TIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * channel
	 * \else
	 * ����ͨ��
	 * \endif
	 */
	public int             nChannel;
	
 	/**
	 * \if ENGLISH_LANG
	 * 1:hight temperature alarm start,0:end
	 * \else
	 * 1:���±�����ʼ��0�����±�������
	 * \endif
	 */
	public byte            byHighTemperature;
	
 	/**
	 * \if ENGLISH_LANG
	 * 1:smoke alarm start,0:end
	 * \else
	 * 1:�̸б�����ʼ��0���̸б�������
	 * \endif
	 */
	public byte            bySmoke;
}
