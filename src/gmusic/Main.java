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
        /*MainView mainview = new MainView();
        mainview.setVisible(true);*/
        
        //check whether logged in or not
        //get data from db - select username, AccType rom login_table where loggedIn = 1;
        String userid = "admin";
        int Acctype = 2;
        if(true) { //if result count is 1, then one user is logged in. if >1, then error.
            load(Acctype, userid);
        } else {
            //login window
            load(0, null);
        }
    }


    void RegisterClicked() {

            new RegisterView().setVisible(true);
        }
    /**
     * load - load appropriate window based on parameters
     * viewParameter
             * 0 login window
             * 1 customer
             * 2 admin
             * 3 corporate
             * 4 organiser
             */
    private static void load(int viewParameter, String userId) { //load main screen as per the user
        if(viewParameter == 1) {
            //logic for login table
        } else {
           
        }
        }

    
    
   
    
}
