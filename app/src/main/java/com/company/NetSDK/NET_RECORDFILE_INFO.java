package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Record file information
 * \else
 * ¼���ļ���Ϣ
 * \endif
 */
public class NET_RECORDFILE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel number
	 * \else
	 * ͨ����
	 * \endif
	 */
	public int					ch;
	
	/**
	 * \if ENGLISH_LANG
	 * File name 
	 * \else
	 * �ļ���
	 * \endif
	 */
	public byte					filename[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * File length 
	 * \else
	 * �ļ�����
	 * \endif
	 */
	public int					size;
	
	/**
	 * \if ENGLISH_LANG
	 * Start time
	 * \else
	 * ��ʼʱ��
	 * \endif
	 */
	public NET_TIME				starttime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * End time 
	 * \else
	 * ����ʱ��
	 * \endif
	 */
	public NET_TIME				endtime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * HDD number 
	 * \else
	 * ���̺�(��������¼��ͱ���¼������ͣ�0��127��ʾ����¼��,����64��ʾ����1��128��ʾ����¼��)
	 * \endif
	 */
	public int					driveno;
	
	/**
	 * \if ENGLISH_LANG
	 * Initial cluster number 
	 * \else
	 * ��ʼ�غ�
	 * \endif
	 */
	public int					startcluster;
	
	/**
	 * \if ENGLISH_LANG
	 * Recorded file type  0:general record;1:alarm record ;2:motion detection;3:card number record ;4:image
	 * \else
	 * ¼���ļ�����  0����ͨ¼��1������¼��2���ƶ���⣻3������¼��4��ͼƬ
	 * \endif
	 */
	public byte					nRecordFileType;
	
	/**
	 * \if ENGLISH_LANG
	 * 0:general record 1:Important record
	 * \else
	 * 0:��ͨ¼�� 1:��Ҫ¼��
	 * \endif
	 */
	public byte                 bImportantRecID;
	
	/**
	 * \if ENGLISH_LANG
	 * Document Indexing, when nRecordFileType == 4(Picture), "bImportantRecID << 8 + bHint" is index 
	 * \else
	 * �ļ���λ����, nRecordFileType == 4(ͼƬ)ʱ, "bImportantRecID << 8 + bHint", ���ͼƬ��λ���� 
	 * \endif
	 */
	public byte                 bHint;
	
	/**
	 * \if ENGLISH_LANG
	 * 0-main stream record 1-sub1 stream record 2-sub2 stream record 3-sub3 stream record
	 * \else
	 * 0-������¼�� 1-����1��¼�� 2-������2 3-������3¼��
	 * \endif
	 */
	public byte                 bRecType;
}
