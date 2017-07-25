package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Storage group config
 * \else
 * �洢������
 * \endif
 */
public class AV_CFG_StorageGroup implements Serializable { 	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
 	/**
	 * \if ENGLISH_LANG
	 * Group name
	 * \else
	 * ��������
	 * \endif
	 */
	public byte[]		szName = new byte[FinalVar.AV_CFG_Group_Name_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Group note
	 * \else
	 * ����˵��
	 * \endif
	 */
	public byte[]		szMemo = new byte[FinalVar.AV_CFG_Group_Memo_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * File reserve time
	 * \else
	 * �ļ�����ʱ��
	 * \endif
	 */
	public int			nFileHoldTime;
	
 	/**
	 * \if ENGLISH_LANG
	 * Storage space is overlapped or not
	 * \else
	 * �洢�ռ����Ƿ񸲸�
	 * \endif
	 */
	public boolean		bOverWrite;
	
 	/**
	 * \if ENGLISH_LANG
	 * Record file path naming rule
	 * \else
	 * ¼���ļ�·����������
	 * \endif
	 */
	public byte[]		szRecordPathRule = new byte[FinalVar.AV_CFG_Max_Path];
	
 	/**
	 * \if ENGLISH_LANG
	 * Picture file path naming rule
	 * %y year, %M month, %d day, %h hour, %m minute, %s second, %c channel path
	 * If year month day hour minute second appear for two times, then first time means start time, second time means end time.
	 * \else
	 * ͼƬ�ļ�·����������
	 * %y��, %M��, %d��, %hʱ, %m��, %s��, %cͨ��·��
	 * ���������ʱ�����������, ��һ�α�ʾ��ʼʱ��, �ڶ��α�ʾ����ʱ��
	 * \endif
	 */
	public byte[]		szPicturePathRule = new byte[FinalVar.AV_CFG_Max_Path];
	
 	/**
	 * \if ENGLISH_LANG
	 * Channel related config 
	 * \else
	 * ͨ��������� 
	 * \endif
	 */
	public AV_CFG_StorageGroupChannel[] stuChannels = new AV_CFG_StorageGroupChannel[FinalVar.AV_CFG_Max_Channel_Num];
	
 	/**
	 * \if ENGLISH_LANG
	 * Channel config number
	 * \else
	 * ͨ��������
	 * \endif
	 */
	public int			nChannelCount;
	
	public AV_CFG_StorageGroup() {
		for (int i = 0; i < FinalVar.AV_CFG_Max_Channel_Num; ++i) {
			this.stuChannels[i] = new AV_CFG_StorageGroupChannel();
		}
	}
}
