package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * 
 * \else
 * ��������߶�����Ϣ
 * \endif
 */
public class SDK_POLY_POINTS implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * point number
	 * \else
	 * ������
	 * \endif
	 */
	public int        nPointNum; 
	
	/**
	 * \if ENGLISH_LANG
	 * point info
	 * \else
	 * ������Ϣ
	 * \endif
	 */
	public SDK_POINT   stuPoints[] = new SDK_POINT[FinalVar.SDK_MAX_DETECT_REGION_NUM]; 
	
	public SDK_POLY_POINTS() {
		for (int i = 0; i < FinalVar.SDK_MAX_DETECT_REGION_NUM; i++) {
			stuPoints[i] = new SDK_POINT();
		}
	}
}
