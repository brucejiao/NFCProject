package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Tour activation config
 * \else
 * ��Ѳ��������
 * \endif
 */
public class CFG_TOURLINK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Tour enable
	 * \else
	 * ��Ѳʹ��
	 * \endif
	 */
	public boolean				bEnable;

	/**
	 * \if ENGLISH_LANG
	 * Tour split mode
	 * \else
	 * ��Ѳʱ�ķָ�ģʽ, CFG_SPLITMODE
	 * \endif
	 */
	public int				    emSplitMode;

	/**
	 * \if ENGLISH_LANG
	 * Tour channel no.list
	 * \else
	 * ��Ѳͨ�����б�
	 * \endif
	 */
	public int[]			    nChannels = new int[FinalVar.MAX_VIDEO_CHANNEL_NUM];

	/**
	 * \if ENGLISH_LANG
	 * Tour channel quantity
	 * \else
	 * ��Ѳͨ������
	 * \endif
	 */
	public int			        nChannelCount;
}
