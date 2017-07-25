package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * channel info of video input
 * \else
 * ��Ƶ����ͨ����Ϣ
 * \endif
 */
public class SDK_VIDEO_INPUTS implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * channel name
	 * \else
	 * ͨ������
	 * \endif
	 */
	public byte                szChnName[] = new byte[FinalVar.SDK_DEVICE_NAME_LEN];

	/**
	 * \if ENGLISH_LANG
	 * enable
	 * \else
	 * ʹ��
	 * \endif
	 */
	public boolean                bEnable;

	/**
	 * \if ENGLISH_LANG
	 * control ID
	 * \else
	 * ����ID
	 * \endif
	 */
	public byte                szControlID[] = new byte[FinalVar.SDK_DEV_ID_LEN_EX];

	/**
	 * \if ENGLISH_LANG
	 * main stream url
	 * \else
	 * ������url��ַ
	 * \endif
	 */
	public byte                szMainStreamUrl[] = new byte[FinalVar.MAX_PATH];

	/**
	 * \if ENGLISH_LANG
	 * extra stream url
	 * \else
	 * ������url��ַ
	 * \endif
	 */
	public byte                szExtraStreamUrl[] = new byte[FinalVar.MAX_PATH];

	/**
	 * \if ENGLISH_LANG
	 * spare main stream address quantity
	 * \else
	 * ������������ַ����
	 * \endif
	 */
	public int                 nOptionalMainUrlCount;
	
	/**
	 * \if ENGLISH_LANG
	 * spare main stream address list
	 * \else
	 * ������������ַ�б�
	 * \endif
	 */
    public byte                szOptionalMainUrls[][] = new byte[FinalVar.SDK_MAX_OPTIONAL_URL_NUM][FinalVar.MAX_PATH];
    
    /**
	 * \if ENGLISH_LANG
	 * spare sub stream address quantity
	 * \else
	 * ���ø�������ַ����
	 * \endif
	 */
    public int                 nOptionalExtraUrlCount;
    
    /**
	 * \if ENGLISH_LANG
	 * spare substream address list
	 * \else
	 * ���ø�������ַ�б�
	 * \endif
	 */
    public byte                szOptionalExtraUrls[][] = new byte[FinalVar.SDK_MAX_OPTIONAL_URL_NUM][FinalVar.MAX_PATH];
}
