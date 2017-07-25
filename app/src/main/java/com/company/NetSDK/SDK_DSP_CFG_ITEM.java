package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * DSP capacity search��when DSP capacity algorithm mark is 2, use.
 * \else
 * DSP������ѯ����DSP�����㷨��ʶΪ2ʱʹ�á�
 * \endif
 */
public class SDK_DSP_CFG_ITEM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * \if ENGLISH_LANG
	 *  Use resolution enumeration value(CAPTURE_SIZE) as index, main stream resolution corresponding max frame rate, if not support this resolution, then valid is 0.
	 * \else
	 * �Էֱ���ö��ֵ(CAPTURE_SIZE)Ϊ����,�������ֱ��ʶ�Ӧ֧�ֵ����֡��,�����֧�ִ˷ֱ���,��ֵΪ0.
	 * \endif
	 */
	public byte		bMainFrame[] = new byte[32];			

	/**
	 * \if ENGLISH_LANG
	 * Sub stream 1, use same bMainFrame
	 * \else
	 * ������1,ʹ��ͬbMainFrame
	 * \endif
	 */
	public byte		bExtraFrame_1[] = new byte[32];		
}
