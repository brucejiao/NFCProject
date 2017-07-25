package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * 232/485 com card  linked configuration(when the info from the com fit the configuration, it will trigger the device snap picture)
 * \else
 * 232���ڿ����źš�485���ڿ����ź���������(�ڴ��ڷ������Ŀ�����Ϣ�������õĿ�����Ϣ�󣬽������豸ץͼ)
 * \endif
 */
public class COM_CARD_SIGNAL_LINK_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * card info
	 * \else
	 * ������Ϣ
	 * \endif
	 */
	public COM_CARD_SIGNAL_INFO  struCardInfo = new COM_CARD_SIGNAL_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * event link
	 * \else
	 * �¼�����
	 * \endif
	 */
	public SDK_MSG_HANDLE         struHandle = new SDK_MSG_HANDLE();
}
