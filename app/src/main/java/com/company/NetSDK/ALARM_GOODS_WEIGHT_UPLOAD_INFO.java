package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * goods weight uploa
 * \else
 * ���ػ�����Ϣ�ϴ�
 * \endif
 */
public class ALARM_GOODS_WEIGHT_UPLOAD_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * goods weight(kg)
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
}
