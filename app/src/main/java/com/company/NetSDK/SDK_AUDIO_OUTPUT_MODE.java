package com.company.NetSDK;

import java.io.Serializable;

public class SDK_AUDIO_OUTPUT_MODE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public static final int SDK_AUDIO_AUTO = 0;                           // �Զ��л���Ƶ���, ֻ��һ����Ƶ����
    public static final int SDK_AUDIO_DISABLE = 1;                        // ��ֹ������Ƶ��� 
    public static final int SDK_AUDIO_FORCE = 2;                          // ǿ������û�ָ����ĳ�����ڵ���Ƶ, ֻ��һ����Ƶ����
    public static final int SDK_AUDIO_ENABLE_ONE = 3;                     // ����ָ��������Ƶ, �����ж�·��Ƶ���   
    public static final int SDK_AUDIO_DISABLE_ONE = 4;                    // �ر�ָ��������Ƶ, �����ж�·��Ƶ���
    public static final int SDK_AUDIO_MULTI  = 5;                         // ��·��Ƶ���, ��ѯʱ����, ����ʱ��ֵ��Ч
}
