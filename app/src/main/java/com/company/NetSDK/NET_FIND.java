package com.company.NetSDK;

import java.io.Serializable;

public class NET_FIND implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * thermal temperature query
	 * \else
	 * �ȳ����¶Ȳ�ѯ
	 * \endif
	 * @see 
	 * <table> 
	 * <tr><td>NET_IN_RADIOMETRY_STARTFIND / NET_OUT_RADIOMETRY_STARTFIND</td></tr>
	 * <tr><td>NET_IN_RADIOMETRY_DOFIND / NET_OUT_RADIOMETRY_DOFIND</td></tr>
	 * <tr><td>NET_IN_RADIOMETRY_STOPFIND / NET_OUT_RADIOMETRY_STOPFIND</td></tr>
	 * </table>
	 */
	public static final int NET_FIND_RADIOMETRY   = 0;
}
