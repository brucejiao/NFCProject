package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_RADIOMETRY_DOFIND implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public int                 nFinderHanle;                      // ��ѯ���
    public int                 nBeginNumber;                      // ���β�ѯ��ʼ��������
    public int                 nCount;                            // ���β�ѯ����,���Ϊ NET_RADIOMETRY_DOFIND_MAX
}
