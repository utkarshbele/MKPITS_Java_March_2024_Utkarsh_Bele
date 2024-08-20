<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList" import="acc.AccTransactions"%>
<%
    Integer accno = (Integer) session.getAttribute("accno");
    if (accno == null) {
        response.sendRedirect("index.html");
    }
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bank Statement</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }
        .container {
            background-color: #fff;
            padding: 30px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
        }
        h1 {
            text-align: center;
            margin-bottom: 20px;
            color: #333;
        }
        table {
            width: 100%;
            margin-bottom: 20px;
        }
        th {
            text-align: center;
            background-color: black !important;
            color: #fff !important;
        }
        td {
            text-align: center;
        }
        .btn-primary {
            background-color: #007bff;
            color: white;
            border: none;
            cursor: pointer;
        }
        .btn-primary:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <jsp:useBean id="transaction" class="acc.AccTransactions" scope="session"/>
        <jsp:setProperty name="transaction" property="accno" value='<%= accno.intValue() %>' />
        
        <h1>USBank Statement</h1>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>Transaction ID</th>
                    <th>Transaction Date</th>
                    <th>Transaction Type</th>
                    <th>Amount</th>
                </tr>
            </thead>
            <tbody>
                <%
                    ArrayList<AccTransactions> statement = transaction.getStatement();
                    for (AccTransactions trans : statement) {
                %>
                <tr>
                    <td><%= trans.getId() %></td>
                    <td><%= trans.getDate() %></td>
                    <td><%= trans.getTransaction_type() %></td>
                    <td>₹<%= trans.getAmount() %></td>
                </tr>
                <% } %>
            </tbody>
        </table>
        <a href="Home.jsp" class="btn btn-primary">Go back to the Welcome page</a>
    </div>
</body>
</html>