package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Matrix sub card info
 * \else
 * �����ӿ�	
 * \endif
 */
public class SDK_MATRIX_CARD implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Valid or not
	 * \else
	 * �Ƿ���Ч
	 * \endif
	 */
	public boolean				bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Sub card type
	 * \else
	 * �ӿ�����
	 * \endif
	 */
	public int					dwCardType;
	
	/**
	 * \if ENGLISH_LANG
	 * Signal interface type, "CVBS", "VGA", "DVI"...
	 * \else
	 * �źŽӿ�����, "CVBS", "VGA", "DVI"...
	 * \endif
	 */
	public byte		    	szInterface[] = new byte[FinalVar.SDK_MATRIX_INTERFACE_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Device IP or domain name. The sub card that has no network conneciton can be null.
	 * \else
	 * �豸ip������, ������ӿڵ��ӿ�����Ϊ��
	 * \endif
	 */
	public byte		    	szAddress[] = new byte[FinalVar.SDK_MAX_IPADDR_OR_DOMAIN_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Port No. The sub card that has no network conneciton can be 0.
	 * \else
	 * �˿ں�, ������ӿڵ��ӿ�����Ϊ0
	 * \endif
	 */
	public int			    	nPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Definition. 0=standard definition. 1=High definition
	 * \else
	 * ������, 0=����, 1=����
	 * \endif
	 */
	public int					nDefinition;
	
	/**
	 * \if ENGLISH_LANG
	 * Video input channel amount
	 * \else
	 * ��Ƶ����ͨ����
	 * \endif
	 */
	public int					nVideoInChn;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio input channel amount
	 * \else
	 * ��Ƶ����ͨ����
	 * \endif
	 */
	public int					nAudioInChn;
	
	/**
	 * \if ENGLISH_LANG
	 * Video output channel amount
	 * \else
	 * ��Ƶ���ͨ����
	 * \endif
	 */
	public int					nVideoOutChn;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio output channel amount
	 * \else
	 * ��Ƶ���ͨ����
	 * \endif
	 */
	public int				    nAudioOutChn;
	
	/**
	 * \if ENGLISH_LANG
	 * Video encode channel amount	
	 * \else
	 * ��Ƶ����ͨ����
	 * \endif
	 */
	public int			    	nVideoEncChn;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio encode channel amount
	 * \else
	 * ��Ƶ����ͨ����
	 * \endif
	 */
	public int				    nAudioEncChn;
	
	/**
	 * \if ENGLISH_LANG
	 * Video decode channel amount
	 * \else
	 * ��Ƶ����ͨ����
	 * \endif
	 */
	public int			    	nVideoDecChn;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio decode channel amount
	 * \else
	 * ��Ƶ����ͨ����
	 * \endif
	 */
	public int			    	nAudioDecChn;
	
	/**
	 * \if ENGLISH_LANG
	 * Status: 0-OK, 1-no respond, 2-network disconnection, 3-conflict, 4-upgrading now
	 * \else
	 * ״̬: 0-����, 1-����Ӧ, 2-�������, 3-��ͻ, 4-��������
	 * \endif
	 */
	public int					nStauts;
	
	/**
	 * \if ENGLISH_LANG
	 * COM amount
	 * \else
	 * ������
	 * \endif
	 */
	public int					nCommPorts;
	
	/**
	 * \if ENGLISH_LANG
	 * Video input channel min value
	 * \else
	 * ��Ƶ����ͨ������Сֵ
	 * \endif
	 */
	public int					nVideoInChnMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Video input channel max value
	 * \else
	 * ��Ƶ����ͨ�������ֵ
	 * \endif
	 */
	public int					nVideoInChnMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio input channel min value
	 * \else
	 * ��Ƶ����ͨ������Сֵ
	 * \endif
	 */
	public int					nAudioInChnMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio input channel max value
	 * \else
	 * ��Ƶ����ͨ�������ֵ
	 * \endif
	 */
	public int					nAudioInChnMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Video output channel min value
	 * \else
	 * ��Ƶ���ͨ������Сֵ
	 * \endif
	 */
	public int					nVideoOutChnMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Video output channel max value
	 * \else
	 * ��Ƶ���ͨ�������ֵ
	 * \endif
	 */
	public int					nVideoOutChnMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio output channel min value
	 * \else
	 * ��Ƶ���ͨ������Сֵ
	 * \endif
	 */
	public int					nAudioOutChnMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio output channel max value
	 * \else
	 * ��Ƶ���ͨ�������ֵ	
	 * \endif
	 */
	public int					nAudioOutChnMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Video encode channel min value
	 * \else
	 * ��Ƶ����ͨ������Сֵ
	 * \endif
	 */
	public int					nVideoEncChnMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Video encode channel max value
	 * \else
	 * ��Ƶ����ͨ�������ֵ
	 * \endif
	 */
	public int					nVideoEncChnMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio encode channel min value
	 * \else
	 * ��Ƶ����ͨ������Сֵ
	 * \endif
	 */
	public int					nAudioEncChnMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio encode channel max value
	 * \else
	 * ��Ƶ����ͨ�������ֵ
	 * \endif
	 */
	public int					nAudioEncChnMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Video decode channel min value
	 * \else
	 * ��Ƶ����ͨ������Сֵ
	 * \endif
	 */
	public int					nVideoDecChnMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Video decode channel max value
	 * \else
	 * ��Ƶ����ͨ�������ֵ
	 * \endif
	 */
	public int					nVideoDecChnMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio decode channel min value
	 * \else
	 * ��Ƶ����ͨ������Сֵ
	 * \endif
	 */
	public int					nAudioDecChnMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio decode channel max value
	 * \else
	 * ��Ƶ����ͨ�������ֵ
	 * \endif
	 */
	public int					nAudioDecChnMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Number of cascade channel
	 * \else
	 * ����ͨ����
	 * \endif
	 */
	public int					nCascadeChannels;
	
	/**
	 * \if ENGLISH_LANG
	 * Cascade channel bitrate (Mbps)
	 * \else
	 * ����ͨ������, ��λMbps
	 * \endif
	 */
	public int					nCascadeChannelBitrate;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ��������ͨ����
	 * \endif
	 */
	public int					nAlarmInChnCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ��������ͨ������Сֵ
	 * \endif
	 */
	public int					nAlarmInChnMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ��������ͨ�������ֵ
	 * \endif
	 */
	public int					nAlarmInChnMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * �������ͨ����
	 * \endif
	 */
	public int					nAlarmOutChnCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ��������ͨ������Сֵ
	 * \endif
	 */
	public int					nAlarmOutChnMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ��������ͨ�������ֵ
	 * \endif
	 */
	public int					nAlarmOutChnMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ���ܷ���ͨ����
	 * \endif
	 */
	public int					nVideoAnalyseChnCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ���ܷ���ͨ������Сֵ
	 * \endif
	 */
	public int					nVideoAnalyseChnMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ���ܷ���ͨ�������ֵ
	 * \endif
	 */
	public int					nVideoAnalyseChnMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ���ں���Сֵ
	 * \endif
	 */
	public int					nCommPortMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ���ں����ֵ
	 * \endif
	 */
	public int					nCommPortMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Version
	 * \else
	 * �汾��Ϣ
	 * \endif
	 */
	public byte[]               szVersion = new byte[FinalVar.SDK_COMMON_STRING_32];
	
	/**
	 * \if ENGLISH_LANG
	 * Build Time
	 * \else
	 * ����ʱ��
	 * \endif
	 */
    public NET_TIME             stuBuildTime = new NET_TIME(); 
	
}
