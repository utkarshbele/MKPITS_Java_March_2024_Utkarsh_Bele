import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded....");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sakila",
                    "root", "*usb12101995#");
            System.out.println("Connection established");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Statement statement = connection.createStatement();
        ResultSet resultSet= statement.executeQuery("select * from actor");
        while(resultSet.next())
        {
            System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "
                    +resultSet.getString(3)+" "+resultSet.getString(4));
        }
//using create statement
        int id=12;
        Statement statement1=connection.createStatement();
        ResultSet resultSet1=statement1.executeQuery("select * from film where film_id="+id);
        while (resultSet1.next())
        {
            System.out.println(resultSet1.getString(1)+" "+resultSet1.getString(2)+" "
                    +resultSet1.getString(3)+" "+resultSet1.getString(4)
                    +" "+resultSet1.getString(5)+" "+resultSet1.getString(6));
        }
//using prepare statement
        PreparedStatement preparedStatement=connection.prepareStatement("select * from film where film_id=?");
        preparedStatement.setInt(1,id);
        ResultSet resultSet2=preparedStatement.executeQuery();
        while (resultSet2.next())
        {
            System.out.println(resultSet2.getString(1)+" "+resultSet2.getString(2)+" "
                    +resultSet2.getString(3)+" "+resultSet2.getString(4)
                    +" "+resultSet2.getString(5));
        }


        resultSet.close();
        statement.close();
        connection.close();


    }
}