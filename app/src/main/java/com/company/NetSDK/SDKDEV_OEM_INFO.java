package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * OEM Inquiry
 * \else
 * OEM��ѯ
 * \endif
 */
public class SDKDEV_OEM_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The name of the manufacturer 
	 * \else
	 * �������� 
	 * \endif
	 */
	public byte				szVendor[] = new byte[FinalVar.SDK_MAX_STRING_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Oem type 
	 * \else
	 * oem���� 
	 * \endif
	 */
	public byte				szType[] = new byte[FinalVar.SDK_MAX_STRING_LEN];
}
