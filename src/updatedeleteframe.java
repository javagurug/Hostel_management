import java.awt.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class updatedeleteframe extends javax.swing.JFrame {

    /**
     * Creates new form 
     */
    public updatedeleteframe() {
        initComponents();
         jlabel1.setVisible(false);
            jdate1.setVisible(false);
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
        jtext1 = new java.awt.TextField();
        jtext2 = new java.awt.TextField();
        jtext3 = new java.awt.TextField();
        jtext4 = new java.awt.TextField();
        jtext5 = new java.awt.TextField();
        jtext6 = new java.awt.TextField();
        jtext7 = new java.awt.TextField();
        jtext8 = new java.awt.TextField();
        jtext9 = new java.awt.TextField();
        jcombo1 = new javax.swing.JComboBox<>();
        jbutton1 = new javax.swing.JButton();
        jbutton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jcombo3 = new javax.swing.JComboBox<>();
        jtext10 = new java.awt.TextField();
        jtext11 = new java.awt.TextField();
        jtext12 = new java.awt.TextField();
        jlabel1 = new javax.swing.JLabel();
        jdate1 = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();

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
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 80, -1));

        jLabel2.setFont(new java.awt.Font("Stencil", 3, 18)); // NOI18N
        jLabel2.setText("ENTER STUDENT DETAILS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 250, 30));

        jtext1.setFont(new java.awt.Font("Courier New", 3, 18)); // NOI18N
        jtext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtext1ActionPerformed(evt);
            }
        });
        getContentPane().add(jtext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 70, -1));

        jtext2.setFont(new java.awt.Font("Courier New", 3, 18)); // NOI18N
        getContentPane().add(jtext2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 290, -1));

        jtext3.setFont(new java.awt.Font("Courier New", 3, 18)); // NOI18N
        jtext3.setText(" ");
        getContentPane().add(jtext3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 290, -1));

        jtext4.setFont(new java.awt.Font("Courier New", 3, 18)); // NOI18N
        jtext4.setText(" ");
        getContentPane().add(jtext4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 290, -1));

        jtext5.setFont(new java.awt.Font("Courier New", 3, 18)); // NOI18N
        jtext5.setText(" ");
        getContentPane().add(jtext5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 290, -1));

        jtext6.setFont(new java.awt.Font("Courier New", 3, 18)); // NOI18N
        jtext6.setText(" ");
        getContentPane().add(jtext6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 290, -1));

        jtext7.setFont(new java.awt.Font("Courier New", 3, 18)); // NOI18N
        jtext7.setText(" ");
        getContentPane().add(jtext7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 290, -1));

        jtext8.setFont(new java.awt.Font("Courier New", 3, 18)); // NOI18N
        jtext8.setText(" ");
        getContentPane().add(jtext8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 290, -1));

        jtext9.setFont(new java.awt.Font("Courier New", 3, 18)); // NOI18N
        jtext9.setText(" ");
        jtext9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtext9ActionPerformed(evt);
            }
        });
        getContentPane().add(jtext9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 290, -1));

        jcombo1.setSelectedItem(null);
        jcombo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcombo1MouseClicked(evt);
            }
        });
        jcombo1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jcombo1ComponentShown(evt);
            }
        });
        jcombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcombo1ActionPerformed(evt);
            }
        });
        getContentPane().add(jcombo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 100, -1));

        jbutton1.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jbutton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\choha\\Downloads\\update (1).jpg")); // NOI18N
        jbutton1.setText("UPDATE");
        jbutton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbutton1MouseClicked(evt);
            }
        });
        jbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbutton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 590, -1, -1));

        jbutton2.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jbutton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\choha\\Downloads\\sp (1).jpeg")); // NOI18N
        jbutton2.setText("CLEAR");
        jbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbutton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 590, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel3.setText("HOSTEL ROLL NUMBER");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 230, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel4.setText("NAME");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 150, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel5.setText("FATHER NAME");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 130, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel6.setText("MOTHER NAME");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 190, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel7.setText("EMAIL ID");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 130, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel8.setText("AADHAAR NUMBER");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 190, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel9.setText("ROOM NUMBER");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 180, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel10.setText("MOBILE NUMBER");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 190, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel11.setText("DEPARTMENT");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 150, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel12.setText("PERMANENT ADDRESS");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 200, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\choha\\Downloads\\st (1).jpeg")); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 60));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel14.setText("BLOCK NUMBER");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel15.setText("DOB");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 190, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel16.setText("ROOM STATUS");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, -1, -1));

        jButton1.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\choha\\Downloads\\leaved (1).jpeg")); // NOI18N
        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 590, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\choha\\Downloads\\search (1).jpeg")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 40, 30));

        jcombo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcombo3ActionPerformed(evt);
            }
        });
        getContentPane().add(jcombo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 520, 290, -1));

        jtext10.setFont(new java.awt.Font("Courier New", 3, 18)); // NOI18N
        getContentPane().add(jtext10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, 290, -1));

        jtext11.setFont(new java.awt.Font("Courier New", 3, 18)); // NOI18N
        getContentPane().add(jtext11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 290, -1));

        jtext12.setFont(new java.awt.Font("Courier New", 3, 14)); // NOI18N
        getContentPane().add(jtext12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 90, -1));

        jlabel1.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jlabel1.setText("DATE OF LEAIVNG");
        getContentPane().add(jlabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, 180, 25));

        jdate1.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(jdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 560, 120, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\choha\\Downloads\\pexels-codioful-(formerly-gradienta)-7130470 (1) (1).jpg")); // NOI18N
        jLabel18.setText("jLabel18");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setBounds(500, 150, 780, 640);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jtext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtext1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtext1ActionPerformed

    private void jtext9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtext9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtext9ActionPerformed

    private void jcombo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcombo1MouseClicked
        // TODO add your handling code here:
        // jComboBox1.removeAllItems();
    }//GEN-LAST:event_jcombo1MouseClicked

    private void jcombo1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jcombo1ComponentShown
        // TODO add your handling code here:
        //roomnumber();
    }//GEN-LAST:event_jcombo1ComponentShown

    private void jcombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcombo1ActionPerformed
    }//GEN-LAST:event_jcombo1ActionPerformed

    private void jbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton1ActionPerformed
        jlabel1.setVisible(false);
            jdate1.setVisible(false);
        try {
            String hrno = jtext1.getText();
            String joiningdate = jtext12.getText();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date11 = sdf.parse(joiningdate);
            java.sql.Date sp = new java.sql.Date(date11.getTime());
            String name = jtext2.getText();
            String fathername = jtext3.getText();
            String mothername = jtext4.getText();
            String dob = jtext11.getText();
            Date date1 = sdf.parse(dob);
            java.sql.Date sp1 = new java.sql.Date(date1.getTime());
            String email = jtext5.getText();
            String mobilenumber = jtext6.getText();
            String department = jtext7.getText();
            String address = jtext8.getText();
            String adhar = jtext9.getText();
            String block = (String) jcombo1.getItemAt(0);
            String room = jtext10.getText();
            String status = (String) jcombo3.getSelectedItem();
            System.out.println(status);
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection cot = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
                Statement st = cot.createStatement();

                if (status.equals("LIVING")) {
                    String updateQuery = "UPDATE " + block + " SET roomstatus = 'BOOKED' WHERE number = '" + room + "'";
                    st.executeUpdate(updateQuery);
                PreparedStatement pt = cot.prepareStatement("update student set joiningdate=?,name=?,fathername=?,mothername=?,dob=?,email=?,mobilenumber=?,department=?,address=?,adhar=?,block=?,room=?,status=?,leaved=? where hrno=?");
              //  JOptionPane.showMessageDialog(null, "updated successfully");
                pt.setDate(1, (java.sql.Date) sp);
                pt.setString(2, name);
                pt.setString(3, fathername);
                pt.setString(4, mothername);
                pt.setDate(5, (java.sql.Date) sp1);
                pt.setString(6, email);
                pt.setString(7, mobilenumber);
                pt.setString(8, department);
                pt.setString(9, address);
                pt.setString(10, adhar);
                pt.setString(11, block);
                pt.setString(12, room);
                pt.setString(13, status);
                // JOptionPane.showMessageDialog(null, "updated successfully");
                pt.setDate(14, null);
                pt.setString(15, hrno);
                pt.executeUpdate();
                JOptionPane.showMessageDialog(null, "updated successfully");
                jtext1.setText("");
                jtext2.setText("");
                jtext3.setText("");
                jtext4.setText("");
                jtext5.setText("");
                jtext6.setText("");
                jtext7.setText("");
                jtext8.setText("");
                jtext9.setText("");
                jcombo1.removeAllItems();
                jcombo3.removeAllItems();
                jtext10.setText("");
                jtext11.setText("");
                jtext12.setText("");
                jlabel1.setVisible(false);
                jdate1.setVisible(false);
                jtext1.setEditable(true);
                
                } 
                else
                {
                    String updateQuery1 = "UPDATE " + block + " SET roomstatus = 'NOTBOOKED' WHERE number = '" + room + "'";
                    st.executeUpdate(updateQuery1);
                    //JOptionPane.showMessageDialog(null, "updated successfully");
                PreparedStatement pt = cot.prepareStatement("update student set joiningdate=?,name=?,fathername=?,mothername=?,dob=?,email=?,mobilenumber=?,department=?,address=?,adhar=?,block=?,room=?,status=?,leaved=? where hrno=?");
                //JOptionPane.showMessageDialog(null, "updated successfully");
                pt.setDate(1, (java.sql.Date) sp);
                pt.setString(2, name);
                pt.setString(3, fathername);
                pt.setString(4, mothername);
                pt.setDate(5, (java.sql.Date) sp1);
                pt.setString(6, email);
                pt.setString(7, mobilenumber);
                pt.setString(8, department);
                pt.setString(9, address);
                pt.setString(10, adhar);
                pt.setString(11, block);
                pt.setString(12, room);
                pt.setString(13, status);
                // JOptionPane.showMessageDialog(null, "updated successfully");
                 Date joiningdate1 = jdate1.getDate();
        Date joit=new java.sql.Date(joiningdate1.getTime());
                pt.setDate(14, (java.sql.Date)joit);
                pt.setString(15, hrno);
                pt.executeUpdate();
                JOptionPane.showMessageDialog(null, "updated successfully");
                jtext1.setText("");
                jtext2.setText("");
                jtext3.setText("");
                jtext4.setText("");
                jtext5.setText("");
                jtext6.setText("");
                jtext7.setText("");
                jtext8.setText("");
                jtext9.setText("");
                jcombo1.removeAllItems();
                jcombo3.removeAllItems();
                jtext10.setText("");
                jtext11.setText("");
                jtext12.setText("");
                jlabel1.setVisible(false);
                jdate1.setVisible(false);
                jtext1.setEditable(true);

            } 
                
                
            }catch (ClassNotFoundException | SQLException e) {

            }

        } catch (ParseException ex) {
            Logger.getLogger(updatedeleteframe.class.getName()).log(Level.SEVERE, null, ex);

        }

    }//GEN-LAST:event_jbutton1ActionPerformed

    private void jbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton2ActionPerformed
        jtext1.setEditable(true);
        jtext1.setText("");
        jtext2.setText("");
        jtext3.setText("");
        jtext4.setText("");
        jtext5.setText("");
        jtext6.setText("");
        jtext7.setText("");
        jtext8.setText("");
        jtext9.setText("");
        jcombo3.setSelectedItem(null);
        jcombo1.setSelectedItem(null);
        
        jlabel1.setVisible(false);
       // jdate1.setVisible(false);
        jdate1.disable();
        JOptionPane.showMessageDialog(null,"CLEARED");
           
           
        // jComboBox1.setSelectedItem(null);
//        jdate1.setDate(null);
        // jdate2.setDate(null);

    }//GEN-LAST:event_jbutton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String hrno = jtext1.getText();
        //System.out.println(hrno);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cot = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
            Statement st1 = cot.createStatement();
            ResultSet rt = st1.executeQuery("Select *from student where hrno='" + hrno + "'");
            jtext1.setEditable(false);
            if (rt.next()) {
                //jtext1.setEditable(false);
                java.sql.Date date2 = rt.getDate("joiningdate");
                jtext12.setText(date2.toString());
                // jdate1.setDate(rt.getDate(2));
                jtext2.setText(rt.getString(3));
                jtext3.setText(rt.getString(4));
                jtext4.setText(rt.getString(5));
                java.sql.Date date1 = rt.getDate("dob");
                System.out.println(date1);
                jtext11.setText(date1.toString());
                jtext5.setText(rt.getString(7));
                jtext6.setText(rt.getString(8));
                jtext7.setText(rt.getString(9));
                jtext8.setText(rt.getString(10));
                jtext9.setText(rt.getString(11));
                if (rt.getString(12).equals("block1")) {
                    jcombo1.addItem("block1");
                   
                } else if (rt.getString(12).equals("block2")) {
                    jcombo1.addItem("block2");
                   
                } else {
                    jcombo1.addItem("block3");
                   
                }
                jtext10.setText(rt.getString(13));
                if (rt.getString(14).equals("LIVING")) {
                    jcombo3.addItem("LIVING");
                    jcombo3.addItem("LEAVED");
                } else {
                    jcombo3.addItem("LEAVED");
                    jcombo3.addItem("LIVING");
                }
            } else {
                JOptionPane.showMessageDialog(null, "STUDENT DO NOT EXIT");
                jtext1.setEditable(true);
            }
        } catch (ClassNotFoundException | SQLException e) {

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jlabel1.setVisible(false);
            jdate1.setVisible(false);
        String hrno = jtext1.getText();
        String room = jtext10.getText();
        String block=(String)jcombo1.getItemAt(0);
        try
        {
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cot = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
            Statement st=cot.createStatement();
            st.executeUpdate("delete from student where hrno='"+hrno+"'");
                        JOptionPane.showMessageDialog(null, "SUCCESSFULLY DELETED");

            String ud = "UPDATE " + block + " SET roomstatus = 'NOTBOOKED' WHERE number = '" + room + "'";
            st.executeUpdate(ud);
            JOptionPane.showMessageDialog(null, "SUCCESSFULLY DELETED");
             jtext1.setText("");
                jtext2.setText("");
                jtext3.setText("");
                jtext4.setText("");
                jtext5.setText("");
                jtext6.setText("");
                jtext7.setText("");
                jtext8.setText("");
                jtext9.setText("");
                jcombo1.removeAllItems();
                jcombo3.removeAllItems();
                jtext10.setText("");
                jtext11.setText("");
                jtext12.setText("");

        }
        catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcombo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcombo3ActionPerformed
        // TODO add your handling code here:
        
        if((String)jcombo1.getSelectedItem()==null)
        {
            //jcombo1.removeActionListener(jcombo1);
           // JOptionPane.showMessageDialog(null, "hlo");
      
        }
       else
        {
               if(jcombo3.getSelectedItem().equals("LEAVED"))
        {
            jlabel1.setVisible(true);
            jdate1.setVisible(true);
        }
        else if(jcombo3.getSelectedItem().equals("LIVING"))
        {
            
            jlabel1.setVisible(false);
            jdate1.setVisible(false);
            jdate1.disable();
        }   
        }
    }//GEN-LAST:event_jcombo3ActionPerformed

    private void jbutton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbutton1MouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jbutton1MouseClicked

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
            java.util.logging.Logger.getLogger(updatedeleteframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updatedeleteframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updatedeleteframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updatedeleteframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updatedeleteframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbutton1;
    private javax.swing.JButton jbutton2;
    public javax.swing.JComboBox<String> jcombo1;
    private javax.swing.JComboBox<String> jcombo3;
    private com.toedter.calendar.JDateChooser jdate1;
    private javax.swing.JLabel jlabel1;
    private java.awt.TextField jtext1;
    private java.awt.TextField jtext10;
    private java.awt.TextField jtext11;
    private java.awt.TextField jtext12;
    public java.awt.TextField jtext2;
    private java.awt.TextField jtext3;
    private java.awt.TextField jtext4;
    private java.awt.TextField jtext5;
    private java.awt.TextField jtext6;
    private java.awt.TextField jtext7;
    private java.awt.TextField jtext8;
    private java.awt.TextField jtext9;
    // End of variables declaration//GEN-END:variables

    private Date Date(long time) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String setDate(Date date) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
