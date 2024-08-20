package studentservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.*;
import java.sql.*;
/**
 * Servlet implementation class Student_Servlet
 */
public class Student_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Student_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String name = request.getParameter("name");
        String address = request.getParameter("address");
        String city = request.getParameter("city");

        // Database connection details
        String jdbcURL = "jdbc:mysql://localhost:3306/student_db";
        String dbUser = "root";
        String dbPassword = "*usb12101995#";
        
        try {
	        	Class.forName("com.mysql.cj.jdbc.Driver");
	        	Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
	            PreparedStatement statement = connection.prepareStatement("INSERT INTO students (name, address, city) VALUES (?, ?, ?)"); 
	            statement.setString(1, name);
	            statement.setString(2, address);
	            statement.setString(3, city);
	            statement.executeUpdate();
	            
	            String selectSQL = "SELECT * FROM students";
	            Statement selectStatement = connection.createStatement();
	            ResultSet resultSet = selectStatement.executeQuery(selectSQL);

	            response.setContentType("text/html");
	            PrintWriter out = response.getWriter();
	            out.println("<html><body>");
	            out.println("<h2>Data Submitted Successfully</h2>");
	            out.println("<h2>Student Records</h2>");
	            out.println("<table border='1'><tr><th>Roll No</th><th>Name</th><th>Address</th><th>City</th></tr>");
	            while (resultSet.next()) {
	                int rollNo = resultSet.getInt("roll_no");
	                String studentName = resultSet.getString("name");
	                String studentAddress = resultSet.getString("address");
	                String studentCity = resultSet.getString("city");
	                out.println("<tr><td>" + rollNo + "</td><td>" + studentName + "</td><td>" + studentAddress + "</td><td>" + studentCity + "</td></tr>");
	            }
	            out.println("</table>");
	            out.println("</body></html>");

           } 
        catch (Exception e) {
               System.out.println("Database connection problem"+e);
           }
       }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
