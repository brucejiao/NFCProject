package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * burning device callback function original
 * \else
 * ��¼�豸�ص�����ԭ��, lAttachHandle
 * \endif
 */

public interface CB_fAttachBurnStateCB {
	public void invoke(long lLoginID, long lAttachHandle, long lBurnSession, NET_OUT_BURN_GET_STATE burnState);
}