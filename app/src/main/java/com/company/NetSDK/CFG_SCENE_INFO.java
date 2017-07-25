package com.company.NetSDK;

import java.io.Serializable;

public class CFG_SCENE_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * emCFG_SCENE_MODE
	 * \else
	 * emCFG_SCENE_MODE
	 * \endif
	 */
	public int               emName;							// ģʽ��
	public int				 nAlarmInChannelsCount;				// ����ͨ������
	public int				 nRetAlarmInChannelsCount;			// ʵ�ʷ��صı���ͨ������
	public int   			 pnAlarmInChannels[];					// ���õı�������ͨ�����б����û������ڴ�
	
	public CFG_SCENE_INFO(int alarmInChnNum) {
		nAlarmInChannelsCount = alarmInChnNum;
		pnAlarmInChannels = new int[alarmInChnNum];
	}
}
