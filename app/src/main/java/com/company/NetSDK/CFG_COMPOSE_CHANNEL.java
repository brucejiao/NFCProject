package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Synthetic channel configuration
 * \else
 *  �ϳ�ͨ������
 * \endif
 */
public class CFG_COMPOSE_CHANNEL implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * \if ENGLISH_LANG
	 * Segmentation mode�� corresponding to CFG_SPLITMODE
	 * \else
	 * �ָ�ģʽ, ��Ӧ��CFG_SPLITMODE
	 * \endif
	 */
	public int	emSplitMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Each child window display content  in segmentation mode 
	 * \else
	 * ��ģʽ�µĸ��Ӵ�����ʾ����
	 * \endif
	 */
	public int szChannelCombination[] = new int[FinalVar.MAX_VIDEO_CHANNEL_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Split Window Number
	 * \else
	 * �ָ������
	 * \endif
	 */
	public int				nChannelCount;
	
}
