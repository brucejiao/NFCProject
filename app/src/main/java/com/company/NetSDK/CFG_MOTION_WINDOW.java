package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Motion detection supported video window config
 * \else
 * ����֧�ֵ���Ƶ��������
 * \endif
 */
public class CFG_MOTION_WINDOW implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Area threshold��value [0, 100]
	 * \else
	 * �����ֵ��ȡֵ[0, 100]
	 * \endif
	 */
	public int                  nThreshold;           

	/**
	 * \if ENGLISH_LANG
	 * Sensitivity��value[0, 100]
	 * \else
	 * �����ȣ�ȡֵ[0, 100]
	 * \endif
	 */
	public int                  nSensitive;           

	/**
	 * \if ENGLISH_LANG
	 * Motion detection area, coordinate value [0, 8192)
	 * \else
	 * ���촰������, ����λ��ȡֵ[0, 8192)
	 * \endif
	 */
	public CFG_RECT             stuWindow = new CFG_RECT();            
}
