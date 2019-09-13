package com.cs.webservice.cfx.imp;

import javax.jws.WebService;

import com.cs.webservice.cfx.TestService;

@WebService(endpointInterface = "com.cs.webservice.cfx.TestService", serviceName = "TestService",  targetNamespace = "http://cfx.webservice.cs.com/")
public class TestServiceImpl implements TestService {
	@Override
	public String say(String str) {
		return "Hello" + str;
	}
}
