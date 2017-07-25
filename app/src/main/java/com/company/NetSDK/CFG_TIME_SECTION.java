package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Period information
 * \else
 * ʱ�����Ϣ
 * \endif
 */
public class CFG_TIME_SECTION implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Snapshot and Record Type Mask 
	 * <pre>
	 * Mask 		Record Type 
	 * Bit0 		Active Detection Record 
	 * Bit1 		Alarm Record 
	 * Bit2 		Timing Record 
	 * Bit3 R		ecord when motion detection and alarming occur at the same time 
	 * Bit4~Bit15 	Reserved 
	 * Bit16 		Active Detection Snapshot 
	 * Bit17 		Alarming Snapshot 
	 * Bit18 		Timing Snapshot 
	 * Bit19~Bit31 	Reserved 
	 * </pre>
	 * \else
	 * ¼�����룬��λ�ֱ�Ϊ��̬���¼�񡢱���¼�񡢶�ʱ¼��Bit3~Bit15������Bit16��̬���ץͼ��Bit17����ץͼ��Bit18��ʱץͼ
	 * \endif
	 */
	public int					dwRecordMask; 
	public int					nBeginHour;
	public int					nBeginMin;
	public int					nBeginSec;
	public int					nEndHour;
	public int					nEndMin;
	public int					nEndSec;
}
