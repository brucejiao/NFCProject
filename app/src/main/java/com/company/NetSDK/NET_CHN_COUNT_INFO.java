package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Channel quantity info
 * \else
 * ͨ��������Ϣ
 * \endif
 */
public class NET_CHN_COUNT_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Device total channels(all valid channel sum)
	 * \else
	 * �豸��ͨ����(������Чͨ����֮��)
	 * \endif
	 */
	public int					nMaxTotal;

	/**
	 * \if ENGLISH_LANG
	 * Configured channel number
	 * \else
	 * �����õ�ͨ����
	 * \endif
	 */
	public int					nCurTotal;

	/**
	 * \if ENGLISH_LANG
	 * Max local channel number, including motherboard and pluggable sub channel
	 * \else
	 * ��󱾵�ͨ����, ������Ϳɲ���ӿ�ͨ��
	 * \endif
	 */
	public int					nMaxLocal;

	/**
	 * \if ENGLISH_LANG
	 * Configured local channel number
	 * \else
	 * �����ñ���ͨ����
	 * \endif
	 */
	public int					nCurLocal;

	/**
	 * \if ENGLISH_LANG
	 * Max remote channel number
	 * \else
	 * ���Զ��ͨ����
	 * \endif
	 */
	public int					nMaxRemote;

	/**
	 * \if ENGLISH_LANG
	 * Configured remote channel
	 * \else
	 * ������Զ��ͨ����
	 * \endif
	 */
	public int					nCurRemote;
}
