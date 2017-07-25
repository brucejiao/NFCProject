package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * PTZ property information
 * \else
 * ��̨������Ϣ
 * \endif
 */
public class PTZ_OPT_ATTR implements Serializable {	
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Operation mask high bit 
	 * \else
	 * �����������λ
	 * \endif
	 */
	public int				dwHighMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Operation mask low bit 
	 * \else
	 * �����������λ
	 * \endif
	 */
	public int				dwLowMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Operation protocol name 
	 * \else
	 * ������Э����
	 * \endif
	 */
	public byte				szName[] = new byte[FinalVar.NAME_MAX_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Channel address min value
	 * \else
	 * ͨ����ַ����Сֵ
	 * \endif
	 */
	public int				wCamAddrMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel address max value
	 * \else
	 * ͨ����ַ�����ֵ
	 * \endif
	 */
	public int				wCamAddrMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Monitor address min value
	 * \else
	 * ���ӵ�ַ����Сֵ
	 * \endif
	 */
	public int				wMonAddrMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Monitor address max value
	 * \else
	 * ���ӵ�ַ�����ֵ
	 * \endif
	 */
	public int				wMonAddrMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Preset min value
	 * \else
	 * Ԥ�õ����Сֵ
	 * \endif
	 */
	public byte				bPresetMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Preset max value
	 * \else
	 * Ԥ�õ�����ֵ
	 * \endif
	 */
	public byte				bPresetMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Auto tour min value
	 * \else
	 * �Զ�Ѳ����·����Сֵ
	 * \endif
	 */
	public byte				bTourMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Auto tour max value
	 * \else
	 * �Զ�Ѳ����·�����ֵ
	 * \endif
	 */
	public byte				bTourMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Pattern min value
	 * \else
	 * �켣��·����Сֵ
	 * \endif
	 */
	public byte				bPatternMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Pattern max value
	 * \else
	 * �켣��·�����ֵ
	 * \endif
	 */
	public byte				bPatternMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Tilt speed min value
	 * \else
	 * ��ֱ�ٶȵ���Сֵ
	 * \endif
	 */
	public byte				bTileSpeedMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Tilt speed max value
	 * \else
	 * ��ֱ�ٶȵ����ֵ
	 * \endif
	 */
	public byte				bTileSpeedMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Pan speed min value
	 * \else
	 * ˮƽ�ٶȵ���Сֵ
	 * \endif
	 */
	public byte				bPanSpeedMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Pan speed max value
	 * \else
	 * ˮƽ�ٶȵ����ֵ
	 * \endif
	 */
	public byte				bPanSpeedMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Aux function min value
	 * \else
	 * �������ܵ���Сֵ
	 * \endif
	 */
	public byte				bAuxMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Aux function max value
	 * \else
	 * �������ܵ����ֵ
	 * \endif
	 */
	public byte				bAuxMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Command interval
	 * \else
	 * ���������ʱ����
	 * \endif
	 */
	public int				nInternal;
	
	/**
	 * \if ENGLISH_LANG
	 * Protocol type
	 * \else
	 * Э�������
	 * \endif
	 */
	public byte				bType;
	
	/**
	 * \if ENGLISH_LANG
	 * Function mask :0x01 - support PTZ-inside function
	 * \else
	 * Э�鹦������,��λ��ʾ,�ã���ʾ֧��,��һλ��ʾ������̨���ܣ�������λ��ʱ����
	 * \endif
	 */
	public byte				bFuncMask;
}
