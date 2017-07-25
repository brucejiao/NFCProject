package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Playback Time Parameters
 * \else
 * ��ʱ��ط�ǰ���豸����
 * \endif
 */
public class DEC_PLAYBACK_TIME_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * IP address of Front-end DVR
	 * \else
	 * ǰ��DVR��IP��ַ
	 * \endif
	 */
	public byte			szDevIp[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Port of Front-end DVR
	 * \else
	 * ǰ��DVR�Ķ˿ں�
	 * \endif
	 */
	public int				wDevPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Decoder channel enable
	 * \else
	 * ����ͨ��ʹ��
	 * \endif
	 */
	public byte			bDevChnEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * The corresponding channel number
	 * \else
	 * ��Ӧ����ͨ����
	 * \endif
	 */
	public byte			byDecoderID;
	
	/**
	 * \if ENGLISH_LANG
	 * User Name
	 * \else
	 * �û���
	 * \endif
	 */
	public byte			szDevUser[] = new byte[FinalVar.SDK_USER_NAME_LENGTH_EX];
	
	/**
	 * \if ENGLISH_LANG
	 * Password
	 * \else
	 * ����
	 * \endif
	 */
	public byte			szDevPwd[] = new byte[FinalVar.SDK_USER_PSW_LENGTH_EX];
	
	/**
	 * \if ENGLISH_LANG
	 * Channel ID
	 * \else
	 * ͨ��id 
	 * \endif
	 */
	public int				nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * Start Time 
	 * \else
	 * ��ʼʱ��
	 * \endif
	 */
	public NET_TIME		startTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * End Time 
	 * \else
	 * ����ʱ��
	 * \endif
	 */
	public NET_TIME		endTime = new NET_TIME();
}
