package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * PTZ Positioning Info Alarm
 * \else
 * ��̨��λ��Ϣ����
 * \endif
 */
public class ALARM_PTZ_LOCATION_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * Channel No.
	 * \else
	 * ͨ���� 
	 * \endif
	 */
	public int     nChannelID;
	
 	/**
	 * \if ENGLISH_LANG
	 * PTZ horizontal motion position��valid within��[0,3600]
	 * \else
	 * ��̨ˮƽ�˶�λ�ã���Ч��Χ��[0,3600]
	 * \endif
	 */
	public int     nPTZPan;
	
 	/**
	 * \if ENGLISH_LANG
	 * PTZ vertical motion position, valid within��[-1800,1800]
	 * \else
	 * ��̨��ֱ�˶�λ�ã���Ч��Χ��[-1800,1800]
	 * \endif
	 */
	public int     nPTZTilt;
	
 	/**
	 * \if ENGLISH_LANG
	 * PTZ iris change position, valid within��[0,128]
	 * \else
	 * ��̨��Ȧ�䶯λ�ã���Ч��Χ��[0,128]
	 * \endif
	 */
	public int     nPTZZoom;
	
 	/**
	 * \if ENGLISH_LANG
	 * PTZ motion status, 0-unknow 1-motion 2-idle 
	 * \else
	 * ��̨�˶�״̬, 0-δ֪ 1-�˶� 2-���� 
	 * \endif
	 */
	public byte    bState;
	
 	/**
	 * \if ENGLISH_LANG
	 * PTZ motion��0-preset��1-line��2-tour��3-pattern��4-horizontal rotate
	 * \else
	 * ��̨������0-Ԥ�õ㣬1-��ɨ��2-Ѳ����3-Ѳ����4-ˮƽ��ת
	 * \endif
	 */
	public byte    bAction;
	
 	/**
	 * \if ENGLISH_LANG
	 * PTZ focus status, 0-unknown, 1-motion status, 2-idle
	 * \else
	 * ��̨�۽�״̬, 0-δ֪, 1-�˶�״̬, 2-����
	 * \endif
	 */
	public byte    bFocusState;
	
 	/**
	 * \if ENGLISH_LANG
	 * in period preset status is valid or not
	 * If currently report preset is preset within period, then it is 1��others are 0
	 * \else
	 * ��ʱ�����Ԥ�õ�״̬�Ƿ���Ч
	 * �����ǰ�ϱ���Ԥ�õ���ʱ����ڵ�Ԥ�õ㣬��Ϊ1���������Ϊ0
	 * \endif
	 */
	public byte    bEffectiveInTimeSection;
                                        
 	/**
	 * \if ENGLISH_LANG
	 * Tour ID
	 * \else
	 * Ѳ��ID��
	 * \endif
	 */
	public int     nPtzActionID;
	
 	/**
	 * \if ENGLISH_LANG
	 * PTZ position preset no.
	 * \else
	 * ��̨����Ԥ�õ���
	 * \endif
	 */
	public int     dwPresetID;
	
 	/**
	 * \if ENGLISH_LANG
	 * Focus position
	 * \else
	 * �۽�λ��
	 * \endif
	 */
	public float   fFocusPosition;
	
 	/**
	 * \if ENGLISH_LANG
	 * PTZ ZOOM status��0-unknown��1-ZOOM��2-idle
	 * \else
	 * ��̨ZOOM״̬��0-δ֪��1-ZOOM��2-����
	 * \endif
	 */
	public byte    bZoomState;
	
 	/**
	 * \if ENGLISH_LANG
	 * No.��for calibration of loss
	 * \else
	 * ����ţ�����У���Ƿ񶪰�
	 * \endif
	 */
	public int     dwSequence;
	
 	/**
	 * \if ENGLISH_LANG
	 * Corresponding UTC(1970-1-1 00:00:00) second.
	 * \else
	 * ��Ӧ��UTC(1970-1-1 00:00:00)������
	 * \endif
	 */
	public int     dwUTC;
}
