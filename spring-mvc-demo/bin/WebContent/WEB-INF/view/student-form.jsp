<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First Name: <form:input path="firstName" />
		<br />
		<br />
		Last Name: <form:input path="lastName" />
		<br />
		<br />
		Country: 
		<form:select path="country">
			<%-- <form:option value="India" label="India"></form:option>
			<form:option value="United States" label="United States"></form:option>
			<form:option value="United Kingdom" label="United Kingdom"></form:option>
			<form:option value="Germany" label="Germany"></form:option>
			<form:option value="France" label="France"></form:option> --%>
			<form:options items="${student.countryOptions}" />
		</form:select>
		<br />
		<br />
		Favorite Programming Language:
		<br />
		<form:radiobutton path="favoriteLanguage" value="C" />C 
		<br />
		<form:radiobutton path="favoriteLanguage" value="Java" />Java 
		<br />
		<form:radiobutton path="favoriteLanguage" value="C++" />C++ 
		<br />
		<form:radiobutton path="favoriteLanguage" value="Ruby" />Ruby
		<br />
		<%-- <form:radiobuttons path="favoriteLanguage" items="${student.languageOptions}"/> --%>
		<br />
		Operating Systems Known:
		<br />
		<form:checkbox path="operatingSystems" value="Linux"/>Linux
		<br />
		<form:checkbox path="operatingSystems" value="MAC OS"/>MAC OS
		<br />
		<form:checkbox path="operatingSystems" value="MS Windows"/>MS Windows
		<br />
		<br />
		
		<input type="submit" value="submit" />

	</form:form>
</body>
</html>