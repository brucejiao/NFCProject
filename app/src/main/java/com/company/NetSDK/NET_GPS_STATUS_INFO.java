package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * GPS status info
 * \else
 * GPS״̬��Ϣ
 * \endif
 */
public class NET_GPS_STATUS_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * time
	 * \else
	 * ��λʱ��
	 * \endif
	 */
	public NET_TIME            revTime = new NET_TIME();                        
 	/**
	 * \if ENGLISH_LANG
	 * device number
	 * \else
	 * �豸���к�
	 * \endif
	 */
	public byte                DvrSerial[] = new byte[50];                  
 	/**
	 * \if ENGLISH_LANG
	 * longitude(1/1000000,range[0-360])
	 * \else
	 * ����(��λ�ǰ����֮�ȣ���Χ0-360��)
	 * \endif
	 */
	public double              longitude;                      
 	/**
	 * \if ENGLISH_LANG
	 * latitude(1/1000000,range[0-180])
	 * \else
	 * γ��(��λ�ǰ����֮�ȣ���Χ0-180��)
	 * \endif
	 */
	public double              latidude;                       
 	/**
	 * \if ENGLISH_LANG
	 * highness(m)
	 * \else
	 * �߶�(��)
	 * \endif
	 */
	public double              height;                         
 	/**
	 * \if ENGLISH_LANG
	 * angle(north is source point,clockwise is positive)
	 * \else
	 * �����(��������Ϊԭ�㣬˳ʱ��Ϊ��)
	 * \endif
	 */
	public double              angle;                          
 	/**
	 * \if ENGLISH_LANG
	 * speed(sea mile,speed/1000*1.852km/h)
	 * \else
	 * �ٶ�(��λ�Ǻ��speed/1000*1.852����/Сʱ)
	 * \endif
	 */
	public double              speed;                          
 	/**
	 * \if ENGLISH_LANG
	 * star count
	 * \else
	 * ��λ����
	 * \endif
	 */
	public boolean                starCount;                      
 	/**
	 * \if ENGLISH_LANG
	 * antenna state(true good, false bad)
	 * \else
	 * ����״̬(true �ã�false ��)
	 * \endif
	 */
	public boolean                antennaState;                   
 	/**
	 * \if ENGLISH_LANG
	 * orientation state(true orientation, false not)
	 * \else
	 * ��λ״̬(true ��λ��false ����λ)
	 * \endif
	 */
	public boolean                orientationState;               
 	/**
	 * \if ENGLISH_LANG
	 * working state(true normal, false abnormity)
	 * \else
	 * ����״̬(0=δ��λ��1=�ǲ�ֶ�λ��2=��ֶ�λ��3=��ЧPPS��6=���ڹ��� 
	 * \endif
	 */
	public boolean                workStae;                       
 	/**
	 * \if ENGLISH_LANG
	 * alarm count
	 * \else
	 * �����ı���λ�ø���
	 * \endif
	 */
	public int                 nAlarmCount;                    
 	/**
	 * \if ENGLISH_LANG
	 * alarm type
	 * \else
	 * �����ı���λ�ã�ֵ���ܶ��
	 * \endif
	 */
	public int                 nAlarmState[] = new int[128];               
 	/**
	 * \if ENGLISH_LANG
	 * 0- real time 1-fill 
	 * \else
	 * 0-ʵʱ 1-���� 
	 * \endif
	 */
	public byte                bOffline;                       
}
