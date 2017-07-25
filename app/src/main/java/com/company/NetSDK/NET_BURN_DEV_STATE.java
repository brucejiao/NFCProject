package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  burning device status
 * \else
 * ��¼�豸״̬
 * \endif
 */

public class NET_BURN_DEV_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * ROM device ID
	 * \else
	 * �����豸ID
	 * \endif
	 */
	public  int		     nDeviceID;
	
	/**
	 * \if ENGLISH_LANG
	 * ROM devicename
	 * \else
	 * �����豸����
	 * \endif
	 */
	public  byte		 szDevName[]    =  new byte[FinalVar.SDK_BURNING_DEV_NAMELEN];
	
	/**
	 * \if ENGLISH_LANG
	 * ROM total capacity, uni KB
	 * \else
	 * ����������, ��λKB
	 * \endif
	 */
    public	int           dwTotalSpace;
    
	/**
	 * \if ENGLISH_LANG
	 * ROM remaining capacity, unit KB
	 * \else
	 * ����ʣ������, ��λKB
	 * \endif
	 */
    public int            dwRemainSpace;

}