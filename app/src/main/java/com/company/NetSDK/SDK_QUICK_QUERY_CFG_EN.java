package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Quick query structure configuration capability
 * \else
 * ���ٲ�ѯ���������ṹ��
 * \endif
 */
public class SDK_QUICK_QUERY_CFG_EN implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * <pre>
	 * 1 indicates that the device supports configuration commands to quickly return, 
	 * and that the device does not support a configuration command will return immediately 
	 * does not support, rather than in response to this command.
	 * (SetDevConfig,CLIENT_SetDevConfig interface is called, set waittime wait for the timeout 
	 * period is long enough to ensure that the configuration under normal narrowband read. 
	 * Recommended setting 60S)
	 * </pre>
	 * \else
	 * 1���豸֧������������ٷ��أ�����������ʱ���㹻���Ա�֤խ�������õ�������ȡ����������60S
	 * \endif
	 */
	public char		IsQuickQueryEnable;		
}
