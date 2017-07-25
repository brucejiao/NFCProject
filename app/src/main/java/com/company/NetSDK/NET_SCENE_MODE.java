package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Scene Mode
 * \else
 * �龰ģʽ
 * \endif
 */
public class NET_SCENE_MODE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown Scene
	 * \else
	 * δ֪����
	 * \endif
	 */
	public static final int NET_SCENE_MODE_UNKNOWN = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Out Mode
	 * \else
	 * ���ģʽ
	 * \endif
	 */
	public static final int NET_SCENE_MODE_OUTDOOR = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * In Mode
	 * \else
	 * ����ģʽ
	 * \endif
	 */
	public static final int NET_SCENE_MODE_INDOOR = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * global mode
	 * \else
	 * ȫ��ģʽ
	 * \endif
	 */
	public static final int NET_SCENE_MODE_WHOLE = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * immediate mode
	 * \else
	 * ����ģʽ
	 * \endif
	 */
	public static final int NET_SCENE_MODE_RIGHTNOW = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * sleeping mode
	 * \else
	 * ����ģʽ
	 * \endif
	 */
	public static final int NET_SCENE_MODE_SLEEPING = 5;
	
	/**
	 * \if ENGLISH_LANG
	 * custom mode
	 * \else
	 * �Զ���ģʽ
	 * \endif
	 */
	public static final int NET_SCENE_MODE_CUSTOM = 6;
}
