/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gmusic;

import java.sql.*;

/**
 *
 * @author Nirmal Sunny
 */
public class Register {
    
    public boolean registration(String title, String type_of_user, String fName, String lName, 
            String address1, String address2, String town, String postCode, 
            String email, String mobileNo, String website, String orgName, 
            String username, String password) {
        //this validated data has to be pushed to database
        //set loggedin = 1
        //redirect user to approprite window.
        try (Connection con = new DBase().conn;
                PreparedStatement pstmt = con.prepareStatement("INSERT INTO `customer_details` "
                        + "(`title`, `first_name`, `last_name`, `add_line_1`, `add_line_2`, `town`, `postcode`, `email`, `mobile_number`, `website`, `org_name`)"
                        + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");) {

            // set the value
            pstmt.setString(1, title);
            pstmt.setString(2, fName);
            pstmt.setString(3, lName);
            pstmt.setString(4, address1);
            pstmt.setString(5, address2);
            pstmt.setString(6, town);
            pstmt.setString(7, postCode);
            pstmt.setString(8, email);
            pstmt.setString(9, mobileNo);
            pstmt.setString(10, website);
            pstmt.setString(11, orgName); //ps limit is 11

            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        /*try {
            
                        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }*/
        return true;
        //Main.init();
    }
}
