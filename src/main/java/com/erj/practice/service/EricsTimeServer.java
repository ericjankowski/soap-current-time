package com.erj.practice.service;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "com.erj.practice.service.TimeServer")
public class EricsTimeServer implements TimeServer{

	@Override
	@WebMethod
	public String getTimeAsString() {
		return new Date().toString();
	}

	@Override
	@WebMethod
	public long getTimeAsElapsed() {
		return new Date().getTime();
	}

}
