package form;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet implementation class RegisterFormServlet
 */
public class RegisterFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterFormServlet() {
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
        String phoneNumber = request.getParameter("phone_number");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        String jdbcURL = "jdbc:mysql://localhost:3306/bankdb";
        String dbUser = "root";
        String dbPassword = "*usb12101995#";

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            // Check if user with the same email or phone number already exists
        	Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
            String checkSql = "SELECT * FROM accountholdermaster WHERE email = ? OR phone_number = ?";
            PreparedStatement checkStatement = connection.prepareStatement(checkSql);
            checkStatement.setString(1, email);
            checkStatement.setString(2, phoneNumber);
            ResultSet resultSet = checkStatement.executeQuery();

            if (resultSet.next()) {
                // User exists
                out.println("<h1>Sign Up Failed</h1>");
                out.println("<p>An account with the same email or phone number already exists. Please try again with different details.</p>");
            } else {
                // User does not exist, proceed with signup
                String insertSql = "INSERT INTO accountholdermaster (name, address, city, phone_number, balance, email, password) VALUES (?, ?, ?, ?, 0.0, ?, ?)";
                PreparedStatement insertStatement = connection.prepareStatement(insertSql);
                insertStatement.setString(1, name);
                insertStatement.setString(2, address);
                insertStatement.setString(3, city);
                insertStatement.setString(4, phoneNumber);
                insertStatement.setString(5, email);
                insertStatement.setString(6, password);

                int rows = insertStatement.executeUpdate();
                if (rows > 0) {
                    out.println("<h1>Sign Up Successful!</h1>");
                    out.println("<p>Your account has been created successfully.</p>");
                } else {
                    out.println("<h1>Sign Up Failed</h1>");
                    out.println("<p>There was an error creating your account. Please try again.</p>");
                }
            }
        } catch (SQLException e) {
            out.println("<h1>Sign Up Failed</h1>");
            out.println("<p>Error in database connection: " + e.getMessage() + "</p>");
        }

        out.println("<a href=\"index.html\">Go to Index Page</a>");
        out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
