package com.company.NetSDK;

import java.io.Serializable;

public class CFG_DVRIP_INFO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public int                 nTcpPort;                           // TCP����˿�,1025~65535
	public int                 nSSLPort;                           // SSL����˿�,1025~65535
	public int                 nUDPPort;                           // UDP����˿�,1025~65535
	public int                 nMaxConnections;                    // ��������� 
	public boolean             bMCASTEnable;                       // �鲥ʹ��
	public int                 nMCASTPort;                         // �鲥�˿ں�
	public byte                szMCASTAddress[] = new byte[FinalVar.MAX_ADDRESS_LEN];    // �鲥��ַ
	public int                 nRegistersNum;                      // ����ע�����ø���
	public CFG_REGISTER_SERVER_INFO stuRegisters[] = new CFG_REGISTER_SERVER_INFO[FinalVar.MAX_REGISTER_NUM];// ����ע������ 
    public int    			   emStreamPolicy;                     // ������ʱ��������, ��Ӧ EM_STREAM_POLICY
    
    public CFG_DVRIP_INFO() {
    	for (int i = 0; i < FinalVar.MAX_REGISTER_NUM; ++i) {
    		stuRegisters[i] =  new CFG_REGISTER_SERVER_INFO();
    	}
    }
}
