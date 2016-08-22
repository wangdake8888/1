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
			<td>序号</td>
			<td>文章标题</td>
			<td>发布时间</td>
			<td>操作</td>
		</tr>
    <c:forEach items="${articleList }" var="article">
        <tr>
           <td><c:out value="${article.articleId }"></c:out></td>
           <td><c:out value="${article.articleBiaoTi }"></c:out></td>
           <td><c:out value="${article.ShiJian }"></c:out></td>
           <td><a href="deletearticleaction?articleId=${article.articleId }">删除</a>&nbsp;<a href="getonearticleaction?articleId=${article.articleId }">修改</a>&nbsp;</td>
         </tr>
    </c:forEach>
    </table>
    <br /><br />
         发布新文章
    <form action="addarticleaction" method="post">
    <table border="1px">
	<tr>
	  <th>文章标题</th>
	  <td><input name="articleBiaoTi" value="${onearticle.articleBiaoTi }"></td>
	</tr>
	<tr>
	  <th>文章摘要</th>
	  <td><input name="articleZhaiYao" value="${onearticle.articleZhaiYao }"></td>
	</tr>
	<tr>
	  <th>文章内容</th>
	  <td><input name="articleNeiRong" value="${onearticle.articleNeiRong }"></td>
	</tr>
	<tr>
      <td><input type="submit" value="发布" /></td>
    </tr>
	</table>
	</form>
</body>
</html>