package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * dsp Configuration
 * \else
 * dsp����
 * \endif
 */
public class CFG_DSPENCODECAP_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * \if ENGLISH_LANG
	 * Video Standard Mask,Video Standard Supported By Device Indicated By Bits 
	 * \else
	 * ��Ƶ��ʽ����,��λ��ʾ�豸�ܹ�֧�ֵ���Ƶ��ʽ
	 * \endif
	 */
	public int				dwVideoStandardMask;	

	/**
	 * \if ENGLISH_LANG
	 * Resolution Mask,Resolution Supported By Device Indicated By Bits
	 * \else
	 * �ֱ�������,��λ��ʾ�豸�ܹ�֧�ֵķֱ���
	 * \endif
	 */
	public int				dwImageSizeMask;		

	/**
	 * \if ENGLISH_LANG
	 * Encode Mode Mask,Encode Mode Supported By Device Indicated By Bits
	 * \else
	 * ����ģʽ����,��λ��ʾ�豸�ܹ�֧�ֵı���ģʽ
	 * \endif
	 */
	public int				dwEncodeModeMask;		

	/**
	 * \if ENGLISH_LANG
	 * Multimedia Function Supported By Device Indicated By Bits,First Bit Means Support Main Stream, Second Means Support Substream 1, Third Bit Means Support Main Stream 2, Fifth Bit Means Support jpg Snapshot 
	 * \else
	 * ��λ��ʾ�豸֧�ֵĶ�ý�幦��,\n
	 * ��һλ��ʾ֧��������\n
	 * �ڶ�λ��ʾ֧�ָ�����1\n
	 * ����λ��ʾ֧�ָ�����2\n
	 * ����λ��ʾ֧��jpgץͼ
	 * \endif
	 */
	public int				dwStreamCap;			


	/**
	 * \if ENGLISH_LANG
	 * Means when Main Stream Is Each Resolution,the Substream Resolution Mask Supported 
	 * \else
	 * ��ʾ������Ϊ���ֱ���ʱ,֧�ֵĸ������ֱ�������
	 * \endif
	 */
	public int				dwImageSizeMask_Assi[] = new int[32];

	/**
	 * \if ENGLISH_LANG
	 * DSP Supported Max Encode Power 
	 * \else
	 * DSP֧�ֵ���߱������� 
	 * \endif
	 */
	public int				dwMaxEncodePower;		

	/**
	 * \if ENGLISH_LANG
	 * Each DSP Supports Max Support Channel Num 
	 * \else
	 * ÿ��DSP֧�����������Ƶͨ���� 
	 * \endif
	 */
	public int				wMaxSupportChannel;		

	/**
	 * \if ENGLISH_LANG
	 * DSP If Every Channel Max Encode Set Sync;0:Not Sync,1:Sync 
	 * \else
	 * DSPÿͨ���������������Ƿ�ͬ��;0:��ͬ��,1:ͬ��
	 * \endif
	 */
	public int				wChannelMaxSetSync;		

	/**
	 * \if ENGLISH_LANG
	 * Max Collect Frame Rate Under Different Resolutions,Corresponding To dwVideoStandardMask By Bits 
	 * \else
	 * ��ͬ�ֱ����µ����ɼ�֡��,��dwVideoStandardMask��λ��Ӧ
	 * \endif
	 */
	public byte				bMaxFrameOfImageSize[] = new byte[256];

	/**
	 * \if ENGLISH_LANG
	 * Symbol,Need Meet the Demands Below When Configuration, Or Does Not Work; 
	 * <pre>
	 * 0:Main Stream Encode Capability+Substream Encode Capability >= Device Encode Capability 
	 * 1:Main Stream Encode Capability+Substream Encode Capability >= Device Encode Capability,
	 * Substream Encode Capability >= Main Stream Capability,Substream Resolution >= Main Stream Resolution,
	 * Main Stream and Substream Framerate >= Front End Video Collect Frame Rate
	 * 2:N5 Calculation,Substream Resolution >= Main Stream Resolution,Supported Check Resolution and Corresponding Max Frame Rate
	 * </pre>
	 * \else
	 * ��־,����ʱҪ�������������,�������ò�����Ч;
	 * <pre>
	 * 0:�������ı�������+�������ı������� <= �豸�ı�������,
	 * 1:�������ı�������+�������ı������� <= �豸�ı�������,
	 * �������ı������� <= �������ı�������,
	 * �������ķֱ��� <= �������ķֱ���,
	 * �������͸�������֡�� <= ǰ����Ƶ�ɼ�֡��
	 * 2:N5�ļ��㷽��
	 * �������ķֱ��� <= �������ķֱ���
	 * ��ѯ֧�ֵķֱ��ʺ���Ӧ���֡��
	 * </pre>
	 * \endif
	 */
	public byte				bEncodeCap;				


	/**
	 * \if ENGLISH_LANG
	 * bResolution Length 
	 * \else
	 * bResolution�ĳ���
	 * \endif
	 */
	public byte				byResolutionNum;			

	/**
	 * \if ENGLISH_LANG
	 * bResolution_1 Length 
	 * \else
	 * bResolution_1�ĳ���
	 * \endif
	 */
	public byte				byResolutionNum_1;		

	/**
	 * \if ENGLISH_LANG
	 * Main Stream,Index As Resolution,If Support This Resolution,Then bResolution[n]is Supported Max Frame Rate.Ortherwise0.
	 * \else
	 * ������,���շֱ��ʽ�������,���֧�ָ÷ֱ���,��bResolution[n]����֧�ֵ����֡��.����Ϊ0.
	 * \endif
	 */
	public byte				byResolution[] = new byte[256];								

	/**
	 * \if ENGLISH_LANG
	 * Substream 1,Same as The Main Stream Specification 
	 * \else
	 * ��������1,ͬ������˵��.
	 * \endif
	 */
	public byte				byResolution_1[] = new byte[256];		

	/**
	 * \if ENGLISH_LANG
	 * Supported Resolution Array,See CFG_SNAPCAPINFO_INFO Page CAPTURE_SIZE Specification 
	 * \else
	 * ֧�ֵķֱ�������,�μ�enum CAPTURE_SIZE
	 * \endif
	 */
	public byte				byImageSize[] = new byte[256];		

	/**
	 * \if ENGLISH_LANG
	 * Means When Main Streams are Each Resolition,Wupported SubStream Resolution,Array Subscript Means Main Stream Support Resolition
	 * \else
	 * ��ʾ������Ϊ���ֱ���ʱ,֧�ֵĸ������ֱ���,�����±��ʾ��������֧�ֵķֱ���ֵ.
	 * \endif
	 */
	public byte				byImageSize_Assi[][] = new byte[256][256]; 
}
