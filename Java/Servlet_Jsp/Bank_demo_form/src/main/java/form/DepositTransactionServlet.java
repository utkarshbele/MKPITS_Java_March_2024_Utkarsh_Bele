package form;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 * Servlet implementation class TransactionServlet
 */
public class DepositTransactionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String jdbcURL = "jdbc:mysql://localhost:3306/bankdb";
    String dbUser = "root";
    String dbPassword = "*usb12101995#";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepositTransactionServlet() {
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
	    if (session == null) {
            response.sendRedirect("index.html");
            return;
        }
	    
	    Integer accno = (Integer)session.getAttribute("accountnumber");
        if (accno == null) {
            out.println("<html><body>");
            out.println("<h1>Session Expired</h1>");
            out.println("<p>Your session has expired. Please log in again.</p>");
            out.println("<a href='index.html'>Go back to the login page</a>");
            out.println("</body></html>");
            return;
        } 
        
        double amount = Double.parseDouble(request.getParameter("amount"));

	             try {
	            	 Connection conn = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
	                 String sql = "insert into transactions (accno, amount, transaction_type) VALUES (?, ?, ?)";
	                	 PreparedStatement statement = conn.prepareStatement(sql);
	                	 statement.setInt(1, accno);
	                	 statement.setDouble(2, amount);
	                	 statement.setString(3, "deposit");
	                     int rows = statement.executeUpdate();
	                     
	                     if (rows > 0) {
	                         updateBalance(conn, accno, amount);
	                         out.println("<html><body>");
	                         out.println("<h1>Transaction Successful</h1>");
	                         out.println("<p>Your deposit has been completed.</p>");
	                         out.println("<a href='landing_page.jsp'>Go back to the landing page</a>");
	                         out.println("</body></html>");
	                     } else {
	                         out.println("<html><body>");
	                         out.println("<h1>Transaction Failed</h1>");
	                         out.println("<p>There was an error processing your transaction. Please try again.</p>");
	                         out.println("<a href='landing_page.jsp'>Go back to the landing page</a>");
	                         out.println("</body></html>");
	                     }
	                 
	             } catch (SQLException e) {
	                 out.println("<html><body>");
	                 out.println("<h1>Error</h1>");
	                 out.println("<p>An error occurred while processing your transaction: " + e + "</p>");
	                 out.println("<a href='landing_page.jsp'>Go back to the landing page</a>");
	                 out.println("</body></html>");
	             }
	         }

	private void updateBalance(Connection conn, Integer accno, double amount) throws SQLException 
			{
	             String sql = "UPDATE accountholdermaster SET balance = balance + ? WHERE accno = ?";
	             try (PreparedStatement statement = conn.prepareStatement(sql)) {
	            	 statement.setDouble(1, amount);
	            	 statement.setInt(2, accno);
	            	 statement.executeUpdate();
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
