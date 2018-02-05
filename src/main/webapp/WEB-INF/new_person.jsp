<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New Person</title>
</head>
<body>
	<h1>New Person</h1>
	
	<form:form action="/persons/new" method="post" modelAttribute="person">
		<form:label path="firstName">First Name:
			<form:input path="firstName"></form:input>
			<form:errors path="firstName"></form:errors>
		</form:label>

		<form:label path="lastName">Last Name:
			<form:input path="lastName"></form:input>
			<form:errors path="lastName"></form:errors>
		</form:label>
		
		<input type="submit" value="Create"></input>
	</form:form>
</body>
</html>