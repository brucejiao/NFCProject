package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * encrypt key info
 * \else
 * ������Կ��Ϣ36���ֽ�
 * \endif
 */
public class ENCRYPT_KEY_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * encrypt enable, 0: not encrypt, 1:encrypt
	 * \else
	 * �Ƿ����0:������, 1:����
	 * \endif
	 */
    public byte        byEncryptEnable;
    
    /**
     * \if ENGLISH_LANG
     * des key
     * \else
     * des��Կ
     * \endif
     */
    public byte    byDesKey[] = new byte[8];
    
    /**
     * \if ENGLISH_LANG
     * 3des key
     * \else
     * 3des��Կ
     * \endif
     */
    public byte    by3DesKey[][] = new byte[3][8];
    
    /**
     * \if ENGLISH_LANG
     * aes key
     * \else
     * aes��Կ
     * \endif
     */
    public byte    byAesKey[] = new byte[32];
}
