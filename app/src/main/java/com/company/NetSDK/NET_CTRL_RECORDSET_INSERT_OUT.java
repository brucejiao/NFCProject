package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Record New Operation(Insert) Parameter
 * \else
 * ��¼����������(insert)�������
 * \endif
 */
public class NET_CTRL_RECORDSET_INSERT_OUT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Record Number(The Device Come Back When New Insert )
	 * \else
	 * ��¼���(����insertʱ�豸����)
	 * \endif
	 */
	public int		nRecNo;
}
