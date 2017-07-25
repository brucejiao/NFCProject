package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * DST(Daylight Save Time) setup
 * \else
 * DST(����ʱ)����
 * \endif
 */
public class SDK_DST_POINT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Year[200 - 2037]
	 * \else
	 * ��[200 - 2037]
	 * \endif
	 */
	public int                 nYear;
	
	/**
	 * \if ENGLISH_LANG
	 * Month[1 - 12]
	 * \else
	 * ��[1 - 12]
	 * \endif
	 */
	public int                 nMonth;
	
	/**
	 * \if ENGLISH_LANG
	 * Hour[0 - 23]
	 * \else
	 * Сʱ [0 - 23]
	 * \endif
	 */
	public int                 nHour;
	
	/**
	 * \if ENGLISH_LANG
	 * Minute [0 - 59]
	 * \else
	 * ���� [0 - 59]
	 * \endif
	 */
	public int                 nMinute;
	
	/**
	 * \if ENGLISH_LANG
	 * [-1 - 4]0:It means it adopts the date calculation method.
	 * 1:in week: the first week ,2:the second week,3:the third week,4: The fourth week ,-1: the last week  
	 * \else
	 * [-1 - 4]0:��ʾʹ�ð����ڼ���ķ���
	 * 1: ���ܼ���: ��һ��,2: �ڶ���,3: ������,4: ������,-1: ���һ��
	 * \endif
	 */
	public int                 nWeekOrDay;
	
	/**
	 * \if ENGLISH_LANG
	 * week[0 - 6](nWeekOrDay:calculated in week )0: Sunday, 1:Monday , 2:Tuesday ,3: Wednesday,4:Thirsday ,5: Friday,6:Saturday
	 * \else
	 * ��[0 - 6](nWeekOrDay�����ܼ���ʱ)0:������, 1:����һ, 2:���ڶ�,3:������,4:������,5:������,6:������
	 * \endif
	 */
	public int             iWeekDay;
	
	/**
	 * \if ENGLISH_LANG
	 * date[1 - 31] (nWeekOrDay: in date)
	 * \else
	 * ����[1 - 31] (nWeekOrDay�������ڼ���)
	 * \endif
	 */
	public int             iDay;
    
}
