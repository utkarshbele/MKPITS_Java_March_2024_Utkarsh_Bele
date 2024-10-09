import java.sql.*;

public class InsertStudentDetails {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        Studentdetails st=new Studentdetails("45","jacob","wadi","Nagpur");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded....");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ourdb",
                    "root", "*usb12101995#");
            System.out.println("Connection established");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        int rv=0;
        // insert student record
        PreparedStatement preparedStatement=connection.prepareStatement("insert into markdetails values(?,?,?,?)");
        preparedStatement.setString(1, st.getName());
        preparedStatement.setInt(2,80);
        preparedStatement.setInt(3,54);
        preparedStatement.setInt(4,99);

        rv=preparedStatement.executeUpdate();
        if(rv!=0)
        {
            System.out.println("Record inserted successfully");
        }
        else
            System.out.println("Record not inserted");
    }
}