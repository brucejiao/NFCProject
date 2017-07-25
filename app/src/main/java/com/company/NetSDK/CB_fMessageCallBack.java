package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Alarm message callback function original shape
 * \else
 * ��Ϣ�ص�����ԭ��
 * \endif
 */
public interface CB_fMessageCallBack {

	/**
	 * \if ENGLISH_LANG
	 * Alarm message callback function original shape
	 * @param lCommand recall type,as pBuf 
	 * @param lLoginID  login handle, value form {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx}or{@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param obj receive alarm data buffering,based on called monitoring interface and lCommand value differ,filled data differ\n
	 * if called monitoring interface is CLIENT_StartListen lCommand value may be:
	 * <table>
	 * <tr><td>lCommand</td><td>pBuf</td></tr>
	 * <tr><td>SDK_COMM_ALARM</td><td>data is 1 NET_CLIENT_STATE structure .</td></tr>
	 * <tr><td>SDK_SHELTER_ALARM</td><td>data is 16 byte, each byte means 1 video channel mask alarm status,1 is has alarm,0 is no alarm </td></tr>
	 * <tr><td>SDK_DISK_FULL_ALARM</td><td>data is 1��DWORD value,1 means hard disk full ,0 means hard disk unfull </td></tr>
	 * <tr><td>SDK_DISK_ERROR_ALARM	</td><td>data is one DWORD value,by means up to 32 hard disk malfunction alarm,each is 1 means has alarm, is 0 means no alarm </td></tr>
	 * <tr><td>SDK_SOUND_DETECT_ALARM</td><td>data is 16 byte, each byte means 1 video channel audio alarm status,1 is has alarm,0 is no alarm </td></tr>
	 * <tr><td>SDK_ALARM_DECODER_ALARM</td><td>data is 16 byte, each byte means 1 alarm decoder channel alarm status,1 is has alarm ,0 is no alarm </td></tr>
	 * </table>
	 * \n
	 * ������õ������ӿ�ΪCLENT_StartListenEx,��lCommand�Ŀ���ֵ��:
	 * <table>
	 * <tr><td>lCommand</td><td>pBuf</td></tr>
	 * <tr><td>SDK_ALARM_ALARM_EXdata</td><td>byte and device alarm channel number are same , each byte means 1 alarm channel alarm status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_MOTION_ALARM_EXdata</td><td>byte and device video channel number are same , each byte means 1 video channel dynamic detection alarm status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_VIDEOLOST_ALARM_EX</td><td>data byte and device video channel number are same , each byte means 1 video channel video loss alarm status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_SHELTER_ALARM_EX</td><td>data byte and device video channel number are same , each byte means 1 video channel mask (black screen) alarm status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_SOUND_DETECT_ALARM_EX</td><td>data is 16 byte , each byte means 1 video channel audio detection alarm status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_DISKFULL_ALARM_EX</td><td>data is 1 byte ,1 is has hard disk full alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_DISKERROR_ALARM_EX</td><td>data is 32 byte , each byte means 1 hard disk malfunction alarm status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_ENCODER_ALARM_EX	</td><td>data is 16 byte,each byte means 1 channel encoder status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_REBOOT_EVENT_EX</td><td>device reboot event,when user perform config, some need device to reboot as valid,when receive this event,may call to reboot interface to reboot device. </td></tr>
	 * <tr><td>SDK_URGENCY_ALARM_EX</td><td>emergency alarm,data is 16 byte,each byte means 1 channel encoder status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_WIRELESS_ALARM_EX</td><td>wireless alarm,data is 16 byte , each byte means 1 channel encoder status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_NEW_SOUND_DETECT_ALARM_EX</td><td>new audio detection alarm,alarm info structure as SDK_NEW_SOUND_ALARM_STATE. </td></tr>
	 * <tr><td>SDK_ALARM_DECODER_ALARM_EX</td><td>alarm decoder alarm , alarm structure as ALARM_DECODER_ALARM. </td></tr>
	 * <tr><td>SDK_DECODER_DECODE_ABILITY</td><td>decoder: decoder insufficient capacity alarm , 1 byte ,0:normal decode 1: means exceed decode capacity. </td></tr>
	 * <tr><td>SDK_FDDI_DECODER_ABILITY</td><td>fibre-optical encoder status alarm , structure as ALARM_FDDI_ALARM. </td></tr>
	 * <tr><td>SDK_PANORAMA_SWITCH_ALARM_EX</td><td>scene change alarm , data is 16 byte , each byte means 1 channel encoder status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_LOSTFOCUS_ALARM_EX</td><td>focus loss alarm , data is 16 byte , each byte means 1 channel encoder status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_OEMSTATE_EX</td><td>oem newsstand status ,type is BYTE. </td></tr>
	 * <tr><td>SDK_DSP_ALARM_EX</td><td>DSP alarm ,type is DSP_ALARM. </td></tr>
	 * <tr><td>SDK_ATMPOS_BROKEN_EX</td><td>atm and pos device device disconnect alarm , type is BYTE, 0:disconnected 1:connected. </td></tr>
	 * <tr><td>SDK_RECORD_CHANGED_EX</td><td>record status change alarm , data is ALARM_RECORDING_CHANGED. structure group  </td></tr>
	 * <tr><td>SDK_CONFIG_CHANGED_EX</td><td>config change alarm ,pBuf is vacant . </td></tr>
	 * <tr><td>SDK_DEVICE_REBOOT_EX</td><td>device reboot alarm ,pBuf is vacant . </td></tr>
	 * <tr><td>SDK_PTZ_LOCATION_EXPTZ</td><td>positioning info ALARM_PTZ_LOCATION_INFO.</td></tr> 
	 * <tr><td>ALARM_WINGDING_INFO</td><td>coil/car detector malfucntion alarm ALARM_WINGDING_INFO.</td></tr> 
	 * <tr><td>SDK_TRAF_CONGESTION_ALARM_EX</td><td>bust traffic alarm (traffic is abnormal)ALARM_TRAF_CONGESTION_INFO.</td></tr> 
	 * <tr><td>SDK_TRAF_EXCEPTION_ALARM_EX</td><td>abnormal traffic alarm (traffic flow close to 0 or abnormal vacant closed)ALARM_TRAF_EXCEPTION_INFO.</td></tr> 
	 * <tr><td>SDK_EQUIPMENT_FILL_ALARM_EX</td><td>backlight device malfunction alarm ALARM_EQUIPMENT_FILL_INFO.</td></tr> 
	 * <tr><td>SDK_ALARM_ARM_DISARM_STATE</td><td>alarm arm/disarm status ALARM_EQUIPMENT_FILL_INFO.</td></tr> 
	 * <tr><td>SDK_ALARM_ACC_POWEROFF ACC</td><td>outage alarm , type is DWORD 0:ACC electric 1:ACC outage </td></tr>
	 * <tr><td>SDK_ALARM_3GFLOW_EXCEED</td><td>3G flow exceend threshold value alarm DHDEV_3GFLOW_EXCEED_STATE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_SPEED_LIMIT</td><td>limit alarm ALARM_SPEED_LIMIT </td></tr>
	 * <tr><td>SDK_ALARM_VEHICLE_INFO_UPLOAD</td><td>mobile user customized info uploadALARM_VEHICLE_INFO_UPLOAD </td></tr>
	 * <tr><td>SDK_STATIC_ALARM_EX</td><td>data byte and device video channel number are same , each byte means 1 video channel ��̬ detection alarm status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_PTZ_LOCATION_EXPTZ</td><td>positioning info SDK_PTZ_LOCATION_INFO </td></tr>
	 * <tr><td>SDK_ALARM_CARD_RECORD_UPLOAD</td><td>card NO. record uploadALARM_CARD_RECORD_INFO_UPLOAD </td></tr>
	 * <tr><td>SDK_ALARM_ATM_INFO_UPLOAD</td><td>ATM trade info uploadALARM_ATM_INFO_UPLOAD </td></tr>
	 * <tr><td>SDK_ALARM_ENCLOSURE</td><td>electronic fence alarm ALARM_ENCLOSURE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_SIP_STATESIP</td><td>status alarm ALARM_SIP_STATE </td></tr>
	 * <tr><td>SDK_ALARM_RAID_STATE	</td><td>RAID abnormal alarm ALARM_RAID_INFO</td></tr>
	 * <tr><td>SDK_ALARM_CROSSING_SPEED_LIMIT</td><td>speed limit alarm ALARM_SPEED_LIMIT </td></tr>
	 * <tr><td>SDK_ALARM_OVER_LOADING</td><td>overload alarm ALARM_OVER_LOADING </td></tr>
	 * <tr><td>SDK_ALARM_HARD_BRAKING</td><td>quick brake alarm ALARM_HARD_BRAKING </td></tr>
	 * <tr><td>SDK_ALARM_SMOKE_SENSOR</td><td>smoke alarm ALARM_SMOKE_SENSOR </td></tr>
	 * <tr><td>SDK_ALARM_TRAFFIC_LIGHT_FAULT</td><td>traffic light malfucntion alarm ALARM_TRAFFIC_LIGHT_FAULT </td></tr>
	 * <tr><td>SDK_ALARM_TRAFFIC_FLUX_STAT</td><td>traffic flow statistics alarm ALARM_TRAFFIC_FLUX_LANE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_CAMERA_MOVE</td><td>camera shift alarm eventALARM_CAMERA_MOVE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_DETAILEDMOTION</td><td>dynamic detection alarm report infoALARM_DETAILEDMOTION_CHNL_INFO </td></tr>
	 * <tr><td>SDK_ALARM_STORAGE_FAILURE</td><td>albormal storage alarm , data is ALARM_STORAGE_FAILURE structure group  </td></tr>
	 * <tr><td>SDK_ALARM_FRONTDISCONNECT</td><td>front end IPC offline alarm ALARM_FRONTDISCONNET_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ALARM_EX_REMOTE</td><td>remote external alarm ALARM_REMOTE_ALARM_INFO </td></tr>
	 * <tr><td>SDK_ALARM_BATTERYLOWPOWER</td><td>low battery alarm ALARM_BATTERYLOWPOWER_INFO </td></tr>
	 * <tr><td>SDK_ALARM_TEMPERATURE</td><td>over heat alarm ALARM_TEMPERATURE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_TIREDDRIVE</td><td>fatigue driving alarm ALARM_TIREDDRIVE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_LOST_RECORD</td><td>record loss event alarm ALARM_LOST_RECORD </td></tr>
	 * <tr><td>SDK_ALARM_HIGH_CPUCPU</td><td>over used event alarm ALARM_HIGH_CPU </td></tr>
	 * <tr><td>SDK_ALARM_LOST_NETPACKET</td><td>net send data loss event alarm ALARM_LOST_NETPACKET </td></tr>
	 * <tr><td>SDK_ALARM_HIGH_MEMORY</td><td>memory over used event alarm ALARM_HIGH_MEMORY </td></tr>
	 * <tr><td>SDK_LONG_TIME_NO_OPERATION</td><td>WEB user long time no operation event( no ectension info) </td></tr>
	 * <tr><td>SDK_BLACKLIST_SNAP</td><td>black list snapshot SDK_BLACKLIST_SNAP_INFO </td></tr>
	 * <tr><td>SDK_ALARM_DISK</td><td>HDD alarmALARM_DISK_INFO </td></tr>
	 * <tr><td>SDK_ALARM_FILE_SYSTEM</td><td>file system alarmALARM_FILE_SYSTEM_INFO </td></tr>
	 * <tr><td>SDK_ALARM_IVS</td><td>intelligent alarmALARM_IVS_INFO </td></tr>
	 * <tr><td>SDK_ALARM_GOODS_WEIGHT_UPLOADload</td><td>reportALARM_GOODS_WEIGHT_UPLOAD_INFO </td></tr>
	 * <tr><td>SDK_ALARM_GOODS_WEIGHT</td><td>load info alarmALARM_GOODS_WEIGHT_INFO </td></tr>
	 * <tr><td>SDK_GPS_STATUS</td><td>GPSNET_GPS_STATUS_INFO </td></tr>
	 * <tr><td>SDK_ALARM_DISKBURNED_FULL</td><td>HDD write alarmALARM_DISKBURNED_FULL_INFO </td></tr>
	 * <tr><td>SDK_ALARM_STORAGE_LOW_SPACE</td><td>storage no spaceALARM_STORAGE_LOW_SPACE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_DISK_FLUX</td><td>abnormalALARM_DISK_FLUX </td></tr>
	 * <tr><td>SDK_ALARM_NET_FLUX</td><td>abnormalALARM_NET_FLUX </td></tr>
	 * <tr><td>SDK_ALARM_FAN_SPEED</td><td>fan abnormalALARM_FAN_SPEED </td></tr>
	 * <tr><td>SDK_ALARM_STORAGE_FAILURE_EX</td><td>storage errorALARM_STORAGE_FAILURE_EX </td></tr>
	 * <tr><td>SDK_ALARM_RECORD_FAILED</td><td>record abnormalALARM_RECORD_FAILED_INFO </td></tr>
	 * <tr><td>SDK_ALARM_STORAGE_BREAK_DOWN</td><td>storage crashALARM_STORAGE_BREAK_DOWN_INFO </td></tr>
	 * <tr><td>SDK_ALARM_VIDEO_ININVALID</td><td>video in failedALARM_VIDEO_ININVALID_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ALARM_EX2</td><td>local of alarm_input channel eventALARM_ALARM_INFO_EX2 </td></tr>
	 * <tr><td>SDK_ALARM_POWERFAULT</td><td>powerfault envetALARM_POWERFAULT_INFO </td></tr>
	 * <tr><td>SDK_ALARM_CHASSISINTRUDED</td><td>chaiisintruded eventALARM_CHASSISINTRUDED_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ALARMEXTENDED</td><td>extended alarm_input channel event ALARM_ALARMEXTENDED_INFO </td></tr>
	 * <tr><td>SDK_ALARM_TALKING_INVITE</td><td>device invite talking eventALARM_TALKING_INVITE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ARMMODE_CHANGE_EVENT</td><td>device's armmode changed eventALARM_ARMMODE_CHANGE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_BYPASSMODE_CHANGE_EVENT</td><td>defence area bypassmode changed eventALARM_BYPASSMODE_CHANGE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ACCESS_CTL_NOT_CLOS</td><td>Eaccess not close eventALARM_ACCESS_CTL_NOT_CLOSE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ACCESS_CTL_BREAK_IN</td><td>break in eventALARM_ACCESS_CTL_BREAK_IN_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ACCESS_CTL_REPEAT_ENTER</td><td>repeat enter eventALARM_ACCESS_CTL_REPEAT_ENTER_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ACCESS_CTL_DURESS</td><td>duress swing card eventALARM_ACCESS_CTL_DURESS_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ACCESS_CTL_EVENT</td><td>access eventALARM_ACCESS_CTL_EVENT_INFO </td></tr>
	 * </table>
	 * some operation asynchronous recall event, lCommand value may be:
	 * <table>
	 * <tr><td>command</td><td>xplanation</td></tr>
	 * <tr><td>SDK_CONFIG_RESULT_EVENT_EX</td><td>data is change config return code,return structure as DEV_SET_RESULT. </td></tr>
	 * <tr><td>SDK_REBOOT_EVENT_EX</td><td>device reboot event�� if reboot command not sent,current change will bot be valid immediately </td></tr>
	 * <tr><td>SDK_AUTO_TALK_START_EX</td><td>device actively invite to bidirectional talk. </td></tr>
	 * <tr><td>SDK_AUTO_TALK_STOP_EX</td><td>device actively stop bidirectional talk. </td></tr>
	 * <tr><td>SDK_CONFIG_CHANGE_EX	</td><td>device config changed. </td></tr>
	 * <tr><td>SDK_IPSEARCH_EVENT_EX</td><td>IP search event,return character string format as: DevName::Manufacturer::MAC::IP::Port::DevType::POEPort::SubMask::GateWay&& </td></tr>
	 * <tr><td>SDK_AUTO_RECONNECT_FAILD</td><td>auto reconnection failed event,retun to 1 int model data , means reconnection failed return code, as CLIENT_Logininterface login wrong code explanation </td></tr>
	 * <tr><td>SDK_REALPLAY_FAILD_EVENT</td><td>monitor invalid event,retunr structure DEV_PLAY_RESULT </td></tr>
	 * <tr><td>SDK_PLAYBACK_FAILD_EVENT</td><td>playback failed event,return structure DEV_PLAY_RESULT </td></tr>
	 * </table>
	 * @param pchDVRIP �豸IP
	 * @param nDVRPort �豸�˿�
	 * \else
	 * ��Ϣ�ص�����
	 * @param lCommand �ص�����,�������pBuf��˵��
	 * @param lLoginID  {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx}����{@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ
	 * @param obj ���ձ������ݵĻ���,���ݵ��õ������ӿں�lCommandֵ��ͬ,�������ݲ�ͬ 
	 * ������õ������ӿ�Ϊ StartListen,��lCommand�Ŀ���ֵ��:
	 * <table>
	 * <tr><td>lCommand</td><td>pBuf</td></tr>
	 * <tr><td>SDK_COMM_ALARM</td><td>����Ϊһ��NET_CLIENT_STATE�ṹ��.</td></tr>
	 * <tr><td>SDK_SHELTER_ALARM</td><td>����Ϊ16���ֽ�,ÿ���ֽڱ�ʾһ����Ƶͨ�����ڵ�����״̬,1Ϊ�б���,0Ϊ�ޱ���.</td></tr>
	 * <tr><td>SDK_DISK_FULL_ALARM</td><td>����Ϊ1��DWORDֵ,1��ʾӲ����,0��ʾӲ��δ��.</td></tr>
	 * <tr><td>SDK_DISK_ERROR_ALARM</td><td>����Ϊ1��DWORDֵ,��λ��ʾ���32��Ӳ�̵Ĺ��ϱ���,ÿλΪ1��ʾ�б���,Ϊ0��ʾ�ޱ���.</td></tr>
	 * <tr><td>SDK_SOUND_DETECT_ALARM</td><td>����Ϊ16���ֽ�,ÿ���ֽڱ�ʾһ����Ƶͨ������Ƶ����״̬,1Ϊ�б���,0Ϊ�ޱ���.</td></tr>
	 * <tr><td>SDK_ALARM_DECODER_ALARM</td><td>����Ϊ16���ֽ�,ÿ���ֽڱ�ʾһ������������ͨ���ı���״̬,1Ϊ�б���,0Ϊ�ޱ���.</td></tr>
	 * </table>
	 * \n
	 * ������õ������ӿ�ΪCLENT_StartListenEx,��lCommand�Ŀ���ֵ��:
	 * <table>
	 * <tr><td>lCommand</td><td>pBuf</td></tr>
	 * <tr><td>SDK_ALARM_ALARM_EX</td><td>�����ֽ������豸����ͨ��������ͬ,ÿ���ֽڱ�ʾһ������ͨ���ı���״̬,1Ϊ�б���,0Ϊ�ޱ���. </td></tr>
	 * <tr><td>SDK_MOTION_ALARM_EX</td><td>�����ֽ������豸��Ƶͨ��������ͬ,ÿ���ֽڱ�ʾһ����Ƶͨ���Ķ�̬��ⱨ��״̬,1Ϊ�б���,0Ϊ�ޱ���. </td></tr>
	 * <tr><td>SDK_VIDEOLOST_ALARM_EX</td><td>�����ֽ������豸��Ƶͨ��������ͬ,ÿ���ֽڱ�ʾһ����Ƶͨ������Ƶ��ʧ����״̬,1Ϊ�б���,0Ϊ�ޱ���. </td></tr>
	 * <tr><td>SDK_SHELTER_ALARM_EX	</td><td>�����ֽ������豸��Ƶͨ��������ͬ,ÿ���ֽڱ�ʾһ����Ƶͨ�����ڵ�(����)����״̬,1Ϊ�б���,0Ϊ�ޱ���. </td></tr>
	 * <tr><td>SDK_SOUND_DETECT_ALARM_EX</td><td>����Ϊ16���ֽ�,ÿ���ֽڱ�ʾһ����Ƶͨ������Ƶ��ⱨ��״̬,1Ϊ�б���,0Ϊ�ޱ���. </td></tr>
	 * <tr><td>SDK_DISKFULL_ALARM_EX</td><td>����Ϊ1���ֽ�,1Ϊ��Ӳ��������,0Ϊ�ޱ���. </td></tr>
	 * <tr><td>SDK_DISKERROR_ALARM_EX</td><td>����Ϊ32���ֽ�,ÿ���ֽڱ�ʾһ��Ӳ�̵Ĺ��ϱ���״̬,1Ϊ�б���,0Ϊ�ޱ���.</td></tr> 
	 * <tr><td>SDK_ENCODER_ALARM_EX	</td><td>����Ϊ16���ֽ�,ÿ���ֽڱ�ʾһ��ͨ��������״̬,1Ϊ�б���,0Ϊ�ޱ���. </td></tr>
	 * <tr><td>SDK_REBOOT_EVENT_EX</td><td>�豸�����¼�,�û�����һЩ����ʱ,��Щ��Ҫ�豸����������Ч,���յ����¼�,���Ե��������ӿ������豸. </td></tr>
	 * <tr><td>SDK_URGENCY_ALARM_EX	</td><td>��������,����Ϊ16���ֽ�,ÿ���ֽڱ�ʾһ��ͨ��������״̬,1Ϊ�б���,0Ϊ�ޱ���. </td></tr>
	 * <tr><td>SDK_WIRELESS_ALARM_EX</td><td>���߱���,����Ϊ16���ֽ�,ÿ���ֽڱ�ʾһ��ͨ��������״̬,1Ϊ�б���,0Ϊ�ޱ���. </td></tr>
	 * <tr><td>SDK_NEW_SOUND_DETECT_ALARM_EX</td><td>����Ƶ��ⱨ��,������Ϣ�Ľṹ���  SDK_NEW_SOUND_ALARM_STATE . </td></tr>
	 * <tr><td>SDK_ALARM_DECODER_ALARM_EX</td><td>��������������,�����ṹ���  ALARM_DECODER_ALARM . </td></tr>
	 * <tr><td>SDK_DECODER_DECODE_ABILITY</td><td>������:�������������㱨��, һ���ֽ�,0:���������� 1:��ʾ������������. </td></tr>
	 * <tr><td>SDK_FDDI_DECODER_ABILITY</td><td>���˱�����״̬����,�ṹ���ALARM_FDDI_ALARM. </td></tr>
	 * <tr><td>SDK_PANORAMA_SWITCH_ALARM_EX</td><td>�л���������,����Ϊ16���ֽ�,ÿ���ֽڱ�ʾһ��ͨ��������״̬,1Ϊ�б���,0Ϊ�ޱ���. </td></tr>
	 * <tr><td>SDK_LOSTFOCUS_ALARM_EX</td><td>ʧȥ���㱨��,����Ϊ16���ֽ�,ÿ���ֽڱ�ʾһ��ͨ��������״̬,1Ϊ�б���,0Ϊ�ޱ���. </td></tr>
	 * <tr><td>SDK_OEMSTATE_EX</td><td>oem��ͣ״̬,����ΪBYTE. </td></tr>
	 * <tr><td>SDK_DSP_ALARM_EXDSP</td><td>����,����ΪDSP_ALARM. </td></tr>
	 * <tr><td>SDK_ATMPOS_BROKEN_EX	</td><td>atm��pos���Ͽ�����,����ΪBYTE, 0:���ӶϿ� 1:��������. </td></tr>
	 * <tr><td>SDK_RECORD_CHANGED_EX</td><td>¼��״̬�仯����,����ΪALARM_RECORDING_CHANGED.�Ľṹ������ </td></tr>
	 * <tr><td>SDK_CONFIG_CHANGED_EX</td><td>���÷����仯����,pBufΪ��. </td></tr>
	 * <tr><td>SDK_DEVICE_REBOOT_EX</td><td>�豸��������,pBufΪ��. </td></tr>
	 * <tr><td>SDK_PTZ_LOCATION_EX</td><td>��̨��λ��Ϣ ALARM_PTZ_LOCATION_INFO. </td></tr>
	 * <tr><td>SDK_WINGDING_ALARM_EX</td><td>��Ȧ/���������ϱ��� ALARM_WINGDING_INFO. </td></tr>
	 * <tr><td>SDK_TRAF_CONGESTION_ALARM_E</td><td>X��ͨ��������(���������쳣ֹͣ�����Ŷ�) ALARM_TRAF_CONGESTION_INFO </td></tr>. 
	 * <tr><td>SDK_TRAF_EXCEPTION_ALARM_EX</td><td>��ͨ�쳣����(��ͨ��������0���쳣����) ALARM_TRAF_EXCEPTION_INFO </td></tr>. 
	 * <tr><td>SDK_EQUIPMENT_FILL_ALARM_EX</td><td>�����豸���ϱ���ALARM_EQUIPMENT_FILL_INFO. </td></tr>
	 * <tr><td>SDK_ALARM_ARM_DISARM_STATE</td><td>����������״̬ALARM_EQUIPMENT_FILL_INFO. </td></tr>
	 * <tr><td>SDK_ALARM_ACC_POWEROFF</td><td>ACC�ϵ籨��,����ΪDWORD 0:ACCͨ�� 1:ACC�ϵ� </td></tr>
	 * <tr><td>SDK_ALARM_3GFLOW_EXCEED</td><td>3G����������ֵ����  DHDEV_3GFLOW_EXCEED_STATE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_SPEED_LIMIT</td><td>���ٱ���ALARM_SPEED_LIMIT </td></tr>
	 * <tr><td>SDK_ALARM_VEHICLE_INFO_UPLOAD</td><td>�����Զ�����Ϣ�ϴ�ALARM_VEHICLE_INFO_UPLOAD </td></tr>
	 * <tr><td>SDK_STATIC_ALARM_EX</td><td>�����ֽ������豸��Ƶͨ��������ͬ,ÿ���ֽڱ�ʾһ����Ƶͨ���ľ�̬��ⱨ��״̬,1Ϊ�б���,0Ϊ�ޱ���. </td></tr>
	 * <tr><td>SDK_PTZ_LOCATION_EX</td><td>��̨��λ��Ϣ SDK_PTZ_LOCATION_INFO </td></tr>
	 * <tr><td>SDK_ALARM_CARD_RECORD_UPLOAD</td><td>����¼����Ϣ�ϴ� ALARM_CARD_RECORD_INFO_UPLOAD </td></tr>
	 * <tr><td>SDK_ALARM_ATM_INFO_UPLOADATM</td><td>������Ϣ�ϴ� ALARM_ATM_INFO_UPLOAD </td></tr>
	 * <tr><td>SDK_ALARM_ENCLOSURE</td><td>����Χ������ ALARM_ENCLOSURE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_SIP_STATE</td><td>SIP״̬����  ALARM_SIP_STATE </td></tr>
	 * <tr><td>SDK_ALARM_RAID_STATE</td><td>RAID�쳣���� ALARM_RAID_INFO </td></tr>
	 * <tr><td>SDK_ALARM_CROSSING_SPEED_LIMIT</td><td>·�����ٱ��� ALARM_SPEED_LIMIT </td></tr>
	 * <tr><td>SDK_ALARM_OVER_LOADING</td><td>���ر��� ALARM_OVER_LOADING </td></tr>
	 * <tr><td>SDK_ALARM_HARD_BRAKING</td><td>��ɲ������ ALARM_HARD_BRAKING </td></tr>
	 * <tr><td>SDK_ALARM_SMOKE_SENSOR</td><td>�̸б��� ALARM_SMOKE_SENSOR </td></tr>
	 * <tr><td>SDK_ALARM_TRAFFIC_LIGHT_FAULT</td><td>��ͨ�ƹ��ϱ��� ALARM_TRAFFIC_LIGHT_FAULT </td></tr>
	 * <tr><td>SDK_ALARM_TRAFFIC_FLUX_STAT</td><td>��ͨ����ͳ�Ʊ��� ALARM_TRAFFIC_FLUX_LANE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_CAMERA_MOVE</td><td>�������λ�����¼� ALARM_CAMERA_MOVE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_DETAILEDMOTION</td><td>��ϸ���챨���ϱ���Ϣ ALARM_DETAILEDMOTION_CHNL_INFO </td></tr>
	 * <tr><td>SDK_ALARM_STORAGE_FAILURE</td><td>�洢�쳣����,����Ϊ ALARM_STORAGE_FAILURE �Ľṹ������ </td></tr>
	 * <tr><td>SDK_ALARM_FRONTDISCONNECT</td><td>ǰ��IPC�������� ALARM_FRONTDISCONNET_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ALARM_EX_REMOTE</td><td>Զ���ⲿ���� ALARM_REMOTE_ALARM_INFO </td></tr>
	 * <tr><td>SDK_ALARM_BATTERYLOWPOWER</td><td>��ص����ͱ��� ALARM_BATTERYLOWPOWER_INFO </td></tr>
	 * <tr><td>SDK_ALARM_TEMPERATURE</td><td>�¶ȹ��߱��� ALARM_TEMPERATURE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_TIREDDRIVE</td><td>ƣ�ͼ�ʻ���� ALARM_TIREDDRIVE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_LOST_RECORD</td><td>��¼���¼����� ALARM_LOST_RECORD </td></tr>
	 * <tr><td>SDK_ALARM_HIGH_CPU</td><td>CPUռ���ʹ����¼����� ALARM_HIGH_CPU </td></tr>
	 * <tr><td>SDK_ALARM_LOST_NETPACKET</td><td>���緢�����ݶ����¼����� ALARM_LOST_NETPACKET </td></tr>
	 * <tr><td>SDK_ALARM_HIGH_MEMORY</td><td>�ڴ�ռ���ʹ����¼����� ALARM_HIGH_MEMORY </td></tr>
	 * <tr><td>SDK_LONG_TIME_NO_OPERATIONWEB</td><td>�û���ʱ���޲����¼�(����չ��Ϣ) </td></tr>
	 * <tr><td>SDK_BLACKLIST_SNAP</td><td>����������ץ���¼� SDK_BLACKLIST_SNAP_INFO </td></tr>
	 * <tr><td>SDK_ALARM_DISK</td><td>Ӳ�̱��� ALARM_DISK_INFO���� </td></tr>
	 * <tr><td>SDK_ALARM_FILE_SYSTEM</td><td>�ļ�ϵͳ���� ALARM_FILE_SYSTEM_INFO���� </td></tr>
	 * <tr><td>SDK_ALARM_IVS</td><td>���ܱ����¼� ALARM_IVS_INFO </td></tr>
	 * <tr><td>SDK_ALARM_GOODS_WEIGHT_UPLOAD</td><td>������Ϣ�ϱ� ALARM_GOODS_WEIGHT_UPLOAD_INFO </td></tr>
	 * <tr><td>SDK_ALARM_GOODS_WEIGHT</td><td>������Ϣ���� ALARM_GOODS_WEIGHT_INFO </td></tr>
	 * <tr><td>SDK_GPS_STATUSGPS</td><td>��λ��Ϣ NET_GPS_STATUS_INFO </td></tr>
	 * <tr><td>SDK_ALARM_DISKBURNED_FULL</td><td>Ӳ�̿�¼������ ALARM_DISKBURNED_FULL_INFO </td></tr>
	 * <tr><td>SDK_ALARM_STORAGE_LOW_SPACE</td><td>�洢���������¼� ALARM_STORAGE_LOW_SPACE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_DISK_FLUX</td><td>Ӳ�������쳣�¼� ALARM_DISK_FLUX </td></tr>
	 * <tr><td>SDK_ALARM_NET_FLUX</td><td>���������쳣�¼� LARM_NET_FLUX </td></tr>
	 * <tr><td>SDK_ALARM_FAN_SPEED</td><td>��ת���쳣�¼� ALARM_FAN_SPEED </td></tr>
	 * <tr><td>SDK_ALARM_STORAGE_FAILURE_EX</td><td>�洢���󱨾� ALARM_STORAGE_FAILURE_EX </td></tr>
	 * <tr><td>SDK_ALARM_RECORD_FAILED</td><td>¼���쳣���� ALARM_RECORD_FAILED_INFO </td></tr>
	 * <tr><td>SDK_ALARM_STORAGE_BREAK_DOWN</td><td>�洢�����¼� ALARM_STORAGE_BREAK_DOWN_INFO </td></tr>
	 * <tr><td>SDK_ALARM_VIDEO_ININVALID</td><td>��Ƶ����ͨ��ʧЧ�¼�(��:���õ���Ƶ����ͨ������,�����豸��������)ALARM_VIDEO_ININVALID_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ALARM_EX2</td><td>���ر�������ͨ���¼�,���ؽṹ�� ALARM_ALARM_INFO_EX2 </td></tr>
	 * <tr><td>SDK_ALARM_POWERFAULT</td><td>��Դ�����¼�,���ؽṹ�� ALARM_POWERFAULT_INFO </td></tr>
	 * <tr><td>SDK_ALARM_CHASSISINTRUDED</td><td>�����¼�,���ؽṹ�� ALARM_CHASSISINTRUDED_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ALARMEXTENDED</td><td>��չ��������ͨ���¼� ALARM_ALARMEXTENDED_INFO </td></tr>
	 * <tr><td>SDK_ALARM_TALKING_INVITE</td><td>�豸����ƽ̨�Խ��¼� ALARM_TALKING_INVITE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ARMMODE_CHANGE_EVENT</td><td>�豸����ģʽ�仯�¼� ALARM_ARMMODE_CHANGE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_BYPASSMODE_CHANGE_EVENT</td><td>������·״̬�仯�¼� ALARM_BYPASSMODE_CHANGE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ACCESS_CTL_NOT_CLOSE</td><td>�Ž�δ���¼� ALARM_ACCESS_CTL_NOT_CLOSE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ACCESS_CTL_BREAK_IN</td><td>�����¼� ALARM_ACCESS_CTL_BREAK_IN_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ACCESS_CTL_REPEAT_ENTER</td><td>���������¼�ALARM_ACCESS_CTL_REPEAT_ENTER_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ACCESS_CTL_DURESS</td><td>в�ȿ�ˢ���¼� ALARM_ACCESS_CTL_DURESS_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ACCESS_CTL_EVENT</td><td>�Ž��¼� ALARM_ACCESS_CTL_EVENT_INFO </td></tr>
	 * </table>
	 * һЩ�������첽�ص��¼�,��lCommand�Ŀ���ֵ��:
	 * <table>
	 * <tr><td>����</td><td>˵��</td></tr>
	 * <tr><td>SDK_CONFIG_RESULT_EVENT_EX</td><td>����Ϊ�޸����õķ�����,���ؽṹ���DEV_SET_RESULT. </td></tr>
	 * <tr><td>SDK_REBOOT_EVENT_EX</td><td>�豸�����¼�:���δ������������,��ǰ�޸ĵ����ò���������Ч </td></tr>
	 * <tr><td>SDK_AUTO_TALK_START_EX</td><td>�豸�������뿪ʼ�����Խ�. </td></tr>
	 * <tr><td>SDK_AUTO_TALK_STOP_EX</td><td>�豸����ֹͣ�����Խ�. </td></tr>
	 * <tr><td>SDK_CONFIG_CHANGE_EX</td><td>�豸���÷����ı�. </td></tr>
	 * <tr><td>SDK_IPSEARCH_EVENT_EX</td><td>IP�����¼�,�����ַ�����ʽ����:DevName::Manufacturer::MAC::IP::Port::DevType::POEPort::SubMask::GateWay&& </td></tr>
	 * <tr><td>SDK_AUTO_RECONNECT_FAILD</td><td>�Զ�����ʧ���¼�,����һ��int������,��ʾ����ʧ�ܷ�����,����μ� Login�ӿڵĵ�¼������˵�� </td></tr>
	 * <tr><td>SDK_REALPLAY_FAILD_EVENT</td><td>����ʧ���¼�,���ؽṹ��  DEV_PLAY_RESULT </td></tr>
	 * <tr><td>SDK_PLAYBACK_FAILD_EVENT</td><td>�ط�ʧ���¼�,���ؽṹ��  DEV_PLAY_RESULT </td></tr>
	 * </table>
	 * @param pchDVRIP �豸IP
	 * @param nDVRPort �豸�˿�
	 * \endif
	 */
	public boolean invoke(int lCommand, long lLoginID, Object obj, String pchDVRIP, int nDVRPort);

}
