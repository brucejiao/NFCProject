package com.company.NetSDK;

import java.io.Serializable;

public class NET_MONITORWALL_OPERATE_TYPE implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final int 	NET_MONITORWALL_OPERATE_ADD = 0;            // ��ӵ���ǽ, ��Ӧ NET_IN_MONITORWALL_ADD �� NET_OUT_MONITORWALL_ADD
	public static final int    NET_MONITORWALL_OPERATE_CTRL_TOUR = 1;      // Ԥ����Ѳ����, ��Ӧ NET_IN_CTRL_COLLECTIONTOUR ��  NET_OUT_CTRL_COLLECTIONTOUR
	public static final int    NET_MONITORWALL_OPERATE_GET_STATUS = 2;     // ��ȡ����ǰ״̬, ��Ӧ NET_IN_MONITORWALL_GET_STATUS ��  NET_OUT_MONITORWALL_GET_STATUS
	public static final int    NET_MONITORWALL_OPERATE_SET_COLL_SCHD = 3;  // ����Ԥ��ʱ���, ��Ӧ NET_IN_MONITORWALL_SET_COLL_SCHD �� NET_OUT_MONITORWALL_SET_COLL_SCHD
	public static final int    NET_MONITORWALL_OPERATE_GET_COLL_SCHD = 4;  // ��ȡԤ��ʱ���, ��Ӧ NET_IN_MONITORWALL_GET_COLL_SCHD �� NET_OUT_MONITORWALL_GET_COLL_SCHD
	public static final int    NET_MONITORWALL_OPERATE_REMOVE = 5;         // ɾ������ǽ, ��Ӧ NET_IN_MONITORWALL_REMOVE �� NET_OUT_MONITORWALL_REMOVE
	public static final int    NET_MONITORWALL_OPERATE_SET_ENABLE = 6;     // ����ʹ��, ��Ӧ NET_IN_MONITORWALL_SET_ENABLE �� NET_OUT_MONITORWALL_SET_ENABLE
	public static final int    NET_MONITORWALL_OPERATE_GET_ENABLE = 7;     // ��ȡʹ��, ��Ӧ NET_IN_MONITORWALL_GET_ENABLE �� NET_OUT_MONITORWALL_GET_ENABLE
	public static final int    NET_MONITORWALL_OPERATE_NAME_EXIST = 8;     // ����ǽ�Ƿ����, ��Ӧ NET_IN_MONITORWALL_NAME_EXIST �� NET_OUT_MONITORWALL_NAME_EXIST

}
