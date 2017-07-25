package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * NAVIGATION OR SMS, INetSDK.ControlDevice(SDK_NAVIGATION_SMS)
 * \else
 * ������Ϣ�Ͷ���Ϣ, INetSDK.ControlDevice(SDK_NAVIGATION_SMS)
 * \endif
 */
public class SDKDEV_NAVIGATION_SMSS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * phone no
	 * \else
	 * �绰����
	 * \endif
	 */
	public byte                szPhoneNum[] = new byte[FinalVar.SDK_MAX_PHONE_NO_LEN];

	/**
	 * \if ENGLISH_LANG
	 * time of sending message
	 * \else
	 * ��Ϣ����ʱ��
	 * \endif
	 */
	public NET_TIME            stMsgTime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 * type:Navigation message-Navigation,short message--SMS
	 * \else
	 * ��Ϣ���ͣ�������Ϣ-Navigation�� ����Ϣ--SMS��
	 * \endif
	 */
	public byte                szMsgType[] = new byte[FinalVar.SDK_MAX_MSGTYPE_LEN];

	/**
	 * \if ENGLISH_LANG
	 * message to send
	 * \else
	 * ���͵���Ϣ����
	 * \endif
	 */
	public byte                szSmsContext[] = new byte[FinalVar.SDK_MAX_MSG_LEN];

	/**
	 * \if ENGLISH_LANG
	 * longitude
	 * \else
	 * ��ʼ��γ��
	 * \endif
	 */
	public SDKDEV_LONGI_LATI    stLogiLati = new SDKDEV_LONGI_LATI();

	/**
	 * \if ENGLISH_LANG
	 * 01:marking true longitude
	 * \else
	 * 01����־����������ʵ��γ��
	 * \endif
	 */
	public int        uFlag;

	/**
	 * \if ENGLISH_LANG
	 * TNC,TXZ
	 * \else
	 * TNC,Ϊ�����µ�ͼ���ĵ�����ʽ��TXZ,Ϊ�����ߵ�ͼ���ĵ�����ʽ
	 * \endif
	 */
	public byte                szNavigationType[] = new byte[16];

	/**
	 * \if ENGLISH_LANG
	 * address
	 * \else
	 * �ص���Ϣ
	 * \endif
	 */
	public byte                szAddress[] = new byte[32];

	/**
	 * \if ENGLISH_LANG
	 * mode
	 * \else
	 * ����ģʽ ��Recommend�Ƽ���Economical�����ͣ�Fastest ��죻Shortest ��̣�
	 * \endif
	 */
	public byte                szNavigationMode[] = new byte[32];

	/**
	 * \if ENGLISH_LANG
	 * passing
	 * \else
	 * ���ɵ�
	 * \endif
	 */
	public SDKDEV_LONGI_LATI    stPassLogiLati[] = new SDKDEV_LONGI_LATI[5];

	/**
	 * \if ENGLISH_LANG
	 * no passing
	 * \else
	 * �����ɵ�
	 * \endif
	 */
	public SDKDEV_LONGI_LATI    stNoPassLogiLati[] = new SDKDEV_LONGI_LATI[5];
	
	public SDKDEV_NAVIGATION_SMSS() {
		for (int i = 0; i < 5; i++) {
			stPassLogiLati[i] = new SDKDEV_LONGI_LATI();
			stNoPassLogiLati[i] = new SDKDEV_LONGI_LATI();
		}
	}
}
