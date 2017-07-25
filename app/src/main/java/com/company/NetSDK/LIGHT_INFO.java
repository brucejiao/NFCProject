package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of traffic light
 * \else
 * ��ͨ�ƹ��ϱ���
 * \endif
 */

public class LIGHT_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * direction: 1-left,2-right,3-straight , 4-turn round
	 * \else
	 * ��ͨ�Ʒ���: 1-���У�2-���У�3-ֱ��, 4-��ͷ
	 * \endif
	 */
	public byte               byDirection;
	
 	/**
	 * \if ENGLISH_LANG
	 * light state: 1-fault,2-normal
	 * \else
	 * ��ͨ��״̬: 1-���ϣ�2-����
	 * \endif
	 */
	public byte               byState;
}
