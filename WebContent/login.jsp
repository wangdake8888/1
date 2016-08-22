<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>Insert title here</title>
<style type="text/css">
	td{
		background-color: #ccc;
	}

</style>
</head>
<body>
<!--HTML 可以被客户看到  -->
<%--JSP 不能被客户查看 --%>

<form action="loginAction" method="post">
	<table>
		<tr>
			<td>用户名：</td>
			<td>sgswr
			</td>
		</tr>
		<tr>
			<td>密码：</td>
			<td>sdg</td>
		</tr>
		
		<tr>
			<td>操作：</td>
			<td>
				<input name="submit" type="submit" value="登录"/>
			 	<input type="button" id="btn" value="注册"
		onclick="window.location.href='reg.jsp'" />
			</td>
		</tr>
	</table>
</form>
</body>
</html>