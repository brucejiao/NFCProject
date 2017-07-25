package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Auto register service
 * \else
 * ����ע�����
 * \endif
 */
public class SDKDEV_REGISTER_SERVER implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Max IP amount supported.
	 * \else
	 * ֧�ֵ����ip��
	 * \endif
	 */
	public byte                bServerNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Registration server IP, port info.
	 * \else
	 * ע�������ip���˿���Ϣ.
	 * \endif
	 */
	public SDKDEV_SERVER_INFO   lstServer[] = new SDKDEV_SERVER_INFO[FinalVar.SDK_MAX_REGISTER_SERVER_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * ʹ��
	 * \endif
	 */
    public byte                bEnable;
    
    /**
	 * \if ENGLISH_LANG
	 * Device ID
	 * \else
	 * �豸id
	 * \endif
	 */
    public byte                szDeviceID[] = new byte[32];
    
    public SDKDEV_REGISTER_SERVER() {
    	for (int i = 0; i < FinalVar.SDK_MAX_REGISTER_SERVER_NUM; i++) {
    		lstServer[i] = new SDKDEV_SERVER_INFO();
    	}
    }
}
