package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm of record loss
 * \else
 * ��¼���¼�����
 * \endif
 */
public class ALARM_LOST_RECORD implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * 0: Stop, 1: start
	 * \else
	 * 0��ֹͣ�� 1����ʼ
	 * \endif
	 */
	public int      ActionType;
	
 	/**
	 * \if ENGLISH_LANG
	 * Channel ID, start from 1	
	 * \else
	 * ͨ���ţ���1��ʼ
	 * \endif
	 */
	public int      nChannelID;
	
 	/**
	 * \if ENGLISH_LANG
	 * Bit Stream type, 0: main stream; 1: extra stream1; 2: extra stream2; 3: extra stream3; 4: snapshot stream
	 * \else
	 * �������ͣ�0����������1��������1��2��������2��3��������3��4��ץͼ����
	 * \endif
	 */
	public int      nStreamType;
	
 	/**
	 * \if ENGLISH_LANG
	 * Event occurrence time	
	 * \else
	 * �¼�����ʱ��    
	 * \endif
	 */
	public NET_TIME  stuTime = new NET_TIME();
}
