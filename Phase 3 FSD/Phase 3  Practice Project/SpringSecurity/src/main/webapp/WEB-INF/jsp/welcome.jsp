<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="https://www.thymeleaf.org"
      xmlns:sec="https://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
    <head>
     <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
        integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
        <center><title>Welcome!</title></center>
    </head>
    <body bgcolor=blue>
    <hr>

        <p style="color:blue"><center> <h1 th:inline="text">Hello [[${#httpServletRequest.remoteUser}]]! <br> You have successfully logged in.......</h1></center></p>
        <hr>
        <form th:action="@{/logout}" method="post">
         <center>   <input type="submit" value="Sign Out"  class="btn btn-secondary"/> </center> 
            <hr>
        </form>
    </body>
</html>