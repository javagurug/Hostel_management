
public class employeframe extends javax.swing.JFrame {

    /**
     * Creates new form employeframe
     */
    public employeframe() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\choha\\Downloads\\cancle (2).jpeg")); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 70, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\choha\\Downloads\\employees (1).jpeg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 40));

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 3, 18)); // NOI18N
        jLabel3.setText("WARDEN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 100, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel4.setText("ASSISTENT WARDEN");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 210, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel5.setText("CLERK");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 90, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel6.setText("GUARD(DAY)");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 150, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel7.setText("SWEPPER");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 550, 110, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI Historic", 3, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BLOCK1", "BLOCK2", "BLOCK3" }));
        jComboBox1.setSelectedItem(null);
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 255));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 550, 140, 25));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 550, 180, 25));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel10.setText("GUARD(NIGHT)");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 160, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel11.setText("CANTEEN");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 110, -1));

        jLabel12.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 18)); // NOI18N
        jLabel12.setText("NAME");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 70, -1));

        jLabel13.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 18)); // NOI18N
        jLabel13.setText("MOBILE NUMBER");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, -1, -1));

        jLabel14.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 18)); // NOI18N
        jLabel14.setText("BOYS HOSTEL NO 4");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\choha\\Downloads\\warden.png")); // NOI18N
        jLabel15.setText("jLabel15");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 470, 130));

        jLabel16.setText("jLabel16");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 100, 100));

        jLabel17.setFont(new java.awt.Font("Showcard Gothic", 3, 18)); // NOI18N
        jLabel17.setText("GURPREET SINGH");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, 30));

        jLabel18.setFont(new java.awt.Font("Showcard Gothic", 3, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 255));
        jLabel18.setText(" 6284154345");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 120, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel19.setText("MESS");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 70, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel20.setText("KARANDEEP SINGH");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 200, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 102, 255));
        jLabel21.setText("8837833240");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 120, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel22.setText("PUTIN");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 110, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 102, 255));
        jLabel23.setText("7589459684");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 130, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel24.setText("RAMCHANDAR");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 160, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 102, 255));
        jLabel25.setText("7584692455");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 110, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel26.setText("NAVEEN");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 100, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 102, 255));
        jLabel27.setText("9687564854");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 120, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel28.setText("RAHUL");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 90, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 102, 255));
        jLabel29.setText("6854874568");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 110, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel30.setText("PREET");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, 80, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 102, 255));
        jLabel31.setText("8458456245");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, 110, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 380, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel33.setText("ELECTRICIAN");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, -1, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel34.setText("KISHOR");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, 150, 25));

        jLabel35.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(51, 102, 255));
        jLabel35.setText("9573874474");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 120, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon("C:\\Users\\choha\\Downloads\\pexels-codioful-(formerly-gradienta)-7130470 (1) (1).jpg")); // NOI18N
        jLabel32.setText("jLabel32");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setBounds(500, 150, 766, 620);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        // TODO add your handling code here:
//         if((String)jComboBox1.getSelectedItem()==null)
//        {
//            //jcombo1.removeActionListener(jcombo1);
//           // JOptionPane.showMessageDialog(null, "hlo");
//      
//        }
//         else
//         {
//             if(jComboBox1.getSelectedItem().equals("BLOCK1"))
//             {
//                 jLabel9.setText("RAM KISHOR");
//                 jLabel8.setText("6457884589");
//             }
//             else if(jComboBox1.getSelectedItem().equals("BLOCK2"))
//             {
//                 jLabel9.setText("NIKHIL");
//                 jLabel8.setText("74854584455");
//             }
//             else if(jComboBox1.getSelectedItem().equals("BLOCK3"))
//             {
//                 jLabel9.setText("CHIRAG PASWAN");
//                 jLabel8.setText("8458548621");
//             }
//         }
        
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
         if((String)jComboBox1.getSelectedItem()==null)
        {
            //jcombo1.removeActionListener(jcombo1);
           // JOptionPane.showMessageDialog(null, "hlo");
      
        }
         else
         {
             if(jComboBox1.getSelectedItem().equals("BLOCK1"))
             {
                 jLabel9.setText("RAM KISHOR");
                 jLabel8.setText("6457884589");
             }
             else if(jComboBox1.getSelectedItem().equals("BLOCK2"))
             {
                 jLabel9.setText("NIKHIL");
                 jLabel8.setText("74854584455");
             }
             else if(jComboBox1.getSelectedItem().equals("BLOCK3"))
             {
                 jLabel9.setText("CHIRAG PASWAN");
                 jLabel8.setText("8458548621");
             }
         }
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(employeframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employeframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employeframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employeframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employeframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
