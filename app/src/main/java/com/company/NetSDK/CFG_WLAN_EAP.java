package com.company.NetSDK;

import java.io.Serializable;

public class CFG_WLAN_EAP implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int        emMethod;                           // EAP����, EM_CFG_EAP_METHOD
	public int        emAuthType;                         // EAP�����֤����, EM_CFG_EAP_AUTH_TYPE
	public byte                    szIdentity[] = new byte[FinalVar.MAX_USERNAME_LEN];       // ���
	public byte                    szAnonymousID[] = new byte[FinalVar.MAX_USERNAME_LEN];    // �������
	public byte                    szPassword[] = new byte[FinalVar.MAX_PASSWORD_LEN];       // ����
	public byte                    szCaCert[] = new byte[512];                      // CA֤��
	public byte                    szUserCert[] = new byte[512];                    // �û�֤�� 
}
