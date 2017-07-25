package com.company.NetSDK;


import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Infrared panel 
 * \else
 * �������
 * \endif
 */
public class CFG_INFRARED_BOARD implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * \if ENGLISH_LANG
	 * Panel number, unique identifier
	 * \else
	 * �����, Ψһ��ʾ
	 * \endif
	 */
	public int    nID;
	
	
	/**
	 * \if ENGLISH_LANG
	 * Panel control peripherals name, user-defined
	 * \else
	 * ��������������, �û��Զ���
	 * \endif
	 */
	public byte 	szName[] = new byte[FinalVar.CFG_COMMON_STRING_64];
	
	/**
	 * \if ENGLISH_LANG
	 * Panel type, 0 to DVD, TV 
	 * \else
	 * �������, 0-DVD, 1-TV
	 * \endif
	 */
	public int		nCategory;
	
	
	/**
	 * \if ENGLISH_LANG
	 * Infrared communication port 
	 * \else
	 * ����ͨѶ�˿�
	 * \endif
	 */
	public int		nCommPort;
	
	
	/**
	 * \if ENGLISH_LANG
	 * The associated template ID 
	 * \else
	 * ������ģ��ID
	 * \endif
	 */
	
	public int		nTemplateID;
	
		
}