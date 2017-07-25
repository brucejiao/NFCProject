package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * atm:overlay set configuration
 * \else
 * atm:���õ�������
 * \endif
 */
public class SDKDEV_ATM_OVERLAY_CONFIG_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 1:Net, 2:Com, 3:Com422
	 * \else
	 * 1:Net(����), 2:Com(����), 3:Com422(����422)
	 * \endif
	 */
	public int               dwDataSource;

	/**
	 * \if ENGLISH_LANG
	 * protocol name
	 * \else
	 * Э�����֣�
	 * \endif
	 */
	public byte                szProtocol[] = new byte[33];

	/**
	 * \if ENGLISH_LANG
	 * overlay channel,the mask means: dwChannelMask[0] is channel 1,so on
	 * \else
	 * ���ӵ�ͨ���ţ������ʾ, dwChannelMask[0]��ʾ0-31ͨ�����������ơ�
	 * \endif
	 */
	public int               dwChannelMask[] = new int[8];

	/**
	 * \if ENGLISH_LANG
	 * 1:Preview(preview), 2:Encode(encode), 3:Preview&Encode(preview and encode)
	 * \else
	 * 1:Preview(Ԥ������), 2:Encode(�������), 3:Preview&Encode(Ԥ���ͱ������)
	 * \endif
	 */
	public byte                bMode;

	/**
	 * \if ENGLISH_LANG
	 * 1:LeftTop, 2:LeftBottom , 3:RightTop , 4:RightBottom
	 * \else
	 * 1:LeftTop(����), 2:LeftBottom(����), 3:RightTop(����), 4:RightBottom(����)
	 * \endif
	 */
	public byte                bLocation;

	/**
	 * \if ENGLISH_LANG
	 * latch time,0~65535s
	 * \else
	 * ������ʾ�ӳ�ʱ��,����¼����ʱ�ر�ʱ��,0~65535s
	 * \endif
	 */
	public int                 nLatchTime;

	/**
	 * \if ENGLISH_LANG
	 * number of key word
	 * \else
	 * �ؼ��ָ���
	 * \endif
	 */
	public byte                bRecordSrcKeyNum;

	/**
	 * \if ENGLISH_LANG
	 * key word
	 * \else
	 * ����Ƶͨ����Ӧ����Դ�ؼ���(��ͬͨ�����Զ�Ӧ��ͬ������Դ)
	 * \endif
	 */
	public int                 nRecordSrcKey[] = new int[256];
}
