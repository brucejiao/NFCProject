package com.company.NetSDK;

import java.io.Serializable;

public class NET_SELFCHECK_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int               nAlarmIn;                 // ��������ͨ����
	public int               nAlarmOut;                // �������ͨ����  
	public NET_TIME          stuTime = new NET_TIME();                  // �ϱ�ʱ��
    public byte              szPlateNo[] = new byte[FinalVar.SDK_MAX_PLATE_NUMBER_LEN]; // ����
    public byte              szICCID[] = new byte[FinalVar.SDK_MAX_SIM_LEN];  // SIM����
    public byte              byOrientation;            // ��λ״̬��0-δ��λ��1-��λ 
    public byte              byACCState;               // ACC ״̬��0-�رգ�1-��
    public byte              byConstantElecState;      // ����״̬��0-�������ӣ�1-�Ͽ���2-Ƿѹ��3-��ѹ
    public byte              byAntennaState;           // ͨ���ź�״̬��0-������1-δ֪���ϣ�2-δ�ӣ�3-��·
    
    // �ⲿ�豸״̬
    public byte              byReportStation;          // ��վ��״̬��0-δ�ӣ�1-������2-�쳣
    public byte              byControlScreen;          // ������״̬��0-δ�ӣ�1-������2-�쳣
    public byte              byPOS;                    // POS��״̬��0-δ�ӣ�1-������2-�쳣
    public byte              byCoinBox;                // Ͷ����״̬��0-δ�ӣ�1-������2-�쳣
    
    // ������
    public boolean              bTimerSnap;               // ��ʱץͼ��TRUE-֧�֣�FALSE-��֧��
    public boolean              bElectronEnclosure;       // ����Χ����TRUE-֧�֣�FALSE-��֧��
    public boolean              bTeleUpgrade;             // Զ��������TRUE-֧�֣�FALSE-��֧��   
    
    public NET_HDD_STATE     stuHddStates[] = new NET_HDD_STATE[FinalVar.SDK_MAX_DISKNUM]; // Ӳ��״̬
    public int               nHddNum;                  // Ӳ�̸���
    
    public NET_CHANNLE_STATE pChannleState[];           // ͨ��״̬����һ�����飬 
                                                // CLIENT_AttachMission�ӿڣ�NET_MISSION_TYPE_SELFCHECK���ͣ��ص��������ڴ���SDK���룬SDK�ͷ�
                                                // CLIENT_GetSelfCheckInfo�ӿڣ����Σ��ڴ����û����룬�û��ͷ�
    public int               nChannleNum;              // ʵ���ϱ���ͨ������
    public int               nChannelMax;              // CLIENT_GetSelfCheckInfo�ӿڣ�pChannleState�ڴ�����NET_CHANNLE_STATE����
    public int               emConnState;  // PAD/DVR����״̬, NET_PAD_CONNECT_STSTE
    public int               emHomeState;  // Home��״̬, NET_HOME_STATE
    
    public NET_SELFCHECK_INFO(int nChnMaxNum) {
    	for (int i = 0; i < FinalVar.SDK_MAX_DISKNUM; i++) {
    		stuHddStates[i] = new NET_HDD_STATE();
    	}
    	
    	this.nChannelMax = nChnMaxNum;
    	pChannleState = new NET_CHANNLE_STATE[nChnMaxNum];
    	for (int i = 0; i < nChnMaxNum; i++) {
    		pChannleState[i] = new NET_CHANNLE_STATE();
    	}
    }
}
