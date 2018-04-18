package com.guoyasoft.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import com.guoyasoft.bean.api.user.signUp.SignUpRequest;
import com.guoyasoft.bean.db.GyUser;
import com.guoyasoft.dao.GyUserMapper;

@javax.jws.WebService(targetNamespace = "http://webservice.guoyasoft.com/", serviceName = "TestWSService", portName = "TestWSPort")
public class TestWSDelegate {

	com.guoyasoft.webservice.TestWS testWS = new com.guoyasoft.webservice.TestWS();

	public String signUp(SignUpRequest signUp) {
		return testWS.signUp(signUp);
	}

}