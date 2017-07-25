package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Split mode
 * \else
 * �ָ�ģʽ
 * \endif
 */
public class CFG_SPLITMODE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * \if ENGLISH_LANG
	 * 1 split
	 * \else
	 * 1����
	 * \endif
	 */
	public static final int SPLITMODE_1 = 1;						

	/**
	 * \if ENGLISH_LANG
	 * 2 split
	 * \else
	 * 2����
	 * \endif
	 */
	public static final int SPLITMODE_2 = 2;						

	/**
	 * \if ENGLISH_LANG
	 * 4 split
	 * \else
	 * 4����
	 * \endif
	 */
	public static final int SPLITMODE_4 = 4;						

	/**
	 * \if ENGLISH_LANG
	 * 6 split
	 * \else
	 * 6����
	 * \endif
	 */
	public static final int SPLITMODE_6 = 6;						

	/**
	 * \if ENGLISH_LANG
	 * 8 split
	 * \else
	 * 8����
	 * \endif
	 */
	public static final int SPLITMODE_8 = 8;						

	/**
	 * \if ENGLISH_LANG
	 * 9 split
	 * \else
	 * 9����
	 * \endif
	 */
	public static final int SPLITMODE_9 = 9;						

	/**
	 * \if ENGLISH_LANG
	 * 12 split
	 * \else
	 * 12����
	 * \endif
	 */
	public static final int SPLITMODE_12 = 12;				    	

	/**
	 * \if ENGLISH_LANG
	 * 16 split
	 * \else
	 * 16����
	 * \endif
	 */
	public static final int SPLITMODE_16 = 16;				    	

	/**
	 * \if ENGLISH_LANG
	 * 20 split
	 * \else
	 * 20����
	 * \endif
	 */
	public static final int SPLITMODE_20 = 20;				    	

	/**
	 * \if ENGLISH_LANG
	 * 25 split
	 * \else
	 * 25����
	 * \endif
	 */
	public static final int SPLITMODE_25 = 25;					    

	/**
	 * \if ENGLISH_LANG
	 * 36 split
	 * \else
	 * 36����
	 * \endif
	 */
	public static final int SPLITMODE_36 = 36;					    

	/**
	 * \if ENGLISH_LANG
	 * 64 split
	 * \else
	 * 64����
	 * \endif
	 */
	public static final int SPLITMODE_64 = 64;					    

	/**
	 * \if ENGLISH_LANG
	 * 144 split
	 * \else
	 * 144����
	 * \endif
	 */
	public static final int SPLITMODE_144 = 144;					

	/**
	 * \if ENGLISH_LANG
	 * PIP split mode basic value
	 * \else
	 * ���л��ָ�ģʽ����ֵ
	 * \endif
	 */
	public static final int SPLITMODE_PIP = 1000;                   

	/**
	 * \if ENGLISH_LANG
	 * PIP mode, 1 full screen+1 small window
	 * \else
	 * ���л�ģʽ, 1��ȫ������+1��С���洰��
	 * \endif
	 */
	public static final int SPLITMODE_PIP1 = SPLITMODE_PIP + 1;		

	/**
	 * \if ENGLISH_LANG
	 * PIP mode, 1 full screen+3 small windows
	 * \else
	 * ���л�ģʽ, 1��ȫ������+3��С���洰��
	 * \endif
	 */
	public static final int SPLITMODE_PIP3 = SPLITMODE_PIP + 3;		

	/**
	 * \if ENGLISH_LANG
	 * Free mode��may create, close window, Freely set window location and Z-axis sequency
	 * \else
	 * ���ɿ���ģʽ���������ɴ������رմ��ڣ��������ô���λ�ú�Z�����
	 * \endif
	 */
	public static final int SPLITMODE_FREE = SPLITMODE_PIP * 2;	

	/**
	 * \if ENGLISH_LANG
	 * Cubeless video wall 1 split
	 * \else
	 * �ں�����Ա1�ָ�
	 * \endif
	 */
	public static final int SPLITMODE_COMPOSITE_1 = SPLITMODE_PIP * 3 + 1;	

	/**
	 * \if ENGLISH_LANG
	 * Cubeless video wall 4 split
	 * \else
	 * �ں�����Ա4�ָ�
	 * \endif
	 */
	public static final int SPLITMODE_COMPOSITE_4 = SPLITMODE_PIP * 3 + 4;	

	/**
	 * \if ENGLISH_LANG
	 * End mark
	 * \else
	 * ������ʶ
	 * \endif
	 */
	public static final int SPLITMODE_EOF = SPLITMODE_COMPOSITE_4 + 1;                          
}
