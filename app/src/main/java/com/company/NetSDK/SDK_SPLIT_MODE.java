package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Split mode
 * \else
 * �ָ�ģʽ
 * \endif
 */
public class SDK_SPLIT_MODE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 1-window
	 * \else
	 * 1����
	 * \endif
	 */
	public static final int     SDK_SPLIT_1 = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * 2-window
	 * \else
	 * 2����
	 * \endif
	 */
	public static final int     SDK_SPLIT_2 = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * 4-window
	 * \else
	 * 4����
	 * \endif
	 */
	public static final int     SDK_SPLIT_4 = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * 6-window
	 * \else
	 * 6����
	 * \endif
	 */
	public static final int     SDK_SPLIT_6 = 6;
	
	/**
	 * \if ENGLISH_LANG
	 * 8-window
	 * \else
	 * 8����
	 * \endif
	 */
	public static final int     SDK_SPLIT_8 = 8;
	
	/**
	 * \if ENGLISH_LANG
	 * 9-window
	 * \else
	 * 9����
	 * \endif
	 */
	public static final int     SDK_SPLIT_9 = 9;
	
	/**
	 * \if ENGLISH_LANG
	 * 12-window
	 * \else
	 * 12����
	 * \endif
	 */
	public static final int     SDK_SPLIT_12 = 12;
	
	/**
	 * \if ENGLISH_LANG
	 * 16-window
	 * \else
	 * 16����
	 * \endif
	 */
	public static final int     SDK_SPLIT_16 = 16;
	
	/**
	 * \if ENGLISH_LANG
	 * 20-window
	 * \else
	 * 20����
	 * \endif
	 */
	public static final int     SDK_SPLIT_20 = 20;
	
	/**
	 * \if ENGLISH_LANG
	 * 25-window
	 * \else
	 * 25����
	 * \endif
	 */
	public static final int     SDK_SPLIT_25 = 25;
	
	/**
	 * \if ENGLISH_LANG
	 * 36-window
	 * \else
	 * 36����
	 * \endif
	 */
	public static final int     SDK_SPLIT_36 = 36;
	
	/**
	 * \if ENGLISH_LANG
	 * 64-window
	 * \else
	 * 64����
	 * \endif
	 */
	public static final int     SDK_SPLIT_64 = 64;
	
	/**
	 * \if ENGLISH_LANG
	 * 144-window
	 * \else
	 * 144����
	 * \endif
	 */
	public static final int     SDK_SPLIT_144 = 144;
	
	/**
	 * \if ENGLISH_LANG
	 * PIP mode.1-full screen+1-small window
	 * \else
	 * ���л�ģʽ, 1��ȫ������+1��С���洰��
	 * \endif
	 */
	public static final int     SDK_PIP_1 = FinalVar.SDK_SPLIT_PIP_BASE + 1;
	
	/**
	 * \if ENGLISH_LANG
	 * PIP mode.1-full screen+3-small window
	 * \else
	 * ���л�ģʽ, 1��ȫ������+3��С���洰��
	 * \endif
	 */
	public static final int     SDK_PIP_3 = FinalVar.SDK_SPLIT_PIP_BASE + 3;
	
	/**
	 * \if ENGLISH_LANG
	 * Free open window mode,are free to create,close, window position related to the z axis
	 * \else
	 * ���ɿ���ģʽ���������ɴ������رմ��ڣ��������ô���λ�ú�Z�����
	 * \endif
	 */
	public static final int     SDK_SPLIT_FREE = FinalVar.SDK_SPLIT_PIP_BASE * 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Integration of a split screen
	 * \else
	 * �ں�����Ա1�ָ�
	 * \endif
	 */
	public static final int     SDK_COMPOSITE_SPLIT_1 = FinalVar.SDK_SPLIT_PIP_BASE * 3 + 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Fusion of four split screen
	 * \else
	 * �ں�����Ա4�ָ�
	 * \endif
	 */
	public static final int     SDK_COMPOSITE_SPLIT_4 = FinalVar.SDK_SPLIT_PIP_BASE * 3 + 4;
}
