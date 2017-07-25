package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * 
 * \else
 * ������ʱ����(��Ӧ CFG_CMD_DEFENCE_AREA_DELAY ����)
 * \endif
 */
public class CFG_DEFENCE_AREA_DELAY_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * �н�����ʱ�ķ������ͣ�����������EM_CFG_DefenceAreaType_Entrance2��, ��ʹ�ô˽�����ʱ
	 * \endif
	 */
	public int                 nEnterDelay1;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * ֻ�з�������ΪEM_CFG_DefenceAreaType_Entrance2, �Ż�ʹ�ô˽�����ʱ
	 * \endif
	 */
	public int                 nEnterDelay2;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * �������˳���ʱ�ķ���, ��ʹ�ô��˳���ʱ
	 * \endif
	 */
	public int                 nExitDelay;
}
