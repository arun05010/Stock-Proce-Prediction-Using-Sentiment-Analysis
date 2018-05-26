/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.Timestamp;
import javax.swing.JFrame;

/**
 *
 * @author Arun
 */
public class HelpVisualize extends javax.swing.JFrame {

    /**
     * Creates new form HelpVisualize
     */
    public HelpVisualize() {
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

        jPanel3 = new javax.swing.JPanel();
        UserProfile = new javax.swing.JLabel();
        SecuritySettings = new javax.swing.JLabel();
        LogOut = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        SecuritySettings1 = new javax.swing.JLabel();
        SecuritySettings2 = new javax.swing.JLabel();
        Help = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        prof = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pass = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ustats = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(780, 615));

        jPanel3.setBackground(new java.awt.Color(52, 73, 94));
        jPanel3.setPreferredSize(new java.awt.Dimension(250, 514));

        UserProfile.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        UserProfile.setForeground(new java.awt.Color(236, 240, 241));
        UserProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-bar_chart.png"))); // NOI18N
        UserProfile.setText("Bar Chart");
        UserProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UserProfile.setMinimumSize(new java.awt.Dimension(196, 48));
        UserProfile.setPreferredSize(new java.awt.Dimension(196, 48));
        UserProfile.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                UserProfileMouseMoved(evt);
            }
        });
        UserProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserProfileMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UserProfileMouseExited(evt);
            }
        });

        SecuritySettings.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        SecuritySettings.setForeground(new java.awt.Color(236, 240, 241));
        SecuritySettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-line_chart.png"))); // NOI18N
        SecuritySettings.setText("Line Chart");
        SecuritySettings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SecuritySettings.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SecuritySettingsMouseMoved(evt);
            }
        });
        SecuritySettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SecuritySettingsMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SecuritySettingsMouseExited(evt);
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

        SecuritySettings1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        SecuritySettings1.setForeground(new java.awt.Color(236, 240, 241));
        SecuritySettings1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-scatter_plot.png"))); // NOI18N
        SecuritySettings1.setText("Scatter Plot");
        SecuritySettings1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SecuritySettings1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SecuritySettings1MouseMoved(evt);
            }
        });
        SecuritySettings1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SecuritySettings1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SecuritySettings1MouseExited(evt);
            }
        });

        SecuritySettings2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        SecuritySettings2.setForeground(new java.awt.Color(236, 240, 241));
        SecuritySettings2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-details.png"))); // NOI18N
        SecuritySettings2.setText("Summary");
        SecuritySettings2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SecuritySettings2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SecuritySettings2MouseMoved(evt);
            }
        });
        SecuritySettings2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SecuritySettings2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SecuritySettings2MouseExited(evt);
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
            .addComponent(UserProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SecuritySettings, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
            .addComponent(LogOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SecuritySettings1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SecuritySettings2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Help, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UserProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SecuritySettings)
                .addGap(18, 18, 18)
                .addComponent(SecuritySettings1)
                .addGap(18, 18, 18)
                .addComponent(SecuritySettings2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Help)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LogOut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Home)
                .addGap(15, 15, 15))
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(236, 240, 241));
        jLabel12.setText("Q1: How do I change or update my profile details?");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 10, 470, 30);

        prof.setEditable(false);
        prof.setBackground(new java.awt.Color(108, 122, 137));
        prof.setColumns(20);
        prof.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        prof.setForeground(new java.awt.Color(228, 241, 254));
        prof.setRows(5);
        jScrollPane1.setViewportView(prof);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 40, 500, 60);

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(236, 240, 241));
        jLabel13.setText("Q2: How do I change my password and 2 factor details?");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(10, 120, 500, 30);

        pass.setEditable(false);
        pass.setBackground(new java.awt.Color(108, 122, 137));
        pass.setColumns(20);
        pass.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        pass.setForeground(new java.awt.Color(228, 241, 254));
        pass.setRows(5);
        jScrollPane2.setViewportView(pass);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(10, 150, 500, 60);

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(236, 240, 241));
        jLabel14.setText("Q3: How do I know when was the last time I logged in?");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(10, 230, 500, 30);

        ustats.setEditable(false);
        ustats.setBackground(new java.awt.Color(108, 122, 137));
        ustats.setColumns(20);
        ustats.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        ustats.setForeground(new java.awt.Color(228, 241, 254));
        ustats.setRows(5);
        jScrollPane3.setViewportView(ustats);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(10, 260, 500, 60);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Visualize");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserProfileMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserProfileMouseMoved
        UserProfile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(108,122,137)));
    }//GEN-LAST:event_UserProfileMouseMoved

    private void UserProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserProfileMouseClicked
        this.setVisible(true);
    }//GEN-LAST:event_UserProfileMouseClicked

    private void UserProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserProfileMouseExited
        UserProfile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52,73,94)));
    }//GEN-LAST:event_UserProfileMouseExited

    private void SecuritySettingsMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SecuritySettingsMouseMoved
        SecuritySettings.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(108,122,137)));
    }//GEN-LAST:event_SecuritySettingsMouseMoved

    private void SecuritySettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SecuritySettingsMouseClicked
        Security sec = new Security();
        sec.setVisible(true);
        sec.pack();
        sec.setLocationRelativeTo(null);
        sec.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_SecuritySettingsMouseClicked

    private void SecuritySettingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SecuritySettingsMouseExited
        SecuritySettings.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52,73,94)));
    }//GEN-LAST:event_SecuritySettingsMouseExited

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

    private void SecuritySettings1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SecuritySettings1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_SecuritySettings1MouseMoved

    private void SecuritySettings1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SecuritySettings1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SecuritySettings1MouseClicked

    private void SecuritySettings1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SecuritySettings1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_SecuritySettings1MouseExited

    private void SecuritySettings2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SecuritySettings2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_SecuritySettings2MouseMoved

    private void SecuritySettings2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SecuritySettings2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SecuritySettings2MouseClicked

    private void SecuritySettings2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SecuritySettings2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_SecuritySettings2MouseExited

    private void HelpMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseMoved
        Help.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(108,122,137)));
    }//GEN-LAST:event_HelpMouseMoved

    private void HelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseClicked
        this.setVisible(true);
    }//GEN-LAST:event_HelpMouseClicked

    private void HelpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseExited
        Help.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52,73,94)));
    }//GEN-LAST:event_HelpMouseExited

    private void jLabelCloseMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseMoved

    }//GEN-LAST:event_jLabelCloseMouseMoved
    
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
            java.util.logging.Logger.getLogger(HelpVisualize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelpVisualize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelpVisualize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelpVisualize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelpVisualize().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Help;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel LogOut;
    private javax.swing.JLabel SecuritySettings;
    private javax.swing.JLabel SecuritySettings1;
    private javax.swing.JLabel SecuritySettings2;
    private javax.swing.JLabel UserProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea pass;
    private javax.swing.JTextArea prof;
    private javax.swing.JTextArea ustats;
    // End of variables declaration//GEN-END:variables
}
