<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>Insert title here</title>
</head>
<body>
<body>
	<table border="1px">
		<tr>
			<td>���</td>
			<td>���±���</td>
			<td>����ʱ��</td>
			<td>����</td>
		</tr>
    <c:forEach items="${articleList }" var="article">
        <tr>
           <td><c:out value="${article.articleId }"></c:out></td>
           <td><c:out value="${article.articleBiaoTi }"></c:out></td>
           <td><c:out value="${article.ShiJian }"></c:out></td>
           <td><a href="deletearticleaction?articleId=${article.articleId }">ɾ��</a>&nbsp;<a href="getonearticleaction?articleId=${article.articleId }">�޸�</a>&nbsp;</td>
         </tr>
    </c:forEach>
    </table>
    <br /><br />
         ����������
    <form action="addarticleaction" method="post">
    <table border="1px">
	<tr>
	  <th>���±���</th>
	  <td><input name="articleBiaoTi" value="${onearticle.articleBiaoTi }"></td>
	</tr>
	<tr>
	  <th>����ժҪ</th>
	  <td><input name="articleZhaiYao" value="${onearticle.articleZhaiYao }"></td>
	</tr>
	<tr>
	  <th>��������</th>
	  <td><input name="articleNeiRong" value="${onearticle.articleNeiRong }"></td>
	</tr>
	<tr>
      <td><input type="submit" value="����" /></td>
    </tr>
	</table>
	</form>
</body>
</html>