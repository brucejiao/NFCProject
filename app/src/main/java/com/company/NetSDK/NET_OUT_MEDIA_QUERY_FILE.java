package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Record info, corresponde to CLIENT_FindFileEx, search result
 * \else
 * ¼����Ϣ��Ӧ FindFileEx�ӿڵ� SDK_FILE_QUERY_FILE ���� ��ѯ���
 * \endif
 */
public class NET_OUT_MEDIA_QUERY_FILE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel ID,from 0,-1 means search all
	 * \else
	 * ͨ���Ŵ�0��ʼ��-1��ʾ��ѯ����ͨ��
	 * \endif
	 */
	public int					nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * Start time
	 * \else
	 * ��ʼʱ��
	 * \endif
	 */
    public NET_TIME			stuStartTime = new NET_TIME();
    
	/**
	 * \if ENGLISH_LANG
	 * End time
	 * \else
	 * ����ʱ��
	 * \endif
	 */
    public NET_TIME			stuEndTime = new NET_TIME();
    
	/**
	 * \if ENGLISH_LANG
	 * Size of file
	 * \else
	 * �ļ�����
	 * \endif
	 */
    public int					nFileSize;
    
	/**
	 * \if ENGLISH_LANG
	 * File type 1:jpg, 2: dav
	 * \else
	 * �ļ����� 1:jpgͼƬ, 2: dav
	 * \endif
	 */
    public byte				byFileType;
    
	/**
	 * \if ENGLISH_LANG
	 * Drive no.
	 * \else
	 * ���̺�
	 * \endif
	 */
    public byte                byDriveNo;
    
	/**
	 * \if ENGLISH_LANG
	 * Cluster
	 * \else
	 * �غ�
	 * \endif
	 */
    public int      			nCluster;
    
	/**
	 * \if ENGLISH_LANG
	 * Path of file
	 * \else
	 * �ļ�·��
	 * \endif
	 */
    public char				szFilePath[] = new char[FinalVar.MAX_PATH];
}
