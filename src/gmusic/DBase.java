package gmusic;

import java.sql.*;
import java.sql.DriverManager;
/**
 * @desc A singleton database access class for MySQL
 * @author Ramindu
 */
public final class DBase {
    public Connection conn;
    private Statement statement;
    public static DBase db;
    DBase() {
        String url= "jdbc:mysql://studentnet.cst.beds.ac.uk/";
        String dbName = "group6";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "cstmysql56";
        String password = "makeqehi";
        try {
            Class.forName(driver).newInstance();
            this.conn = (Connection)DriverManager.getConnection(url+dbName,userName,password);
        }
        catch (Exception sqle) {
            sqle.printStackTrace();
        }
    }
    /**
     *
     * @return DBase Database connection object
     */
    public static synchronized DBase getDbCon() {
        if ( db == null ) {
            db = new DBase();
        }
        return db;
 
    }
    /**
     *
     * @param query String The query to be executed
     * @return a ResultSet object containing the results or null if not available
     * @throws SQLException
     */
    public ResultSet query(String query) throws SQLException{
        statement = db.conn.createStatement();
        ResultSet res = statement.executeQuery(query);
        return res;
    }
    /**
     * @desc Method to insert data to a table
     * @param insertQuery String The Insert query
     * @return boolean
     * @throws SQLException
     */
    public int insert(String insertQuery) throws SQLException {
        statement = db.conn.createStatement();
        int result = statement.executeUpdate(insertQuery);
        return result;
 
    }
 
}