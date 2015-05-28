<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
  <title>Spring Security Kerberos Example</title>
</head>
<body>
  <h1 th:inline="text">Hello [[${httpServletRequest.remoteUser}]]!</h1>
  <h1 th:inline="text">User principal is [[${httpServletRequest.userPrincipal}]]!</h1>
</body>
</html>