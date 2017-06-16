<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>@RequestMapping and RequestParam test bed</title>
<style>
input[type=tect] {
	padding: 10px;
	margin: 10px;
	font-size: 20px
}

input[type=submit] {
	border: none;
	background-color: #4CAF50;
	color: white;
	padding: 16px; margin 16px;
	cursor: pointer;
	font-size: 20px
}

h2 {
	color: #08298A;
	text-align: center
}
</style>
</head>
<body>
	<div align="left">
		<h2 align="center">Hello, Welcome to the @RequestMapping &
			RequestParam test Bed</h2>
		<hr />
		<form action="test1">
			<h3>test1: Testing @RequestParam without explicit attributes</h3>
			<label id="organization-name">Organization Name</label> <input
				type="text" name="orgname" placeholder="Enter organization name"
				size="40"> <input type="submit" value="Submit" />
		</form>

		<br />
		<br />
		<form action="test2">
			<h3>test2: Testing @RequestMapping 'method' attribute</h3>
			<label id="organization-name">Organization Name</label> <input
				type="text" name="orgname" placeholder="Enter organization name"
				size="40"> <input type="submit" value="Submit" />
		</form>
		
		<br />
		<br />
		<form action="test3"> <!-- no existe test3 en el controller pero existe * y se hace cargo de la llamada -->
			<h3>test3: Testing @RequestMapping fallback feature</h3>
			<label id="organization-name">Organization Name</label> 
				<input type="submit" value="Submit" />
		</form>
		
		<br />
		<br />
		<form action="test4">
			<h3>test2: Testing @RequestParam 'default' attribute</h3>
			<label id="organization-name">Organization Name</label> <input
				type="text" name="orgname" placeholder="Enter organization name"
				size="40"> <input type="submit" value="Submit" />
		</form>
		
		<br />
		<br />
		<form action="test5">
			<h3>test5: Testing @RequestParam without 'name' or 'value' attribute</h3>
			<label id="organization-name">Organization Name</label> <input
				type="text" name="orgname" placeholder="Enter organization name"
				size="40"> <input type="submit" value="Submit" />
		</form>

	</div>
</body>
</html>