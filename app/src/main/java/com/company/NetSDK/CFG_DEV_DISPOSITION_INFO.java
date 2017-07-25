package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Normal COnfiguration 
 * \else
 * ��ͨ���� (CFG_CMD_DEV_GENERRAL) General 
 * \endif
 */
public class CFG_DEV_DISPOSITION_INFO implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Device No.��Mainly for Remoter Indentify Different Device 0~998 
	 * \else
	 * ������ţ���Ҫ����ң�������ֲ�ͬ�豸	0~998
	 * \endif
	 */
	public int 				nLocalNo;
	
 	/**
	 * \if ENGLISH_LANG
	 * Machine Name Or No. 
	 * \else
	 * �������ƻ���
	 * \endif
	 */
	public byte[]			szMachineName = new byte[256];
	
 	/**
	 * \if ENGLISH_LANG
	 * Machine Address is Road Code 
	 * \else
	 * ��������ص㼴��·����
	 * \endif
	 */
	public byte[]			szMachineAddress = new byte[256];
	
 	/**
	 * \if ENGLISH_LANG
	 * Machine Group Or Machine Affiliated Unit Default Empty��User Can Put Different Machines As One Group��Easy Management��Repeatability
	 * \else
	 * �����������豸������λ	Ĭ��Ϊ�գ��û����Խ���ͬ���豸��Ϊһ�飬���ڹ������ظ���
	 * \endif
	 */
	public byte[]			szMachineGroup = new byte[256];
	
 	/**
	 * \if ENGLISH_LANG
	 * device no. , only one in platform with interne
	 * \else
	 * �������, ����ƽ̨��Ψһ
	 * \endif
	 */
	public byte[]			szMachineID = new byte[64];
}
