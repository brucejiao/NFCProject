package com.company.NetSDK;
import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * GPS info 
 * \else
 * GPS��Ϣ
 * \endif
 */
public class GPS_Info implements Serializable {
	
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
	public char                DvrSerial[] = new char[50];                  
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
	public int                starCount;                      
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
}