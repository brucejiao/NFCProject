package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * tv wall scheme tour status info 
 * \else
 * ����ǽԤ����Ѳ״̬��Ϣ
 * \endif
 */
public class NET_WM_TOUR_STATUS_INFO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * tour status 
	 * \else
	 * ��Ѳ״̬
	 * \endif
	 * @see EM_NET_WM_TOUR_STATUS
	 */
	 public int	emStatus;          
	    
	/**
	 * \if ENGLISH_LANG
	 * scheme information
	 * \else
	 * Ԥ����Ϣ
	 * \endif
	 */
	 public SDK_MONITORWALL_SCENE    stuScene;
	 
	 public NET_WM_TOUR_STATUS_INFO(int splitSceneCount, int blockCount, int OutputCount, int windowCount) {
		 stuScene = new SDK_MONITORWALL_SCENE(splitSceneCount, blockCount, OutputCount, windowCount);
	 }
}

