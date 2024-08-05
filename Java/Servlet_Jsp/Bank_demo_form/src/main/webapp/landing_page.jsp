<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*" %>

<% String name = (String)session.getAttribute("name"); %>
<!DOCTYPE html>
<html>
<head>
    <title>Banking Dashboard</title>
</head>
<body>
    <h1>Welcome <%out.print(name); %>  To Your Banking Dashboard</h1>
    <ul>
        <li><a href="deposit.html">Deposit</a></li>
        <li><a href="withdraw.html">Withdraw</a></li>
        <li><a href="balance.html">Check Balance</a></li>
        <li><a href="statement.jsp">Generate Statement</a></li>
        <li><a href="logout">Logout</a></li>
    </ul>
</body>
</html>
