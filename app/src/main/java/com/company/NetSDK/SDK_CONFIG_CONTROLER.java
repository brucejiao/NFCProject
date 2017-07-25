package com.company.NetSDK;

import java.io.Serializable;

public class SDK_CONFIG_CONTROLER implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Com attribution
	 * \else
	 * ��������
	 * \endif
	 */
	public SDK_COMM_PROP        struComm = new SDK_COMM_PROP(); 
	
	/**
	 * \if ENGLISH_LANG
	 * Controlled light group,light number start from 1,such as[1,3,8,0?-0]present control light number 1,3,8 light
	 * \else
	 * �ܿص����飨����Ŵ�1��ʼ����������[1,3,8,0��0]��ʾ�������Ϊ1,3,8�ĵ�
	 * \endif
	 */
	public byte                bLightGroup[] = new byte[FinalVar.SDK_MAX_LIGHT_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Controller address
	 * \else
	 * ��������ַ
	 * \endif
	 */
	public byte                bDeviceAddr; 
	
	/**
	 * \if ENGLISH_LANG
	 * Com Type 0:485 COM, 1:232 COM
	 * \else
	 * �������� 0:485����, 1:232����
	 * \endif
	 */
	public byte                bComPortType; 
}
