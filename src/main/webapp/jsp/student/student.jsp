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

<title>My JSP 'student.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script src="js/jquery-3.3.1.min.js">
	
</script>
</head>
<script>
	$(document).ready(function() {
		
		$("button").click(function() {
			$("p").hide();
			alert($("img").attr("src"));
			$("#name").Attr("value");
			add();
		});
		
		function add(){
			alert(1+2);
		}
	});

	function add(){
		alert(1+2);
	}
</script>
</head>

<body>
	<h2>这是一个标题</h2>
	<p>这是一个段落。</p>
	<p>这是另一个段落。</p>
	<button>点我</button>
	<img src="aaaa">
	
	<input id="name" type="text" value="23">
</body>
</html>
