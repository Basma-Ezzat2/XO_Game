/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyGUI;

/**
 *
 * @author user
 */
public class Fair extends javax.swing.JFrame {

    /**
     * Creates new form Fair
     */
    public Fair() {
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

        Fair_video = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Fair_video.setBackground(new java.awt.Color(0, 102, 102));
        Fair_video.setPreferredSize(new java.awt.Dimension(762, 496));

        jLabel16.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 204, 51));
        jLabel16.setText("MATCH DRAWN");

        jButton19.setBackground(new java.awt.Color(0, 0, 0));
        jButton19.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 204, 51));
        jButton19.setText("Play again");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        btnHome.setBackground(new java.awt.Color(0, 51, 51));
        btnHome.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 204, 51));
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Fair_videoLayout = new javax.swing.GroupLayout(Fair_video);
        Fair_video.setLayout(Fair_videoLayout);
        Fair_videoLayout.setHorizontalGroup(
            Fair_videoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fair_videoLayout.createSequentialGroup()
                .addGroup(Fair_videoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Fair_videoLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel16))
                    .addGroup(Fair_videoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnHome))
                    .addGroup(Fair_videoLayout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jButton19)))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        Fair_videoLayout.setVerticalGroup(
            Fair_videoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fair_videoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnHome)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fair_video, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fair_video, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        new Modes().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        new Welcome().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed

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
            java.util.logging.Logger.getLogger(Fair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fair().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fair_video;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton jButton19;
    private javax.swing.JLabel jLabel16;
    // End of variables declaration//GEN-END:variables
}
