package form;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet implementation class CheckBalance
 */
public class CheckBalance extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String jdbcURL = "jdbc:mysql://localhost:3306/bankdb";
    String dbUser = "root";
    String dbPassword = "*usb12101995#";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckBalance() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession session=request.getSession(false);
        Integer accountnumber=(Integer)session.getAttribute("accountnumber");
	        if(session!=null)
	        {  
	        	try {
		                Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
		                String sql = "select balance from accountholdermaster where accno = ?";
		                PreparedStatement statement = connection.prepareStatement(sql);
		                statement.setInt(1, accountnumber);
		                ResultSet resultSet = statement.executeQuery();
		                
		                    if (resultSet.next()) {
		                        double balance = resultSet.getDouble("balance");
		                        out.println("<html><body>");
		                        out.println("<h1>Account Balance</h1>");
		                        out.println("<p>Your current balance is: $" + balance + "</p>");
		                        out.println("<a href='landing_page.jsp'>Go back to the landing page</a>");
		                        out.println("</body></html>");
		                    } else {
		                        out.println("<html><body>");
		                        out.println("<h1>Error</h1>");
		                        out.println("<p>Account not found. Please try again.</p>");
		                        out.println("<a href='landing_page.jsp'>Go back to the landing page</a>");
		                        out.println("</body></html>");
	                }}
	        	catch (SQLException e) {
	                out.println("<p>Error occured while checking account balance: " + e + "</p>");
	            }
	        	
	            out.close();
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
