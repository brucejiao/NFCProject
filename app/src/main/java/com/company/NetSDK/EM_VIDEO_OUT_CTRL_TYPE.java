package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video output control method
 * \else
 * ��Ƶ������Ʒ�ʽ
 * \endif
 */
public class EM_VIDEO_OUT_CTRL_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Logic channel no. control method, for physical screen and splicing screen both valid
	 * \else
	 * �߼�ͨ���ſ��Ʒ�ʽ, ����������ƴ��������Ч
	 * \endif
	 */
	public static final int     EM_VIDEO_OUT_CTRL_CHANNEL = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Splicing screen ID control method,for splicing screen only
	 * \else
	 * ƴ����ID���Ʒ�ʽ, ֻ��ƴ������Ч
	 * \endif
	 */
	public static final int     EM_VIDEO_OUT_CTRL_COMPOSITE_ID = 1;
}
