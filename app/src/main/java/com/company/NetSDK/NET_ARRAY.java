package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * General long character ended with '\0'
 * \else
 * ͨ�ñ䳤�ַ����ԡ�\0������
 * \endif
 */
public class NET_ARRAY implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Buffer zone. Now the min value is 260 byte.Caller shall apply for the memory. The filling in data shall ended with '\0'. 
	 * \else
	 * ������ Ŀǰ��С260�ֽڣ������������ڴ� ������ݱ�֤��'\0'����
	 * \endif
	 */
	public byte[]             pArray;
	
	/**
	 * \if ENGLISH_LANG
	 * Buffer space length
	 * \else
	 * ����ռ䳤��
	 * \endif
	 */
	public int                dwArrayLen;                     
}
