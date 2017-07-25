package com.company.NetSDK;

import java.io.Serializable;

public class SDKDEV_SIP_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unregister on Reboot
	 * \else
	 * Unregister on Reboot
	 * \endif
	 */
	public boolean        bUnregOnBoot;

	/**
	 * \if ENGLISH_LANG
	 * Account Name
	 * \else
	 * Account Name
	 * \endif
	 */
	public byte        szAccoutName[] = new byte[64];

	/**
	 * \if ENGLISH_LANG
	 * SIP Server
	 * \else
	 * SIP Server
	 * \endif
	 */
	public byte        szSIPServer[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * Outbound Proxy
	 * \else
	 * Outbound Proxy
	 * \endif
	 */
	public byte        szOutBoundProxy[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * SIP User ID
	 * \else
	 * SIP User ID
	 * \endif
	 */
	public int       dwSIPUsrID;

	/**
	 * \if ENGLISH_LANG
	 * Authenticate ID
	 * \else
	 * Authenticate ID
	 * \endif
	 */
	public int       dwAuthID;

	/**
	 * \if ENGLISH_LANG
	 * Authenticate Password
	 * \else
	 * Authenticate Password
	 * \endif
	 */
	public byte        szAuthPsw[] = new byte[64];

	/**
	 * \if ENGLISH_LANG
	 * STUN Server
	 * \else
	 * STUN Server
	 * \endif
	 */
	public byte        szSTUNServer[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * Registration Expiration
	 * \else
	 * Registration Expiration
	 * \endif
	 */
	public int       dwRegExp;

	/**
	 * \if ENGLISH_LANG
	 * Local SIP Port
	 * \else
	 * Local SIP Port
	 * \endif
	 */
	public int       dwLocalSIPPort;

	/**
	 * \if ENGLISH_LANG
	 * Local RTP Port
	 * \else
	 * Local RTP Port
	 * \endif
	 */
	public int       dwLocalRTPPort;

	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * ʹ��
	 * \endif
	 */
	public boolean        bEnable;

	/**
	 * \if ENGLISH_LANG
	 * Notify ID
	 * \else
	 * ����ID
	 * \endif
	 */
	public byte        szNotifyID[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * register time, read only
	 * \else
	 * ע��ɹ���ʱ�䣻ֻ���ֶΣ��豸ָ����
	 * \endif
	 */
	public NET_TIME    stuRegTime = new NET_TIME();
}
