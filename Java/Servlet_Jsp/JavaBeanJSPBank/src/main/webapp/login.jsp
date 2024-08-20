<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="a" class="acc.Account" scope="application" />
<jsp:setProperty name="a" property="email" param="username" />
<jsp:setProperty name="a" property="password" param="password" />

<%
    if (a.authenticateUser()) {
        session.setAttribute("accno", a.getAccno());
        session.setAttribute("name", a.getName());
        response.sendRedirect("Home.jsp");
    } else {
        out.println("<h1>Login Failed</h1>");
        out.println("<p>Incorrect username or password. Please try again.</p>");
        out.println("<p><a href='index.html'>Back to Login</a></p>");
    }
%>

</body>
</html>