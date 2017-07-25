package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * PowerControl's interface input param(monitor wall power control)
 * \else
 * PowerControl�ӿ��������(����ǽ��Դ����)
 * \endif
 */
public class SDK_IN_WM_POWER_CTRL implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Monitor wall ID
	 * \else
	 * ����ǽ���
	 * \endif
	 */
	public int					nMonitorWallID;
	
	/**
	 * \if ENGLISH_LANG
	 * Block ID, NULL/""- means all
	 * \else
	 * ����ID, NULL/""-��������
	 * \endif
	 */
	public String				pszBlockID;
	
	/**
	 * \if ENGLISH_LANG
	 * TV ID, -1 means all
	 * \else
	 * ��ʾ��Ԫ���, -1��ʾ������������ʾ��Ԫ
	 * \endif
	 */
	public int					nTVID;
	
	/**
	 * \if ENGLISH_LANG
	 * Power on or not
	 * \else
	 * �Ƿ�򿪵�Դ
	 * \endif
	 */
	public boolean				bPowerOn;
}
