package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * tour status call function origin, lAttachHandle is AttachSplitTour return value
 * \else
 * ��Ѳ״̬�ص�����ԭ��, lAttachHandle�� AttachSplitTour�ķ���ֵ
 * \endif
 */
public interface CB_fTourStatusCallBack{
	public void invoke(long lLoginID, long lAttachHandle, NET_SPLIT_TOUR_STATUS_INFO pstStatus);
}
