package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video Overlay
 * \else
 * ��Ƶ����
 * \endif
 */
public class SDK_DVR_VIDEOITEM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * OSD Position and Color
	 * \else
	 * OSD���ӵ�λ�úͱ���ɫ
	 * \endif
	 */
	public SDK_DVR_VIDEO_WIDGET     StOSD_POS = new SDK_DVR_VIDEO_WIDGET();
	
	/**
	 * \if ENGLISH_LANG
	 * OSD Name
	 * \else
	 * OSD���ӵ�����
	 * \endif
	 */
	public byte                    SzOSD_Name[] = new byte[FinalVar.SDK_VIDEO_OSD_NAME_NUM];
}
