package acc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Account {
	private String name;
	private String address;
	private String city;
	private String phone_number;
	private String email;
	private String password;
	private double balance;
	
	private int accno;
	
	private String jdbcURL = "jdbc:mysql://localhost:3306/bankdb";
	private String dbUser = "root";
	private String dbPassword = "*usb12101995#";
	
	Connection conn=null;
	
	public Account()
	{}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	public boolean authenticateUser() 
	{
		boolean flag=false;
		try 
		{
			conn = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
	        String sql = "select accno,name from accountholdermaster where email = ? and password = ?";
	        PreparedStatement statement = conn.prepareStatement(sql);
	        statement.setString(1, email);
	        statement.setString(2, password);
	        ResultSet resultSet = statement.executeQuery();
	        if (resultSet.next()) {
	        	accno = resultSet.getInt("accno");
	        	name = resultSet.getString("name");
                flag = true;
            }
	        
	        resultSet.close();
	        statement.close();
	        conn.close();
		}
		catch(SQLException e)
		{
			System.out.println("Error in database connection: " + e);
		}
		return flag;
	}

	public int registerUser() 
	{
		int rows=0;
		try {
			conn = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
			String checkSql = "select * from accountholdermaster where email = ? or phone_number = ?";
	        PreparedStatement checkStatement = conn.prepareStatement(checkSql);
	        checkStatement.setString(1, email);
	        checkStatement.setString(2, phone_number);
	        ResultSet resultSet = checkStatement.executeQuery();
			
	        if(resultSet.next()) 
	        {
	            // User exists
	            System.out.println("<h1>Sign Up Failed</h1>");
	            System.out.println("<p>An account with the same email or phone number already exists. Please try again with different details.</p>");
	        } 
	        else {
	            // User does not exist, proceed with signup
	            String insertSql = "insert into accountholdermaster (name, address, city, phone_number, balance, email, password) values (?, ?, ?, ?, 0.0, ?, ?)";
	            PreparedStatement insertStatement = conn.prepareStatement(insertSql);
	            insertStatement.setString(1, name);
	            insertStatement.setString(2, address);
	            insertStatement.setString(3, city);
	            insertStatement.setString(4, phone_number);
	            insertStatement.setString(5, email);
	            insertStatement.setString(6, password);
	            rows = insertStatement.executeUpdate();
	            }
        }
		catch(Exception e)
		{
			System.out.println("Error in database connection: " + e);
		}
        return rows;
    }
	
	public double checkBalance() 
	{
		
		try 
		{
			conn = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
	        String sql = "select balance from accountholdermaster where accno = ?";
	        PreparedStatement statement = conn.prepareStatement(sql);
	        statement.setInt(1, accno);
	        ResultSet resultSet = statement.executeQuery();
	        if (resultSet.next()) {
	        	balance = resultSet.getDouble("balance");
            }
	        
	        resultSet.close();
	        statement.close();
	        conn.close();
		}
		catch(SQLException e)
		{
			System.out.println("Error in database connection: " + e);
		}
		return balance;
	}
}
