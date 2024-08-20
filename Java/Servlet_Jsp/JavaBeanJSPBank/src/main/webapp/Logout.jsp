<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    // Invalidate the session to log out the user
    session.invalidate();
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Logout</title>
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
            text-align: center;
            background-color: #fff;
            padding: 30px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
        }
        h1 {
            color: #333;
        }
    </style>
    <script>
        // function to redirect after a delay
        function redirectHome() {
            setTimeout(function() {
                window.location.href = 'index.html';
            }, 5000);
        }
        
        // call the function when the page loads
        window.onload = redirectHome;
    </script>
</head>
<body>
    <div class="container">
        <h1>You have been logged out successfully.</h1>
        <p>You will be redirected to the home page in 5 seconds.</p>
    </div>
</body>
</html>
