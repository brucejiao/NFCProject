package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Query Conditions Of Traffic Black And White List Account Records
 * \else
 * ��ͨ�ڰ������˻���¼��ѯ����
 * \endif
 */
public class FIND_RECORD_TRAFFICREDLIST_CONDITION implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * License Plate Number
	 * \else
	 * ���ƺ�
	 * \endif
	 */
	public char                     szPlateNumber[] = new char[FinalVar.SDK_MAX_PLATE_NUMBER_LEN];

	/**
	 * \if ENGLISH_LANG
	 * License Plate Number Fuzzy Query
	 * \else
	 * ���ƺ���ģ����ѯ
	 * \endif
	 */
	public char                     szPlateNumberVague[] = new char[FinalVar.SDK_MAX_PLATE_NUMBER_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Offset in the query results of first results returned
	 * \else
	 * ��һ�������ؽ���ڲ�ѯ����е�ƫ����
	 * \endif
	 */
	public int                      nQueryResultBegin;

	/**
	 * \if ENGLISH_LANG
	 * Whether support the quick query, TRUE: for quick, quick query time don't wait for all add, delete, change operation is completed. The default is non-quick query
	 * \else
	 * �Ƿ���ٲ�ѯ, TRUE:Ϊ���٣����ٲ�ѯʱ���ȴ���������ɾ���Ĳ�����ɡ�Ĭ��Ϊ�ǿ��ٲ�ѯ
	 * \endif
	 */
	public boolean                     bRapidQuery;
}
