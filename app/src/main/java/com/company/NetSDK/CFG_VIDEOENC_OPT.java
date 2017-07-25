package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video Encoding Options
 * \else
 * ��Ƶ�������
 * \endif
 */
public class CFG_VIDEOENC_OPT implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable 
	 * \else
	 * ʹ��
	 * \endif
	 */
	public boolean				abVideoEnable;
	public boolean				abAudioEnable;
	public boolean				abSnapEnable;
	public boolean              abAudioAdd;                 
	public boolean				abAudioFormat;
	
	/**
	 * \if ENGLISH_LANG
	 * Video Enable 
	 * \else
	 * ��Ƶʹ��
	 * \endif
	 */
	public boolean				bVideoEnable;				

	/**
	 * \if ENGLISH_LANG
	 * Video Format 
	 * \else
	 * ��Ƶ��ʽ
	 * \endif
	 */
	public CFG_VIDEO_FORMAT		stuVideoFormat = new CFG_VIDEO_FORMAT();				

	/**
	 * \if ENGLISH_LANG
	 * Audio Enable 
	 * \else
	 * ��Ƶʹ��
	 * \endif
	 */
	public boolean				bAudioEnable;				

	/**
	 * \if ENGLISH_LANG
	 * Snap Enable 
	 * \else
	 * ��ʱץͼʹ��
	 * \endif
	 */
	public boolean				bSnapEnable;				

	/**
	 * \if ENGLISH_LANG
	 * Audio Add Enable 
	 * \else
	 * ��Ƶ����ʹ��
	 * \endif
	 */
	public boolean              bAudioAddEnable;            

	/**
	 * \if ENGLISH_LANG
	 * Audio Format 
	 * \else
	 * ��Ƶ��ʽ
	 * \endif
	 */
	public CFG_AUDIO_ENCODE_FORMAT	stuAudioFormat = new CFG_AUDIO_ENCODE_FORMAT();			
}
