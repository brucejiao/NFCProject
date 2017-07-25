package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Flow statistics status info of the channel 
 * \else
 * ͨ��������״̬��Ϣ
 * \endif
 */
public class SDKDEV_USE_CHANNEL_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel No.
	 * \else
	 * ͨ����
	 * \endif
	 */
	public int				nChannelNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel use purpose 
	 * \else
	 * ͨ����;
	 * \endif
	 */
	public byte				szUseType[] = new byte[32];
	
	/**
	 * \if ENGLISH_LANG
	 * Flow value(Unit��kb/s)
	 * \else
	 * ������С(��λ��kb/s)
	 * \endif
	 */
	public int				dwStreamSize;			
}
