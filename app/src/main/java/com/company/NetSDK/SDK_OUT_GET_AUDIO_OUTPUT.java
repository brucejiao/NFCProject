package com.company.NetSDK;

import java.io.Serializable;

public class SDK_OUT_GET_AUDIO_OUTPUT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public int  				emMode;                // ��Ƶ���ģʽ, SDK_AUDIO_OUTPUT_MODE
    public int                  nWindow;               // ������ں�, emModeΪSDK_AUDIO_FORCEʱ��Ч
    public int[]                pMultiWindows;         // ������ں��б�, emModeΪSDK_AUDIO_MULTIʱ��Ч, �û������ڴ�
    public int                  nMaxMultiWindowCount;  // ������ں��б��������, �û���д
    public int                  nRetMultiWindowCount;  // ������ں�����, emModeΪSDK_AUDIO_MULTIʱ��Ч
	
    public SDK_OUT_GET_AUDIO_OUTPUT(int nMaxMultiWindowCount) {
		this.nMaxMultiWindowCount = nMaxMultiWindowCount;
		
		pMultiWindows = new int[nMaxMultiWindowCount];
	}
}
