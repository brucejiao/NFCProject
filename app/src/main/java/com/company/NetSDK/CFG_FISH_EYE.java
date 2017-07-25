package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * fish eye configuration
 * \else
 * ���۾�ͷ����
 * \endif
 */
public class CFG_FISH_EYE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * center point[0,8192]
	 * \else
	 * ����Բ������,��Χ[0,8192]
	 * \endif
	 */
	public CFG_POLYGON         stuCenterPoint = new CFG_POLYGON();
	
	/**
	 * \if ENGLISH_LANG
	 * radius [0,8192]
	 * \else
	 * ���۰뾶��С,��Χ[0,8192]
	 * \endif
	 */
	public int        nRadius;
	
	/**
	 * \if ENGLISH_LANG
	 * direction[0,360.0]
	 * \else
	 * ��ͷ��ת����,��ת�Ƕ�[0,360.0]
	 * \endif
	 */
	public float               fDirection;
	
	/**
	 * \if ENGLISH_LANG
	 * place holder	1 roof loading,2 wall loading,3 earth loading.,default 1
	 * \else
	 * ��ͷ��װ��ʽ	1��װ��2��װ��3��װ,Ĭ��1
	 * \endif
	 */
	public byte                byPlaceHolder;
	
	/**
	 * \if ENGLISH_LANG
	 * fish eye mode, see CFG_CALIBRATE_MODE enumeration value
	 * \else
	 * ���۽���ģʽ,���CFG_CALIBRATE_MODEö��ֵ
	 * \endif
	 */
	public byte                byCalibrateMode;
}
