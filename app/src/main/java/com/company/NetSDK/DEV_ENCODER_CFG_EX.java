package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * front end access configuratiion parameter expansion
 * \else
 * ǰ�˽������ò�����Ϣ��չ
 * \endif
 */
public class DEV_ENCODER_CFG_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * number of channel
	 * \else
	 * ����ͨ������
	 * \endif
	 */
	public int                 nChannels;
	
	/**
	 * \if ENGLISH_LANG
	 * the front end of the every digital channel encoder information
	 * \else
	 * ������ͨ����ǰ�˱�������Ϣ
	 * \endif
	 */
	public DEV_ENCODER_INFO    stuDevInfo[] = new DEV_ENCODER_INFO[128];
	
	/**
	 * \if ENGLISH_LANG
	 * maximum number of hd video(0 means not support)
	 * \else
	 * ����ͨ��������֧�ָ�����Ƶ����(Ϊ0��ʾ��֧�ָ�������)
	 * ע�����֧�ָ������ã�����ͨ��Ϊ0~N-1������N֮�������ͨ������Ϊ���壬�п��ܱ��治�ɹ�
	 * \endif
	 */
	public byte                byHDAbility;
	
	/**
	 * \if ENGLISH_LANG
	 * support TV adjust,0:not support,1:support.
	 * \else
	 * �豸�Ƿ�֧��TV����, 0:��֧�� 1:֧��.
	 * \endif
	 */
	public byte                bTVAdjust;
	
	/**
	 * \if ENGLISH_LANG
	 * support tour or not, 0:not support, >0:the current number of device support
	 * \else
	 * �豸�Ƿ�֧�ֽ�����Ѳ, 0:��֧�� ����0:��ʾǰ��֧����Ѳ����豸��.
	 * \endif
	 */
	public byte                bDecodeTour;
	
	/**
	 * \if ENGLISH_LANG
	 * support remote PTZ control
	 * \else
	 * ָʾ�Ƿ�֧��Զ����̨���ơ�
	 * \endif
	 */
	public byte                bRemotePTZCtl;
	
	public DEV_ENCODER_CFG_EX() {
		for (int i = 0; i < 128; i++) {
			stuDevInfo[i] = new DEV_ENCODER_INFO();
		}
	}
}
