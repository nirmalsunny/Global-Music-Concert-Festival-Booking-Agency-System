/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gmusic;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *s
 * @author Nirmal Sunny
 */
public class Login {
    boolean login(String username, String password) {
        //logic for validation
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://studentnet.cst.beds.ac.uk/group6","cstmysql56","makeqehi");  
            //here sonoo is database name, root is username and password  
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select username, password from login_table where username = "
                    + "'" + username + "' and password = '" + password + "';");  
            if(rs.next()) {  
             JOptionPane.showMessageDialog(null, "Login Successful.");
             stmt. executeUpdate("update login_table set isLoggedIn = 1 where username = '" 
             + username + "';");
          Main.init();
          return true;
      } else {
          JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
          return false;
      }
            }
        catch(Exception e){ 
                System.out.println(e);
        }  
        return false;
            }  
       /* String user = "admin";
        String pass = "pass";
      if(user.equals(username) && pass.equals(password)){
          
      
    }*/

    void logout() {
        //set isLoggedin = 0
    }
    
}
