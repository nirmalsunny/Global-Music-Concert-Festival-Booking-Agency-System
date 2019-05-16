package gmusic;

import gmusic.view.customer.CustomerMaina;

/**
 *
 * @author Nirmal Sunny
 */
public class Customer {
    
    public void loadCustomer() {
        /**JFrame window = new JFrame();
        window.setContentPane(new CustomerMain());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBackground(new java.awt.Color(255, 255, 255));
        //window.setBounds(new java.awt.Rectangle(0, 0, 500, 400));
        window.setResizable(false);
        window.setSize(new java.awt.Dimension(500, 450));
        window.setLocationRelativeTo(null);
        window.pack();
        window.setVisible(true);*/
        new CustomerMaina().setVisible(true);
    }
    
}
