package Admin;

import Main.Hospital;
import Receptionist.addReceptionist;
import Receptionist.updateReceptionist;
import Receptionist.viewReceptionist;
import javax.swing.ImageIcon;

/**
 *
 * @author Ditalo
 */
public class ReceptionistManagement extends javax.swing.JFrame {

    public ReceptionistManagement() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Image/hospital.png"));
        this.setIconImage(ic.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        backbutton = new javax.swing.JButton();
        addreceptionistbtn = new javax.swing.JButton();
        updatereceptionistbtn = new javax.swing.JButton();
        viewreceptionistbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Receptionist Management !");

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Receptionist Panel");

        backbutton.setBackground(new java.awt.Color(0, 51, 51));
        backbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/backs.png"))); // NOI18N
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(118, 118, 118)
                .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        addreceptionistbtn.setBackground(new java.awt.Color(204, 204, 204));
        addreceptionistbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/addreceptionist.png"))); // NOI18N
        addreceptionistbtn.setText("Add Receptionist");
        addreceptionistbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addreceptionistbtnActionPerformed(evt);
            }
        });

        updatereceptionistbtn.setBackground(new java.awt.Color(204, 204, 204));
        updatereceptionistbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/updatereceptionist.png"))); // NOI18N
        updatereceptionistbtn.setText("Update Receptionist");
        updatereceptionistbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatereceptionistbtnActionPerformed(evt);
            }
        });

        viewreceptionistbtn.setBackground(new java.awt.Color(204, 204, 204));
        viewreceptionistbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/searchreceptionist.png"))); // NOI18N
        viewreceptionistbtn.setText("View Receptionist");
        viewreceptionistbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewreceptionistbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(addreceptionistbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(updatereceptionistbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(viewreceptionistbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatereceptionistbtn)
                    .addComponent(addreceptionistbtn))
                .addGap(18, 18, 18)
                .addComponent(viewreceptionistbtn)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        AdminActivity admin = new AdminActivity();
        admin.setVisible(true);
        dispose();
    }//GEN-LAST:event_backbuttonActionPerformed

    private void addreceptionistbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addreceptionistbtnActionPerformed
        addReceptionist adr = new addReceptionist();
        adr.setVisible(true);
        dispose();
    }//GEN-LAST:event_addreceptionistbtnActionPerformed

    private void updatereceptionistbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatereceptionistbtnActionPerformed
        updateReceptionist uReceptionist = new updateReceptionist();
        uReceptionist.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updatereceptionistbtnActionPerformed

    private void viewreceptionistbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewreceptionistbtnActionPerformed
        viewReceptionist vReceptionist = new viewReceptionist();
        vReceptionist.setVisible(true);
        dispose();
    }//GEN-LAST:event_viewreceptionistbtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new ReceptionistManagement().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addreceptionistbtn;
    private javax.swing.JButton backbutton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton updatereceptionistbtn;
    private javax.swing.JButton viewreceptionistbtn;
    // End of variables declaration//GEN-END:variables

}
