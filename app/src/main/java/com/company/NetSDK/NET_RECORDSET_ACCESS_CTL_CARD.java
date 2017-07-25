package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Entrance Guard Record Information
 * \else
 * �Ž�����¼����Ϣ
 * \endif
 */
public class NET_RECORDSET_ACCESS_CTL_CARD implements Serializable {
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
	public int		nRecNo; 
	
	/**
	 * \if ENGLISH_LANG
	 * Creat Time
	 * \else
	 * ����ʱ��
	 * \endif
	 */
	public NET_TIME	stuCreateTime 		= new NET_TIME(); 
	
	/**
	 * \if ENGLISH_LANG
	 * Card number
	 * \else
	 * ����
	 * \endif
	 */
	public char     szCardNo[] 			= new char[FinalVar.SDK_MAX_CARDNO_LEN]; 
	
	/**
	 * \if ENGLISH_LANG
	 * User's ID
	 * \else
	 * �û�ID
	 * \endif
	 */
	public char     szUserID[]			= new char[FinalVar.SDK_MAX_USERID_LEN]; 
	
	/**
	 * \if ENGLISH_LANG
	 * Card Stetue
	 * \else
	 * ��״̬.0:����.1:��ʧ.2:ע��.4:����
	 * \endif
	 */
	public int		nStatus; 
	
	/**
	 * \if ENGLISH_LANG
	 * Card Type
	 * \else
	 * ������.1:һ�㿨.2:VIP��.3:������.4:Ѳ�߿�.5:��������.6:в�ȿ�.0xff:ĸ��
	 * \endif
	 */
	public int		nType; 
	
	/**
	 * \if ENGLISH_LANG
	 * Card Password
	 * \else
	 * ������
	 * \endif
	 */
	public char		szPsw[]				= new char[FinalVar.SDK_MAX_CARDPWD_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Valid Door Number
	 * \else
	 * ��Ч������Ŀ
	 * \endif
	 */
	public int		nDoorNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Privileged Door Number,That is CFG_CMD_ACCESS_EVENT Configure Array Subscript
	 * \else
	 * ��Ȩ�޵�����ţ���CFG_CMD_ACCESS_EVENT���õ������±�
	 * \endif
	 */
	public int		sznDoors[] 			= new int[FinalVar.SDK_MAX_DOOR_NUM]; 
	
	/**
	 * \if ENGLISH_LANG
	 * the Number of Effective Open Time
	 * \else
	 * ��Ч�ĵĿ���ʱ�����Ŀ
	 * \endif
	 */
	public int		nTimeSectionNum; 
	
	/**
	 * \if ENGLISH_LANG
	 * Open Time Segment Index,That is CFG_ACCESS_TIMESCHEDULE_INFO Array subscript
	 * \else
	 * ����ʱ�����������CFG_ACCESS_TIMESCHEDULE_INFO�������±�
	 * \endif
	 */
	public int	 	sznTimeSectionNo[] 	= new int[FinalVar.SDK_MAX_TIMESECTION_NUM]; 
	
	/**
	 * \if ENGLISH_LANG
	 * Frequency of Use
	 * \else
	 * ʹ�ô���
	 * \endif
	 */
	public int		nUserTime; 
	
	/**
	 * \if ENGLISH_LANG
	 * Valid Start Time 
	 * \else
	 * ��ʼ��Ч��
	 * \endif
	 */
	public NET_TIME	stuValidStartTime 	= new NET_TIME(); 
	
	/**
	 * \if ENGLISH_LANG
	 * Valid End Time
	 * \else
	 * ������Ч��
	 * \endif
	 */
	public NET_TIME	stuValidEndTime 	= new NET_TIME(); 
	
	/**
	 * \if ENGLISH_LANG
	 * Wether Valid,True =Valid,False=Invalid
	 * \else
	 * �Ƿ���Ч,true��Ч;false��Ч
	 * \endif
	 */
	public boolean	bIsValid;
}
