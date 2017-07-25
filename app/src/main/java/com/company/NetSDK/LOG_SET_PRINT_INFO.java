package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * SDK global log print
 * \else
 * SDKȫ����־��ӡ��Ϣ
 * \endif
 */
public class LOG_SET_PRINT_INFO implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * reset log path
	 * \else
	 * �Ƿ�������־·��
	 * \endif
	 */
	public boolean            bSetFilePath;

	/**
	 * \if ENGLISH_LANG
	 * log path(default"./sdk_log/sdk_log.log")
	 * \else
	 * ��־·��(Ĭ��"./sdk_log/sdk_log.log")
	 * \endif
	 */
	public byte            szLogFilePath[] = new byte[FinalVar.MAX_LOG_PATH_LEN];

	/**
	 * \if ENGLISH_LANG
	 * reset log size
	 * \else
	 * �Ƿ�������־�ļ���С
	 * \endif
	 */
	public boolean            bSetFileSize;

	/**
	 * \if ENGLISH_LANG
	 * each log file size(default size 10240), unit:bit
	 * \else
	 * ÿ����־�ļ��Ĵ�С(Ĭ�ϴ�С10240), ��λ:����
	 * \endif
	 */
	public int    nFileSize;

	/**
	 * \if ENGLISH_LANG
	 * reset log file number
	 * \else
	 * �Ƿ�������־�ļ�����
	 * \endif
	 */
	public boolean            bSetFileNum;

	/**
	 * \if ENGLISH_LANG
	 * log file quantity(default size 10)
	 * \else
	 * �ƽ���־�ļ�����(Ĭ�ϴ�С10)
	 * \endif
	 */
	public int    nFileNum;

	/**
	 * \if ENGLISH_LANG
	 * reset log print strategy
	 * \else
	 * �Ƿ�������־��ӡ�������
	 * \endif
	 */
	public boolean            bSetPrintStrategy;

	/**
	 * \if ENGLISH_LANG
	 * log out strategy, 0: output to file(defualt); 1:output to window
	 * \else
	 * ��־�������, 0:������ļ�(Ĭ��); 1:���������
	 * \endif
	 */
	public int    nPrintStrategy;
}
