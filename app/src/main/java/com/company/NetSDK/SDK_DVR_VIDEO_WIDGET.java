package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video OSD overlay
 * \else
 * ��ƵOSD��������
 * \endif
 */
public class SDK_DVR_VIDEO_WIDGET implements Serializable {
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
	public int   rgbaFrontground;
	
	/**
	 * \if ENGLISH_LANG
	 * Background
	 * \else
	 * ����ı��������ֽڱ�ʾ���ֱ�Ϊ�졢�̡�����͸����
	 * \endif
	 */
	public int   rgbaBackground;
	
	/**
	 * \if ENGLISH_LANG
	 * Position
	 * \else
	 * λ��,����߾��������ı���*8191 
	 * \endif
	 */
	public RECT    rcRelativePos = new RECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Preview Blend
	 * \else
	 * Ԥ������ʹ��
	 * \endif
	 */
	public boolean    bPreviewBlend;
	
	/**
	 * \if ENGLISH_LANG
	 * Encode Blend
	 * \else
	 * �������ʹ��
	 * \endif
	 */
	public boolean    bEncodeBlend;
}
