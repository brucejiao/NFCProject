package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Mail detail content
 * \else
 * �ʼ���ϸ����
 * \endif
 */
public class CFG_MAIL_DETAIL implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Attachment type
	 * \else
	 * ��������, CFG_ATTACHMENT_TYPE
	 * \endif
	 */
	public int				   emAttachType;                 

	/**
	 * \if ENGLISH_LANG
	 * File upload limit��unit kB
	 * \else
	 * �ļ���С���ޣ���λkB
	 * \endif
	 */
	public int                 nMaxSize;                     

	/**
	 * \if ENGLISH_LANG
	 * Max record length, unit is s��valid to video
	 * \else
	 * ���¼��ʱ�䳤�ȣ���λ�룬��video��Ч
	 * \endif
	 */
	public int                 nMaxTimeLength;               
}
