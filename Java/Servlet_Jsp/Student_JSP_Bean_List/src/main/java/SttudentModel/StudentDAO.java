package SttudentModel;

import java.sql.*;
import java.util.ArrayList;

public class StudentDAO {

	Student stud= new Student();
	
	Connection conn=null;
	PreparedStatement statement=null;
	ResultSet rs=null;
	
	private String jdbcURL = "jdbc:mysql://localhost:3306/student_db";
	private String dbUser = "root";
	private String dbPassword = "*usb12101995#";
	
	public Connection connectJDBC()
	{
		try {
			conn = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
		} catch (SQLException e) {
			System.out.println(e);
		}
		return conn;
	}
	
	private String insert_students_SQL="insert into students (name, percentage, address, city, country) VALUES (?, ?, ?, ?, ?)";
	private String select_allStudents_SQL="select * from students";
	private String select_student_id_SQL="select id, name, percentage, address, city, country from students where id = ?";
	private String delete_Student_SQL="delete from students where id = ?";
	private String update_Student_SQL="update students set name = ?, percentage = ?, address = ?, city = ?, country = ? where id = ?";
	
	
	public void insertStudent(Student stud)
	{
		try {
			conn=connectJDBC();
			statement=conn.prepareStatement(insert_students_SQL);
			statement.setString(1, stud.getName());
			statement.setDouble(2, stud.getPercentage());
			statement.setString(3, stud.getAddress());
			statement.setString(4, stud.getCity());
			statement.setString(5, stud.getCountry());
			statement.executeUpdate();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	
	
	public ArrayList<Student> selectAllStudents()
	{
		Student student1 = null;
		ArrayList<Student> s= new ArrayList<Student>();
		try
		{
			conn=connectJDBC();
			statement=conn.prepareStatement(select_allStudents_SQL);
			rs=statement.executeQuery();
			while(rs.next())
			{
				student1 = new Student();
				student1.setId(rs.getInt("id"));
				student1.setName(rs.getString("name"));
				student1.setPercentage(rs.getDouble("percentage"));
				student1.setAddress(rs.getString("address"));
				student1.setCity(rs.getString("city"));
				student1.setCountry(rs.getString("country"));
				s.add(student1);
			}
			
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		return s;
	}
	
	
	public Student getStudentById(int id) {
		ArrayList<Student> s = new ArrayList<Student>();
		try {
			conn=connectJDBC();
			statement = conn.prepareStatement(select_student_id_SQL);
			statement.setInt(1, id);
			rs = statement.executeQuery();
			while(rs.next()) {
				stud.setId(rs.getInt("id"));
				stud.setName(rs.getString("name"));
				stud.setPercentage(rs.getDouble("percentage"));
				stud.setAddress(rs.getString("address"));
				stud.setCity(rs.getString("city"));
				stud.setCountry(rs.getString("country"));
				s.add(stud);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return stud;
	}
	
	
	public boolean deleteStudentById(int id) {
		boolean flag = false;
		try
		{
			conn = connectJDBC();
			statement = conn.prepareStatement(delete_Student_SQL);
			statement.setInt(1, id);
			statement.executeUpdate();
			flag = true;
		}
		catch(SQLException e) 
		{
			System.out.println(e);
		}
		
		return flag;
		}
	
	public boolean updateStudent(Student stud) {
		boolean flag = false;
		try {
			conn=connectJDBC();
			statement=conn.prepareStatement(update_Student_SQL);
			statement.setString(1, stud.getName());
			statement.setDouble(2, stud.getPercentage());
			statement.setString(3, stud.getAddress());
			statement.setString(4, stud.getCity());
			statement.setString(5, stud.getCountry());
			statement.setInt(6, stud.getId());
			statement.executeUpdate();
			flag = true;
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		return flag;
	}
}
