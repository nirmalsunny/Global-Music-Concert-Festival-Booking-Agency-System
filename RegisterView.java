/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gmusic;

import javax.swing.JOptionPane;

/**
 *
 * @author Nirmal Sunny
 */
public class RegisterView extends javax.swing.JFrame {

    
    
    /**
     * Creates new form RegisterView
     */
    public RegisterView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lTitle = new javax.swing.JLabel();
        title = new javax.swing.JComboBox<>();
        lFname = new javax.swing.JLabel();
        fName = new javax.swing.JTextField();
        lLname = new javax.swing.JLabel();
        lName = new javax.swing.JTextField();
        lAddress = new javax.swing.JLabel();
        address1 = new javax.swing.JTextField();
        address2 = new javax.swing.JTextField();
        town = new javax.swing.JTextField();
        postCode = new javax.swing.JTextField();
        lTown = new javax.swing.JLabel();
        lPostCode = new javax.swing.JLabel();
        lEmail = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        lPhoneNum = new javax.swing.JLabel();
        mobileNo = new javax.swing.JTextField();
        lWebAddress = new javax.swing.JLabel();
        website = new javax.swing.JTextField();
        orgName = new javax.swing.JTextField();
        lWebAddress1 = new javax.swing.JLabel();
        type_of_user = new javax.swing.JComboBox<>();
        user_type = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        login = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        lWebAddress2 = new javax.swing.JLabel();
        lWebAddress3 = new javax.swing.JLabel();
        lWebAddress4 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        cPassword = new javax.swing.JPasswordField();
        register = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 500, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 400));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lTitle.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lTitle.setText("Title.");

        title.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        title.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mr.", "Mrs.", "Miss.", "Ms.", "Dr.", "Prof." }));

        lFname.setFont(new java.awt.Font("Segoe UI Light", 0, 12));
        lFname.setText("First Name.");

        fName.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        fName.setToolTipText("");
        fName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lLname.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lLname.setText("Last Name.");

        lName.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lName.setToolTipText("");
        lName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lAddress.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lAddress.setText("Address.");

        address1.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        address1.setToolTipText("");
        address1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        address2.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        address2.setToolTipText("");
        address2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        town.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        town.setToolTipText("");
        town.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        postCode.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        postCode.setToolTipText("");
        postCode.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lTown.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lTown.setText("Town.");

        lPostCode.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lPostCode.setText("Post Code.");

        lEmail.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lEmail.setText("Email.");

        email.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        email.setToolTipText("");
        email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lPhoneNum.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lPhoneNum.setText("Mobile No.");

        mobileNo.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        mobileNo.setToolTipText("");
        mobileNo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lWebAddress.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lWebAddress.setText("Website.");

        website.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        website.setToolTipText("");
        website.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        orgName.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        orgName.setToolTipText("");
        orgName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lWebAddress1.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lWebAddress1.setText("Organisation Name.");

        type_of_user.setFont(new java.awt.Font("Segoe UI Light", 0, 11));
        type_of_user.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Corporate Organisation", "Concert/Festival Organiser" }));

        user_type.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        user_type.setText("Type of User.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lFname)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lAddress)
                                    .addComponent(lTown)
                                    .addComponent(lPostCode))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(address2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(address1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(town, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(postCode, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lPhoneNum)
                                    .addComponent(lEmail)
                                    .addComponent(lLname)
                                    .addComponent(user_type))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(type_of_user, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lWebAddress1)
                                    .addComponent(lWebAddress))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(orgName, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(website, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTitle)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type_of_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_type))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lFname)
                    .addComponent(fName)
                    .addComponent(lLname)
                    .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lEmail)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lAddress)
                        .addComponent(address1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lPhoneNum)
                    .addComponent(address2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(town, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lTown))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(postCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lPostCode)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(website, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(orgName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lWebAddress)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lWebAddress1))))
                .addGap(63, 63, 63))
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gmusic/icons/black-music-icon-26.png"))); // NOI18N
        jLabel1.setText("Global Music");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(286, 286, 286))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Have an account already?");
        jLabel6.setToolTipText("");

        login.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gmusic/icons/login.png"))); // NOI18N
        login.setText("Login");
        login.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.setDoubleBuffered(true);
        login.setName("login"); // NOI18N
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(login))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        username.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        username.setToolTipText("");
        username.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lWebAddress2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lWebAddress2.setText("Username.");

        lWebAddress3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lWebAddress3.setText("Password.");

        lWebAddress4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lWebAddress4.setText("Confirm Password.");

        password.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        password.setToolTipText("");
        password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        cPassword.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        cPassword.setToolTipText("");
        cPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        register.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gmusic/icons/871696229e.png"))); // NOI18N
        register.setText("Register");
        register.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        register.setDoubleBuffered(true);
        register.setName("login"); // NOI18N
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lWebAddress2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lWebAddress3))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lWebAddress4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lWebAddress2)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lWebAddress3)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lWebAddress4)
                            .addComponent(cPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(517, 489));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        Main.init();
        this.dispose();
    }//GEN-LAST:event_loginMouseClicked

    private void RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterMouseClicked
        if(checkInput()){
            if(password.getText().equals((cPassword.getText()))) {
                if(new Register().registration(title.getSelectedItem().toString(), type_of_user.getSelectedItem().toString(), fName.getText(),
                        lName.getText(), address1.getText(), address2.getText(), town.getText(), postCode.getText(), email.getText(), 
                        mobileNo.getText(), website.getText(), orgName.getText(), username.getText(), password.getText())) {
                JOptionPane.showMessageDialog(null, "Registration Successful.");
                this.dispose();
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Passwords do not match.");
            }
         }
        else{
            JOptionPane.showMessageDialog(null, "Please Enter All the Fields.");
        }
        
    }//GEN-LAST:event_RegisterMouseClicked

    boolean checkInput(){
        return !(fName.getText().trim().isEmpty() || lName.getText().trim().isEmpty() || address1.getText().trim().isEmpty() 
                || address2.getText().trim().isEmpty() || email.getText().trim().isEmpty() || mobileNo.getText().trim().isEmpty()
                 || town.getText().trim().isEmpty() || postCode.getText().trim().isEmpty() || website.getText().trim().isEmpty()
                 || orgName.getText().trim().isEmpty() || username.getText().trim().isEmpty() || password.getText().trim().isEmpty()
                 || cPassword.getText().trim().isEmpty());
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address1;
    private javax.swing.JTextField address2;
    private javax.swing.JPasswordField cPassword;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lAddress;
    private javax.swing.JLabel lEmail;
    private javax.swing.JLabel lFname;
    private javax.swing.JLabel lLname;
    private javax.swing.JTextField lName;
    private javax.swing.JLabel lPhoneNum;
    private javax.swing.JLabel lPostCode;
    private javax.swing.JLabel lTitle;
    private javax.swing.JLabel lTown;
    private javax.swing.JLabel lWebAddress;
    private javax.swing.JLabel lWebAddress1;
    private javax.swing.JLabel lWebAddress2;
    private javax.swing.JLabel lWebAddress3;
    private javax.swing.JLabel lWebAddress4;
    private javax.swing.JLabel login;
    private javax.swing.JTextField mobileNo;
    private javax.swing.JTextField orgName;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField postCode;
    private javax.swing.JLabel register;
    private javax.swing.JComboBox<String> title;
    private javax.swing.JTextField town;
    private javax.swing.JComboBox<String> type_of_user;
    private javax.swing.JLabel user_type;
    private javax.swing.JTextField username;
    private javax.swing.JTextField website;
    // End of variables declaration//GEN-END:variables


}