package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * raid control, INetSDK.ControlDevice(SDK_CTRL_RAID)
 * \else
 * raid����, INetSDK.ControlDevice(SDK_CTRL_RAID)
 * \endif
 */
public class CTRL_RAID_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Add,Delete
	 * \else
	 * Add���ӣ�Deleteɾ��
	 * \endif
	 */
	public byte			szAction[] 	= new byte[16];
	
	/**
	 * \if ENGLISH_LANG
	 * Raid name
	 * \else
	 * Raid����
	 * \endif
	 */
	public byte			szName[]	= new byte[16];
	
	/**
	 * \if ENGLISH_LANG
	 * type 1:Jbod     2:Raid0      3:Raid1     4:Raid5
	 * \else
	 * ���� 1:Jbod     2:Raid0      3:Raid1     4:Raid5
	 * \endif
	 */
	public int			nType;
	
	/**
	 * \if ENGLISH_LANG
	 * status 0:unknown ,1:active,2:degraded,3:inactive,4:recovering
	 * \else
	 * ״̬ 0:unknown ��1:active��2:degraded��3:inactive��4:recovering
	 * \endif
	 */
	public int			nStatus;
	
	/**
	 * \if ENGLISH_LANG
	 * nMember count
	 * \else
	 * nMember�������Ч���ݸ���
	 * \endif
	 */
	public int			nCntMem;
	
	/**
	 * \if ENGLISH_LANG
	 * 1,2,3,... 
	 * \else
	 * 1,2,3,... ��ɴ���ͨ��,�Ǹ�����
	 * \endif
	 */
	public int			nMember[]	= new int[32];
	
	/**
	 * \if ENGLISH_LANG
	 * capacity(G)
	 * \else
	 * ����,��λG
	 * \endif
	 */
	public int			nCapacity;
	
	/**
	 * \if ENGLISH_LANG
	 * remain space(M)
	 * \else
	 * ʣ����������λM
	 * \endif
	 */
	public int			nRemainSpace;
	
	/**
	 * \if ENGLISH_LANG
	 * tank 0:main,1:tank1,2:tank2.....
	 * \else
	 * ��չ�� 0:������1:��չ��1��2:��չ��2������
	 * \endif
	 */
	public int			nTank;
}
