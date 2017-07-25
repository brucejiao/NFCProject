package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * fish eye window location info
 * \else
 * ���۴���λ����Ϣ
 * \endif
 */
public class CFG_FISHEYE_WINDOW_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * window ID
	 * \else
	 * ����ID
	 * \endif
	 */
	public int               dwWindowID;
	
	/**
	 * \if ENGLISH_LANG
	 * EPtz, focus x axis
	 * \else
	 * EPtz��������̨���Ľ��������
	 * \endif
	 */
	public int               nFocusX;
	
	/**
	 * \if ENGLISH_LANG
	 * EPtz, focus y axis   
	 * \else
	 * EPtz (������̨���Ľ���������
	 * \endif
	 */
	public int               nFocusY;
	
	/**
	 * \if ENGLISH_LANG
	 * EPtz h-angle
	 * \else
	 * EPtz��ˮƽ�Ƕ�
	 * \endif
	 */
	public int               nHorizontalAngle;
	
	/**
	 * \if ENGLISH_LANG
	 * EPtz v-angle
	 * \else
	 * EPtz�Ĵ�ֱ�Ƕ�
	 * \endif
	 */
	public int               nVerticalAngle;
}
