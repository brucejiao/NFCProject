package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Struct of object info for video analysis 
 * \else
 * ��Ƶ����������Ϣ�ṹ��
 * \endif
 */
public class SDK_MSG_OBJECT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Object ID,each ID represent a unique object
	 * \else
	 * ����ID,ÿ��ID��ʾһ��Ψһ������
	 * \endif
	 */
	public int				nObjectID;
	
	/**
	 * \if ENGLISH_LANG
	 * Object type
	 * \else
	 * ��������
	 * \endif
	 */
	public byte				szObjectType[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * Confidence(0~255),a high value indicate a high confidence
	 * \else
	 * ���Ŷ�(0~255)��ֵԽ���ʾ���Ŷ�Խ��
	 * \endif
	 */
	public int				nConfidence;
	
	/**
	 * \if ENGLISH_LANG
	 * Object action:1:Appear 2:Move 3:Stay 4:Remove 5:Disappear 6:Split 7:Merge 8:Rename
	 * \else
	 * ���嶯��:1:Appear 2:Move 3:Stay 4:Remove 5:Disappear 6:Split 7:Merge 8:Rename
	 * \endif
	 */
	public int				nAction;
	
	/**
	 * \if ENGLISH_LANG
	 * BoundingBox
	 * \else
	 * ��Χ��
	 * \endif
	 */
	public SDK_RECT			BoundingBox = new SDK_RECT();
	
	/**
	 * \if ENGLISH_LANG
	 * The shape center of the object
	 * \else
	 * ��������
	 * \endif
	 */
	public SDK_POINT			Center = new SDK_POINT();
	
	/**
	 * \if ENGLISH_LANG
	 * The number of culminations for the polygon
	 * \else
	 * ����ζ������
	 * \endif
	 */
	public int				nPolygonNum;
	
	/**
	 * \if ENGLISH_LANG
	 * A polygon that have a exactitude figure
	 * \else
	 * �Ͼ�ȷ�����������
	 * \endif
	 */
	public SDK_POINT			Contour[] = new SDK_POINT[FinalVar.SDK_MAX_POLYGON_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * The main color of the object;the first byte indicate red value, as byte order as green, blue, transparence, for example:RGB(0,255,0),transparence = 0, rgbaMainColor = 0x00ff0000.
	 * \else
	 * ��ʾ���ơ������������Ҫ��ɫ�����ֽڱ�ʾ���ֱ�Ϊ�졢�̡�����͸����,����:RGBֵΪ(0,255,0),͸����Ϊ0ʱ, ��ֵΪ0x00ff0000.
	 * \endif
	 */
	public int				rgbaMainColor;
	
	/**
	 * \if ENGLISH_LANG
	 * The interrelated text of object,such as number plate,container number
	 * <pre>
	 * "Unknown"
	 * "Audi"
	 * "Honda" 
	 * "Buick" 
	 * "Volkswagen" 
	 * "Toyota" 
	 * "BMW" 
	 * "Peugeot" 
	 * "Ford" 
	 * "Mazda" 
	 * "Nissan" 
	 * "Hyundai" 
	 * "Suzuki" 
	 * "Citroen" 
	 * "Benz"
	 * "BYD" 
	 * "Geely" 
	 * "Lexus"
	 * "Chevrolet"
	 * "Chery"
	 * "Kia"
	 * "Charade"
	 * "DF"
	 * "Naveco"
	 * "SGMW"
	 * "Jinbei"
	 * </pre>
	 * \else
	 * ��������صĴ�0�������ı������糵�ƣ���װ��ŵȵ�
	 * "ObjectType"Ϊ"Vehicle"����"Logo"ʱ������ʹ��Logo��Vehicle��Ϊ�˼����ϲ�Ʒ����ʾ���֧꣬�֣�
	 * <pre>
	 * "Unknown"δ֪ 
	 * "Audi" �µ�
	 * "Honda" ����
	 * "Buick" ���
	 * "Volkswagen" ����
	 * "Toyota" ����
	 * "BMW" ����
	 * "Peugeot" ����
	 * "Ford" ����
	 * "Mazda" ���Դ�
	 * "Nissan" ��ɣ
	 * "Hyundai" �ִ�
	 * "Suzuki" ��ľ
	 * "Citroen" ѩ����
	 * "Benz" ����
	 * "BYD" ���ǵ�
	 * "Geely" ����
	 * "Lexus" �׿���˹
	 * "Chevrolet" ѩ����
	 * "Chery" ����
	 * "Kia" ����
	 * "Charade" ����
	 * "DF" ����
	 * "Naveco" ��ά��
	 * "SGMW" ����
	 * "Jinbei" ��
	 * </pre>
	 * \endif
	 */
	public byte				szText[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * object sub type,different object type has different sub type:\n
	 * Vehicle Category:"Unknown","Motor","Non-Motor","Bus","Bicycle","Motorcycle"\n
	 * Plate Category:"Unknown","mal","Yellow","DoubleYellow","Police","Armed",\n
	 * "Military","DoubleMilitary","SAR","Trainning"\n
	 * "Personal" ,"Agri","Embassy","Moto","Tractor","Other"\n
	 * HumanFace Category:"Normal","HideEye","HideNose","HideMouth"
	 * \else
	 * ��������𣬸��ݲ�ͬ���������ͣ�����ȡ���������ͣ�
	 * Vehicle Category:"Unknown"  δ֪,"Motor" ������,"Non-Motor":�ǻ�����,"Bus": ������,"Bicycle" ���г�,"Motorcycle":Ħ�г�,"PassengerCar":�ͳ�,\n
	 * "LargeTruck":�����,	"MidTruck":�л���,"SaloonCar":�γ�,"Microbus":�����,"MicroTruck":С����,"Tricycle":���ֳ�,	"Passerby":����	\n												
	 * Plate Category��"Unknown" δ֪,"Normal" ���ƺ���,"Yellow" ����,"DoubleYellow" ˫���β��,"Police" ����"Armed" �侯��,\n
	 * "Military" ���Ӻ���,"DoubleMilitary" ����˫��,"SAR" �۰���������,"Trainning" ����������\n
	 * "Personal" ���Ժ���,"Agri" ũ����,"Embassy" ʹ�ݺ���,"Moto" Ħ�г�����,"Tractor" ����������,"Other" ��������\n
	 * HumanFace Category:"Normal" ��ͨ����,"HideEye" �۲��ڵ�,"HideNose" �����ڵ�,"HideMouth" �첿�ڵ�
	 * \endif
	 */
	public byte                szObjectSubType[] = new byte[64];
	
	/**
	 * \if ENGLISH_LANG
	 * Picture info enable
	 * \else
	 * �Ƿ��������ӦͼƬ�ļ���Ϣ
	 * \endif
	 */
	public boolean          	bPicEnble;
	
	/**
	 * \if ENGLISH_LANG
	 * Picture info
	 * \else
	 * �����ӦͼƬ��Ϣ
	 * \endif
	 */
	public SDK_PIC_INFO      	stPicInfo = new SDK_PIC_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * Is shot frame
	 * \else
	 * �Ƿ���ץ���ŵ�ʶ����
	 * \endif
	 */
	public boolean				bShotFrame;
	
	/**
	 * \if ENGLISH_LANG
	 * RgbaMainColor is enable
	 * \else
	 * ������ɫ(rgbaMainColor)�Ƿ����
	 * \endif
	 */
	public boolean				bColor;
	
	/**
	 * \if ENGLISH_LANG
	 * See EM_TIME_TYPE 
	 * \else
	 * ʱ���ʾ���ͣ���� EM_TIME_TYPE ˵��
	 * \endif
	 */
	public byte            		byTimeType;
	
	/**
	 * \if ENGLISH_LANG
	 * In view of the video compression,current time(when object snap or reconfnition, the frame will be attached to the frame in a video or pictures,means the frame in the original video of the time)
	 * \else
	 * �����ƵŨ������ǰʱ���������ץ�Ļ�ʶ��ʱ���Ὣ��ʶ������֡����һ����Ƶ֡��jpegͼƬ�У���֡����ԭʼ��Ƶ�еĳ���ʱ�䣩
	 * \endif
	 */
	public NET_TIME_EX			stuCurrentTime = new NET_TIME_EX();
	
	/**
	 * \if ENGLISH_LANG
	 * Strart time(object appearing for the first time)
	 * \else
	 * ��ʼʱ��������忪ʼ����ʱ��
	 * \endif
	 */
	public NET_TIME_EX			stuStartTime = new NET_TIME_EX();
	
	/**
	 * \if ENGLISH_LANG
	 * End time(object appearing for the last time)
	 * \else
	 * ����ʱ���������������ʱ��
	 * \endif
	 */
	public NET_TIME_EX			stuEndTime = new NET_TIME_EX();
	
	/**
	 * \if ENGLISH_LANG
	 * Original bounding box(absolute coordinates)
	 * \else
	 * ��Χ��(��������)
	 * \endif
	 */
	public SDK_RECT				stuOriginalBoundingBox = new SDK_RECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Sign bounding box coordinate
	 * \else
	 * ���������Χ��
	 * \endif
	 */
	public SDK_RECT             	stuSignBoundingBox = new SDK_RECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ��ǰ֡��ţ�ץ���������ʱ��֡��
	 * \endif
	 */
	public int					dwCurrentSequence;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ��ʼ֡��ţ����忪ʼ����ʱ��֡��ţ�
	 * \endif
	 */
	public int					dwBeginSequence;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ����֡��ţ���������ʱ��֡��ţ�
	 * \endif
	 */
	public int					dwEndSequence;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ��ʼʱ�ļ�ƫ��, ��λ: �ֽڣ����忪ʼ����ʱ����Ƶ֡��ԭʼ��Ƶ�ļ���������ļ���ʼ����ƫ�ƣ�
	 * \endif
	 */
	public long					nBeginFileOffset;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ����ʱ�ļ�ƫ��, ��λ: �ֽڣ���������ʱ����Ƶ֡��ԭʼ��Ƶ�ļ���������ļ���ʼ����ƫ�ƣ�
	 * \endif
	 */
	public long					nEndFileOffset;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ������ɫ���ƶȣ�ȡֵ��Χ��0-100�������±�ֵ����ĳ����ɫ�����EM_COLOR_TYPE
	 * \endif
	 */
	public byte                	byColorSimilar[] = new byte[EM_COLOR_TYPE.NET_COLOR_TYPE_MAX];
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * �ϰ���������ɫ���ƶ�(��������Ϊ��ʱ��Ч)
	 * \endif
	 */
	public byte                	byUpperBodyColorSimilar[] = new byte[EM_COLOR_TYPE.NET_COLOR_TYPE_MAX];
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * �°���������ɫ���ƶ�(��������Ϊ��ʱ��Ч)
	 * \endif
	 */
	public byte                	byLowerBodyColorSimilar[] = new byte[EM_COLOR_TYPE.NET_COLOR_TYPE_MAX];
	
 	public SDK_MSG_OBJECT() {
 		for(int i=0 ; i<FinalVar.SDK_MAX_POLYGON_NUM ; i++) {
 			Contour[i] = new SDK_POINT();
 		}
 	}
}
