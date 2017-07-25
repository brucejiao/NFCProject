package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * iscsi Direct Deposit��Source Data Server Configuration Port Structure
 * \else
 * iscsiֱ�棬Ԫ���ݷ��������ýӿ�
 * \endif
 */
public class CFG_METADATA_SERVER implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
 	/**
	 * \if ENGLISH_LANG
	 * Enable Swch 
	 * \else
	 * ʹ�ܿ���
	 * \endif
	 */
	public boolean			bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * IP Adrress Or Nerwork Domian Name 
	 * \else
	 * IP��ַ��������
	 * \endif
	 */
	public byte[]			szAddress = new byte[FinalVar.MAX_ADDRESS_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Port No.	
	 * \else
	 * �˿ں�
	 * \endif
	 */
	public int				dwPort;
	
 	/**
	 * \if ENGLISH_LANG
	 * Username 
	 * \else
	 * �ʻ���  
	 * \endif
	 */
	public byte[]			szUserName = new byte[FinalVar.MAX_USERNAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Password 
	 * \else
	 * ����
	 * \endif
	 */
	public byte[]			szPassword = new byte[FinalVar.MAX_PASSWORD_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * distributed ID in a unified way For the Device Using Source Data Server��Device Marked By the ID  
	 * \else
	 * Ϊʹ��Ԫ���ݷ��������豸ͳһ�����ID���豸�Դ�ID��ʶ�Լ�
	 * \endif
	 */
	public byte[]			szDeviceID = new byte[FinalVar.MAX_REMOTEDEVICENAME_LEN];
}

