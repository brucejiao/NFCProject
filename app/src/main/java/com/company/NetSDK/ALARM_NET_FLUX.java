package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * net flux abnormal
 * \else
 * ���������쳣�¼�
 * \endif
 */
public class ALARM_NET_FLUX implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * 0-start, 1-stop
	 * \else
	 * 0-��ʼ, 1-ֹͣ
	 * \endif
	 */
	public int                dwAction;
	
 	/**
	 * \if ENGLISH_LANG
	 * data flux,KB	
	 * \else
	 * ��ǰ��������, KB
	 * \endif
	 */
	public int                dwDataFlux;
	
 	/**
	 * \if ENGLISH_LANG
	 * time
	 * \else
	 * �¼�����ʱ��
	 * \endif
	 */
	public NET_TIME             stuTime = new NET_TIME();
}
