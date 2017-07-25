package com.company.NetSDK;

import java.io.Serializable;

public class NET_RADIOMETRY_QUERY implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public NET_TIME            stTime = new NET_TIME();                            // ��¼ʱ��
    public int                 nPresetId;                         // Ԥ�õ���
    public int                 nRuleId;                           // ������
    public byte[]              szName = new byte[64];             // ��ѯ������
    public SDK_POINT           stCoordinate = new SDK_POINT();    // ��ѯ���µ�����
    public int                 nChannel;                          // ͨ����
    public NET_RADIOMETRYINFO  stTemperInfo = new NET_RADIOMETRYINFO();  // ������Ϣ

}
