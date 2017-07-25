package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * PTZ control extensive command 
 * \else
 * ��̨������չ����, SDK_EXTPTZ_ControlType
 * \endif
 */
public class SDK_EXTPTZ_ControlType implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Upper left
	 * \else
	 * ����
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_LEFTTOP = 0x20;
	
	/**
	 * \if ENGLISH_LANG
	 * Upper right 
	 * \else
	 * ����
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_RIGHTTOP = 0x21;
	
	/**
	 * \if ENGLISH_LANG
	 * Down left
	 * \else
	 * ����
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_LEFTDOWN = 0x22;
	
	/**
	 * \if ENGLISH_LANG
	 * Down right 
	 * \else
	 * ����
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_RIGHTDOWN = 0x23;
	
	/**
	 * \if ENGLISH_LANG
	 * Add preset to tour tour preset value
	 * \else
	 * ����Ԥ�õ㵽Ѳ�� Ѳ����· Ԥ�õ�ֵ
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_ADDTOLOOP = 0x24;
	
	/**
	 * \if ENGLISH_LANG
	 * Delete preset in tour tour preset value
	 * \else
	 * ɾ��Ѳ����Ԥ�õ� Ѳ����· Ԥ�õ�ֵ
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_DELFROMLOOP = 0x25;
	
	/**
	 * \if ENGLISH_LANG
	 * Delete tour
	 * \else
	 * ���Ѳ�� Ѳ����·
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_CLOSELOOP = 0x26;
	
	/**
	 * \if ENGLISH_LANG
	 * Begin pan rotation	
	 * \else
	 * ��ʼˮƽ��ת
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_STARTPANCRUISE = 0x27;
	
	/**
	 * \if ENGLISH_LANG
	 * Stop pan rotation	
	 * \else
	 * ֹͣˮƽ��ת
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_STOPPANCRUISE = 0x28;
	
	/**
	 * \if ENGLISH_LANG
	 * Set left limit	
	 * \else
	 * ������߽�
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_SETLEFTBORDER = 0x29;
	
	/**
	 * \if ENGLISH_LANG
	 * Set right limit	
	 * \else
	 * �����ұ߽�
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_SETRIGHTBORDER = 0x2a;
	
	/**
	 * \if ENGLISH_LANG
	 * Begin scanning	
	 * \else
	 * ��ʼ��ɨ
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_STARTLINESCAN = 0x2b;
	
	/**
	 * \if ENGLISH_LANG
	 * Stop scanning	
	 * \else
	 * ֹͣ��ɨ
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_CLOSELINESCAN = 0x2c;
	
	/**
	 * \if ENGLISH_LANG
	 * Start mode	mode line	
	 * \else
	 * ����ģʽ��ʼ	ģʽ��·
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_SETMODESTART = 0x2d;
	
	/**
	 * \if ENGLISH_LANG
	 * Stop mode	mode line
	 * \else
	 * ����ģʽ����	ģʽ��·
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_SETMODESTOP = 0x2e;						
	/**
	 * \if ENGLISH_LANG
	 * Enable mode	Mode line
	 * \else
	 * ����ģʽ	ģʽ��·
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_RUNMODE = 0x2f;							
	/**
	 * \if ENGLISH_LANG
	 * Disable mode	Mode line	
	 * \else
	 * ֹͣģʽ	ģʽ��·
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_STOPMODE = 0x30;							
	/**
	 * \if ENGLISH_LANG
	 * Delete mode	Mode line
	 * \else
	 * ���ģʽ	ģʽ��·
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_DELETEMODE = 0x31;						
	/**
	 * \if ENGLISH_LANG
	 * Flip
	 * \else
	 * ��ת����
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_REVERSECOMM = 0x32;						
	/**
	 * \if ENGLISH_LANG
	 * 3D position	X address(8192)	Y address(8192)	zoom(4)
	 * \else
	 * ���ٶ�λ ˮƽ����(8192) ��ֱ����(8192) �䱶(4)
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_FASTGOTO = 0x33;							
	/**
	 * \if ENGLISH_LANG
	 * Auxiliary open	Auxiliary point	
	 * \else
	 * �������ؿ� ������
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_AUXIOPEN = 0x34;							
	/**
	 * \if ENGLISH_LANG
	 * Auxiliary close	Auxiliary point
	 * \else
	 * �������ع� ������
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_AUXICLOSE = 0x35;						
	/**
	 * \if ENGLISH_LANG
	 * Open dome menu 
	 * \else
	 * ������˵�
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_OPENMENU = 0x36;					
	/**
	 * \if ENGLISH_LANG
	 * Close menu 
	 * \else
	 * �رղ˵�
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_CLOSEMENU = 0x37;						
	/**
	 * \if ENGLISH_LANG
	 * Confirm menu 
	 * \else
	 * �˵�ȷ��
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_MENUOK = 0x38;							
	/**
	 * \if ENGLISH_LANG
	 * Cancel menu 
	 * \else
	 * �˵�ȡ��
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_MENUCANCEL = 0x39;						
	/**
	 * \if ENGLISH_LANG
	 * Menu up 
	 * \else
	 * �˵���
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_MENUUP = 0x3a;							
	/**
	 * \if ENGLISH_LANG
	 * Menu down
	 * \else
	 * �˵���
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_MENUDOWN = 0x3b;							
	/**
	 * \if ENGLISH_LANG
	 * Menu left
	 * \else
	 * �˵���
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_MENULEFT = 0x3c;							
	/**
	 * \if ENGLISH_LANG
	 * Menu right 
	 * \else
	 * �˵���
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_MENURIGHT = 0x3d;						
	/**
	 * \if ENGLISH_LANG
	 * Alarm activate PTZ parm1:Alarm input channel;parm2:Alarm activation type  1-preset 2-scan 3-tour;parm 3:activation value,such as preset value.
	 * \else
	 * ����������̨ parm1����������ͨ����parm2��������������1-Ԥ�õ�2-��ɨ3-Ѳ����parm3������ֵ����Ԥ�õ��
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_ALARMHANDLE = 0x40;				
	/**
	 * \if ENGLISH_LANG
	 * Matrix switch parm1:monitor number(video output number);parm2:video input number;parm3:matrix number
	 * \else
	 * �����л� parm1����������(��Ƶ�����)��parm2����Ƶ����ţ�parm3�������
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_MATRIXSWITCH = 0x41;				
	/**
	 * \if ENGLISH_LANG
	 * Light controller
	 * \else
	 * �ƹ������
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_LIGHTCONTROL = 0x42;						
	/**
	 * \if ENGLISH_LANG
	 * 3D accurately positioning parm1:Pan degree(0~3600); parm2: tilt coordinates(0~900); parm3:zoom(1~128)
	 * \else
	 * ��ά��ȷ��λ parm1��ˮƽ�Ƕ�(0~3600)��parm2����ֱ����(0~900)��parm3���䱶(1~128)
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_EXACTGOTO = 0x43;						
	/**
	 * \if ENGLISH_LANG
	 * Reset  3D positioning as zero
	 * \else
	 * ��ά��λ������λ
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_RESETZERO = 0x44;                        
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * �����ƶ��������param4��Ӧ�ṹPTZ_CONTROL_ABSOLUTELY
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_MOVE_ABSOLUTELY = 0x45;                  
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * �����ƶ��������param4��Ӧ�ṹPTZ_CONTROL_CONTINUOUSLY
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_MOVE_CONTINUOUSLY = 0x46;                
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ��̨���������һ���ٶ�ת��Ԥ��λ�㣬parm4��Ӧ�ṹPTZ_CONTROL_GOTOPRESET
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_GOTOPRESET = 0x47;                       
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ���ÿ�����(param4��Ӧ�ṹ PTZ_VIEW_RANGE_INFO)
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_SET_VIEW_RANGE = 0x49;           	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ���Ծ۽�(param4��Ӧ�ṹPTZ_FOCUS_ABSOLUTELY)
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_FOCUS_ABSOLUTELY = 0x4A;         	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ˮƽ��ɨ(param4��ӦPTZ_CONTROL_SECTORSCAN,param1��param2��param3��Ч)
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_HORSECTORSCAN = 0x4B;             
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ��ֱ��ɨ(param4��ӦPTZ_CONTROL_SECTORSCAN,param1��param2��param3��Ч)
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_VERSECTORSCAN = 0x4C;             
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * �趨���Խ��ࡢ�۽�ֵ,param1Ϊ����,��Χ:[0,255],param2Ϊ�۽�,��Χ:[0,255],param3��param4��Ч
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_SET_ABS_ZOOMFOCUS = 0x4D;         
	/**
	 * \if ENGLISH_LANG
	 * Up + TELE param1=speed (1-8) 
	 * \else
	 * �� + TELE param1=�ٶ�(1-8)����ͬ
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_UP_TELE = 0x70;					
	/**
	 * \if ENGLISH_LANG
	 * Down + TELE
	 * \else
	 * �� + TELE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_DOWN_TELE = 0x71;						
	/**
	 * \if ENGLISH_LANG
	 * Left + TELE
	 * \else
	 * �� + TELE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_LEFT_TELE = 0x72;						
	/**
	 * \if ENGLISH_LANG
	 * Right + TELE
	 * \else
	 * �� + TELE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_RIGHT_TELE = 0x73;						
	/**
	 * \if ENGLISH_LANG
	 * Upper left + TELE
	 * \else
	 * ���� + TELE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_LEFTUP_TELE = 0x74;						
	/**
	 * \if ENGLISH_LANG
	 * Down left + TELE
	 * \else
	 * ���� + TELE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_LEFTDOWN_TELE = 0x75;					
	/**
	 * \if ENGLISH_LANG
	 * Upper right + TELE
	 * \else
	 * ���� + TELE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_TIGHTUP_TELE = 0x76;						
	/**
	 * \if ENGLISH_LANG
	 * Down right + TELE
	 * \else
	 * ���� + TELE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_RIGHTDOWN_TELE = 0x77;					
	/**
	 * \if ENGLISH_LANG
	 * Up + WIDE param1=speed (1-8) 
	 * \else
	 * �� + WIDE param1=�ٶ�(1-8)����ͬ
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_UP_WIDE = 0x78;							
	/**
	 * \if ENGLISH_LANG
	 * Down + WIDE
	 * \else
	 * �� + WIDE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_DOWN_WIDE = 0x79;						
	/**
	 * \if ENGLISH_LANG
	 * Left + WIDE
	 * \else
	 * �� + WIDE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_LEFT_WIDE = 0x7a;						
	/**
	 * \if ENGLISH_LANG
	 * Right + WIDE
	 * \else
	 * �� + WIDE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_RIGHT_WIDE = 0x7b;						
	/**
	 * \if ENGLISH_LANG
	 * Upper left + WIDE
	 * \else
	 * ���� + WIDE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_LEFTUP_WIDE = 0x7c;						
	/**
	 * \if ENGLISH_LANG
	 * Down left+ WIDE
	 * \else
	 * ���� + WIDE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_LEFTDOWN_WIDE = 0x7d;					
	/**
	 * \if ENGLISH_LANG
	 * Upper right + WIDE
	 * \else
	 * ���� + WIDE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_TIGHTUP_WIDE = 0x7e;						
	/**
	 * \if ENGLISH_LANG
	 * Down right + WIDE
	 * \else
	 * ���� + WIDE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_RIGHTDOWN_WIDE = 0x7f;					
	/**
	 * \if ENGLISH_LANG
	 * Max command value
	 * \else
	 * �������ֵ
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_TOTAL = 0x80;							
}
