import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteStudentdetails{
        public static void main(String[] args) throws SQLException {
            Connection connection = null;
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
            PreparedStatement preparedStatement=connection.prepareStatement
                    ("delete from studentdetails where rollno=? ");
            preparedStatement.setString(1,"9");
            rv=preparedStatement.executeUpdate();
            if(rv!=0)
            {
                System.out.println("Record deleted successfully");
            }
            else
                System.out.println("Record not deleted");
        }
}
