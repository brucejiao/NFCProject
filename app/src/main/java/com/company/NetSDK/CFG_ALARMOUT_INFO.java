package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The state of the alarm output channel configuration 
 * \else
 * �������ͨ����״̬������
 * \endif
 */
public class CFG_ALARMOUT_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Alarm channel number (from zero)
	 * \else
	 * ����ͨ����(0��ʼ)
	 * \endif
	 */
	public int					nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm channel name
	 * \else
	 * ����ͨ������
	 * \endif
	 */
	public byte				szChnName[] = new byte[FinalVar.MAX_CHANNELNAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Output types, user-defined
	 * \else
	 * �������, �û��Զ���
	 * \endif
	 */
	public byte				szOutputType[] = new byte[FinalVar.MAX_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Output mode, 0 - automatic alarm 1 - Forced Alarm 2 - Turn off the alarm
	 * \else
	 * ���ģʽ, 0-�Զ�����, 1-ǿ�Ʊ���, 2-�رձ���
	 * \endif
	 */
	public int					nOutputMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Pulse mode output time, unit is second(0-255s)
	 * \else
	 * ����ģʽ���ʱ��, ��λΪ��(0-255��)
	 * \endif
	 */
	public int                 nPulseDelay;
	
	/**
	 * \if ENGLISH_LANG
	 * Root address, 0 means local channel, 1 means connection expansion channel on first serial, 2?��3...and so on, -1 means invalid
	 * \else
	 * ����ַ, 0��ʾ����ͨ��, 1��ʾ�����ڵ�һ�������ϵ���չͨ��, 2��3...�Դ�����, -1��ʾ��Ч
	 * \endif
	 */
	public int                 nSlot;
	
	/**
	 * \if ENGLISH_LANG
	 * First level cascading address, means connected at no. nSlot serial no. nLevel1 sensor or meter, start from 0, -1 means invalid
	 * \else
	 * ��һ��������ַ, ��ʾ�����ڵ�nSlot�����ϵĵ�nLevel1��̽�������Ǳ�, ��0��ʼ, -1��ʾ��Ч
	 * \endif
	 */
	public int                 nLevel1;
	
	/**
	 * \if ENGLISH_LANG
	 * means nLevel2 field exists or not
	 * \else
	 * ��ʾnLevel2�ֶ��Ƿ����
	 * \endif
	 */
	public boolean                abLevel2;
	
	/**
	 * \if ENGLISH_LANG
	 * Second level cascading address, means connected at no. nLevel1 meter sensor no., start from 0
	 * \else
	 * �ڶ���������ַ, ��ʾ�����ڵ�nLevel1�����Ǳ��ϵ�̽�������, ��0��ʼ
	 * \endif
	 */
    public int                 nLevel2;
}
