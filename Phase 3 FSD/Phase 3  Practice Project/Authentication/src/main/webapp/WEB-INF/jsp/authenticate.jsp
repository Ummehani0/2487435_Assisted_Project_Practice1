<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  

<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
        integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Authentication</title>

</head>
<br>
<br>
<br>
<br>
<br>
<br>
<center><em><h2>LOGIN</h2></em></center>
<br>
<body>
<body bgcolor="MintCream">
<center><h6><em>welcome to the App:)<em></h6></center>

<form:form action="Auth" method="post" commandName="login">
	<h5><center><label for="username"> Username:</label></center></h5>
	<body bgcolor="MintCream">
	<center><input name="username" id="username" type="text" placeholder="Username" required/></center>
	<br>
	<h5><center><label for="password">Password:</label></center></h5>
	<center><input name="password" id="password" type="password" placeholder="Password" required/></center>
	<br>
	
	<center> <button class="btn btn-warning">submit</button></center>

</form:form>

</body>

</html>