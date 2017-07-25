package com.company.NetSDK;

import java.io.Serializable;

public class NET_MOBILE_PUSH_NOTIFY_CFG_DEL implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public byte                            szRegisterID[] = new byte[FinalVar.MAX_REGISTER_ID_LEN];         // �ֻ���Appple/ Android������ע�᷵�صģ�ÿ�β�ͬ
	public byte                            szAppID[] = new byte[FinalVar.MAX_APP_ID_LEN];                   // �ֻ�ÿ��һ���ͻ��ˣ������һ��
}
