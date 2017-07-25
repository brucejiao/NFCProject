package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * HDD operation
 * \else
 * Ӳ�̲���, INetSDK.ControlDevice(sdk_CTRL_DISK)
 * \endif
 */
public class DISKCTRL_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Subscript of array stDisks of information structure DH_HARDDISK_STATE. It begins from 0. 
	 * \else
	 * ΪӲ����Ϣ�ṹ��DH_HARDDISK_STATE�������stDisks�±꣬��0��ʼ
	 * \endif
	 */
	public int					nIndex;
	
	/**
	 * \if ENGLISH_LANG
	 * Operation type
	 * 0 -  clear data, 1 - set as read-write HDD , 2 -  set as read-only HDD
	 * 3 - set as redundant , 4 - restore error , 5 -set as snapshot disk  
	 * \else
	 * �������ͣ�
	 * 0 - �������, 1 - ��Ϊ��д��, 2 - ��Ϊֻ����
	 * 3 - ��Ϊ������, 4 - �ָ�����, 5 - ��Ϊ�����̣�7 - ����SD������SD��������Ч��
	 * \endif
	 */
	public 	int					ctrlType;
	
	/**
	 * \if ENGLISH_LANG
	 * diskInfo, replace nIndex
	 * \else
	 * ������Ϣ, ���ڴ���˳����ܸı䵼���±겻׼, ���������±�
	 * \endif
	 */
	public NET_DEV_DISKSTATE stuDisk = new NET_DEV_DISKSTATE();
}
