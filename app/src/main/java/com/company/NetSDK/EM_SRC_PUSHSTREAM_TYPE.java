package com.company.NetSDK;

import java.io.Serializable;

public class EM_SRC_PUSHSTREAM_TYPE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public static final int EM_SRC_PUSHSTREAM_AUTO = 0;        // �豸�˸�������ͷ�Զ�ʶ��Ĭ��ֵ
    public static final int EM_SRC_PUSHSTREAM_HIKVISION = 1;   // ����˽������
    public static final int EM_SRC_PUSHSTREAM_PS = 2;          // PS��
    public static final int EM_SRC_PUSHSTREAM_TS = 3;          // TS��
    public static final int EM_SRC_PUSHSTREAM_SVAC = 4;        // SVAC����
}
