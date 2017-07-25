package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * stream encrypt configuration
 * \else
 * ��������������Ϣ
 * \endif
 */
public class SDKEDV_STREAM_ENCRYPT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * encrypt algorithm type:00: AES,01:DES,02: 3DES
	 * \else
	 * �����㷨���ͣ�00: AES��01:DES��02: 3DES
	 * \endif
	 */
	public byte                    byEncrptAlgoType;

	/**
	 * \if ENGLISH_LANG
	 * encrypt algorithm param
	 * \else
	 * �����㷨����
	 * \endif
	 */
	public ALGO_PARAM_INFO         stuEncrptAlgoparam = new ALGO_PARAM_INFO();

	/**
	 * \if ENGLISH_LANG
	 * each channel's encrypt key's info
	 * \else
	 * ��ͨ������Կ��Ϣ
	 * \endif
	 */
	public ENCRYPT_KEY_INFO        stuEncryptKeys[] = new ENCRYPT_KEY_INFO[32];

	/**
	 * \if ENGLISH_LANG
	 * encrpt plan enable
	 * \else
	 * ���ܼƻ�ʹ��
	 * \endif
	 */
	public byte                    byEncrptPlanEnable;

	/**
	 * \if ENGLISH_LANG
	 * encrpt plan beginning time
	 * \else
	 * ���ܼƻ��Ŀ�ʼʱ��
	 * \endif
	 */
	public NET_TIME                stuPreTime = new NET_TIME();
    
    public SDKEDV_STREAM_ENCRYPT() {
    	for (int i = 0; i < 32; i++) {
    		stuEncryptKeys[i] = new ENCRYPT_KEY_INFO();
    	}
    }
}
