package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * new Log information. Corresponding to QueryDeviceLog
 * \else
 * ����־��Ϣ�ṹ����Ӧ�ӿ� QueryDeviceLog �ӿ�
 * \endif
 */
public class SDK_DEVICE_LOG_ITEM_EX implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Log type��enumeration value as DH_NEWLOG_TYPE
	 * \else
	 * ��־����, ��Ӧö�� DH_NEWLOG_TYPE
	 * \endif
	 */
	public int					nLogType;
	
	/**
	 * \if ENGLISH_LANG
	 * Date
	 * \else
	 * ����
	 * \endif
	 */
	public SDKDEVTIME			stuOperateTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Operator
	 * \else
	 * ������
	 * \endif
	 */
	public byte				szOperator[] = new byte[16];
	
	/**
	 * \if ENGLISH_LANG
	 * union structure type,0:szLogContext;1:stuOldLog
	 * \else
	 * union�ṹ����,0:szLogContext��1:stuOldLog��
	 * \endif
	 */
	public byte				bUnionType;

	//union
	//{
	/**
	 * \if ENGLISH_LANG
	 * Log content
	 * \else
	 * ��־��ע��Ϣ
	 * \endif
	 */
	public byte			szLogContext[] = new byte[64];
	
	/**
	 * \if ENGLISH_LANG
	 * Old log structure 
	 * \else
	 * �ɵ���־�ṹ��
	 * \endif
	 */
	public SDK_LOG_ITEM_OLD stuOldLog;
	
	//};
	/**
	 * \if ENGLISH_LANG
	 * Detail operation
	 * \else
	 * ����Ĳ�������
	 * \endif
	 */
	public char                szOperation[] = new char[32];
	
	/**
	 * \if ENGLISH_LANG
	 * DetailContext
	 * \else
	 * ��ϸ��־��Ϣ����
	 * \endif
	 */
	public char				szDetailContext[] = new char[4 * 1024];
	
	public SDK_DEVICE_LOG_ITEM_EX()	{
		stuOperateTime = new SDKDEVTIME();
		stuOldLog = new SDK_LOG_ITEM_OLD();
	}
}
