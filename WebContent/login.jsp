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
<!--HTML ���Ա��ͻ�����  -->
<%--JSP ���ܱ��ͻ��鿴 --%>

<form action="loginAction" method="post">
	<table>
		<tr>
			<td>�û�����</td>
			<td>sgswr
			</td>
		</tr>
		<tr>
			<td>���룺</td>
			<td>sdg</td>
		</tr>
		
		<tr>
			<td>������</td>
			<td>
				<input name="submit" type="submit" value="��¼"/>
			 	<input type="button" id="btn" value="ע��"
		onclick="window.location.href='reg.jsp'" />
			</td>
		</tr>
	</table>
</form>
</body>
</html>