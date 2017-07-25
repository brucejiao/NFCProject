package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Real-time monitor data callback function original shape
 * \else
 * ʵʱ�������ݻص�
 * \endif
 */
public interface CB_fRealDataCallBack {
	/**
	 * \if ENGLISH_LANG
	 * Real-time monitor data callback function original shape
	 * @param lRealHandle handle, return from {@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}
	 * @param dwDataType label recalled data type��onceset recall��The following 4 kinds of data are also callback, users may need to have the option of processing data 
	 * <table>
	 * <tr><td>dwDataType</td><td>pBuffer data type </td></tr>
	 * <tr><td>0</td><td>original data(identical with SaveRealData saved data)</td></tr>
	 * <tr><td>1</td><td>frame data</td></tr>
	 * <tr><td>2</td><td>frame data </td></tr>
	 * <tr><td>3</td><td>pcm audio data</td></tr>
	 * </table>
	 * @param pBuffer recal data��According to the data of different types each callback different length data, in addition to type 0, other data types are in the frame, each callback data of a frame 
	 * @param dwBufSize recall data length(unit byte)
	 * \else
	 * ʵʱ�������ݻص�����
	 * @param lRealHandle ��¼���, {@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}�ķ���ֵ
	 * @param dwDataType �ص���������������
	 * <table>
	 * <tr><td>dwDataType</td><td>pBuffer�������� </td></tr>
	 * <tr><td>0</td><td>ԭʼ����(��SaveRealData���������һ��) </td></tr>
	 * <tr><td>1</td><td>֡���� </td></tr>
	 * <tr><td>2</td><td>yuv���� </td></tr>
	 * <tr><td>3</td><td>pcm��Ƶ���� </td></tr>
	 * </table>
	 * @param pBuffer �ص����ݣ������������͵Ĳ�ͬÿ�λص���ͬ�ĳ��ȵ����ݣ�������0�������������Ͷ��ǰ�֡��ÿ�λص�һ֡���� 
	 * @param dwBufSize �ص����ݵĳ���(��λ�ֽ�) 
	 * \endif
	 */
	public void invoke(long lRealHandle, int dwDataType, byte[] pBuffer, int dwBufSize);
}
