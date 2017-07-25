package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * CB_fBurnCheckCallBack parameter
 * \else
 * CB_fBurnCheckCallBack ����
 * \endif
 */
public class NET_CB_BURN_CHECK_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Info Type
	 * "Checking": Calibrating
	 * "CheckResult": Result
	 * \else
	 * ��Ϣ����
	 * "Checking": У����
	 * "CheckResult": У����	
	 * \endif
	 */
	public char             	szType[] = new char[32];
																					 
	/**
	 * \if ENGLISH_LANG
	 * Result, for "CheckResult", TRUE-successful, FALSE-failed
	 * \else
	 * У����, ����"CheckResult", TRUE-�ɹ�, FALSE-ʧ��
	 * \endif
	 */
	public boolean				bCheckResult;
	
	/**
	 * \if ENGLISH_LANG
	 * Progress, for "Checking", percentage, 0~100
	 * \else
	 * У�����, ����"Checking", �ٷֱ�, 0~100
	 * \endif
	 */
	public byte				byProgress;
}
