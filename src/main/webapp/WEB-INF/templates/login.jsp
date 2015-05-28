<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
    <head>
        <title>Spring Security Kerberos Example</title>
    </head>
    <body>
        <form action="<c:url value="/login" />" method="post">
            <div><label> User Name : <input type="text" name="username"/> </label></div>
            <div><label> Password: <input type="password" name="password"/> </label></div>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            <div><input type="submit" value="Sign In"/></div>
        </form>
    </body>
</html>
