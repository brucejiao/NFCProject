package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * decoder tour configuration
 * \else
 * ������Ѳ����
 * \endif
 */
public class SDKDEV_DECODER_TOUR_SINGLE_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Front-end device's ip.Such as"10.7.5.21". Support retention of the domain name, end by '\0'.
	 * \else
	 * ǰ���豸ip.����"10.7.5.21". ������������֧��.��Ҫ��'\0'����.
	 * \endif
	 */
	public byte        szIP[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * Front-end device's port.(0, 65535).
	 * \else
	 * ǰ���豸�˿�.(0, 65535).
	 * \endif
	 */
	public int         nPort;

	/**
	 * \if ENGLISH_LANG
	 * front-end device's Request channel [1, 16].
	 * \else
	 * ����ǰ���豸ͨ��[1, 16].
	 * \endif
	 */
	public int         nPlayChn;

	/**
	 * \if ENGLISH_LANG
	 * front-end device's Stream type, 0:main; 1:sub.
	 * \else
	 * ����ǰ����������, 0:������; 1:������.
	 * \endif
	 */
	public int         nPlayType;

	/**
	 * \if ENGLISH_LANG
	 * front-end device's user name,end by '\0'.
	 * \else
	 * ��½ǰ���豸���û���,��Ҫ��'\0'����.
	 * \endif
	 */
	public byte        szUserName[] = new byte[32];

	/**
	 * \if ENGLISH_LANG
	 * front-end device's Password,end by '\0'.
	 * \else
	 * ��½ǰ���豸������,��Ҫ��'\0'����.
	 * \endif
	 */
	public byte        szPassword[] = new byte[32];

	/**
	 * \if ENGLISH_LANG
	 * Round tour interval [10, 120],s.
	 * \else
	 * ��Ѳ���ʱ��[10, 120],��λ��.
	 * \endif
	 */
	public int         nInterval;

	/**
	 * \if ENGLISH_LANG
	 * device's factory(enum see IPC_TYPE)
	 * \else
	 * Ŀ���豸����(ö�� ���IPC_TYPE)
	 * \endif
	 */
	public int       nManuFactory;

	/**
	 * \if ENGLISH_LANG
	 * device's http port
	 * \else
	 * Ŀ���豸�Ķ˿�(Http�˿�)
	 * \endif
	 */
	public int        nHttpPport;

	/**
	 * \if ENGLISH_LANG
	 * device's rtsp port
	 * \else
	 * Ŀ���豸�Ķ˿�(Rtsp�˿�)
	 * \endif
	 */
	public int        nRtspPort;

	/**
	 * \if ENGLISH_LANG
	 * service type -1:auto,0:TCP;1:UDP;2:Multicast
	 * \else
	 * ��������, -1: auto, 0��TCP��1��UDP��2���鲥
	 * \endif
	 */
	public byte        byServiceType;
}
