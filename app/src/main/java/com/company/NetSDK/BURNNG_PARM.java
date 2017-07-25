package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Burner control 
 * \else
 * ��¼����
 * \endif
 */
public class BURNNG_PARM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel subnet mask. Bit means the channel to be burned.
	 * \else
	 * ͨ�����룬��λ��ʾҪ��¼��ͨ��
	 * \endif
	 */
	public int					channelMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Burner subnet mask.  Use bit to represent according to the searched burner list 
	 * \else
	 * ��¼�����룬���ݲ�ѯ���Ŀ�¼���б���λ��ʾ
	 * \endif
	 */
	public byte				devMask;
	
	/**
	 * \if ENGLISH_LANG
	 * PIP channel(Channel No.+32)
	 * \else
	 * ���л�ͨ��(ͨ����+32)
	 * \endif
	 */
	public byte                bySpicalChannel;
}
