package com.company.NetSDK;

import java.io.Serializable;

public class CFG_VSP_SCYDKD_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public boolean                    bEnable;                            // ʹ��
	public byte                    szServerIP[] = new byte[128];                    // ע������ķ�����IP��ַ
	public int                     nServerPort;                        // ע������ķ������˿ں�
	public byte                    szDeviceID[] = new byte[32];                     // ��Ƶ�����豸ID
	public byte                    szUserName[] = new byte[32];         // ����ƽ̨�û���
}
