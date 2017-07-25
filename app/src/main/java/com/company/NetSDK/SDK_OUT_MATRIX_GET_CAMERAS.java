package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * INetSDK.MatrixGetCameras's interface output param
 * \else
 * INetSDK.MatrixGetCameras�ӿڵ��������
 * \endif
 */
public class SDK_OUT_MATRIX_GET_CAMERAS implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * array
	 * \else
	 * ��ʾԴ��Ϣ����, �û������ڴ�
	 * \endif
	 */
	public SDK_MATRIX_CAMERA_INFO  pstuCameras[]; 
	
	/**
	 * \if ENGLISH_LANG
	 * size of source array
	 * \else
	 * ��ʾԴ�����С
	 * \endif
	 */
    public int                     nMaxCameraCount; 
    
    /**
	 * \if ENGLISH_LANG
	 * valid number of pstuCameras
	 * \else
	 * ���ص���ʾԴ����, pstuCameras����Ч����
	 * \endif
	 */
    public int                     nRetCameraCount; 
    
    /**
	 * \if ENGLISH_LANG
	 * the real channel number of device
	 * \else
	 * �豸ʵ��ͨ������
	 * \endif
	 */
    public int					   nRealChannelCount;				   
    
    
    
    public SDK_OUT_MATRIX_GET_CAMERAS(int nMaxCameraCount) {
    	this.nMaxCameraCount = nMaxCameraCount;
    	pstuCameras = new SDK_MATRIX_CAMERA_INFO[this.nMaxCameraCount];
    	for (int i = 0; i < this.nMaxCameraCount; i++) {
    		pstuCameras[i] = new SDK_MATRIX_CAMERA_INFO();
    	}
    }
    
    public SDK_OUT_MATRIX_GET_CAMERAS(int nMaxCameraCount, int nMaxVideoInputCount)
    {
    	if(nMaxCameraCount > 0)
    	{
    		this.nMaxCameraCount = nMaxCameraCount;
        	pstuCameras = new SDK_MATRIX_CAMERA_INFO[this.nMaxCameraCount];
        	for (int i = 0; i < this.nMaxCameraCount; i++) {
        		pstuCameras[i] = new SDK_MATRIX_CAMERA_INFO(nMaxVideoInputCount);
        	}
    	}
    }
}
