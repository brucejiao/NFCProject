package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Audio data of audio talk callback function original shape 
 * \else
 * ���������ص�
 * \endif
 */
public interface CB_pfAudioDataCallBack {
	/**
	 * \if ENGLISH_LANG
	 * Audio data of audio talk callback function original shape
	 * @param lTalkHandle handle, return from{@link com.company.NetSDK.INetSDK#StartTalkEx() StartTalkEx}
	 * @param pDataBuf Recalled audio data length(unit:byte) 
	 * @param byAudioFlag Audio data home sign, 0:means audio data collected by local audio recording list;
	 * 1:means received audio data sent by devie
	 * \else
	 * ���������ص�����
	 * @param lTalkHandle {@link com.company.NetSDK.INetSDK#StartTalkEx() StartTalkEx}�ķ���ֵ
	 * @param pDataBuf �ص���������Ƶ���ݵ����� 
	 * @param byAudioFlag ��Ƶ���ݹ�����־,0:��ʾ�Ǳ���¼����ɼ�����Ƶ����;1:��ʾ�յ����豸����������Ƶ����
	 * \endif
	 */
	public void invoke(long lTalkHandle, byte pDataBuf[], byte byAudioFlag);
}
