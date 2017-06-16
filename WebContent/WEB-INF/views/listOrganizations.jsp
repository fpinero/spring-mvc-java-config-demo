<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List Organizations</title>
<style>
	table {
		border-collapse: collapse;
	}
	
	table, th, td {
		padding: 5px;
		margin:	10px;
		font-size: 20px;
		border: 1px solid black
	}
</style>
</head>
<body>
	<h2 align="center" style="color: #DF0101">
		<c:out value="${greeting}"></c:out>
	</h2>
	<hr/>
	<div align="center">
		<table>
			<caption style="font-size: 40px; margin-bottom: 10px">
				<c:out value="${locationName}"/>&nbsp;Organization Directory
			</caption>
			<tr>
				<th>Name</th>
				<th>Year</th>
				<th>Zip</th>
				<th>Emp Count</th>
				<th>Slogan</th>
			</tr>
			<c:forEach var="row" items="${orgList}"> <!-- model.addAttribute("orgList", orgs); (así esta en el controller) -->
				<tr>
					<td><b><c:out value="${row.companyName }"/></b></td>   <!-- private String companyName; (nombre de los campos en Organization.java -->
					<td><c:out value="${row.yearOfIncorporation }"/> </td>   <!-- private int yearOfIncorporation; -->
					<td><c:out value="${row.potalCode }"/> </td>   <!-- private String potalCode; -->
					<td><c:out value="${row.employeeCount }"/> </td>  <!-- private int employeeCount; -->
					<td><c:out value="${row.slogan }"/> </td>  <!-- private String slogan; -->
				</tr>
			</c:forEach>
		</table>
	</div>
	
</body>
</html>