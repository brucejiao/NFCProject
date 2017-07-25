package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Alarm event type depends on alarm type analyzed
 * \else
 * �����¼����͸���netsdk.h���������ı�������
 * \endif
 */
public interface CB_fALARMEvent {
	/**
	 * \if ENGLISH_LANG
	 * alarm event type depends on alarm type analyzed
	 * @param dwAlarmType alarm type 
	 * @param pAlarmInfo alarm parameter 
	 * @param dwStructSize structure size 
	 * @param pBuffer buffering
	 * @param dwBufSize buffering size 
	 * @see {@link com.company.NetSDK.INetSDK#ParseData() ParseData}  
	 * \else
	 * �����¼��ص�����
	 * @param dwAlarmType ��������
	 * @param pAlarmInfo �������� 
	 * @param dwStructSize �ṹ���С 
	 * @param pBuffer ���� 
	 * @param dwBufSize �����С
	 * @see {@link com.company.NetSDK.INetSDK#ParseData() ParseData}  
	 * \endif
	 */
	public int invoke(double dwAlarmType, Object pAlarmInfo, double dwStructSize, byte[] pBuffer, double dwBufSize);
}
