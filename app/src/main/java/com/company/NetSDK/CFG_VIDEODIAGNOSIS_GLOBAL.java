package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Reserved 
 * \else
 * ��Ƶ���ȫ�ֱ�ṹ��
 * \endif
 */
public class CFG_VIDEODIAGNOSIS_GLOBAL implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Caller allocate global config number  according to capacity  
	 * \else
	 * �����߷���ȫ�����ø���  ������������ȡ
	 * \endif
	 */
	public int									nTotalGlobalNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * Return actual global config number 
	 * \else
	 * ����ʵ��ȫ�����ø���
	 * \endif
	 */
	public int									nReturnGlobalNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * Video diagnosis global config caller allocate memory nGlobalCount��CFG_VIDEODIAGNOSIS_GLOBAL_CHNNL 
	 * \else
	 * ��Ƶ���ȫ������ �����߷����ڴ�nGlobalCount��CFG_VIDEODIAGNOSIS_GLOBAL_CHNNL
	 * \endif
	 */
	public CFG_VIDEODIAGNOSIS_GLOBAL_CHNNL[]	pstGlobals;
	
	public CFG_VIDEODIAGNOSIS_GLOBAL(int nTotalGlobalNum) {
		this.nTotalGlobalNum = nTotalGlobalNum;
		pstGlobals = new CFG_VIDEODIAGNOSIS_GLOBAL_CHNNL[nTotalGlobalNum];
		for (int i = 0; i < nTotalGlobalNum; i++) {
			pstGlobals[i] = new CFG_VIDEODIAGNOSIS_GLOBAL_CHNNL();
		}
	}
}
