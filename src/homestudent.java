
import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import static java.lang.System.exit;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author choha
 */
public class homestudent extends javax.swing.JFrame {

    /**
     * Creates new form homestudent
     */
    public homestudent() {
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

        jButton1 = new javax.swing.JButton();
        jtext1 = new java.awt.TextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1920, 1000));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\choha\\Downloads\\search (1).jpeg")); // NOI18N
        jButton1.setText("CLICK FOR OFFICIAL SITE OF HOSTEL OF PU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        jtext1.setFont(new java.awt.Font("Ebrima", 3, 24)); // NOI18N
        jtext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtext1ActionPerformed(evt);
            }
        });
        getContentPane().add(jtext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 150, 30));
        jtext1.getAccessibleContext().setAccessibleName("");
        jtext1.getAccessibleContext().setAccessibleDescription("");

        jButton2.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jButton2.setText("ROOM");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 190, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jButton3.setText("STUDENT FEES");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 190, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jButton4.setText("STUDENT LIVING");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        jButton5.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jButton5.setText("SEARCH ROOM");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 190, -1));

        jButton6.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jButton6.setText("MESS CHARGES");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 190, -1));

        jButton7.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jButton7.setText("EMPLOYES");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 190, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\choha\\Downloads\\room (1).jpeg")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 37, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\choha\\Downloads\\fees (1).jpeg")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 37, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\choha\\Downloads\\living (1).jpeg")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 37, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\choha\\Downloads\\search (1).jpeg")); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 37, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\choha\\Downloads\\mess (1).jpeg")); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 423, 40, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\choha\\Downloads\\employees (1).jpeg")); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 37, -1));

        jButton8.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jButton8.setText("STUDENT HEADS");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\choha\\Downloads\\student (1).jpeg")); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 37, -1));

        jButton9.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jButton9.setText("SPORTS");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 600, 190, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\choha\\Downloads\\sp (1).jpeg")); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 43, -1));

        jButton10.setFont(new java.awt.Font("Showcard Gothic", 3, 24)); // NOI18N
        jButton10.setText("ABOUT");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 730, 120, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\choha\\Downloads\\about (1).jpeg")); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 730, 43, 40));

        jButton11.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon("C:\\Users\\choha\\Downloads\\logout (2).jpeg")); // NOI18N
        jButton11.setText("LOGOUT");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 20, 190, 50));

        jButton12.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon("C:\\Users\\choha\\Downloads\\cancle (2).jpeg")); // NOI18N
        jButton12.setText("EXIT");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1333, 22, 160, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\choha\\Downloads\\hostel (1).jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1530, 940));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        jButton9.setForeground(Color.MAGENTA);
jButton9.setBackground(Color.LIGHT_GRAY);
sportsframe ut=new sportsframe();
ut.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jButton4.setForeground(Color.MAGENTA);
jButton4.setBackground(Color.LIGHT_GRAY);
studentlivingframe ol=new studentlivingframe();
ol.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jButton8.setForeground(Color.MAGENTA);
jButton8.setBackground(Color.LIGHT_GRAY);
studentheadframe oo=new studentheadframe();
oo.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jtext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtext1ActionPerformed
    }//GEN-LAST:event_jtext1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jButton6.setForeground(Color.MAGENTA);
jButton6.setBackground(Color.LIGHT_GRAY);
messframe of=new messframe();
of.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jButton7.setForeground(Color.MAGENTA);
jButton7.setBackground(Color.LIGHT_GRAY);
employeframe ui=new employeframe();
ui.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
         jButton1.setForeground(new JButton().getForeground());
        jButton1.setBackground(new JButton().getBackground());
        
        jButton2.setForeground(new JButton().getForeground());
        jButton2.setBackground(new JButton().getBackground());
        
        jButton3.setForeground(new JButton().getForeground());
        jButton3.setBackground(new JButton().getBackground());
        
        jButton4.setForeground(new JButton().getForeground());
        jButton4.setBackground(new JButton().getBackground());
        
        jButton5.setForeground(new JButton().getForeground());
        jButton5.setBackground(new JButton().getBackground());
        
        jButton6.setForeground(new JButton().getForeground());
        jButton6.setBackground(new JButton().getBackground());
        
        jButton7.setForeground(new JButton().getForeground());
        jButton7.setBackground(new JButton().getBackground());
        
        jButton8.setForeground(new JButton().getForeground());
        jButton8.setBackground(new JButton().getBackground());
        
        
        jButton9.setForeground(new JButton().getForeground());
        jButton9.setBackground(new JButton().getBackground());
        
        jButton10.setForeground(new JButton().getForeground());
        jButton10.setBackground(new JButton().getBackground());
        
        jButton11.setForeground(new JButton().getForeground());
        jButton11.setBackground(new JButton().getBackground());
        
        jButton12.setForeground(new JButton().getForeground());
        jButton12.setBackground(new JButton().getBackground());
        
      
    }//GEN-LAST:event_formWindowGainedFocus

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jButton2.setForeground(Color.MAGENTA);
jButton2.setBackground(Color.LIGHT_GRAY);
studentroomframe ot=new studentroomframe();
ot.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jButton3.setForeground(Color.MAGENTA);
jButton3.setBackground(Color.LIGHT_GRAY);

studentfees ot1=new studentfees(); 
ot1.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jButton5.setForeground(Color.MAGENTA);
jButton5.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
         jButton11.setForeground(Color.MAGENTA);
jButton11.setBackground(Color.GREEN);
        int b=JOptionPane.showConfirmDialog(null, "HAVE A GOOD DAY !!!", "SELECT", JOptionPane.YES_NO_OPTION);
if(b==0)
{
    loginframe obj=new loginframe();
    obj.setVisible(true);
    dispose();
}
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        // TODO add your handling code here:
         int a = JOptionPane.showConfirmDialog(null, "DO YOU REALLY WANT TO EXIT", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            exit(0);
        }
    }//GEN-LAST:event_jButton12MouseClicked

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
           jButton10.setForeground(Color.RED);
       jButton10.setBackground(Color.PINK);
   aboutframe obj1=new aboutframe();
   obj1.setVisible(true);
   
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
               jButton1.setForeground(Color.BLUE);
jButton1.setBackground(Color.PINK);
 String url="https://hostels.puchd.ac.in";
try
{
    Desktop.getDesktop().browse(java.net.URI.create(url));
}   
catch (IOException e) {
            JOptionPane.showMessageDialog(null,"wrong url"+e , "mesage",JOptionPane.ERROR_MESSAGE );
}
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(homestudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homestudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homestudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homestudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homestudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public java.awt.TextField jtext1;
    // End of variables declaration//GEN-END:variables
}