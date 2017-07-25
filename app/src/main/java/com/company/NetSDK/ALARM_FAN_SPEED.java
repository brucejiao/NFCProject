package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * fan speed abnormal
 * \else
 * ����ת���쳣�¼�
 * \endif
 */
public class ALARM_FAN_SPEED implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * 0-start, 1-stop
	 * \else
	 * 0-��ʼ, 1-ֹͣ
	 * \endif
	 */
	public int                dwAction;
	
 	/**
	 * \if ENGLISH_LANG
	 * index
	 * \else
	 * �������
	 * \endif
	 */
	public int                dwIndex;
	
 	/**
	 * \if ENGLISH_LANG
	 * name
	 * \else
	 * ����������
	 * \endif
	 */
	public byte                 szName[] = new byte[FinalVar.SDK_MACHINE_NAME_NUM];
	
 	/**
	 * \if ENGLISH_LANG
	 * time
	 * \else
	 * �¼�����ʱ��
	 * \endif
	 */
	public NET_TIME             stuTime = new NET_TIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * current speed
	 * \else
	 * ��ǰת��
	 * \endif
	 */
	public int                dwCurrent;                           
}
