package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * The callback function prototypes of subscribe to video phone
 * \else
 * ������Ƶ�绰״̬��Ϣ�ص�����ԭ��
 * \endif
 */
public interface CB_fVTPCallStateCallBack {
	public void invoke(long lAttachHandle, NET_VTP_CALL_STATE_INFO pInfo);
}
