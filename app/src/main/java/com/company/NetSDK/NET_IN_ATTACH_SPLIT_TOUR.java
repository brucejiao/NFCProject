package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * AttachSplitTourport input parameter 
 * \else
 * AttachSplitTour�ӿ��������
 * \endif
 */
public class NET_IN_ATTACH_SPLIT_TOUR implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * output channel no., pszCompsiteIDis NULL, it is valid 
	 * \else
	 * ���ͨ����, pszCompsiteIDΪNULLʱ��Ч
	 * \endif
	 */
	public int                 nChannel; 
	
	/**
	 * \if ENGLISH_LANG
	 * splicing video wall ID
	 * \else
	 * ƴ����ID
	 * \endif
	 */
	public String         	   pszCompositeID; 
	
	/**
	 * \if ENGLISH_LANG
	 * tour status call interface 
	 * \else
	 * ��Ѳ״̬�ص�����
	 * \endif
	 */
	public CB_fTourStatusCallBack cbStatus;  
}
