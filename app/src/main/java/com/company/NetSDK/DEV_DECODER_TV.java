package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * TV parameters
 * \else
 * TV������Ϣ
 * \endif
 */
public class DEV_DECODER_TV implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * TV ID
	 * \else
	 * TV��
	 * \endif
	 */
	public int				nID;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable, open or close
	 * \else
	 * ʹ�ܣ�������ر�
	 * \endif
	 */
	public boolean			bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Partition number
	 * \else
	 *  ����ָ���
	 * \endif
	 */
	public int				nSplitType;
	
	/**
	 * \if ENGLISH_LANG
	 * All encoder information
	 * \else
	 * �������������ϢdwDisplayType=SDK_SPLIT_DISPLAY_TYPE_GENERALʱ��Ч
	 * \endif
	 */
	public DEV_ENCODER_INFO stuDevInfo[] = new DEV_ENCODER_INFO[16];
	
	/**
	 * \if ENGLISH_LANG
	 * Split mode supported
	 * \else
	 * ֧�ֵķָ�ģʽ
	 * \endif
	 */
	public byte			bySupportSplit[] = new byte[10];
	
	/**
	 * \if ENGLISH_LANG
	 * Channel input no. 
	 * \else
	 * ����ͨ�����,dwDisplayType=SDK_SPLIT_DISPLAY_TYPE_PIPʱ��ʾ���л���ʾ��������Ч��
	 * \endif
	 */
	public byte            byGroupNo;
	
	/**
	 * \if ENGLISH_LANG
	 * Display Type, can look for DH_SPLIT_DISPLAY_TYPE
	 * \else
	 * ��ʾ���ͣ������SDK_SPLIT_DISPLAY_TYPE��ע�͸�ģʽ����ʾ������"PicInPic"����, ��ģʽ����ʾ���ݰ�NVD���й����������DisChn�ֶξ����������ݣ�û����һ����ʱ��Ĭ��Ϊ��ͨ��ʾ����,��"General"��
	 * \endif
	 */
	public int             dwDisplayType;
    
    public DEV_DECODER_TV() {
    	for (int i=0 ; i<16 ; i++) {
    		stuDevInfo[i] = new DEV_ENCODER_INFO();
    	}
    }
}
