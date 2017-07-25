package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_WM_ATTACH_TOUR implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * tv wall ID
	 * \else
	 * ����ǽID
	 * \endif
	 */
    public int             nMonitorWallID;            
    
	/**
	 * \if ENGLISH_LANG
	 * tour status  call function
	 * \else
	 * ��Ѳ״̬�ص�����
	 * \endif
	 */
    public CB_fMonitorWallTourStatusCallBack cbStatus;    
}
