package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * alarm event type depends on dhnetsdk.h analyzed alarm type 
 * \else
 * �ص���ʽ�������ݽ�����dwDataType��ʾ���ݽ����õ�����
 * \endif
 */
public interface CB_fAnalyzerData {

	/**
	 * \if ENGLISH_LANG
	 * alarm event type depends on dhnetsdk.h analyzed alarm type 
	 * @param dwDataType parameter type 
	 * @param pDataInfo data parameter 
	 * @param dwStructSize structure size 
	 * @param pBuffer buffering 
	 * @param dwBufSize buffering size 
	 * @see {@link com.company.NetSDK.INetSDK#SetNewDevConfig() SetNewDevConfig} {@link com.company.NetSDK.INetSDK#ParseData() ParseData}  
	 * \else
	 * ¼�񱨾��¼��ص�����
	 * @param dwDataType �������� 
	 * @param pDataInfo ���ݲ���
	 * @param dwStructSize �ṹ���С 
	 * @param pBuffer ���� 
	 * @param dwBufSize �����С
	 * @see {@link com.company.NetSDK.INetSDK#SetNewDevConfig() SetNewDevConfig} {@link com.company.NetSDK.INetSDK#ParseData() ParseData}  
	 * \endif
	 */
	public int invoke(double dwDataType, Object pDataInfo, double dwStructSize, byte[] pBuffer, double dwBufSize);
}
