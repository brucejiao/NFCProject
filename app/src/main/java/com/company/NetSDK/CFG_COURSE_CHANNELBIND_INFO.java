package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * configuration of course media channel bind
 * \else
 *  ¼����������ͨ���Ű󶨹�ϵ����
 * \endif
 */
public class CFG_COURSE_CHANNELBIND_INFO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * physical channel of PPT bind��-1 express have no physical channel
	 * \else
	 *  PPT�󶨵�����ͨ���ţ�-1��ʾû�а�
	 * \endif
	 */
	public int                             nPPT; 
    
    /**
     * \if ENGLISH_LANG
     * physical channel of Blackboard bind��-1 express have no physical channel
     * \else
     *  �ڰ�󶨵�����ͨ���ţ�-1��ʾû�а�
     * \endif
     */
	public int                             nBlackboard; 
    
    /**
     * \if ENGLISH_LANG
     * physical channel of StudentFeature bind��-1 express have no physical channel
     * \else
     *  ѧ����д�󶨵�����ͨ���ţ�-1��ʾû�а�
     * \endif
     */
	public int                             nStudentFeature; 
    
    /**
     * \if ENGLISH_LANG
     * physical channel of StudentFullview bind��-1 express have no physical channel
     * \else
     * ѧ��ȫ���󶨵�����ͨ���ţ�-1��ʾû�а�
     * \endif
     */
	public int                             nStudentFullview;               
    
    /**
     * \if ENGLISH_LANG
     * physical channel of TeacherFeature bind��-1 express have no physical channel
     * \else
     *  ��ʦ��д�󶨵�����ͨ���ţ�-1��ʾû�а�
     * \endif
     */
	public int                             nTeacherFeature; 
    
    /**
     * \if ENGLISH_LANG
     * physical channel of TeacherFullview bind��-1 express have no physical channel
     * \else
     *  ��ʦȫ���󶨵�����ͨ���ţ�-1��ʾû�а�
     * \endif
     */
	public int                             nTeacherFullview;               
    
    /**
     * \if ENGLISH_LANG
     * physical channel of TeacherDetect bind��-1 express have no physical channel
     * \else
     *  ��ʦ���󶨵�����ͨ���ţ�-1��ʾû�а�
     * \endif
     */
	public int                             nTeacherDetect;                 
    
    /**
     * \if ENGLISH_LANG
     * physical channel of BlackboardDetect bind��-1 express have no physical channel
     * \else
     * ������󶨵�����ͨ���ţ�-1��ʾû�а�
     * \endif
     */
	public int                             nBlackboardDetect;              
}
