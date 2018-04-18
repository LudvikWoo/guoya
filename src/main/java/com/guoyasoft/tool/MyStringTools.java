package com.guoyasoft.tool;

public class MyStringTools {
	public static boolean isBlank(String str){
		if(!"".equals(str)&& str!=null && !"null".equals(str) && !"NULL".equals(str)){
			return true;
		}else{
			return false;
		}
	}
}
