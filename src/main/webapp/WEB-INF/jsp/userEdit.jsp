<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title></title>
</head>
<body>
<c:if test="${info==null}">
<form action="save" method="post">
</c:if>
<c:if test="${infol!=null}">
<form action="update" method="post">
<input type="hidden" name="id" value="${info.id}">
</c:if>
<input name="name" value="${info.name}">

<select name="sex">
<c:forEach items="${sexs }" var="r" varStatus="v">
<c:if test="${v.index}">${r}<option>
</c:if>
<c:if test="${v.index==info.sex}">
<option value="${v.index}" selected="selected">${r}</option>
</c:if>
</c:forEach>
</select>

<input name="sex" value="${info.sex}">
<input type="submit">保存</button>
</form>

</body>
</html>