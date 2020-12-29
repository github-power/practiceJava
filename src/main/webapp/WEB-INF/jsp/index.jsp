<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title></title>
</head>
<body>
	<table border="1">
		<c:forEach items="${list}" var="user" varStatus="status">
			<tr>
				<td>${user.id }</td>
				<td>${user.name }</td>
				<td><c:if test="${user.sex== 1 } "> 男</c:if> <c:if
						test="${user.sex == 0 }"> 女</c:if> <c:if
						test="${ user.sex !=1 && user.sex !=0  }"> 未指定</c:if></td>
				<td>${ status.index}</td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>
