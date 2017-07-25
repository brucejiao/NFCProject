package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Auto Maintenance
 * \else
 * �Զ�ά��
 * \endif
 */
public class AV_CFG_AutoMaintain implements Serializable {
	
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Auto Reboot Date, -1 Never, 0~6 Sunday~Saturday, 7 Everyday
	 * \else
	 * �Զ���������, -1����, 0~6����~����, 7ÿ��
	 * \endif
	 */
	public int			nAutoRebootDay;
	
 	/**
	 * \if ENGLISH_LANG
	 * AUto Reboot Hour, 0~23 
	 * \else
	 * �Զ�����Сʱ, 0~23
	 * \endif
	 */
	public int			nAutoRebootHour;
	
 	/**
	 * \if ENGLISH_LANG
	 * AUto Reboot Minute, 0~59 
	 * \else
	 * �Զ���������, 0~59
	 * \endif
	 */
	public int			nAutoRebootMinute;
	
 	/**
	 * \if ENGLISH_LANG
	 * AUto Shutdown Date 
	 * \else
	 * �Զ��ػ�����
	 * \endif
	 */
	public int			nAutoShutdownDay;
	
 	/**
	 * \if ENGLISH_LANG
	 * AUto Shutdown Hour 
	 * \else
	 * �Զ��ػ�Сʱ
	 * \endif
	 */
	public int			nAutoShutdownHour;
	
 	/**
	 * \if ENGLISH_LANG
	 * AUto Shutdown Minute 
	 * \else
	 * �Զ��ػ�����
	 * \endif
	 */
	public int			nAutoShutdownMinute;
	
 	/**
	 * \if ENGLISH_LANG
	 * Auto Start Date 
	 * \else
	 * �Զ���������
	 * \endif
	 */
	public int			nAutoStartupDay;
	
 	/**
	 * \if ENGLISH_LANG
	 * Auto Start Hour 
	 * \else
	 * �Զ�����Сʱ
	 * \endif
	 */
	public int			nAutoStartupHour;
	
 	/**
	 * \if ENGLISH_LANG
	 * Auto Start Minute 
	 * \else
	 * �Զ���������
	 * \endif
	 */
	public int			nAutoStartupMinute;
	
 	/**
	 * \if ENGLISH_LANG
	 * true means enable auto reboot��false means disable auto reboot
	 * \else
	 * true��ʾ�����Զ�������false��ʾ�ر��Զ�����
	 * \endif
	 */
	public boolean		bAutoRebootEnable;
}
