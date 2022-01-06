/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyGUI;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class splach_screen extends javax.swing.JFrame {

    /**
     * Creates new form Welcome
     */
    public splach_screen() {
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

        Welcome_Screen = new javax.swing.JPanel();
        xoImg = new javax.swing.JLabel();
        loadingBar = new javax.swing.JProgressBar();
        loadingValue = new javax.swing.JLabel();
        loadingLable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Welcome_Screen.setBackground(new java.awt.Color(0, 102, 102));
        Welcome_Screen.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 153, 153), new java.awt.Color(255, 204, 204), new java.awt.Color(102, 0, 51), new java.awt.Color(255, 0, 51)), "Tic Tac Toe", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tempus Sans ITC", 1, 48), new java.awt.Color(102, 0, 51))); // NOI18N

        xoImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tictactoe.png"))); // NOI18N

        loadingBar.setBackground(new java.awt.Color(255, 153, 153));
        loadingBar.setForeground(new java.awt.Color(255, 102, 102));

        loadingValue.setBackground(new java.awt.Color(204, 204, 204));
        loadingValue.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        loadingValue.setForeground(new java.awt.Color(255, 102, 102));
        loadingValue.setText("0%");

        loadingLable.setBackground(new java.awt.Color(204, 204, 204));
        loadingLable.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        loadingLable.setForeground(new java.awt.Color(255, 102, 102));
        loadingLable.setText("Loading");

        javax.swing.GroupLayout Welcome_ScreenLayout = new javax.swing.GroupLayout(Welcome_Screen);
        Welcome_Screen.setLayout(Welcome_ScreenLayout);
        Welcome_ScreenLayout.setHorizontalGroup(
            Welcome_ScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Welcome_ScreenLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(loadingLable, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loadingValue, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Welcome_ScreenLayout.createSequentialGroup()
                .addContainerGap(251, Short.MAX_VALUE)
                .addComponent(xoImg, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Welcome_ScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loadingBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Welcome_ScreenLayout.setVerticalGroup(
            Welcome_ScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Welcome_ScreenLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(xoImg, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(Welcome_ScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loadingLable)
                    .addComponent(loadingValue))
                .addGap(17, 17, 17)
                .addComponent(loadingBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Welcome_Screen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Welcome_Screen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(splach_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(splach_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(splach_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(splach_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        splach_screen sp=new splach_screen();
        sp.setVisible(true);
        try{
            for(int i=0;i<=100;i++){
                Thread.sleep(100);
                sp.loadingValue.setText(i+"%");
                
                if(i==10){
                sp.loadingLable.setText("Turning on Modules...");
                }
                if(i==20){
                sp.loadingLable.setText("Loading Modules...");
                }
                if(i==50){
                sp.loadingLable.setText("Connecting to DataBase...");
                }
                if(i==70){
                sp.loadingLable.setText("Connection Succeful...");
                }
                if(i==80){
                sp.loadingLable.setText("Luanching Application...");
                }
                sp.loadingBar.setValue(i);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Welcome_Screen;
    private javax.swing.JProgressBar loadingBar;
    private javax.swing.JLabel loadingLable;
    private javax.swing.JLabel loadingValue;
    private javax.swing.JLabel xoImg;
    // End of variables declaration//GEN-END:variables
}
