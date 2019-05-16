package gmusic;

import gmusic.view.EditAccount;
import javax.swing.JFrame;

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
        String Acctype = "Concert/Festival Organiser";
        if(true) { //if result count is 1, then one user is logged in. if >1, then error.
            load(Acctype, userid);
        } else {
            //login window
            load("Login", null);
        }
    }


    void RegisterClicked() {

            new Register().loadReg();
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
    private static void load(String viewParameter, String userId) { //load main screen as per the user
        /**if(viewParameter == 1) {
            //logic for login table
        } else {
           
        }*/
        switch(viewParameter) {
            case "Login" : new MainView().setVisible(true);
                    break;
            case "Customer" : new Customer().loadCustomer();
                    break;
            case "Corporate Organisation" : new Corporate().loadCorporate();
                    break;
            case "Concert/Festival Organiser" : //new Organiser().loadOrganiser();
          
        JFrame window = new JFrame();
        window.setContentPane(new EditAccount());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBackground(new java.awt.Color(255, 255, 255));
        //window.setBounds(new java.awt.Rectangle(0, 0, 500, 400));
        window.setResizable(false);
        window.setSize(new java.awt.Dimension(500, 450));
        //window.setLocationRelativeTo(null);
        window.pack();
        window.setVisible(true);
    
                    break;
            case "Administrator" : new Admin().loadAdmin();
                    break;
            default : new MainView().setVisible(true);
                    break;
            }
        }

    
    boolean login(String username, String password) {
        //logic for validation
        //dataase
        if(true) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public void logout(){
    //sset isoggedin  = 0
    init(); //start again
    }
   
    
}
