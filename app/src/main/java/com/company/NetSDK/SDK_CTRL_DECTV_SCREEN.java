package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Port serial number
 * \else
 * CtrlDecTVScreen �ӿڲ���
 * \endif
 */
public class SDK_CTRL_DECTV_SCREEN implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * �ָ�ģʽ
	 * \endif
	 */
	public int             nSplitType;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ��ʾͨ��,dwDisplayType=SDK_SPLIT_DISPLAY_TYPE_GENERALʱ��Ч,�����߷�����ڴ泤�Ȳ���С��nSplitType�Ĵ�С
	 * \endif
	 */
	public byte[]          pEncoderChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ����ͨ�����,dwDisplayType=SDK_SPLIT_DISPLAY_TYPE_PIPʱ��ʾ���л���ʾ��������Ч��
	 * \endif
	 */
	public byte            byGroupNo;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ��ʾ���ͣ������SDK_SPLIT_DISPLAY_TYPE��ע�͸�ģʽ����ʾ������"PicInPic"����, ��ģʽ����ʾ���ݰ�NVD���й����������DisChn�ֶξ����������ݣ�û����һ����ʱ��Ĭ��Ϊ��ͨ��ʾ����,��"General"��
	 * \endif
	 */
	public int             dwDisplayType;
}
