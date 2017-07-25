package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Production definition
 * \else
 * ��Ʒ����
 * \endif
 */
public class SDK_PRODUCTION_DEFNITION implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Video input channel amount
	 * \else
	 * ��Ƶ����ͨ����
	 * \endif
	 */
	public int					nVideoInChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Video output channel amount
	 * \else
	 * ��Ƶ���ͨ����
	 * \endif
	 */
	public int					nVideoOutChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Remote decode channel amount
	 * \else
	 * Զ�̽���ͨ����
	 * \endif
	 */
	public int					nRemoteDecChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Device type
	 * \else
	 * �豸����
	 * \endif
	 */
	public char				szDevType[] = new char[FinalVar.SDK_DEV_TYPE_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * OEM customer
	 * \else
	 * OEM�ͻ�
	 * \endif
	 */
	public char				szVendor[] = new char[FinalVar.SDK_MAX_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * OEM version
	 * \else
	 * OEM�汾
	 * \endif
	 */
	public int					nOEMVersion;
	
	/**
	 * \if ENGLISH_LANG
	 * Main version No.
	 * \else
	 * ���汾��
	 * \endif
	 */
	public int					nMajorVerion;
	
	/**
	 * \if ENGLISH_LANG
	 * SUb version No.
	 * \else
	 * �ΰ汾��
	 * \endif
	 */
	public int					nMinorVersion;
	
	/**
	 * \if ENGLISH_LANG
	 * Revision version
	 * \else
	 * �޶��汾
	 * \endif
	 */
	public int					nRevision;
	
	/**
	 * \if ENGLISH_LANG
	 * Web version
	 * \else
	 * Web�汾
	 * \endif
	 */
	public char				szWebVerion[] = new char[FinalVar.SDK_MAX_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Default setup
	 * \else
	 * Ĭ������
	 * \endif
	 */
	public char				szDefLanguage[] = new char[FinalVar.SDK_MAX_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Release time. Unit is second.
	 * \else
	 * ����ʱ��, ��ȷ����
	 * \endif
	 */
	public NET_TIME			stuBuildDateTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * Audio input channel amount
	 * \else
	 * ��Ƶ����ͨ����
	 * \endif
	 */
	public int					nAudioInChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio output channel amount
	 * \else
	 * ��Ƶ���ͨ����
	 * \endif
	 */
	public int					nAudioOutChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Support schedule storage or not.
	 * \else
	 * �Ƿ�֧�ֶ�ʱ�洢
	 * \endif
	 */
	public boolean				bGeneralRecord;
	
	/**
	 * \if ENGLISH_LANG
	 * Support local storage or not.
	 * \else
	 * �Ƿ�֧�ֱ��ش洢
	 * \endif
	 */
	public boolean				bLocalStore;
	
	/**
	 * \if ENGLISH_LANG
	 * Support network storage or not.
	 * \else
	 * �Ƿ�֧������洢
	 * \endif
	 */
	public boolean				bRemoteStore;
	
	/**
	 * \if ENGLISH_LANG
	 * Support emergency local storage or not.
	 * \else
	 * �Ƿ�֧�ֽ����洢������
	 * \endif
	 */
	public boolean				bLocalurgentStore;
	
	/**
	 * \if ENGLISH_LANG
	 * Support real-time compression storage or not.
	 * \else
	 * �Ƿ�֧��ʵʱѹ���洢
	 * \endif
	 */
	public boolean				bRealtimeCompress;
	
	/**
	 * \if ENGLISH_LANG
	 * The video format supported. bit0-PAL, bit1-NTSC
	 * \else
	 * ֧�ֵ���Ƶ��ʽ�б�, bit0-PAL, bit1-NTSC
	 * \endif
	 */
	public int					dwVideoStandards;
	
	/**
	 * \if ENGLISH_LANG
	 * Default video format, 0-PAL, 1-NTSC
	 * \else
	 * ��Ĭ����Ƶ��ʽ, 0-PAL, 1-NTSC
	 * \endif
	 */
	public int					nDefVideoStandard;
	
	/**
	 * \if ENGLISH_LANG
	 * Max extra stream channel amount
	 * \else
	 * �������·��
	 * \endif
	 */
	public int					nMaxExtraStream;
	
	/**
	 * \if ENGLISH_LANG
	 * Remote record channel amount
	 * \else
	 * Զ��¼��ͨ����
	 * \endif
	 */
	public int					nRemoteRecordChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Remote snap channel amount
	 * \else
	 * Զ��ץͼͨ����
	 * \endif
	 */
	public int					nRemoteSnapChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Remote video analysis channel amount
	 * \else
	 * Զ����Ƶ����ͨ����
	 * \endif
	 */
	public int					nRemoteVideoAnalyseChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Remote real-time stream transmit max channel amount
	 * \else
	 * Զ��ʵʱ��ת�����ͨ����
	 * \endif
	 */
	public int					nRemoteTransmitChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Remote transmit file channel amount
	 * \else
	 * Զ���ļ�����ͨ��ͨ����
	 * \endif
	 */
	public int					nRemoteTransmitFileChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Max network transmit channel amount
	 * \else
	 * ������紫��ͨ������
	 * \endif
	 */
	public int					nStreamTransmitChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Max read file channel amount
	 * \else
	 * �����ļ���ͨ������
	 * \endif
	 */
	public int					nStreamReadChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Max bit stream network send capability, kbps
	 * \else
	 * ����������緢������, kbps
	 * \endif
	 */
	public int					nMaxStreamSendBitrate;
	
	/**
	 * \if ENGLISH_LANG
	 * Max bit stream network interface capability, kbps
	 * \else
	 * �����������ӿ�����, kbps
	 * \endif
	 */
	public int					nMaxStreamRecvBitrate;
	
	/**
	 * \if ENGLISH_LANG
	 * Old compression file or not. Delete P frame and save I frame.
	 * \else
	 * �Ƿ�ѹ�����ļ�, ȥ��P֡, ����I֡
	 * \endif
	 */
	public boolean				bCompressOldFile;
	
	/**
	 * \if ENGLISH_LANG
	 * Support RAID or not.
	 * \else
	 * �Ƿ�֧��RAID
	 * \endif
	 */
	public boolean				bRaid;
	
	/**
	 * \if ENGLISH_LANG
	 * Max pre-record time.Unit is second.
	 * \else
	 * ���Ԥ¼ʱ��, s
	 * \endif
	 */
	public int					nMaxPreRecordTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Support PTZ alarm or not.
	 * \else
	 * �Ƿ�֧����̨����
	 * \endif
	 */
	public boolean				bPtzAlarm;
	
	/**
	 * \if ENGLISH_LANG
	 * Support PTZ or not.
	 * \else
	 * �Ƿ�֧����̨
	 * \endif
	 */
	public boolean				bPtz;
	
	/**
	 * \if ENGLISH_LANG
	 * Support corresponding function of the ATM or not.
	 * \else
	 * �Ƿ���ʾATM��ع���
	 * \endif
	 */
	public boolean				bATM;
	
	/**
	 * \if ENGLISH_LANG
	 * Support 3G module or not.
	 * \else
	 * �Ƿ�֧��3Gģ��
	 * \endif
	 */
	public boolean				b3G;
	
	/**
	 * \if ENGLISH_LANG
	 * With number button or not.
	 * \else
	 * �Ƿ�����ּ�
	 * \endif
	 */
	public boolean				bNumericKey;
	
	/**
	 * \if ENGLISH_LANG
	 * With Shift button or not.
	 * \else
	 * �Ƿ��Shift��
	 * \endif
	 */
	public boolean				bShiftKey;
	
	/**
	 * \if ENGLISH_LANG
	 * Number character map sheet is right or not.
	 * \else
	 * ������ĸӳ����Ƿ���ȷ
	 * \endif
	 */
	public boolean				bCorrectKeyMap;
	
	/**
	 * \if ENGLISH_LANG
	 * The new 2nd ATM front panel.
	 * \else
	 * �µĶ���ATMǰ���
	 * \endif
	 */
	public boolean				bNewATM;
	
	/**
	 * \if ENGLISH_LANG
	 * Decoder or not
	 * �Ƿ��ǽ�����
	 * \endif
	 */
	public boolean				bDecoder;
	
	/**
	 * \if ENGLISH_LANG
	 * Decoder info. Valid when bDecoder=true.bDecoder=true
	 * \else
	 * ��������Ϣ, bDecoder=trueʱ��Ч
	 * \endif
	 */
	public DEV_DECODER_INFO		stuDecoderInfo = new DEV_DECODER_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * Integration ceiling screen output channel
	 * \else
	 * �ں������ͨ������
	 * \endif
	 */
	public int					nVideoOutputCompositeChannels;
	
	/**
	 * \if ENGLISH_LANG
	 * Support WPS or not
	 * \else
	 * �Ƿ�֧��WPS����
	 * \endif
	 */
	public boolean                bSupportedWPS;
	
	/**
	 * \if ENGLISH_LANG
	 * VGA video output channel number
	 * \else
	 * VGA��Ƶ���ͨ����
	 * \endif
	 */
	public int					nVGAVideoOutputChannels;
	
	/**
	 * \if ENGLISH_LANG
	 * TV video output channel number
	 * \else
	 * TV��Ƶ���ͨ����
	 * \endif
	 */
	public int					nTVVideoOutputChannels;
	
	/**
	 * \if ENGLISH_LANG
	 * Max number of remote channels
	 * \else
	 * ���Զ��ͨ����
	 * \endif
	 */
	public int					nMaxRemoteInputChannels;
	
	/**
	 * \if ENGLISH_LANG
	 * Max number of matrix channels
	 * \else
	 * ������ͨ����
	 * \endif
	 */
	public int					nMaxMatrixInputChannels;
	
	/**
	 * \if ENGLISH_LANG
	 * Max counts of road ways 1~6
	 * \else
	 * ���ܽ�ͨ��󳵵��� 1~6
	 * \endif
	 */
	public int                 nMaxRoadWays;
	
	/**
	 * \if ENGLISH_LANG
	 * Max counts of screen when docking with the camera 0~20
	 * \else
	 * ������Խ����֧�ֵ����������� 0~20
	 * \endif
	 */
	public int                 nMaxParkingSpaceScreen;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ��̨ˮƽ��С�Ƕ�, [0-360]
	 * \endif
	 */
	public int					nPtzHorizontalAngleMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ��̨ˮƽ���Ƕ�, [0-360]
	 * \endif
	 */
	public int					nPtzHorizontalAngleMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ��̨��ֱ��С�Ƕ�, [-90,90]
	 * \endif
	 */
	public int					nPtzVerticalAngleMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ��̨��ֱ���Ƕ�, [-90,90]
	 * \endif
	 */
	public int					nPtzVerticalAngleMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * �Ƿ�֧����̨���ܲ˵�
	 * \endif
	 */
	public boolean				bPtzFunctionMenu;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * �Ƿ�֧�ֵƹ����
	 * \endif
	 */
	public boolean				bLightingControl;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * �ֶ��ƹ����ģʽ, ��λ, ��NET_LIGHTING_CTRL_ON_OFF
	 * \endif
	 */
	public int				dwLightingControlMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * �����������, 0��ʾ��֧��
	 * \endif
	 */
	public int					nNearLightNumber;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * Զ���������, 0��ʾ��֧��
	 * \endif
	 */
	public int					nFarLightNumber;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * �Ƿ�֧�ֿ��ƾ۽�
	 * \endif
	 */
	public boolean				bFocus;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * �Ƿ�֧�ֿ��ƹ�Ȧ
	 * \endif
	 */
	public boolean				bIris;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ��̨֧�ֵ�Э���б�, �����Ƕ��, ÿ����';'�ָ�
	 * \endif
	 */
	public char				szPtzProtocolList[] = new char[FinalVar.SDK_COMMON_STRING_1024];
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * �Ƿ�֧����ˢ����
	 * \endif
	 */
	public boolean				bRainBrushControl;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ��ˢ����, Ϊ0ʱ��ʾ��֧��
	 * \endif
	 */
	public int					nBrushNumber;
	
	/**
	 * \if ENGLISH_LANG
	 * inferior video matrix input channel, the subscript corresponding matrix number
	 * \else
	 * ��λ������Ƶ����ͨ��, �±��Ӧ������
	 * \endif
	 */
	public int                 szLowerMatrixInputChannels[] = new int[FinalVar.SDK_MAX_LOWER_MITRIX_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * inferior video matrix output channel, the subscript corresponding matrix number
	 * \else
	 * ��λ������Ƶ���ͨ��, �±��Ӧ������
	 * \endif
	 */
	public int				   szLowerMatrixOutputChannels[] = new int[FinalVar.SDK_MAX_LOWER_MITRIX_NUM];
	
}

