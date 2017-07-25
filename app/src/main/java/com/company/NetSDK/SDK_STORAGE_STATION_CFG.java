package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Storage position set structure.  Each channel set separately.Each channel can set several storage types including local,portableand remote storage.
 * \else
 * �洢λ�����ýṹ�壬ÿͨ����������,ÿͨ������ѡ����ִ洢����, Ŀǰ��������, ���ƶ�, Զ�̴洢.
 * \endif
 */
public class SDK_STORAGE_STATION_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Local storage mask. Use bit to represent.
	 * The first bit:system pre-record. The second bit:scheduled record. The third bit:motion detection record.
	 * The fourth bit:alarm record. The fifth bit:card record. The sixth bit:manual record.
	 * \else
	 * ���ش洢���룻��λ��ʾ��
	 * ��һλ��ϵͳԤ¼���ڶ�λ����ʱ¼�񣬵���λ������¼��
	 * ����λ������¼�񣬵���λ������¼�񣬵���λ���ֶ�¼��
	 * \endif
	 */
	public int               dwLocalMask;

	/**
	 * \if ENGLISH_LANG
	 * Moving storage mask. Storage mask such as local storage mask.
	 * \else
	 * ���ƶ��洢���� �洢�����籾�ش洢����
	 * \endif
	 */
	public int               dwMobileMask;

	/**
	 * \if ENGLISH_LANG
	 * Remote storage type 0: Ftp  1: Smb
	 * \else
	 * Զ�̴洢���� 0: Ftp  1: Smb
	 * \endif
	 */
	public int                 RemoteType;

	/**
	 * \if ENGLISH_LANG
	 * Remote storage mask.  Storage mask such as local storage mask.
	 * \else
	 * Զ�̴洢���� �洢�����籾�ش洢����
	 * \endif
	 */
	public int               dwRemoteMask;

	/**
	 * \if ENGLISH_LANG
	 * Local storage mask when remote is abnormal
	 * \else
	 * Զ���쳣ʱ���ش洢����
	 * \endif
	 */
	public int               dwRemoteSecondSelLocal;

	/**
	 * \if ENGLISH_LANG
	 * Moving storage mask when remote is abnormal.
	 * \else
	 * Զ���쳣ʱ���ƶ��洢����
	 * \endif
	 */
	public int               dwRemoteSecondSelMobile;
	
	/**
	 * \if ENGLISH_LANG
	 * Remote path. Its length is 240
	 * \else
	 * Զ��Ŀ¼, ���г���Ϊ240
	 * \endif
	 */
	public byte                SubRemotePath[] = new byte[FinalVar.MAX_PATH_STOR];

	/**
	 * \if ENGLISH_LANG
	 * Function shield bit. Use bit to represent bit0 = 1:Shield sanpshot event activate storage position function.
	 * \else
	 * ��������λ����λ��ʾ��bit0 = 1:����ץͼ�¼������洢λ�ù���
	 * \endif
	 */
	public int               dwFunctionMask;

	/**
	 * \if ENGLISH_LANG
	 * If synchronous mask; after remote storage network recovery, the local storage data will automatically synchronized to the remote storage.
	 * \else
	 * �Ƿ�ͬ������;Զ�̴洢������ϻָ����Զ������ش洢������ͬ����Զ�̴洢��
	 * \endif
	 */
	public int               dwAutoSyncMask;

	/**
	 * \if ENGLISH_LANG
	 * the time for synchronous from the network synchronous time. In hour. 0:all data  1:data in one hour n:data in n hours
	 * \else
	 * ������ָ���ʱ�̿�ʼ����Ҫ��ǰͬ��������ʱ�䷶Χ��СʱΪ��λ��0:ͬ����������  1:1Сʱ�ڵ����� n:nСʱ�ڵ�����
	 * \endif
	 */
	public byte                bAutoSyncRange;
}
