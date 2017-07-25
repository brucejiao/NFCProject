package com.company.NetSDK;

import java.io.Serializable;

public class CFG_EMAIL_INFO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public boolean		   bEnable;				                            // ʹ��
    public boolean         bSslEnable;                                         // �Ƿ���ҪSSL����
    public boolean         bTlsEnable;                                         // �Ƿ���ҪTLS����
    public byte            szAddress[] = new byte[FinalVar.MAX_ADDRESS_LEN];   // SMTP������IP��ַ��������
    public int             nPort;                                              // �˿ں�
    public byte            szUserName[] = new byte[FinalVar.MAX_USERNAME_LEN]; // �ʻ���
    public byte            szPassword[] = new byte[FinalVar.MAX_PASSWORD_LEN]; // ����
    public boolean         bAnonymous;                                         // �����ʼ���true������false������
    public byte            szSendAddress[]  = new byte[FinalVar.MAX_ADDRESS_LEN];// �����˵�ַ
    public int             nRetReciversNum;                                      // ��Ч�ռ�����
    public byte            szReceivers[][] = new byte[FinalVar.MAX_RECEIVER_NUM][FinalVar.MAX_ADDRESS_LEN];     // �ռ����б�
    public byte            szTitle[] = new byte[FinalVar.MAX_MAILTITLE_LEN];     // �ʼ�����ؼ���
    public boolean         bOnlyAttachment;                                      // �¼������ʼ���ֻ���ʹ��������ʼ�
    public boolean         bAttachEnable;                                        // �ʼ�����ʹ��
    public int             nSendInterv;                                          // ͬһ�¼�����С�ʼ����ͼ������λΪ��
    public boolean         abHealthReport;                                    	  // ����,Ϊtrueʱ,stuHealthReport��Ч
    public CFG_HEALTHREPORT_INFO   stuHealthReport = new CFG_HEALTHREPORT_INFO();// �ʼ��ϱ��豸״��
}
