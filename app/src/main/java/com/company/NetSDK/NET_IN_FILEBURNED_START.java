package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * CLIENT_StartUploadFileBurned()input param
 * \else
 * StartUploadFileBurned()�������
 * \endif
 */
public class NET_IN_FILEBURNED_START implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * type of upload,"append", append mode " FILE.zip ",filename be ignored
	 * \else
	 * �ļ��ϴ���ʽ"append",׷��ģʽ,��ʱ��¼�ļ����̶�Ϊ" FILE.zip ",filename������
	 * \endif
	 */
	public String         		szMode;                         
	/**
	 * \if ENGLISH_LANG
	 * device name,example "/dev/sda"
	 * \else
	 * �������ƣ��硰/dev/sda��
	 * \endif
	 */
	public String         		szDeviceName;                   
	/**
	 * \if ENGLISH_LANG
	 * local file name
	 * \else
	 * �����ļ�����
	 * \endif
	 */
	public String         		szFilename;                     
	/**
	 * \if ENGLISH_LANG
	 * burn progress callback function
	 * \else
	 * ��¼���Ȼص�
	 * \endif
	 */
	public CB_fBurnFileCallBack   cbBurnPos;                      
}
