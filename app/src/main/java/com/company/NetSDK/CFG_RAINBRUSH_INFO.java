package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Rainbush Configuration Information
 * \else
 * ��ˢ����
 * \endif
 */
public class CFG_RAINBRUSH_INFO implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Rainbush Enalbe 
	 * \else
	 * ��ˢʹ��
	 * \endif
	 */
	public boolean			bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Speed Rate,1:Fast;2:Middle;3:Slow 
	 * \else
	 * ��ˢ�ٶ�,1:����;2:����;3:����
	 * \endif
	 */
	public byte				bSpeedRate;
	
 	/**
	 * \if ENGLISH_LANG
	 * Event Response Period 
	 * \else
	 * �¼���Ӧʱ���
	 * \endif
	 */
	public CFG_TIME_SECTION[][]	stuTimeSection = new CFG_TIME_SECTION[FinalVar.WEEK_DAY_NUM][FinalVar.MAX_REC_TSECT];

	public CFG_RAINBRUSH_INFO() {
		for (int i = 0; i < FinalVar.WEEK_DAY_NUM; i++) {
			for (int j = 0; j < FinalVar.MAX_REC_TSECT; j++) {
				stuTimeSection[i][j] = new CFG_TIME_SECTION();
			}
		}
	}
}
