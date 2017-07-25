package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Encoder information
 * \else
 * ���ӵı�������Ϣ
 * \endif
 */
public class DEV_ENCODER_INFO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * IP address of Front-end DVR 
	 * \else
	 * ǰ��DVR��IP��ַ
	 * \endif
	 */
	public byte			szDevIp[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Port of Front-end DVR
	 * \else
	 * ǰ��DVR�Ķ˿ں�
	 * \endif
	 */
	public int				wDevPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Decoder channel enable
	 * \else
	 * ����ͨ��ʹ��
	 * \endif
	 */
	public byte			bDevChnEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * The corresponding channel number decoder
	 * \else
	 * ��Ӧ����ͨ����
	 * \endif
	 */
	public byte			byDecoderID;
	
	/**
	 * \if ENGLISH_LANG
	 * User Name
	 * \else
	 * �û���
	 * \endif
	 */
	public byte			szDevUser[] = new byte[FinalVar.SDK_USER_NAME_LENGTH_EX];
	
	/**
	 * \if ENGLISH_LANG
	 * Password
	 * \else
	 * ����
	 * \endif
	 */
	public byte			szDevPwd[]	= new byte[FinalVar.SDK_USER_PSW_LENGTH_EX];
	
	/**
	 * \if ENGLISH_LANG
	 * Channel Number
	 * \else
	 * ͨ����
	 * \endif
	 */
	public int				nDevChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Stream type; 0:Main Stream, 1:Sub-stream
	 * \else
	 * �������ͣ�0����������1��������1; 2:snap; 3: ������2
	 * \endif
	 */
	public int				nStreamType;
	
	/**
	 * \if ENGLISH_LANG
	 * -1: auto, 0:TCP, 1:UDP, 2:Multicast
	 * \else
	 * -1: auto, 0��TCP��1��UDP��2���鲥
	 * \endif
	 */	
	public byte			byConnType;
	
	/**
	 * \if ENGLISH_LANG
	 * 0:Direct Connect, 1:transmit
	 * \else
	 * 0��ֱ����1��ת��
	 * \endif
	 */
	public byte			byWorkMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Listening port services, for transmit
	 * \else
	 * ָʾ��������Ķ˿ڣ�ת��ʱ��Ч
	 * \endif
	 */
	public int				wListenPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Protocol type
	 * 0:compatible with each other
	 * 1:private 2nd protocol
	 * 2:private system integration protocol
	 * 3:private DSS protocol
	 * 4:private rtsp protocol
	 * \else
	 * Э������
	 * 0:������ǰ
	 * 1:�󻪶���Э��
	 * 2:��ϵͳ����Э��
	 * 3:��DSSЭ��
	 * 4:��rtspЭ��
	 * \endif
	 */
	public int				dwProtoType;
																
	/**
	 * \if ENGLISH_LANG
	 * Front device name
	 * \else
	 * ǰ���豸����
	 * \endif
	 */
	public byte			szDevName[] = new byte[64];
	
	/**
	 * \if ENGLISH_LANG
	 * video source type:0-SD,1-HD	
	 * \else
	 * �ý���ͨ����ǰ��ƵԴ����:0-����(SD),1-����(HD),ע:�豸֧�ָ���ͨ������Ч		
	 * \endif
	 */
	public byte            byVideoInType;
	
	/**
	 * \if ENGLISH_LANG
	 * szDevIp extended, IP or domain name
	 * \else
	 * szDevIp��չ��ǰ��DVR��IP��ַ(������������)
	 * \endif
	 */
	public byte			szDevIpEx[] = new byte[FinalVar.SDK_MAX_IPADDR_OR_DOMAIN_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * snap mode(when nStreamType==2 effective) 0:That request a frame,1:Time to send a request
	 * \else
	 * ץͼģʽ(nStreamType==2ʱ��Ч) 0����ʾ����һ֡,1����ʾ��ʱ��������
	 * \endif
	 */
	public byte            bySnapMode;
	
	/**
	 * \if ENGLISH_LANG
	 * The target device manufacturers,See the enum struct EM_IPC_TYPE
	 * \else
	 * Ŀ���豸����������,����ο�EM_IPC_TYPE��
	 * \endif
	 */
	public byte            byManuFactory;
	
	/**
	 * \if ENGLISH_LANG
	 * The target device's device type,0:IPC
	 * \else
	 * Ŀ���豸���豸����,0:IPC
	 * \endif
	 */
	public byte            byDeviceType;
	
	/**
	 * \if ENGLISH_LANG
	 * The target device's decode policy
	 * 0:LatencyLevel3 1:LatencyLevel2
	 * 2:LatencyLevel1 3:MiddleLevel
	 * 4:FluencyLevel3 5:FluencyLevel2
	 * 6:FluencyLevel1
	 * \else
	 * Ŀ���豸�Ľ������
	 * 0:������ǰ
	 * 1:ʵʱ�ȼ��� 
	 * 2:ʵʱ�ȼ���
	 * 3:ʵʱ�ȼ���
	 *  4:Ĭ�ϵȼ�
	 *  5:�����ȼ��� 
	 *  6:�����ȼ���
	 *  7:�����ȼ���
	 * \endif
	 */
	public byte            byDecodePolicy;
	
	/**
	 * \if ENGLISH_LANG
	 * http port 0-65535
	 * \else
	 * Http�˿ں�,0-65535
	 * \endif
	 */
	public int             dwHttpPort;
	
	/**
	 * \if ENGLISH_LANG
	 * RTSP port 0-65535
	 * \else
	 * Rtsp�˿ں�,0-65535
	 * \endif
	 */
	public int             dwRtspPort;
	
	/**
	 * \if ENGLISH_LANG
	 * remote channel name
	 * \else
	 * Զ��ͨ������, ֻ�ж�ȡ�������Ʋ�Ϊ��ʱ�ſ����޸ĸ�ͨ��������
	 * \endif
	 */
	public byte			szChnName[] = new byte[32];
}
