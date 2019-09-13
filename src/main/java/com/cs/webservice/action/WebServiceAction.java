package com.cs.webservice.action;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

@Component("we")
@WebService
public class WebServiceAction {

	public String say(String str) {
		return "Hello" + str;

	}
}
