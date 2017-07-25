package com.company.NetSDK;

import java.io.Serializable;

public class CFG_SERVER_INFO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	public int                 nPort;                             // �������˿ں�
	public byte                szAddress[] = new byte[FinalVar.MAX_ADDRESS_LEN];        // IP��ַ��������
}
