package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Snapshot info
 * \else
 * ץ����Ϣ
 * \endif
 */
public class SDK_SIG_CARWAY_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Current car speed,km/h
	 * \else
	 * ��ǰ�����ٶȣ�km/h
	 * \endif
	 */
	public short              snSpeed;
	
	/**
	 * \if ENGLISH_LANG
	 * Current car length, dm
	 * \else
	 * ��ǰ����,����Ϊ��λ
	 * \endif
	 */
	public short              snCarLength;
	
	/**
	 * \if ENGLISH_LANG
	 * Current red light time, s.ms
	 * \else
	 * ��ǰ�������ʱ��,��.����
	 * \endif
	 */
	public float              fRedTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Current car way snapshot time, s.ms 
	 * \else
	 * ��ǰ����ץ��ʱ��,��.����
	 * \endif
	 */
	public float              fCapTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Current snapshot Sequence
	 * \else
	 * ��ǰץ�����
	 * \endif
	 */
	public byte               bSigSequence;
	
	/**
	 * \if ENGLISH_LANG
	 * current snapshot type
	 * 0: radar up speed limit;1: radar low speed limit;2: car detector up speed limit;3:car detector low speed limit
	 * 4: reverse;5: break red light;6: red light on;7: red light off;8: snapshot or traffic gate
	 * \else
	 * ��ǰ������ץ������
	 * 0: �״������;1: �״������;2: ������������;3:������������
	 * 4: ����;5: �����;6: �����;7: �����;8: ȫ��ץ�Ļ��߿���
	 * \endif
	 */
	public byte               bType;
	
	/**
	 * \if ENGLISH_LANG
	 * Breaking type :01:left turn;02:straight;03:right
	 * \else
	 * ���������:01:��ת���;02:ֱ�к��;03:��ת���
	 * \endif
	 */
	public byte               bDirection;
	
	/**
	 * \if ENGLISH_LANG
	 * Current car way traffic light state,0: green, 1: red, 2: yellow
	 * \else
	 * ��ǰ�����ĺ��̵�״̬��0: �̵�, 1: ���, 2: �Ƶ�
	 * \endif
	 */
	public byte               bLightColor;
	
	/**
	 * \if ENGLISH_LANG
	 * Snap flag from device
	 * \else
	 * �豸������ץ�ı�ʶ
	 * \endif
	 */
	public byte               bSnapFlag[] = new byte[16];
}
