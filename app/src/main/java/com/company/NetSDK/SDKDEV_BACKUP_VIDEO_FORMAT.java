package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video backup config parameter
 * \else
 * ��Ƶ��������
 * \endif
 */
public class SDKDEV_BACKUP_VIDEO_FORMAT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * file type to backup, 0:dav, 1:asf
	 * \else
	 * �����ļ�����, 0:dav, 1:asf
	 * \endif
	 */
	public byte    backupVideoFormat;

	/**
	 * \if ENGLISH_LANG
	 * password
	 * \else
	 * ��������
	 * \endif
	 */
	public byte    password[] = new byte[6];
}
