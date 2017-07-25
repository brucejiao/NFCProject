package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * INetSDK.ControlDevice(SDK_BACKUP_START)
 * \else
 * INetSDK.ControlDevice(SDK_BACKUP_START)
 * \endif
 */
public class BACKUP_RECORD implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * name
	 * \else
	 * �����豸����
	 * \endif
	 */
	public byte				szDeviceName[] = new byte[FinalVar.SDK_MAX_BACKUP_NAME];
	
	/**
	 * \if ENGLISH_LANG
	 * number of records
	 * \else
	 * ���ݼ�¼����
	 * \endif
	 */
	public int				nRecordNum;
	
	/**
	 * \if ENGLISH_LANG
	 * record information
	 * \else
	 * ���ݼ�¼��Ϣ
	 * \endif
	 */
	public NET_RECORDFILE_INFO stuRecordInfo[] = new NET_RECORDFILE_INFO[FinalVar.SDK_MAX_BACKUPRECORD_NUM];
	
	public BACKUP_RECORD() {
		for (int i = 0; i < FinalVar.SDK_MAX_BACKUPRECORD_NUM; i++) {
			stuRecordInfo[i] = new NET_RECORDFILE_INFO();
		}
	}
}
