package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * According to the mobile function
 * (Event triggers message)MMS Configuration Structure
 * \else
 * ������mobile�������
 * (�¼�������ý�����/���ŷ���)MMS���ýṹ��
 * \endif
 */
public class SDKDEV_MMS_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * ʹ��
	 * \endif
	 */
	public int               dwEnable;

	/**
	 * \if ENGLISH_LANG
	 * Receiver amount
	 * \else
	 * ���Ž����߸���
	 * \endif
	 */
	public int               dwReceiverNum;

	/**
	 * \if ENGLISH_LANG
	 * Receiver,normally cellphone
	 * \else
	 * ���Ž����ߣ�һ��Ϊ�ֻ�����
	 * \endif
	 */
	public byte				SZReceiver[][] = new byte[FinalVar.SDK_MMS_RECEIVER_NUM][32];
	
	/**
	 * \if ENGLISH_LANG
	 * Message type 0:MMS;1:SMS
	 * \else
	 * ������Ϣ���� 0:MMS��1:SMS
	 * \endif
	 */
	public byte                byType;

	/**
	 * \if ENGLISH_LANG
	 * Message title
	 * \else
	 * ������Ϣ����
	 * \endif
	 */
	public byte                SZTitle[] = new byte[32];
}
