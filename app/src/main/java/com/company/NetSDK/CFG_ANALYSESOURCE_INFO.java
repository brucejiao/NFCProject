package com.company.NetSDK;

import java.io.Serializable;

public class CFG_ANALYSESOURCE_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public boolean				bEnable;								// ��Ƶ����ʹ��
	public int					nChannelID;								// ���ܷ�����ǰ����Ƶͨ����
	public int					nStreamType;							// ���ܷ�����ǰ����Ƶ�������ͣ�0:ץͼ����; 1:������; 2:������1; 3:������2; 4:������3; 5:������
	public byte				    szRemoteDevice[] = new byte[FinalVar.MAX_NAME_LEN];			// �豸��
	public boolean				abDeviceInfo;				        	// �豸��Ϣ�Ƿ���Ч
	public AV_CFG_RemoteDevice  stuDeviceInfo;					        // �豸��Ϣ
	public int                  emSourceType;                         // ��Ƶ����Դ���ͣ���� CFG_VIDEO_SOURCE_TYPE
	public CFG_SOURCE_FILE_INFO stuSourceFile = new CFG_SOURCE_FILE_INFO();                          // ����Ƶ����Դ����ΪCFG_VIDEO_SOURCE_FILESTREAMʱ����Ч
	
	public CFG_ANALYSESOURCE_INFO(int nMaxVideoInputs) {
		stuDeviceInfo  = new AV_CFG_RemoteDevice(nMaxVideoInputs);
	}
}
