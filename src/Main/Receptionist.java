package Main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import Receptionist.PatientManagement;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Receptionist extends javax.swing.JFrame {

    PreparedStatement prp = null;
    ResultSet result = null;
    Connection connection = null;
    String username;
    int attempts =1;
    public Receptionist() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Image/hospital.png"));
        this.setIconImage(ic.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dUser = new javax.swing.JLabel();
        rUserField = new javax.swing.JTextField();
        plbl = new javax.swing.JLabel();
        rPassField = new javax.swing.JPasswordField();
        HomeBtn = new javax.swing.JButton();
        rLoginBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        forgotpassword = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Receptionist");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(1000, 550));

        dUser.setText("Username");

        rUserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rUserFieldActionPerformed(evt);
            }
        });

        plbl.setText("Password");

        rPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rPassFieldActionPerformed(evt);
            }
        });

        HomeBtn.setBackground(new java.awt.Color(0, 51, 51));
        HomeBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        HomeBtn.setForeground(new java.awt.Color(255, 255, 255));
        HomeBtn.setText("Exit");
        HomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBtnActionPerformed(evt);
            }
        });

        rLoginBtn.setBackground(new java.awt.Color(0, 51, 51));
        rLoginBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rLoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        rLoginBtn.setText("Login");
        rLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rLoginBtnActionPerformed(evt);
            }
        });
        rLoginBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rLoginBtnKeyPressed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hospital Billing System");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        forgotpassword.setText("Forgot account?");
        forgotpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotpasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dUser)
                    .addComponent(plbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(forgotpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(rUserField)
                    .addComponent(rPassField)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(HomeBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rLoginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)))
                .addGap(96, 154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rUserField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dUser))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HomeBtn)
                    .addComponent(rLoginBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forgotpassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rUserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rUserFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rUserFieldActionPerformed

    private void rPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rPassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rPassFieldActionPerformed

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed
        Hospital hospital = new Hospital();
        hospital.setVisible(true);
        dispose();
    }//GEN-LAST:event_HomeBtnActionPerformed

    private void rLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rLoginBtnActionPerformed
        connection = Connector.ConnectDb();
        String user = rUserField.getText();
        String pass = String.valueOf(rPassField.getPassword());
        if (attempts < 4){
        try {
            String sql = "select username, password from receptionist where username='" + user + "'";
            prp = connection.prepareStatement(sql);
            result = prp.executeQuery();
            result.first();
            
                if (pass.equals(result.getString("password"))) {
                PatientManagement rActivity = new PatientManagement();
                rActivity.setVisible(true);
                username = user;
                PatientManagement.username = username;
                JOptionPane.showMessageDialog(null, "Login Succesful", "Welcome " + user, JOptionPane.INFORMATION_MESSAGE);
                dispose();
                connection.close();
            }   
                else {
                JOptionPane.showMessageDialog(null, "Incorrect Password or Username (Attemp " + attempts + ")","Login Failed",JOptionPane.WARNING_MESSAGE);
                forgotpassword.setText("Forgot password?");
                }

        } catch (HeadlessException | SQLException e) {
           JOptionPane.showMessageDialog(null, "The username you've entered doesn't match any account (Attemp " + attempts + ")","Login Failed",JOptionPane.WARNING_MESSAGE);
             }
             }
        else if(attempts == 5){
            this.dispose();
        }
        else if (attempts != 4){
             JOptionPane.showMessageDialog(null, "Try again later", "Login Failed", JOptionPane.WARNING_MESSAGE);
        }
        else{
             JOptionPane.showMessageDialog(null, "Maximum attempts exceeded", "Login Failed", JOptionPane.WARNING_MESSAGE);
         rUserField.setEnabled(false);
         rPassField.setEditable(false);
         HomeBtn.setEnabled(false);
        }
        
      attempts++;
        
    }//GEN-LAST:event_rLoginBtnActionPerformed

    private void forgotpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotpasswordActionPerformed
        AccountRecovery AR = new AccountRecovery();
        AR.setVisible(true);
        dispose();
    }//GEN-LAST:event_forgotpasswordActionPerformed

    private void rLoginBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rLoginBtnKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_rLoginBtnKeyPressed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Receptionist().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HomeBtn;
    private javax.swing.JLabel dUser;
    private javax.swing.JButton forgotpassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel plbl;
    private javax.swing.JButton rLoginBtn;
    private javax.swing.JPasswordField rPassField;
    private javax.swing.JTextField rUserField;
    // End of variables declaration//GEN-END:variables
}
