package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * person info
 * \else
 * ��Ա��Ϣ
 * \endif
 */
public class FACERECOGNITION_PERSON_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 *  name
	 * \else
	 * �������˲�������
	 * \endif
	 */
	public byte           	szPersonName[] 		= new byte[FinalVar.SDK_MAX_NAME_LEN]; 
	
	/**
	 * \if ENGLISH_LANG
	 * birth year
	 * \else
	 * �����꣬��Ϊ��ѯ����ʱ���˲�����0�����ʾ�˲�����Ч
	 * \endif
	 */
	public int				wYear; 
	
	/**
	 * \if ENGLISH_LANG
	 * birth month
	 * \else
	 * �����£���Ϊ��ѯ����ʱ���˲�����0�����ʾ�˲�����Ч
	 * \endif
	 */
	public byte				byMonth; 
	
	/**
	 * \if ENGLISH_LANG
	 * birth day
	 * \else
	 * �����գ���Ϊ��ѯ����ʱ���˲�����0�����ʾ�˲�����Ч
	 * \endif
	 */
	public byte				byDay; 
	
	/**
	 * \if ENGLISH_LANG
	 * the unicle ID for the person
	 * \else
	 * ��ԱΨһ��ʾ(���֤���룬���ţ����������)
	 * \endif
	 */
	public byte      		szID[] 				= new byte[FinalVar.SDK_MAX_PERSON_ID_LEN]; 
	
	/**
	 * \if ENGLISH_LANG
	 * importance level,1~10,the higher value the higher level
	 * \else
	 * ��Ա��Ҫ�ȼ�,1~10����ֵԽ��Խ��Ҫ����Ϊ��ѯ����ʱ���˲�����0�����ʾ�˲�����Ч
	 * \endif
	 */
	public byte          	bImportantRank; 
	
	/**
	 * \if ENGLISH_LANG
	 * sex, 0-man, 1-female
	 * \else
	 * �Ա�1-�У�2-Ů����Ϊ��ѯ����ʱ���˲�����0�����ʾ�˲�����Ч
	 * \endif
	 */
	public byte          	bySex; 
	
	/**
	 * \if ENGLISH_LANG
	 * picture number
	 * \else
	 * ͼƬ����
	 * \endif
	 */
	public int           	wFacePicNum; 
	
	/**
	 * \if ENGLISH_LANG
	 * picture info
	 * \else
	 * ��ǰ��Ա��Ӧ��ͼƬ��Ϣ
	 * \endif
	 */
	public SDK_PIC_INFO  	szFacePicInfo[] 	= new SDK_PIC_INFO[FinalVar.SDK_MAX_PERSON_IMAGE_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Personnel types, see EM_PERSON_TYPE
	 * \else
	 * ��Ա���ͣ���� EM_PERSON_TYPE
	 * \endif
	 */
	public byte          	byType; 
	
	/**
	 * \if ENGLISH_LANG
	 * Document types, see EM_CERTIFICATE_TYPE
	 * \else
	 * ֤�����ͣ���� EM_CERTIFICATE_TYPE
	 * \endif
	 */
	public byte            	byIDType; 
	
	/**
	 * \if ENGLISH_LANG
	 * province
	 * \else
	 * ʡ��
	 * \endif
	 */
	public byte         	szProvince[] 		= new byte[FinalVar.SDK_MAX_PROVINCE_NAME_LEN]; 
	
	/**
	 * \if ENGLISH_LANG
	 * city
	 * \else
	 * ����
	 * \endif
	 */
	public byte          	szCity[] 			= new byte[FinalVar.SDK_MAX_CITY_NAME_LEN]; 
	
	/**
	 * \if ENGLISH_LANG
	 * Name, the name is too long due to the presence of 16 bytes can not be Storage problems, the increase in this parameter
	 * \else
	 * ���������������������16�ֽ��޷�������⣬�����Ӵ˲�����
	 * \endif
	 */
	public byte          	szPersonNameEx[] 	= new byte[FinalVar.SDK_MAX_PERSON_NAME_LEN];
	
	public FACERECOGNITION_PERSON_INFO() {
		for (int i = 0; i < FinalVar.SDK_MAX_PERSON_IMAGE_NUM; i++) {
			szFacePicInfo[i] = new SDK_PIC_INFO();
		}
	}
}
