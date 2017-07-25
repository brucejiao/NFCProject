package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * BUS configuration info
 * \else
 * ����������Ϣ
 * \endif
 */
public class CFG_CANFILTER_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Wait for the reply timeout (unit: ms), after sending data, wait for after 3000 milliseconds, end the Reuters 
	 * \else
	 * �ȴ�Ӧ��ʱ(��λ:����)�� �������ݺ󣬵ȴ�3000����󣬽�����·͸��
	 * \endif
	 */
	public int						nResponseTimeout;			
	
	/**
	 * \if ENGLISH_LANG
	 * Receives the request response timeout (unit: ms), more than a specified time not yet received data, think end of the request 
	 * \else
	 * ��������Ӧ��ʱ(��λ:����)�� ����ָ��ʱ��δ�յ����ݣ���Ϊ�������
	 * \endif
	 */
	public int						nRequestTimeout;
	
	/**
	 * \if ENGLISH_LANG
	 * Number of data, 
	 * \else
	 * ���ݺŸ���
	 * \endif
	 */
	public int						nFilterPIDCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Returns the number of data number
	 * \else
	 * �������ݺŸ���
	 * \endif
	 */
	public int						nRetFiterPIDCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Filter the number of data, 
	 * \else
	 * �������ݺ�
	 * \endif
	 */
	public int[]					pnFilterPID;
	
	/**
	 * \if ENGLISH_LANG
	 * Filtering policy
	 * If it is a white list, report contains the data of PID 
	 * If it is a blacklist, report does not contain the data of PID 
	 * All data reported if no filter
	 * \else
	 * ���˲���
	 * 0 = δ֪����
	 * 1 = �޹��� ,�������ݶ��ϱ�
	 * 2 = ���������ϱ�����PID������
	 * 3 = ���������ϱ�����PID������
	 * \endif
	 */
	public int						nPolicy;

}
