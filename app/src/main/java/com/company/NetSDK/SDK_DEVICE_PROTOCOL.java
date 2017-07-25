package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device protocol type
 * \else
 * SDK_DEVICE_PROTOCOL, �豸Э������
 * \endif
 */
public class SDK_DEVICE_PROTOCOL implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Private 2nd protocol
	 * \else
	 * ˽��2��Э��
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_DAHUA2 = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Private 3rd protocol
	 * \else
	 * ˽��3��Э��
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_DAHUA3 = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Onvif
	 * \else
	 * Onvif
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_ONVIF = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Virtual network computer
	 * \else
	 * ������������
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_VNC = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * Private protocol of private    
	 * \else
	 * ��˽��Э��      
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_PRIVATE = 100;
	
	/**
	 * \if ENGLISH_LANG
	 * Aebell
	 * \else
	 * ���籴��  
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_AEBELL = 101;
	
	/**
	 * \if ENGLISH_LANG
	 * Panasonic
	 * \else
	 * ����   
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_PANASONIC = 102;
	
	/**
	 * \if ENGLISH_LANG
	 * Sony
	 * \else
	 * ����   
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_SONY = 103;
	
	/**
	 * \if ENGLISH_LANG
	 * Dynacolor 
	 * \else
	 * Dynacolor 
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_DYNACOLOR = 104;
	
	/**
	 * \if ENGLISH_LANG
	 * Tcsw
	 * \else
	 * �������   
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_TCWS = 105;
	
	/**
	 * \if ENGLISH_LANG
	 * Sansung
	 * \else
	 * ����     
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_SAMSUNG = 106;
	
	/**
	 * \if ENGLISH_LANG
	 * YOKO  
	 * \else
	 * YOKO  
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_YOKO = 107;
	
	/**
	 * \if ENGLISH_LANG
	 * axis
	 * \else
	 * ��Ѷ��     
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_AXIS = 108;
	
	/**
	 * \if ENGLISH_LANG
	 * Sanyo
	 * \else
	 * ����    
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_SANYO = 109;
	
	/**
	 * \if ENGLISH_LANG
	 * Bosch
	 * \else
	 * Bosch
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_BOSH = 110;
	
	/**
	 * \if ENGLISH_LANG
	 * Peclo	
	 * \else
	 * Peclo	
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_PECLO = 111;
	
	/**
	 * \if ENGLISH_LANG
	 * Provideo	
	 * \else
	 * Provideo	
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_PROVIDEO = 112;
	
	/**
	 * \if ENGLISH_LANG
	 * ACTi	
	 * \else
	 * ACTi	
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_ACTI = 113;
	
	/**
	 * \if ENGLISH_LANG
	 * Vivotek
	 * \else
	 * Vivotek
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_VIVOTEK = 114;
	
	/**
	 * \if ENGLISH_LANG
	 * Arecont 
	 * \else
	 * Arecont 
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_ARECONT = 115;
	
	/**
	 * \if ENGLISH_LANG
	 * PrivateEH
	 * \else
	 * PrivateEH
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_PRIVATEEH = 116;
	
	/**
	 * \if ENGLISH_LANG
	 * IMatek 
	 * \else
	 * IMatek 
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_IMATEK = 117;
	
	/**
	 * \if ENGLISH_LANG
	 * Shany
	 * \else
	 * Shany
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_SHANY = 118;
	
	/**
	 * \if ENGLISH_LANG
	 * ����ӯ��
	 * \else
	 * ����ӯ��
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_VIDEOTREC = 119;
	
	/**
	 * \if ENGLISH_LANG
	 * Ura
	 * \else
	 * Ura
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_URA = 120;
	
	/**
	 * \if ENGLISH_LANG
	 * Bticino
	 * \else
	 * Bticino
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_BITICINO = 121;
	
	/**
	 * \if ENGLISH_LANG
	 * Onvif's protocol type, same to SDK_PROTOCOL_ONVIF   
	 * \else
	 * OnvifЭ������, ͬ SDK_PROTOCOL_ONVIF 
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_ONVIF2 = 122;
	
	/**
	 * \if ENGLISH_LANG
	 * Shepherd
	 * \else
	 * �Ӱ�   
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_SHEPHERD = 123;
	
	/**
	 * \if ENGLISH_LANG
	 * Yaan
	 * \else
	 * �ǰ�       
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_YAAN = 124;
	
	/**
	 * \if ENGLISH_LANG
	 * Airpop 
	 * \else
	 * Airpop 
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_AIRPOINT = 125;
	
	/**
	 * \if ENGLISH_LANG
	 * TYCO
	 * \else
	 * TYCO
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_TYCO = 126;
	
	/**
	 * \if ENGLISH_LANG
	 * Xunmei
	 * \else
	 * Ѷ��   
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_XUNMEI = 127;
	
	/**
	 * \if ENGLISH_LANG
	 * Hikvision
	 * \else
	 * ����
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_HIKVISION = 128;
	
	/**
	 * \if ENGLISH_LANG
	 * LG 
	 * \else
	 * LG 
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_LG = 129;
	
	/**
	 * \if ENGLISH_LANG
	 * Aoqiman
	 * \else
	 * ������   
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_AOQIMAN = 130;
	
	/**
	 * \if ENGLISH_LANG
	 * Baokang
	 * \else
	 * ����      
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_BAOKANG = 131;
	
	/**
	 * \if ENGLISH_LANG
	 * Watchnet  
	 * \else
	 * Watchnet  
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_WATCHNET = 132;
	
	/**
	 * \if ENGLISH_LANG
	 * Xvision
	 * \else
	 * Xvision 
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_XVISION = 133;
	
	/**
	 * \if ENGLISH_LANG
	 * Fusitsu
	 * \else
	 * ��ʿͨ 
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_FUSITSU = 134;
	
	/**
	 * \if ENGLISH_LANG
	 * Canon
	 * \else
	 * Canon
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_CANON = 135;
	
	/**
	 * \if ENGLISH_LANG
	 * GE
	 * \else
	 * GE
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_GE = 136;
	
	/**
	 * \if ENGLISH_LANG
	 * Basler
	 * \else
	 * ��˹��	
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_Basler = 137;
	
	/**
	 * \if ENGLISH_LANG
	 * Patro
	 * \else
	 * ������	
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_Patro = 138;
	
	/**
	 * \if ENGLISH_LANG
	 * CPPLUS K series
	 * \else
	 * CPPLUS Kϵ��
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_CPKNC = 139;
	
	/**
	 * \if ENGLISH_LANG
	 * CPPLUS R series
	 * \else
	 * CPPLUS Rϵ��
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_CPRNC = 140;
	
	/**
	 * \if ENGLISH_LANG
	 * CPPLUS U series	
	 * \else
	 * CPPLUS Uϵ��	
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_CPUNC = 141;
	
	/**
	 * \if ENGLISH_LANG
	 * CPPLUS IPC	
	 * \else
	 * cpplus oem �󻪵�ipc
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_CPPLUS = 142;
	
	/**
	 * \if ENGLISH_LANG
	 * Xunmeis,protocal is Onvif
	 * \else
	 * Ѷ��s,ʵ��Э��ΪOnvif	
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_XunmeiS = 143;
	
	/**
	 * \if ENGLISH_LANG
	 * GDDW
	 * \else
	 * �㶫����
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_GDDW = 144;
	
	/**
	 * \if ENGLISH_LANG
	 * PSIA 
	 * \else
	 * PSIA 
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_PSIA = 145;
	
	/**
	 * \if ENGLISH_LANG
	 * GB2818
	 * \else
	 * GB2818
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_GB2818 = 146;
	
	/**
	 * \if ENGLISH_LANG
	 * GDYX
	 * \else
	 * GDYX
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_GDYX = 147;
	
	/**
	 * \if ENGLISH_LANG
	 * others
	 * \else
	 * ���û��Զ���
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_OTHER = 148;
}
