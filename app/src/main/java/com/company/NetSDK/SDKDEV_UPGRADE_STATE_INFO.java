package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * device program upgrade status
 * \else
 * ��ȡ�豸����״̬
 * \endif
 */
public class SDKDEV_UPGRADE_STATE_INFO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * 0:None- no update found, default status; 1:Regular-general upgrade; 2:Emergency-forced; 3:Upgrading-upgrading
	 * \else
	 * 0:None-û�м�⵽����, Ĭ��״̬; 1:Regular-һ������; 2:Emergency-ǿ������; 3:Upgrading-������
	 * \endif
	 */
    public int                 nState;
	/**
	 * \if ENGLISH_LANG
	 * old version
	 * \else
	 * �ɰ汾
	 * \endif
	 */
    public byte                szOldVersion[] = new byte[FinalVar.UPDATE_VERSION_LEN];
	/**
	 * \if ENGLISH_LANG
	 * new version
	 * \else
	 * �°汾
	 * \endif
	 */
    public byte                szNewVersion[] = new byte[FinalVar.UPDATE_VERSION_LEN];
	/**
	 * \if ENGLISH_LANG
	 * progress
	 * \else
	 * ��������
	 * \endif
	 */
    public long                dwProgress;
}
