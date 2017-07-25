package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm arm/diarm control expansion(corresponding to SDK_CTRL_ARMED_EX)
 * \else
 * ����������������չ(��ӦSDK_CTRL_ARMED_EX)
 * \endif
 */
public class CTRL_ARM_DISARM_PARAM_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * alarm arm/disarm control input
	 * \else
	 * ������������������
	 * \endif
	 */
	public CTRL_ARM_DISARM_PARAM_EX_IN  stuIn = new CTRL_ARM_DISARM_PARAM_EX_IN(); 
	
	/**
	 * \if ENGLISH_LANG
	 * alarm arm/diarm control output
	 * \else
	 * �����������������
	 * \endif
	 */
	public CTRL_ARM_DISARM_PARAM_EX_OUT stuOut = new CTRL_ARM_DISARM_PARAM_EX_OUT(); 
}
