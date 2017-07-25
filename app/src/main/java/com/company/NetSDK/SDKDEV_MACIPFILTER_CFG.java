package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * MAC,IP filter configuration
 * \else
 * MAC,IP�������ýṹ��
 * \endif
 */
public class SDKDEV_MACIPFILTER_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * enable
	 * \else
	 * ʹ��
	 * \endif
	 */
	public int                    dwEnable;

	/**
	 * \if ENGLISH_LANG
	 * The current list type;0:White List 1:Blacklist(The device can enable only one type of list) can only user one kind of device
	 * \else
	 * ��ǰ�������ͣ�0�������� 1�����������豸ֻ��ʹһ��������Ч�������ǰ����������Ǻ�������
	 * \endif
	 */
	public int                    dwType;

	/**
	 * \if ENGLISH_LANG
	 * black list MAC,IP count (MAC,IP one to one)
	 * \else
	 * ������MAC,IP����(MAC,IPһһ��Ӧ)
	 * \endif
	 */
	public int                    dwBannedMacIpNum;

	/**
	 * \if ENGLISH_LANG
	 * black list Mac,IP
	 * \else
	 * ������Mac,IP
	 * \endif
	 */
	public MACIP_INFO               stuBannedMacIp[] = new MACIP_INFO[FinalVar.SDK_MACIPFILTER_NUM];

	/**
	 * \if ENGLISH_LANG
	 * white list MAC,IP count(MAC,IP one to one)
	 * \else
	 * ������MAC,IP����(MAC,IPһһ��Ӧ)
	 * \endif
	 */
	public int                    dwTrustMacIpNum;

	/**
	 * \if ENGLISH_LANG
	 * white list Mac,IP
	 * \else
	 * ������Mac,IP
	 * \endif
	 */
	public MACIP_INFO               stuTrustMacIp[] = new MACIP_INFO[FinalVar.SDK_MACIPFILTER_NUM];
    
    public SDKDEV_MACIPFILTER_CFG() {
    	for (int i = 0; i < FinalVar.SDK_MACIPFILTER_NUM; i++) {
    		stuBannedMacIp[i] = new MACIP_INFO();
    		stuTrustMacIp[i] = new MACIP_INFO();
    	}
    }
}
