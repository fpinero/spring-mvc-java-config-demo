<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Organization Home Page</title>
</head>
<body>
	<h1>Organization home page</h1>
	<h2 align="center" style="color:#DF0101">Welcome&nbsp;<c:out value="${greeting}"></c:out></h2>
	<hr/>
	<h1 align="center">Organization Details</h1>
	<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
	<div style="text-align:center">
		<a href="${contextPath}/location" style="font-sixe: 30px">Click here to get organization details for your Lacation.</a>
	</div>	
</body>
</html>