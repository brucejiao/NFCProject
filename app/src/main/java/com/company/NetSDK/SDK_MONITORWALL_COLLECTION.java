package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Plan of monitor wall
 * \else
 * ����ǽԤ�� 
 * \endif
 */
public class SDK_MONITORWALL_COLLECTION implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Name
	 * \else
	 * ����ǽԤ������
	 * \endif
	 */
	public byte				szName[] = new byte[FinalVar.SDK_DEVICE_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Area array
	 * \else
	 * ��������
	 * \endif
	 */
	public SDK_BLOCK_COLLECTION	stuBlocks[] = new SDK_BLOCK_COLLECTION[FinalVar.SDK_MAX_BLOCK_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Area count
	 * \else
	 * ��������
	 * \endif
	 */
	public int					nBlocksCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Control ID
	 * \else
	 * ����ID
	 * \endif
	 */
	public byte				szControlID[] = new byte[FinalVar.SDK_DEV_ID_LEN_EX];	

	public SDK_MONITORWALL_COLLECTION() {
		for (int i = 0; i < stuBlocks.length; i++) {
			stuBlocks[i] = new SDK_BLOCK_COLLECTION();
		}
	}
}
