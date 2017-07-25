package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video diagnosis global list(CFG_CMD_VIDEODIAGNOSIS_GLOBAL), each channel supports one diagnosis config 
 * \else
 * ��Ƶ���ȫ�ֱ�(CFG_CMD_VIDEODIAGNOSIS_GLOBAL),ÿ��ͨ��֧��һ��������� 
 * \endif
 */
public class CFG_VIDEODIAGNOSIS_GLOBAL_CHNNL implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Plan name is valid or not 
	 * \else
	 * �ƻ������Ƿ���Ч 
	 * \endif
	 */
	public boolean					abProjectName;
	
 	/**
	 * \if ENGLISH_LANG
	 * Plan name��Ansi code
	 * \else
	 * �ƻ����ƣ�Ansi����
	 * \endif
	 */
	public byte[]					szProjectName = new byte[FinalVar.MAX_PATH];
	
 	/**
	 * \if ENGLISH_LANG
	 * Real time plan name is valid or not
	 * \else
	 * ʵʱ�ƻ������Ƿ���Ч
	 * \endif
	 */
	public boolean					abRealProjectName;
	
 	/**
	 * \if ENGLISH_LANG
	 * Real time plan name��Ansi code
	 * \else
	 * ʵʱ�ƻ����ƣ�Ansi����
	 * \endif
	 */
	public byte[]					szRealProjectName = new byte[FinalVar.MAX_PATH];
}
