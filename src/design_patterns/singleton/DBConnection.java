package design_patterns.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author : Sachintha Nishajith <snishajith@gmail.com>
 * @since : 5/4/2021
 **/
class DBConnection{
    private Connection connection;
    private static DBConnection dBConnection;

    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/thogakade", "root", "mysql");
    }
    public Connection getConnection(){
        return connection;
    }
    public static DBConnection getInstance() throws SQLException, ClassNotFoundException {
        if (dBConnection==null){
            dBConnection= new DBConnection();
        }
        return dBConnection;
    }
}
