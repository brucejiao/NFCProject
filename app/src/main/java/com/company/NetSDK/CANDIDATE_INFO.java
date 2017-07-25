package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * cadidate person info
 * \else
 * ��ѡ��Ա��Ϣ
 * \endif
 */
public class CANDIDATE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * person info
	 * \else
	 * ��Ա��Ϣ
	 * \endif
	 */
	public FACERECOGNITION_PERSON_INFO  stPersonInfo = new FACERECOGNITION_PERSON_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * similarity
	 * \else
	 * �Ͳ�ѯͼƬ�����ƶ�,�ٷֱȱ�ʾ��1~100
	 * \endif
	 */
	public byte                         bySimilarity;
	
	/**
	 * \if ENGLISH_LANG
	 * Range officer's database, see EM_FACE_DB_TYPE
	 * \else
	 * ��Ա�������ݿⷶΧ�����EM_FACE_DB_TYPE
	 * \endif
	 */
	public byte                         byRange;
	
	/**
	 * \if ENGLISH_LANG
	 * When byRange historical database effectively, which means that the query time staff appeared
	 * \else
	 * ��byRangeΪ��ʷ���ݿ�ʱ��Ч����ʾ��ѯ��Ա���ֵ�ʱ��
	 * \endif
	 */
	public NET_TIME                     stTime = new NET_TIME(); 
	
	/**
	 * \if ENGLISH_LANG
	 * When byRange historical database effectively, which means that people place a query appears
	 * \else
	 * ��byRangeΪ��ʷ���ݿ�ʱ��Ч����ʾ��ѯ��Ա���ֵĵص�
	 * \endif
	 */
	public byte                         szAddress[] = new byte[FinalVar.MAX_PATH];
}
