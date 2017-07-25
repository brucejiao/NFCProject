package com.company.NetSDK;

import java.io.Serializable;

public class SDK_IN_SET_AUDIO_OUTPUT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public int                  nChannel;              // ͨ����
    public int 				 	emMode;                // ��Ƶ���ģʽ, SDK_AUDIO_OUTPUT_MODE
    public int                  nWindow;               // ������ں�, emModeΪSDK_AUDIO_FORCE/SDK_AUDIO_ENABLE_ONE/SDK_AUDIO_DISABLE_ONEʱ��Ч, ָ�������Ƶ�Ĵ��ں�

}
