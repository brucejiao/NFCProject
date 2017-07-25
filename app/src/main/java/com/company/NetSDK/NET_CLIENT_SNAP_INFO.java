package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * when nTriggerType==2, client snap info
 * \else
 * nTriggerType==2ʱ �ͻ��˴���ץ�Ĳ���
 * \endif
 */
public class NET_CLIENT_SNAP_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Frame no.
	 * \else
	 * ֡���
	 * \endif
	 */
	public int                 nFrameSequence;
	
	/**
	 * \if ENGLISH_LANG
	 * Time stamp, 64 bit ms time stamp
	 * \else
	 * ʱ���,64λ����ʱ���
	 * \endif
	 */
	public double              PTS;
	
	/**
	 * \if ENGLISH_LANG
	 * String��client custom,"\0" end
	 * \else
	 * �ַ������ͻ����Զ���,"\0"��β
	 * \endif
	 */
	public byte				szUserDefinedInfo[] = new byte[FinalVar.SDK_MAX_USER_DEFINE_INFO];
	
	/**
	 * \if ENGLISH_LANG
	 * Client Type {@link com.company.NetSDK.SNAP_CLIENT_TYPE SNAP_CLIENT_TYPE}
	 * \else
	 * �ͻ������� {@link com.company.NetSDK.SNAP_CLIENT_TYPE SNAP_CLIENT_TYPE}
	 * \endif
	 */
	public int    emSNAP_CLIENT_TYPE;
	
	/**
	 * \if ENGLISH_LANG
	 * Issue card quantity
	 * \else
	 * ��Ƭ����
	 * \endif
	 */
	public int               dwRetCardNumber;
    
    /**
	 * \if ENGLISH_LANG
	 * Card Info
	 * \else
	 * ��Ƭ��Ϣ
	 * \endif
	 */
	public EVENT_CARD_INFO     stuCardInfo[] = new EVENT_CARD_INFO[FinalVar.SDK_EVENT_MAX_CARD_NUM];
	
	public NET_CLIENT_SNAP_INFO() {
		for (int i = 0; i < FinalVar.SDK_EVENT_MAX_CARD_NUM; i++) {
			stuCardInfo[i] = new EVENT_CARD_INFO();
		}
	}
}
