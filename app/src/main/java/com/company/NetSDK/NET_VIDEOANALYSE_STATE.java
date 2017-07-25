package com.company.NetSDK;

import java.io.Serializable;

public class NET_VIDEOANALYSE_STATE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int            dwProgress;                        // �������ȣ�0-100
	public byte             szState[] = new byte[FinalVar.SDK_COMMON_STRING_64];      // ͨ��״̬,Running"�����У�"Stop"��ֹͣ��"NoStart"��δ������"Failed"��ʧ�ܣ�"Successed"���ɹ�
	public byte             szFailedCode[] = new byte[FinalVar.SDK_COMMON_STRING_64]; // ������
}
