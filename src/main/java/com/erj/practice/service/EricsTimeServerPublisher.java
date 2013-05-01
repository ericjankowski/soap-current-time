package com.erj.practice.service;

import javax.xml.ws.Endpoint;

public class EricsTimeServerPublisher {
	public static void main(String [] args){
		Endpoint.publish("http://127.0.0.1:6189/time-server", new EricsTimeServer());
	}
}
