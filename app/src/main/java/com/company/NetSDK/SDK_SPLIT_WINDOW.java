package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * split scene
 * \else
 * �ָ����Ϣ
 * \endif
 */
public class SDK_SPLIT_WINDOW implements Serializable {
	private static final long serialVersionUID = 1L;
	
    public boolean                 bEnable;                        // �����Ƿ�����ƵԴ
    public int                     nWindowID;                      // ����ID
    public byte[]                  szControlID = new byte[FinalVar.SDK_DEV_ID_LEN];     // ����ID
    public SDK_RECT                stuRect = new SDK_RECT();                        // ��������, ���ɷָ�ģʽ����Ч
    public boolean                 bDirectable;                    // �����Ƿ�����ֱͨ����
    public int                     nZOrder;                        // ����Z����
    public SDK_SPLIT_WND_SOURCE    stuSource = new SDK_SPLIT_WND_SOURCE();                      	// ��ʾ��Ϣ
}
