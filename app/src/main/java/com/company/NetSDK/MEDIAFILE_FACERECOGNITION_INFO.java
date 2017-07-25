package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * corresponding facial recognition service SDK_FILE_QUERY_FACE FINDNEXT search returned parameter
 * \else
 * SDK_FILE_QUERY_FACE��Ӧ������ʶ�����FINDNEXT��ѯ���ز���
 * \endif
 */
public class MEDIAFILE_FACERECOGNITION_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The existence panorama
	 * \else
	 * ȫ��ͼ�Ƿ����
	 * \endif
	 */
	public boolean                    bGlobalScenePic;

	/**
	 * \if ENGLISH_LANG
	 * Panoramic image file path
	 * \else
	 * ȫ��ͼƬ�ļ�·��
	 * \endif
	 */
	public SDK_PIC_INFO_EX          stGlobalScenePic = new SDK_PIC_INFO_EX();

	/**
	 * \if ENGLISH_LANG
	 * the target face object information
	 * \else
	 * Ŀ������������Ϣ
	 * \endif
	 */
	public SDK_MSG_OBJECT           stuObject = new SDK_MSG_OBJECT();

	/**
	 * \if ENGLISH_LANG
	 * the target face file path
	 * \else
	 * Ŀ�������ļ�·��
	 * \endif
	 */
	public SDK_PIC_INFO_EX          stObjectPic = new SDK_PIC_INFO_EX();

	/**
	 * \if ENGLISH_LANG
	 * Face Matching the current number of candidates
	 * \else
	 * ��ǰ����ƥ�䵽�ĺ�ѡ��������
	 * \endif
	 */
	public int                     nCandidateNum;

	/**
	 * \if ENGLISH_LANG
	 * Face candidates to match this informatio
	 * \else
	 * ��ǰ����ƥ�䵽�ĺ�ѡ������Ϣ
	 * \endif
	 */
	public CANDIDATE_INFO          stuCandidates[] = new CANDIDATE_INFO[FinalVar.SDK_MAX_CANDIDATE_NUM];

	/**
	 * \if ENGLISH_LANG
	 * The current face matching candidates to the image file path
	 * \else
	 * ��ǰ����ƥ�䵽�ĺ�ѡ����ͼƬ�ļ�·��
	 * \endif
	 */
	public NET_CANDIDAT_PIC_PATHS  stuCandidatesPic[] = new NET_CANDIDAT_PIC_PATHS[FinalVar.SDK_MAX_CANDIDATE_NUM];

	/**
	 * \if ENGLISH_LANG
	 * time for an alarm
	 * \else
	 * ��������ʱ��
	 * \endif
	 */
	public NET_TIME                stTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * Place for an alarm
	 * \else
	 * ���������ص�
	 * \endif
	 */
	public byte                    szAddress[] = new byte[FinalVar.MAX_PATH];

	/**
	 * \if ENGLISH_LANG
	 * channel no.
	 * \else
	 * ͨ����
	 * \endif
	 */
	public int                     nChannelId;
	
	public MEDIAFILE_FACERECOGNITION_INFO() {
		for (int i = 0; i < FinalVar.SDK_MAX_CANDIDATE_NUM; i++) {
			stuCandidates[i] = new CANDIDATE_INFO();
			stuCandidatesPic[i] = new NET_CANDIDAT_PIC_PATHS();
		}
	}
}
