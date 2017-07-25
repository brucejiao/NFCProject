package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm relay structure
 * \else
 * ����������չ�ṹ��
 * \endif
 */
public class SDK_MSG_HANDLE_EX implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Current alarm supporting methods, shown by bit mask
	 * Message triggered methods,multiple methods,including
	 * 0x00000001 - alarm upload
	 * 0x00000002 - triggering recording
	 * 0x00000004 - PTZ movement
	 * 0x00000008 - sending email
	 * 0x00000010 - local tour
	 * 0x00000020 - local tips
	 * 0x00000040 - alarm output
	 * 0x00000080 - ftp upload
	 * 0x00000100 - buzzer
	 * 0x00000200 - voice tips 
	 * 0x00000400 - snapshot
	 * \else
	 * ��ǰ������֧�ֵĴ���ʽ����λ�����ʾ
	 * ��Ϣ����ʽ������ͬʱ���ִ���ʽ������
     * 0x00000001 - �����ϴ�
     * 0x00000002 - ����¼��
     * 0x00000004 - ��̨����
     * 0x00000008 - �����ʼ�
     * 0x00000010 - ������Ѳ
     * 0x00000020 - ������ʾ
     * 0x00000040 - �������
     * 0x00000080 - Ftp�ϴ�
     * 0x00000100 - ����
     * 0x00000200 - ������ʾ
     * 0x00000400 - ץͼ
	 * \endif
	 */
	public int               dwActionMask;

	/**
	 * \if ENGLISH_LANG
	 * Triggering action,shown by bit mask,concrete action parameter is shows in the configuration
	 * \else
	 * ������������λ�����ʾ�����嶯������Ҫ�Ĳ����ڸ��Ե�����������
	 * \endif
	 */
	public int               dwActionFlag;
    
	/**
	 * \if ENGLISH_LANG
	 * Triggering alarm output channel,1 means triggering this output
	 * \else
	 * �������������ͨ�������������������Ϊ1��ʾ���������
	 * \endif
	 */
	public byte                byRelAlarmOut[] = new byte[FinalVar.SDK_MAX_ALARMOUT_NUM_EX];
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm lasting period
	 * \else
	 * ��������ʱ��
	 * \endif
	 */
    public int               dwDuration;

    /**
	 * \if ENGLISH_LANG
	 * Record channel triggered by alarm,1 means triggering this channel
	 * \else
	 * ����������¼��ͨ����Ϊ1��ʾ������ͨ��
	 * \endif
	 */
    public byte                byRecordChannel[] = new byte[FinalVar.SDK_MAX_VIDEO_IN_NUM_EX];
    
    /**
	 * \if ENGLISH_LANG
	 * Recording period
	 * \else
	 * ¼�����ʱ��
	 * \endif
	 */
    public int               dwRecLatch;

    /**
	 * \if ENGLISH_LANG
	 * Snapshot channel
	 * \else
	 * ץͼͨ��
	 * \endif
	 */
    public byte                bySnap[] = new byte[FinalVar.SDK_MAX_VIDEO_IN_NUM_EX];

    /**
	 * \if ENGLISH_LANG
	 * Tour channel
	 * \else
	 * ��Ѳͨ��
	 * \endif
	 */
    public byte                byTour[] = new byte[FinalVar.SDK_MAX_VIDEO_IN_NUM_EX];

    /**
	 * \if ENGLISH_LANG
	 * PTZ movement
	 * \else
	 * ��̨����
	 * \endif
	 */
    public SDK_PTZ_LINK         struPtzLink[] = new SDK_PTZ_LINK[FinalVar.SDK_MAX_VIDEO_IN_NUM_EX];
    
    /**
	 * \if ENGLISH_LANG
	 * Event delay time, s for unit,range is 0~15,default is 0
	 * \else
	 * ������ʼ��ʱʱ�䣬sΪ��λ����Χ��0~15��Ĭ��ֵ��0
	 * \endif
	 */
    public int               dwEventLatch;

    /**
	 * \if ENGLISH_LANG
	 * Alarm trigerring wireless output,alarm output,1 for trigerring output
	 * \else
	 * �����������������ͨ�������������������Ϊ1��ʾ���������
	 * \endif
	 */
    public byte                byRelWIAlarmOut[] = new byte[FinalVar.SDK_MAX_ALARMOUT_NUM_EX];
    
    /**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 
	 * \endif
	 */
    public byte                bMessageToNet;
    
    /**
	 * \if ENGLISH_LANG
	 * Message triggering alarm enabling
	 * \else
	 * ���ű���ʹ��
	 * \endif
	 */
    public byte                bMMSEn;
    
    /**
	 * \if ENGLISH_LANG
	 * the number of sheets of drawings
	 * \else
	 * ���ŷ���ץͼ����
	 * \endif
	 */
    public byte                bySnapshotTimes;
    
    /**
	 * \if ENGLISH_LANG
	 * Matrix output enable
	 * \else
	 * ����ʹ��
	 * \endif
	 */
    public byte                bMatrixEn;
    
    /**
	 * \if ENGLISH_LANG
	 * Matrix mask
	 * \else
	 * ��������
	 * \endif
	 */
    public int               dwMatrix;
    
    /**
	 * \if ENGLISH_LANG
	 * Log enable,only used in WTN motion detection
	 * \else
	 * ��־ʹ�ܣ�Ŀǰֻ����WTN��̬�����ʹ��
	 * \endif
	 */
    public byte                bLog;
    
    /**
	 * \if ENGLISH_LANG
	 * Snapshot frame interval. System can snapshot regularly at the interval you specify here. The snapshot amount in a period of time also has relationship with the snapshot frame rate. 0 means there is no interval, system just snapshot continuously.
	 * \else
	 * ץͼ֡�����ÿ������֡ץһ��ͼƬ��һ��ʱ����ץ�ĵ���������ץͼ֡���йء�0��ʾ����֡������ץ�ġ�
	 * \endif
	 */
    public byte                bSnapshotPeriod;
    
    /**
	 * \if ENGLISH_LANG
	 * Tour channel 32-63
	 * \else
	 * ��Ѳͨ�� 32-63·
	 * \endif
	 */
    public byte                byTour2[] = new byte[FinalVar.SDK_MAX_VIDEO_IN_NUM_EX];
    
    /**
	 * \if ENGLISH_LANG
	 * 0,picture,1,record
	 * \else
	 * 0��ͼƬ������1��¼�񸽼�
	 * \endif
	 */
    public byte                byEmailType;
    
    /**
	 * \if ENGLISH_LANG
	 * max record length,unit:MB
	 * \else
	 * ����¼��ʱ����󳤶ȣ���λMB
	 * \endif
	 */
    public byte                byEmailMaxLength;
    
    /**
	 * \if ENGLISH_LANG
	 * max time length, unit:second
	 * \else
	 * ������¼��ʱ���ʱ�䳤�ȣ���λ��
	 * \endif
	 */
    public byte                byEmailMaxTime;
    
    public SDK_MSG_HANDLE_EX() {
    	for (int i = 0; i < FinalVar.SDK_MAX_VIDEO_IN_NUM_EX; i++) {
    		struPtzLink[i] = new SDK_PTZ_LINK();
    	}
    }
}
