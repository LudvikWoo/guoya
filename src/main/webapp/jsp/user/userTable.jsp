<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'userTable.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">


	<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">  
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>

<body>
	<div>
		<table class="table table-hover table-striped">
			<thead>
				<tr>
					<th>学号</th>
					<th>用户名</th>
					<th>姓名</th>
					<th>年龄</th>
					<th>微信</th>
					<th>手机</th>
					<th>学历</th>
					<th>班级类型</th>
					<th>注册时间</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="stu" items="${users}">
					<tr>
						<td>${stu.sno}</td>
						<td>${stu.sname}</td>
						<td>${stu.realname}</td>
						<td>${stu.age}</td>
						<td>${stu.weichat}</td>
						<td>${stu.phone}</td>
						<td>${stu.education}</td>
						<td>${stu.classType}</td>
						<td>${stu.newtime}</td>

					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
