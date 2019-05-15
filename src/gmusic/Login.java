/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gmusic;

import static gmusic.Main.init;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *s
 * @author Nirmal Sunny
 */
public class Login {
    void login(String username, String password) {
        //logic for validation
      if(true){
          JOptionPane.showMessageDialog(null, "Login Successful.");
          //find the usertype.
          int userType = 1;
          JFrame window = new JFrame();
          /*switch(userType){
              case 1 :  window.setContentPane(new CustomerMain());
                        break;
              case 2 :  window.setContentPane(new CoMain());
                        break;
               case 3 : window.setContentPane(new ConcertOrganiserMain());
                        break;
               case 4 : window.setContentPane(new AdminMain());
                        break;
              default : JOptionPane.showMessageDialog(null, "Error!");
          }
            */
            window.setContentPane(new CustomerMain());
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setBackground(new java.awt.Color(255, 255, 255));
            //window.setBounds(new java.awt.Rectangle(0, 0, 500, 400));
            window.setResizable(false);
            window.setSize(new java.awt.Dimension(500, 450));
            window.setLocationRelativeTo(null);
            window.pack();
            window.setVisible(true);
      } else {
          JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
          //init();
      }
    }
    
}
