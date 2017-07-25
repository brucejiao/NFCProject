package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The first recording time
 * \else
 * ����¼��ʱ��
 * \endif
 */
public class NET_FURTHEST_RECORD_TIME implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel amount
	 * \else
	 * ͨ����Ŀ
	 * \endif
	 */
	public int					nChnCount;
	
	/**
	 * \if ENGLISH_LANG
	 * The first recording time, valid value is 0 to (nChnCount-1).If there is no video, the first recording time is 0.
	 * \else
	 * ����¼��ʱ��,��ЧֵΪǰ��0 �� (nChnCount-1)��.���ĳͨ��û��¼��Ļ�������¼��ʱ��ȫΪ0
	 * \endif
	 */
	public NET_TIME			stuFurthestTime[] = new NET_TIME[16];
	
	/**
	 * \if ENGLISH_LANG
	 * when channel >16,use this field.means pStuFurthestTimeAll memory size.
	 * \else
	 * ��ͨ����������16ʱ��ʹ�á���ʾ����pStuFurthestTimeAll����ڴ��С��
	 * \endif
	 */
	public int					dwFurthestTimeAllSize;
	
	/**
	 * \if ENGLISH_LANG
	 * when channel >16,use this field.need user apply, memory size(nChnCount*sizeof(NET_TIME)).
	 * \else
	 * ��ͨ����������16ʱ��ʹ�á��˲����ڴ���Ҫ�û�����,�����СΪ(ͨ������*sizeof(NET_TIME))��
	 * \endif
	 */
	public NET_TIME			pStuFurthestTimeAll[];
	
	/**
	 * \if ENGLISH_LANG
	 * Reserved words
	 * \else
	 * �����ֶ�
	 * \endif
	 */
	public byte				bReserved[] = new byte[376];			 
	
	public NET_FURTHEST_RECORD_TIME(int nMaxChnNum)
	{
		nChnCount = nMaxChnNum; 
		for (int i = 0; i < 16; i++)
		{
			stuFurthestTime[i] = new NET_TIME();
		}
		
		pStuFurthestTimeAll = new NET_TIME[nChnCount];
		for (int j = 0; j < nChnCount; j++)
		{
			pStuFurthestTimeAll[j] = new NET_TIME();
		}
	}
}
