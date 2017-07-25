package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * get bypass mode 
 * \else
 * ��ȡ��·״̬
 * \endif
 */
public class NET_DEVSTATE_GET_BYPASS implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Local Alarm Input Channel Number, member counts of array pnLocal
	 * \else
	 * ���ر�������ͨ������, pnLocal����ĳ�Ա����
	 * \endif
	 */	
	public int nLocalCount;
	/**
	 * \if ENGLISH_LANG
	 * Local Alarm Input Channel ID, malloc by caller
	 * \else
	 * ���ر�������ͨ����, ����������ռ�
	 * \endif
	 */	
	public int pnLocal[];
	
	/**
	 * \if ENGLISH_LANG
	 * Expand Module Alarm Input Channel Number, member counts of array pnExtended
	 * \else
	 * ��չģ�鱨������ͨ������, pnExtended����ĳ�Ա����
	 * \endif
	 */	
	public int nExtendedCount;
	/**
	 * \if ENGLISH_LANG
	 * Expand Module Alarm Input Channel ID, malloc by caller
	 * \else
	 * ��չģ�鱨������ͨ����, ����������ռ�
	 * \endif
	 */
	public int pnExtended[];

	/**
	 * \if ENGLISH_LANG
	 * Local Alarm Input Channel Statue, malloc by caller
	 * \else
	 * ���ر�������ͨ��״̬, ����������ռ�, ����ΪNET_BYPASS_MODE
	 * \endif
	 */
	public int pemLocal[];
	/**
	 * \if ENGLISH_LANG
	 * Expand Module Alarm Input Channel Statue, malloc by caller
	 * \else
	 * ��չģ�鱨������ͨ��״̬, ����������ռ�, ����ΪNET_BYPASS_MODE
	 * \endif
	 */
	public int pemExtended[];
}
