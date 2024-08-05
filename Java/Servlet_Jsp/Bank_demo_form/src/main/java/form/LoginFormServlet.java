package form;

//import jakarta.servlet.RequestDispatcher;
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

/**
 * Servlet implementation class LoginFormServlet
 */
public class LoginFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String email = request.getParameter("username");
        String password = request.getParameter("password");
        
        String jdbcURL = "jdbc:mysql://localhost:3306/bankdb";
        String dbUser = "root";
        String dbPassword = "*usb12101995#";

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
        	//since email is unique so i have assigned email as username. 
            Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
            String sql = "select accno,name from accountholdermaster where email = ? and password = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, email);
            statement.setString(2, password);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                //out.println("Login successful! Welcome " + resultSet.getString("name"));
            	int accno = resultSet.getInt("accno");
            	
            	String username = resultSet.getString("name");
            	//need to create a http session to carry forward the account number
            	HttpSession session =request.getSession(true);
            	session.setAttribute("accountnumber",accno);
            	session.setAttribute("name",username);
            	
                response.sendRedirect("landing_page.jsp");
//            	RequestDispatcher rd=request.getRequestDispatcher("landing_page.jsp");
//            	rd.forward(request,response);
            } 
            else {
                out.println("Invalid username or password,Please try again");
            }

            connection.close();
        } catch (Exception e) {
            out.println("<p>Error in database connection: " + e + "</p>");
        }
        
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
