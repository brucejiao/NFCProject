package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Configure Automated Maintenance
 * \else
 * �Զ�ά������
 * \endif
 */
public class SDKDEV_AUTOMT_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Automatic restart time
	 * <table>
	 * <tr><td>0</td><td>Never</td></tr>
	 * <tr><td>1</td><td>everyday</td></tr>
	 * <tr><td>2</td><td>everyweek</td></tr>
	 * <tr><td>3</td><td>Every Monday</td></tr>
	 * <tr><td>4</td><td>Every Tuesday</td></tr>
	 * <tr><td>5</td><td>Every Wednesday</td></tr>
	 * <tr><td>6</td><td>Every Thursday</td></tr>
	 * <tr><td>7</td><td>Every Friday</td></tr>
	 * <tr><td>8</td><td>Every Saturday</td></tr>
	 * </table> 
	 * \else
	 * �Զ�����ʱ��
	 * <table>
	 * <tr><td>0</td><td>�Ӳ�</td></tr>
	 * <tr><td>1</td><td>ÿ��</td></tr>
	 * <tr><td>2</td><td>ÿ������</td></tr>
	 * <tr><td>3</td><td>ÿ����һ</td></tr>
	 * <tr><td>4</td><td>ÿ���ڶ�</td></tr>
	 * <tr><td>5</td><td>ÿ������</td></tr>
	 * <tr><td>6</td><td>ÿ������</td></tr>
	 * <tr><td>7</td><td>ÿ������</td></tr>
	 * <tr><td>8</td><td>ÿ������</td></tr>
	 * </table>
	 * \endif
	 */
	public byte                byAutoRebootDay;
	
	/**
	 * \if ENGLISH_LANG
	 * (Restart point time)0��0, 1��1, ......, 23��23
	 * \else
	 * (����ʱ���)0��0�㣬 1��1�㣬 ......�� 23��23��
	 * \endif
	 */
	public byte                byAutoRebootTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Automatically delete files��0��never,1��24 hours,2��48 hours,3��72 hours,4��96 hours,5��week,6��month
	 * \else
	 * �Զ�ɾ���ļ���0���Ӳ���1��24Сʱ��2��48Сʱ��3��72Сʱ��4��96Сʱ��5���ܣ�6����
	 * \endif
	 */
	public byte                byAutoDeleteFilesTime;
}
