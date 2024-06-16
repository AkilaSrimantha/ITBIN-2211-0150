/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Akila
 */
import Model.DBConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class Database extends javax.swing.JFrame {

  Connection conn=null;
  PreparedStatement pst=null;
  ResultSet rs=null;
  
    public Database() {
        initComponents();
        conn=DBConnector.connect();
        tableshow();
    }
    
    public void tableshow(){
    
        try {
            
            String sql="SELECT sid,name,age,address,phone,gender,lan,religon FROM register";
            pst=conn.prepareStatement(sql);           
            rs=pst.executeQuery();
            
            Table1.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,e);
        }
    
    
    
    }

    public void tabledata(){
    
    int r=Table1.getSelectedRow();
    
    String sid=Table1.getValueAt(r,0).toString();
    String name=Table1.getValueAt(r, 1).toString();
    String age=Table1.getValueAt(r, 2).toString();
    String address=Table1.getValueAt(r, 3).toString();
    String phone=Table1.getValueAt(r, 4).toString();
    
    String lan=Table1.getValueAt(r, 6).toString();
    String religion=Table1.getValueAt(r, 7).toString();
    
    idbox.setText(sid);
    namebox.setText(name);
    agebox.setText(age);
    addbox.setText(address);
    pnbox.setText(phone);
    String gender=Table1.getValueAt(r,5).toString();
    if (gender.equals("male")){
    
    malebtn.setSelected(true);
    }
    else{
    femalebtn.setSelected(true);
    
    }    
    mbox.setSelectedItem(lan);
    rebox.setSelectedItem(religion);
    
    }
    
    
    
    public void search(){
    
    String g=searchbtn.getText();
    
        try {
            String sql ="SELECT * FROM register WHERE name LIKE'%"+g+"%' OR sid LIKE '%"+g+"%'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            Table1.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,e);
        }
    
    
    }

    
    public void update(){
    
    
    int r = Table1.getSelectedRow();

    String sid = idbox.getText();
    String name = namebox.getText();
    String age = agebox.getText();
    String addres = addbox.getText();
    String phone = pnbox.getText();
    String gender = Table1.getValueAt(r, 5).toString();
    if (malebtn.isSelected()) {
        gender = "male";
    }
    if (femalebtn.isSelected()) {
        gender = "female";
    }

    String lan = mbox.getSelectedItem().toString();
    String religon = rebox.getSelectedItem().toString();

     int up=JOptionPane.showConfirmDialog(null,"Do you want to Update");
    try {
        String sql = "UPDATE register SET name=?, age=?, address=?, phone=?, gender=?, lan=?, religon=? WHERE sid=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, name);
        pst.setString(2, age);
        pst.setString(3, addres);
        pst.setString(4, phone);
        pst.setString(5, gender);
        pst.setString(6, lan);
        pst.setString(7, religon);
        pst.setString(8, sid);
        pst.execute();

        JOptionPane.showMessageDialog(null, "Update Successfully");
        setVisible(false);
        new Database().setVisible(true);
        
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Update Error: " + e.getMessage());
        setVisible(false);
        new Database().setVisible(true);
        
    }
}

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        updatebtn = new javax.swing.JButton();
        delbtn = new javax.swing.JButton();
        searchbtn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        namebox = new javax.swing.JTextField();
        agebox = new javax.swing.JTextField();
        addbox = new javax.swing.JTextField();
        pnbox = new javax.swing.JTextField();
        malebtn = new javax.swing.JRadioButton();
        femalebtn = new javax.swing.JRadioButton();
        jButton5 = new javax.swing.JButton();
        mbox = new javax.swing.JComboBox<>();
        rebox = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        idbox = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table1.setBackground(new java.awt.Color(204, 255, 204));
        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "sid", "name", "age", "address", "phone", "gender", "lan", "religon"
            }
        ));
        Table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 521, 904, 136));

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));

        jLabel1.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        jLabel1.setText("DATA BASE IN REGISTRATION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 450, 70));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        updatebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-update-ezgif.com-resize.gif"))); // NOI18N
        updatebtn.setText("UPDATE");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel3.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 110, -1));

        delbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-delete-30.png"))); // NOI18N
        delbtn.setText("DELETE");
        delbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delbtnActionPerformed(evt);
            }
        });
        jPanel3.add(delbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        searchbtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchbtnKeyReleased(evt);
            }
        });
        jPanel3.add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 179, 29));

        jLabel2.setText("Search");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 70, -1));

        jLabel3.setText("Name");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 141, -1, -1));

        jLabel5.setText("Age");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel6.setText("Address");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel7.setText("Phone Number");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel8.setText("Gender");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel9.setText("Medium");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jLabel10.setText("Religon");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));
        jPanel3.add(namebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 180, -1));
        jPanel3.add(agebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 180, -1));
        jPanel3.add(addbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 180, -1));
        jPanel3.add(pnbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 180, -1));

        gender.add(malebtn);
        malebtn.setText("Male");
        malebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                malebtnActionPerformed(evt);
            }
        });
        jPanel3.add(malebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        gender.add(femalebtn);
        femalebtn.setText("Female");
        jPanel3.add(femalebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon/icons8-back-94-ezgif.com-resize (1).png"))); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, -1, -1));

        mbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sinhala", "Tamil", "English" }));
        jPanel3.add(mbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        rebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buddhist", "Hindu", "Islam", "Christian" }));
        jPanel3.add(rebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon/icons8-cancel-48 (1).png"))); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 110, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Student ID");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        idbox.setText("ID");
        jPanel3.add(idbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 76, 582, 427));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         this.setVisible(false);   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
       update();
    }//GEN-LAST:event_updatebtnActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Main y2= new Main();  
            y2.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void Table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table1MouseClicked
       tabledata();
    }//GEN-LAST:event_Table1MouseClicked

    private void malebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_malebtnActionPerformed
               
    }//GEN-LAST:event_malebtnActionPerformed

    private void searchbtnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchbtnKeyReleased
        search();
    }//GEN-LAST:event_searchbtnKeyReleased

    private void delbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delbtnActionPerformed
       int check=JOptionPane.showConfirmDialog(null,"Do you want to delete");
       
       if(check==0){
       
            String id=idbox.getText();
            
           
           try {
               String sql="DELETE FROM register WHERE sid='"+id+"'";
                pst=conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Deleted Complete");
                setVisible(false);
        new Database().setVisible(true);
                       
                       
           } catch (Exception e) {
               
                JOptionPane.showMessageDialog(null, "Not Founded");
                setVisible(false);
        new Database().setVisible(true);
           }
       
       
       }
       
       tabledata();
       
       
    }//GEN-LAST:event_delbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Database().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table1;
    private javax.swing.JTextField addbox;
    private javax.swing.JTextField agebox;
    private javax.swing.JButton delbtn;
    private javax.swing.JRadioButton femalebtn;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JLabel idbox;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton malebtn;
    private javax.swing.JComboBox<String> mbox;
    private javax.swing.JTextField namebox;
    private javax.swing.JTextField pnbox;
    private javax.swing.JComboBox<String> rebox;
    private javax.swing.JTextField searchbtn;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
