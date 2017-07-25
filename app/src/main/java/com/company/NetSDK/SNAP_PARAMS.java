package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Snapshot parameter structure 
 * \else
 * ץͼ�����ṹ��
 * \endif
 */
public class SNAP_PARAMS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Snapshot channel
	 * \else
	 * ץͼ��ͨ��
	 * \endif
	 */
	public int				Channel;
	
	/**
	 * \if ENGLISH_LANG
	 * Image quality:level 1 to level 6
	 * \else
	 * ���ʣ�1~6
	 * \endif
	 */
	public int				Quality;
	
	/**
	 * \if ENGLISH_LANG
	 * Video size;0:QCIF,1:CIF,2:D1
	 * \else
	 * �����С��0��QCIF��1��CIF��2��D1
	 * \endif
	 */
	public int				ImageSize;
	
	/**
	 * \if ENGLISH_LANG
	 * Snapshot mode;0:request one frame,1:send out requestion regularly,2: Request consecutively
	 * \else
	 * ץͼģʽ��0����ʾ����һ֡��1����ʾ��ʱ��������2����ʾ��������
	 * \endif
	 */
	public int				mode;
	
	/**
	 * \if ENGLISH_LANG
	 * Time unit is second.If mode=1, it means send out requestion regularly. The time is valid.
	 * \else
	 * ʱ�䵥λ�룻��mode=1��ʾ��ʱ��������ʱ����ʱ����Ч
	 * \endif
	 */
	public int				InterSnap;
	
	/**
	 * \if ENGLISH_LANG
	 * Request serial number
	 * \else
	 * �������к�
	 * \endif
	 */
	public int				CmdSerial;
}
