package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input arguments of AttachCameraState
 * \else
 * AttachCameraState()�������
 * \endif
 */
public class NET_IN_CAMERASTATE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * channels, -1 means all channel
	 * \else
	 * �۲��ͨ����,����Ԫ���У���һ����-1����۲�����ͨ��
	 * \endif
	 */
	public int                        pChannels[];
	
	/**
	 * \if ENGLISH_LANG
	 * number of channels
	 * \else
	 * pChannelsָ�볤��
	 * \endif
	 */
	public int                        nChannels;
	
	/**
	 * \if ENGLISH_LANG
	 * callback function for state
	 * \else
	 * ״̬�ص�����
	 * \endif
	 */
    public CB_fCameraStateCallBack    cbCamera; 
    
    public NET_IN_CAMERASTATE(int nChannels) {
    	this.nChannels = nChannels;
    	pChannels = new int[nChannels];
    }
}
