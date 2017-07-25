package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * SetSplitSourceEx  Port input parameter
 * \else
 * SetSplitSourceEx �ӿڵ��������
 * \endif
 */
public class NET_IN_SET_SPLIT_SOURCE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Video output control {@link EM_VIDEO_OUT_CTRL_TYPE EM_VIDEO_OUT_CTRL_TYPE}
	 * \else
	 * ��Ƶ������Ʒ�ʽ {@link EM_VIDEO_OUT_CTRL_TYPE EM_VIDEO_OUT_CTRL_TYPE}
	 * \endif
	 */
	public int 					emCtrlType;
	
	/**
	 * \if ENGLISH_LANG
	 * Video output logic channel no., emCtrlType as EM_VIDEO_OUT_CTRL_CHANNEL is valid
	 * \else
	 * ��Ƶ����߼�ͨ����, emCtrlTypeΪEM_VIDEO_OUT_CTRL_CHANNELʱ��Ч
	 * \endif
	 */
	public int						nChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Splicing screen ID, emCtrlType as EM_VIDEO_OUT_CTRL_COMPOSITE_ID is valid
	 * \else
	 * ƴ����ID, emCtrlTypeΪEM_VIDEO_OUT_CTRL_COMPOSITE_IDʱ��Ч
	 * \endif
	 */
	public String					pszCompositeID;
	
	/**
	 * \if ENGLISH_LANG
	 * Window no., -1 means current split mode all windows
	 * \else
	 * ���ں�, -1��ʾ��ǰ�ָ�ģʽ�µ����д���
	 * \endif
	 */
	public int						nWindow;
	
	/**
	 * \if ENGLISH_LANG
	 * Video source info, When nWindow=-1, video source is a group, and quantity match window
	 * \else
	 * ��ƵԴ��Ϣ, ��nWindow=-1ʱ, ��ƵԴ�Ǹ�����, �������봰����һ��
	 * \endif
	 */
	public SDK_SPLIT_SOURCE			pstuSources[];
	
	/**
	 * \if ENGLISH_LANG
	 * Video source quantity
	 * \else
	 * ��ƵԴ����
	 * \endif
	 */
	public int						nSourceCount;	 
	
	public NET_IN_SET_SPLIT_SOURCE(int nSourceCount) {
		this.nSourceCount = nSourceCount;
		pstuSources = new SDK_SPLIT_SOURCE[nSourceCount];
		for (int i = 0; i < nSourceCount; i++) {
			pstuSources[i] = new SDK_SPLIT_SOURCE();
		}
	}
}
