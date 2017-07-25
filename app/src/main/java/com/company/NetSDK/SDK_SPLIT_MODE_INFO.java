package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Split mode info
 * \else
 * һ��Ļ�ķָ�ģʽ��Ϣ
 * \endif
 */
public class SDK_SPLIT_MODE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Split mode��value corresponding to SDK_SPLIT_MODE
	 * \else
	 * �ָ�ģʽ, ֵ��Ӧ��SDK_SPLIT_MODE
	 * \endif
	 */
	public int         		emSplitMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Group SN
	 * \else
	 * �������
	 * \endif
	 */
	public int					nGroupID;
	
	/**
	 * \if ENGLISH_LANG
	 * Display type, look for SDK_SPLIT_DISPLAY_TYPE
	 * \else
	 * ��ʾ���ͣ������SDK_SPLIT_DISPLAY_TYPE��ע�͸�ģʽ����ʾ������"PicInPic"����, ��ģʽ����ʾ���ݰ�NVD���й����������DisChn�ֶξ����������ݣ�û����һ����ʱ��Ĭ��Ϊ��ͨ��ʾ����,��"General"��
	 * \endif
	 */
	public int	                dwDisplayType;
}
