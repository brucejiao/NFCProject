package com.company.NetSDK;

import java.io.Serializable;

public class NET_OUT_SPLIT_GET_SCENE implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public SDK_SPLIT_SCENE      stuScene;                       // ������Ϣ
	
	public NET_OUT_SPLIT_GET_SCENE(int windowCount) {
		this.stuScene = new SDK_SPLIT_SCENE(windowCount);
	}
}
