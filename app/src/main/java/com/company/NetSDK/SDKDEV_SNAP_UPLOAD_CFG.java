package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * snap upload DH_DEV_SNAP_UPLOAD_CFG configuration
 * \else
 * ͼƬ�ϴ�������Ϣ DH_DEV_SNAP_UPLOAD_CFG ���ýṹ
 * \endif
 */
public class SDKDEV_SNAP_UPLOAD_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * the interval time of upload picture(s)
	 * \else
	 * ��ʱץͼͼƬ�ϴ��������λ��
	 * \endif
	 */
	public int                 nUploadInterval;
}
