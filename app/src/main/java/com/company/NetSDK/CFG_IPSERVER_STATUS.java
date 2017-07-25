package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Service Status
 * \else
 * ����״̬
 * \endif
 */
public class CFG_IPSERVER_STATUS implements Serializable { 	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Supported Server Num
	 * \else
	 * �ṩ�ķ������
	 * \endif
	 */
	public int			nSupportedServerNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * Supported Server Name
	 * \else
	 * �ṩ�ķ�������  
	 * \endif
	 */
	public byte[][]		szSupportServer = new byte[FinalVar.MAX_SEVER_NUM][FinalVar.MAX_NAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Svr Supported SubServer Info Num 
	 * \else
	 * Svr�ṩ���ӷ�����Ϣ����
	 * \endif
	 */
	public int 			nSvrSuppSubServerNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * Svr Supported SubServer Info CMS DMS MTS SS RMS DBR
	 * \else
	 * Svr�ṩ���ӷ�����Ϣ CMS DMS	MTS	SS RMS DBR
	 * \endif
	 */
	public byte[][]		szSvrSuppSubServer = new byte[FinalVar.MAX_SEVER_NUM][FinalVar.MAX_NAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run 
	 * \else
	 * 0:δ֪ 1:���� 2:δ����
	 * \endif
	 */
	public byte			byCMS;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:δ֪ 1:���� 2:δ����
	 * \endif
	 */
	public byte			byDMS;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:δ֪ 1:���� 2:δ����
	 * \endif
	 */
	public byte			byMTS;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:δ֪ 1:���� 2:δ����
	 * \endif
	 */
	public byte			bySS;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:δ֪ 1:���� 2:δ����
	 * \endif
	 */
	public byte			byRMS;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:δ֪ 1:���� 2:δ����
	 * \endif
	 */
	public byte			byDBR;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:δ֪ 1:���� 2:δ����
	 * \endif
	 */
	public byte			bySvrd;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:δ֪ 1:���� 2:δ����
	 * \endif
	 */
	public byte			byDataBase;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:δ֪ 1:���� 2:δ����
	 * \endif
	 */
	public byte			byDataBased;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:δ֪ 1:���� 2:δ����
	 * \endif
	 */
	public byte			byNtpServer;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:δ֪ 1:���� 2:δ����
	 * \endif
	 */
	public byte			byNtpServerd;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:δ֪ 1:���� 2:δ����
	 * \endif
	 */
	public byte			byPrivateII;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:δ֪ 1:���� 2:δ����
	 * \endif
	 */
	public byte			byPrivateIId;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:δ֪ 1:���� 2:δ����
	 * \endif
	 */
	public byte			bySAMBA;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:δ֪ 1:���� 2:δ����
	 * \endif
	 */
	public byte			byNFS;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:δ֪ 1:���� 2:δ����
	 * \endif
	 */
	public byte			byFTP;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:δ֪ 1:���� 2:δ����
	 * \endif
	 */
	public byte			byISCSI;
}
