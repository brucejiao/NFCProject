package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * INetSDK.ControlDevice(SDK_CTRL_DISK_SUBAREA)
 * \else
 * INetSDK.ControlDevice(SDK_CTRL_DISK_SUBAREA)
 * \endif
 */
public class DISKCTRL_SUBAREA implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The number of pre-partition
	 * \else
	 * Ԥ�����ĸ���
	 * \endif
	 */
	public byte	bSubareaNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Subscript of array stDisks of informaiton structure DH_HARDDISK_STATE. It begins from 0. 
	 * \else
	 * ΪӲ����Ϣ�ṹ��DH_HARDDISK_STATE�������stDisks�±꣬��0��ʼ
	 * \endif
	 */
	public byte	bIndex;
	
	/**
	 * \if ENGLISH_LANG
	 * partition Size(Percentage)
	 * \else
	 * ������С���ٷֱȣ�
	 * \endif
	 */
	public byte	bSubareaSize[] = new byte[32];
}
