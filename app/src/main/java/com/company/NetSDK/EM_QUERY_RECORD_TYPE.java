package com.company.NetSDK;

import java.io.Serializable;

public class EM_QUERY_RECORD_TYPE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public final static int EM_RECORD_TYPE_ALL              = 0;            // ����¼��
	public final static int EM_RECORD_TYPE_ALARM            = 1;            // �ⲿ����¼��
	public final static int EM_RECORD_TYPE_MOTION_DETECT    = 2;            // ��̬��ⱨ��¼��
	public final static int EM_RECORD_TYPE_ALARM_ALL        = 3;            // ���б���¼��
	public final static int EM_RECORD_TYPE_CARD             = 4;            // ���Ų�ѯ
	public final static int EM_RECORD_TYPE_CONDITION        = 5;            // ��������ѯ
	public final static int EM_RECORD_TYPE_JOIN             = 6;            // ��ϲ�ѯ
	public final static int EM_RECORD_TYPE_CARD_PICTURE     = 8;            // �����Ų�ѯͼƬ,HB-U��NVS��ʹ��
	public final static int EM_RECORD_TYPE_PICTURE          = 9;            // ��ѯͼƬ,HB-U��NVS��ʹ��
	public final static int EM_RECORD_TYPE_FIELD            = 10;           // ���ֶβ�ѯ
	public final static int EM_RECORD_TYPE_INTELLI_VIDEO   = 11;           // ����¼���ѯ
	public final static int EM_RECORD_TYPE_NET_DATA         = 15;           // ��ѯ��������,�������ɵ�ʹ��
	public final static int EM_RECORD_TYPE_TRANS_DATA       = 16;           // ��ѯ͸����������¼��
	public final static int EM_RECORD_TYPE_IMPORTANT        = 17;           // ��ѯ��Ҫ¼��
	public final static int EM_RECORD_TYPE_TALK_DATA        = 18;           // ��ѯ¼���ļ�
	    
	public final static int EM_RECORD_TYPE_INVALID          = 256;          // ��Ч�Ĳ�ѯ����
}
