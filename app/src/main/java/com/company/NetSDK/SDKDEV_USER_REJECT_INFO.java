package com.company.NetSDK;

import java.io.Serializable;

public class SDKDEV_USER_REJECT_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * ip
	 * \else
	 * ip��ַ
	 * \endif
	 */
	public byte                szIpAddress[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * User Group
	 * \else
	 * �û���
	 * \endif
	 */
	public byte                szUserGroup[] = new byte[32]; 
	
	/**
	 * \if ENGLISH_LANG
	 * User Name
	 * \else
	 * �û���
	 * \endif
	 */
	public byte                szUserName[] = new byte[32]; 
}
