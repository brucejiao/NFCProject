package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Audio talk way
 * \else
 * �Խ���ʽ
 * \endif
 */
public class EM_USEDEV_MODE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Set client-end mode to begin audio talk 
	 * \else
	 * ���ÿͻ��˷�ʽ���������Խ�
	 * \endif
	 */
	public static final int     SDK_TALK_CLIENT_MODE = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Set server mode to begin audio talk
	 * \else
	 * ���÷�������ʽ���������Խ�
	 * \endif
	 */
	public static final int     SDK_TALK_SERVER_MODE = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Set encode format for audio talk
	 * \else
	 * ���������Խ������ʽ
	 * \endif
	 */
	public static final int     SDK_TALK_ENCODE_TYPE = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Set alarm subscribe way 
	 * \else
	 * ���ñ������ķ�ʽ
	 * \endif
	 */
	public static final int     SDK_ALARM_LISTEN_MODE = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * Set user right to realize configuration management
	 * \else
	 * ����ͨ��Ȩ�޽������ù���
	 * \endif
	 */
	public static final int     SDK_CONFIG_AUTHORITY_MODE = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * Set talking channel(0~MaxChannel-1)
	 * \else
	 * ���öԽ�ͨ��(0~MaxChannel-1)
	 * \endif
	 */
	public static final int     SDK_TALK_TALK_CHANNEL = 5;
	
	/**
	 * \if ENGLISH_LANG
	 * Set the stream type of the record for query(0-both main and extra stream,1-only main stream,2-only extra stream)  
	 * \else
	 * ���ô���ѯ����ʱ��طŵ�¼����������(0-��������,1-������,2-������) 
	 * \endif
	 */
	public static final int     SDK_RECORD_STREAM_TYPE = 6;
	
	/**
	 * \if ENGLISH_LANG
	 * Set speaking parameter,corresponding to NET_SPEAK_PARAM
	 * \else
	 * ���������Խ�������������Ӧ�ṹ��  NET_SPEAK_PARAM
	 * \endif
	 */
	public static final int     SDK_TALK_SPEAK_PARAM = 7;
	
	/**
	 * \if ENGLISH_LANG
	 * Set by time video playback and download the video file TYPE (see.net RECORD TYPE)
	 * \else
	 * ���ð�ʱ��¼��طż����ص�¼���ļ�����(���NET_RECORD_TYPE)
	 * \endif
	 */
    public static final int     SDK_RECORD_TYPE = 8; 
    
    /**
	 * \if ENGLISH_LANG
	 * Set voice intercom parameters of three generations of equipment and the corresponding structure NET TALK the EX
	 * \else
	 * ���������豸�������Խ�����, ��Ӧ�ṹ��NET_TALK_EX
	 * \endif
	 */
    public static final int     SDK_TALK_MODE3 = 9;
    
    /**
	 * \if ENGLISH_LANG
	 * set real time playback function(0-off��1-on)
	 * \else
	 * ����ʵʱ�طŹ���(0-�رգ�1����)
	 * \endif
	 */
    public static final int     SDK_PLAYBACK_REALTIME_MODE = 10; 
    
    /**
	 * \if ENGLISH_LANG
	 * Judge the voice intercom if it was a forwarding mode, (corresponding to  NET_TALK_TRANSFER_PARAM)
	 * \else
	 * ���������Խ��Ƿ�Ϊת��ģʽ, ��Ӧ�ṹ�� NET_TALK_TRANSFER_PARAM
	 * \endif
	 */
    public static final int     SDK_TALK_TRANSFER_MODE = 11; 
}
