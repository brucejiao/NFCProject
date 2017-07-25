package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Zone Status Info Input Parameter
 * \else
 * ����״̬��Ϣ���������
 * \endif
 */
public class NET_IN_DEFENCE_STATE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Zone valid number, -1means search all zones
	 * \else
	 * ������Ч����, -1��ʾ��ѯ���з���
	 * \endif
	 */
	public int             nDefenceNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Zone number to search
	 * \else
	 * ����ѯ�ķ�����
	 * \endif
	 */
	public int             anDefence[] = new int[FinalVar.SDK_MAX_ALARMIN]; 
}