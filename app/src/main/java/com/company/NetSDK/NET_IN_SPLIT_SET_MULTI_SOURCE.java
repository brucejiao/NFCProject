package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_SPLIT_SET_MULTI_SOURCE implements Serializable {

	/**
	 * SplitSetMultiSource input param
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Video output control method�� value corresponding to EM_VIDEO_OUT_CTRL_TYPE
	 * \else
	 *  ��Ƶ������Ʒ�ʽ, ֵ��Ӧ��EM_VIDEO_OUT_CTRL_TYPE
	 * \endif
	 */
	public 	int  emCtrlType;
	
	/**
	 * \if ENGLISH_LANG
	 * Video output logical channel number,Effective When emCtrlType is EM_VIDEO_OUT_CTRL_CHANNEL
	 * \else
	 *  ��Ƶ����߼�ͨ����, emCtrlTypeΪEM_VIDEO_OUT_CTRL_CHANNELʱ��Ч
	 * \endif
	 */
	public int nChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Splicing screen ID,When emCtrlType is EM_VIDEO_OUT_CTRL_COMPOSITE_ID
	 * \else
	 *  ƴ����ID, emCtrlTypeΪEM_VIDEO_OUT_CTRL_COMPOSITE_IDʱ��Ч��Ч
	 * \endif
	 */
	public String szCompositeID;
	
	/**
	 * \if ENGLISH_LANG
	 * Whether to change segmentation model 
	 * \else
	 *  �Ƿ�ı�ָ�ģʽ
	 * \endif
	 */
	public boolean bSplitModeEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Segmentation model,Enable when bSplitModeEnable=TRUE��  value corresponding to SDK_SPLIT_MODE
	 * \else
	 *  �ָ�ģʽ, bSplitModeEnable=TRUEʱ��Ч,ֵ��ӦSDK_SPLIT_MODE
	 * \endif
	 */
	public int 	emSplitMode;
	
	/**
	 * \if ENGLISH_LANG
	 *  Segmentation group number,Effective when bSplitModeEnable=TRUE
	 * \else
	 *  �ָ�����, bSplitModeEnable=TRUEʱ��Ч
	 * \endif
	 */
	public int   nGroupID;
	
	
	/**
	 * \if ENGLISH_LANG
	 *  Window Number Array
	 * \else
	 *  ���ں�����
	 * \endif
	 */
	public int szWindows[];
	
	/**
	 * \if ENGLISH_LANG
	 *  Window Number
	 * \else
	 *  ��������
	 * \endif
	 */
	public int nWindowCount;
	
	/**
	 * \if ENGLISH_LANG
	 *  Video source information, corresponding to each window, the number with the number of window 
	 * \else
	 *  ��ƵԴ��Ϣ, �ֱ��Ӧÿ������, ����ͬ������
	 * \endif
	 */
	public SDK_SPLIT_SOURCE szStuSources[];
	
	
	public NET_IN_SPLIT_SET_MULTI_SOURCE(int nWindowCount)
	{
		this.nWindowCount = nWindowCount;
		
		if(nWindowCount > 0)
		{
			szWindows = new int[nWindowCount];
			szStuSources = new SDK_SPLIT_SOURCE[nWindowCount];
			for(int i = 0; i < nWindowCount; i++)
			{
				szStuSources[i] = new SDK_SPLIT_SOURCE();
			}
			
		}
		
	}
}

