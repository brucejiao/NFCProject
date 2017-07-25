package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * GetMemberNames output parameter
 * \else
 * GetMemberNames�������
 * \endif
 */
public class NET_OUT_MEMBERNAME implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The error code device returns
	 * \else
	 * �豸���صĴ�����
	 * \endif
	 */
	public int           nError;
	
	/**
	 * \if ENGLISH_LANG
	 * Device reboot or not
	 * \else
	 * �豸�Ƿ�����
	 * \endif
	 */
	public int           nRestart;
	
	/**
	 * \if ENGLISH_LANG
	 * Name amount. Fromt the capability set. Caller fill in.
	 * \else
	 * ���Ƹ��� ͨ���������õ�����������д
	 * \endif
	 */
	public int           nTotalNameCount;
	
	/**
	 * \if ENGLISH_LANG
	 * The returned actual name amount
	 * \else
	 * ���ص�ʵ�����Ƹ���
	 * \endif
	 */
	public int           nRetNameCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Name array. The caller apply for the memory. The amount is nTotalNameCount.
	 * \else
	 * �������� �����������ڴ棬������nTotalNameCount��
	 * \endif
	 */
	public NET_ARRAY[]   pstNames;
	
	public NET_OUT_MEMBERNAME(int nTotalNameCount, int nNameLen) {
		this.nTotalNameCount = nTotalNameCount;
		pstNames = new NET_ARRAY[nTotalNameCount];
		for (int i = 0; i < nTotalNameCount; i++) {
			pstNames[i] = new NET_ARRAY();
			pstNames[i].dwArrayLen = nNameLen;
			pstNames[i].pArray = new byte[nNameLen];
		}
	}
}
