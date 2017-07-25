package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Route crossing information, INetSDK.ControlDevice(SDK_CTRL_ROUTE_CROSSING)
 * \else
 * ·�ߵ�λ��Ϣ, INetSDK.ControlDevice(SDK_CTRL_ROUTE_CROSSING)
 * \endif
 */
public class ROUTE_CROSSING_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * valid number is 1~DH_MAX_CROSSING_NUM
	 * \else
	 * ·����Ч������Χ1~DH_MAX_CROSSING_NUM
	 * \endif
	 */
	public byte 			    byCrossingNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Crossing range(m)
	 * \else
	 * ��λ���ȷ�Χ��λm
	 * \endif
	 */
	public int                	wCrossingRange; 
	
	/**
	 * \if ENGLISH_LANG
	 * Crossing information struct array
	 * \else
	 * ·����Ϣ���֧��128��·��
	 * \endif
	 */
	public CROSSING_INFO 	    stCrossingInfo[] 		= new CROSSING_INFO[FinalVar.SDK_MAX_CROSSING_NUM];
	
	public ROUTE_CROSSING_INFO() {
		for (int i = 0; i < FinalVar.SDK_MAX_CROSSING_NUM; i++) {
			stCrossingInfo[i] = new CROSSING_INFO();
		}
	}
}
