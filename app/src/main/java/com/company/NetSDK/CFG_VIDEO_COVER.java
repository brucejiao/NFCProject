package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video Cover
 * \else
 * �������ڵ�����
 * \endif
 */
public class CFG_VIDEO_COVER implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Total Blocks
	 * \else
	 * ֧�ֵ��ڵ�����
	 * \endif
	 */
	public int                  nTotalBlocks;						

	/**
	 * \if ENGLISH_LANG
	 * Current Blocks 
	 * \else
	 * �����õĿ���
	 * \endif
	 */
	public int					nCurBlocks;							

	/**
	 * \if ENGLISH_LANG
	 * Cover Block 
	 * \else
	 * ���ǵ�����
	 * \endif
	 */
	public CFG_COVER_INFO		stuCoverBlock[] = new CFG_COVER_INFO[FinalVar.MAX_VIDEO_COVER_NUM];	
	
	public CFG_VIDEO_COVER() {
		for (int i = 0; i < FinalVar.MAX_VIDEO_COVER_NUM; i++) {
			stuCoverBlock[i] = new CFG_COVER_INFO();
		}
	}
}
