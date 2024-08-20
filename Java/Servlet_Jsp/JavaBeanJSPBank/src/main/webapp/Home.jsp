<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="true"%>
<%
    Integer accno = (Integer) session.getAttribute("accno");
    String name = (String) session.getAttribute("name");

    if (accno == null || name == null) {
        response.sendRedirect("index.html");
    }
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home - USBank</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            margin: 0;
        }
        .container {
            background-color: #fff;
            padding: 30px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
            text-align: center;
        }
        h1 {
            margin-bottom: 20px;
            color: #333;
        }
        p {
            font-size: 18px;
            color: #666;
        }
        .tile {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 80px;
            border: 1px solid #ddd;
            border-radius: 5px;
            background-color: #82b0e0;
            transition: background-color 0.4s;
        }
        .tile:hover {
            background-color: #007bff;
            color: white;
        }
        .tile a {
            color: inherit;
            text-decoration: none;
            display: block;
            width: 100%;
            height: 100%;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .logout-tile {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 80px;
            border: 1px solid #ddd;
            border-radius: 5px;
            transition: background-color 0.3s;
            background-color: #faa2aa;
        }
        .logout-tile:hover {
            background-color: #f55667;
            color: white;
        }
        .logout-tile a {
            color: black;
            text-decoration: none;
            display: block;
            width: 100%;
            height: 100%;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .logout-tile a:hover {
            color: white;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Welcome <%= name %> to USBank</h1>
        <p>Account Number: <%= accno %></p>
        <div class="row">
            <div class="col-md-6 mb-3">
                <div class="tile">
                    <a href="deposit.jsp">Deposit Amount</a>
                </div>
            </div>
            <div class="col-md-6 mb-3">
                <div class="tile">
                    <a href="withdraw.jsp">Withdraw Amount</a>
                </div>
            </div>
            <div class="col-md-6 mb-3">
                <div class="tile">
                    <a href="CheckBalance.jsp">Check Balance</a>
                </div>
            </div>
            <div class="col-md-6 mb-3">
                <div class="tile">
                    <a href="BankStatement.jsp">Bank Statement</a>
                </div>
            </div>
        </div>
        <div class="row justify-content-center">
            <div class="col-md-4 mb-3">
                <div class="logout-tile">
                    <a href="Logout.jsp">Logout</a>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
