package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_SNAP_BY_EVENT implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * nChannel
	 * \else
	 * ��Ƶͨ����, ��0��ʼ
	 * \endif
	 */
	public int nChannel;
		
	/**
	 * \if ENGLISH_LANG
	 * dwEventID
	 * \else
	 * �ο�RealLoadPicEx���¼�����
	 * \endif
	 */
	public int dwEventID;
}
