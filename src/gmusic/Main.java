package gmusic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
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
        //check whether logged in or not
        //get data from db - select username, AccType rom login_table where loggedIn = 1;
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://studentnet.cst.beds.ac.uk/group6","cstmysql56","makeqehi");  
            //here sonoo is database name, root is username and password  
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select Acctype from login_table where isLoggedIn = 1;");  
            if(rs.next()) {
                load(rs.getString("AccType"));
            }else {
            //login window
            load("Login");
        }
            }
        catch(Exception e){ 
                System.out.println(e);
        } 
    }


    void RegisterClicked() {

            new RegisterView().setVisible(true);
        }
    
    //Customer
    void CustomerLoginScreen() {
        new CustomerMain().setVisible(true);
    }
    void CMViewConcets() {
        new CVconcertView().setVisible(true);    
    }
    void CMbooking() {
        new CVbooking().setVisible(true);    
    }
    void CMbookingView() {
        new CVbookingView().setVisible(true);    
    }
    void CMeditAccount() {
        new EditAccount().setVisible(true);    
    }
    void CMbackButton() {
        new CustomerMain().setVisible(true);  
    }
    
//Corporate Organisation
    void COLoginScreen(){
        new CoMain().setVisible(true);
    }
    void COeventView() {
        new COconcertView().setVisible(true);
    }
    void CObookings(){
        new CObooking().setVisible(true);
    }
    void COviewbookings(){
        new CObookingView().setVisible(true);
    }
    void COEditAccount() {
        new COeditAccount().setVisible(true);   
    }
    void COmonthlyPayments(){
        new CoMonthlypayment().setVisible(true);
    }
    void CObackbutton() {
        new CoMain().setVisible(true);
    }
    //Administrator
    void AdminLoginScreen() {
        new AdminMain().setVisible(true);
    }
    
    void Adminbackbutton() {
        new AdminMain().setVisible(true);
    }
    void ManageEventList() {
        new AdminManageEvents().setVisible(true);
    }
    void ManageBookings() {
        new AdminManageBookings().setVisible(true);
    }
    void EditAccounts() {
        new AdminEditAccounts().setVisible(true);
    }
    void manageInvoices() {
        new AdminManageInvoices().setVisible(true);
    }
//Event Organiser
    void EventOrganiserLoginScreen() {
        new ConcertOrganiserMain().setVisible(true);
    }
    void Addevent(){
        new OrAddEvent().setVisible(true);
    }
    void Editevent(){
        new OrEditEvent().setVisible(true);
    }
    void Eventbackbutton() {
        new ConcertOrganiserMain().setVisible(true);
    }
    
    //user logout button
    void logoutOnChooseUserScreen() {
        new MainView().setVisible(true);
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
    private static void load(String viewParameter) { //load main screen as per the user
        
       
        switch(viewParameter) {
            case "Login" : new MainView().setVisible(true);
                    break;
            case "Customer" : new Main().CustomerLoginScreen();
                    break;
            case "Corporate Organisation" : new Main().COLoginScreen();
                    break;
            case "Concert/Festival Organiser" : new Main().EventOrganiserLoginScreen();
					break;
            case "Administrator" : new Main().AdminLoginScreen();
                    break;
            default : new MainView().setVisible(true);
                    break;
            }
        }

    
    
   
    
}
