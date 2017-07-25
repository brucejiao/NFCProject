package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Push the gateway type
 * \else
 * ������������
 * \endif
 */
public class EM_PUSH_GATEWAY_TYPE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown
	 * \else
	 * δ֪
	 * \endif
	 */
	public static final int EM_PUSH_GATEWAY_TYPE_UNKNOWN = 0; 
	
	/**
	 * \if ENGLISH_LANG
	 * Apple push gateway, ApplePush
	 * \else
	 * ƻ����������, ApplePush
	 * \endif
	 */
	public static final int EM_PUSH_GATEWAY_TYPE_APPLE_PUSH = 1; 
	
	/**
	 * \if ENGLISH_LANG
	 * Android DAHUA push gateway, AndroidDahuaPush
	 * \else
	 * ��׿����������, AndroidDahuaPush
	 * \endif
	 */
	public static final int EM_PUSH_GATEWAY_TYPE_ANDROID_SDKPUSH = 2; 
	
	/**
	 * \if ENGLISH_LANG
	 * Android aurora push gateway, AndroidJPush
	 * \else
	 * ��׿������������, AndroidJPush
	 * \endif
	 */
	public static final int EM_PUSH_GATEWAY_TYPE_ANDROID_JPUSH = 3; 
	
	/**
	 * \if ENGLISH_LANG
	 * Android GCM gateway, AndroidGCM
	 * \else
	 * ��׿GCM����, AndroidGCM
	 * \endif
	 */
	public static final int EM_PUSH_GATEWAY_TYPE_ANDROID_GCM = 4; 
}
