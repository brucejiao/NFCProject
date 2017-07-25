package com.company.NetSDK;

import java.io.Serializable;

public class NET_SPLIT_OPERATE_TYPE implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final int NET_SPLIT_OPERATE_SET_BACKGROUND = 0;          // ���ñ���ͼƬ, ��Ӧ NET_IN_SPLIT_SET_BACKGROUND �� NET_OUT_SPLIT_SET_BACKBROUND
	public static final int NET_SPLIT_OPERATE_GET_BACKGROUND = 1;           // ��ȡ����ͼƬ, ��Ӧ NET_IN_SPLIT_GET_BACKGROUND �� NET_OUT_SPLIT_GET_BACKGROUND
	public static final int NET_SPLIT_OPERATE_SET_PREPULLSRC = 2;           // ����Ԥ����Դ, ��Ӧ NET_IN_SPLIT_SET_PREPULLSRC �� NET_OUT_SPLIT_SET_PREPULLSRC
	public static final int NET_SPLIT_OPERATE_SET_HIGHLIGHT = 3;            // ����Դ�߿����ʹ�ܿ���, ��Ӧ NET_IN_SPLIT_SET_HIGHLIGHT �� NET_OUT_SPLIT_SET_HIGHLIGHT
	public static final int NET_SPLIT_OPERATE_SET_ZORDER = 4;              // ��������Z��, ��Ӧ NET_IN_SPLIT_SET_ZORDER �� NET_OUT_SPLIT_SET_ZORDER
	public static final int NET_SPLIT_OPERATE_SET_TOUR = 5;                // ������Ѳ����, ��Ӧ NET_IN_SPLIT_SET_TOUR �� NET_OUT_SPLIT_SET_TOUR
	public static final int NET_SPLIT_OPERATE_GET_TOUR_STATUS = 6;          // ��ȡ������Ѳ״̬, ��Ӧ NET_IN_SPLIT_GET_TOUR_STATUS �� NET_OUT_SPLIT_GET_TOUR_STATUS
	public static final int NET_SPLIT_OPERATE_GET_SCENE = 7;               // ��ȡ���ڴ�����Ϣ, ��Ӧ NET_IN_SPLIT_GET_SCENE �� NET_OUT_SPLIT_GET_SCENE
	public static final int NET_SPLIT_OPERATE_OPEN_WINDOWS = 8;             // ��������, ��Ӧ NET_IN_SPLIT_OPEN_WINDOWS �� NET_OUT_SPLIT_OPEN_WINDOWS
	public static final int NET_SPLIT_OPERATE_SET_WORK_MODE = 9;          // ���ù���ģʽ, ��Ӧ NET_IN_SPLIT_SET_WORK_MODE �� NET_OUT_SPLIT_SET_WORK_MODE
	public static final int NET_SPLIT_OPERATE_GET_PLAYER = 10;              // ��ȡ������ʵ��,��Ӧ NET_IN_SPLIT_GET_PLAYER �� NET_OUT_SPLIT_GET_PLAYER
	public static final int NET_WM_OPERATE_SET_WORK_MODE = 11;            // ���ô��ڹ���ģʽ,��Ӧ NET_IN_WM_SET_WORK_MODE �� NET_OUT_WM_SET_WORK_MODE
	public static final int NET_WM_OPERATE_GET_WORK_MODE = 12;              // ��ȡ���ڹ���ģʽ,��Ӧ NET_IN_WM_GET_WORK_MODE �� NET_OUT_WM_GET_WORK_MODE
	public static final int NET_SPLIT_OPERATE_CLOSE_WINDOWS = 13;           // �����ش�, ��Ӧ NET_IN_SPLIT_CLOSE_WINDOWS �� NET_OUT_SPLIT_CLOSE_WINDOWS
	public static final int NET_WM_OPERATE_SET_FISH_EYE_PARAM = 14;        // ��������������۽������� , ��Ӧ NET_IN_WM_SET_FISH_EYE_PARAM �� NET_OUT_WM_SET_FISH_EYE_PARAM
	public static final int NET_WM_OPERATE_SET_CORRIDOR_MODE = 15;		// ���ô�������ģʽ����ӦNET_IN_WM_SET_CORRIDOR_MODE��NET_OUT_WM_SET_CORRIDOR_MODE
	public static final int NET_WM_OPERATE_GET_CORRIDOR_MODE = 16;			// ��ȡ��������ģʽ����ӦNET_IN_WM_GET_CORRIDOR_MODE��NET_OUT_WM_GET_CORRIDOR_MODE
	
}
