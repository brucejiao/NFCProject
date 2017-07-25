package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * longitude latitude
 * \else
 * ��γ��
 * \endif
 */
public class SDKDEV_LONGI_LATI implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * preflag of longitude:N(north),S(south),W(west),E(east)
	 * \else
	 * ����ǰ�ñ�־��N��S��W��E���ֱ��ʾ�����ϡ���������
	 * \endif
	 */
	public byte                chPreLogi;

	/**
	 * \if ENGLISH_LANG
	 * preflag of latitude:N(north),S(south),W(west),E(east)
	 * \else
	 * γ��ǰ�ñ�־��N��S��W��E���ֱ��ʾ�����ϡ���������
	 * \endif
	 */
	public byte                chPreLati;

	/**
	 * \if ENGLISH_LANG
	 * longitude
	 * \else
	 * ����
	 * \endif
	 */
	public double              dbLongitude;

	/**
	 * \if ENGLISH_LANG
	 * latitude
	 * \else
	 * γ��
	 * \endif
	 */
	public double              dbLatitude;
}
