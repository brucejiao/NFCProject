package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video input channel failed(i.e. config video input channel's bit stram but it exceeds device processing capacity)SDK_ALARM_VIDEO_ININVALID
 * \else
 * ��Ƶ����ͨ��ʧЧ�¼�(�������õ���Ƶ����ͨ�������������豸��������)SDK_ALARM_VIDEO_ININVALID
 * \endif
 */
public class ALARM_VIDEO_ININVALID_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel no.,form 0
	 * \else
	 * ͨ���ţ���0��ʼ
	 * \endif
	 */
	public int                 nChannelID;
}
