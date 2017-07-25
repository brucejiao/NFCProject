package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * OSD attribute structure
 * \else
 * OSD���Խṹ
 * \endif
 */
public class SDK_ENCODE_WIDGET implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Front ground 
	 * \else
	 * �����ǰ�������ֽڱ�ʾ���ֱ�Ϊ�졢�̡�����͸����
	 * \endif
	 */
	public int				rgbaFrontground;
	
	/**
	 * \if ENGLISH_LANG
	 * Back ground 
	 * \else
	 * ����ı��������ֽڱ�ʾ���ֱ�Ϊ�졢�̡�����͸����
	 * \endif
	 */
	public int				rgbaBackground;
	
	/**
	 * \if ENGLISH_LANG
	 * Position 
	 * \else
	 * λ��
	 * \endif
	 */
	public SDK_RECT				rcRect = new SDK_RECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Show
	 * \else
	 * ��ʾʹ��
	 * \endif
	 */
	public byte				bShow;
	
	/**
	 * \if ENGLISH_LANG
	 * Extend Function Mask��0-Not Display��1-Display 
	 * \else
	 * ��չʹ�� ������  bit0 ��ʾ�Ƿ���ʾ���ڼ���0-����ʾ 1-��ʾ 
	 * \endif
	 */
	public byte                bExtFuncMask;
}
