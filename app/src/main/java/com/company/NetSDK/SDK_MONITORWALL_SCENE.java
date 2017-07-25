package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * tv wall scheme tour status info 
 * \else
 * ����ǽԤ����Ѳ״̬��Ϣ
 * \endif
 */
public class SDK_MONITORWALL_SCENE implements Serializable {
	private static final long serialVersionUID = 1L;
	
    public byte[]                  szName = new byte[FinalVar.SDK_DEV_NAME_LEN];        // ��ǰԤ������
    public byte[]                  szControlID = new byte[FinalVar.SDK_DEV_ID_LEN];     // ����ID
    public SDK_MONITORWALL         stuMonitorWall;                 // ����ǽ����    
    public SDK_SPLIT_SCENE[]       pstuSplitScene;                 // ƴ����������Ϣ����, �û������ڴ�
    public int                     nMaxSplitSceneCount;            // ƴ�������������С, �û���д
    public int                     nRetSplitSceneCount;            // ���ص�ƴ������������

    public SDK_MONITORWALL_SCENE(int splitSceneCount, int blockCount, int OutputCount, int windowCount) {
    	stuMonitorWall = new SDK_MONITORWALL(blockCount, OutputCount);
    	
    	this.nMaxSplitSceneCount = splitSceneCount;
    	pstuSplitScene = new SDK_SPLIT_SCENE[nMaxSplitSceneCount];
    	
    	for(int i = 0; i < nMaxSplitSceneCount; ++i) {
    		pstuSplitScene[i] =  new SDK_SPLIT_SCENE(windowCount);
    	}
    }
}
