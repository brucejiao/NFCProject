package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Burner information 
 * \else
 * ��¼����Ϣ
 * \endif
 */
public class NET_DEV_BURNING implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Burner driver type;0:DHFS,1:DISK,2:CDRW
	 * \else
	 * ��¼���������ͣ�0:DHFS,1:DISK,2:CDRW
	 * \endif
	 */
	public int					dwDriverType;
	
	/**
	 * \if ENGLISH_LANG
	 * Bus type;0:USB,1:1394,2:IDE, 3: SATA, 4: ESATA
	 * \else
	 * �������ͣ�0:USB,1:1394,2:IDE, 3: SATA, 4: ESATA
	 * \endif
	 */
	public int					dwBusType;
	
	/**
	 * \if ENGLISH_LANG
	 * Total space(KB)
	 * \else
	 * ������(KB)
	 * \endif
	 */
	public int					dwTotalSpace;
	
	/**
	 * \if ENGLISH_LANG
	 * Free space(KB)
	 * \else
	 * ʣ������(KB)
	 * \endif
	 */
	public int					dwRemainSpace;			 

	/**
	 * \if ENGLISH_LANG
	 * Burner driver name
	 * \else
	 * ��¼����������
	 * \endif
	 */
	public byte				dwDriverName[] = new byte[FinalVar.SDK_BURNING_DEV_NAMELEN];	 
}
