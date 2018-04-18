package com.guoyasoft.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.guoyasoft.bean.api.response.Response;
import com.guoyasoft.bean.api.user.queryUser.QryUserReq;
import com.guoyasoft.bean.api.user.signUp.SignUpRequest;
import com.guoyasoft.bean.db.GyUser;
import com.guoyasoft.bean.db.GyUserExample;
import com.guoyasoft.bean.db.GyUserExample.Criteria;
import com.guoyasoft.dao.GyUserMapper;
import com.guoyasoft.tool.MyStringTools;

//注解
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	GyUserMapper mapper;

	@RequestMapping(value = "/signUp.action")
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

	@RequestMapping(value = "/login.action")
	public String login(HttpServletRequest request,HttpSession session,String userName, String password, String checkCode) {
		System.out.println("userName=" + userName + ",password=" + password
				+ ",checkcode=" + checkCode);

		System.out.println(request.getHeader("User-Agent"));
		// 第1：拿到登录数据

		// 第二：查询数据库的数据
		GyUserExample example = new GyUserExample();

		Criteria c = example.createCriteria();

		c.andSnameEqualTo(userName);
		c.andPasswordEqualTo(password);

		List<GyUser> users = mapper.selectByExample(example);

		// 第三：判断是否ok
		if (users.size() > 0) {
			session.setAttribute("userName", userName);
			return "user/queryUser";
		} else {
			return "user/login";
		}
	}

	@RequestMapping(value = "/checkUser.action", method = RequestMethod.GET)
	@ResponseBody
	public Response checkUser(String userName) {
		System.out.println("userName=" + userName );

		// 第1：拿到登录数据

		// 第二：查询数据库的数据
		GyUserExample example = new GyUserExample();

		Criteria c = example.createCriteria();

		c.andSnameEqualTo(userName);
		List<GyUser> users =new ArrayList<GyUser>();

		Response response=new Response();
		try{
			users = mapper.selectByExample(example);
		}catch(Exception e){
			e.printStackTrace();
			response.setRespCode("0001");
			response.setRespDesc("用户已存在");
			return response;
		}
		if(users.size()==0){
			response.setRespCode("0000");
			response.setRespDesc("成功");
		}else{
			response.setRespCode("0001");
			response.setRespDesc("用户已存在");
		}
		return response;
	}
	
	@RequestMapping(value = "/queryUser.action")
	public ModelAndView queryUser(QryUserReq req) throws ParseException {
		System.out.println(req.toString());

		// 第1：拿到登录数据

		// 第二：查询数据库的数据
		GyUserExample example = new GyUserExample();

		Criteria c = example.createCriteria();
		if(MyStringTools.isBlank(req.getUserName())){
			c.andSnameLike("%"+req.getUserName().trim()+"%");
		}
		if(MyStringTools.isBlank(req.getRealName())){
			c.andRealnameLike("%"+req.getRealName().trim()+"%");
		}
		if(MyStringTools.isBlank(req.getEducation())){
			c.andEducationEqualTo(req.getEducation().trim());
		}
		SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
		
		if(MyStringTools.isBlank(req.getStartTime().trim())){
			c.andNewtimeGreaterThanOrEqualTo(sf.parse(req.getStartTime()));
		}
		if(MyStringTools.isBlank(req.getEndTime().trim())){
			c.andNewtimeLessThanOrEqualTo(sf.parse(req.getEndTime()));
		}
		if(MyStringTools.isBlank(req.getMinAge())){
			c.andAgeGreaterThanOrEqualTo(Integer.parseInt(req.getMinAge()));
		}
		if(MyStringTools.isBlank(req.getMaxAge())){
			c.andAgeLessThanOrEqualTo(Integer.parseInt(req.getMaxAge()));
		}

		List<GyUser> users = mapper.selectByExample(example);
//		List<GyUser> users=new ArrayList<GyUser>() ;
//			
//		for(int i=0;i<5;i++){
//			GyUser gu=new GyUser();
//			gu.setSname("姓名"+i);
//			gu.setAge(i);
//			gu.setClassType(classType);
//			users.add(gu);
//		}
		// 第三：判断是否ok
		ModelAndView result=new ModelAndView();
		result.addObject("users",users);
		result.setViewName("user/userTable");
		return result;
	}
}
