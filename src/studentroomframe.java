
import java.awt.Color;
import javax.swing.JButton;
/**
 *
 * @author choha
 */
public class studentroomframe extends javax.swing.JFrame {

    /**
     * Creates new form studentroomframe
     */
    public studentroomframe() {
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

        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\choha\\Downloads\\pexels-codioful-(formerly-gradienta)-7130470 (1).jpg")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Stencil", 3, 24)); // NOI18N
        jButton1.setText("BLOCK  1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 235, -1, -1));

        jButton2.setFont(new java.awt.Font("Stencil", 3, 24)); // NOI18N
        jButton2.setText("BLOCK  2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 311, -1, -1));

        jButton3.setFont(new java.awt.Font("Stencil", 3, 24)); // NOI18N
        jButton3.setText("BLOCK  3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        jLabel1.setText("CHOSE BLOCK NUMBER  :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 151, 252, -1));

        jLabel2.setFont(new java.awt.Font("Snap ITC", 3, 24)); // NOI18N
        jLabel2.setText("BOYS HOSTEL NUMBER 4");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 19, 401, 43));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\choha\\Downloads\\block (1).jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 50, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\choha\\Downloads\\block (1).jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 50, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\choha\\Downloads\\block (1).jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 50, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\choha\\Downloads\\hostel (3) (1).jpg")); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 110, 60));

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\choha\\Downloads\\cancle (2).jpeg")); // NOI18N
        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 70, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\choha\\Downloads\\pexels-codioful-(formerly-gradienta)-7130470 (1).jpg")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 760, 540));

        setBounds(500, 150, 740, 500);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jButton1.setForeground(Color.red);
        jButton1.setBackground(Color.PINK);
        //sleep(4000);
        studentblock1frame obj=new studentblock1frame();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jButton2.setForeground(Color.red);
        jButton2.setBackground(Color.PINK);
        studentblock2frame obj=new studentblock2frame();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jButton3.setForeground(Color.red);
        jButton3.setBackground(Color.PINK);
       studentblock3frame oy=new studentblock3frame();
        oy.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
         jButton1.setForeground(new JButton().getForeground());
        jButton1.setBackground(new JButton().getForeground());
        
        jButton2.setForeground(new JButton().getForeground());
        jButton2.setBackground(new JButton().getBackground());
        
         jButton3.setForeground(new JButton().getForeground());
        jButton3.setBackground(new JButton().getBackground());
    }//GEN-LAST:event_formWindowGainedFocus

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
            java.util.logging.Logger.getLogger(studentroomframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentroomframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentroomframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentroomframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentroomframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
