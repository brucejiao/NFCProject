package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Snapshot Mode Types 
 * \else
 * ץ��ģʽ
 * \endif
 */
public class CFG_TRAFFIC_SNAP_MODE implements Serializable {
	
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Snapshot Mode Types 
	 * \else
	 * �Զ�ץ��
	 * \endif
	 */
	public static final int TRAFFIC_SNAP_MODE_AUTO = 0;
	
 	/**
	 * \if ENGLISH_LANG
	 * Coil Snapshot
	 * \else
	 * ��Ȧץ��
	 * \endif
	 */
	public static final int TRAFFIC_SNAP_MODE_COIL = 1;
	
 	/**
	 * \if ENGLISH_LANG
	 * Coil Snapshot, Picture Analysis
	 * \else
	 * ��Ȧץ��, ͼƬ����
	 * \endif
	 */
	public static final int TRAFFIC_SNAP_MODE_COIL_PICANALYSIS = 2;
	
 	/**
	 * \if ENGLISH_LANG
	 * Stream Snapshot
	 * \else
	 * ��Ƶץ��
	 * \endif
	 */
	public static final int TRAFFIC_SNAP_MODE_STREAM = 3;
	
 	/**
	 * \if ENGLISH_LANG
	 * Stream Snapshot, Identicifcation
	 * \else
	 * ��Ƶץ��, ����ʶ��
	 * \endif
	 */
	public static final int TRAFFIC_SNAP_MODE_STREAM_IDENTIFY = 4;
	
 	/**
	 * \if ENGLISH_LANG
	 * Mix, Identicifcation
	 * \else
	 * ���ץ��, ����ʶ��
	 * \endif
	 */
	public static final int TRAFFIC_SNAP_MODE_MIX_IDENTIFY = 5;
}