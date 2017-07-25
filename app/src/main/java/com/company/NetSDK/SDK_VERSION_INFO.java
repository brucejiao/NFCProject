package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device software version information. The higher 16-bit means the main version number and low 16-bit means second version number
 * \else
 * �豸����汾��Ϣ����16λ��ʾ���汾�ţ���16λ��ʾ�ΰ汾��
 * \endif
 */
public class SDK_VERSION_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Software version 
	 * \else
	 * ����汾 
	 * \endif
	 */
	public int				dwSoftwareVersion;
	
	/**
	 * \if ENGLISH_LANG
	 * Software version compiled date 
	 * \else
	 * ����汾�������� 
	 * \endif
	 */
	public int				dwSoftwareBuildDate;
	
	/**
	 * \if ENGLISH_LANG
	 * Dsp Software version 
	 * \else
	 * dsp����汾
	 * \endif
	 */
	public int				dwDspSoftwareVersion;
	
	/**
	 * \if ENGLISH_LANG
	 * Dsp Software version compiled date 
	 * \else
	 * dsp����汾��������
	 * \endif
	 */
	public int				dwDspSoftwareBuildDate;
	
	/**
	 * \if ENGLISH_LANG
	 * Not used 
	 * \else
	 * ����û��ʹ�� 
	 * \endif
	 */
	public int				dwPanelVersion;
	
	/**
	 * \if ENGLISH_LANG
	 * Not used 
	 * \else
	 * ����û��ʹ�� 
	 * \endif
	 */
	public int				dwPanelSoftwareBuildDate;
	
	/**
	 * \if ENGLISH_LANG
	 * Hardware version 
	 * \else
	 * Ӳ���汾 
	 * \endif
	 */
	public int				dwHardwareVersion;
	
	/**
	 * \if ENGLISH_LANG
	 * Not used 
	 * \else
	 * ����û��ʹ�� 
	 * \endif
	 */
	public int				dwHardwareDate;
	
	/**
	 * \if ENGLISH_LANG
	 * Web version 
	 * \else
	 * web�汾
	 * \endif
	 */
	public int				dwWebVersion;
	
	/**
	 * \if ENGLISH_LANG
	 * The date of the web version of the compiler 
	 * \else
	 * web�汾�������� 
	 * \endif
	 */
	public int				dwWebBuildDate;
}
