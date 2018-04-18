<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'signUp.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
table {
	width: 40%;
	border: 1px solid black;
	margin: 3% auto;
	padding: 2%;
}

td {
	border: 1px solid black;
}
</style>

<script src="js/jquery-3.3.1.min.js" type="text/javascript"></script>
<script src="js/md5.js" type="text/javascript"></script>
<script type="text/javascript">
	var key = "guoyasoft";
	$(document).ready(function() {
		$("#loginBtn").click(function(){
			var password = $("#password").val();
			$("#password").val(hex_md5(password + "&key=" + key));
			$("#form").submit();
		});
	});
</script>

</head>

<body>
	<center><h1>登录界面</h1></center>
	<form action="user/login.action" method="post" id="form">
		<table>
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="userName"></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" id="password" name="password"></td>
			</tr>
			<tr>
				<td>校验码：</td>
				<td><input type="text" name="checkCode"> 12345</td>
			</tr>
			<tr>
				<td><input id="loginBtn" type="button" value="登录"></td>
				<td><input type="reset" value="重置"></td>
			</tr>
		</table>
	</form>
</body>
</html>
