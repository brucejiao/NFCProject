package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm Failure Status, Output Parameter
 * \else
 * ��������״̬, �������
 * \endif
 */
public class NET_OUT_ALARM_FAULT_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 0: Unknown, 1: Normal, 2:Failure
	 * \else
	 * 0: δ֪, 1: ����, 2:����
	 * \endif
	 */
	public int             nConnectFaultState;

	/**
	 * \if ENGLISH_LANG
	 * Bell valid number
	 * \else
	 * ������Ч����
	 * \endif
	 */
	public int             nBell;

	/**
	 * \if ENGLISH_LANG
	 * Bell failure status info 0: Unknown, 1: Normal, 2:Failure
	 * \else
	 * ���Ź���״̬��Ϣ 0: δ֪, 1: ����, 2:����
	 * \endif
	 */
	public int             anBellState[] = new int[FinalVar.SDK_MAX_BELL_NUM];

	/**
	 * \if ENGLISH_LANG
	 * Keyboard failure valid number
	 * \else
	 * ���̹�����Ч����
	 * \endif
	 */
	public int             nFaultKeyboard;

	/**
	 * \if ENGLISH_LANG
	 * Keyboard failure info 0: Unknown, 1: Normal, 2:Failure
	 * \else
	 * ���̹�����Ϣ 0: δ֪, 1: ����, 2:����
	 * \endif
	 */
	public int             anFaultKeyboard[] = new int[FinalVar.SDK_MAX_KEYBOARD_NUM];

	/**
	 * \if ENGLISH_LANG
	 * Keyboard valid vandal-proof number
	 * \else
	 * ������Ч�������
	 * \endif
	 */
	public int             nTamperKeyboard;

	/**
	 * \if ENGLISH_LANG
	 * Keyboard vandal-proof info 0: Unknown, 1: Normal, 2:Failure
	 * \else
	 * ���̷�����Ϣ 0: δ֪, 1: ����, 2:����
	 * \endif
	 */
	public int             anTamperKeyboard[] = new int[FinalVar.SDK_MAX_KEYBOARD_NUM];

	/**
	 * \if ENGLISH_LANG
	 * Sensor valid short circuit number
	 * \else
	 * ��������Ч��·����
	 * \endif
	 */
	public int             nShortOutSensor;

	/**
	 * \if ENGLISH_LANG
	 * Sensor short circuit info 0: Unknown, 1: Normal, 2:Failure
	 * \else
	 * ��������·��Ϣ 0: δ֪, 1: ����, 2:����
	 * \endif
	 */
	public int             anShortOutSensor[] = new int[FinalVar.SDK_MAX_ALARMIN];

	/**
	 * \if ENGLISH_LANG
	 * Sensor valid vandal-proof number
	 * \else
	 * ��������Ч�������
	 * \endif
	 */
	public int             nTamperSensor;

	/**
	 * \if ENGLISH_LANG
	 * Sensor vandal-proof info 0: Unknown, 1: Normal, 2:Failure
	 * \else
	 * ������������Ϣ 0: δ֪, 1: ����, 2:����
	 * \endif
	 */
	public int             anTamperSensor[] = new int[FinalVar.SDK_MAX_ALARMIN];
}
                                     