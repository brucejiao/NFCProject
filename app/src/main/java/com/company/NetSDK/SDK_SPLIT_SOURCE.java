package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Display source
 * \else
 * ��ʾԴ
 * \endif
 */
public class SDK_SPLIT_SOURCE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * ʹ��
	 * \endif
	 */
	public boolean			    bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * IP, null means there is no setup.
	 * \else
	 * IP, �ձ�ʾû������
	 * \endif
	 */
	public byte			    szIp[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * User name
	 * \else
	 * �û���
	 * \endif
	 */
	public byte			    szUser[] = new byte[FinalVar.SDK_USER_NAME_LENGTH];
	
	/**
	 * \if ENGLISH_LANG
	 * Password
	 * \else
	 * ����
	 * \endif
	 */
	public byte			    szPwd[] = new byte[FinalVar.SDK_USER_PSW_LENGTH];
	
	/**
	 * \if ENGLISH_LANG
	 * Port
	 * \else
	 * �˿�
	 * \endif
	 */
	public int			    	nPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel No.
	 * \else
	 * ͨ����
	 * \endif
	 */
	public int				    nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * Video bit stream. -1-auto, 0-main stream, 1-extra stream 1, 2-extra stream 2, 3-extra stream 3
	 * \else
	 * ��Ƶ����, -1-�Զ�, 0-������, 1-������1, 2-������2, 3-������3, 4-snap, 5-Ԥ��
	 * \endif
	 */
	public int				    nStreamType;
	
	/**
	 * \if ENGLISH_LANG
	 * Definition, 0-standard definition, 1-high definition
	 * \else
	 * ������, 0-����, 1-����
	 * \endif
	 */
	public int				    nDefinition;
	
	/**
	 * \if ENGLISH_LANG
	 * Protocol type�� value corresponding to SDK_DEVICE_PROTOCOL
	 * \else
	 * Э������. ֵ��Ӧ��SDK_DEVICE_PROTOCOL
	 * \endif
	 */
	public int					emProtocol;
	
	/**
	 * \if ENGLISH_LANG
	 * Device name
	 * \else
	 * �豸����
	 * \endif
	 */
	public byte			    szDevName[] = new byte[FinalVar.SDK_DEVICE_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Video input channel amount
	 * \else
	 * ��Ƶ����ͨ����
	 * \endif
	 */
	public int					nVideoChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio input channel amount
	 * \else
	 * ��Ƶ����ͨ����
	 * \endif
	 */
	public int					nAudioChannel;

	/**
	 * \if ENGLISH_LANG
	 * Decoder or not.
	 * \else
	 * �Ƿ��ǽ�����
	 * \endif
	 */
	public boolean				bDecoder;
	
	/**
	 * \if ENGLISH_LANG
	 * 0:TCP;1:UDP;2:multicast
	 * \else
	 * -1: auto, 0��TCP��1��UDP��2���鲥
	 * \endif
	 */
	public byte				byConnType;
	
	/**
	 * \if ENGLISH_LANG
	 * 0:connect directly; 1:transfer 
	 * \else
	 * 0��ֱ����1��ת��
	 * \endif
	 */
	public byte				byWorkMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Isten port, valid with transfer; when byConnType is multicast, it is multiport
	 * \else
	 * ָʾ��������Ķ˿ڣ�ת��ʱ��Ч; byConnTypeΪ�鲥ʱ������Ϊ�ಥ�˿�
	 * \endif
	 */
	public int				wListenPort;
	
	/**
	 * \if ENGLISH_LANG
	 * SzDevIp extension, front DVR Ip address (enter domain name)
	 * \else
	 * szDevIp��չ��ǰ��DVR��IP��ַ(������������)
	 * \endif
	 */
	public byte				szDevIpEx[] = new byte[FinalVar.SDK_MAX_IPADDR_OR_DOMAIN_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Snapshot mode (valid when nStreamType==4) 0: request for single frame, 1: sechdule sending request
	 * \else
	 * ץͼģʽ(nStreamType==4ʱ��Ч) 0����ʾ����һ֡,1����ʾ��ʱ��������
	 * \endif
	 */
	public byte				bySnapMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Target device manufacturer. Refer to EM_IPC_TYPE for detailed information.
	 * \else
	 * Ŀ���豸����������, ����ο�EM_IPC_TYPE��
	 * \endif
	 */
	public byte				byManuFactory;
	
	/**
	 * \if ENGLISH_LANG
	 * Target device type, 0:IPC
	 * \else
	 * Ŀ���豸���豸����, 0:IPC
	 * \endif
	 */
	public byte				byDeviceType;
	
	/**
	 * \if ENGLISH_LANG
	 * Target device decode policy, 0:compatible with previous  
	 * 1:real time level high 2: real time level medium
	 * 3: real time level low 4: default level 
	 * 5: fluency level high 6: fluency level medium
	 * 7: fluency level low
	 * \else
	 * Ŀ���豸�Ľ������, 0:������ǰ	
	 * 1:ʵʱ�ȼ���  2:ʵʱ�ȼ���	
	 * 3:ʵʱ�ȼ���  4:Ĭ�ϵȼ�	
	 * 5:�����ȼ���  6:�����ȼ���	
	 * 7:�����ȼ���
	 * \endif
	 */
	public byte				byDecodePolicy;
	
	/**
	 * \if ENGLISH_LANG
	 * Http port number, 0-65535
	 * \else
	 * Http�˿ں�, 0-65535
	 * \endif
	 */
	public int					dwHttpPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Rtsp port number, 0-65535
	 * \else
	 * Rtsp�˿ں�, 0-65535
	 * \endif
	 */
	public int					dwRtspPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Remote channel name, modifiable only when name read is not vacant
	 * \else
	 * Զ��ͨ������, ֻ�ж�ȡ�������Ʋ�Ϊ��ʱ�ſ����޸ĸ�ͨ��������
	 * \endif
	 */
	public byte				szChnName[] = new byte[FinalVar.SDK_DEVICE_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Multicast IP address. Valid only when byConnType is multicast
	 * \else
	 * �ಥIP��ַ, byConnTypeΪ�鲥ʱ��Ч
	 * \endif
	 */
	public byte				szMcastIP[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Device ID, ""-null, "Local"  "Remote"
	 * \else
	 * �豸ID, ""-null, "Local"-����ͨ��, "Remote"-Զ��ͨ��, ������������RemoteDevice�е��豸ID
	 * \endif
	 */
	public byte				szDeviceID[] = new byte[FinalVar.SDK_DEV_ID_LEN_EX];
	
	/**
	 * \if ENGLISH_LANG
	 * Is remote channel or not(read only)
	 * \else
	 * �Ƿ�Զ��ͨ��(ֻ��)
	 * \endif
	 */
	public boolean				bRemoteChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Remote channel ID (read only), effective when bRemoteChannel=TRUE
	 * \else
	 * Զ��ͨ��ID(ֻ��), bRemoteChannel=TRUEʱ��Ч
	 * \endif
	 */
	public int 				nRemoteChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * Type of device, such as IPC, DVR, NVR and so on
	 * \else
	 * �豸����, ��IPC, DVR, NVR��
	 * \endif
	 */
	public byte				szDevClass[] = new byte[FinalVar.SDK_DEV_TYPE_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Device specific type, such as IPC-HF3300
	 * \else
	 * �豸�����ͺ�, ��IPC-HF3300
	 * \endif
	 */
	public byte				szDevType[] = new byte[FinalVar.SDK_DEV_TYPE_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Main stream url, effective when byManuFactory = SDK_IPC_OTHER
	 * \else
	 * ������url��ַ, byManuFactoryΪ SDK_IPC_OTHERʱ��Ч
	 * \endif
	 */
	public byte				szMainStreamUrl[] = new byte[FinalVar.MAX_PATH];
	
	/**
	 * \if ENGLISH_LANG
	 * Extra stream url, effective when byManuFactory = SDK_IPC_OTHER
	 * \else
	 * ������url��ַ, byManuFactoryΪ SDK_IPC_OTHER ʱ��Ч
	 * \endif
	 */
	public byte				szExtraStreamUrl[] = new byte[FinalVar.MAX_PATH];
	
	/**
	 * \if ENGLISH_LANG
	 * Unique channel ID, read only
	 * \else
	 * �豸��ͳһ��ŵ�Ψһͨ����, ֻ��
	 * \endif
	 */
	public int					nUniqueChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Ssascade authemyication, effective when device ID = Local/Cascade/SerialNo,  SerialNo is device seral no.
	 * \else
	 * ������֤��Ϣ, �豸IDΪLocal/Cascade/SerialNoʱ��Ч, ����SerialNo���豸���к�
	 * \endif
	 */
	public SDK_CASCADE_AUTHENTICATOR stuCascadeAuth = new SDK_CASCADE_AUTHENTICATOR();
	
	/**
	 * \if ENGLISH_LANG
	 * 0-normal video source, 1- alarm video source
	 * \else
	 * 0-��ͨ��ƵԴ, 1-������ƵԴ
	 * \endif
	 */
	public int                 nHint; 
	
	/**
	 * \if ENGLISH_LANG
	 * back main stream address quantity
	 * \else
	 * ������������ַ����
	 * \endif
	 */
	public int                 nOptionalMainUrlCount; 
	
	/**
	 * \if ENGLISH_LANG
	 * backup main stream address list
	 * \else
	 * ������������ַ�б�
	 * \endif
	 */
	public byte                szOptionalMainUrls[][] = new byte[FinalVar.SDK_MAX_OPTIONAL_URL_NUM][FinalVar.MAX_PATH]; 
	
	/**
	 * \if ENGLISH_LANG
	 * backup sub stream address quantity
	 * \else
	 * ���ø�������ַ����
	 * \endif
	 */
	public int                 nOptionalExtraUrlCount; 
	
	/**
	 * \if ENGLISH_LANG
	 * backup sub stream address list
	 * \else
	 * ���ø�������ַ�б�
	 * \endif
	 */
	public byte                szOptionalExtraUrls[][] = new byte[FinalVar.SDK_MAX_OPTIONAL_URL_NUM][FinalVar.MAX_PATH];

	/**
	 * \if ENGLISH_LANG
	 * tour time intertval	unit��second
	 * \else
	 * ��Ѳʱ����	��λ����
	 * \endif
	 */
	public int                 nInterval;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * �û���
	 * \endif
	 */
	public byte                szUserEx[] = new byte[FinalVar.SDK_NEW_USER_NAME_LENGTH];
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * ����
	 * \endif
	 */
	public byte                szPwdEx[] = new byte[FinalVar.SDK_NEW_USER_PSW_LENGTH];
	
	/**
	 * \if ENGLISH_LANG
	 * type of pushstream,effective when byConnType is TCP-Push or UDP-Push 
	 * \else
	 * ������ʽ����������,ֻ��byConnTypeΪTCP-Push��UDP-Push���и��ֶ�
	 * \endif
	 * @see EM_SRC_PUSHSTREAM_TYPE
	 */
	public int 				   emPushStream;           

}
