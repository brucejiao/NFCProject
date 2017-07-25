package com.company.NetSDK;

import java.io.Serializable;

public class EM_STREAM_POLICY implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static final int 	STREAM_POLICY_UNKNOWN    = 0;	// δ֪
	public static final int    	STREAM_POLICY_NONE       = 1;	// �޲���,������ʹ��"None"
	public static final int    	STREAM_POLICY_QUALITY    = 2;	// ��������"Quality"  
	public static final int    	STREAM_POLICY_FLUENCY    = 3;	// ����������"Fluency"
	public static final int	    STREAM_POLICY_AUTOADAPT  = 4;	// �Զ�"AutoAdapt"
}
