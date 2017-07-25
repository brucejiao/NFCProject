package com.company.NetSDK;

import java.io.Serializable;

public class CFG_COMMGLOBAL_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public boolean				bEnable;								// TRUE: ����; FALSE: ����; ��������̨�豸��������ͨ��
	public boolean				bSceneEnable;							// �Ƿ������龰ģʽ
	
	/**
	 * \if ENGLISH_LANG
	 * emCFG_SCENE_MODE
	 * \else
	 * emCFG_SCENE_MODE
	 * \endif
	 */
	public int              	emCurrentScene;							// ��ǰѡ����龰ģʽ
	public int					nSceneCount;							// �龰ģʽ��Ч����
	public CFG_SCENE_INFO		stuScense[] = new CFG_SCENE_INFO[FinalVar.MAX_SCENE_COUNT];			// �龰ģʽ���壬ÿ��ģʽ��Ӧһ������
	
	public CFG_COMMGLOBAL_INFO(int alarmInChnNum) {
		for (int i = 0; i < FinalVar.MAX_SCENE_COUNT; i++) {
			stuScense[i] = new CFG_SCENE_INFO(alarmInChnNum);
		}
	}
}
