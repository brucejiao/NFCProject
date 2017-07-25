package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Record Mode
 * \else
 * ¼��ģʽ
 * \endif
 */
public class AV_CFG_RecordMode implements Serializable {

 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Record Mode, 0-Auto Record��1-Mannul Record��2-Shutdown Record 
	 * \else
	 * ¼��ģʽ, 0-�Զ�¼��1-�ֶ�¼��2-�ر�¼�� 
	 * \endif
	 */
	public int					nMode;
}