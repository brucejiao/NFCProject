package com.company.NetSDK;

import java.io.Serializable;

public class EM_DISK_TYPE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final int SDK_DISK_READ_WRITE = 0;                        // ��д������
	public static final int SDK_DISK_READ_ONLY = 1;                         // ֻ��������
	public static final int SDK_DISK_BACKUP = 2;                            // ������������ý��������
	public static final int SDK_DISK_REDUNDANT = 3;                         // ����������
	public static final int SDK_DISK_SNAPSHOT = 4;                          // ����������
}
