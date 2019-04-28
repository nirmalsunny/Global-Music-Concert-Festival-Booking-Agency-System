package gmusic;

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
      if(false){
          JOptionPane.showMessageDialog(null, "Login Successful. Press OK.");
          RegisterClicked();
      } else {
          JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
          init();      }
    }
    
   
    
}
