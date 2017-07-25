package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video wall
 * \else
 * ����ǽ
 * \endif
 */
public class AV_CFG_MonitorWall implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * name
	 * \else
	 * ����
	 * \endif
	 */
	public byte[]		szName = new byte[FinalVar.AV_CFG_Monitor_Name_Len];
	
	/**
	 * \if ENGLISH_LANG
	 * Network row amount 
	 * \else
	 * ��������
	 * \endif
	 */
	public int			nLine; 
	
	/**
	 * \if ENGLISH_LANG
	 * Network column amount 
	 * \else
	 * ��������
	 * \endif
	 */
	public int			nColumn;
	
	/**
	 * \if ENGLISH_LANG
	 * Zone amount
	 * \else
	 * ��������
	 * \endif
	 */
	public int			nBlockCount; 
	
	/**
	 * \if ENGLISH_LANG
	 * Zone array
	 * \else
	 * ��������
	 * \endif
	 */
	public AV_CFG_MonitorWallBlock[] stuBlocks = new AV_CFG_MonitorWallBlock[FinalVar.AV_CFG_Max_Block_In_Wall];
    
	/**
	 * \if ENGLISH_LANG
	 * Disable or not, false-this TV wall is valid, true-The TV wall is invalid
	 * \else
	 * �Ƿ����, 0-�õ���ǽ��Ч, 1-�õ���ǽ��Ч
	 * \endif
	 */
	public boolean                bDisable;                           
    
	/**
	 * \if ENGLISH_LANG
	 * TV wall description infomation
	 * \else
	 * ����ǽ������Ϣ
	 * \endif
	 */
	public byte[]                szDesc = new byte[FinalVar.CFG_COMMON_STRING_256];     
	
	public AV_CFG_MonitorWall() {
		for (int i = 0; i < FinalVar.AV_CFG_Max_Block_In_Wall; ++i) {
			stuBlocks[i] =  new AV_CFG_MonitorWallBlock();
		}
	}
}
