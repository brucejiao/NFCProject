package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The corresponding parameter when setting log in
 * \else
 * ���õ���ʱ����ز���
 * \endif
 */
public class NET_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Waiting time(unit is ms), 0:default 5000ms.
	 * \else
	 * �ȴ���ʱʱ��(����Ϊ��λ)��Ϊ0Ĭ��5000ms
	 * \endif
	 */
	public int					nWaittime;
	
	/**
	 * \if ENGLISH_LANG
	 * Connection timeout value(Unit is ms), 0:default 1500ms.
	 * \else
	 * ���ӳ�ʱʱ��(����Ϊ��λ)��Ϊ0Ĭ��1500ms
	 * \endif
	 */
	public int					nConnectTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Connection trial times(Unit is ms), 0:default 1.
	 * \else
	 * ���ӳ��Դ�����Ϊ0Ĭ��1��
	 * \endif
	 */
	public int					nConnectTryNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Sub-connection waiting time(Unit is ms), 0:default 10ms.
	 * \else
	 * ������֮��ĵȴ�ʱ��(����Ϊ��λ)��Ϊ0Ĭ��10ms
	 * \endif
	 */
	public int					nSubConnectSpaceTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Access to device information timeout, 0:default 1000ms.
	 * \else
	 * ��ȡ�豸��Ϣ��ʱʱ�䣬Ϊ0Ĭ��1000ms
	 * \endif
	 */
	public int					nGetDevInfoTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Each connected to receive data buffer size(Bytes), 0:default 250*1024
	 * \else
	 * ÿ�����ӽ������ݻ����С(�ֽ�Ϊ��λ)��Ϊ0Ĭ��250*1024
	 * \endif
	 */
	public int					nConnectBufSize;
	
	/**
	 * \if ENGLISH_LANG
	 * Access to sub-connect information timeout(Unit is ms), 0:default 1000ms.
	 * \else
	 * ��ȡ��������Ϣ��ʱʱ��(����Ϊ��λ)��Ϊ0Ĭ��1000ms
	 * \endif
	 */
	public int					nGetConnInfoTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Timeout value of search video (unit ms), default 3000ms
	 * \else
	 * ��ʱ���ѯ¼���ļ��ĳ�ʱʱ��(����Ϊ��λ),Ϊ0Ĭ��Ϊ3000ms
	 * \endif
	 */
	public int                  nSearchRecordTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Dislink disconnect time,0:default 60000ms
	 * \else
	 * ��������Ӷ��ߵȴ�ʱ��(����Ϊ��λ)��Ϊ0Ĭ��Ϊ60000ms
	 * \endif
	 */
	public int                  nsubDisconnetTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Net type, 0-LAN, 1-WAN
	 * \else
	 * ��������, 0-LAN, 1-WAN
	 * \endif
	 */
	public byte					byNetType;
	
	/**
	 * \if ENGLISH_LANG
	 * Playback data from the receive buffer size(m),when value = 0,default 4M
	 * \else
	 * �ط����ݽ��ջ����С��MΪ��λ����Ϊ0Ĭ��Ϊ4M
	 * \endif
	 */
	public byte                 byPlaybackBufSize;
	        
	/**
	 * \if ENGLISH_LANG
	 * actual pictures of the receive buffer size(byte)when value = 0,default 2*1024*1024
	 * \else
	 * ʵʱͼƬ���ջ����С���ֽ�Ϊ��λ����Ϊ0Ĭ��Ϊ2*1024*1024
	 * \endif
	 */
	public int                  nPicBufSize;             		 
}
