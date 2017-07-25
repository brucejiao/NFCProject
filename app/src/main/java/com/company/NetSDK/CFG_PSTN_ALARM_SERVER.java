package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Telephone Alarm Center Linkage Information
 * \else
 * �绰��������������Ϣ
 * \endif
 */
public class CFG_PSTN_ALARM_SERVER implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 *  Whether to Report to the Call Center
	 * \else
	 * �Ƿ��ϱ����绰��������	
	 * \endif
	 */
	public boolean				bNeedReport; 
	
	/**
	 * \if ENGLISH_LANG
	 *  The Number of Telephone Alarm Server
	 * \else
	 * �绰��������������	
	 * \endif
	 */
	public int					nServerCount;				
	
	/**
	 * \if ENGLISH_LANG
	 * Report to the Alarm Center Subscript
	 * \else
	 * �ϱ��ı��������±�
	 * \endif
	 * @see ������� CFG_PSTN_ALARM_CENTER_INFO
	 */
	public byte[] 				byDestination = new byte[FinalVar.MAX_PSTN_SERVER_NUM]; 
}
