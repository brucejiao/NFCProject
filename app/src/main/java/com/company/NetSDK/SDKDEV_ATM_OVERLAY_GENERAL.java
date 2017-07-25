package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * atm: query overlay ability information
 * \else
 * atm:��ѯ�������������Ϣ
 * \endif
 */
public class SDKDEV_ATM_OVERLAY_GENERAL implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * 1:Network, 2:Comm, 3:Network&Comm
	 * \else
	 * ��λ, λ0:Net(����), λ1:Com(����), λ2:Com422(����422)
	 * \endif
	 */
	public int               dwDataSource;
	
	/**
	 * \if ENGLISH_LANG
	 * protocol name
	 * \else
	 * Э������,��󳤶�32(����һ��������).
	 * \endif
	 */
	public byte                szProtocol[][] = new byte[32][33];
}
