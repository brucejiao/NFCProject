package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * vehicle info uploading (SDK_DEVSTATE_VIHICLE_INFO_UPLOAD)
 * \else
 * �����Զ�����Ϣ�ϴ�(SDK_DEVSTATE_VIHICLE_INFO_UPLOAD)
 * \endif
 */
public class ALARM_VEHICLE_INFO_UPLOAD implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * type: DriverCheck ,Driver check in or check out
	 * \else
	 * ��Ϣ���: DriverCheck��˾��ǩ��ǩ��
	 * \endif
	 */
	public byte                szType[] = new byte[FinalVar.SDK_VEHICLE_TYPE_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Check in, Check out
	 * \else
	 * ǩ�룺CheckIn��ǩ����CheckOut  
	 * \endif
	 */
	public byte                szCheckInfo[] = new byte[FinalVar.SDK_VEHICLE_INFO_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Driver NO. string
	 * \else
	 * ˾�������ַ���
	 * \endif
	 */
	public byte                szDirverNO[] = new byte[FinalVar.SDK_VEHICLE_DRIVERNO_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * time
	 * \else
	 * ��������ʱ��
	 * \endif
	 */
	public SDKDEVTIME           stTime = new SDKDEVTIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * 0-real time 1-to fill 
	 * \else
	 * 0-ʵʱ 1-���� 
	 * \endif
	 */
	public byte                bOffline;
}
