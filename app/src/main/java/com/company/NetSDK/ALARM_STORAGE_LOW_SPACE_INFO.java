package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of storage low space
 * \else
 * �洢���������¼�
 * \endif
 */
public class ALARM_STORAGE_LOW_SPACE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * 0:start 2:stop
	 * \else
	 * 0:��ʼ 1:ֹͣ
	 * \endif
	 */
	public int                 nAction;
	
 	/**
	 * \if ENGLISH_LANG
	 * name
	 * \else
	 * �¼�����
	 * \endif
	 */
	public byte                szName[] = new byte[FinalVar.SDK_EVENT_NAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * device name
	 * \else
	 * �洢�豸����
	 * \endif
	 */
	public byte                szDevice[] = new byte[FinalVar.SDK_STORAGE_NAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * group name 
	 * \else
	 * �洢������
	 * \endif
	 */
	public byte                szGroup[] = new byte[FinalVar.SDK_STORAGE_NAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * total space byte
	 * \else
	 * ������, byte
	 * \endif
	 */
	public long               nTotalSpace;
	
 	/**
	 * \if ENGLISH_LANG
	 * free space byte
	 * \else
	 * ʣ������, byte
	 * \endif
	 */
	public long               nFreeSpace;
	
 	/**
	 * \if ENGLISH_LANG
	 * used percent
	 * \else
	 * �Ѿ�ʹ�õİٷֱ�
	 * \endif
	 */
	public int                 nPercent;
}
