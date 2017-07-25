package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * atm: overlay configuration
 * \else
 * atm:���õ�������
 * \endif
 */
public class SDKDEV_ATM_OVERLAY_CONFIG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 1:Network, 2:Comm
	 * \else
	 * 1:Net(����), 2:Com(����), 3:Com422(����422)
	 * \endif
	 */
	public int               dwDataSource;

	/**
	 * \if ENGLISH_LANG
	 * protocol name, from DHDEV_ATM_OVERLAY_GENERAL
	 * \else
	 * Э�����֣���DHDEV_ATM_OVERLAY_GENERAL����
	 * \endif
	 */
	public byte                szProtocol[] = new byte[33];

	/**
	 * \if ENGLISH_LANG
	 * channel mask
	 * \else
	 * ���ӵ�ͨ���ţ������ʾ��
	 * \endif
	 */
	public int               dwChannelMask;

	/**
	 * \if ENGLISH_LANG
	 * 1:Preview, 2:Encode, 3:Preview&Encode
	 * \else
	 * 1:Preview(Ԥ������), 2:Encode(�������), 3:Preview&Encode(Ԥ���ͱ������)
	 * \endif
	 */
	public byte                bMode;

	/**
	 * \if ENGLISH_LANG
	 * 1:LeftTop, 2:LeftBottom, 3:RightTop, 4:RightBottom
	 * \else
	 * 1:LeftTop(����), 2:LeftBottom(����), 3:RightTop(����), 4:RightBottom(����)
	 * \endif
	 */
	public byte                bLocation;

	/**
	 * \if ENGLISH_LANG
	 * display latch time on overlay, instruct the video's close latch time, 0~65535
	 * \else
	 * ������ʾ�ӳ�ʱ��,����¼����ʱ�ر�ʱ��,0~65535s
	 * \endif
	 */
	public int                 nLatchTime;

	/**
	 * \if ENGLISH_LANG
	 * key number
	 * \else
	 * �ؼ��ָ���
	 * \endif
	 */
	public byte                bRecordSrcKeyNum;

	/**
	 * \if ENGLISH_LANG
	 * key of channels
	 * \else
	 * ����Ƶͨ����Ӧ����Դ�ؼ���(��ͬͨ�����Զ�Ӧ��ͬ������Դ)
	 * \endif
	 */
	public int                 nRecordSrcKey[] = new int[32];
}
