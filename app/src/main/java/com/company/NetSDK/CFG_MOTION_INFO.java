package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Dynamic Monitoring alarm linkage configuration
 * \else
 * ��̬��ⱨ������
 * \endif
 */
public class CFG_MOTION_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Alarm channel number(from 0) 
	 * \else
	 * ����ͨ����(0��ʼ), nVersion=1ʱ�����ֶ���Ч
	 * \endif
	 */
	public int					 nChannelID;									

	/**
	 * \if ENGLISH_LANG
	 * Enable 
	 * \else
	 * ʹ�ܿ���
	 * \endif
	 */
	public boolean				 bEnable;									    

	/**
	 * \if ENGLISH_LANG
	 * SenseLevel1~6��min:1 max:6
	 * \else
	 * ������1��6
	 * \endif
	 */
	public int					 nSenseLevel;								    

	/**
	 * \if ENGLISH_LANG
	 * The number of rows of the dynamic detection area 
	 * \else
	 * ��̬������������
	 * \endif
	 */
	public int					 nMotionRow;									

	/**
	 * \if ENGLISH_LANG
	 * The number of lines of the dynamic detection area 
	 * \else
	 * ��̬������������
	 * \endif
	 */
	public int					 nMotionCol;									

	/**
	 * \if ENGLISH_LANG
	 * Detection area��max: 32*32 areas 
	 * \else
	 * ����������32*32������
	 * \endif
	 */
	public byte				 	byRegion[][] = new byte[FinalVar.MAX_MOTION_ROW][FinalVar.MAX_MOTION_COL];	    

	/**
	 * \if ENGLISH_LANG
	 * Alarm linkage 
	 * \else
	 * ��������
	 * \endif
	 */
	public CFG_ALARM_MSG_HANDLE stuEventHandler = new CFG_ALARM_MSG_HANDLE();							    

	/**
	 * \if ENGLISH_LANG
	 * Incident response period 
	 * \else
	 * �¼���Ӧʱ���
	 * \endif
	 */
	public CFG_TIME_SECTION	 	stuTimeSection[][] = new CFG_TIME_SECTION[FinalVar.WEEK_DAY_NUM][FinalVar.MAX_REC_TSECT];   

	/**
	 * \if ENGLISH_LANG
	 * 0, 1, depends on capacity set, read only, when equat to 1 and lower to be valid 
	 * \else
	 * 0, 1, ��������ȷ��, ֻ��, ����1ʱ�����ֶ���Ч
	 * \endif
	 */
	public int			         nVersion;                                      

	/**
	 * \if ENGLISH_LANG
	 * real only��depends on nSenseLevel valid or not 
	 * \else
	 * ֻ��������nSenseLevel�Ƿ���Ч
	 * \endif
	 */
	public boolean                 bSenseLevelEn;                                 

	/**
	 * \if ENGLISH_LANG
	 * real only��area occupy enable�� depends on nVolumeRatio valid or not 
	 * \else
	 * ֻ�������ռ�ñ�ʹ�ܣ� ����nVolumeRatio�Ƿ���Ч
	 * \endif
	 */
	public boolean                 bVRatioEn;                                     

	/**
	 * \if ENGLISH_LANG
	 * area occupy ratio,1-100
	 * \else
	 * ���ռ�ñ�,1-100
	 * \endif
	 */
	public int                  nVolumeRatio;                                  

	/**
	 * \if ENGLISH_LANG
	 * real only��sensitivity enable��depends on nSubRatio valid or not 
	 * \else
	 * ֻ����������ʹ�ܣ�����nSubRatioֵ�Ƿ���Ч
	 * \endif
	 */
	public boolean                 bSRatioEn;                                     

	/**
	 * \if ENGLISH_LANG
	 * motion detect difference threshold, 1-100 
	 * \else
	 * ����Ĳв���ֵ, 1-100
	 * \endif
	 */
	public int                  nSubRatio;                                     

	/**
	 * \if ENGLISH_LANG
	 * real only��0: nMotionRow, nMotionCol and byRegion text valid, 1: window text
	 * \else
	 * ֻ����0: nMotionRow, nMotionCol��byRegion�ֶ���Ч, 1: ������Ƶ�����ֶ� 
	 * \endif
	 */
	public boolean                 abWindow;                                      

	/**
	 * \if ENGLISH_LANG
	 * video window 
	 * \else
	 * ��Ƶ���ڸ���
	 * \endif
	 */
	public int                  nWindowCount;                                  

	/**
	 * \if ENGLISH_LANG
	 * video window group 
	 * \else
	 * ��Ƶ��������
	 * \endif
	 */
	public CFG_MOTION_WINDOW    stuWindows[] = new CFG_MOTION_WINDOW[FinalVar.MAX_MOTION_WINDOW];
	
	/**
	 * \if ENGLISH_LANG
	 * Read only: 1, onRegionCount, stuRegion valid
	 * 0, onMotionRow, nMotionCol, byRegion valid
	 * \else
	 * ֻ����1��nRegionCount��stuRegion��Ч
	 * 0��nMotionRow��nMotionCol��byRegion��Ч
	 * \endif
	 */
	public boolean                 abDetectRegion;
	
	/**
	 * \if ENGLISH_LANG
	 * 3rd generation motion detection zone quantity
	 * \else
	 * ������̬����������
	 * \endif
	 */
	public int                  nRegionCount; 
	
	/**
	 * \if ENGLISH_LANG
	 * 3rd generation motion detection zone
	 * \else
	 * ������̬�������
	 * \endif
	 */
	public CFG_DETECT_REGION    stuRegion[] = new CFG_DETECT_REGION[FinalVar.MAX_MOTION_WINDOW];
	
	public CFG_MOTION_INFO() {
		for (int i = 0; i < FinalVar.WEEK_DAY_NUM; i++) {
			for (int j = 0; j < FinalVar.MAX_REC_TSECT; j++) {
				stuTimeSection[i][j] = new CFG_TIME_SECTION();
			}
		}
		
		for (int i = 0; i < FinalVar.MAX_MOTION_WINDOW; i++) {
			stuWindows[i] = new CFG_MOTION_WINDOW();
			stuRegion[i] = new CFG_DETECT_REGION();
		}
	}
}
