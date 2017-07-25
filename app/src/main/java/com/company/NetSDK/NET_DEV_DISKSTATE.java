package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * HDD informaiton 
 * \else
 * Ӳ����Ϣ
 * \endif
 */
public class NET_DEV_DISKSTATE implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * HDD capacity 
	 * \else
	 * Ӳ�̵�����, ��λMB(B��ʾ�ֽ�)
	 * \endif
	 */
	public int					dwVolume;
	
	/**
	 * \if ENGLISH_LANG
	 * HDD free space
	 * \else
	 * Ӳ�̵�ʣ��ռ�, ��λMB(B��ʾ�ֽ�)
	 * \endif
	 */
	public int					dwFreeSpace;
	
	/**
	 * \if ENGLISH_LANG
	 * Higher 4 byte instruct hdd type, see the enum struct EM_DISK_TYPE; lower four byte instruct HDD status,0-hiberation,1-active,2-malfucntion and etc.;Devide DWORD into four BYTE
	 * \else
	 * ����λ��ֵ��ʾӲ�����ͣ������ö������EM_DISK_TYPE������λ��ֵ��ʾӲ�̵�״̬��0-����,1-�,2-���ϵȣ���DWORD����ĸ�BYTE
	 * \endif
	 */
	public byte					dwStatus;
	
	/**
	 * \if ENGLISH_LANG
	 * HDD number
	 * \else
	 * Ӳ�̺�
	 * \endif
	 */
	public byte					bDiskNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Subarea number
	 * \else
	 * ������
	 * \endif
	 */
	public byte					bSubareaNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Symbol. 0:local. 1:remote
	 * \else
	 * ��ʶ��0Ϊ���� 1ΪԶ��
	 * \endif
	 */
	public byte					bSignal;
}
