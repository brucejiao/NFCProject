package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Encode widget-Self-defined title
 * \else
 * �������-�Զ������
 * \endif
 */
public class AV_CFG_VideoWidgetCustomTitle implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Overlay to main stream 
	 * \else
	 * ���ӵ�������
	 * \endif
	 */
	public boolean				bEncodeBlend;
	
	/**
	 * \if ENGLISH_LANG
	 * Overlay to extra stream 1
	 * \else
	 * ���ӵ�������1
	 * \endif
	 */
	public boolean				bEncodeBlendExtra1;
	
	/**
	 * \if ENGLISH_LANG
	 * Overlay to extra stream 2
	 * \else
	 * ���ӵ�������2
	 * \endif
	 */
	public boolean				bEncodeBlendExtra2;
	
	/**
	 * \if ENGLISH_LANG
	 * Overlay to extra stream 3
	 * \else
	 * ���ӵ�������3
	 * \endif
	 */
	public boolean				bEncodeBlendExtra3;
	
	/**
	 * \if ENGLISH_LANG
	 * Overlay to snap
	 * \else
	 * ���ӵ�ץͼ
	 * \endif
	 */
	public boolean				bEncodeBlendSnapshot;
	
	/**
	 * \if ENGLISH_LANG
	 * Foreground color
	 * \else
	 * ǰ��ɫ
	 * \endif
	 */
	public AV_CFG_Color			stuFrontColor = new AV_CFG_Color();
	
	/**
	 * \if ENGLISH_LANG
	 * Background color 
	 * \else
	 * ����ɫ
	 * \endif
	 */
	public AV_CFG_Color			stuBackColor = new AV_CFG_Color();
	
	/**
	 * \if ENGLISH_LANG
	 * Zone. The coordinates value ranges from  0 to 8191. Only use left value and top value.The point (left,top) shall be the same as the point(right,bottom).
	 * \else
	 * ����, ����ȡֵ0~8191, ��ʹ��left��topֵ, ��(left,top)Ӧ��(right,bottom)���ó�ͬ���ĵ�
	 * \endif
	 */
	public AV_CFG_Rect			stuRect = new AV_CFG_Rect();
	
	/**
	 * \if ENGLISH_LANG
	 * Title contents
	 * \else
	 * ��������
	 * \endif
	 */
	public byte			szText[] = new byte[FinalVar.AV_CFG_Custom_Title_Len];
	
	/**
	 * \if ENGLISH_LANG
	 * Overlay to preview mode
	 * \else
	 * ���ӵ�Ԥ����Ƶ
	 * \endif
	 */
	public boolean				bPreviewBlend;
	
	/**
	 * \if ENGLISH_LANG
	 * Title type "Rtinfo" real-time recorder information, "Custom" custom overlay, temperature and humidity overlay, "Title": credit information "Check" check code
	 * \else
	 * �������� "Rtinfo" ʵʱ��¼��Ϣ "Custom" �Զ�����ӡ���ʪ�ȵ��� "Title" :Ƭͷ��Ϣ "Check"  У����
	 * \endif
	 */
    public byte         szType[] = new byte[FinalVar.AV_CFG_Custom_TitleType_Len];
}
