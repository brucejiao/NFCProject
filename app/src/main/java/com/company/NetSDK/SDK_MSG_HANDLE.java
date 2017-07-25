package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm activation structure
 * \else
 * ���������ṹ��
 * \endif
 */
public class SDK_MSG_HANDLE implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The current alarm processing support bitwise mask:
	 * Message processing manner, while a variety of treatment,Include
	 * <table>
	 * <tr><td>0x00000001</td><td>Alarm upload</td></tr>
	 * <tr><td>0x00000002</td><td>activation video</td></tr>
	 * <tr><td>0x00000004</td><td>PTZ activation</td></tr>
	 * <tr><td>0x00000008</td><td>Send Email</td></tr>
	 * <tr><td>0x00000010</td><td>Tour</td></tr>
	 * <tr><td>0x00000020</td><td>Local Tip</td></tr>
	 * <tr><td>0x00000040</td><td>Alarm output</td></tr>
	 * <tr><td>0x00000080</td><td>Ftp upload</td></tr>
	 * <tr><td>0x00000100</td><td>Buzzer</td></tr>
	 * <tr><td>0x00000200</td><td>Voice prompts</td></tr>
	 * <tr><td>0x00000400</td><td>Snoapshot</td></tr>
	 * </table>
	 * \else
	 * ��ǰ������֧�ֵĴ���ʽ����λ�����ʾ:
	 * ��Ϣ����ʽ������ͬʱ���ִ���ʽ������
	 * <table>
	 * <tr><td>0x00000001</td><td>�����ϴ�</td></tr>
	 * <tr><td>0x00000002</td><td>����¼��</td></tr>
	 * <tr><td>0x00000004</td><td>��̨����</td></tr>
	 * <tr><td>0x00000008</td><td>�����ʼ�</td></tr>
	 * <tr><td>0x00000010</td><td>������Ѳ</td></tr>
	 * <tr><td>0x00000020</td><td>������ʾ</td></tr>
	 * <tr><td>0x00000040</td><td>�������</td></tr>
	 * <tr><td>0x00000080</td><td>Ftp�ϴ�</td></tr>
	 * <tr><td>0x00000100</td><td>����</td></tr>
	 * <tr><td>0x00000200</td><td>������ʾ</td></tr>
	 * <tr><td>0x00000400</td><td>ץͼ</td></tr>
	 * </table>
	 * \endif
	 */
	public int                 dwActionMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Trigger action, according to the bit mask indicates that the parameters needed by the specific operation is reflected in the respective configuration
	 * \else
	 * ������������λ�����ʾ�����嶯������Ҫ�Ĳ����ڸ��Ե�����������
	 * \endif
	 */
	public int                 dwActionFlag;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm trigger output channel, alarm trigger output to trigger the output to 1
	 * \else
	 * �������������ͨ�������������������Ϊ1��ʾ���������
	 * \endif
	 */
	public byte                byRelAlarmOut[] = new byte[FinalVar.SDK_MAX_ALARMOUT_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm duration time
	 * \else
	 * ��������ʱ��
	 * \endif
	 */
    public int                 dwDuration;
    
    /**
	 * \if ENGLISH_LANG
	 * Activation video, alarm-triggered video channel for 1 to trigger the channel
	 * \else
	 * ����¼�󣬱���������¼��ͨ����Ϊ1��ʾ������ͨ��
	 * \endif
	 */
    public byte                byRecordChannel[] = new byte[FinalVar.SDK_MAX_VIDEO_IN_NUM];
    
    /**
	 * \if ENGLISH_LANG
	 * Record duration time.
	 * \else
	 * ¼�����ʱ��.
	 * \endif
	 */
    public int                 dwRecLatch;
    
    /**
	 * \if ENGLISH_LANG
	 * Snapshot channel
	 * \else
	 * ץͼͨ��
	 * \endif
	 */
    public byte                bySnap[] = new byte[FinalVar.SDK_MAX_VIDEO_IN_NUM];
    
    /**
	 * \if ENGLISH_LANG
	 * Tour channel
	 * \else
	 * ��Ѳͨ��
	 * \endif
	 */
    public byte                byTour[] = new byte[FinalVar.SDK_MAX_VIDEO_IN_NUM];
    
    /**
	 * \if ENGLISH_LANG
	 * PTZ Activation
	 * \else
	 * ��̨����
	 * \endif
	 */
    public SDK_PTZ_LINK         struPtzLink[] = new SDK_PTZ_LINK[FinalVar.SDK_MAX_VIDEO_IN_NUM];
    
    /**
	 * \if ENGLISH_LANG
	 * Activation start delay time, s units, the range is from 0 to 15, the default value is 0
	 * \else
	 * ������ʼ��ʱʱ�䣬sΪ��λ����Χ��0~15��Ĭ��ֵ��0
	 * \endif
	 */
    public int               dwEventLatch;
    
    /**
	 * \if ENGLISH_LANG
	 * Activation start delay time, s units, the range is from 0 to 15, the default value is 0
	 * \else
	 * ������ʼ��ʱʱ�䣬sΪ��λ����Χ��0~15��Ĭ��ֵ��0
	 * \endif
	 */
    public byte                byRelWIAlarmOut[] = new byte[FinalVar.SDK_MAX_ALARMOUT_NUM];
    
    /**
	 * \if ENGLISH_LANG
	 * Message upload network
	 * \else
	 * ��Ϣ�ϴ�����
	 * \endif
	 */
    public byte                bMessageToNet;
    
    /**
	 * \if ENGLISH_LANG
	 * Short message alarm enable
	 * \else
	 * ���ű���ʹ��
	 * \endif
	 */
    public byte                bMMSEn;
    
    /**
	 * \if ENGLISH_LANG
	 * Short message send snopshot picture number
	 * \else
	 * ���ŷ���ץͼ����
	 * \endif
	 */
    public byte                bySnapshotTimes;
    
    /**
	 * \if ENGLISH_LANG
	 * Matrix enable
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
    public int                 dwMatrix;
    
    /**
	 * \if ENGLISH_LANG
	 * Log enabled, only the WTN dynamic detection in use
	 * \else
	 * ��־ʹ�ܣ�Ŀǰֻ����WTN��̬�����ʹ��
	 * \endif
	 */
    public byte                bLog;
    
    /**
	 * \if ENGLISH_LANG
	 * Capture frame interval, every how many frames to draw a picture, the number of sheets to capture a certain period of time with the capture frame rate. 0 means that not every frame, continuous capture
	 * \else
	 * ץͼ֡�����ÿ������֡ץһ��ͼƬ��һ��ʱ����ץ�ĵ���������ץͼ֡���йء�0��ʾ����֡������ץ��
	 * \endif
	 */
    public byte                bSnapshotPeriod;
    
    /**
	 * \if ENGLISH_LANG
	 * 0,Image Attachment,1,Video Attachment
	 * \else
	 * 0��ͼƬ������1��¼�񸽼�
	 * \endif
	 */
    public byte                byEmailType;
    
    /**
	 * \if ENGLISH_LANG
	 * Annex Videorecording maximum length, the unit MB
	 * \else
	 * ����¼��ʱ����󳤶ȣ���λMB
	 * \endif
	 */
    public byte                byEmailMaxLength;
    
    /**
	 * \if ENGLISH_LANG
	 * Attached is the maximum length of time in the video,Unit is second
	 * \else
	 * ������¼��ʱ���ʱ�䳤�ȣ���λ��
	 * \endif
	 */
    public byte                byEmailMaxTime;
    
    public SDK_MSG_HANDLE() {
    	for (int i = 0; i < FinalVar.SDK_MAX_VIDEO_IN_NUM; i++) {
    		struPtzLink[i] = new SDK_PTZ_LINK();
    	}
    }
}
