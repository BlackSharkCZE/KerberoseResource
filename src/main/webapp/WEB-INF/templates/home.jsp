<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
    <head>
        <title>Spring Security Kerberos Example</title>
    </head>
    <body>
        <h1>Welcome!</h1>
        <p>Click <a href="<c:url value="/hello" />">here</a> to see a greeting.</p>
    </body>
</html>
