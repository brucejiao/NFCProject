package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device Status Info
 * \else
 * �豸״̬��Ϣ
 * \endif
 */
public class CFG_DEVICESTATUS_INFO implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Power Num 
	 * \else
	 * ��Դ����
	 * \endif
	 */
	public int			nPowerNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * Power Status,1:Normal 2:Abnormal 3:Unknowm 
	 * \else
	 * ��Դ״̬��1:���� 2:�쳣 3:δ֪
	 * \endif
	 */
	public byte[] 		byPowerStatuc = new byte[FinalVar.MAX_POWER_NUM];
	
 	/**
	 * \if ENGLISH_LANG
	 * CPU Number 
	 * \else
	 * CPU����
	 * \endif
	 */
	public int			nCPUNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * CPU Temperature 
	 * \else
	 * CPU�¶�
	 * \endif
	 */
	public int[]		nCPUTemperature = new int[FinalVar.MAX_CPU_NUM];
	
 	/**
	 * \if ENGLISH_LANG
	 * Fan Number
	 * \else
	 * ���ȸ���
	 * \endif
	 */
	public int			nFanNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * Fan Rotato Speed 
	 * \else
	 * ����ת��
	 * \endif
	 */
	public int[]		nRotatoSpeed = new int[FinalVar.MAX_FUN_NUM];
}