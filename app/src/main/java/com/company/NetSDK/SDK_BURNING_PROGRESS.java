package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Burner progress 
 * \else
 * ��¼����
 * \endif
 */
public class SDK_BURNING_PROGRESS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Burner status;0:ready to burn,1:burner typs is not correct. It does not match. 
	 * 2:there is no burner available,3:There is burning in process,4:Burner is not free(It is backup or buring or playback.) 
	 * \else
	 * ��¼��״̬��0�����Կ�¼��1����¼�����Ͳ��ԣ���һ���ǹ����豸��
	 * 2��δ�ҵ���¼����3�������������ڿ�¼��4����¼�����ڷǿ���״̬�����ڱ��ݡ���¼��ط���
	 * \endif
	 */
	public byte				bBurning;
													 
	/**
	 * \if ENGLISH_LANG
	 * CD type;0:private file system,1:Portable HDD or flash disk,2:CD
	 * \else
	 * ��Ƭ���ͣ�0��˽���ļ�ϵͳ��1���ƶ�Ӳ�̻�U�̣�2������
	 * \endif
	 */
	public byte				bRomType;
	
	/**
	 * \if ENGLISH_LANG
	 * Operation type;0:free,1:backup,2:burning,3:playback from the cd 
	 * \else
	 * �������ͣ�0�����У�1�����ڱ����У�2�����ڿ�¼�У�3�����ڽ��й��̻ط�
	 * \endif
	 */
	public byte				bOperateType;
	
	/**
	 * \if ENGLISH_LANG
	 * Backup pr burning status:0:stop or end,1:start,2:error,3:full,4:initializing
	 * \else
	 * ���ݻ��¼����״̬��0-ֹͣ 1-��ʼ 2-���� 3-�� 4-���� 5-���ڳ�ʼ�� 6-��ͣ 7-�ȴ�����
	 * \endif
	 */
	public byte				bType;
	
	/**
	 * \if ENGLISH_LANG
	 * Begin time 
	 * \else
	 * ��ʼʱ��
	 * \endif
	 */
	public NET_TIME			stTimeStart = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * Burning time(second)
	 * \else
	 * �ѿ�¼ʱ��(��)
	 * \endif
	 */
	public int				dwTimeElapse;
	
	/**
	 * \if ENGLISH_LANG
	 * Total space
	 * \else
	 * ����������
	 * \endif
	 */
	public int				dwTotalSpace;
	
	/**
	 * \if ENGLISH_LANG
	 * Free space
	 * \else
	 * ����ʣ������
	 * \endif
	 */
	public int				dwRemainSpace;
	
	/**
	 * \if ENGLISH_LANG
	 * Burned capacity 
	 * \else
	 *�ѿ�¼����
	 * \endif
	 */
	public int				dwBurned;
	
	/**
	 * \if ENGLISH_LANG
	 * Reserved
	 * \else
	 * ����
	 * \endif
	 */
	public int				dwStatus;
	
	/**
	 * \if ENGLISH_LANG
	 * The burning channel mask 
	 * \else
	 * ���ڿ�¼��ͨ������s
	 * \endif
	 */
	public int				wChannelMask;
}
