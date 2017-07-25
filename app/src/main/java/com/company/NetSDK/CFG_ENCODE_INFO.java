package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Picture Channel Attribute:Picture Channel Attribute
 * \else
 * ͼ��ͨ��������Ϣ
 * \endif
 */
public class CFG_ENCODE_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel No. 1~ Max Channel Num 
	 * \else
	 * ͨ����(0��ʼ)
	 * \endif
	 */
	public int                  nChannelID;							

	/**
	 * \if ENGLISH_LANG
	 * Channel Name 
	 * \else
	 * ͨ������
	 * \endif
	 */
	public char					szChnName[] = new char[FinalVar.MAX_CHANNELNAME_LEN];		

	/**
	 * \if ENGLISH_LANG
	 * Main Stream.0-Normal Record;1-Detect Record;2-Alarm Record
	 * \else
	 * ������,0����ͨ¼��,1-����¼��,2������¼��
	 * \endif
	 */
	public CFG_VIDEOENC_OPT		stuMainStream[] = new CFG_VIDEOENC_OPT[FinalVar.MAX_VIDEOSTREAM_NUM];	

	/**
	 * \if ENGLISH_LANG
	 * Substream.0-Substream1;1-Substream2;2-Substream1;
	 * \else
	 * ������,0��������1,1��������2,2��������3
	 * \endif
	 */
	public CFG_VIDEOENC_OPT		stuExtraStream[] = new CFG_VIDEOENC_OPT[FinalVar.MAX_VIDEOSTREAM_NUM];

	/**
	 * \if ENGLISH_LANG
	 * Snapshot.0-Normal Snapshot;1-Detect Snapshot;2-Alarm Snapshot;
	 * \else
	 * ץͼ,0����ͨץͼ,1������ץͼ,2������ץͼ
	 * \endif
	 */
	public CFG_VIDEOENC_OPT		stuSnapFormat[] = new CFG_VIDEOENC_OPT[FinalVar.MAX_VIDEOSTREAM_NUM];	

	/**
	 * \if ENGLISH_LANG
	 * Supported Area Cover Type(Capability Introduction,Read Only):Mask,First Bte:Device Local Preview��Second Bit:Record And networkMonitor 
	 * \else
	 * �����ڸ���������,��λ�ֱ��Ǳ���Ԥ����¼���������
	 * \endif
	 */
	public int					dwCoverAbilityMask;					

	/**
	 * \if ENGLISH_LANG
	 * Area Cover Switch 0x00 Not Enable COver��0x01 Only Cover Preview��0x10 Only Cover Record��0x11 Cover All 
	 * \else
	 * �����ڸ�ʹ������,��λ�ֱ��Ǳ���Ԥ����¼���������
	 * \endif
	 */
	public int					dwCoverEnableMask;					

	/**
	 * \if ENGLISH_LANG
	 * Video Cover 
	 * \else
	 * ���򸲸�
	 * \endif
	 */
	public CFG_VIDEO_COVER		stuVideoCover = new CFG_VIDEO_COVER();						

	/**
	 * \if ENGLISH_LANG
	 * Channel Title 
	 * \else
	 * ͨ������
	 * \endif
	 */
	public CFG_OSD_INFO			stuChnTitle = new CFG_OSD_INFO();						

	/**
	 * \if ENGLISH_LANG
	 * Time Title 
	 * \else
	 * ʱ�����
	 * \endif
	 */
	public CFG_OSD_INFO			stuTimeTitle = new CFG_OSD_INFO();						

	/**
	 * \if ENGLISH_LANG
	 * Video Color 
	 * \else
	 * ������ɫ
	 * \endif
	 */
	public CFG_COLOR_INFO		stuVideoColor = new CFG_COLOR_INFO();						

	/**
	 * \if ENGLISH_LANG
	 * Audio Format 
	 * <pre>
	 * Enumerate Value				Corresponding Audio Format 
	 * AUDIO_FORMAT_G711A = 0		G711a 
	 * AUDIO_FORMAT_PCM = 1			PCM 
	 * AUDIO_FORMAT_G711U = 2		G711u 
	 * AUDIO_FORMAT_AMR = 3			AMR 
	 * AUDIO_FORMAT_AAC = 4			AAC 
	 * </pre>
	 * \else
	 * ��Ƶ��ʽ: 0:G711A,1:PCM,2:G711U,3:AMR,4:AAC
	 * \endif
	 */
	public int				    emAudioFormat;                      

	/**
	 * \if ENGLISH_LANG
	 * Protocol Version, Read Only 
	 * \else
	 * Э��汾��, ֻ��
	 * \endif
	 */
	public int					nProtocolVer;						
	
	public CFG_ENCODE_INFO() {
		for (int i = 0; i < FinalVar.MAX_VIDEOSTREAM_NUM; i++) {
			stuMainStream[i] = new CFG_VIDEOENC_OPT();
			stuExtraStream[i] = new CFG_VIDEOENC_OPT();
			stuSnapFormat[i] = new CFG_VIDEOENC_OPT();
		}
	}
}
