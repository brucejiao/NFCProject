package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Real-time monitor data callback function original shape---extensive
 * \else
 * ʵʱ��ػص�����ԭ��
 * \endif
 */
public interface CB_fRealDataCallBackEx {
	/**
	 * \if ENGLISH_LANG
	 * Real-time monitor data callback function original shape---extensive
	 * @param lRealHandle real time monitor ID ,return from {@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}or{@link com.company.NetSDK.INetSDK#RealPlayEx() RealPlayEx}
	 * @param dwDataType label recalled data type ��only dwFlag set labeled data will be recalled��
	 * <table>
	 * <tr><td>dwDataType</td><td>data type </td></tr>
	 * <tr><td>0</td><td>original data (identicla SaveRealData saveddata)</td></tr>
	 * <tr><td>1</td><td>frame data </td></tr>
	 * <tr><td>2</td><td>yuv data </td></tr>
	 * <tr><td>3</td><td>pcm audio data </td></tr>
	 * </table>
	 * @param pBuffer recall data ��based on different data type each time recall different length data ��except type 0��other data type all by frame��each time recall one frame data 
	 * @param dwBufSize recall data parameter structure��based on different type ��parameter structure differ
	 * @param param recall data length��based on different type ��length differ(unit byte) 
	 * \else
	 * ������߻ص�����
	 * @param lRealHandle ʵʱ����ID,{@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}����{@link com.company.NetSDK.INetSDK#RealPlayEx() RealPlayEx}����ֵ
	 * @param dwDataType �ص���������������
	 * <table>
	 * <tr><td>dwDataType</td><td>pBuffer��������</td></tr> 
	 * <tr><td>0</td><td>ԭʼ����(��SaveRealData���������һ��) </td></tr>
	 * <tr><td>1</td><td>֡���� </td></tr>
	 * <tr><td>2</td><td>yuv���� </td></tr>
	 * <tr><td>3</td><td>pcm��Ƶ���� </td></tr>
	 * </table>
	 * @param pBuffer �ص����ݣ������������͵Ĳ�ͬÿ�λص���ͬ�ĳ��ȵ����ݣ�������0�������������Ͷ��ǰ�֡��ÿ�λص�һ֡���� 
	 * @param dwBufSize �ص����ݲ����ṹ�壬���ݲ�ͬ�����ͣ������ṹҲ��һ��
	 * @param param �ص����ݵĳ��ȣ����ݲ�ͬ�����ͣ�����Ҳ��ͬ(��λ�ֽ�) 
	 * \endif
	 */
	public void invoke(long lRealHandle, int dwDataType, byte[] pBuffer, int dwBufSize, int param);
}
