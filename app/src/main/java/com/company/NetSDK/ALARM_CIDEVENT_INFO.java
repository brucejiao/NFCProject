package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * CID Event
 * \else
 * CID�¼�
 * \endif
 */
public class ALARM_CIDEVENT_INFO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm event time
	 * \else
	 * �����¼�������ʱ��
	 * \endif
	 */
	public NET_TIME        stuTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * bell status event
	 * \else
	 * CID code, standard protocolcode, string length is 16��string value is 0~F
	 * 4 bit user code + 2 bit recognition code + 1 bit event limit code + 3 bit event code + 2 bit system code + 3 bit zone code + 1 bit parity code
	 * \endif
	 */
	public byte			   szCID[] = new byte[FinalVar.SDK_COMMON_STRING_32];
}
