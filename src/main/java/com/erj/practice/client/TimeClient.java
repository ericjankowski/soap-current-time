package com.erj.practice.client;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.erj.practice.service.EricsTimeServer;
import com.erj.practice.service.TimeServer;

import java.net.URL;

public class TimeClient {
	public static void main(String [] args) throws Exception{
		URL url = new URL("http://127.0.0.1:6189/time-server?wsdl");
		
		QName qname = new QName("http://service.practice.erj.com/", "EricsTimeServerService");
		
		System.out.println(qname.getNamespaceURI() + qname.getLocalPart());
		
		Service service = Service.create(url, qname);
		
		TimeServer eif = service.getPort(TimeServer.class);
		
		System.out.println(eif.getTimeAsElapsed());
		
	}
}
