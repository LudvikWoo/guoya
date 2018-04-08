package com.guoyasoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.guoyasoft.bean.api.user.signUp.SignUpRequest;
import com.guoyasoft.bean.db.GyUser;
import com.guoyasoft.bean.db.GyUserExample;
import com.guoyasoft.bean.db.GyUserExample.Criteria;
import com.guoyasoft.dao.GyUserMapper;

//注解
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	GyUserMapper mapper;

	@RequestMapping(value = "/signUp")
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
			
			mapper.insert(gu);
			
			return "user/login";
		}else{
			System.out.println("验证未通过");
			return "user/signUp";
		}
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(String userName, String password, String checkCode) {
		System.out.println("userName=" + userName + ",password=" + password
				+ ",checkcode=" + checkCode);

		// 第1：拿到登录数据

		// 第二：查询数据库的数据
		GyUserExample example = new GyUserExample();

		Criteria c = example.createCriteria();

		c.andSnameEqualTo(userName);
		c.andPasswordEqualTo(password);

		List<GyUser> users = mapper.selectByExample(example);

		// 第三：判断是否ok
		if (users.size() > 0) {
			return "user/queryUser";
		} else {
			return "user/login";
		}
	}

	@RequestMapping(value = "/queryUser", method = RequestMethod.GET)
	public ModelAndView queryUser(String userName, String minAge, String maxAge,
			String classType) {
		System.out.println("userName=" + userName + ",minAge=" + minAge
				+ ",maxAge=" + maxAge + ",classType=" + classType);

		// 第1：拿到登录数据

		// 第二：查询数据库的数据
		GyUserExample example = new GyUserExample();

		Criteria c = example.createCriteria();

		c.andSnameLike(userName);
		c.andAgeBetween(Integer.parseInt(minAge), Integer.parseInt(maxAge));
		c.andClassTypeEqualTo(classType);

		List<GyUser> users = mapper.selectByExample(example);

		// 第三：判断是否ok
		ModelAndView result=new ModelAndView();
		result.addObject(users);
		result.setViewName("user/userTable");
		return result;
	}
}
