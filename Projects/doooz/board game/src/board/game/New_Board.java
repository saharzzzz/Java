/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package board.game;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Sahar Zargari
 */
public class New_Board extends javax.swing.JFrame implements Runnable {
  JLabel  board[][]=new JLabel[6][7];
  int valueBeadX=21;
  int valueBeadO=21;
  boolean flage=true;
      //   JLabel timerLabel=new JLabel();
  int valueTimer=5;
  int counterBasic=0;
  boolean playgame=true;
  boolean startgame=false;
    public New_Board() {
              requestFocus();
        initComponents();
       
        mohre_x.setText("Number of beads X: "+valueBeadX);
         mohre_o.setText("Number of beads O: "+valueBeadO);
       this.getContentPane().setBackground( Color.white );
         statuse.setText("Player X");
      	setTitle("Puissance Game");

		//this.setSize(626, 600);

		this.setLocationRelativeTo(null);

		this.setResizable(false);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ////////////////
                  	helpFrame.setTitle("Help Puissance Game");

		helpFrame.setSize(650, 650);

		helpFrame.setLocationRelativeTo(null);

		helpFrame.setResizable(false);

		helpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                helpFrame.getContentPane().setBackground( Color.white );
           
    }

    public void emptyBoard(){
    
        	for (int i = 0; i < 6; i++) { 
			for (int j = 0; j < 7; j++) {
                        board[i][j].setText(".");
                           board[i][j].setFont(new Font("Verdana", Font.PLAIN,50));
                            board[i][j].setForeground(Color.white);
                        }
                }
        
    }
   
     public void createLabel(){
        int x=50,y=10;
      	for (int i = 0; i < 6; i++) { 
			for (int j = 0; j < 7; j++) {
                        board[i][j]=new JLabel(".");
                           board[i][j].setFont(new Font("Verdana", Font.PLAIN,50));
                       board[i][j].setBounds(x,y, 50,50);
                        board[i][j].setForeground(Color.white);
                       x+=60;
                          ;
                        }
                         x=50;
                         y+=60;
                        
        }
    
        
        
    	for (int i = 0; i < 6; i++) { 
			for (int j = 0; j < 7; j++) {
                      
                    jPanel1.add(board[i][j]);  
                     
                        }
                      
        }
      
    }
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        helpFrame = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton11 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        timer = new javax.swing.JLabel();
        mohre_x = new javax.swing.JLabel();
        mohre_o = new javax.swing.JLabel();
        pause = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        statuse = new javax.swing.JLabel();
        winner = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jPanel5.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 70)); // NOI18N
        jLabel1.setText("Help");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("start the game: Play button");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("exit the game: Exit button");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText(" select the number of the column between 1 and 7 \n To win, 4 pieces must be placed horizontally or vertically or diagonally \n Each player has 20 seconds to select the column they want \n Each player has only 21 pieces \n When the game is full, one of the players wins randomly \n");
        jScrollPane1.setViewportView(jTextArea1);

        jButton11.setBackground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Back");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Mongolian Baiti", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("About Game");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGap(0, 149, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)))
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout helpFrameLayout = new javax.swing.GroupLayout(helpFrame.getContentPane());
        helpFrame.getContentPane().setLayout(helpFrameLayout);
        helpFrameLayout.setHorizontalGroup(
            helpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        helpFrameLayout.setVerticalGroup(
            helpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));

        timer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        timer.setForeground(new java.awt.Color(51, 51, 51));

        mohre_x.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mohre_x.setForeground(new java.awt.Color(255, 255, 255));
        mohre_x.setText("jLabel3");

        mohre_o.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mohre_o.setForeground(new java.awt.Color(255, 255, 255));
        mohre_o.setText("jLabel4");

        pause.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        pause.setForeground(new java.awt.Color(255, 0, 0));
        pause.setText("Pause");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(timer, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pause)
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addComponent(mohre_x, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mohre_o, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(timer, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(pause)))
                .addGap(27, 27, 27)
                .addComponent(mohre_o)
                .addGap(35, 35, 35)
                .addComponent(mohre_x)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        statuse.setFont(new java.awt.Font("Cheri Liney", 0, 24)); // NOI18N
        statuse.setForeground(new java.awt.Color(255, 255, 255));

        winner.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        winner.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statuse, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(winner, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(33, 33, 33)
                .addComponent(jButton3)
                .addGap(27, 27, 27)
                .addComponent(jButton4)
                .addGap(31, 31, 31)
                .addComponent(jButton5)
                .addGap(32, 32, 32)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(statuse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(winner, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        jButton8.setText("Play");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Help");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Exit");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jMenu1.setText("Menu");

        jMenuItem1.setText("Play");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Help");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int counterb3=1;int counterb1=1;int counterb2=1;int counterb4=1;int counterb5=1;int counterb6=1;int counterb7=1;
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(startgame==false)
    JOptionPane.showMessageDialog(this, "First, Click the Play Button  >_<");
      if(counterb7<=6 && !stop && startgame)  {
            counterBasic++;
         valueTimer=20;    
            Game_flow( 6, flage);
            flage=!flage;
        }
        counterb7++;
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(startgame==false)
    JOptionPane.showMessageDialog(this, "First, Click the Play Button  >_<");
          if(counterb6<=6 && !stop && startgame)  {
           valueTimer=20;
            Game_flow( 5, flage);
            flage=!flage;
        }
        counterb6++;
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(startgame==false)
    JOptionPane.showMessageDialog(this, "First, Click the Play Button  >_<");
       if(counterb5<=6 && !stop && startgame)  {
            counterBasic++;
           valueTimer=20;
            Game_flow( 4, flage);
            flage=!flage;
        }
        counterb5++;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(startgame==false)
    JOptionPane.showMessageDialog(this, "First, Click the Play Button  >_<");
         if(counterb4<=6 && !stop && startgame)  {
            counterBasic++;
          valueTimer=20;
            Game_flow( 3, flage);
            flage=!flage;
        }
        counterb4++;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(startgame==false)
    JOptionPane.showMessageDialog(this, "First, Click the Play Button  >_<");
          if(counterb3<=6 && !stop && startgame)  {
            counterBasic++;
          valueTimer=20;
            Game_flow( 2, flage);
            flage=!flage;
        }
        counterb3++;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(startgame==false)
    JOptionPane.showMessageDialog(this, "First, Click the Play Button  >_<");
          if(counterb2<=6 && !stop && startgame)  {
            counterBasic++;
           valueTimer=20;
            Game_flow( 1, flage);
            flage=!flage;
        }
        counterb2++;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if(startgame==false)
    JOptionPane.showMessageDialog(this, "First, Click the Play Button  >_<");

        if(counterb1<=6 && !stop && startgame)  {
            counterBasic++;
          valueTimer=20;
            Game_flow( 0, flage);
            flage=!flage;
        }
        counterb1++;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      pause.setText("Playing...");
pause.setForeground(Color.green);
        stop=false;
        JOptionPane.showMessageDialog(this, "Game On :-)");
        counterb3=1; counterb1=1; counterb2=1; counterb4=1; counterb5=1; counterb6=1; counterb7=1;
        requestFocus();
        startgame=true;
     emptyBoard();
     counterTime = 0;
     winner.setText("");
     valueBeadO=21;
     valueBeadX=21;
     mohre_o.setText("Number of beads O: "+valueBeadO);
              mohre_x.setText("Number of beads X: "+valueBeadX);
      counterBasic=0;
       valueTimer=20;
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
pause.setText("Playing...");
pause.setForeground(Color.green);
        stop=false;
        JOptionPane.showMessageDialog(this, "Game On :-)");
        counterb3=1; counterb1=1; counterb2=1; counterb4=1; counterb5=1; counterb6=1; counterb7=1;
        requestFocus();
        startgame=true;
     emptyBoard();
     counterTime = 0;
     winner.setText("");
     valueBeadO=21;
     valueBeadX=21;
     mohre_o.setText("Number of beads O: "+valueBeadO);
              mohre_x.setText("Number of beads X: "+valueBeadX);
      counterBasic=0;
       valueTimer=20;
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
      	System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
      	System.exit(0);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
      stop=true;
        helpFrame.setVisible(true);
                   pause.setText("Pause");
pause.setForeground(Color.red);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       if(startgame){
        pause.setText("Playing...");
pause.setForeground(Color.green);
       }
        stop=false;
      helpFrame.setVisible(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
      stop=true;
        helpFrame.setVisible(true);
                   pause.setText("Pause");
pause.setForeground(Color.red);
    }//GEN-LAST:event_jMenuItem2ActionPerformed
//////////////////////////
    boolean breaktimer=true;
 int counterTime = 0;
       public int timer() {
           //  jLabel5.setBounds(450,50, 200,50);
       //timerLabel.setFont(new Font("Verdana", Font.PLAIN,25));
      // this.add(timerLabel);
        
           if(startgame){
		counterTime = 0;
                playgame=true;
		for (int j = 1; j <=20; j++) {
                     while(stop){
                         System.err.println("");
          }
                    if(!startgame)
                        break;
                if(!playgame)
                    break;
                    if(valueTimer==20){
                        valueTimer=0;
                        break;
                    }
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			counterTime++;
			
			timer.setText("Time: "+counterTime);
                    
		}
       }
		return counterTime;
	}   
    
      
    
    
    
    
    
    
  //////////////////////////
    public void Game_flow(int key, boolean flag) {// jaryan harbar set mohre
        if(startgame){
        if(flag)
             statuse.setText("Player O");
         else
             statuse.setText("Player X");  
         
		int counter = 0;
		for (int i = 0; i < 6; i++) {
			counter++;

			if (!board[i][key].getText().equals(".")) {
				if (i == 0)
					break;
				int row = i - 1;
				if (flag  && row < 6){
					board[row][key] .setText("X");
                                       board[row][key].setForeground(Color.yellow);
                                       valueBeadX--;
                                       mohre_x.setText("Number of beads X: "+valueBeadX);
         
                                }
                                else{
					board[row][key] .setText("O");
                                          board[row][key].setForeground(Color.red);
                                          valueBeadO--;
                                          mohre_o.setText("Number of beads O: "+valueBeadO);
                                }
				break;
			}
			if (board.length == counter) {

				if (flag) {
                                   
					board[i][key].setText("X");
                                      board[i][key].setForeground(Color.yellow);
                                      
valueBeadX--;
mohre_x.setText("Number of beads X: "+valueBeadX);
				} else{
					board[i][key].setText("O");
                                          board[i][key].setForeground(Color.red);
                                          valueBeadO--;
                                          mohre_o.setText("Number of beads O: "+valueBeadO);
                                }

			}
		}

	}
    }
    ////
    private Thread timeTHread;
   
    
    Random rand=new Random();
    public int randomWin(){
    return rand.nextInt(2);
        
    }
    /////////////////
    
     public void cheakerRow(){
     String  iscasex="";
     String  iscaseO="";
   
          if(startgame && !stop){
         
               
      	for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
      
            if(board[i][j].getText().equals("X")){
         
             iscasex=iscasex+j;
            }
             if(board[i][j].getText().equals("O")){
           
               iscaseO=iscaseO+j;
            }
          
        }
      
         //   System.out.println("iscasex : "+iscasex);
         //   System.out.println("iscaseo : "+iscaseO);
             
         String strX[]=iscasex.split("");
             String strO[]=iscaseO.split("");
     
        int differenceX1=0;
        int differenceX2=0;
          int differenceX3=0;
     if(strX.length>=4){
       int mid=strX.length/2;
       // System.err.println("mid"+mid);
    
        differenceX1=Integer.parseInt(strX[mid])-Integer.parseInt(strX[mid-1]);
         differenceX2=Integer.parseInt(strX[mid-1])-Integer.parseInt(strX[mid-2]);
          differenceX3=Integer.parseInt(strX[mid+1])-Integer.parseInt(strX[mid]);
      //  System.err.println("difference: "+differenceX);
       }  
     //////////
       int differenceO1=0;
        int differenceO2=0;
        int differenceO3=0;
     if(strO.length>=4){
        int mid=strO.length/2;
       // System.err.println("mid"+mid);
    
        differenceO1=Integer.parseInt(strO[mid])-Integer.parseInt(strO[mid-1]);
        
        differenceO2=Integer.parseInt(strO[mid-1])-Integer.parseInt(strO[mid-2]);
          differenceO3=Integer.parseInt(strO[mid+1])-Integer.parseInt(strO[mid]);
       // System.err.println("difference: "+differenceO);
       }  
     if(differenceX1==1 && differenceX2==1&& differenceX3==1 &&  !stop){
          playgame=false;
                startgame=false;
                  stop=true;
                 winner.setText("The player X won :-)");
                 pause.setText("Pause");
pause.setForeground(Color.red);
                JOptionPane.showMessageDialog(this, "The player X won :-)");
                    System.err.println("e5");
               
                break;
               }
              if(differenceO1==1 &&differenceO2==1&& differenceO3==1 &&  !stop){
                    playgame=false;
                       startgame=false;
                          stop=true;
                        winner.setText("The player O won :-");
                        pause.setText("Pause");
pause.setForeground(Color.red);
                      JOptionPane.showMessageDialog(this, "The player O won :-)");
                     
                        break;
              }
            
              iscasex="";
    iscaseO="";
   
   
  }
     } 
    }
    
    public void cheakDiagonalLeft(){
    
    String iscasex="";
     String iscaseO="";
        int col=3;
        int row=0;
         if(startgame && !stop){
             
        for(int i=1;i<=6 ;i++){
        
            if(col>=1 && col<=3){
            for(int j=col;j<=6;j++){
            
            if(board[row][j].getText().equals("X")){
         
             iscasex=iscasex+row;
            }
              if(board[row][j].getText().equals("O")){
           
               iscaseO=iscaseO+row;
            }
            row++;
            }
            }
            if(col<0)
                col=0;
        //////////////
          if(col==0 && i==4){
               row=0;
            for(int j=col;j<=5;j++){
            
            if(board[row][j].getText().equals("X")){
         
             iscasex=iscasex+row;
            }
              if(board[row][j].getText().equals("O")){
           
               iscaseO=iscaseO+row;
            }
            row++;
            }
          }
          /////////////
                if(col==0 && i==5){
                    row=1;
            for(int j=col;j<=4;j++){
            
            if(board[row][j].getText().equals("X")){
         
             iscasex=iscasex+row;
            }
              if(board[row][j].getText().equals("O")){
           
               iscaseO=iscaseO+row;
            }
            row++;
            }
               }
               ///////////
             if(col==0 && i==6){
                 row=2;
            for(int j=col;j<=3;j++){
              
            if(board[row][j].getText().equals("X")){
         
             iscasex=iscasex+row;
            }
              if(board[row][j].getText().equals("O")){
           
               iscaseO=iscaseO+row;
            }
            row++;
            }
             }
        
        //////////////////
            String strX[]=iscasex.split("");
             String strO[]=iscaseO.split("");
     
        int differenceX1=0;
        int differenceX2=0;
        int differenceX3=0;
     if(strX.length>=4){
        int mid=strX.length/2;
    
    
        differenceX1=Integer.parseInt(strX[mid])-Integer.parseInt(strX[mid-1]);
         differenceX2=Integer.parseInt(strX[mid-1])-Integer.parseInt(strX[mid-2]);
         differenceX3=Integer.parseInt(strX[mid+1])-Integer.parseInt(strX[mid]);
  
       }  
     //////////
       int differenceO1=0;
         int differenceO2=0;
         int differenceO3=0;
         
     if(strO.length>=4){
        int mid=strO.length/2;
   
    
        differenceO1=Integer.parseInt(strO[mid])-Integer.parseInt(strO[mid-1]);
        differenceO2=Integer.parseInt(strO[mid-1])-Integer.parseInt(strO[mid-2]);
          differenceO3=Integer.parseInt(strO[mid+1])-Integer.parseInt(strO[mid]);
          
   
       }  
     
      
     if(differenceX1==1&& differenceX2==1 &&differenceX3==1 &&  !stop){
          playgame=false;
                 startgame=false; 
                    stop=true;
           winner.setText("The player X won :-)");
           pause.setText("Pause");
pause.setForeground(Color.red);
                JOptionPane.showMessageDialog(this, "The player X won :-)");
                     System.err.println("e4");
               
                   break;
               }
              if(differenceO1==1&&differenceO2==1&&differenceO3==1 &&  !stop){
                   playgame=false;
                       startgame=false;
                         stop=true;
                        winner.setText("The player O won :-) ");
                        pause.setText("Pause");
pause.setForeground(Color.red);
                      JOptionPane.showMessageDialog(this, "The player O won :-)");
                      
                       break;
              }
        
        
        
       ////////////// 
         iscasex="";
         iscaseO="";
        row=0;
        col--;
        }

    }
    }
     
     
     
     

   
      public void cheakDiagonalRight(){
     
           int level=3;
        int templevel=0;
          String iscasex="";
     String  iscaseO="";
     //while(level<=4){
     
    int diagonal1=0;
      if(startgame && !stop){
    while(level<=8){
        if(level<=5){
     for(int j=level;j>=0;j--){
     if(board[diagonal1][j].getText().equals("X")){
         
             iscasex=iscasex+diagonal1;
            }
             if(board[diagonal1][j].getText().equals("O")){
           
               iscaseO=iscaseO+diagonal1;
            }
         
       diagonal1++;  
     }
        }
    if(level==6){
      for(int j=level;j>=1;j--){
     if(board[diagonal1][j].getText().equals("X")){
         
             iscasex=iscasex+diagonal1;
            }
             if(board[diagonal1][j].getText().equals("O")){
           
               iscaseO=iscaseO+diagonal1;
            }
         
       diagonal1++;  
     }
        }
    ////////////
        if(level==7){
            diagonal1=1;
      for(int j=level-1;j>=2;j--){
     if(board[diagonal1][j].getText().equals("X")){
         
             iscasex=iscasex+diagonal1;
            }
             if(board[diagonal1][j].getText().equals("O")){
           
               iscaseO=iscaseO+diagonal1;
            }
         
       diagonal1++;  
     }
        }
            if(level==8){
            diagonal1=2;
      for(int j=level-2;j>=3;j--){
     if(board[diagonal1][j].getText().equals("X")){
         
             iscasex=iscasex+diagonal1;
            }
             if(board[diagonal1][j].getText().equals("O")){
           
               iscaseO=iscaseO+diagonal1;
            }
         
       diagonal1++;  
     }
        }
            
       String strX[]=iscasex.split("");
             String strO[]=iscaseO.split("");
     
        int differenceX1=0;
        int differenceX2=0;
        int differenceX3=0;
     if(strX.length>=4){
        int mid=strX.length/2;
      //  System.err.println("mid"+mid);
    
        differenceX1=Integer.parseInt(strX[mid])-Integer.parseInt(strX[mid-1]);
         differenceX2=Integer.parseInt(strX[mid-1])-Integer.parseInt(strX[mid-2]);
         differenceX3=Integer.parseInt(strX[mid+1])-Integer.parseInt(strX[mid]);
     //   System.err.println("difference: "+differenceX);
       }  
     //////////
       int differenceO1=0;
         int differenceO2=0;
         int differenceO3=0;
         
     if(strO.length>=4){
        int mid=strO.length/2;
       // System.err.println("mid"+mid);
    
        differenceO1=Integer.parseInt(strO[mid])-Integer.parseInt(strO[mid-1]);
        differenceO2=Integer.parseInt(strO[mid-1])-Integer.parseInt(strO[mid-2]);
          differenceO3=Integer.parseInt(strO[mid+1])-Integer.parseInt(strO[mid]);
          
     //   System.err.println("difference: "+differenceO);
       }  
     
      
     if(differenceX1==1&& differenceX2==1 &&differenceX3==1 &&  !stop){
          playgame=false;
                 startgame=false; 
                   stop=true;
           winner.setText("The player X won :-)");
           pause.setText("Pause");
pause.setForeground(Color.red);
                System.err.println("e3");
                JOptionPane.showMessageDialog(this, "The player X won :-)");
               
                 break;
               }
              if(differenceO1==1&&differenceO2==1&&differenceO3==1 &&  !stop){
                  playgame=false;
                       startgame=false;
                          stop=true;
                        winner.setText("The player O won :-)");
                                   pause.setText("Pause");
pause.setForeground(Color.red);
                      JOptionPane.showMessageDialog(this, "The player O won :-)");
                       
                       break;
              }
              iscasex="";
     iscaseO="";
   level++;
   diagonal1=0;
    }
    
} 
   
  
}       
         
    
     
     
    
   
     //////////////////////
    public void cheaker(){
  
    String iscasex="";
     String  iscaseO="";
       
      if(startgame && !stop){
   for (int j = 0; j < 7; j++) {
          
         
               
       	for (int i = 0; i < 6; i++) { 
      
            if(board[i][j].getText().equals("X")){
         
             iscasex=iscasex+i;
            }
             if(board[i][j].getText().equals("O")){
           
               iscaseO=iscaseO+i;
            }
          
        }
      
        
         String strX[]=iscasex.split("");
             String strO[]=iscaseO.split("");
     
        int differenceX1=0;
        int differenceX2=0;
        int differenceX3=0;
     if(strX.length>=4){
        int mid=strX.length/2;
      //  System.err.println("mid"+mid);
    
        differenceX1=Integer.parseInt(strX[mid])-Integer.parseInt(strX[mid-1]);
         differenceX2=Integer.parseInt(strX[mid-1])-Integer.parseInt(strX[mid-2]);
         differenceX3=Integer.parseInt(strX[mid+1])-Integer.parseInt(strX[mid]);
     //   System.err.println("difference: "+differenceX);
       }  
     //////////
       int differenceO1=0;
         int differenceO2=0;
         int differenceO3=0;
     if(strO.length>=4){
        int mid=strO.length/2;
       // System.err.println("mid"+mid);
    
        differenceO1=Integer.parseInt(strO[mid])-Integer.parseInt(strO[mid-1]);
        differenceO2=Integer.parseInt(strO[mid-1])-Integer.parseInt(strO[mid-2]);
          differenceO3=Integer.parseInt(strO[mid+1])-Integer.parseInt(strO[mid]);
     //   System.err.println("difference: "+differenceO);
       }  
     if(differenceX1==1&& differenceX2==1 &&differenceX3==1 &&  !stop){
          playgame=false;
                startgame=false;
                stop=true;
               winner.setText("The player X won :-)");
                          pause.setText("Pause");
pause.setForeground(Color.red);
                JOptionPane.showMessageDialog(this, "The player X won :-)");
                  System.err.println("e2");
               
                break;
               }
              if(differenceO1==1&&differenceO2==1&&differenceO3==1 &&  !stop){
                      playgame=false;
                       startgame=false;
                         stop=true;
                      winner.setText("The player O won :-)");
                                 pause.setText("Pause");
pause.setForeground(Color.red);
                      JOptionPane.showMessageDialog(this, "The player O won :-)");
                   
                       break;
              }
              iscasex="";
     iscaseO="";
   
   
   }
       }
    }

    //////////////
    //boolean falgemenu=false;
    boolean start=true;
    boolean stop=false;
    public void run() {
        
       // while(start){
          
            createLabel(); 
      //menu (falgemenu);
           JOptionPane.showMessageDialog(this, "Welcome to the Puissance Game :-)");
         //requestFocus();
        while(true){
          
          while(stop){
               System.err.println("");
          }
             cheaker();
        cheakerRow();
       cheakDiagonalLeft();
       cheakDiagonalRight();
        requestFocus();
          
              if(valueBeadO==0&&valueBeadX==0){
                      if(randomWin()==1){
                              playgame=false;
                      startgame=false;
                        stop=true;
                      winner.setText("The player X won");
                      pause.setText("Pause");
pause.setForeground(Color.red);
                        JOptionPane.showMessageDialog(this, "The player X won :-)");
                  
                         System.err.println("counterBasic");
                      break;
                      }
                      else{
                                 playgame=false;
                           startgame=false;
                              stop=true;
                          winner.setText("The player O won");
                          pause.setText("Pause");
pause.setForeground(Color.red);
                           JOptionPane.showMessageDialog(this, "The player O won :-)");
                    
                        
                        break;
                      }
                   }
                 //requestFocus();
              
     int time=timer();
     requestFocus();
     if(time==20){
         flage=!flage;
          if(flage)
             statuse.setText("Player X");
         else
             statuse.setText("Player O");  
     }
        
        }
        
       
        //}
    }
   public void addNotify() {
		super.addNotify();
		timeTHread = new Thread(this);
		timeTHread.start();
	}
   /////////
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
            java.util.logging.Logger.getLogger(New_Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(New_Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(New_Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(New_Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                new New_Board().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame helpFrame;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel mohre_o;
    private javax.swing.JLabel mohre_x;
    private javax.swing.JLabel pause;
    private javax.swing.JLabel statuse;
    private javax.swing.JLabel timer;
    private javax.swing.JLabel winner;
    // End of variables declaration//GEN-END:variables
}
