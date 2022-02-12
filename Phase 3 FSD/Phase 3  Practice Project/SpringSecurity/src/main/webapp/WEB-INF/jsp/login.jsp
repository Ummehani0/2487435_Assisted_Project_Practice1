<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="https://www.thymeleaf.org"
      xmlns:sec="https://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
    <head>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
        integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
        <title>Login</title>
    </head>
    <body>
        <div th:if="${param.error}">
        
          <center> <h3>Invalid username or password.</h3></center>
        </div>
        <div th:if="${param.logout}">
            You have been logged out.
        </div>
        <form th:action="@{/login}" method="post">
        <fieldset class="form-group">
        <hr>
      <center>  <label for="username">User Name:</label></center>
      <center>  <input type="text" class="form-control-md" placeholder="Your username" name="username" id="userName"></center>
    </fieldset>

	<fieldset class="form-group">
       <center> <label for="password">Password:</label></center>
    <center>    <input type="password" class="form-control-md" placeholder="Your Password" name="password" id="password"></center>
    </fieldset>

           <center> <div><input type="submit" value="Sign In" class="btn btn-secondary"/></div></center>
        </form>
        <hr>
        <center><em><strong><a href="/">Return to Main Page</a></strong></em><center>
        <hr>
    </body>
</html>