package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * SDK_FILE_QUERY_FACE_DETECTIONcorresponding face recognition service FINDNEXT search return parameter
 * \else
 * SDK_FILE_QUERY_FACE_DETECTION��Ӧ������ʶ�����FINDNEXT��ѯ���ز���
 * \endif
 */
public class MEDIAFILE_FACE_DETECTION_INFO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * channel no.
	 * \else
	 * ͨ����
	 * \endif
	 */
	public int        ch;

	/**
	 * \if ENGLISH_LANG
	 * file path
	 * \else
	 * �ļ�·��
	 * \endif
	 */
	public byte                szFilePath[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * file length
	 * \else
	 * �ļ�����
	 * \endif
	 */
	public int        size;

	/**
	 * \if ENGLISH_LANG
	 * start time
	 * \else
	 * ��ʼʱ��
	 * \endif
	 */
	public NET_TIME            starttime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 * end time
	 * \else
	 * ����ʱ��
	 * \endif
	 */
	public NET_TIME            endtime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 * working directory no.
	 * \else
	 * ����Ŀ¼���
	 * \endif
	 */
	public int        nWorkDirSN;

	/**
	 * \if ENGLISH_LANG
	 * file type  1��jpg picture
	 * \else
	 * �ļ�����  1��jpgͼƬ
	 * \endif
	 */
	public byte                nFileType;

	/**
	 * \if ENGLISH_LANG
	 * file positioning index
	 * \else
	 * �ļ���λ����
	 * \endif
	 */
	public byte                bHint;

	/**
	 * \if ENGLISH_LANG
	 * disk no.
	 * \else
	 * ���̺�
	 * \endif
	 */
	public byte                bDriveNo;

	/**
	 * \if ENGLISH_LANG
	 * picture type, 0-normal, 1-combined, 2-cut
	 * \else
	 * ͼƬ����, 0-��ͨ, 1-�ϳ�, 2-��ͼ
	 * \endif
	 */
	public byte                byPictureType;

	/**
	 * \if ENGLISH_LANG
	 * cluster no.
	 * \else
	 * �غ�
	 * \endif
	 */
	public int        nCluster;

	/**
	 * \if ENGLISH_LANG
	 * picture type��see EM_FACE_PIC_TYPE
	 * \else
	 * ͼƬ���ͣ����EM_FACE_PIC_TYPE
	 * \endif
	 */
	public int     emPicType;

	/**
	 * \if ENGLISH_LANG
	 * object ID
	 * \else
	 * ����ID
	 * \endif
	 */
	public int               dwObjectId;

	/**
	 * \if ENGLISH_LANG
	 * frame no.,group has two elements��one means small picture��two means large picture
	 * \else
	 * ֡���,������2��Ԫ��ʱ����һ����ʾСͼ���ڶ�����ʾ��ͼ
	 * \endif
	 */
	public int               dwFrameSequence[] = new int[FinalVar.NET_MAX_FRAMESEQUENCE_NUM];

	/**
	 * \if ENGLISH_LANG
	 * frame no.quantity
	 * \else
	 * ֡��Ÿ���
	 * \endif
	 */
	public int                 nFrameSequenceNum;

	/**
	 * \if ENGLISH_LANG
	 * time��group has two elements��one means small picture��two means large picture
	 * \else
	 * ����ʱ�䣬������2��Ԫ��ʱ����һ����ʾСͼ���ڶ�����ʾ��ͼ
	 * \endif
	 */
	public NET_TIME_EX         stTimes[] = new NET_TIME_EX[FinalVar.NET_MAX_TIMESTAMP_NUM];
	
	public int                 nTimeStampNum;

	/**
	 * \if ENGLISH_LANG
	 * Picture number in the cluster
	 * For packaged multiple images in the same cluster,provides indexed mode to position pictures
	 * \else
	 * ��ʾ�ڴ��е�ͼƬ���
	 * ����ͬһ�����д������ͼƬ,�ṩ������ʽ��λͼƬ
	 * \endif
	 */
	public int                 nPicIndex;
	
	public MEDIAFILE_FACE_DETECTION_INFO() {
		for (int i = 0; i < FinalVar.NET_MAX_TIMESTAMP_NUM; i++) {
			stTimes[i] = new NET_TIME_EX();
		}
	}
}
