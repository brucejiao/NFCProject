package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Car way info
 * \else
 * ÿ�������������Ϣ
 * \endif
 */
public class SDK_CARWAY_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Current car way id 
	 * \else
	 * ��ǰ������ 
	 * \endif
	 */
	public byte                bCarWayID;
	
	/**
	 * \if ENGLISH_LANG
	 * Being snapshotted
	 * \else
	 * ������ץ�ĵĸ���
	 * \endif
	 */
	public byte                bSigCount;
	
	/**
	 * \if ENGLISH_LANG
	 * The snapshot info
	 * \else
	 * ��ǰ�����ϣ�������ץ�Ķ�Ӧ��ץ����Ϣ
	 * \endif
	 */
	public SDK_SIG_CARWAY_INFO  stuSigInfo[] = new SDK_SIG_CARWAY_INFO[FinalVar.SDK_MAX_SNAP_SIGNAL_NUM];
	
	public SDK_CARWAY_INFO() {
		for (int i=0 ; i<FinalVar.SDK_MAX_SNAP_SIGNAL_NUM; i++) {
			stuSigInfo[i] = new SDK_SIG_CARWAY_INFO();
		}
	}
}
