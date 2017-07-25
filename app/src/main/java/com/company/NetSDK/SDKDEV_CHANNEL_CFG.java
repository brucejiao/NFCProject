package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The image channel properties structure
 * \else
 * ͼ��ͨ�����Խṹ��
 * \endif
 */
public class SDKDEV_CHANNEL_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * \if ENGLISH_LANG
	 * Noise and threshold,judicial burning equipment 
	 * \else
	 * �����ķ�ֵ,˾����¼�豸ʹ��
	 * \endif
	 */
	public byte				bNoise;
	
	/**
	 * \if ENGLISH_LANG
	 * (Mobile special demand)Mode 1(Image priority) mode 2(smooth priority) mode 3(custom) 
	 * \else
	 * (������������)ģʽһ(��������):¼��ֱ��ʲ���4·D1.֡��2fps.����128kbps(ÿСʱ225MB)
	 * ģʽ��(��������):¼��ֱ��ʲ���4·CIF.֡��12fps.����256kbps(ÿСʱ550MB)
	 * ģʽ��(�Զ���)¼��ֱ��ʿ������û��Զ���.�޶��������Ϊ4CIF/25fps
	 * \endif
	 */
	public byte				bMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel name 
	 * \else
	 * ͨ������
	 * \endif
	 */
	public byte				szChannelName[] = new byte[FinalVar.SDK_CHAN_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Main stream 
	 * \else
	 * ������
	 * \endif
	 */
	public SDK_VIDEOENC_OPT		stMainVideoEncOpt[] = new SDK_VIDEOENC_OPT[REC_TYPE.SDK_REC_TYPE_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Extra Stream 
	 * \else
	 * ������
	 * \endif
	 */
	public SDK_VIDEOENC_OPT		stAssiVideoEncOpt[] = new SDK_VIDEOENC_OPT[FinalVar.SDK_N_ENCODE_AUX];
	
	/**
	 * \if ENGLISH_LANG
	 * Image color properties 
	 * \else
	 * ͼ����ɫ����
	 * \endif
	 */
	public SDK_COLOR_CFG		stColorCfg[] = new SDK_COLOR_CFG[FinalVar.SDK_N_COL_TSECT];
	
	/**
	 * \if ENGLISH_LANG
	 * Time overplay properties 
	 * \else
	 * ʱ���������
	 * \endif
	 */
	public SDK_ENCODE_WIDGET	stTimeOSD = new SDK_ENCODE_WIDGET();
	
	/**
	 * \if ENGLISH_LANG
	 * Channel name overplay properties 
	 * \else
	 * ͨ������������ 
	 * \endif
	 */
	public SDK_ENCODE_WIDGET	stChannelOSD = new SDK_ENCODE_WIDGET();
	
	/**
	 * \if ENGLISH_LANG
	 * Occluded regions overplay Properties 
	 * \else
	 * �ڵ������������
	 * \endif
	 */
	public SDK_ENCODE_WIDGET	stBlindCover[] = new SDK_ENCODE_WIDGET[FinalVar.SDK_N_COVERS];
	
	/**
	 * \if ENGLISH_LANG
	 * The area covered switch;As follows \n
	 * 0x00:Not cover.0x01:Only cover equipment local Preview.
	 * 0x10:Only cover the video and network preview.0x11:All are covered
	 * \else
	 * �����ڸǿ���;0x00:��ʹ���ڸ�.0x01:���ڸ��豸����Ԥ��.0x10:���ڸ�¼������Ԥ��.0x11:���ڸ�
	 * \endif
	 */
	public byte				byBlindEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Area covered mask,Section A: Equipment local preview, second place: video (and network preview). 
	 * \else
	 *  �����ڸ�����;��һλ:�豸����Ԥ��;�ڶ�λ:¼��(������Ԥ��)
	 * \endif
	 */
	public byte				byBlindMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Volume threshold (adjustable from 0 to 100) 
	 * \else
	 * ������ֵ(0~100�ɵ�)
	 * \endif
	 */
	public byte				bVolume;
	
	/**
	 * \if ENGLISH_LANG
	 * Volume threshold enable 
	 * \else
	 * ������ֵʹ��
	 * \endif
	 */
	public byte				bVolumeEnable;

	public SDKDEV_CHANNEL_CFG() {
		for (int i = 0; i < REC_TYPE.SDK_REC_TYPE_NUM; i++) {
			stMainVideoEncOpt[i] = new SDK_VIDEOENC_OPT();
		}
		
		for (int i = 0; i < FinalVar.SDK_N_ENCODE_AUX; i++) {
			stAssiVideoEncOpt[i] = new SDK_VIDEOENC_OPT();
		}
		
		for (int i = 0; i < FinalVar.SDK_N_COL_TSECT; i++) {
			stColorCfg[i] = new SDK_COLOR_CFG();
		}
		
		for (int i = 0; i < FinalVar.SDK_N_COVERS; i++) {
			stBlindCover[i] = new SDK_ENCODE_WIDGET();
		}
	}
}
