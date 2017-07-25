package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * local preview split parameter, INetSDK.ControlDevice(SDK_DEVICE_LOCALPREVIEW_SLIPT)
 * \else
 * �����豸�˱���Ԥ���ָ����, INetSDK.ControlDevice(SDK_DEVICE_LOCALPREVIEW_SLIPT)
 * \endif
 */
public class DEVICE_LOCALPREVIEW_SLIPT_PARAMETER implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * split mode
	 * \else
	 * �ָ�ģʽ�����豸�˱���Ԥ��֧�ֵķָ�ģʽ
	 * \endif
	 */
	public int                 nSliptMode;
	
	/**
	 * \if ENGLISH_LANG
	 * split num, start with 1
	 * \else
	 * ��ǰҪԤ�����ӷָ�,��1��ʼ
	 * \endif
	 */
	public int                 nSubSliptNum;
}
