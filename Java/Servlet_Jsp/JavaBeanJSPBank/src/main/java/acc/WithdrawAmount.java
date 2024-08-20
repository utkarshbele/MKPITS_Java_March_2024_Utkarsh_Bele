package acc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WithdrawAmount {
		private double amount;
		private int accno;
		private int id;
		private Date date;
		private String transaction_type; 
		
		
		private String jdbcURL = "jdbc:mysql://localhost:3306/bankdb";
		private String dbUser = "root";
		private String dbPassword = "*usb12101995#";
		
		Connection conn=null;
		
		public double getAmount() {
			return amount;
		}



		public void setAmount(double amount) {
			this.amount = amount;
		}



		public int getAccno() {
			return accno;
		}



		public void setAccno(int accno) {
			this.accno = accno;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getTransaction_type() {
			return transaction_type;
		}

		public void setTransaction_type(String transaction_type) {
			this.transaction_type = transaction_type;
		}
		
		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}
				
		public boolean withdraw() {
		    boolean flag = false;
		    try {
		        conn = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
		        
		        // Check current balance
		        String checkBalanceSQL = "SELECT balance FROM accountholdermaster WHERE accno = ?";
		        PreparedStatement checkBalanceStmt = conn.prepareStatement(checkBalanceSQL);
		        checkBalanceStmt.setInt(1, accno);
		        ResultSet rs = checkBalanceStmt.executeQuery();
		        
		        if (rs.next()) {
		            double currentBalance = rs.getDouble("balance");
		            if (currentBalance >= amount) {
		                // Perform the withdrawal
		                String sql = "INSERT INTO transactions (accno, amount, transaction_type) VALUES (?, ?, ?)";
		                PreparedStatement statement = conn.prepareStatement(sql);
		                statement.setInt(1, accno);
		                statement.setDouble(2, amount);
		                statement.setString(3, "withdrawal");
		                int rows = statement.executeUpdate();
		                
		                if (rows > 0) {
		                    String sql1 = "UPDATE accountholdermaster SET balance = balance - ? WHERE accno = ?";
		                    statement = conn.prepareStatement(sql1);
		                    statement.setDouble(1, amount);
		                    statement.setInt(2, accno);
		                    statement.executeUpdate();
		                    flag = true;
		                }
		            } else {
		                System.out.println("<html><body>");
		                System.out.println("<h1>Error</h1>");
		                System.out.println("<p>Insufficient funds. Withdrawal amount exceeds the current balance.</p>");
		                System.out.println("<a href='home.jsp'>Go back to the landing page</a>");
		                System.out.println("</body></html>");
		            }
		        }
		    } catch (SQLException e) {
		        System.out.println("<html><body>");
		        System.out.println("<h1>Error</h1>");
		        System.out.println("<p>An error occurred while processing your transaction: " + e + "</p>");
		        System.out.println("<a href='home.jsp'>Go back to the landing page</a>");
		        System.out.println("</body></html>");
		    }
		    return flag;
		}
}
