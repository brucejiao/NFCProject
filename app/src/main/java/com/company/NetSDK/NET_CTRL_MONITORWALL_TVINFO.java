package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * TV Wall Display Information Control Parameters
 * \else
 * ����ǽ��ʾ��Ϣ���Ʋ���
 * \endif
 */
public class NET_CTRL_MONITORWALL_TVINFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * TV Wall ID
	 * \else
	 * ����ǽID
	 * \endif
	 */
	public int					nMonitorWallID;
	
	/**
	 * \if ENGLISH_LANG
	 * Display Decoding Channel Information
	 * \else
	 * ��ʾ����ͨ����Ϣ
	 * \endif
	 */
	public boolean				bDecodeChannel;
}
