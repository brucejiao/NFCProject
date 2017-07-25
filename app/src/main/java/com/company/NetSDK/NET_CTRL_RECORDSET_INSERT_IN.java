package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * New Record Set Operation(Insert)Parameter
 * \else
 * ��¼����������(insert)�������
 * \endif
 */
public class NET_CTRL_RECORDSET_INSERT_IN implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Record Information Type
	 * \else
	 * ��¼����Ϣ����
	 * 1:��ͨ�������˻���¼,��Ӧ FIND_RECORD_TRAFFICREDLIST_CONDITION
	 * 2:��ͨ�������˺ż�¼,��Ӧ FIND_RECORD_TRAFFICREDLIST_CONDITION
	 * 3:��¼������¼,��Ӧ FIND_RECORD_BURN_CASE_CONDITION 
	 * 4:�Ž���,��Ӧ NET_RECORDSET_ACCESS_CTL_CARD
	 * 5:�Ž�����,��Ӧ NET_RECORDSET_ACCESS_CTL_PWD
	 * 6:�Ž������¼,��Ӧ NET_RECORDSET_ACCESS_CTL_CARDREC
	 * 7:���ռ�¼��, ��Ӧ NET_RECORDSET_HOLIDAY
	 * \endif
	 */
	public int		nType;
	
	/**
	 * \if ENGLISH_LANG
	 * Record Information Cache,The EM_NET_RECORD_TYPE Note is Details
	 * \else
	 * ��¼����Ϣ���棬���EM_NET_RECORD_TYPEע��
	 * \endif
	 */
	public Object	pBuf;
	
	/**
	 * \if ENGLISH_LANG
	 * Record Information Cache Size
	 * \else
	 * ��¼����Ϣ�����С
	 * \endif
	 */
	public int		nBufLen;
}
