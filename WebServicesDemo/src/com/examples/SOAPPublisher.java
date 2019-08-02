package com.examples;

import javax.xml.ws.Endpoint;

public class SOAPPublisher{
	public static void main(String...args)
	{
	 Endpoint.publish("http://localhost:1200/ws/myperson",new PersonServiceImpl());
}
}