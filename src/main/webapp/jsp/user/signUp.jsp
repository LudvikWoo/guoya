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
<script type="text/javascript">
	function change(){
		var btn=document.getElementById("classType");
		btn.onClick=function(){
			alert(1);
		};
	}
</script>

</head>

<body>
	<center><h1>登记注册</h1></center>
	<form action="user/signUp.action" method="get" >
		<table>
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="userName"> * </td>
			</tr>
			<tr>
				<td>真实姓名：</td>
				<td><input type="text" name="realName"> * </td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" name="password"> * </td>
			</tr>
			<tr>
				<td>确认密码：</td>
				<td><input type="password" name="password2"> * </td>
			</tr>
			<tr>
				<td>微信号：</td>
				<td><input type="text" name="weixin"></td>
			</tr>
			<tr>
				<td>地址：</td>
				<td><input type="text" name="address"></td>
			</tr>
			<tr>
				<td>手机：</td>
				<td><input type="text" name="phone"> * </td>
			</tr>
			<tr>
				<td>年龄：</td>
				<td><input type="text" name="age"> * </td>
			</tr>
			<tr>
				<td>学历：</td>
				<td><input type="text" name="education"> * </td>
			</tr>
			<tr>
				<td>班级：</td>
				<td><input type="text" name="classType" id="classType"> * </td>
			</tr>
			<tr>
				<td>校验码：</td>
				<td><input type="text" name="checkCode"> 12345</td>
			</tr>
			<tr>
				<td>
    				<input type="submit" value="注册" onclick="change()"></td>
				<td><input type="reset" value="重置"></td>
			</tr>
		</table>
	</form>
</body>
</html>