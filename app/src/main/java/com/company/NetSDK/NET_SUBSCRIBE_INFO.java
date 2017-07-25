package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Subscription type
 * \else
 * ��������
 * \endif
 */
public class NET_SUBSCRIBE_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Event code
	 * \else
	 * �¼���
	 * \endif
	 */
	public int                             nCode;
	
	/**
	 * \if ENGLISH_LANG
	 * Event sub-types, EM_EVENT_SUB_CODE_UNKNOWN as invalid
	 * Effective only VideoAbnormalDetection, alarmLocal and other alarm events include a variety of types 
	 * \else
	 * �¼������� EM_EVENT_SUB_CODE, EM_EVENT_SUB_CODE_UNKNOWNΪ��Ч
	 * ����VideoAbnormalDetection,AlarmLocal�Ȱ����������͵ı����¼���Ч
	 * \endif
	 */
	public int                             emSubCode;
	
	/**
	 * \if ENGLISH_LANG
	 * Subscribe to the number of channels, without channel concept is 0
	 * \else
	 * ���ĵ�ͨ������, ����ͨ��������Ϊ0
	 * \endif
	 */
    public int                             nChnNum;
    
    /**
     * \if ENGLISH_LANG
     * Channel number collection
     * \else
     * ͨ���ż���
     * \endif
     */
    public int                             nIndexs[] = new int[FinalVar.MAX_MOBILE_CHANNEL_NUM];
    
    /**
     * \if ENGLISH_LANG
     * phone number for no answered
     * Event is effective when to subscribe to "CallNoAnswered" 
     * CFG_CMD_MOBILE_PUSH_NOFITY_CFG is valid
     * \else
     * ��Ӧ����루�豸������Щ���룬��Ӧ��ʱ�������ֻ�������Ϣ��
     * ����"CallNoAnswered "�¼�ʱ��Ч
     * CFG_CMD_MOBILE_PUSH_NOFITY_CFGʱ��Ч
     * \endif
     */
    public byte                            szNumber[] = new byte[FinalVar.SDK_COMMON_STRING_16];
    
    public byte                            szSound[] = new byte[FinalVar.SDK_COMMON_STRING_64];
}
