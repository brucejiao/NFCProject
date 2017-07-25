package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Storage Group Channel Related Structure
 * \else
 * �洢��ͨ���������
 * \endif
 */
public class AV_CFG_StorageGroupChannel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
 	/**
	 * \if ENGLISH_LANG
	 * Max Pictures Storage in Each Channel Folder, Cover If Surpass 
	 * \else
	 * ÿ��ͨ���ļ���ͼƬ�洢����, �����͸���
	 * \endif
	 */
	public int			nMaxPictures;
	
 	/**
	 * \if ENGLISH_LANG
	 * Channel Indicated By the String In the Naming Rule, %c Corresponding Content 
	 * \else
	 * ͨ����������������ַ�����ʾ, %c��Ӧ������
	 * \endif
	 */
	public byte[]		szPath = new byte[FinalVar.AV_CFG_Max_ChannelRule];
}
