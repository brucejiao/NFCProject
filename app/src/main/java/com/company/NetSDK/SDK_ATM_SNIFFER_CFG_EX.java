package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Capture each of the corresponding structure
 * \else
 * ÿ��ץ����Ӧ�����ýṹ
 * \endif
 */
public class SDK_ATM_SNIFFER_CFG_EX implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Source address capture
	 * \else
	 * ץ��Դ��ַ
	 * \endif
	 */
	public byte                SnifferSrcIP[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Capture source port
	 * \else
	 * ץ��Դ�˿�
	 * \endif
	 */
	public int                 SnifferSrcPort;

	/**
	 * \if ENGLISH_LANG
	 * Destination address capture
	 * \else
	 * ץ��Ŀ���ַ
	 * \endif
	 */
	public byte                SnifferDestIP[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Capture the target port
	 * \else
	 * ץ��Ŀ��˿�
	 * \endif
	 */
	public int                 SnifferDestPort;

	/**
	 * \if ENGLISH_LANG
	 * 6 FRAME Options
	 * \else
	 * 6��FRAME ѡ��
	 * \endif
	 */
	public SDK_SNIFFER_FRAME_EX snifferFrame[] = new SDK_SNIFFER_FRAME_EX[FinalVar.SDK_SNIFFER_FRAMEID_NUM];

	/**
	 * \if ENGLISH_LANG
	 * Display Position
	 * \else
	 * ��ʾλ��
	 * \endif
	 */
	public int                 displayPosition;

	/**
	 * \if ENGLISH_LANG
	 * Channel mask
	 * \else
	 * ͨ������  0  ~ 31 ͨ��
	 * \endif
	 */
	public int                 recdChannelMask;

	/**
	 * \if ENGLISH_LANG
	 * Data sources enable
	 * \else
	 * ������Դʹ��
	 * \endif
	 */
	public boolean                bDateScopeEnable;

	/**
	 * \if ENGLISH_LANG
	 * Protocol enable
	 * \else
	 * Э��ʹ��
	 * \endif
	 */
	public boolean                bProtocolEnable;

	/**
	 * \if ENGLISH_LANG
	 * Protocol name
	 * \else
	 * Э������
	 * \endif
	 */
	public byte                szProtocolName[] = new byte[FinalVar.SDK_SNIFFER_PROTOCOL_SIZE];

	/**
	 * \if ENGLISH_LANG
	 * Capture mode; 0:net,1:232.
	 * \else
	 * ץ����ʽ��0:net,1:232.
	 * \endif
	 */
	public int                 nSnifferMode;

	/**
	 * \if ENGLISH_LANG
	 * Channel submask  32 ~ 63 channel
	 * \else
	 * ͨ������  32 ~ 63 ͨ��
	 * \endif
	 */
	public int                 recdChannelMask1;
    
    public SDK_ATM_SNIFFER_CFG_EX() {
    	for (int i = 0; i < FinalVar.SDK_SNIFFER_FRAMEID_NUM; i++) {
    		snifferFrame[i] = new SDK_SNIFFER_FRAME_EX();
    	}
    }
}
