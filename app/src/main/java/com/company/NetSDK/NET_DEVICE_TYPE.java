package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device type
 * \else
 * �豸����
 * \endif
 */
public class NET_DEVICE_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public static final int NET_PRODUCT_NONE = 0;

	/**
	 * \if ENGLISH_LANG
	 * Non real-time MACE
	 * \else
	 * ��ʵʱMACE
	 * \endif
	 */
	public static final int NET_DVR_NONREALTIME_MACE = 1;					

	/**
	 * \if ENGLISH_LANG
	 * Non real-time
	 * \else
	 * ��ʵʱ
	 * \endif
	 */
	public static final int NET_DVR_NONREALTIME = 2;						

	/**
	 * \if ENGLISH_LANG
	 * NVS
	 * \else
	 * ������Ƶ������
	 * \endif
	 */
	public static final int NET_NVS_MPEG1 = 3;								

	/**
	 * \if ENGLISH_LANG
	 * MPEG1 2-channel DVR
	 * \else
	 * MPEG1��·¼���
	 * \endif
	 */
	public static final int NET_DVR_MPEG1_2 = 4;							

	/**
	 * \if ENGLISH_LANG
	 * MPEG1 8-channel DVR
	 * \else
	 * MPEG1��·¼���
	 * \endif
	 */
	public static final int NET_DVR_MPEG1_8 = 5;							

	/**
	 * \if ENGLISH_LANG
	 * MPEG4 8-channel DVR
	 * \else
	 * MPEG4��·¼���
	 * \endif
	 */
	public static final int NET_DVR_MPEG4_8 = 6;							

	/**
	 * \if ENGLISH_LANG
	 * MPEG4 16-channel DVR
	 * \else
	 * MPEG4ʮ��·¼���
	 * \endif
	 */
	public static final int NET_DVR_MPEG4_16 = 7;							

	/**
	 * \if ENGLISH_LANG
	 * LB series DVR
	 * \else
	 * LBϵ��¼���
	 * \endif
	 */
	public static final int NET_DVR_MPEG4_SX2 = 8;							

	/**
	 * \if ENGLISH_LANG
	 * GB series DVR
	 * \else
	 * GBϵ��¼���
	 * \endif
	 */
	public static final int NET_DVR_MEPG4_ST2 = 9;							

	/**
	 * \if ENGLISH_LANG
	 * HB series DVR
	 * \else
	 * HBϵ��¼���
	 * \endif
	 */
	public static final int NET_DVR_MEPG4_SH2 = 10;							

	/**
	 * \if ENGLISH_LANG
	 * GBE series DVR
	 * \else
	 * GBEϵ��¼���
	 * \endif
	 */
	public static final int NET_DVR_MPEG4_GBE = 11;							

	/**
	 * \if ENGLISH_LANG
	 * II NVS
	 * \else
	 * II��������Ƶ������
	 * \endif
	 */
	public static final int NET_DVR_MPEG4_NVSII = 12;						

	/**
	 * \if ENGLISH_LANG
	 * New standard configuration protocol
	 * \else
	 * �±�׼����Э��
	 * \endif
	 */
	public static final int NET_DVR_STD_NEW = 13;							

	/**
	 * \if ENGLISH_LANG
	 * DDNS server
	 * \else
	 * DDNS������
	 * \endif
	 */
	public static final int NET_DVR_DDNS = 14;								

	/**
	 * \if ENGLISH_LANG
	 * ATM
	 * \else
	 * ATM��
	 * \endif
	 */
	public static final int NET_DVR_ATM = 15;								

	/**
	 * \if ENGLISH_LANG
	 * The 2nd non real-time NB DVR
	 * \else
	 * ������ʵʱNBϵ�л���
	 * \endif
	 */
	public static final int NET_NB_SERIAL = 16;								

	/**
	 * \if ENGLISH_LANG
	 * LN series DVR
	 * \else
	 * LNϵ�в�Ʒ
	 * \endif
	 */
	public static final int NET_LN_SERIAL = 17;								

	/**
	 * \if ENGLISH_LANG
	 * BAV series DVR
	 * \else
	 * BAVϵ�в�Ʒ
	 * \endif
	 */
	public static final int NET_BAV_SERIAL = 18;								

	/**
	 * \if ENGLISH_LANG
	 * SDIP series DVR
	 * \else
	 * SDIPϵ�в�Ʒ
	 * \endif
	 */
	public static final int NET_SDIP_SERIAL = 19;							

	/**
	 * \if ENGLISH_LANG
	 * IPC series DVR
	 * \else
	 * IPCϵ�в�Ʒ
	 * \endif
	 */
	public static final int NET_IPC_SERIAL = 20;								

	/**
	 * \if ENGLISH_LANG
	 * NVS B series
	 * \else
	 * NVS Bϵ��
	 * \endif
	 */
	public static final int NET_NVS_B = 21;									

	/**
	 * \if ENGLISH_LANG
	 * NVS H series
	 * \else
	 * NVS Hϵ��
	 * \endif
	 */
	public static final int NET_NVS_C = 22;									

	/**
	 * \if ENGLISH_LANG
	 * NVS S series
	 * \else
	 * NVS Sϵ��
	 * \endif
	 */
	public static final int NET_NVS_S = 23;									

	/**
	 * \if ENGLISH_LANG
	 * NVS E series
	 * \else
	 * NVS Eϵ��
	 * \endif
	 */
	public static final int NET_NVS_E = 24;									

	/**
	 * \if ENGLISH_LANG
	 * Search device type from QueryDevState. By string format.
	 * \else
	 * ��QueryDevState�в�ѯ�豸����,���ַ�����ʽ
	 * \endif
	 */
	public static final int NET_DVR_NEW_PROTOCOL = 25;						

	/**
	 * \if ENGLISH_LANG
	 * Decoder
	 * \else
	 * ������
	 * \endif
	 */
	public static final int NET_NVD_SERIAL = 26;								

	/**
	 * \if ENGLISH_LANG
	 * N5
	 * \else
	 * N5
	 * \endif
	 */
	public static final int NET_DVR_N5 = 27;									

	/**
	 * \if ENGLISH_LANG
	 * Hybrid dvr
	 * \else
	 * ���DVR
	 * \endif
	 */
	public static final int NET_DVR_MIX_DVR = 28;							

	/**
	 * \if ENGLISH_LANG
	 * SVR series
	 * \else
	 * SVRϵ��
	 * \endif
	 */
	public static final int NET_SVR_SERIAL = 29;								

	/**
	 * \if ENGLISH_LANG
	 * SVR-BS
	 * \else
	 * SVR-BS
	 * \endif
	 */
	public static final int NET_SVR_BS = 30;									

	/**
	 * \if ENGLISH_LANG
	 * NVR series
	 * \else
	 * NVRϵ��
	 * \endif
	 */
	public static final int NET_NVR_SERIAL = 31;								

	/**
	 * \if ENGLISH_LANG
	 * N51
	 * \else
	 * N51
	 * \endif
	 */
	public static final int NET_DVR_N51 = 32;                                

	/**
	 * \if ENGLISH_LANG
	 * ITSE intelligent analysis box
	 * \else
	 * ITSE ���ܷ�����
	 * \endif
	 */
	public static final int NET_ITSE_SERIAL = 33;							

	/**
	 * \if ENGLISH_LANG
	 * ITS camera
	 * \else
	 * ���ܽ�ͨ����豸
	 * \endif
	 */
	public static final int NET_ITC_SERIAL = 34;                             

	/**
	 * \if ENGLISH_LANG
	 * Radar speed measuring device
	 * \else
	 * �״������HWS
	 * \endif
	 */
	public static final int NET_HWS_SERIAL = 35;                             

	/**
	 * \if ENGLISH_LANG
	 * PVR
	 * \else
	 * ��Яʽ����Ƶ¼���
	 * \endif
	 */
	public static final int NET_PVR_SERIAL = 36;                             

	/**
	 * \if ENGLISH_LANG
	 * IVS��intelligent video server series��
	 * \else
	 * IVS��������Ƶ������ϵ�У�
	 * \endif
	 */
	public static final int NET_IVS_SERIAL = 37;                             

	/**
	 * \if ENGLISH_LANG
	 * General intelligent video detect server
	 * \else
	 * ͨ��������Ƶ��������
	 * \endif
	 */
	public static final int NET_IVS_B = 38;                                  

	/**
	 * \if ENGLISH_LANG
	 * Facial recognition server
	 * \else
	 * ����ʶ�������
	 * \endif
	 */
	public static final int NET_IVS_F = 39;                                  

	/**
	 * \if ENGLISH_LANG
	 * Video quality analysis server
	 * \else
	 * ��Ƶ������Ϸ�����
	 * \endif
	 */
	public static final int NET_IVS_V = 40;                                  

	/**
	 * \if ENGLISH_LANG
	 * Matrix
	 * \else
	 * ����
	 * \endif
	 */
	public static final int NET_MATRIX_SERIAL = 41;							

	/**
	 * \if ENGLISH_LANG
	 * N52
	 * \else
	 * N52
	 * \endif
	 */
	public static final int NET_DVR_N52 = 42;								

	/**
	 * \if ENGLISH_LANG
	 * N56
	 * \else
	 * N56
	 * \endif
	 */
	public static final int NET_DVR_N56 = 43;								

	/**
	 * \if ENGLISH_LANG
	 * ESS
	 * \else
	 * ESS
	 * \endif
	 */
	public static final int NET_ESS_SERIAL = 44;                             

	/**
	 * \if ENGLISH_LANG
	 * People counting server
	 * \else
	 * ����ͳ�Ʒ�����
	 * \endif
	 */
	public static final int NET_IVS_PC = 45;                                 

	/**
	 * \if ENGLISH_LANG
	 * pc-nvr
	 * \else
	 * pc-nvr
	 * \endif
	 */
	public static final int NET_PC_NVR = 46;                                 

	/**
	 * \if ENGLISH_LANG
	 * Video wall controller
	 * \else
	 * ����������
	 * \endif
	 */
	public static final int NET_DSCON = 47;									

	/**
	 * \if ENGLISH_LANG
	 * NVS
	 * \else
	 * ������Ƶ�洢������
	 * \endif
	 */
	public static final int NET_EVS = 48;									

	/**
	 * \if ENGLISH_LANG
	 * Embedded IVS video analysis system
	 * \else
	 * Ƕ��ʽ���ܷ�����Ƶϵͳ
	 * \endif
	 */
	public static final int NET_EIVS = 49;									

	/**
	 * \if ENGLISH_LANG
	 * DVR-N6
	 * \else
	 * DVR-N6
	 * \endif
	 */
	public static final int NET_DVR_N6 = 50;
	
	/**
	 * \if ENGLISH_LANG
	 * Universal decoder
	 * \else
	 * ���ܽ�����
	 * \endif
	 */
	public static final int NET_UDS = 51;
	
	/**
	 * \if ENGLISH_LANG
	 * Bank alarm host
	 * \else
	 * ���б�������
	 * \endif
	 */
	public static final int NET_AF6016 = 52;
	
	/**
	 * \if ENGLISH_LANG
	 * Video site alarm host
	 * \else
	 * ��Ƶ���籨������
	 * \endif
	 */
	public static final int NET_AS5008 = 53;
	
	/**
	 * \if ENGLISH_LANG
	 * Net alarm host
	 * \else
	 * ���籨������
	 * \endif
	 */
	public static final int NET_AH2008 = 54;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm host series
	 * \else
	 * ��������ϵ��
	 * \endif
	 */
	public static final int NET_A_SERIAL = 55;
	
	/**
	 * \if ENGLISH_LANG
	 * A&C series
	 * \else
	 * �Ž�ϵ�в�Ʒ
	 * \endif
	 */
	public static final int NET_BSC_SERIAL = 56;
	
	/**
	 * \if ENGLISH_LANG
	 * NVS series
	 * \else
	 * NVSϵ�в�Ʒ
	 * \endif
	 */
	public static final int NET_NVS_SERIAL = 57;
}


