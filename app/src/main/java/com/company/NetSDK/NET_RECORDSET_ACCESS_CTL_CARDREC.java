package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Access Control card Record Information
 * \else
 * �Ž�ˢ����¼��¼����Ϣ
 * \endif
 */
public class NET_RECORDSET_ACCESS_CTL_CARDREC implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Record Number,Read-Only
	 * \else
	 * ��¼����ţ�ֻ��
	 * \endif
	 */
	public int			nRecNo; 
	
	/**
	 * \if ENGLISH_LANG
	 * Card Number
	 * \else
	 * ����
	 * \endif
	 */
	public char			szCardNo[] 	= new char[FinalVar.SDK_MAX_CARDNO_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Password
	 * \else
	 * ����
	 * \endif
	 */
	public char			szPwd[] 	= new char[FinalVar.SDK_MAX_CARDPWD_LEN]; 
	
	/**
	 * \if ENGLISH_LANG
	 * Swing Card Time
	 * \else
	 * ˢ��ʱ��
	 * \endif
	 */
	public NET_TIME		stuTime = new NET_TIME(); 
	
	/**
	 * \if ENGLISH_LANG
	 * Swing Card Result,True is Succes,False is Fail
	 * \else
	 * ˢ�������TRUE��ʾ�ɹ���FALSE��ʾʧ��
	 * \endif
	 */
	public boolean		bStatus; 
	
	/**
	 * \if ENGLISH_LANG
	 * Open Door Method
	 * \else
	 * ���ŷ�ʽ
	 * 1:���뿪��
	 * 2:ˢ������
	 * 3:��ˢ�������뿪��
	 * 4:�������ˢ������
	 * 5:Զ�̿�������ͨ�����ڻ�����ƽ̨���ſڻ�����
	 * 6:������ť���п���
	 * \endif
	 */
	public int			nMethod;
	
	/**
	 * \if ENGLISH_LANG
	 * Door Number,That is CFG_CMD_ACCESS_EVENT Configure Array Subscript 
	 * \else
	 * �źţ���CFG_CMD_ACCESS_EVENT����CFG_ACCESS_EVENT_INFO�������±�
	 * \endif
	 */
	public int			nDoor; 
}
