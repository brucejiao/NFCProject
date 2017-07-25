package com.company.NetSDK;

import java.io.Serializable;

public class emCFG_SCENE_MODE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final int emCFG_SCENE_MODE_UNKNOWN = 0;		// δ֪ģʽ
	public static final int emCFG_SCENE_MODE_OUTDOOR = 1;			// ���ģʽ
	public static final int emCFG_SCENE_MODE_INDOOR = 2;			// �ڼ�ģʽ
	public static final int emCFG_SCENE_MODE_WHOLE = 3;            // ȫ��ģʽ
	public static final int emCFG_SCENE_MODE_RIGHTNOW = 4;          // ����ģʽ
	public static final int emCFG_SCENE_MODE_AUTO = 5;              // �Զ�ģʽ
	public static final int emCFG_SCENE_MODE_FORCE = 6;             // ǿ��ģʽ
	public static final int emCFG_SCENE_MODE_SLEEPING = 7; 			// ����ģʽ
	public static final int emCFG_SCENE_MODE_CUSTOM = 8;			// �Զ���ģʽ
}
