package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Event file info
 * \else
 * �¼���Ӧ�ļ���Ϣ
 * \endif
 */
public class SDK_EVENT_FILE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The file count in the current file's group
	 * \else
	 * ��ǰ�ļ������ļ����е��ļ�����
	 * \endif
	 */
	public byte               	bCount;
	
	/**
	 * \if ENGLISH_LANG
	 * The index of the file in the group
	 * \else
	 * ��ǰ�ļ����ļ����е��ļ����(���1��ʼ)
	 * \endif
	 */
	public byte               	bIndex;
	
	/**
	 * \if ENGLISH_LANG
	 * File tag, see the enum struct EM_EVENT_FILETAG
	 * \else
	 * �ļ���ǩ������˵����ö������EM_EVENT_FILETAG
	 * \endif
	 */
	public byte               	bFileTag;
	
	/**
	 * \if ENGLISH_LANG
	 * File type,0-normal 1-compose 2-cut picture
	 * \else
	 * �ļ����ͣ�0-��ͨ 1-�ϳ� 2-��ͼ
	 * \endif
	 */
	public byte               	bFileType;
	
	/**
	 * \if ENGLISH_LANG
	 * File time
	 * \else
	 * �ļ�ʱ��
	 * \endif
	 */
	public NET_TIME_EX        	stuFileTime = new NET_TIME_EX();
	
	/**
	 * \if ENGLISH_LANG
	 * The only id of one group file
	 * \else
	 * ͬһ��ץ���ļ���Ψһ��ʶ
	 * \endif
	 */
	public int              	nGroupId;
}
