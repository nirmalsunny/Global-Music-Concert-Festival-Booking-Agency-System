package gmusic;

import gmusic.view.admin.AdminMaina;
import javax.swing.JFrame;

/**
 *
 * @author Nirmal Sunny
 */
public class Admin {
    
    public void loadAdmin() {
       /** JFrame window = new JFrame();
        window.setContentPane(new AdminMain());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBackground(new java.awt.Color(255, 255, 255));
        //window.setBounds(new java.awt.Rectangle(0, 0, 500, 400));
        window.setResizable(false);
        window.setSize(new java.awt.Dimension(500, 450));
        window.setLocationRelativeTo(null);
        window.pack();
        window.setVisible(true);*/
        new AdminMaina().setVisible(true);
    }
    
}
