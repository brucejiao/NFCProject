package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of good weight
 * \else
 * ���ػ��ر���
 * \endif
 */
public class ALARM_GOODS_WEIGHT_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * 0-start, 1-stop
	 * \else
	 * 0-��ʼ, 1-ֹͣ
	 * \endif
	 */
	public int          nAction;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0-greater than dwMaxGoodsWeight, 1-less than dwMinGoodsWeight, 2-the change greater than dwAlarmWeight
	 * \else
	 * 0-����������, 1-С����С����, 2-���ر仯����������ֵ
	 * \endif
	 */
	public int          nAlarmType;
	
 	/**
	 * \if ENGLISH_LANG
	 * good weight(kg)
	 * \else
	 * ��ǰ����(kg)
	 * \endif
	 */
	public int        dwGoodsWeight;
	
 	/**
	 * \if ENGLISH_LANG
	 * self weight(kg)
	 * \else
	 * ����(kg)
	 * \endif
	 */
	public int        dwSelfWeight;
	
 	/**
	 * \if ENGLISH_LANG
	 * total weight(kg)
	 * \else
	 * ����(kg)
	 * \endif
	 */
	public int        dwTotalWeight;
	
 	/**
	 * \if ENGLISH_LANG
	 * standard weight(kg)
	 * \else
	 * �˶�����(kg)
	 * \endif
	 */
	public int        dwStandardWeight;
	
 	/**
	 * \if ENGLISH_LANG
	 * weight scale
	 * \else
	 * ���ر���
	 * \endif
	 */
	public int        dwWeightScale;
	
 	/**
	 * \if ENGLISH_LANG
	 * the max(kg)
	 * \else
	 * ������(kg)
	 * \endif
	 */
	public int        dwMaxGoodsWeight;
	
 	/**
	 * \if ENGLISH_LANG
	 * the min(kg)
	 * \else
	 * ��С����(kg)
	 * \endif
	 */
	public int        dwMinGoodsWeight;
	
 	/**
	 * \if ENGLISH_LANG
	 * alarm of threshold(kg)
	 * \else
	 * ������ֵ(kg)
	 * \endif
	 */
	public int        dwAlarmWeight;
	
 	/**
	 * \if ENGLISH_LANG
	 * whight change when gather(kg)
	 * \else
	 * �ɼ�ʱ�����ڻ��ر仯(kg)
	 * \endif
	 */
	public int          nWeightChange;
	
 	/**
	 * \if ENGLISH_LANG
	 * gather time(s)
	 * \else
	 * ��ֹ�ɼ�ʱ��(s)
	 * \endif
	 */
	public int          nCheckTime;
}
