package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Privacy mask info
 * \else
 * DSP����
 * \endif
 */
public class DSP_ALARM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * 0:DSP normal;1:DSP abnormal
	 * \else
	 * 0,DSP���� 1,DSP�쳣
	 * \endif
	 */
	public boolean                bError;
	
 	/**
	 * \if ENGLISH_LANG
	 * Use bit to stand for. 0=there is no error. Other value=there error.(For each alarm, there is one valid bit.)
	 * <pre>
	 * bit 	DSP alarm 
	 * 1 	bit DSP load failed  
	 * 2 	bit DSP error 
	 * 3 	bit Wrong format  
	 * 4 	bit Does not support current resolution 
	 * 5 	bit Does not support current data format. 
	 * 6 	bit Can not find I frame. 
	 * </pre>
	 * \else
	 * ��λ��ʾ����0��ʾ�д˴���0��ʾû�С�(Ŀǰÿ�α���ֻ��һλ��Ч)
	 * <pre>
	 * bit 	DSP����
	 * 1  	DSP����ʧ�� 
	 * 2  	DSP����
	 * 3  	��ʽ���� 
	 * 4  	�ֱ��ʲ�֧��
	 * 5  	���ݸ�ʽ��֧��
	 * 6  	�Ҳ���I֡
	 * </pre>
	 * \endif
	 */
	public int               dwErrorMask;
	
 	/**
	 * \if ENGLISH_LANG
	 * Use bit to stand for. The decoded channel No. of alarm. dwErrorMask is DSP error. It is valid when there is wrong format, system does not support current resolution, data format
	 * \else
	 * ��λ��ʾ�������Ľ���ͨ���ţ�dwErrorMaskΪDSP������ʽ���ԣ��ֱ��ʲ�֧�֣����ݸ�ʽ��֧��ʱ������Ч
	 * \endif
	 */
	public int               dwDecChnnelMask;
	
 	/**
	 * \if ENGLISH_LANG
	 * Use bit to stand for. The decode channel No. of alarm for 33-64-channel. dwErrorMask is DSP error. It is valid when there is wrong format, system does not support current resolution, data format.
	 * \else
	 * ��λ��ʾ,33-64ͨ���ı����Ľ���ͨ����, dwErrorMaskΪDSP������ʽ���ԣ��ֱ��ʲ�֧�֣����ݸ�ʽ��֧��ʱ������Ч
	 * \endif
	 */
	public int               dwDecChnnelMask1;
}
