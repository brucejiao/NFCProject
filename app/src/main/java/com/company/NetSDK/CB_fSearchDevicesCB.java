package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Asynchronism search device call
 * \else
 * �����豸�ص�
 * \endif
 */
public interface CB_fSearchDevicesCB {
	/**
	 * \if ENGLISH_LANG
	 * Asynchronism search device call
	 * @param pDevNetInfo recall structure
	 * \else
	 * ������߻ص�����
	 * @param pDevNetInfo �ص��ṹ��
	 * \endif
	 */
	public void invoke(DEVICE_NET_INFO_EX pDevNetInfo);
}
