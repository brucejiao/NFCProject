package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm arm/disarm control expansion input parameter
 * \else
 * ����������������չ�������
 * \endif
 */
public class CTRL_ARM_DISARM_PARAM_EX_IN implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * arm/disarm status, NET_ALARM_MODE
	 * \else
	 * ������״̬, NET_ALARM_MODE
	 * \endif
	 */
	public int      emState; 
	
	/**
	 * \if ENGLISH_LANG
	 * user password
	 * \else
	 * �û�����
	 * \endif
	 */
    public String         szDevPwd; 
    
    /**
     * \if ENGLISH_LANG
     * scene mode, NET_SCENE_MODE
     * \else
     * �龰ģʽ, NET_SCENE_MODE
     * \endif
     */
    public int      emSceneMode; 
    
    /**
     * \if ENGLISH_LANG
     * transfer target device ID, as NULL means not transfer
     * \else
     * ת��Ŀ���豸ID,ΪNULL��ʾ��ת��
     * \endif
     */
    public String         szDevID; 
}
