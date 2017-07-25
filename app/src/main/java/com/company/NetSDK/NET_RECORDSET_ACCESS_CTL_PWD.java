package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Entrance Guard Record  Information
 * \else
 * �Ž������¼����Ϣ
 * \endif
 */
public class NET_RECORDSET_ACCESS_CTL_PWD implements Serializable {
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
	 * Creat Time
	 * \else
	 * ����ʱ��
	 * \endif
	 */
	public NET_TIME		stuCreateTime; 
	
	/**
	 * \if ENGLISH_LANG
	 * User's ID
	 * \else
	 * �û�ID
	 * \endif
	 */
	public char        	szUserID[] 		= new char[FinalVar.SDK_MAX_USERID_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Open Password
	 * \else
	 * ��������
	 * \endif
	 */
	public char			szDoorOpenPwd[] = new char[FinalVar.SDK_MAX_CARDPWD_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Password
	 * \else
	 * ��������
	 * \endif
	 */
	public char			szAlarmPwd[] 	= new char[FinalVar.SDK_MAX_CARDPWD_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Valid Door Number
	 * \else
	 * ��Ч�ĵ�����Ŀ
	 * \endif
	 */
	public int			nDoorNum; 
	
	/**
	 * \if ENGLISH_LANG
	 * Privileged Door Number,That is CFG_CMD_ACCESS_EVENT Configure Array Subscript
	 * \else
	 * ��Ȩ�޵�����ţ���CFG_CMD_ACCESS_EVENT����CFG_ACCESS_EVENT_INFO�������±�
	 * \endif
	 */
	public int		    sznDoors[] 		= new int[FinalVar.SDK_MAX_DOOR_NUM]; 
}
