package com.company.NetSDK;

import java.io.Serializable;

public class SDKDEV_CDMAGPRS_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Wireless module enable
	 * \else
	 * ����ģ��ʹ�ܱ�־
	 * \endif
	 */
	public boolean                bEnable;

	/**
	 * \if ENGLISH_LANG
	 * Network type mask;Use bit to represent,The first bit:Automatic selection
	 * The second bit:TD-SCDMA network;The third bit:WCDMA network;
	 * The fourth bit:CDMA 1.x network;The fifth bit:GPRS network;The sixth bit:EVDO network
	 * The seventh bit:EVDO network;The eighth bit:WIFI network;
	 * \else
	 * �豸֧��������������;��λ��ʾ,��һλ;�Զ�ѡ��;
	 * �ڶ�λ��TD-SCDMA���磻����λ��WCDMA����;
	 * ����λ��CDMA 1.x����;����λ��CDMA2000����;����λ��GPRS����;
	 * ����λ��EVDO����;�ڰ�λ��WIFI
	 * \endif
	 */
	public int               dwTypeMask;

	/**
	 * \if ENGLISH_LANG
	 * Types of wireless networks,EM_GPRSCDMA_NETWORK_TYPE
	 * \else
	 * ��ǰ�������������ͣ�ΪEM_GPRSCDMA_NETWORK_TYPEֵ
	 * \endif
	 */
	public int               dwNetType;

	/**
	 * \if ENGLISH_LANG
	 * Access Point Name
	 * \else
	 * ���������
	 * \endif
	 */
	public byte                szAPN[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * Dial-up number
	 * \else
	 * ���ź���
	 * \endif
	 */
	public byte                szDialNum[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * Dial-up user name
	 * \else
	 * �����û���
	 * \endif
	 */
	public byte                szUserName[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * Dial-up Password
	 * \else
	 * ��������
	 * \endif
	 */
	public byte                szPWD[] = new byte[128];
    
    /* �������豸��ֻ������ */
	/**
	 * \if ENGLISH_LANG
	 * Wireless network registration status
	 * \else
	 * ��������ע��״̬
	 * \endif
	 */
	public boolean                iAccessStat;

	/**
	 * \if ENGLISH_LANG
	 * dial-up IP of Front-end equipment
	 * \else
	 * ǰ���豸����IP���ַ���, ����'\0'��������16byte
	 * \endif
	 */
	public byte                szDevIP[] = new byte[16];

	/**
	 * \if ENGLISH_LANG
	 * Dial-up mask of Front-end equipment
	 * \else
	 * ǰ���豸�����������룬�ַ���, ����'\0'��������16byte
	 * \endif
	 */
	public byte                szSubNetMask[] = new byte[16];

	/**
	 * \if ENGLISH_LANG
	 * Dial-up Gateway of Front-end equipment
	 * \else
	 * ǰ���豸�������أ��ַ���, ����'\0'��������16byte
	 * \endif
	 */
	public byte                szGateWay[] = new byte[16];
	
    /* �������豸��ֻ������ */
	/**
	 * \if ENGLISH_LANG
	 * Keep-alive time
	 * \else
	 * ����ʱ��
	 * \endif
	 */
	public int                 iKeepLive;

	/**
	 * \if ENGLISH_LANG
	 * 3G dial period,valid time period,start dialing;beyond this period,shut the dial.
	 * \else
	 * 3G����ʱ��Σ���Чʱ���֮�ڣ��������ţ���Чʱ���֮�⣬�رղ��š�
	 * \endif
	 */
    public SDK_3G_TIMESECT      stSect[][] = new SDK_3G_TIMESECT[FinalVar.SDK_N_WEEKS][FinalVar.SDK_N_TSECT];
    
    /**
	 * \if ENGLISH_LANG
	 * Whether need to be active by voice or message
	 * \else
	 * �Ƿ���Ҫ����������ż���
	 * \endif
	 */
	public byte                byActivate;

	/**
	 * \if ENGLISH_LANG
	 * SIM(UIM) State: 1, 0 (read-only data) be occupied the 1 byte
	 * \else
	 * SIM(UIM)״̬:����1,������0  (ֻ������) ռ��Reserved��1���ֽ�
	 * \endif
	 */
	public byte                bySimStat;

	/**
	 * \if ENGLISH_LANG
	 * identify mode
	 * \else
	 * ��Ȩ��ʽ
	 * \endif
	 */
	public byte                szIdentify[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * PPP Dial-up,0- cut down ppp connect,1-ppp dial-up
	 * \else
	 * PPP����,0-�Ͽ�ppp���ӣ�1-ppp����
	 * \endif
	 */
	public boolean                bPPPEnable;

	/**
	 * \if ENGLISH_LANG
	 * PPP Dial-up statr(real only),see EM_MOBILE_PPP_STATE
	 * \else
	 * PPP����״̬(ֻ��)�����庬���EM_MOBILE_PPP_STATE
	 * \endif
	 */
	public byte                bPPPState;

	/**
	 * \if ENGLISH_LANG
	 * net card state(read only),see EM_3GMOBILE_STATE
	 * \else
	 * ��������״̬(ֻ��)�����庬���EM_3GMOBILE_STATE
	 * \endif
	 */
	public byte                bNetCardState;

	/**
	 * \if ENGLISH_LANG
	 * physics card no.
	 * \else
	 * ������
	 * \endif
	 */
	public byte                szPhyCardNo[] = new byte[32];

	/**
	 * \if ENGLISH_LANG
	 * PIN show or not(read only), 0-don't support 1-show, 2-don't show
	 * \else
	 * PIN���Ƿ���ʾ(ֻ��), 0-��֧��, 1-��ʾ, 2-����ʾ
	 * \endif
	 */
	public byte                byPinShow;

	/**
	 * \if ENGLISH_LANG
	 * PIN setting enable(read only), 0-disable, 1-enable
	 * \else
	 * PIN������ʹ��(ֻ��), 0-��ʹ��, 1-ʹ��
	 * \endif
	 */
	public byte                byPinEnable;

	/**
	 * \if ENGLISH_LANG
	 * the rest of pin setting number(read only), 0~3
	 * \else
	 * PIN��ʣ�����ô���(ֻ��), 0~3
	 * \endif
	 */
	public byte                byPinCount;
	
    //-------------------------------�����ֶ�����dwSize�����Ч------------------------------------
	/**
	 * \if ENGLISH_LANG
	 * value of PIN, a combination of letters or numbers
	 * \else
	 * PIN��ֵ, ��ĸ�����ֵ��������
	 * \endif
	 */
	public byte                szPinNo[] = new byte[16];
    
    public SDKDEV_CDMAGPRS_CFG() {
    	for (int i = 0; i < FinalVar.SDK_N_WEEKS; i++) {
    		for (int j = 0; j < FinalVar.SDK_N_TSECT; j++) {
    			stSect[i][j] = new SDK_3G_TIMESECT();
    		}
    	}
    }
}
