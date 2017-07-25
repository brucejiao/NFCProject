package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Asynchronous data callback
 * \else
 * �첽���ݻص�
 * \endif
 */ 
public interface CB_fMessDataCallBack {
	/**
	 * \if ENGLISH_LANG
	 * Asynchronous data callback
	 * @param lCommand commadn type 
	 * @param lpData asynchronous recall function
	 * \else
	 * �첽���ݻص�����
	 * @param lCommand �ص�����
	 * @param lpData �豸��Ϣ
	 * \endif
	 */
	public void invoke(long lCommand, NET_CALLBACK_DATA lpData);
}
