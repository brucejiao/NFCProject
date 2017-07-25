package com.company.NetSDK;

import java.io.Serializable;

public class SDK_TRAFFICFLOWSTAT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * same as DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO.MachineGroup
	 * \else
	 * ͬDEV_EVENT_TRAFFIC_TRAFFICCAR_INFO.MachineGroup
	 * \endif
	 */
	public byte                szMachineAddress[] = new byte[256];

	/**
	 * \if ENGLISH_LANG
	 * same as DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO.MachineName
	 * \else
	 * ͬDEV_EVENT_TRAFFIC_TRAFFICCAR_INFO.MachineName
	 * \endif
	 */
	public byte                szMachineName[] = new byte[256];

	/**
	 * \if ENGLISH_LANG
	 * DrivingDirection "Approach" means driving direction,where the car is more near;"Leave"-means where if mor far to the car,the scend and third param means the location of the driving direction
	 * \else
	 * ��ʻ����"Approach"-���У����������豸�����Խ��Խ����"Leave"-���У����������豸�����Խ��ԽԶ���ڶ��͵����������ֱ�������к����е������ص㣬UTF-8����
	 * \endif
	 */
	public byte                szDrivingDirection[][] = new byte[3][32];

	/**
	 * \if ENGLISH_LANG
	 * lane number
	 * \else
	 * ������ ʹ���û����õĳ������
	 * \endif
	 */
	public int                 nLane;

	/**
	 * \if ENGLISH_LANG
	 * Statistic time
	 * \else
	 * ͳ��ʱ�䣬ת����UTC
	 * \endif
	 */
	public NET_TIME_EX         UTC = new NET_TIME_EX();

	/**
	 * \if ENGLISH_LANG
	 * Statistic period, m
	 * \else
	 * ͳ�����ڣ���λ����
	 * \endif
	 */
	public int                 nPeriod;

	/**
	 * \if ENGLISH_LANG
	 * passed vehicle number
	 * \else
	 * ͨ����������
	 * \endif
	 */
	public int                 nVehicles;

	/**
	 * \if ENGLISH_LANG
	 * average speed, km/h
	 * \else
	 * ƽ�����٣���λkm/h
	 * \endif
	 */
	public float               fAverageSpeed;

	/**
	 * \if ENGLISH_LANG
	 * average length, m
	 * \else
	 * ƽ����������λ��
	 * \endif
	 */
	public float               fAverageLength;

	/**
	 * \if ENGLISH_LANG
	 * time occupy ratio,
	 * \else
	 * ʱ��ռ���ʣ�����λʱ����ͨ������ĳ�������ʱ����ܺ�ռ��λʱ��ı���
	 * \endif
	 */
	public float               fTimeOccupyRatio;

	/**
	 * \if ENGLISH_LANG
	 * space occupy ratio,
	 * \else
	 * �ռ�ռ���ʣ������ٷ��ʼ����ĳ��������ܺͳ���ʱ�����ڳ���ƽ����ʻ����
	 * \endif
	 */
	public float               fSpaceOccupyRatio;

	/**
	 * \if ENGLISH_LANG
	 * space between two cars,m
	 * \else
	 * ��ͷ��࣬���ڳ���֮��ľ��룬��λ��/��
	 * \endif
	 */
	public float               fSpaceHeadway;

	/**
	 * \if ENGLISH_LANG
	 * time between two cars, s
	 * \else
	 * ��ͷʱ�࣬��λ��/��
	 * \endif
	 */
	public float               fTimeHeadway;

	/**
	 * \if ENGLISH_LANG
	 * car density, every km
	 * \else
	 * �����ܶȣ�ÿ����ĳ���������λ��/km
	 * \endif
	 */
	public float               fDensity;

	/**
	 * \if ENGLISH_LANG
	 * over speed vehicle number
	 * \else
	 * ���ٳ�����
	 * \endif
	 */
	public int                 nOverSpeedVehicles;

	/**
	 * \if ENGLISH_LANG
	 * under speed vehicle number
	 * \else
	 * ���ٳ�����
	 * \endif
	 */
	public int                 nUnderSpeedVehicles;

	/**
	 * \if ENGLISH_LANG
	 * big car number
	 * \else
	 * ������  ���������жϱ�׼�μ�TrafficSnapshot���ñ�
	 * \endif
	 */
	public int                 nLargeVehicles;

	/**
	 * \if ENGLISH_LANG
	 * mid car number
	 * \else
	 * ���ͳ�����
	 * \endif
	 */
	public int                 nMediumVehicles;

	/**
	 * \if ENGLISH_LANG
	 * small car number
	 * \else
	 * С������
	 * \endif
	 */
	public int                 nSmallVehicles;

	/**
	 * \if ENGLISH_LANG
	 * moto car number
	 * \else
	 * Ħ�г�����
	 * \endif
	 */
	public int                 nMotoVehicles;

	/**
	 * \if ENGLISH_LANG
	 * long vehicle number
	 * \else
	 * ����������
	 * \endif
	 */
	public int                 nLongVehicles;
}
