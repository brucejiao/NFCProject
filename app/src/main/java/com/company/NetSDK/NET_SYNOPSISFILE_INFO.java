package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Info of enrichment record file 
 * \else
 * Ũ��¼���ļ���Ϣ
 * \endif
 */
public class NET_SYNOPSISFILE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * File name
	 * \else
	 * �ļ���  
	 * \endif
	 */
	public byte				szFileName[] = new byte[FinalVar.MAX_PATH];
	
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
	 * Server mark,with szFileName[] a choise
	 * \else
	 * �ڷ�������ı�ʾ�����ļ���2ѡ1ʹ��
	 * \endif
	 */
	public int					nTaskID;
	
	/**
	 * \if ENGLISH_LANG
	 * 1-record file, 2- source file
	 * \else
	 * 1-��ƵŨ��¼���ļ���2-��ƵŨ��Դ�ļ�
	 * \endif
	 */
	public byte				bFileType;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ����ģʽ: 0-���ļ�����, 1-��ʱ������, 2-���ļ�ƫ������
	 * \endif
	 */
	public byte				byMode;
	
	/**
	 * \if ENGLISH_LANG
	 * file length (byte)
	 * \else
	 * �ļ���С����λ:KB
	 * \endif
	 */
	public int					nFileLength;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ��ʼ�ļ�ƫ��, ��λ: KB
	 * \endif
	 */
	public int					nStartFileOffset;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * �����ļ�ƫ��, ��λ: KB
	 * \endif
	 */
	public int					nEndFileOffset;			 
}
