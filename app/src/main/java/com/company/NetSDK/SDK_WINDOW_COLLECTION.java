package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Infomation window areas
 * \else
 * ���鴰����Ϣ
 * \endif
 */
public class SDK_WINDOW_COLLECTION implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * window ID
	 * \else
	 * ����ID
	 * \endif
	 */
	public int					nWindowID;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * �����Ƿ���Ч
	 * \endif
	 */
	public boolean				bWndEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Rect, effect when free split mode
	 * \else
	 * ��������, ���ɷָ�ģʽ����Ч
	 * \endif
	 */
	public SDK_RECT				stuRect = new SDK_RECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Coordinate whether meet the conditions
	 * \else
	 * �����Ƿ�����ֱͨ����
	 * \endif
	 */
	public boolean				bDirectable;
	
	/**
	 * \if ENGLISH_LANG
	 * Z order
	 * \else
	 * ����Z����
	 * \endif
	 */
	public int					nZOrder;
	
	/**
	 * \if ENGLISH_LANG
	 * Source enable
	 * \else
	 * ��ʾԴ�Ƿ���Ч
	 * \endif
	 */
	public boolean				bSrcEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Device ID
	 * \else
	 * �豸ID
	 * \endif
	 */
	public byte				szDeviceID[] = new byte[FinalVar.SDK_DEV_ID_LEN_EX];
	
	/**
	 * \if ENGLISH_LANG
	 * Video channel
	 * \else
	 * ��Ƶͨ����
	 * \endif
	 */
	public int					nVideoChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Video stream type
	 * \else
	 * ��Ƶ��������
	 * \endif
	 */
	public int					nVideoStream;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio channel
	 * \else
	 * ��Ƶͨ��
	 * \endif
	 */
	public int					nAudioChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio stream type
	 * \else
	 * ��Ƶ��������
	 * \endif
	 */
	public int					nAudioStream;
	
	/**
	 * \if ENGLISH_LANG
	 * Unique channel
	 * \else
	 * �豸��ͳһ��ŵ�Ψһͨ����
	 * \endif
	 */
	public int					nUniqueChannel;
}
