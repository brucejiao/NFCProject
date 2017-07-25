package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video analysis object info expansion structure 
 * \else
 * ��Ƶ����������Ϣ��չ�ṹ��
 * \endif
 */
public class SDK_MSG_OBJECT_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * object ID, each ID means a exclusive object
	 * \else
	 * ����ID,ÿ��ID��ʾһ��Ψһ������
	 * \endif
	 */
	public int                 nObjectID;

	/**
	 * \if ENGLISH_LANG
	 * object  type
	 * \else
	 * ��������
	 * \endif
	 */
	public byte                szObjectType[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * confidence coefficient (0~255)�� value the bigger means  confidence coefficient the higher
	 * \else
	 * ���Ŷ�(0~255)��ֵԽ���ʾ���Ŷ�Խ��
	 * \endif
	 */
	public int                 nConfidence;

	/**
	 * \if ENGLISH_LANG
	 * object  motion :1:Appear 2:Move 3:Stay 4:Remove 5:Disappear 6:Split 7:Merge 8:Rename
	 * \else
	 * ���嶯��:1:Appear 2:Move 3:Stay 4:Remove 5:Disappear 6:Split 7:Merge 8:Rename
	 * \endif
	 */
	public int                 nAction;

	/**
	 * \if ENGLISH_LANG
	 * box
	 * \else
	 * ��Χ��
	 * \endif
	 */
	public SDK_RECT             BoundingBox = new SDK_RECT();

	/**
	 * \if ENGLISH_LANG
	 * object model center
	 * \else
	 * ��������
	 * \endif
	 */
	public SDK_POINT            Center = new SDK_POINT();

	/**
	 * \if ENGLISH_LANG
	 * polygon vertex number
	 * \else
	 * ����ζ������
	 * \endif
	 */
	public int                 nPolygonNum;

	/**
	 * \if ENGLISH_LANG
	 * relatively accurate outline the polygon
	 * \else
	 * �Ͼ�ȷ�����������
	 * \endif
	 */
	public SDK_POINT            Contour[] = new SDK_POINT[FinalVar.SDK_MAX_POLYGON_NUM];

	/**
	 * \if ENGLISH_LANG
	 * means plate, vehicle body and etc. object major color��by byte means ��are red, green, blue and transparency , such as:RGB value is (0,255,0), transparency is 0, its value is 0x00ff0000.
	 * \else
	 * ��ʾ���ơ������������Ҫ��ɫ�����ֽڱ�ʾ���ֱ�Ϊ�졢�̡�����͸����,����:RGBֵΪ(0,255,0),͸����Ϊ0ʱ, ��ֵΪ0x00ff0000.
	 * \endif
	 */
	public int               rgbaMainColor;

	/**
	 * \if ENGLISH_LANG
	 * same as DH_MSG_OBJECT corresponding field
	 * \else
	 * ͬDH_MSG_OBJECT��Ӧ�ֶ�
	 * \endif
	 */
	public byte                szText[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * object sub type ��according to different object  types ��may use the following sub type ��
	 * \else
	 * ��������𣬸��ݲ�ͬ���������ͣ�����ȡ���������ͣ�
	 * \endif
	 */
	public byte                szObjectSubType[] = new byte[64];

	/**
	 * \if ENGLISH_LANG
	 * object corresponding to picture file info or not
	 * \else
	 * �Ƿ��������ӦͼƬ�ļ���Ϣ
	 * \endif
	 */
	public boolean                bPicEnble;

	/**
	 * \if ENGLISH_LANG
	 * object corresponding to picture info
	 * \else
	 * �����ӦͼƬ��Ϣ
	 * \endif
	 */
	public SDK_PIC_INFO         stPicInfo = new SDK_PIC_INFO();

	/**
	 * \if ENGLISH_LANG
	 * snapshot recognition result or not
	 * \else
	 * �Ƿ���ץ���ŵ�ʶ����
	 * \endif
	 */
	public boolean                bShotFrame;

	/**
	 * \if ENGLISH_LANG
	 * object  color (rgbaMainColor) usable or not
	 * \else
	 * ������ɫ(rgbaMainColor)�Ƿ����
	 * \endif
	 */
	public boolean                bColor;

	/**
	 * \if ENGLISH_LANG
	 * lower color (rgbaLowerBodyColor) usable or not
	 * \else
	 * �°�����ɫ(rgbaLowerBodyColor)�Ƿ����
	 * \endif
	 */
	public byte                bLowerBodyColor;

	/**
	 * \if ENGLISH_LANG
	 * time means type �� see EM_TIME_TYPE note
	 * \else
	 * ʱ���ʾ���ͣ����EM_TIME_TYPE˵��
	 * \endif
	 */
	public byte                byTimeType;

	/**
	 * \if ENGLISH_LANG
	 * for video compression�� current time stamp��object snapshot or recognition�� attach this recognition frame in one vire frame or jpegpicture��this frame��s appearance time in original video��
	 * \else
	 * �����ƵŨ������ǰʱ���������ץ�Ļ�ʶ��ʱ���Ὣ��ʶ������֡����һ����Ƶ֡��jpegͼƬ�У���֡����ԭʼ��Ƶ�еĳ���ʱ�䣩
	 * \endif
	 */
	public NET_TIME_EX         stuCurrentTime = new NET_TIME_EX();

	/**
	 * \if ENGLISH_LANG
	 * start time stamp��object start appearance��
	 * \else
	 * ��ʼʱ��������忪ʼ����ʱ��
	 * \endif
	 */
	public NET_TIME_EX         stuStartTime = new NET_TIME_EX();

	/**
	 * \if ENGLISH_LANG
	 * end time stamp��object last aapearance��
	 * \else
	 * ����ʱ���������������ʱ��
	 * \endif
	 */
	public NET_TIME_EX         stuEndTime = new NET_TIME_EX();

	/**
	 * \if ENGLISH_LANG
	 * box(absolute coordinate)
	 * \else
	 * ��Χ��(��������)
	 * \endif
	 */
	public SDK_RECT             stuOriginalBoundingBox = new SDK_RECT();

	/**
	 * \if ENGLISH_LANG
	 * LGO coordinate box
	 * \else
	 * ���������Χ��
	 * \endif
	 */
	public SDK_RECT             stuSignBoundingBox = new SDK_RECT();

	/**
	 * \if ENGLISH_LANG
	 * current frame no.��snapshot this object frame��
	 * \else
	 * ��ǰ֡��ţ�ץ���������ʱ��֡��
	 * \endif
	 */
	public int               dwCurrentSequence;

	/**
	 * \if ENGLISH_LANG
	 * start frame no.��object start appearance frame no.��
	 * \else
	 * ��ʼ֡��ţ����忪ʼ����ʱ��֡��ţ�
	 * \endif
	 */
	public int               dwBeginSequence;

	/**
	 * \if ENGLISH_LANG
	 * end frame no.��object disappearance frame no.��
	 * \else
	 * ����֡��ţ���������ʱ��֡��ţ�
	 * \endif
	 */
	public int               dwEndSequence;

	/**
	 * \if ENGLISH_LANG
	 * start file shift, unit: byte��object start appearance��video in original video file moves toward file origin��
	 * \else
	 * ��ʼʱ�ļ�ƫ��, ��λ: �ֽڣ����忪ʼ����ʱ����Ƶ֡��ԭʼ��Ƶ�ļ���������ļ���ʼ����ƫ�ƣ�
	 * \endif
	 */
	public long               nBeginFileOffset;

	/**
	 * \if ENGLISH_LANG
	 * End file shift, unit: byte��object disappearance��video in original video file moves toward file origin��
	 * \else
	 * ����ʱ�ļ�ƫ��, ��λ: �ֽڣ���������ʱ����Ƶ֡��ԭʼ��Ƶ�ļ���������ļ���ʼ����ƫ�ƣ�
	 * \endif
	 */
	public long               nEndFileOffset;

	/**
	 * \if ENGLISH_LANG
	 * object  color similarity��take  value range ��0-100��group subscript value represents certain color �� see EM_COLOR_TYPE
	 * \else
	 * ������ɫ���ƶȣ�ȡֵ��Χ��0-100�������±�ֵ����ĳ����ɫ�����EM_COLOR_TYPE
	 * \endif
	 */
	public byte                byColorSimilar[] = new byte[EM_COLOR_TYPE.NET_COLOR_TYPE_MAX];

	/**
	 * \if ENGLISH_LANG
	 * upper object  color  similarity (object  type as human is valid )
	 * \else
	 * �ϰ���������ɫ���ƶ�(��������Ϊ��ʱ��Ч)
	 * \endif
	 */
	public byte                byUpperBodyColorSimilar[] = new byte[EM_COLOR_TYPE.NET_COLOR_TYPE_MAX];

	/**
	 * \if ENGLISH_LANG
	 * lower object  color  similarity (object  type as human is valid )
	 * \else
	 * �°���������ɫ���ƶ�(��������Ϊ��ʱ��Ч)
	 * \endif
	 */
	public byte                byLowerBodyColorSimilar[] = new byte[EM_COLOR_TYPE.NET_COLOR_TYPE_MAX];

	/**
	 * \if ENGLISH_LANG
	 * related object ID
	 * \else
	 * �������ID
	 * \endif
	 */
	public int                 nRelativeID;

	/**
	 * \if ENGLISH_LANG
	 * "ObjectType"is "Vehicle"or "Logo"�� means LOGO lower brand��such as Audi A6L��since there are many brands��SDK shows this field in real-time,device filled as real.
	 * \else
	 * "ObjectType"Ϊ"Vehicle"����"Logo"ʱ����ʾ�����µ�ĳһ��ϵ������µ�A6L�����ڳ�ϵ�϶࣬SDKʵ��ʱ͸�����ֶ�,�豸��ʵ��д��
	 * \endif
	 */
	public byte				szSubText[] = new byte[20];

	/**
	 * \if ENGLISH_LANG
	 * Intrusion staff height��unit cm
	 * \else
	 * ������Ա��ߣ���λcm
	 * \endif
	 */
	public int					nPersonStature;

	/**
	 * \if ENGLISH_LANG
	 * Staff intrusion direction
	 * \else
	 * ��Ա���ַ���
	 * \endif
	 */
	public int	emPersonDirection;

	/**
	 * \if ENGLISH_LANG
	 * Use direction same as rgbaMainColor,object  type as human is valid
	 * \else
	 * ʹ�÷���ͬrgbaMainColor,��������Ϊ��ʱ��Ч
	 * \endif
	 */
	public int               rgbaLowerBodyColor;
	
	public SDK_MSG_OBJECT_EX() {
		for (int i = 0; i < FinalVar.SDK_MAX_POLYGON_NUM; i++) {
			Contour[i] = new SDK_POINT();
    	}
	}
}
