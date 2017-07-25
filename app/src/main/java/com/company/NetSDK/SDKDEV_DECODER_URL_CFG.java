package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * decoder protocol rtsp url configuration
 * \else
 * ������rtsp url����
 * \endif
 */
public class SDKDEV_DECODER_URL_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * main stream url
	 * \else
	 * ������url
	 * \endif
	 */
	public byte            szMainStreamUrl[] = new byte[FinalVar.MAX_PATH];

	/**
	 * \if ENGLISH_LANG
	 * extra stream url
	 * \else
	 * ������url
	 * \endif
	 */
	public byte            szExtraStreamUrl[] = new byte[FinalVar.MAX_PATH];
}
