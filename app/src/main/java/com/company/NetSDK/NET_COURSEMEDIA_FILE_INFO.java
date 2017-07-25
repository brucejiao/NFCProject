package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * record info
 * \else
 * ��Ƶ��Ϣ
 * \endif
 */
public class NET_COURSEMEDIA_FILE_INFO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * start time
	 * \else
	 * ��ѯ��ʼʱ��
	 * \endif
	 */
    public NET_TIME                 stuStartTime = new NET_TIME(); 
  
    /**
     * \if ENGLISH_LANG
     * end time
     * \else
     * ��ѯ����ʱ��
     * \endif
     */
    public NET_TIME                 stuEndTime = new NET_TIME(); 
    
    /**
     * \if ENGLISH_LANG
     * course name
     * \else
     * �γ�����
     * \endif
     */
    public byte[]                   szCourseName = new byte[FinalVar.SDK_COMMON_STRING_64];                 
    
    /**
     * \if ENGLISH_LANG
     *  teacher's name
     * \else
     * ��ʦ����
     * \endif
     */
    public byte[]                   szTeacherName = new byte[FinalVar.SDK_COMMON_STRING_64];               
    
    /**
     * \if ENGLISH_LANG
     * record introduction
     * \else
     * ��Ƶ���
     * \endif
     */
    public byte[]                   szIntroduction = new byte[FinalVar.SDK_COMMON_STRING_128];              
    
    /**
     * \if ENGLISH_LANG
     * record info id��-1�� have not record info
     * \else
     * ��Ƶ��ϢID,-1��ʾ�޴˼�¼
     * \endif
     */
    public int                      nID; 
    
    /**
     * \if ENGLISH_LANG
     * representation channel file info
     * \else
     *  ӳ��ͨ���ļ���Ϣ����һά�±�Ϊӳ��ͨ���ţ��ڶ�άΪ¼��ֶ���
     * \endif
     */
    public NET_CHANNEL_INFO[][]     stuChannelInfo = new NET_CHANNEL_INFO[64][16];
 
    public NET_COURSEMEDIA_FILE_INFO() {
    	for (int i = 0; i < 64; ++i) {
    		for (int j = 0; j < 16; ++j) {
    			stuChannelInfo[i][j] = new NET_CHANNEL_INFO();
    		}
    	}
    }
}
