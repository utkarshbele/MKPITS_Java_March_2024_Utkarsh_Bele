package Database_eg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection connect(){
        Connection connection = null;
        try {
            Class.forName(DBConfig.driver);
            System.out.println("Driver Loaded");
            connection = DriverManager.getConnection(DBConfig.url,DBConfig.username,DBConfig.password);
            System.out.println("Connection Established");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;

    }
}
