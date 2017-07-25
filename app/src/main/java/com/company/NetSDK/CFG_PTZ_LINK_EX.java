package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Activated PTZ info extension
 * \else
 * ������̨��Ϣ��չ
 * \endif
 */
public class CFG_PTZ_LINK_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Activated type 
	 * \else
	 * �������� , CFG_LINK_TYPE
	 * \endif
	 */
	public int				emType;				

	/**
	 * \if ENGLISH_LANG
	 * Activated parameter 1
	 * \else
	 * ��������1
	 * \endif
	 */
	public int			    nParam1;			

	/**
	 * \if ENGLISH_LANG
	 * Activated parameter 2
	 * \else
	 * ��������2
	 * \endif
	 */
	public int			    nParam2;            

	/**
	 * \if ENGLISH_LANG
	 * Activated parameter 3
	 * \else
	 * ��������3
	 * \endif
	 */
	public int			    nParam3;            

	/**
	 * \if ENGLISH_LANG
	 * All activated PTZ channels
	 * \else
	 * ��������̨ͨ��
	 * \endif
	 */
	public int			    nChannelID;         
}
