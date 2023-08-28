
import static java.lang.System.exit;
//import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author choha
 */
public class loginframe extends javax.swing.JFrame {

    /**
     * Creates new form loginframe
     */
    public loginframe() {
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

        jLabel1 = new javax.swing.JLabel();
        juser = new java.awt.TextField();
        jLabel2 = new javax.swing.JLabel();
        jpass = new javax.swing.JPasswordField();
        jshow = new javax.swing.JCheckBox();
        jsubmit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jlabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jpanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setText("USER NAME");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 360, -1, -1));

        juser.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        juser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juserActionPerformed(evt);
            }
        });
        getContentPane().add(juser, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 420, 250, 30));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel2.setText("PASSWORD");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 490, -1, -1));

        jpass.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpassActionPerformed(evt);
            }
        });
        getContentPane().add(jpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 550, 250, 30));

        jshow.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jshow.setText("SHOW PASSWORD");
        jshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jshowActionPerformed(evt);
            }
        });
        getContentPane().add(jshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 640, 200, 20));

        jsubmit.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jsubmit.setText("LOGIN");
        jsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsubmitActionPerformed(evt);
            }
        });
        getContentPane().add(jsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 750, 120, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\choha\\Downloads\\cancle (2).jpeg")); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 310, 70, 40));

        jlabel1.setFont(new java.awt.Font("SansSerif", 3, 48)); // NOI18N
        jlabel1.setForeground(new java.awt.Color(51, 0, 51));
        jlabel1.setText("LOGIN FORM");
        getContentPane().add(jlabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, 340, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel7.setText("Forgot Password??");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 690, -1, -1));

        jpanel1.setBackground(new java.awt.Color(255, 102, 102));
        getContentPane().add(jpanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, 360, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\choha\\Downloads\\pu_2_1540x780 (1).jpg")); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 900));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsubmitActionPerformed

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
            String sql = "select * from pro where username=? and password=?";
            PreparedStatement st = con.prepareStatement(sql);
            if (juser.getText().equals("") && jpass.getText().equals("")) {
                //   juser.setText("USERNAME CANNOT BE EMPTY");
                //   jpass.setText("PASSWORD CANNOT BE EMPTY");
//       sleep(5000);
//         juser.setText("");
//        jpass.setText("");
                JOptionPane.showMessageDialog(null, "BUDDY BOTH FEILDS ARE EMPTY");
            } else if (juser.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "BUDDY PLS FILL USERNAME");
            } else if (jpass.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "BUDDY PLS FILL PASSWORD");
            } else {
                st.setString(1, juser.getText());
                st.setString(2, jpass.getText());
                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "USER NAME AND PASSWORD MATCHED WELL DONE");
                    String name = rs.getString("role");
                    if (name.equals("student")) {
                        homestudent ob = new homestudent();
                        String username = juser.getText();
                        ob.jtext1.setText(username.toUpperCase());
                        ob.jtext1.setEditable(false);
                        ob.setVisible(true);
                        setVisible(false);

                    } else {
                        String username1 = juser.getText();
                        homestaff set = new homestaff();
                        set.jtext.setText(username1.toUpperCase());
                        set.jtext.setEditable(false);
                        set.setVisible(true);
                        dispose();

                    }

                } else {
                    JOptionPane.showMessageDialog(null, "usser name and password do not matched TRY AGAIN");
                    juser.setText("");
                    jpass.setText("");
                }

            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(loginframe.class.getName()).log(Level.SEVERE, null, ex);
        }
//catch (InterruptedException ex) {
//            Logger.getLogger(loginframe.class.getName()).log(Level.SEVERE, null, ex);
//        }


    }//GEN-LAST:event_jsubmitActionPerformed

    private void jpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpassActionPerformed

    private void juserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_juserActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        int a = JOptionPane.showConfirmDialog(null, "DO YOU REALLY WANT TO EXIT", "CHOICE BUDDY", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            exit(0);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jshowActionPerformed
        if (jshow.isSelected()) {
            jpass.setEchoChar((char) 0);
        } else {
            jpass.setEchoChar('*');
        }


    }//GEN-LAST:event_jshowActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        jlabel1.setVisible(false);
        jpanel1.setVisible(false);
        forgetpasswordframe ol = new forgetpasswordframe();
        ol.setVisible(true);
//        setVisible(false);
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(loginframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jlabel1;
    public javax.swing.JPanel jpanel1;
    private javax.swing.JPasswordField jpass;
    private javax.swing.JCheckBox jshow;
    private javax.swing.JButton jsubmit;
    private java.awt.TextField juser;
    // End of variables declaration//GEN-END:variables
}
