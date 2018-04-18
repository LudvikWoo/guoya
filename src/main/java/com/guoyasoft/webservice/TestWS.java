package com.guoyasoft.webservice;

import org.springframework.beans.factory.annotation.Autowired;

import com.guoyasoft.bean.api.user.signUp.SignUpRequest;
import com.guoyasoft.bean.db.GyUser;
import com.guoyasoft.dao.GyUserMapper;

public class TestWS {

	@Autowired
	GyUserMapper mapper;
	
	public String signUp(SignUpRequest signUp) {
		System.out.println(signUp.toString());
		
		if(signUp.isValid()){
			System.out.println("验证通过");
			GyUser gu = new GyUser();
			gu.setSname(signUp.getUserName());
			gu.setRealname(signUp.getRealName());
			gu.setPassword(signUp.getPassword());
			gu.setWeichat(signUp.getWeixin());
			gu.setAddress(signUp.getAddress());
			gu.setPhone(signUp.getPhone());
			gu.setAge(Integer.parseInt(signUp.getAge()));
			gu.setEducation(signUp.getEducation());
			gu.setClassType(signUp.getClassType());
			try{
				mapper.insert(gu);
			}catch(Exception e){
				e.printStackTrace();
				return "user/signUp2";
			}
			return "user/login";
		}else{
			System.out.println("验证未通过");
			return "user/signUp2";
		}
	}
}
