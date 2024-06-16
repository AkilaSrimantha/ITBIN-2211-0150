/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import Model.DBConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Akila
 */
public class council extends javax.swing.JFrame {

  Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    public council() {
        initComponents();
     
        conn= DBConnector.connect();
         tableshow();
    }

  
       
     
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        nametx = new javax.swing.JTextField();
        agtxt = new javax.swing.JTextField();
        malebtn = new javax.swing.JRadioButton();
        febtn = new javax.swing.JRadioButton();
        gcbox = new javax.swing.JComboBox<>();
        stxt = new javax.swing.JTextField();
        htxt = new javax.swing.JTextField();
        etxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tatxt = new javax.swing.JTextField();
        sbtn = new javax.swing.JButton();
        ubtn = new javax.swing.JButton();
        dbtn = new javax.swing.JButton();
        hbtn = new javax.swing.JButton();
        idlbl = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setBackground(new java.awt.Color(51, 153, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("WELLCOME TO SUCCESS STUDENT COUNCIL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 52, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 11, -1, -1));

        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 138, -1, -1));

        jLabel3.setText("Age");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 170, -1, -1));

        jLabel4.setText("Gender");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel5.setText("Grade");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jLabel6.setText("Sports");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        jLabel7.setText("Hobby");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jLabel8.setText("Emails");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("ID");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        Table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 80, 530, 440));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, 140, 520));
        jPanel1.add(nametx, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 190, -1));
        jPanel1.add(agtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 190, -1));

        buttonGroup1.add(malebtn);
        malebtn.setText("Male");
        jPanel1.add(malebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        buttonGroup1.add(febtn);
        febtn.setText("Female");
        jPanel1.add(febtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        gcbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));
        jPanel1.add(gcbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));
        jPanel1.add(stxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 190, -1));
        jPanel1.add(htxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 190, -1));
        jPanel1.add(etxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 190, -1));

        jLabel10.setText("Talent");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));
        jPanel1.add(tatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 190, -1));

        sbtn.setText("Submit");
        sbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbtnActionPerformed(evt);
            }
        });
        jPanel1.add(sbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        ubtn.setText("Update");
        ubtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubtnActionPerformed(evt);
            }
        });
        jPanel1.add(ubtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, -1, -1));

        dbtn.setText("Delete");
        dbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbtnActionPerformed(evt);
            }
        });
        jPanel1.add(dbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, -1, -1));

        hbtn.setText("Home");
        hbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hbtnActionPerformed(evt);
            }
        });
        jPanel1.add(hbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, -1, -1));
        jPanel1.add(idlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 40, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-panel-of-experts-48.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 60, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbtnActionPerformed
       
        
        String namer;
         int age;
        String gender;
         int grad;
        String sport;
        String hobby;
        String email;
        String talent;
         
         
        namer=nametx.getText();
        age=Integer.parseInt(agtxt.getText());
        
         if(malebtn.isSelected()){
            gender="male";
        }
        else{
            
            gender="female";
            
        }
          grad=Integer.parseInt(gcbox.getSelectedItem().toString());
        sport=stxt.getText();
        hobby=htxt.getText();
        email=etxt.getText();
        talent=tatxt.getText();
       
        
       
        
       
        
          int up=JOptionPane.showConfirmDialog(null,"Do you want to Submit");
        try{
        
        String sql="INSERT INTO council(nam,age,gender,grade,sport,hobby,emails,talent)VALUE ('"+namer+"','"+age+"','"+gender+"','"+grad+"','"+sport+"','"+hobby+"','"+email+"','"+talent+"')";
        pst=conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Subbmit Success");
        setVisible(false);
        new council().setVisible(true);
        }
        
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        setVisible(false);
        new council().setVisible(true);
        
        }
    }//GEN-LAST:event_sbtnActionPerformed

    private void Table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table2MouseClicked
       tabledata();
    }//GEN-LAST:event_Table2MouseClicked

    private void dbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbtnActionPerformed
          int check=JOptionPane.showConfirmDialog(null,"Do you want to delete");
       
       if(check==0){
       
            String id=idlbl.getText();
            
           
           try {
               String sql="DELETE FROM council WHERE cid='"+id+"'";
                pst=conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Deleted Complete");
                setVisible(false);
        new council().setVisible(true);
                       
                       
           } catch (Exception e) {
               
                JOptionPane.showMessageDialog(null, "Not Founded");
                setVisible(false);
        new council().setVisible(true);
           }
       }
    }//GEN-LAST:event_dbtnActionPerformed

    private void hbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hbtnActionPerformed
       Main y2= new Main();  
            y2.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_hbtnActionPerformed

    private void ubtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubtnActionPerformed
       update();
    }//GEN-LAST:event_ubtnActionPerformed
     
    
    public void tableshow(){
    
        try {
            
            String sql="SELECT cid,nam,age,gender,grade,sport,hobby,emails,talent FROM council";
            pst=conn.prepareStatement(sql);           
            rs=pst.executeQuery();
            
            Table2.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,e);
        }
    
    
    
    }

    public void tabledata(){
    
    int r=Table2.getSelectedRow();
    
    String sid=Table2.getValueAt(r,0).toString();
    String name=Table2.getValueAt(r, 1).toString();
    String age=Table2.getValueAt(r, 2).toString();
    String gender=Table2.getValueAt(r, 3).toString();
    String grad=Table2.getValueAt(r, 4).toString();
    String sport=Table2.getValueAt(r, 5).toString();
    
    String hobby=Table2.getValueAt(r, 6).toString();
    String email=Table2.getValueAt(r, 7).toString();
    String talent=Table2.getValueAt(r, 8).toString();
    
    idlbl.setText(sid);
    nametx.setText(name);
    agtxt.setText(age);
    
    if (gender.equals("male")){
    
    malebtn.setSelected(true);
    }
    else{
    febtn.setSelected(true);
    
    }   
    gcbox.setSelectedItem(grad);
    stxt.setText(sport);
      htxt.setText(hobby);
        etxt.setText(email);
     tatxt.setText(talent);
    
    
    }
    
    
    
    

    
    public void update(){
    
    
    int r = Table2.getSelectedRow();

    String sid = idlbl.getText();
    String name = nametx.getText();
    String age = agtxt.getText();
    
    String gender = Table2.getValueAt(r,3).toString();
    if (malebtn.isSelected()) {
        gender = "male";
    }
    if (febtn.isSelected()) {
        gender = "female";
    }
       String grad = gcbox.getSelectedItem().toString();
       String sport = stxt.getText();
       String hobby = htxt.getText();
       String email = etxt.getText();
       String talent = tatxt.getText();
   

     int up=JOptionPane.showConfirmDialog(null,"Do you want to Update");
    try {
        String sql = "UPDATE council SET nam=?, age=?, gender=?, grade=?, sport=?, hobby=?, emails=?,talent=? WHERE cid=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, name);
        pst.setString(2, age);
        pst.setString(3, gender);
        pst.setString(4, grad);
        pst.setString(5, sport);
        pst.setString(6, hobby);
        pst.setString(7, email);
        pst.setString(8, talent);
        pst.setString(9, sid);
        pst.execute();

        JOptionPane.showMessageDialog(null, "Update Successfully");
        setVisible(false);
        new council().setVisible(true);
        
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Update Error: " + e.getMessage());
        setVisible(false);
        new council().setVisible(true);
        
    }
}
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
            java.util.logging.Logger.getLogger(council.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(council.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(council.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(council.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new council().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table2;
    private javax.swing.JTextField agtxt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton dbtn;
    private javax.swing.JTextField etxt;
    private javax.swing.JRadioButton febtn;
    private javax.swing.JComboBox<String> gcbox;
    private javax.swing.JButton hbtn;
    private javax.swing.JTextField htxt;
    private javax.swing.JLabel idlbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton malebtn;
    private javax.swing.JTextField nametx;
    private javax.swing.JButton sbtn;
    private javax.swing.JTextField stxt;
    private javax.swing.JTextField tatxt;
    private javax.swing.JButton ubtn;
    // End of variables declaration//GEN-END:variables
}
