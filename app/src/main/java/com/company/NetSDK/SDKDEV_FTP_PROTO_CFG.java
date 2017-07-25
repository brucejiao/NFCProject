package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * ftp configuration
 * \else
 * ftp����
 * \endif
 */
public class SDKDEV_FTP_PROTO_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Whether to enable
	 * \else
	 * �Ƿ�����
	 * \endif
	 */
	public boolean                bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Host IP
	 * \else
	 * ����IP
	 * \endif
	 */
	public byte                szHostIp[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Host port
	 * \else
	 * �����˿�
	 * \endif
	 */
	public short                wHostPort;
	
	/**
	 * \if ENGLISH_LANG
	 * FTP directory path
	 * \else
	 * FTPĿ¼·��
	 * \endif
	 */
    public byte                szDirName[] = new byte[FinalVar.SDK_FTP_MAX_PATH];
    
    /**
	 * \if ENGLISH_LANG
	 * User name
	 * \else
	 * �û���
	 * \endif
	 */
    public byte                szUserName[] = new byte[FinalVar.SDK_FTP_USERNAME_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Password
	 * \else
	 * ����
	 * \endif
	 */
    public byte                szPassword[] = new byte[FinalVar.SDK_FTP_PASSWORD_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Length of the file
	 * \else
	 * �ļ�����
	 * \endif
	 */
    public int                 iFileLen;
    
    /**
	 * \if ENGLISH_LANG
	 * Adjacent the file time intervals (1 to 600), in seconds
	 * \else
	 * �����ļ�ʱ����(1~600),��λ��
	 * \endif
	 */
    public int                 iInterval;
    
    /**
	 * \if ENGLISH_LANG
	 * FTP upload configuration
	 * \else
	 * FTP�ϴ�����
	 * \endif
	 */
    public SDK_FTP_UPLOAD_CFG   struUploadCfg[][] = new SDK_FTP_UPLOAD_CFG[FinalVar.SDK_MAX_CHANNUM][FinalVar.SDK_N_WEEKS];
    
    /**
	 * \if ENGLISH_LANG
	 * 0-FTP, 1-SMB 2-NFS,3-ISCSI
	 * \else
	 * 0-FTP�� 1-SMB 2-NFS��3-ISCSI
	 * \endif
	 */
    public byte                protocol;
    
    /**
	 * \if ENGLISH_LANG
	 * Network storage server version 0 = old FTP (time period) interface (shielded interface 1 = NAS storage period). 
	 * \else
	 * ����洢�������汾0=�ϵ�FTP(��������ʾʱ���)��1=NAS�洢(����������ʱ���)��
	 * \endif
	 */
    public byte                NASVer;
    
    /**
	 * \if ENGLISH_LANG
	 * The functional capabilities mask, bitwise, low 16 (network storage) followed by FTP, SMB, NFS, high 16 (local storage) order DISK, U. 
	 * \else
	 * �����������룬��λ��ʾ����16λ(����洢)���α�ʾFTP��SMB��NFS����16λ(���ش洢)����ΪDISK��U��
	 * \endif
	 */
    public int               dwFunctionMask;
    
    /**
	 * \if ENGLISH_LANG
	 * Data type 0 - type 1 - Video 2 - Pictures 
	 * \else
	 * ��������, 0-��������, 1-��Ƶ, 2-ͼƬ
	 * \endif
	 */
    public byte                bDataType;
    
    public SDKDEV_FTP_PROTO_CFG() {
    	for (int i = 0; i < FinalVar.SDK_MAX_CHANNUM; i++) {
    		for (int j = 0; j < FinalVar.SDK_N_WEEKS; j++) {
    			struUploadCfg[i][j] = new SDK_FTP_UPLOAD_CFG();
    		}
    	}
    }
}
