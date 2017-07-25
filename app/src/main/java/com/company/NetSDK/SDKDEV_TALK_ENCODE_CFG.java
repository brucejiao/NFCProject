package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * audio talk configuration
 * \else
 * �����Խ���������
 * \endif
 */
public class SDKDEV_TALK_ENCODE_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Compression type,value,refer to DH_TALK_CODING_TYPE,please set the compression type according to the mode the device supports
	 * \else
	 * ѹ����ʽ��ö��ֵ�����DH_TALK_CODING_TYPE��������豸֧�ֵ������Խ���������ѹ����ʽ��
	 * \endif
	 */
	public int                 nCompression;

	/**
	 * \if ENGLISH_LANG
	 * Encode mode, value, 0 means not support the compression tyep
	 * Set the responding type according to compression type
	 * like AMR, please refer to EM_ARM_ENCODE_MODE
	 * \else
	 * ����ģʽ��ö��ֵ��Ϊ0ʱ��ʾ��ѹ����ʽ��֧�ֱ���ģʽ��
	 * ����ѹ����ʽ�������ö�Ӧ�ı����ʽ����
	 * AMR���EM_ARM_ENCODE_MODE
	 * \endif
	 */
	public int                 nMode;
}
