package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device burner information 
 * \else
 * �豸��¼����Ϣ
 * \endif
 */
public class SDK_BURNING_DEVINFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Burner device amount
	 * \else
	 * ��¼�豸����
	 * \endif
	 */
	public int					dwDevNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Each burner device information 
	 * \else
	 * ����¼�豸��Ϣ
	 * \endif
	 */
	public NET_DEV_BURNING		stDevs[] = new NET_DEV_BURNING[FinalVar.SDK_MAX_BURNING_DEV_NUM];
	
	public SDK_BURNING_DEVINFO() {
		for (int i = 0; i < FinalVar.SDK_MAX_BURNING_DEV_NUM; i++) {
			stDevs[i] = new NET_DEV_BURNING();
		}
	}
}
