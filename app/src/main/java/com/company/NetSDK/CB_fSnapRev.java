package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Snapshot callback function original shape 
 * \else
 * ץͼ�ص�
 * \endif
 */
public interface CB_fSnapRev {
	/**
	 * \if ENGLISH_LANG
	 * Snapshot callback function original shape 
	 * @param lLoginID login handle,{@link com.company.NetSDK.INetSDK#LoginEx() LoginEx}or{@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pBuf data pointer 
	 * @param RevLen data length(unit byte)
	 * @param EncodeType image encode type��0��mpeg4 I frame 
	 * @param CmdSerial operation NO.��not used in Synchronous capture conditions 
	 * \else
	 * ץͼ�ص�
	 * @param lLoginID ��¼�����{@link com.company.NetSDK.INetSDK#LoginEx() LoginEx}or{@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pBuf ����ָ�� 
	 * @param RevLen ���ݳ���(��λ�ֽ�)
	 * @param EncodeType ͼƬ�������ͣ�0��mpeg4 I֡ 
	 * @param CmdSerial ������ˮ�ţ�ͬ��ץͼ��������ò��� 
	 * \endif
	 */
	public void invoke(long lLoginID, byte pBuf[], int RevLen, int EncodeType, int CmdSerial);
}
