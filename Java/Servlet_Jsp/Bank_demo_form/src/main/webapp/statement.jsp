<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*" session="true"%>
    
 <%
String jdbcURL = "jdbc:mysql://localhost:3306/bankdb";
String dbUser = "root";
String dbPassword = "*usb12101995#";

Integer accno = (Integer) session.getAttribute("accountnumber");
try{
Connection conn = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

String sql = "select * from transactions where accno = ?";
PreparedStatement statement = conn.prepareStatement(sql);
statement.setInt(1, accno.intValue());
ResultSet rs = statement.executeQuery();

%>
<!DOCTYPE html>
<html>
<head>
    <title>Bank Statement</title>
</head>
<body>
    <h1>Bank Statement</h1>
    <table border="1">
        <tr>
            <th>Transaction ID</th>
            <th>Transaction Date</th>
            <th>Transaction Type</th>
            <th>Amount</th>
        </tr>
        <%
            while (rs.next()) {
        %>
        <tr>
            <td><%= rs.getInt("id") %></td>
            <td><%= rs.getDate("date") %></td>
            <td><%= rs.getString("transaction_type") %></td>
            <td><%= rs.getDouble("amount") %></td>
        </tr>
        <%
            }
        %>
    </table>
    <a href="landing_page.jsp">Go back to the landing page</a>
</body>
</html>
<%
}catch (SQLException e) 
	{
        out.println("<html><body>");
        out.println("<h1>Error</h1>");
        out.println("<p>An error occurred while retrieving your bank statement: " + e.getMessage() + "</p>");
        out.println("<a href='landing_page.jsp'>Go back to the landing page</a>");
        out.println("</body></html>");
    }
%>