package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * RTSP Configuration Structure
 * \else
 * RTSP�����ýṹ��
 * \endif
 */
public class CFG_RTSP_INFO_OUT implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
 	/**
	 * \if ENGLISH_LANG
	 * Enable 
	 * \else
	 * ���������Ƿ�ʹ��
	 * \endif
	 */
	public boolean 			bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * RTSP Port 
	 * \else
	 * RTSP����˿�
	 * \endif
	 */
	public int				nPort;
	
 	/**
	 * \if ENGLISH_LANG
	 * Rtp Start Port 
	 * \else
	 * RTP��ʼ�˿�
	 * \endif
	 */
	public int				nRtpStartPort;
	
 	/**
	 * \if ENGLISH_LANG
	 * nRtp End Port 
	 * \else
	 * RTP�����˿�
	 * \endif
	 */
	public int				nRtpEndPort;
	
 	/**
	 * \if ENGLISH_LANG
	 * RtspOverHttp Enable 
	 * \else
	 * RtspOverHttpʹ��
	 * \endif
	 */
	public boolean			bHttpEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * RtspOverHttp Port 
	 * \else
	 * RtspOverHttp�˿�
	 * \endif
	 */
	public int				nHttpPort;
}
