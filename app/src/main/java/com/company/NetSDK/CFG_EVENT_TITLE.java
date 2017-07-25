package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Event title content structure
 * \else
 * �¼��������ݽṹ��
 * \endif
 */
public class CFG_EVENT_TITLE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * title content 
	 * \else
	 * ����
	 * \endif
	 */
	public char					szText[] = new char[FinalVar.MAX_CHANNELNAME_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Title Upper left coordinate, use 0-8191  relative coordinate systemTie
	 * \else
	 * �������Ͻ�����, ����0-8191�������ϵ
	 * \endif
	 */
	public CFG_POLYGON			stuPoint = new CFG_POLYGON();			

	/**
	 * \if ENGLISH_LANG
	 * Title width and height,use 0-8191  relative coordinate system��one or two item(s) is(are)0 means text self-adaptive to width-height
	 * \else
	 * ����Ŀ�Ⱥ͸߶�,����0-8191�������ϵ��ĳ���������Ϊ0��ʾ������������Ӧ���
	 * \endif
	 */
	public CFG_SIZE     		stuSize = new CFG_SIZE();			

	/**
	 * \if ENGLISH_LANG
	 * Foreground color
	 * \else
	 * ǰ����ɫ
	 * \endif
	 */
	public CFG_RGBA				stuFrontColor = new CFG_RGBA();		

	/**
	 * \if ENGLISH_LANG
	 * Background color
	 * \else
	 * ������ɫ
	 * \endif
	 */
	public CFG_RGBA				stuBackColor = new CFG_RGBA();		
}
