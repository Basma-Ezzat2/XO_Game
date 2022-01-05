/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyGUI;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class twoPlayersMode extends javax.swing.JFrame {

    
    private String startGame="X";
    private int xCount = 0;
    private int oCount = 0;
    boolean checker;
    public twoPlayersMode() {
        initComponents();
    }
     private void gameScore()
     {
         playerX.setText(String.valueOf(xCount));
         playerO.setText(String.valueOf(oCount));
     }
       private void choose_a_Player()
     {
          if(startGame.equalsIgnoreCase("X"))
          {
              startGame = "O";
          }
          else
          { 
              startGame = "X";
          }    
     }
        private void winningGame()
     {
         String b1 = btn1.getText();
         String b2 = btn2.getText();
         String b3 = btn3.getText();
         String b4 = btn4.getText();
         String b5 = btn5.getText();
         String b6 = btn6.getText();
         String b7 = btn7.getText();
         String b8 = btn8.getText();
         String b9 = btn9.getText();
         if (b1 ==("X")  && b2 ==("X")  && b3 ==("X"))
         {
            
            JOptionPane.showMessageDialog (this,"Player X wins","Tic tac toe",JOptionPane.OK_OPTION);
              btn1.setBackground(Color.green);
              btn2.setBackground(Color.green);
              btn3.setBackground(Color.green);
              xCount++;
              gameScore();
            
         
         }
         
           if (b4 ==("X")  && b5 ==("X")  && b6 ==("X"))
         {
            
            JOptionPane.showMessageDialog(this,"Player X wins","Tic tac toe",JOptionPane.YES_OPTION);
              btn4.setBackground(Color.green);
              btn5.setBackground(Color.green);
              btn6.setBackground(Color.green);
              xCount++;
              gameScore();
            
         
         }
           
             if (b7 ==("X")  && b8 ==("X")  && b9 ==("X"))
         {
           
            JOptionPane.showMessageDialog(this,"Player X wins","Tic tac toe",JOptionPane.OK_OPTION);
              btn7.setBackground(Color.green);
              btn8.setBackground(Color.green);
              btn9.setBackground(Color.green);
              xCount++;
              gameScore();
            
         
         }
             
               if (b4 ==("X")  && b5 ==("X")  && b6 ==("X"))
         {
             
            JOptionPane.showMessageDialog(this,"Player X wins","Tic tac toe",JOptionPane.OK_OPTION);
              btn4.setBackground(Color.green);
              btn5.setBackground(Color.green);
              btn6.setBackground(Color.green);
              xCount++;
              gameScore();
            
         
         }
            if (b1 ==("X")  && b4 ==("X")  && b7 ==("X"))
         {
            
            JOptionPane.showMessageDialog(this,"Player X wins","Tic tac toe",JOptionPane.OK_OPTION);
              btn1.setBackground(Color.green);
              btn4.setBackground(Color.green);
              btn7.setBackground(Color.green);
              xCount++;
              gameScore();
            
         
         } 
                   
           if (b2 ==("X")  && b5 ==("X")  && b8 ==("X"))
         {
           
            JOptionPane.showMessageDialog(this,"Player X wins","Tic tac toe",JOptionPane.OK_OPTION);
              btn2.setBackground(Color.green);
              btn5.setBackground(Color.green);
              btn8.setBackground(Color.green);
              xCount++;
              gameScore();
            
         
         }     
           
           
             if (b3 ==("X")  && b6 ==("X")  && b9 ==("X"))
         {
           
            JOptionPane.showMessageDialog(this,"Player X wins","Tic tac toe",JOptionPane.OK_OPTION);
              btn3.setBackground(Color.green);
              btn6.setBackground(Color.green);
              btn9.setBackground(Color.green);
              xCount++;
              gameScore();
            
         
         }  
             
               if (b1 ==("X")  && b5 ==("X")  && b9 ==("X"))
         {
           
            JOptionPane.showMessageDialog(this,"Player X wins","Tic tac toe",JOptionPane.OK_OPTION);
              btn1.setBackground(Color.green);
              btn5.setBackground(Color.green);
              btn9.setBackground(Color.green);
              xCount++;
              gameScore();
            
         
         }  
               
           if (b3 ==("X")  && b5 ==("X")  && b7==("X"))
         {
           
            JOptionPane.showMessageDialog(this,"Player X wins","Tic tac toe",JOptionPane.OK_OPTION);
              btn3.setBackground(Color.green);
              btn5.setBackground(Color.green);
              btn7.setBackground(Color.green);
              xCount++;
              gameScore();
            
         
         }  
           
                    if (b1 ==("O")  && b2 ==("O")  && b3 ==("O"))
         {
            
            JOptionPane.showMessageDialog(this,"Player O wins","Tic tac toe",JOptionPane.OK_OPTION);
              btn1.setBackground(Color.green);
              btn2.setBackground(Color.green);
              btn3.setBackground(Color.green);
              oCount++;
              gameScore();
            
         
         }
         
           if (b4 ==("O")  && b5 ==("O")  && b6 ==("O"))
         {
           
            JOptionPane.showMessageDialog(this,"Player O wins","Tic tac toe",JOptionPane.OK_OPTION);
              btn4.setBackground(Color.green);
              btn5.setBackground(Color.green);
              btn6.setBackground(Color.green);
              oCount++;
              gameScore();
            
         
         }
           
             if (b7 ==("O")  && b8 ==("O")  && b9 ==("O"))
         {
            
            JOptionPane.showMessageDialog(this,"Player O wins","Tic tac toe",JOptionPane.OK_OPTION);
              btn7.setBackground(Color.green);
              btn8.setBackground(Color.green);
              btn9.setBackground(Color.green);
              oCount++;
              gameScore();
            
         
         }
             
               if (b4 ==("O")  && b5 ==("O")  && b6 ==("O"))
         {
           
            JOptionPane.showMessageDialog(this,"Player O wins","Tic tac toe",JOptionPane.OK_OPTION);
              btn4.setBackground(Color.green);
              btn5.setBackground(Color.green);
              btn6.setBackground(Color.green);
              oCount++;
              gameScore();
            
         
         }
            if (b1 ==("O")  && b4 ==("O")  && b7 ==("O"))
         {
            
            JOptionPane.showMessageDialog(this,"Player O wins","Tic tac toe",JOptionPane.OK_OPTION);
              btn1.setBackground(Color.green);
              btn4.setBackground(Color.green);
              btn7.setBackground(Color.green);
              oCount++;
              gameScore();
            
         
         } 
                   
           if (b2 ==("O")  && b5 ==("O")  && b8 ==("O"))
         {
             
            JOptionPane.showMessageDialog(this,"Player O wins","Tic tac toe",JOptionPane.OK_OPTION);
              btn2.setBackground(Color.green);
              btn5.setBackground(Color.green);
              btn8.setBackground(Color.green);
              oCount++;
              gameScore();
            
         
         }     
           
           
             if (b3 ==("O")  && b6 ==("O")  && b9 ==("O"))
         {
            
            JOptionPane.showMessageDialog(this,"Player O wins","Tic tac toe",JOptionPane.OK_OPTION);
              btn3.setBackground(Color.green);
              btn6.setBackground(Color.green);
              btn9.setBackground(Color.green);
              oCount++;
              gameScore();
            
         
         }  
             
               if (b1 ==("O")  && b5 ==("O")  && b9 ==("O"))
         {
            
            JOptionPane.showMessageDialog(this,"Player O wins","Tic tac toe",JOptionPane.OK_OPTION);
              btn1.setBackground(Color.green);
              btn5.setBackground(Color.green);
              btn9.setBackground(Color.green);
              oCount++;
              gameScore();
            
         
         }  
               
           if (b3 ==("O")  && b5 ==("O")  && b7==("O"))
         {
          
            JOptionPane.showMessageDialog(this,"Player O wins","Tic tac toe",JOptionPane.OK_OPTION);
              btn3.setBackground(Color.green);
              btn5.setBackground(Color.green);
              btn7.setBackground(Color.green);
              oCount++;
              gameScore();
            
         
         } 
              
      
       
         
         
         
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        twoplayer_mode = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        playerX = new javax.swing.JLabel();
        playerO = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn9 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        twoplayer_mode.setBackground(new java.awt.Color(0, 102, 102));
        twoplayer_mode.setPreferredSize(new java.awt.Dimension(762, 496));

        jLabel22.setBackground(new java.awt.Color(204, 204, 204));
        jLabel22.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 102, 102));
        jLabel22.setText("HOME");

        jLabel27.setBackground(new java.awt.Color(204, 204, 204));
        jLabel27.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 102, 102));
        jLabel27.setText("RECORD");

        jPanel2.setBackground(new java.awt.Color(102, 0, 51));

        jLabel23.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 102, 102));
        jLabel23.setText("Player 2  X");

        jLabel25.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 102, 102));
        jLabel25.setText("You O");

        playerX.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        playerX.setOpaque(true);

        playerO.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        playerO.setOpaque(true);

        btnExit.setBackground(new java.awt.Color(255, 204, 204));
        btnExit.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(255, 204, 204));
        btnReset.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(playerO, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(playerX, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 93, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(playerX, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
        );

        btn9.setBackground(new java.awt.Color(0, 0, 0));
        btn9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(0, 0, 0));
        btn1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(0, 0, 0));
        btn5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(0, 0, 0));
        btn2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(0, 0, 0));
        btn6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(0, 0, 0));
        btn3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(0, 0, 0));
        btn8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(0, 0, 0));
        btn7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(0, 0, 0));
        btn4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 0, 51));
        jLabel21.setText("XO Game");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(61, 61, 61))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout twoplayer_modeLayout = new javax.swing.GroupLayout(twoplayer_mode);
        twoplayer_mode.setLayout(twoplayer_modeLayout);
        twoplayer_modeLayout.setHorizontalGroup(
            twoplayer_modeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(twoplayer_modeLayout.createSequentialGroup()
                .addGroup(twoplayer_modeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(twoplayer_modeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, twoplayer_modeLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)))
                .addGroup(twoplayer_modeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        twoplayer_modeLayout.setVerticalGroup(
            twoplayer_modeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(twoplayer_modeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(twoplayer_modeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel27))
                .addGroup(twoplayer_modeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(twoplayer_modeLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(twoplayer_modeLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(twoplayer_mode, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
                .addGap(312, 312, 312))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(twoplayer_mode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
         btn2.setText(startGame);
        if (startGame.equalsIgnoreCase("X"))
        {
           checker = false;
        }
        else 
         {
           checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
          btn9.setText(startGame);
        if (startGame.equalsIgnoreCase("X"))
        {
           checker = false;
        }
        else 
         {
           checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
          btn5.setText(startGame);
        if (startGame.equalsIgnoreCase("X"))
        {
           checker = false;
        }
        else 
         {
           checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        btn6.setText(startGame);
        if (startGame.equalsIgnoreCase("X"))
        {
           checker = false;
        }
        else 
         {
           checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
          btn4.setText(startGame);
        if (startGame.equalsIgnoreCase("X"))
        {
           checker = false;
        }
        else 
         {
           checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
          btn3.setText(startGame);
        if (startGame.equalsIgnoreCase("X"))
        {
           checker = false;
        }
        else 
         {
           checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
          btn1.setText(startGame);
        if (startGame.equalsIgnoreCase("X"))
        {
           checker = false;
        }
        else 
         {
           checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        btn8.setText(startGame);
        if (startGame.equalsIgnoreCase("X"))
        {
           checker = false;
        }
        else 
         {
           checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
          btn7.setText(startGame);
        if (startGame.equalsIgnoreCase("X"))
        {
           checker = false;
        }
        else 
         {
           checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
         Modes secondform = new Modes();
           secondform.setVisible(true);
          setVisible(false);
               dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
       btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);  
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");  
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        
       playerX.setText("0");
       playerO.setText("0");
       
        
        
       
        
                
                
        btn2.setText("");
        btn3.setText("");  
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        
        
        
         
         
             
       
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(twoPlayersMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(twoPlayersMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(twoPlayersMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(twoPlayersMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new twoPlayersMode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel playerO;
    private javax.swing.JLabel playerX;
    private javax.swing.JPanel twoplayer_mode;
    // End of variables declaration//GEN-END:variables

  
}
