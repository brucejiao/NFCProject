package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * encrypt algorithm
 * \else
 * �����㷨����
 * \endif
 */
public class ALGO_PARAM_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * encrypt length, for example: wEncryptLenth = 128,the effictive encprypt key vlue only include byAesKey[0]~[15] in the  ENCRYPT_KEY_INFO struct
	 * when the encrypt algorithm is AES,it only support 3 kind length such as 128,192,256
	 * when the encrypt algorithm is DES,it has a fixed value 64
	 * when the encrypt algorithm is DES,it means the encrypt key's number(2 or 3 encrypt key)
	 * \else
	 * ��Կ���ȣ���ǰΪAES�㷨����ʱ����ʾ��Կλ��(Ŀǰ֧��128��192��256λ����, ��: wEncryptLenthΪ128������Կ��ϢENCRYPT_KEY_INFO���byAesKey[0]~[15])
	 * ΪDES�㷨����ʱ����Կ���ȹ̶�Ϊ64λ
	 * Ϊ3DES�㷨����ʱ����ʾ��Կ�ĸ���(2��3����Կ)
	 * \endif
	 */
	public short       wEncryptLenth;
	
	/**
	 * \if ENGLISH_LANG
	 * work mode, see EM_ENCRYPT_ALOG_WORKMODE 
	 * \else
	 * ����ģʽ,�ο�ö������ EM_ENCRYPT_ALOG_WORKMODE 
	 * \endif
	 */
	public byte       byAlgoWorkMode; 
}
