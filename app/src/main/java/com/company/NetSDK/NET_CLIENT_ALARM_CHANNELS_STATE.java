package com.company.NetSDK;

import java.io.Serializable;

public class NET_CLIENT_ALARM_CHANNELS_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The type of query alarm channel, NET_ALARM_CHANNEL_TYPE
	 * \else
	 * ��ѯ����ͨ��������, NET_ALARM_CHANNEL_TYPE
	 * \endif
	 */
	public int                         emType;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm input number, specified by the user 
	 * \else
	 * ����������������û�ָ��
	 * \endif
	 */
	public int                         nAlarmInCount;
	
	/**
	 * \if ENGLISH_LANG
	 * The number of returned alarm input 
	 * \else
	 * ����������������û�ָ��
	 * \endif
	 */
	public int                         nAlarmInRetCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm state of input arrays, memory allocated by the user, each element represents a channel status, TRUE for input, FALSE for no input 
	 * \else
	 * ��������״̬���飬���û������ڴ棬ÿ��Ԫ�ر�ʾһ��ͨ��״̬,TRUEΪ������,FALSEΪ������
	 * \endif
	 */
	public boolean                     pbAlarmInState[];
	
	/**
	 * \if ENGLISH_LANG
	 * The number of alarm output,specified by the user 
	 * \else
	 * ����������������û�ָ��
	 * \endif
	 */
    public int                         nAlarmOutCount;
    
    /**
     * \if ENGLISH_LANG
     * The number of alarm output 
     * \else
     * �����������
     * \endif
     */
    public int                         nAlarmOutRetCount;
    
    /**
     * \if ENGLISH_LANG
     * Alarm state of output arrays, memory allocated by the user, each element represents a channel status, TRUE for output, FALSE for no output 
     * \else
     * �������״̬���飬���û������ڴ棬ÿ��Ԫ�ر�ʾһ��ͨ��״̬,TRUEΪ�����,FALSEΪ���
     * \endif
     */
    public boolean                     pbAlarmOutState[];
    
    /**
     * \if ENGLISH_LANG
     * Alarm Number,specified by the user 
     * \else
     * ���Ÿ��������û�ָ��
     * \endif
     */
    public int                         nAlarmBellCount;
    
    /**
     * \if ENGLISH_LANG
     * Returned Alarm Number 
     * \else
     * ���ŷ��ظ���
     * \endif
     */
    public int                         nAlarmBellRetCount;
    
    /**
     * \if ENGLISH_LANG
     * Alarm state array, allocate memory by the user, each element represents a channel status, TRUE for output, FALSE for no output
     * \else
     * ����״̬���飬���û������ڴ棬ÿ��Ԫ�ر�ʾһ��ͨ��״̬,TRUEΪ�����,FALSEΪ�����
     * \endif
     */
    public boolean                     pbAlarmBellState[];
    
    /**
     * \if ENGLISH_LANG
     * Extension module alarm input number, specified by the user 
     * \else
     * ��չģ�鱨��������������û�ָ��
     * \endif
     */
    public int                         nExAlarmInCount;
    
    /**
     * \if ENGLISH_LANG
     * The number of returned extension module alarm input 
     * \else
     * ��չģ�鱨�����뷵�ظ���
     * \endif
     */
    public int                         nExAlarmInRetCount;
    
    /**
     * \if ENGLISH_LANG
     * Extension module alarm input state array��Memory allocated by the user, each element represents a channel status, TRUE for output, FALSE for no output 
     * \else
     * ��չģ�鱨������״̬���飬���û������ڴ棬ÿ��Ԫ�ر�ʾһ��ͨ��״̬,TRUEΪ�����,FALSEΪ�����
     * \endif
     */
    public boolean                     pbExAlarmInState[];
    
    /**
     * \if ENGLISH_LANG
     * The location of the extension module alarm input effective channels 
     * \else
     * ��չģ�鱨��������Чͨ����λ��
     * \endif
     */
    public int                         pnExAlarmInDestionation[];
    
    /**
     * \if ENGLISH_LANG
     * Extension module alarm output number, specified by the user
     * \else
     * ��չģ�鱨��������������û�ָ��
     * \endif
     */
    public int                         nExAlarmOutCount;
    
    /**
     * \if ENGLISH_LANG
     * Extension module alarm output number 
     * \else
     * ��չģ�鱨���������
     * \endif
     */
    public int                         nExAlarmOutRetCount;
    
    /**
     * \if ENGLISH_LANG
     * Extension module alarm output state array��Memory allocated by the user, each element represents a channel status, TRUE for output, FALSE for no output 
     * \else
     * ��չģ�鱨�����״̬���飬���û������ڴ棬ÿ��Ԫ�ر�ʾһ��ͨ��״̬,TRUEΪ�����,FALSEΪ�����
     * \endif
     */
    public boolean                     pbExAlarmOutState[];
    
    /**
     * \if ENGLISH_LANG
     * The location of the extension module alarm output effective channels
     * \else
     * ��չģ�鱨�������Чͨ����λ��
     * \endif
     */
    public int                         pnExAlarmOutDestionation[];
}
