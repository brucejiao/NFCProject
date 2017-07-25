package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Capture network configuration
 * \else
 * ����ץ������
 * \endif
 */
public class SDK_SNIFFER_FRAME implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Each FRAME ID Options
	 * \else
	 * ÿ��FRAME ID ѡ��
	 * \endif
	 */
	public SDK_SNIFFER_FRAMEID    snifferFrameId = new SDK_SNIFFER_FRAMEID();
	
	/**
	 * \if ENGLISH_LANG
	 * Each FRAME Corresponding to the contents of capture
	 * \else
	 * ÿ��FRAME��Ӧ��8��ץ������
	 * \endif
	 */
	public SDK_SNIFFER_CONTENT    snifferContent[] = new SDK_SNIFFER_CONTENT[FinalVar.SDK_SNIFFER_CONTENT_NUM];
	
	public SDK_SNIFFER_FRAME() {
		for (int i = 0; i < FinalVar.SDK_SNIFFER_CONTENT_NUM; i++) {
			snifferContent[i] = new SDK_SNIFFER_CONTENT();
		}
	}
}
