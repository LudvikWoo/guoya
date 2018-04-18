package com.guoyasoft.service;

import java.util.HashMap;

import com.guoyasoft.tool.MD5Tool;

public class Test {
	public static void main(String[] args) {
		HashMap<String,String> vars=new HashMap<String,String>();
		
		vars.put("passord", "00000");
		vars.get("passord");
		
		String password=MD5Tool.MD5("0000&key=guoyasoft");
		System.out.println(password);
	}
}
