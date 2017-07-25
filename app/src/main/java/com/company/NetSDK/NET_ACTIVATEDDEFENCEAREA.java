package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * get active defence area 
 * \else
 * ��ȡ�������
 * \endif
 */
public class NET_ACTIVATEDDEFENCEAREA implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * search local alarm input channel quantity,  need user to specify
	 * \else
	 * ��ѯ���ر�������ͨ��������������û�ָ������
	 * \endif
	 */
	public int nAlarmInCount;

	/**
	 * \if ENGLISH_LANG
	 * local alarm input channel actual activation quantity
	 * \else
	 * ���ر�������ͨ��ʵ�ʼ������
	 * \endif
	 */
	public int nRetAlarmInCount;
	
	/**
	 * \if ENGLISH_LANG
	 * local alarm input channel activated info
	 * \else
	 * ���ر�������ͨ��������Ϣ
	 * \endif
	 */
	public NET_ACTIVATEDDEFENCEAREA_INFO pstuAlarmInDefenceAreaInfo[];

	/**
	 * \if ENGLISH_LANG
	 * search extension module alarm input quantity. User specify
	 * \else
	 * ��ѯ��չģ�鱨������ͨ�����������û�ָ������
	 * \endif
	 */
	public int nExAlarmInCount;
	
	/**
	 * \if ENGLISH_LANG
	 * extension  module alarm input channel actual activation quantity
	 * \else
	 * ��չģ�鱨������ͨ��ʵ�ʼ������
	 * \endif
	 */
	public int nRetExAlarmInCount;
	
	/**
	 * \if ENGLISH_LANG
	 * extend alarm input channel activated info
	 * \else
	 * ��չ��������ͨ��������Ϣ
	 * \endif
	 */
	public NET_ACTIVATEDDEFENCEAREA_INFO pstuExAlarmInDefenceAreaInfo[];
}
