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
<title>My JSP 'userInfo.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
-->
<script type="text/javascript">
function a(){
	document.getElementsByName('startTime')[0].setAttribute('value','2012-10-25');

}
</script>

</head>

<body>
	<center><h1>学生查询</h1></center>
	<form action="user/queryUser.action" target="result" method="post">
		<table border="1">
			<tr>
				<td>真实姓名：</td>
				<td><input type="text" name="realName"></td>
				<td>用户名：</td>
				<td><input type="text" name="userName"></td>
				<td>学历：</td>
				<td>
					<select name="education">
						<option value="">——请选择——</option>
						<option value="1">初/高中</option>
						<option value="2">大专</option>
						<option value="3">本科</option>
						<option value="4">研究生</option>
					</select>
				</td>
				<td>班级类型：</td>
				<td>
					<select name="classType">
						<option value="">——请选择——</option>
						<option value="1">基础班</option>
						<option value="2">提高班</option>
					</select>
			</tr>
			<tr>
				<td>注册时间：</td>
				<td><input type="date" name="startTime">-<input type="date" name="endTime"></td>
				<td>年龄：</td>
				<td><input type="number" min="18" max="32" name="minAge">-<input type="number" min="18" max="32" name="maxAge"></td>
				<td></td>
				<td></td>
				<td>查询：</td>
				<td><input type="submit" value="查询"></td>
			</tr>
		</table>
	</form>
</body>
<iframe src="" name="result" width="100%" height="70%">
</iframe>
</html>