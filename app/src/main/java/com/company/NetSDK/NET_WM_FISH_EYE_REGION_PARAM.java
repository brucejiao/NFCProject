package com.company.NetSDK;

import java.io.Serializable;

public class NET_WM_FISH_EYE_REGION_PARAM implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public int     nCoordinateX;         // �������Ķ�Ӧ��ԭʼԲ�ĺ�����
    public int     nCoordinateY;         // �������Ķ�Ӧ��ԭʼԲ�ĺ�����������
    public int     nAngleH;              // ��X��YΪ����,У������Χ��ˮƽ�Ƕ�
    public int     nAngleV;              // ��X��YΪ����,У������Χ�Ĵ�ֱ�Ƕ�
    public int 	nAvailable;			  // ��ʾ�Ƿ����
}
