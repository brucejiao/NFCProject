package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Mobile Custom Info Uploading Structure
 * \else
 * ����¼����Ϣ�ϴ�
 * \endif
 */
public class ALARM_CARD_RECORD_INFO_UPLOAD implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * Channel No.
	 * \else
	 * ͨ����
	 * \endif
	 */
	public int                    nChannel;
	
 	/**
	 * \if ENGLISH_LANG
	 * Recording or not 
	 * \else
	 * �Ƿ����ڿ���¼��
	 * \endif
	 */
	public boolean                bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Card No. Info 
	 * \else
	 * ������Ϣ
	 * \endif
	 */
	public byte                   szCardInfo[] = new byte[FinalVar.SDK_MAX_CARD_INFO_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * The Card No. Effect of Starting Time 
	 * \else
	 * �ÿ�����Ч��ʼʱ��
	 * \endif
	 */
	public NET_TIME               stuTime = new NET_TIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * Preview Overlay Enable 
	 * \else
	 * Ԥ������ʹ��
	 * \endif
	 */
	public boolean                bPreviewOverlayEn;
	
 	/**
	 * \if ENGLISH_LANG
	 * Overlay Position,1-Upper Left��2-Lower Left��3-Upper Right��4-Lower Right 
	 * \else
	 * ����λ��,1-���ϣ�2-���£�3-���ϣ�4-����
	 * \endif
	 */
	public byte                   byOverlayPos;                       
}
