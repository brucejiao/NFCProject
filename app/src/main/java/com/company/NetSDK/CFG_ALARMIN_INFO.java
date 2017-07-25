package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * External Alarm Configuration
 * \else
 * �ⲿ��������
 * \endif
 */
public class CFG_ALARMIN_INFO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Channel No.(0 Start) 
	 * \else
	 * ����ͨ����(0��ʼ)
	 * \endif
	 */
	public int					nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable Switch 
	 * \else
	 * ʹ�ܿ���
	 * \endif
	 */
	public boolean				bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Channel Name 
	 * \else
	 * ����ͨ������
	 * \endif
	 */
	public char					szChnName[] = new char[FinalVar.MAX_CHANNELNAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Sensor Name. 0:Normal Closed,1:Normal Open
	 * \else
	 * ����������,0:����,1:����
	 * \endif
	 */
	public int					nAlarmType;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Linkage 
	 * \else
	 * ��������
	 * \endif
	 */
	public CFG_ALARM_MSG_HANDLE stuEventHandler = new CFG_ALARM_MSG_HANDLE();
	
	/**
	 * \if ENGLISH_LANG
	 * Event Respond Time Section 
	 * \else
	 * �¼���Ӧʱ���
	 * \endif
	 */
	public CFG_TIME_SECTION		stuTimeSection[][] = new CFG_TIME_SECTION[FinalVar.WEEK_DAY_NUM][FinalVar.MAX_REC_TSECT];

	public boolean				abDevID;
	
	/**
	 * \if ENGLISH_LANG
	 * device ID 
	 * \else
	 * �豸ID
	 * \endif
	 */
	public char					szDevID[] = new char[FinalVar.MAX_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * sensor trigger mode, 0: highly effective��1 low effective; sensor grounding or power��and group with nAlarmType 
	 * \else
	 * ����������ģʽ, 0:����Ч,1����Ч; �������Ϊ�������ӵ�or��Դ,��nAlarmType���ʹ��
	 * \endif
	 */
	public int                  nPole;                                      
	                                                                
	/**
	 * \if ENGLISH_LANG
	 * sensor type, EM_SENSE_METHOD
	 * \else
	 * ��������Ӧ��ʽ, EM_SENSE_METHOD
	 * \endif
	 */
	public int				     emSense;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm enable control, EM_CTRL_ENABLE
	 * \else
	 * ����ʹ�ܿ��Ʒ�ʽ, EM_CTRL_ENABLE
	 * \endif
	 */
	public int                   emCtrl;
	
	/**
	 * \if ENGLISH_LANG
	 * delay disarm , in s,0~300,emCtrl value is EM_CTRL_NORMAL or EM_CTRL_ALWAYS_EN effective 
	 * \else
	 * ��ʱ����ʱ��,��λΪ��,0~300,emCtrlֵΪEM_CTRL_NORMAL��EM_CTRL_ALWAYS_EN ʱ��Ч.
	 * \endif
	 */
	public int                  nDisDelay;     
	
	/**
	 * \if ENGLISH_LANG
	 * DefenceArea Type , Specific Types Supported by Querying the Ability to Obtain
	 * \else
	 * ��������, ����֧�ֵ�����ͨ����ѯ�������
	 * \endif 
	 * @see EM_CFG_DEFENCEAREATYPE
	 */
	public int 					emDefenceAreaType;
	
	/**
	 * \if ENGLISH_LANG
	 * Delay Protection Time, DefenceArea Type is"Delay"(Delay DefenceArea)is Effective, Unit: Second,  Maximum Time by Querying the Ability to Obtain
	 * \else
	 * ��ʱ����ʱ��, ��������Ϊ"Delay"(��ʱ����)ʱ����Ч, ��λ: ��, ���ʱ��ͨ����ѯ�������    
	 * \endif 
	 */
	public int					nEnableDelay;
	
	/**
	 * \if ENGLISH_LANG
	 * Root address, -1 means invalid, 0 means local channel, 1 means connect to 1st serial extension channel, 2, 3...and so on
	 * \else
	 * ����ַ, -1��ʾ��Ч, 0��ʾ����ͨ��, 1��ʾ�����ڵ�һ�������ϵ���չͨ��, 2��3...�Դ�����
	 * \endif 
	 */
    public int                  nSlot; 
    
    /**
	 * \if ENGLISH_LANG
	 * 1st level cascading address, means connection to no.nSlot serial no.nLevel 1 detector or meter, -1 means invalid, from 0
	 * \else
	 * ��һ��������ַ, ��ʾ�����ڵ�nSlot�����ϵĵ�nLevel1��̽�������Ǳ�, -1��ʾ��Ч, ��0��ʼ
	 * \endif 
	 */
    public int                  nLevel1; 
   
    /**
	 * \if ENGLISH_LANG
	 *  Means if nLevel2 text exists
	 * \else
	 * ��ʾnLevel2�ֶ��Ƿ����
	 * \endif 
	 */
    public boolean              abLevel2; 
    
    /**
   	 * \if ENGLISH_LANG
   	 *  2rd level cascading address, means connected to no. nLevel1 meter's detector no., -1 means invalid, from 0
   	 * \else
   	 * �ڶ���������ַ, ��ʾ�����ڵ�nLevel1�����Ǳ��ϵ�̽�������, -1��ʾ��Ч, ��0��ʼ
   	 * \endif 
   	 */
    public int                  nLevel2;
		
	public CFG_ALARMIN_INFO() {
		for (int i = 0; i < FinalVar.WEEK_DAY_NUM; i++) {
			for (int j = 0; j < FinalVar.MAX_REC_TSECT; j++) {
				stuTimeSection[i][j] = new CFG_TIME_SECTION();
			}
		}
	}
}
