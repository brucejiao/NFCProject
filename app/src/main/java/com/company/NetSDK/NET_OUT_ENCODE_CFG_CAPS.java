package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * get device encode config corresponding capacity output parameter
 * \else
 * ��ȡ�豸�������ö�Ӧ�����������
 * \endif
 */
public class NET_OUT_ENCODE_CFG_CAPS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * main stream corresponding capacity
	 * \else
	 * ���������ö�Ӧ����
	 * \endif
	 */
	public NET_STREAM_CFG_CAPS stuMainFormatCaps[] = new NET_STREAM_CFG_CAPS[REC_TYPE.SDK_REC_TYPE_NUM]; 
	
	/**
	 * \if ENGLISH_LANG
	 * sub streamconfig corresponding capacity
	 * \else
	 * ���������ö�Ӧ����
	 * \endif
	 */
	public NET_STREAM_CFG_CAPS stuExtraFormatCaps[] = new NET_STREAM_CFG_CAPS[FinalVar.SDK_N_ENCODE_AUX]; 
	
	/**
	 * \if ENGLISH_LANG
	 * sub stream config corresponding capacity
	 * \else
	 * ���������ö�Ӧ����
	 * \endif
	 */
	public NET_STREAM_CFG_CAPS stuSnapFormatCaps[] = new NET_STREAM_CFG_CAPS[SNAP_TYPE.SNAP_TYP_NUM]; 
	
	public NET_OUT_ENCODE_CFG_CAPS() {
		for (int i = 0; i < REC_TYPE.SDK_REC_TYPE_NUM; i++) {
			stuMainFormatCaps[i] = new NET_STREAM_CFG_CAPS();
		}
		
		for (int i = 0; i < FinalVar.SDK_N_ENCODE_AUX; i++) {
			stuExtraFormatCaps[i] = new NET_STREAM_CFG_CAPS();
		}
		
		for (int i = 0; i < SNAP_TYPE.SNAP_TYP_NUM; i++) {
			stuSnapFormatCaps[i] = new NET_STREAM_CFG_CAPS();
		}
	}
}
