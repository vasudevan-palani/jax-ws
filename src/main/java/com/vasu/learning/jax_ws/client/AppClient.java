package com.vasu.learning.jax_ws.client;

import javax.xml.ws.WebServiceRef;

public class AppClient {
	
	@WebServiceRef(wsdlLocation = "http://localhost:8080/jax-ws-0.0.1-SNAPSHOT/AdderImplService?wsdl")
	private static AdderImplService service;

	public static void main(String[] args) {
		long res = service.getAdderImplPort().add(10, 2);
		System.out.println(res);
	}
}
