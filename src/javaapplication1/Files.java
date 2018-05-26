/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.File;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.Timestamp;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author Arun
 */
public class Files extends javax.swing.JFrame {

    /**
     * Creates new form Files
     */
    public Files() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
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
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Next = new javax.swing.JButton();
        Browse = new javax.swing.JButton();
        BrowseField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        YahooFiles = new javax.swing.JLabel();
        TwitterFiles = new javax.swing.JLabel();
        LogOut = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        ViewAll = new javax.swing.JLabel();
        ViewAll1 = new javax.swing.JLabel();
        ViewAll2 = new javax.swing.JLabel();
        Help = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(780, 615));

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(236, 240, 241));
        jLabel6.setText("Browse to file location:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(100, 20, 210, 30);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(10, 100, 510, 12);

        Next.setBackground(new java.awt.Color(89, 171, 227));
        Next.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        Next.setForeground(new java.awt.Color(255, 255, 255));
        Next.setText("Next");
        Next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NextMouseClicked(evt);
            }
        });
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });
        jPanel2.add(Next);
        Next.setBounds(410, 110, 100, 40);

        Browse.setBackground(new java.awt.Color(242, 38, 19));
        Browse.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        Browse.setForeground(new java.awt.Color(255, 255, 255));
        Browse.setText("Browse");
        Browse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Browse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BrowseMouseClicked(evt);
            }
        });
        Browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseActionPerformed(evt);
            }
        });
        jPanel2.add(Browse);
        Browse.setBounds(410, 40, 100, 40);

        BrowseField.setBackground(new java.awt.Color(108, 122, 137));
        BrowseField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        BrowseField.setForeground(new java.awt.Color(228, 241, 254));
        BrowseField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseFieldActionPerformed(evt);
            }
        });
        jPanel2.add(BrowseField);
        BrowseField.setBounds(10, 50, 380, 30);

        jPanel3.setBackground(new java.awt.Color(52, 73, 94));
        jPanel3.setPreferredSize(new java.awt.Dimension(250, 489));

        YahooFiles.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        YahooFiles.setForeground(new java.awt.Color(236, 240, 241));
        YahooFiles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-yahoo.png"))); // NOI18N
        YahooFiles.setText("Input Yahoo Finance");
        YahooFiles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        YahooFiles.setMinimumSize(new java.awt.Dimension(196, 48));
        YahooFiles.setPreferredSize(new java.awt.Dimension(196, 48));
        YahooFiles.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                YahooFilesMouseMoved(evt);
            }
        });
        YahooFiles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                YahooFilesMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                YahooFilesMouseExited(evt);
            }
        });

        TwitterFiles.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        TwitterFiles.setForeground(new java.awt.Color(236, 240, 241));
        TwitterFiles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-twitter.png"))); // NOI18N
        TwitterFiles.setText("Input Twitter");
        TwitterFiles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TwitterFiles.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                TwitterFilesMouseMoved(evt);
            }
        });
        TwitterFiles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TwitterFilesMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TwitterFilesMouseExited(evt);
            }
        });

        LogOut.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        LogOut.setForeground(new java.awt.Color(236, 240, 241));
        LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-shutdown.png"))); // NOI18N
        LogOut.setText("Log Out");
        LogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogOut.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LogOutMouseMoved(evt);
            }
        });
        LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogOutMouseExited(evt);
            }
        });

        Home.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Home.setForeground(new java.awt.Color(236, 240, 241));
        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-home.png"))); // NOI18N
        Home.setText("Home");
        Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Home.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                HomeMouseMoved(evt);
            }
        });
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeMouseExited(evt);
            }
        });

        ViewAll.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        ViewAll.setForeground(new java.awt.Color(236, 240, 241));
        ViewAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-day_view.png"))); // NOI18N
        ViewAll.setText("View All");
        ViewAll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewAll.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ViewAllMouseMoved(evt);
            }
        });
        ViewAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewAllMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ViewAllMouseExited(evt);
            }
        });

        ViewAll1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        ViewAll1.setForeground(new java.awt.Color(236, 240, 241));
        ViewAll1.setText("      Any other option1");
        ViewAll1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewAll1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ViewAll1MouseMoved(evt);
            }
        });
        ViewAll1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewAll1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ViewAll1MouseExited(evt);
            }
        });

        ViewAll2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        ViewAll2.setForeground(new java.awt.Color(236, 240, 241));
        ViewAll2.setText("      Any other option2");
        ViewAll2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewAll2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ViewAll2MouseMoved(evt);
            }
        });
        ViewAll2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewAll2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ViewAll2MouseExited(evt);
            }
        });

        Help.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Help.setForeground(new java.awt.Color(236, 240, 241));
        Help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-why_us.png"))); // NOI18N
        Help.setText("Help");
        Help.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Help.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                HelpMouseMoved(evt);
            }
        });
        Help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HelpMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HelpMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(YahooFiles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TwitterFiles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
            .addComponent(LogOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ViewAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ViewAll1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Help, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(ViewAll2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator2)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(YahooFiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TwitterFiles)
                .addGap(18, 18, 18)
                .addComponent(ViewAll)
                .addGap(18, 18, 18)
                .addComponent(ViewAll1)
                .addGap(28, 28, 28)
                .addComponent(ViewAll2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Help)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LogOut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Home)
                .addGap(15, 15, 15))
        );

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Files");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 120, 22);

        jLabelClose.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseMoved(evt);
            }
        });
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseExited(evt);
            }
        });
        jPanel1.add(jLabelClose);
        jLabelClose.setBounds(760, 10, 12, 22);

        jLabelMin.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelMin);
        jLabelMin.setBounds(740, 10, 11, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void YahooFilesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YahooFilesMouseMoved
        YahooFiles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(108,122,137)));
    }//GEN-LAST:event_YahooFilesMouseMoved

    private void YahooFilesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YahooFilesMouseClicked
        this.setVisible(true);
    }//GEN-LAST:event_YahooFilesMouseClicked

    private void YahooFilesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YahooFilesMouseExited
        YahooFiles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52,73,94)));
    }//GEN-LAST:event_YahooFilesMouseExited

    private void TwitterFilesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TwitterFilesMouseMoved
        TwitterFiles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(108,122,137)));
    }//GEN-LAST:event_TwitterFilesMouseMoved

    private void TwitterFilesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TwitterFilesMouseClicked
        Twitter twit = new Twitter();
        twit.setVisible(true);
        twit.pack();
        twit.setLocationRelativeTo(null);
        twit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();

    }//GEN-LAST:event_TwitterFilesMouseClicked

    private void TwitterFilesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TwitterFilesMouseExited
        TwitterFiles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52,73,94)));
    }//GEN-LAST:event_TwitterFilesMouseExited

    private void LogOutMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseMoved
        LogOut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(108,122,137)));
    }//GEN-LAST:event_LogOutMouseMoved

    private void LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseClicked
        addtimestampin(Login.user);
        addtimestamp(Login.user);
        Login log = new Login();
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_LogOutMouseClicked

    private void LogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseExited
        LogOut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52,73,94)));
    }//GEN-LAST:event_LogOutMouseExited

    private void HomeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseMoved
        Home.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(108,122,137)));
    }//GEN-LAST:event_HomeMouseMoved

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        if(Login.user.equalsIgnoreCase("admin")) {
            Admin main = new Admin();
            main.setVisible(true);
            main.pack();
            main.setLocationRelativeTo(null);
            main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
        else {
        Main main = new Main();
        main.setVisible(true);
        main.pack();
        main.setLocationRelativeTo(null);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        }
    }//GEN-LAST:event_HomeMouseClicked

    private void HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseExited
        Home.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52,73,94)));
    }//GEN-LAST:event_HomeMouseExited

    private void jLabelCloseMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseMoved

    }//GEN-LAST:event_jLabelCloseMouseMoved
    
    public void addtimestamp(String user) {
            try {
            
            SetConnection conn = new SetConnection();
            Connection connect = SetConnection.conn;
            Statement stm = connect.createStatement();
            
            Timestamp time = new Timestamp(System.currentTimeMillis());
            String sql = "update user SET last_logged_out = '"+time+"' where username = '"+user+"'";
            
            stm.executeUpdate(sql);
            
            connect.close();
        }
        catch (Exception e) {}
    }
    
    public void addtimestampin(String user) {
            try {
            
            SetConnection conn = new SetConnection();
            Connection connect = SetConnection.conn;
            Statement stm = connect.createStatement();
            
            
            String sql = "update user SET last_logged_in = '"+Login.time+"' where username = '"+user+"'";
            
            stm.executeUpdate(sql);
            
            connect.close();
        }
        catch (Exception e) {}
        }
    
    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        addtimestampin(Login.user);
        addtimestamp(Login.user);
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseExited

    }//GEN-LAST:event_jLabelCloseMouseExited

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void ViewAllMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewAllMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewAllMouseMoved

    private void ViewAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewAllMouseClicked
        ViewAll view = new ViewAll();
        view.setVisible(true);
        view.pack();
        view.setLocationRelativeTo(null);
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_ViewAllMouseClicked

    private void ViewAllMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewAllMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewAllMouseExited

    private void ViewAll1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewAll1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewAll1MouseMoved

    private void ViewAll1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewAll1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewAll1MouseClicked

    private void ViewAll1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewAll1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewAll1MouseExited

    private void ViewAll2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewAll2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewAll2MouseMoved

    private void ViewAll2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewAll2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewAll2MouseClicked

    private void ViewAll2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewAll2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewAll2MouseExited

    private void NextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMouseClicked
        Twitter twit = new Twitter();
        twit.setVisible(true);
        twit.pack();
        twit.setLocationRelativeTo(null);
        twit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_NextMouseClicked

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NextActionPerformed

    private void BrowseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BrowseMouseClicked
        Registration reg = new Registration();
        reg.setVisible(true);
        reg.pack();
        reg.setLocationRelativeTo(null);
        reg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_BrowseMouseClicked

    private void BrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        BrowseField.setText(filename);
    }//GEN-LAST:event_BrowseActionPerformed

    private void BrowseFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BrowseFieldActionPerformed

    private void HelpMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseMoved
        Help.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(108,122,137)));
    }//GEN-LAST:event_HelpMouseMoved

    private void HelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseClicked
        HelpFiles help = new HelpFiles();
        help.setVisible(true);
        help.pack();
        help.setLocationRelativeTo(null);
        help.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_HelpMouseClicked

    private void HelpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseExited
        Help.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52,73,94)));
    }//GEN-LAST:event_HelpMouseExited

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
            java.util.logging.Logger.getLogger(Files.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Files.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Files.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Files.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Files().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Browse;
    private javax.swing.JTextField BrowseField;
    private javax.swing.JLabel Help;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel LogOut;
    private javax.swing.JButton Next;
    private javax.swing.JLabel TwitterFiles;
    private javax.swing.JLabel ViewAll;
    private javax.swing.JLabel ViewAll1;
    private javax.swing.JLabel ViewAll2;
    private javax.swing.JLabel YahooFiles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
