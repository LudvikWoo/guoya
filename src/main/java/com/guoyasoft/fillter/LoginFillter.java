package com.guoyasoft.fillter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import javax.servlet.http.HttpSession;

public class LoginFillter implements Filter {
	// 初始化时拿到fillter的配置信息
	public FilterConfig config;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// 拿到request、response和session
		HttpServletRequest hrequest = (HttpServletRequest) request;
		HttpServletResponseWrapper wrapper = new HttpServletResponseWrapper(
				(HttpServletResponse) response);
		HttpSession session = hrequest.getSession();

		// 第一步：登录权限校验开关设置
		String disableFlag = config.getInitParameter("disabletestfilter");
		if (disableFlag.toUpperCase().equals("Y")) { // 过滤无效
			chain.doFilter(request, response);
			return;
		}
		// 第四步：对免登陆和过滤页之外的其它地址放通
		String[] includeStrings = config.getInitParameter("includeStrings")
				.split(";");
		System.out.println("getRequestURI="+hrequest.getRequestURI());
		if (!"/guoya/".equals(hrequest.getRequestURI()) && !this.isContains(hrequest.getRequestURI(), includeStrings)) {
			chain.doFilter(request, response);
			return;
		}
		// 第一步：对登录页、宣传页放通不过滤
		String[] logonStrings = config.getInitParameter("logonStrings").split(
				";");
		if (this.isContains(hrequest.getRequestURI(), logonStrings)) {
			chain.doFilter(request, response);
			return;
		}
		// 第二步：获取登录页重定向地址
		String redirectPath = config.getInitParameter("redirectPath");
		String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getServletContext().getContextPath()+"/"; 
		redirectPath=basePath+redirectPath;
		System.out.println("redirectPath="+redirectPath);
		String path=request.getServletContext().getContextPath();
		System.out.println(path);
		// 第三步：获取session和已登录标识
		String userName = (String) session.getAttribute("userName");
		System.out.println("userName="+userName);
		if (userName != null && !"".equals(userName)) {
			// 第四步：验证登录标识的合法性
			boolean avalid = true;
			if (avalid) {
				chain.doFilter(request, response);
				return;
			} else {
				// 第五步：重定向，或者继续过滤链
				wrapper.sendRedirect(redirectPath);
				return;
			}
		} else {
			// 第五步：重定向，或者继续过滤链
			wrapper.sendRedirect(redirectPath);
			return;
		}

	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		this.config = config;
	}

	public static boolean isContains(String container, String[] regx) {
		boolean result = false;

		for (int i = 0; i < regx.length; i++) {
			if (container.indexOf(regx[i]) != -1) {
				return true;
			}
		}
		return result;
	}
}
