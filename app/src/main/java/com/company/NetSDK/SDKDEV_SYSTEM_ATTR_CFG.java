package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * System information
 * \else
 * ϵͳ��Ϣ
 * \endif
 */
public class SDKDEV_SYSTEM_ATTR_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * \if ENGLISH_LANG
	 * Version info 
	 * \else
	 * �汾��Ϣ
	 * \endif
	 */
	public SDK_VERSION_INFO		stVersion = new SDK_VERSION_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * DSP capacity description 
	 * \else
	 * DSP��������
	 * \endif
	 */
	public SDK_DSP_ENCODECAP	stDspEncodeCap = new SDK_DSP_ENCODECAP();
	
	/**
	 * \if ENGLISH_LANG
	 * SN
	 * \else
	 * ���к�
	 * \endif
	 */
	public byte				szDevSerialNo[] = new byte[FinalVar.SDK_DEV_SERIALNO_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Device type. Please refer to enumeration DHDEV_DEVICE_TYPE
	 * \else
	 * �豸���ͣ���ö��NET_DEVICE_TYPE
	 * \endif
	 */
	public byte				byDevType;
	
	/**
	 * \if ENGLISH_LANG
	 * Device detailed type. String format. It may be empty.
	 * <pre>
	 * Enumeration definition				Type 
	 * NET_DVR_NONREALTIME_MACE				Non real-time MACE 
	 * NET_DVR_NONREALTIME					Non real-time 
	 * NET_NVS_MPEG1						NVS 
	 * NET_DVR_MPEG1_2						MPEG1 2-channel DVR 
	 * NET_DVR_MPEG1_8						MPEG1 8-channel DVR 
	 * NET_DVR_MPEG4_8						MPEG4 8-channel DVR 
	 * NET_DVR_MPEG4_16						MPEG4 16-channel DVR 
	 * NET_DVR_MPEG4_SX2					LB series DVR 
	 * NET_DVR_MEPG4_ST2					GB series DVR 
	 * NET_DVR_MEPG4_SH2					HB series DVR 
	 * NET_DVR_MPEG4_GBE					GBE series DVR 
	 * NET_DVR_MPEG4_NVSII					II NVS 
	 * NET_DVR_STD_NEW						New standard configuration protocol 
	 * NET_DVR_DDNS							DDNS server 
	 * NET_DVR_ATM							ATM 
	 * NET_NB_SERIAL						The 2nd non real-time NB DVR 
	 * NET_LN_SERIAL						LN series DVR 
	 * NET_BAV_SERIAL						BAV series DVR 
	 * NET_SDIP_SERIAL						SDIP series DVR 
	 * NET_IPC_SERIAL						IPC series DVR 
	 * NET_NVS_B							NVS B series 
	 * NET_NVS_C							NVS H series 
	 * NET_NVS_S							NVS S series 
	 * NET_NVS_E							NVS E series 
	 * NET_DVR_NEW_PROTOCOL					Search device type from QueryDevState. By string format. 
	 * NET_NVD_SERIAL						Decoder 
	 * NET_DVR_N5							N5 
	 * NET_DVR_MIX_DVR						Hybrid dvr 
	 * NET_SVR_SERIAL						SVR series 
	 * NET_SVR_BS							SVR-BS 
	 * NET_NVR_SERIAL						NVR series 
	 * NET_DVR_N51							N51 
	 * NET_ITSE_SERIAL						ITSE intelligent analysis box 
	 * NET_ITC_SERIAL						ITS camera 
	 * NET_HWS_SERIAL						Radar speed measuring device 
	 * NET_PVR_SERIAL						PVR 
	 * NET_IVS_SERIAL						IVS��intelligent video server series�� 
	 * NET_IVS_B							General intelligent video detect server 
	 * NET_IVS_F							Facial recognition server 
	 * NET_IVS_V							Video quality analysis server 
	 * NET_MATRIX_SERIAL					Matrix 
	 * NET_DVR_N52							N52 
	 * NET_DVR_N56							N56 
	 * NET_ESS_SERIAL						ESS 
	 * NET_IVS_PC							People counting server 
	 * </pre>
	 * \else
	 * �豸��ϸ�ͺţ��ַ�����ʽ������Ϊ��
	 * ö�ٶ���								���� 
	 * NET_DVR_NONREALTIME_MACE				��ʵʱMACE 
	 * NET_DVR_NONREALTIME					��ʵʱ 
	 * NET_NVS_MPEG1						������Ƶ������ 
	 * NET_DVR_MPEG1_2						MPEG1��·¼��� 
	 * NET_DVR_MPEG1_8						MPEG1��·¼��� 
	 * NET_DVR_MPEG4_8						MPEG4��·¼��� 
	 * NET_DVR_MPEG4_16						MPEG4ʮ��·¼��� 
	 * NET_DVR_MPEG4_SX2					LBϵ��¼��� 
	 * NET_DVR_MEPG4_ST2					GBϵ��¼��� 
	 * NET_DVR_MEPG4_SH2					HBϵ��¼��� 
	 * NET_DVR_MPEG4_GBE					GBEϵ��¼��� 
	 * NET_DVR_MPEG4_NVSII					II��������Ƶ������ 
	 * NET_DVR_STD_NEW						�±�׼����Э�� 
	 * NET_DVR_DDNS							DDNS������ 
	 * NET_DVR_ATM							ATM�� 
	 * NET_NB_SERIAL						������ʵʱNBϵ�л��� 
	 * NET_LN_SERIAL						LNϵ�в�Ʒ 
	 * NET_BAV_SERIAL						BAVϵ�в�Ʒ 
	 * NET_SDIP_SERIAL						SDIPϵ�в�Ʒ 
	 * NET_IPC_SERIAL						IPCϵ�в�Ʒ 
	 * NET_NVS_B							NVS Bϵ�� 
	 * NET_NVS_C							NVS Hϵ�� 
	 * NET_NVS_S							NVS Sϵ�� 
	 * NET_NVS_E							NVS Eϵ�� 
	 * NET_DVR_NEW_PROTOCOL					��QueryDevState�в�ѯ�豸����,���ַ�����ʽ�� 
	 * NET_NVD_SERIAL						�������� 
	 * NET_DVR_N5							N5 
	 * NET_DVR_MIX_DVR						���dvr 
	 * NET_SVR_SERIAL						SVRϵ�� 
	 * NET_SVR_BS							SVR-BS 
	 * NET_NVR_SERIAL						NVRϵ�� 
	 * NET_DVR_N51							N51 
	 * NET_ITSE_SERIAL						ITSE ���ܷ����� 
	 * NET_ITC_SERIAL						���ܽ�ͨ����豸 
	 * NET_HWS_SERIAL						�״������HWS 
	 * NET_PVR_SERIAL						��Яʽ����Ƶ¼��� 
	 * NET_IVS_SERIAL						IVS��������Ƶ������ϵ�У� 
	 * NET_IVS_B							ͨ��������Ƶ�������� 
	 * NET_IVS_F							����ʶ������� 
	 * NET_IVS_V							��Ƶ������Ϸ����� 
	 * NET_MATRIX_SERIAL					���� 
	 * NET_DVR_N52							N52 
	 * NET_DVR_N56							N56 
	 * NET_ESS_SERIAL						ESS 
	 * NET_IVS_PC							����ͳ�Ʒ����� 
	 * \endif
	 */
	public byte				szDevType[] = new byte[FinalVar.SDK_DEV_TYPE_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Video port amount
	 * \else
	 * ��Ƶ������
	 * \endif
	 */
	public byte				byVideoCaptureNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio port amount 
	 * \else
	 * ��Ƶ������
	 * \endif
	 */
	public byte				byAudioCaptureNum;
	
	/**
	 * \if ENGLISH_LANG
	 * NSP
	 * \else
	 * �Խ�����ӿ�����
	 * \endif
	 */
	public byte				byTalkInChanNum;
	
	/**
	 * \if ENGLISH_LANG
	 * NSP
	 * \else
	 * �Խ�����ӿ�����
	 * \endif
	 */
	public byte				byTalkOutChanNum;
	
	/**
	 * \if ENGLISH_LANG
	 * NSP
	 * \else
	 * NSP
	 * \endif
	 */
	public byte				byDecodeChanNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm input port amount
	 * \else
	 * �����������
	 * \endif
	 */
	public byte				byAlarmInNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm output amount port
	 * \else
	 * �����������
	 * \endif
	 */
	public byte				byAlarmOutNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Network port amount 
	 * \else
	 * �������
	 * \endif
	 */
	public byte				byNetIONum;
	
	/**
	 * \if ENGLISH_LANG
	 * USB USB port amount
	 * \else
	 * USB������
	 * \endif
	 */
	public byte				byUsbIONum;
	
	/**
	 * \if ENGLISH_LANG
	 * IDE amount
	 * \else
	 * IDE����
	 * \endif
	 */
	public byte				byIdeIONum;
	
	/**
	 * \if ENGLISH_LANG
	 * COM amount
	 * \else
	 * ��������
	 * \endif
	 */
	public byte				byComIONum;
	
	/**
	 * \if ENGLISH_LANG
	 * LPT amount
	 * \else
	 * ��������
	 * \endif
	 */
	public byte				byLPTIONum;
	
	/**
	 * \if ENGLISH_LANG
	 * NSP
	 * \else
	 * NSP
	 * \endif
	 */
	public byte				byVgaIONum;
	
	/**
	 * \if ENGLISH_LANG
	 * NSP
	 * \else
	 * NSP
	 * \endif
	 */
	public byte				byIdeControlNum;
	
	/**
	 * \if ENGLISH_LANG
	 * NSP
	 * \else
	 * NSP
	 * \endif
	 */
	public byte				byIdeControlType;
	
	/**
	 * \if ENGLISH_LANG
	 * NSP, expansible description 
	 * \else
	 * NSP����չ����
	 * \endif
	 */
	public byte				byCapability;
	
	/**
	 * \if ENGLISH_LANG
	 * Video matrix output amount
	 * \else
	 * ��Ƶ�����������
	 * \endif
	 */
	public byte				byMatrixOutNum;			
	
	/**
	 * \if ENGLISH_LANG
	 * Operate when HDD is full(overwrite/stop)
	 * \else
	 * Ӳ��������ʽ(���ǡ�ֹͣ)
	 * \endif
	 */
	public byte				byOverWrite;
	
	/**
	 * \if ENGLISH_LANG
	 * Video file Package length
	 * \else
	 * ¼��������
	 * \endif
	 */
	public byte				byRecordLen;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable  DTS or not  1--enable. 0--disable
	 * \else
	 * �Ƿ�ʵ������ʱ 1-ʵ�� 0-��ʵ��
	 * \endif
	 */
	public byte				byDSTEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Device serial number. Remote control can use this SN to control.
	 * \else
	 * �豸��ţ�����ң��
	 * \endif
	 */
	public int					wDevNo;
	
	/**
	 * \if ENGLISH_LANG
	 * Video format
	 * \else
	 * ��Ƶ��ʽ:0-PAL,1-NTSC
	 * \endif
	 */
	public byte				byVideoStandard;
	
	/**
	 * \if ENGLISH_LANG
	 * Date format
	 * \else
	 * ���ڸ�ʽ
	 * \endif
	 */
	public byte				byDateFormat;
	
	/**
	 * \if ENGLISH_LANG
	 * Date separator(0:".",1:"-",2:"/")
	 * \else
	 * ���ڷָ��(0��"."��1��"-"��2��"/")
	 * \endif
	 */
	public byte				byDateSprtr;
	
	/**
	 * \if ENGLISH_LANG
	 * Time separator  (0-24H,1-12H)
	 * \else
	 * ʱ���ʽ (0-24Сʱ��1��12Сʱ)
	 * \endif
	 */
	public byte				byTimeFmt;
	
	/**
	 * \if ENGLISH_LANG
	 * Please refer to SDK_LANGUAGE_TYPE for enumeration value
	 * \else
	 * ö��ֵ��� SDK_LANGUAGE_TYPE
	 * \endif
	 */
	public byte				byLanguage;
}
