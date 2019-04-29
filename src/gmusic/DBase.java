package gmusic; 
 
import java.sql.*;

public class DBase {
    private static String url = "jdbc:mysql://localhost:3306/project1";    
    private static String driverName = "com.mysql.jdbc.Driver";   
    private static String username = "ns";   
    private static String password = "root";
    private static Connection con;
    private static String urlstring;

    public static Connection getConnection() {
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(urlstring, username, password);
            } catch (SQLException ex) {
                System.out.println("Failed to create the database connection."); 
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver not found."); 
        }
        return con;
    }
}