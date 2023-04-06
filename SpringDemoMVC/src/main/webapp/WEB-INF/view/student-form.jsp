<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
	
	First Name: <form:input path="firstName" />
		
	<br><br>

	Last Name: <form:input path="lastName" />		

	<br><br>
	
	Country: <form:select path="country">
	
	<!--  
	<form:option value="Brazil" label="Brazil" />
	<form:option value="France" label="France" />
	<form:option value="Germany" label="Germany" />
	<form:option value="Bangladesh" label="Bangladesh" /> 
	-->
	
	<form:options items="${student.countryOptions}" />
	
	</form:select>
	
	<br><br>
	
	Java <form:radiobutton path="favLanguage" value="Java" />
	C# <form:radiobutton path="favLanguage" value="C#" />
	PHP <form:radiobutton path="favLanguage" value="PHP" />
	Ruby <form:radiobutton path="favLanguage" value="Ruby" />
	
	<br><br>
	
	Operating System(s):
	
	Linux <form:checkbox path="operatingSystems" value="Linux" />
	Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
	MS Windows <form:checkbox path="operatingSystems" value="MS Windows" />
	
	<input type="submit" value="submit" />
	
	</form:form>
	
</body>

</html>