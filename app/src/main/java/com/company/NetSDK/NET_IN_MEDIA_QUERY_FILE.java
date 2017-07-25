package com.company.NetSDK;

import java.io.Serializable;


//CLIENT_FindFileEx(DH_FILE_QUERY_FACE) ¼����Ϣ��Ӧ��ѯ����
public class NET_IN_MEDIA_QUERY_FILE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public String           szDirs;                 // ����Ŀ¼�б�,һ�οɲ�ѯ���Ŀ¼,Ϊ�ձ�ʾ��ѯ����Ŀ¼��Ŀ¼֮���Էֺŷָ����硰/mnt/dvr/sda0;/mnt/dvr/sda1��,szDirs==null ��"" ��ʾ��ѯ����
	public int				nMediaType;		        // �ļ����ͣ�0:��ѯ��������,1:��ѯjpgͼƬ,2:��ѯdav
}
