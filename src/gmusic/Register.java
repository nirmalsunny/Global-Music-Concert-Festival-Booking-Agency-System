/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gmusic;

import gmusic.view.RegisterView;

/**
 *
 * @author Nirmal Sunny
 */
public class Register {
    
    public void loadReg() {
        new RegisterView().setVisible(true);
    } 
    
    public void registration(String title, String type_of_user, String fName, String lName, 
            String address1, String address2, String town, String postCode, 
            String email, String mobileNo, String website, String orgName, 
            String username, String password) {
        //this validated data has to be pushed to database
        //set loggedin = 1
        //redirect user to approprite window.
        Main.init();
    }
    
    
}
