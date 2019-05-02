package gmusic;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Nirmal Sunny
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        init();
        
    }

    public static void init() {
        MainView mainview = new MainView();
        mainview.setVisible(true);
    }
void RegisterClicked() {
        
        new RegisterView().setVisible(true);
    }

    void login(String username, String password) {
        //logic for validation
      if(true){
          JOptionPane.showMessageDialog(null, "Login Successful.");
          //find the usertype.
          int userType = 1;
          JFrame window = new JFrame();
          switch(userType){
              case 1 :  window.setContentPane(new CustomerView());
                        break;
              case 2 :  window.setContentPane(new CorporateOrganisation());
                        break;
               case 3 : window.setContentPane(new ConcertOrganiser());
                        break;
               case 4 : window.setContentPane(new AdminView());
                        break;
              default : JOptionPane.showMessageDialog(null, "Error!");
          }
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
          init();
      }
    }
    
   
    
}
