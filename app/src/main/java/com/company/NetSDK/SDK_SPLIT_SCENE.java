package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * split scene
 * \else
 * ƴ��������
 * \endif
 */
public class SDK_SPLIT_SCENE implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public byte[]				szCompositeID = new byte[FinalVar.SDK_DEV_ID_LEN];	// composite ID
	public byte[]				szControlID = new byte[FinalVar.SDK_DEV_ID_LEN];		// control ID
	public int					emSplitMode;					// split mode @SDK_SPLIT_MODE
	public SDK_SPLIT_WINDOW[]	pstuWnds;						// info of array
	public int					nMaxWndCount;					// size of array
	public int					nRetWndCount;					// return count
	
	public SDK_SPLIT_SCENE(int windowCount) {
		this.nMaxWndCount = windowCount;
		pstuWnds = new SDK_SPLIT_WINDOW[this.nMaxWndCount];
		for(int i = 0; i < windowCount; ++i) {
			pstuWnds[i] = new SDK_SPLIT_WINDOW();
		}
	}
}
