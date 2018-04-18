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

<style type="text/css">
table {
	width: 50%;
	border: 1px solid black;
	margin: 3% auto;
	padding: 2%;
}
tr td:nth-child(1){
	width:15%;
}
tr td:nth-child(2){
	width:40%;
}
tr td:nth-child(3){
	width:45%;
}
td {
	border: 1px solid black;
}
span{
	font-size: 10px;
	color: red;
}
</style>

<script src="js/jquery-3.3.1.min.js"  type="text/javascript"></script>
<script src="js/md5.js" type="text/javascript"></script>
<script type="text/javascript">
	var valCount=0;
	var validateUser=false;
	var key="guoyasoft";
	$(document).ready(function() {

		$("#userName").blur(function() {
			//alert("start");
			var result=userName();
			//alert(result);
			if(result==true){
				valiUserName();
			}
		});
		function userName(){
			var reg= /^[a-zA-Z0-9_-]{4,16}$/;
			return validate("#userName",reg,"4到16位（字母，数字，下划线，减号）");
		}
		$("#realName").blur(function() {
			realName();
		});
		function realName(){
			var reg= /^[\u4e00-\u9fa5a-zA-Z]{2,16}$/;
			validate("#realName",reg,"2到16位（字母、中文）");
		}

		$("#password").blur(function() {
			password();
			comparePwd();
		});
		function password(){
			var reg= /^.*(?=.{6,})(?=.*\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*? ]).*$/;
			validate("#password",reg,"最少6位，包括至少1个大写字母，1个小写字母，1个数字，1个特殊字符(!@#$%^&*? )");
		}


		$("#password2").blur(function() {
			comparePwd();
		});
		function password2(){
			var reg= /^.*(?=.{6,})(?=.*\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*? ]).*$/;
			validate("#password2",reg,"最少6位，包括至少1个大写字母，1个小写字母，1个数字，1个特殊字符");
		}


		$("#weixin").blur(function() {
			weixin();
		});
		function weixin(){
			var reg= /^[-_a-zA-Z0-9]{6,20}$/;
			validate("#weixin",reg,"6至20位，字母，数字，减号，下划线");
		}

		$("#phone").blur(function() {
			phone();
		});
		function phone(){
			var reg= /^1[0-9]{10}$/;
			validate("#phone",reg,"11位数字");
		}

		$("#address").blur(function() {
			address();
		});
		function address(){
			var reg= /^[\u4e00-\u9fa5a-zA-Z0-9_-]{4,}$/;
			validate("#address",reg,"大于4位");
		}

		$("#age").blur(function() {
			age();
		});
		function age(){
			var reg= /^(1[89])|(2\d)|(3[0-2])$/;
			return validate("#age",reg,"18至32岁");
		}
		
		$("#checkCode").blur(function() {
			checkCode();
		});
		function checkCode(){
			var reg= /^1234$/;
			return validate("#checkCode",reg,"验证码不正确");
		}
		$("#classType").blur(function() {
			classType();
		});
		function classType(){
			var reg= /^[^0]$/;
			return validate("#classType",reg,"请选择");
		}
		
		$("#education").blur(function() {
			education();
		});
		function education(){
			var reg= /^[^0]$/;
			return validate("#education",reg,"请选择");
		}
		
		
		function comparePwd(){
			var p1=$("#password").val();
			var p2=$("#password2").val();
			//输出 true
			//alert(reg.test(value));
			if(p1!=p2){
				$("#password2Warn").html("两次密码不一致");
				valCount++;
				return ;
			}else{
				$("#password2Warn").html("");
				valCount--;
				return ;
			}
		}
				
		function validate(field,reg,alertText){
			//alert($(field).val());
			var value=$(field).val();
			//输出 true
			//alert(reg.test(value));
			if(!reg.test(value)){
				$(field+"Warn").html(alertText);
				valCount++;
				return false;
			}else{
				$(field+"Warn").html("");
				valCount--;
				return true;
			}
		}

		$("#submitBtn").click(function(){

			userName();
			realName();
			password();
			comparePwd();
			//weixin();
			phone();
			//address();
			age();
			checkCode();		
			education();
			classType();
			
			if(valCount>0){
				return ;
			}else{
				var r=confirm("确认提交？");
				if(r==true){
					valiUserName();
					//alert(validateUser);
					if(validateUser==false){
						return ;
					}
					var pwd=$("#password").val();
					var md5Pwd=hex_md5(pwd+"&key="+key);
					$("#password").val(md5Pwd);
					$("#password2").val(md5Pwd);
					$("#signUpId").submit();
				}
			}
		});
		function valiUserName(){
			//alert("start");
			var userName=$("#userName").val();
			var xmlhttp = new XMLHttpRequest();
			xmlhttp.onreadystatechange = function() {
				if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
					var response=JSON.parse(xmlhttp.responseText);
					//alert(response.respCode);
					if(response.respCode=="0000"){
						$("#userNameWarn").html("");
						validateUser=true;
					}else{
						$("#userNameWarn").html("用户名已存在");
						validateUser=false;
					}
				}
			};
			xmlhttp.open("GET", "/guoya/user/checkUser.action?userName="+userName, true);
			xmlhttp.send();
			
		}
	});
</script>
</head>

<body>
	<center><h1>登记注册</h1></center>
	<form action="user/signUp.action" method="post" id="signUpId">
		<table>
			<tr>
				<td>用户名：</td>
				<td><input type="text" id="userName" name="userName" value="guoya"> </td>
				<td> <span>*</span> <span id="userNameWarn"></span></td>
			</tr>
			<tr>
				<td>真实姓名：</td>
				<td><input type="text" id="realName" name="realName"> </td>
				<td>  <span>*</span> <span id="realNameWarn"></span></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" id="password" name="password"> </td>
				<td>  <span>*</span> <span id="passwordWarn"></span></td>
			</tr>
			<tr>
				<td>确认密码：</td>
				<td><input type="password" id="password2" name="password2"> </td>
				<td>  <span>*</span> <span id="password2Warn"></span></td>
			</tr>
			<tr>
				<td>微信号：</td>
				<td><input type="text" id="weixin" name="weixin"> </td>
				<td>  <span id="weixinWarn"></span></td>
			</tr>
			<tr>
				<td>地址：</td>
				<td><input type="text" id="address" name="address"> </td>
				<td>  <span id="addressWarn"></span></td>
			</tr>
			<tr>
				<td>手机：</td>
				<td><input type="text" id="phone" name="phone"> </td>
				<td>  <span>*</span> <span id="phoneWarn"></span></td>
			</tr>
			<tr>
				<td>年龄：</td>
				<td><input type="text" id="age" name="age"> </td>
				<td>  <span>*</span> <span id="ageWarn"></span></td>
			</tr>
			<tr>
				<td>学历：</td>
				<td>
					<select id="education" name="education">
						<option value="0">——请选择——</option>
						<option value="1">初/高中</option>
						<option value="2">大专</option>
						<option value="3">本科</option>
						<option value="4">研究生</option>
					</select>
				</td>
				<td>  <span>*</span> <span id="educationWarn"></span></td>
			</tr>
			<tr>
				<td>班级：</td>
				<td>
					<select id="classType" name="classType">
						<option value="0">——请选择——</option>
						<option value="1">基础班</option>
						<option value="2">提高班</option>
					</select>
				</td>
				<td>  <span>*</span> <span id="classTypeWarn"></span></td>
			</tr>
			<tr>
				<td>校验码：</td>
				<td><input type="text" id="checkCode" name="checkCode"> 1234  </td>
				<td> <span>*</span> <span id="checkCodeWarn"></span></td>
			</tr>
			<tr>
				<td><input type="button" value="注册" id="submitBtn"></td>
				<td></td>
				<td><input type="reset" value="重置"></td>
			</tr>
		</table>
	</form>
</body>
</html>