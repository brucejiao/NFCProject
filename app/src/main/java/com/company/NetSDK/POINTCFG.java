package com.company.NetSDK;

import java.io.Serializable;

public class POINTCFG implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * ip
	 * \else
	 * ip
	 * \endif
	 */
	public byte             szIP[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN]; 
	
	/**
	 * \if ENGLISH_LANG
	 * Port
	 * \else
	 * �˿�    
	 * \endif
	 */
	public int              nPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Preset enable
	 * \else
	 * Ԥ�Ƶ�ʹ��
	 * \endif
	 */
	public POINTEANBLE      stuPointEnable[] = new POINTEANBLE[80];
	
	public POINTCFG() {
		for (int i = 0; i < 80; i++) {
			stuPointEnable[i] = new POINTEANBLE();
		}
	}
}
