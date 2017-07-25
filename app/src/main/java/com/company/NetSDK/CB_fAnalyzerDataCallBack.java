package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Intelligent analysis data callback
 * \else
 * ���ܷ������ݻص�
 * \endif
 */
public interface CB_fAnalyzerDataCallBack {
	/**
	 * \if ENGLISH_LANG
	 * Intelligent analysis data callback
	 * @param lAnalyzerHandle return from {@link com.company.NetSDK.INetSDK#RealLoadPicture() RealLoadPicture}
	 * @param dwAlarmType intelligent analysis type
	 * <table>
	 * <tr><td>EVENT_IVS_ALL</td><td>all alarm info will be uploaded, detailed as follows</td></tr>
	 * <tr><td>EVENT_IVS_CROSSLINEDETECTION</td><td>data is one DEV_EVENT_CROSSLINE_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_CROSSREGIONDETECTION</td><td>data is one DEV_EVENT_CROSSREGION_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_PASTEDETECTION	</td><td>data is one DEV_EVENT_PASTE_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_LEFTDETECTION</td><td>data is one DEV_EVENT_LEFT_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_STAYDETECTION</td><td>data is one DEV_EVENT_STAY_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_WANDERDETECTION</td><td>data is one DEV_EVENT_WANDER_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_PRESERVATION</td><td>data is one DEV_EVENT_PRESERVATION_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_MOVEDETECTION</td><td>data is one DEV_EVENT_MOVE_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TAILDETECTION</td><td>data is one DEV_EVENT_TAIL_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_RIOTERDETECTION</td><td>data is one DEV_EVENT_RIOTERL_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_FIREDETECTION</td><td>data is one DEV_EVENT_FIRE_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_SMOKEDETECTION</td><td>data is one DEV_EVENT_SMOKE_INFO structure.</td></tr> 
	 * <tr><td>EVENT_IVS_FIGHTDETECTION</td><td>data is one DEV_EVENT_FIGHT_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_FLOWSTAT</td><td>data is one DEV_EVENT_FLOWSTAT_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_NUMBERSTAT</td><td>data is one DEV_EVENT_NUMBERSTAT_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_CAMERACOVERDDETECTION </td><td>  </td></tr> 
	 * <tr><td>EVENT_IVS_CAMERAMOVEDDETECTION </td><td>  </td></tr> 
	 * <tr><td>EVENT_IVS_VIDEOABNORMALDETECTION</td><td>data is one DEV_EVENT_VIDEOABNORMALDETECTION_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_VIDEOBADDETECTION</td><td>  </td></tr>
	 * <tr><td>EVENT_IVS_TRAFFICCONTROL</td><td>data is one DEV_EVENT_TRAFFICCONTROL_INFO structure.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFICACCIDENT</td><td>data is one DEV_EVENT_TRAFFICACCIDENT_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFICJUNCTION</td><td>data is one DEV_EVENT_TRAFFICJUNCTION_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFICGATE</td><td>data is one DEV_EVENT_TRAFFICGATE_INFO structure.</td></tr>
	 * <tr><td>EVENT_TRAFFICSNAPSHOT</td><td>data is one DEV_EVENT_TRAFFICSNAPSHOT_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_FACEDETECT	</td><td>data is one DEV_EVENT_FACEDETECT_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFICJAM	</td><td>data is one DEV_EVENT_TRAFFICJAM_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_RUNREDLIGHT</td><td>data is one DEV_EVENT_TRAFFIC_RUNREDLIGHT_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_OVERLINE</td><td>data is one DEV_EVENT_TRAFFIC_OVERLINE_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_RETROGRADE</td><td>data is one DEV_EVENT_TRAFFIC_RETROGRADE_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_TURNLEFT</td><td>data is one DEV_EVENT_TRAFFIC_TURNLEFT_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_TURNRIGHT</td><td>data is one DEV_EVENT_TRAFFIC_TURNRIGHT_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_UTURN	</td><td>data is one DEV_EVENT_TRAFFIC_UTURN_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_OVERSPEED</td><td>data is one DEV_EVENT_TRAFFIC_OVERSPEED_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_UNDERSPEED</td><td>data is one DEV_EVENT_TRAFFIC_UNDERSPEED_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_PARKING</td><td>data is one DEV_EVENT_TRAFFIC_PARKING_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_WRONGROUTE</td><td>data is one DEV_EVENT_TRAFFIC_WRONGROUTE_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_CROSSLANE</td><td>data is one DEV_EVENT_TRAFFIC_CROSSLANE_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_OVERYELLOWLINE	</td><td>data is one DEV_EVENT_TRAFFIC_OVERYELLOWLINE_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_DRIVINGONSHOULDER	</td><td>data is one DEV_EVENT_TRAFFIC_DRIVINGONSHOULDER_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_YELLOWPLATEINLANE	</td><td>data is one DEV_EVENT_TRAFFIC_YELLOWPLATEINLANE_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_PEDESTRAINPRIORITY </td><td>data is one DEV_EVENT_TRAFFIC_PEDESTRAINPRIORITY_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_CROSSFENCEDETECTION</td><td>data is one DEV_EVENT_CROSSFENCEDETECTION_INFO structure
	 * <tr><td>EVENT_IVS_ELECTROSPARKDETECTION</td><td>data is one DEV_EVENT_ELECTROSPARK_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_NOPASSING</td><td>data is one DEV_EVENT_TRAFFIC_NOPASSING_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_ABNORMALRUNDETECTION</td><td>data is one DEV_EVENT_ABNORMALRUNDETECTION_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_RETROGRADEDETECTION</td><td>data is one DEV_EVENT_RETROGRADEDETECTION_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_INREGIONDETECTION</td><td>data is one DEV_EVENT_INREGIONDETECTION_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TAKENAWAYDETECTION</td><td>data is one DEV_EVENT_TAKENAWAYDETECTION_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_PARKINGDETECTION</td><td>data is one DEV_EVENT_PARKINGDETECTION_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_FACERECOGNITION</td><td>data is one DEV_EVENT_FACERECOGNITION_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_MANUALSNAP</td><td>data is one DEV_EVENT_TRAFFIC_MANUALSNAP_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_FLOWSTATE</td><td>data is one DEV_EVENT_TRAFFIC_FLOWSTAT_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_STAY</td><td>data is one DEV_EVENT_TRAFFIC_STAY_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_VEHICLEINROUTE</td><td>data is one DEV_EVENT_TRAFFIC_VEHICLEINROUTE_INFO structure.</td></tr>
	 * <tr><td>EVENT_ALARM_MOTIONDETECT</td><td>  </td></tr>
	 * <tr><td>EVENT_ALARM_LOCALALARM</td><td>data is one DEV_EVENT_ALARM_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_PRISONERRISEDETECTION</td><td>data is one DEV_EVENT_PRISONERRISEDETECTION_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_TOLLGATE</td><td>  </td></tr>
	 * <tr><td>EVENT_IVS_DENSITYDETECTION</td><td>data is one DEV_EVENT_DENSITYDETECTION_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_VIDEODIAGNOSIS</td><td> </td></tr>  
	 * <tr><td>EVENT_IVS_QUEUEDETECTION</td><td>data is one DEV_EVENT_QUEUEDETECTION_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_VEHICLEINBUSROUTE</td><td>data is one DEV_EVENT_TRAFFIC_VEHICLEINBUSROUTE_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_BACKING</td><td>data is one DEV_EVENT_IVS_TRAFFIC_BACKING_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_AUDIO_ABNORMALDETECTION</td><td>data is one DEV_EVENT_IVS_AUDIO_ABNORMALDETECTION_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_RUNYELLOWLIGHT</td><td>data is one DEV_EVENT_TRAFFIC_RUNYELLOWLIGHT_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_CLIMBDETECTION</td><td>data is one DEV_EVENT_IVS_CLIMB_INFO structure.</td></tr> 
	 * <tr><td>EVENT_IVS_LEAVEDETECTION</td><td>data is one DEV_EVENT_IVS_LEAVE_INFO structure.</td></tr>	
	 * <tr><td>EVENT_IVS_TRAFFIC_PARKINGONYELLOWBOX</td><td>data is one DEV_EVENT_TRAFFIC_PARKINGONYELLOWBOX_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_PARKINGSPACEPARKING</td><td>data is one DEV_EVENT_TRAFFIC_PARKINGSPACEPARKING_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_PARKINGSPACENOPARKING</td><td>data is one DEV_EVENT_TRAFFIC_PARKINGSPACENOPARKING_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_PEDESTRAIN</td><td>data is one DEV_EVENT_TRAFFIC_PEDESTRAIN_INFO structure.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_THROW</td><td>data is one DEV_EVENT_TRAFFIC_THROW_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_IDLE</td><td>data is one DEV_EVENT_TRAFFIC_IDLE_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_ALL</td><td>all event start with traffic��each event correspond to the above declaration structure</td></tr>
	 * </table>
	 * @param pAlarmInfo receive intelligent analysis event info,based on different dwAlarmType value��filled info differ 
	 * @param pBuffer intelligent image info 
	 * @param dwBufSize intelligent image info size 
	 * @param nSequence means status of the same uploaded image, when it is 0, it appears first time. When it is 2, it appears last time or appears once. When it is 1, it will appear again. 
	 * @param reserved int nState = (int) reserved means current call data status; when it is 1, it means current data is real time; when it is 1, it means current recall data is offline; when it is 2, it means offline data send structure 
	 * \else
	 * ���ܷ������ݻص�����
	 * @param lAnalyzerHandle {@link com.company.NetSDK.INetSDK#RealLoadPicture() RealLoadPicture}�ķ���ֵ
	 * @param dwAlarmType ���ܷ������� 
	 * <table>
	 * <tr><td>EVENT_IVS_ALL</td><td>���б�����Ϣ�����ϴ����������ע�� </td></tr> 
	 * <tr><td>EVENT_IVS_CROSSLINEDETECTION</td><td>����Ϊһ�� DEV_EVENT_CROSSLINE_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_CROSSREGIONDETECTION</td><td>����Ϊһ�� DEV_EVENT_CROSSREGION_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_PASTEDETECTION	</td><td>����Ϊһ�� DEV_EVENT_PASTE_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_LEFTDETECTION</td><td>����Ϊһ�� DEV_EVENT_LEFT_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_STAYDETECTION</td><td>����Ϊһ�� DEV_EVENT_STAY_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_WANDERDETECTION</td><td>����Ϊһ�� DEV_EVENT_WANDER_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_PRESERVATION</td><td>����Ϊһ�� DEV_EVENT_PRESERVATION_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_MOVEDETECTION</td><td>����Ϊһ�� DEV_EVENT_MOVE_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_TAILDETECTION</td><td>����Ϊһ�� DEV_EVENT_TAIL_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_RIOTERDETECTION</td><td>����Ϊһ�� DEV_EVENT_RIOTERL_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_FIREDETECTION</td><td>����Ϊһ�� DEV_EVENT_FIRE_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_SMOKEDETECTION</td><td>����Ϊһ�� DEV_EVENT_SMOKE_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_FIGHTDETECTION</td><td>����Ϊһ�� DEV_EVENT_FIGHT_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_FLOWSTAT</td><td>����Ϊһ�� DEV_EVENT_FLOWSTAT_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_NUMBERSTAT</td><td>����Ϊһ�� DEV_EVENT_NUMBERSTAT_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_CAMERACOVERDDETECTION</td><td>  </td></tr>  
	 * <tr><td>EVENT_IVS_CAMERAMOVEDDETECTION </td><td>  </td></tr> 
	 * <tr><td>EVENT_IVS_VIDEOABNORMALDETECTION</td><td>����Ϊһ�� DEV_EVENT_VIDEOABNORMALDETECTION_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_VIDEOBADDETECTION </td><td>  </td></tr>   
	 * <tr><td>EVENT_IVS_TRAFFICCONTROL</td><td>����Ϊһ�� DEV_EVENT_TRAFFICCONTROL_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFICACCIDENT</td><td>����Ϊһ�� DEV_EVENT_TRAFFICACCIDENT_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFICJUNCTION</td><td>����Ϊһ�� DEV_EVENT_TRAFFICJUNCTION_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFICGATE</td><td>����Ϊһ�� DEV_EVENT_TRAFFICGATE_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_TRAFFICSNAPSHOT</td><td>����Ϊһ�� DEV_EVENT_TRAFFICSNAPSHOT_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_FACEDETECT</td><td>����Ϊһ�� DEV_EVENT_FACEDETECT_INFO �ṹ��. </td></tr>
	 * <tr><td>EVENT_IVS_TRAFFICJAM</td><td>����Ϊһ�� DEV_EVENT_TRAFFICJAM_INFO �ṹ��. </td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_RUNREDLIGHT</td><td>����Ϊһ�� DEV_EVENT_TRAFFIC_RUNREDLIGHT_INFO �ṹ��. </td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_OVERLINE</td><td>����Ϊһ�� DEV_EVENT_TRAFFIC_OVERLINE_INFO �ṹ��. </td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_RETROGRADE</td><td>����Ϊһ�� DEV_EVENT_TRAFFIC_RETROGRADE_INFO �ṹ��. </td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_TURNLEFT</td><td>����Ϊһ�� DEV_EVENT_TRAFFIC_TURNLEFT_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_TURNRIGHT</td><td>����Ϊһ�� DEV_EVENT_TRAFFIC_TURNRIGHT_INFO �ṹ��. </td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_UTURN	</td><td>����Ϊһ�� DEV_EVENT_TRAFFIC_UTURN_INFO �ṹ��. </td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_OVERSPEED</td><td>����Ϊһ�� DEV_EVENT_TRAFFIC_OVERSPEED_INFO �ṹ��. </td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_UNDERSPEED</td><td>����Ϊһ�� DEV_EVENT_TRAFFIC_UNDERSPEED_INFO �ṹ��. </td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_PARKING</td><td>����Ϊһ�� DEV_EVENT_TRAFFIC_PARKING_INFO �ṹ��. </td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_WRONGROUTE</td><td>����Ϊһ�� DEV_EVENT_TRAFFIC_WRONGROUTE_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_CROSSLANE</td><td>����Ϊһ�� DEV_EVENT_TRAFFIC_CROSSLANE_INFO �ṹ��. </td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_OVERYELLOWLINE</td><td>����Ϊһ�� DEV_EVENT_TRAFFIC_OVERYELLOWLINE_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_DRIVINGONSHOULDER</td><td>����Ϊһ�� DEV_EVENT_TRAFFIC_DRIVINGONSHOULDER_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_YELLOWPLATEINLANE</td><td>����Ϊһ�� DEV_EVENT_TRAFFIC_YELLOWPLATEINLANE_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_PEDESTRAINPRIORITY</td><td>����Ϊһ�� DEV_EVENT_TRAFFIC_PEDESTRAINPRIORITY_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_CROSSFENCEDETECTION</td><td>����Ϊһ�� DEV_EVENT_CROSSFENCEDETECTION_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_ELECTROSPARKDETECTION</td><td>����Ϊһ�� DEV_EVENT_ELECTROSPARK_INFO �ṹ��. </td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_NOPASSING</td><td>����Ϊһ�� DEV_EVENT_TRAFFIC_NOPASSING_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_ABNORMALRUNDETECTION</td><td>����Ϊһ�� DEV_EVENT_ABNORMALRUNDETECTION_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_RETROGRADEDETECTION</td><td>����Ϊһ�� DEV_EVENT_RETROGRADEDETECTION_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_INREGIONDETECTION</td><td>����Ϊһ�� DEV_EVENT_INREGIONDETECTION_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_TAKENAWAYDETECTION</td><td>����Ϊһ�� DEV_EVENT_TAKENAWAYDETECTION_INFO �ṹ��. </td></tr>
	 * <tr><td>EVENT_IVS_PARKINGDETECTION</td><td>����Ϊһ�� DEV_EVENT_PARKINGDETECTION_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_FACERECOGNITION</td><td>����Ϊһ�� DEV_EVENT_FACERECOGNITION_INFO �ṹ��. </td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_MANUALSNAP</td><td>����Ϊһ�� DEV_EVENT_TRAFFIC_MANUALSNAP_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_FLOWSTATE</td><td>����Ϊһ�� DEV_EVENT_TRAFFIC_FLOWSTAT_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_STAY</td><td>����Ϊһ�� DEV_EVENT_TRAFFIC_STAY_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_VEHICLEINROUTE</td><td>����Ϊһ�� DEV_EVENT_TRAFFIC_VEHICLEINROUTE_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_ALARM_MOTIONDETECT </td><td>  </td></tr>   
	 * <tr><td>EVENT_ALARM_LOCALALARM</td><td>����Ϊһ�� DEV_EVENT_ALARM_INFO�ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_PRISONERRISEDETECTION</td><td>����Ϊһ�� DEV_EVENT_PRISONERRISEDETECTION_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_TOLLGATE  
	 * <tr><td>EVENT_IVS_DENSITYDETECTION</td><td>����Ϊһ�� DEV_EVENT_DENSITYDETECTION_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_VIDEODIAGNOSIS </td><td>  </td></tr>   
	 * <tr><td>EVENT_IVS_QUEUEDETECTION	</td><td>����Ϊһ�� DEV_EVENT_QUEUEDETECTION_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_VEHICLEINBUSROUTE	</td><td>����Ϊһ�� DEV_EVENT_TRAFFIC_VEHICLEINBUSROUTE_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_BACKING</td><td>����Ϊһ�� DEV_EVENT_IVS_TRAFFIC_BACKING_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_AUDIO_ABNORMALDETECTION</td><td>����Ϊһ�� DEV_EVENT_IVS_AUDIO_ABNORMALDETECTION_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_RUNYELLOWLIGHT</td><td>����Ϊһ�� DEV_EVENT_TRAFFIC_RUNYELLOWLIGHT_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_CLIMBDETECTION	</td><td>����Ϊһ�� DEV_EVENT_IVS_CLIMB_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_LEAVEDETECTION	</td><td>����Ϊһ�� DEV_EVENT_IVS_LEAVE_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_PARKINGONYELLOWBOX	</td><td>����Ϊһ�� DEV_EVENT_TRAFFIC_PARKINGONYELLOWBOX_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_PARKINGSPACEPARKING</td><td>����Ϊһ�� DEV_EVENT_TRAFFIC_PARKINGSPACEPARKING_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_PARKINGSPACENOPARKING</td><td>����Ϊһ�� DEV_EVENT_TRAFFIC_PARKINGSPACENOPARKING_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_PEDESTRAIN</td><td>����Ϊһ�� DEV_EVENT_TRAFFIC_PEDESTRAIN_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_THROW</td><td>����Ϊһ�� DEV_EVENT_TRAFFIC_THROW_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_IDLE</td><td>����Ϊһ�� DEV_EVENT_TRAFFIC_IDLE_INFO �ṹ��.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_ALL</td><td>������traffic��ͷ���¼���ÿ���¼���Ӧ���������Ľṹ�� </td></tr>
	 * </table>
	 * @param pAlarmInfo �������ܷ����¼�����Ϣ������dwAlarmTypeֵ��ͬ���������ݲ�ͬ 
	 * @param pBuffer ����ͼƬ��Ϣ 
	 * @param dwBufSize ����ͼƬ��Ϣ��С
	 * @param nSequence ��ʾ�ϴ���ͬһ��ͼƬ�����Ϊ0ʱ��ʾ�ǵ�һ�γ��֣�Ϊ2��ʾ���һ�γ��ֻ������һ�Σ�Ϊ1��ʾ�˴�֮���� 
	 * @param reserved int nState=(int*)reserved ��ʾ��ǰ�ص����ݵ�״̬, Ϊ0��ʾ��ǰ����Ϊʵʱ���ݣ�Ϊ1��ʾ��ǰ�ص��������������ݣ�Ϊ2ʱ��ʾ�������ݴ��ͽ��� 
	 * \endif
	 */
	public void invoke(long lAnalyzerHandle, int dwAlarmType, Object pAlarmInfo,
                       byte pBuffer[], int dwBufSize, int nSequence, int reserved);
}
