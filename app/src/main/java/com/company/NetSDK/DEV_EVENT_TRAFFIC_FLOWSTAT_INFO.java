package com.company.NetSDK;

import java.io.Serializable;

public class DEV_EVENT_TRAFFIC_FLOWSTAT_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * name
	 * \else
	 * �¼�����
	 * \endif
	 */
	public byte                szName[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * time stamp(ms)
	 * \else
	 * ʱ���(��λ�Ǻ���)
	 * \endif
	 */
	public double              PTS;

	/**
	 * \if ENGLISH_LANG
	 * occurrence time
	 * \else
	 * �¼�������ʱ��
	 * \endif
	 */
	public NET_TIME_EX         UTC = new NET_TIME_EX();

	/**
	 * \if ENGLISH_LANG
	 * event id
	 * \else
	 * �¼�ID
	 * \endif
	 */
	public int                 nEventID;

	/**
	 * \if ENGLISH_LANG
	 * channel number
	 * \else
	 * ͨ������
	 * \endif
	 */
	public int                 nLaneCnt;

	/**
	 * \if ENGLISH_LANG
	 * traffic flow state info
	 * \else
	 * ����ͳ�Ƽ�¼����һ������
	 * \endif
	 */
	public SDK_TRAFFICFLOWSTAT  stTrafficFlowStats[] = new SDK_TRAFFICFLOWSTAT[FinalVar.SDK_MAX_LANE_NUM];
	
	public DEV_EVENT_TRAFFIC_FLOWSTAT_INFO() {
		for (int i = 0; i < FinalVar.SDK_MAX_LANE_NUM; i++) {
			stTrafficFlowStats[i] = new SDK_TRAFFICFLOWSTAT();
		}
	}
}
