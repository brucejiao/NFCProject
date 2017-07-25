package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_RADIOMETRY_STARTFIND implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public NET_TIME            stStartTime = new NET_TIME();                       // query start time
    public NET_TIME            stEndTime = new NET_TIME();                         // query end time
    public int                 nMeterType;                        // query type, @see NET_RADIOMETRY_METERTYPE
    public int                 nChannel;                          // channel number
    public int 				   emPeriod;						// query period @see EM_RADIOMETRY_PERIOD
}
