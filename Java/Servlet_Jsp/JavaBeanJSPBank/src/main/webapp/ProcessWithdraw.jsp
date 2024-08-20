<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
    Integer accno = (Integer) session.getAttribute("accno");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Withdrawal Result</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .container {
            background-color: #fff;
            padding: 30px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
            width: 100%;
            max-width: 400px;
            text-align: center;
        }
        h1 {
            margin-bottom: 20px;
            color: #333;
        }
        p {
            margin: 20px 0;
            color: #666;
        }
        a {
            color: #007bff;
            text-decoration: none;
        }
        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="container">
        <jsp:useBean id="transaction" class="acc.WithdrawAmount" scope="session"/>
        <jsp:setProperty name="transaction" property="accno" value='<%= accno.intValue() %>' />
        <jsp:setProperty name="transaction" property="amount" param="amount" />

        <%
            if (transaction.withdraw()) {
        %>
            <h1>Withdrawal Successful</h1>
            <p>The amount has been withdrawn from your account.</p>
            <a href="Home.jsp">Back to Welcome Page</a>
        <%
            } else {
        %>
            <h1>Withdrawal Failed</h1>
            <p>There was an error processing your withdrawal. Please try again.</p>
            <a href="Home.jsp">Back to Welcome Page</a>
        <%
            }
        %>
    </div>
</body>
</html>
