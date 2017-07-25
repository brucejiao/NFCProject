package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Record New Operation (Insert)Parameter 
 * \else
 * ��¼����������(insert)����
 * \endif
 */
public class NET_CTRL_RECORDSET_INSERT_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Record Information(User Write)
	 * \else
	 * ��¼����Ϣ(�û���д)
	 * \endif
	 */
	public NET_CTRL_RECORDSET_INSERT_IN		stuCtrlRecordSetInfo;
	
	/**
	 * \if ENGLISH_LANG
	 * Record Information(the Device Come Back)
	 * \else
	 * ��¼����Ϣ(�豸����)
	 * \endif
	 */
	public NET_CTRL_RECORDSET_INSERT_OUT	stuCtrlRecordSetResult;
}
