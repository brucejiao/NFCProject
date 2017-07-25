package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * ability of record information
 * \else
 * ¼��������Ϣ
 * \endif
 */
public class CFG_CAP_RECORD_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * video does plan to support the holidat function
	 * \else
	 * ¼��ƻ��Ƿ�֧�ּ��չ���
	 * \endif
	 */
	public boolean  bSupportHoliday;
	
	/**
	 * \if ENGLISH_LANG
	 * whether to support setting extra stream video mode
	 * \else
	 * �Ƿ�֧�����ø�����¼��ģʽ
	 * \endif
	 */
	public boolean  bSupportExtraRecordMode;
	
	/**
	 * \if ENGLISH_LANG
	 * max record time
	 * \else
	 * ���Ԥ¼ʱ��
	 * \endif
	 */
	public int dwMaxPreRecordTime;
	
	/**
	 * \if ENGLISH_LANG
	 * total access code stream(kbps)
	 * \else
	 * ������������,��λkbps
	 * \endif
	 */
	public int dwMaxRemoteBitrate;
	
	/**
	 * \if ENGLISH_LANG
	 * maximum access to the bare code stream (include decause,resolution,frame rate,deep calculated on 16bpp)
	 * \else
	 * �����뵐����������·�����ֱ��ʡ�֡�ʣ�ɫ�16bpp���㣩
	 * \endif
	 */
	public int dwMaxRemoteRawBitrate;
	
	/**
	 * \if ENGLISH_LANG
	 * Maximum number of video stream 
	 * \else
	 * ���¼����������
	 * \endif
	 */
	public int dwMaxStreams;
}
