<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index</title>
</head>
<body>
	<h1>Information</h1> 
<button><a href="/persons/new">Create One</a></button>
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>License #</th>
			<th>State</th>
			<th>Expiration Date</th>
		</tr>
		
		<c:forEach items="${persons}" var="person" varStatus="loop">
			<!-- Thank goodness it exposes private members or this would be atrocious -->
			<tr>
				<td><c:out value="${person.firstName}"/></td>
				<td><c:out value="${person.lastName}"/></td>
				<td><c:out value="${person.license.number}"/></td>
				<td><c:out value="${person.license.state}"/></td>
				<td><c:out value="${person.license.expiration_date}"/></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>