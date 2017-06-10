<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List Organizations using a Service</title>
</head>
<body>
	<h1>Listing organizations using a Service</h1>
	<c:forEach var="row" items="${orgList}"> <!-- model.addAttribute("orgList", orgs); (así esta en el controller) -->
		<b>Name: ${row.companyName } </b><br/>   <!-- private String companyName; (nombre de los campos en Organization.java -->
		Year: ${row.yearOfIncorporation } <br/>   <!-- private int yearOfIncorporation; -->
		Zip: ${row.potalCode } <br/>   <!-- private String potalCode; -->
		Emp. Count: ${row.employeeCount } <br/>  <!-- private int employeeCount; -->
		Slogan: ${row.slogan } <br/><br/>  <!-- private String slogan; -->
	</c:forEach>
</body>
</html>