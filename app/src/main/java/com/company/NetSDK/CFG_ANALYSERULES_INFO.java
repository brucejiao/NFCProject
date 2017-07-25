package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * The Video Analysis Rule Configuration Corresponding To Every Video Input
 * \else
 * ÿ����Ƶ����ͨ����Ӧ�������¼����򣺻�����pRuleBuf������¼�������Ϣ��ÿ���¼�������Ϣ����ΪCFG_RULE_INFO+"�¼����Ͷ�Ӧ�Ĺ������ýṹ��"��
 * \endif
 */
public class CFG_ANALYSERULES_INFO
{
 	/**
	 * \if ENGLISH_LANG
	 * Event Rule Count 
	 * \else
	 * �¼��������
	 * \endif
	 */
	public int 						nRuleCount;
	
 	/**
	 * \if ENGLISH_LANG
	 * The Event Analysis Rule Configuration Corresponding To Each Video Input 
	 * \else
	 * ÿ����Ƶ����ͨ����Ӧ����Ƶ�����¼��������û���
	 * \endif
	 */
	public int						nRuleLen;
	
 	/**
	 * \if ENGLISH_LANG
	 * Cache Size 
	 * \else
	 * �����С
	 * \endif
	 */
	public byte[]					pRuleBuf;
	
	public CFG_ANALYSERULES_INFO(int nRuleLen) {
		this.nRuleLen = nRuleLen;
		this.pRuleBuf = new byte[nRuleLen];
	}
}
