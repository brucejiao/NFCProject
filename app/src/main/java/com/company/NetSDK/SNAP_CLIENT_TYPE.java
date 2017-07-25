package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Capture client type
 * \else
 * ץ�Ŀͻ�������
 * \endif
 */
public class SNAP_CLIENT_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Corresponding to "Common" type, the default type
	 * \else
	 * ��Ӧ"Common"����, Ĭ������
	 * \endif
	 */
	public static final int SNAP_CLIENT_TYPE_COMMON = 0; 
	
	/**
	 * \if ENGLISH_LANG
	 * Correspondence "ParkingSpace" type, parking
	 * \else
	 * ��Ӧ"ParkingSpace"����, ͣ����
	 * \endif
	 */
	public static final int SNAP_CLIENT_TYPE_PARKINGSPACE = 1; 
}
