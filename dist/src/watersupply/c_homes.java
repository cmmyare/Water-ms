/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watersupply;

import java.awt.Color;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Abdullahi Dere
 */
public class c_homes extends javax.swing.JFrame {
     Codes co = new Codes();
     public void display(){
    //co.viewTable(Table, "select * from customer_homes");
    }
    String id = null;
    String cusNo;
    String HmNum;
    String date;
    
    
    public void clear(){
        String Select = "Select One";
    cus_no.setSelectedItem(Select); ho_no.setSelectedItem(Select);
    reg_date.setDate(null);
    watch.setText("");watch_star.setText("");service.setSelectedItem(Select);
    }

    /**
     * Creates new form c_homes
     */
    public c_homes() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Csutomer Registration");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //display();
        String sql = "SELECT concat(people_no,',',name)as peoName FROM people ORDER by people_no ASC";
        String sql1 = "SELECT h_no from  homes   ORDER by h_no asc";
        String sql2 = "SELECT ser_name FROM services";
        String col = "peoName";
        String col1 = "h_no";
        String col2 = "ser_name";
        co.updateComo(cus_no,sql,col);
        co.updateComo(ho_no,sql1,col1);
        co.updateComo(service,sql2,col2);
        
        // Date
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cus_no = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ho_no = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        watch = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        watch_star = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        service = new javax.swing.JComboBox<>();
        clear = new javax.swing.JButton();
        save = new javax.swing.JButton();
        update1 = new javax.swing.JButton();
        delet = new javax.swing.JButton();
        ser = new javax.swing.JButton();
        serTex = new javax.swing.JTextField();
        reg_date = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(23, 127, 117));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Register New Customer Home");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        cus_no.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One" }));
        cus_no.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cus_noItemStateChanged(evt);
            }
        });
        cus_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cus_noActionPerformed(evt);
            }
        });
        jPanel1.add(cus_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 227, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("cus_no");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Home_No");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, -1, -1));

        ho_no.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One" }));
        ho_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ho_noActionPerformed(evt);
            }
        });
        jPanel1.add(ho_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 170, 227, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("reg_date");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("watch");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 164, -1));

        watch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                watchActionPerformed(evt);
            }
        });
        jPanel1.add(watch, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 260, 220, 38));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("watch_start");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));
        jPanel1.add(watch_star, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 227, 38));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("service");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, -1, -1));

        service.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One" }));
        service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceActionPerformed(evt);
            }
        });
        jPanel1.add(service, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 360, 227, 40));

        clear.setBackground(new java.awt.Color(204, 204, 204));
        clear.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        clear.setForeground(new java.awt.Color(0, 51, 51));
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 139, 51));

        save.setBackground(new java.awt.Color(204, 204, 204));
        save.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        save.setForeground(new java.awt.Color(0, 51, 51));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 139, 51));

        update1.setBackground(new java.awt.Color(204, 204, 204));
        update1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        update1.setForeground(new java.awt.Color(0, 51, 51));
        update1.setText("Update");
        update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update1ActionPerformed(evt);
            }
        });
        jPanel1.add(update1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 139, 51));

        delet.setBackground(new java.awt.Color(204, 204, 204));
        delet.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        delet.setForeground(new java.awt.Color(0, 51, 51));
        delet.setText("Delete");
        delet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletActionPerformed(evt);
            }
        });
        jPanel1.add(delet, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 139, 51));

        ser.setBackground(new java.awt.Color(204, 204, 204));
        ser.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ser.setForeground(new java.awt.Color(0, 51, 51));
        ser.setText("Search");
        ser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serActionPerformed(evt);
            }
        });
        jPanel1.add(ser, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, 139, 53));

        serTex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serTexActionPerformed(evt);
            }
        });
        jPanel1.add(serTex, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 30, 165, 50));
        jPanel1.add(reg_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 240, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cus_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_noActionPerformed
        // TODO add your handling code here:
        String array[] = cus_no.getSelectedItem().toString().split(",");
        cusNo = array[0];
    }//GEN-LAST:event_cus_noActionPerformed

    private void ho_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ho_noActionPerformed
        String array[] = ho_no.getSelectedItem().toString().split(",");
        HmNum = array[0];
    }//GEN-LAST:event_ho_noActionPerformed

    private void serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_serviceActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
      clear();
    }//GEN-LAST:event_clearActionPerformed

    private void watchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_watchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_watchActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        if(cus_no.getSelectedItem().equals("Select One") || ho_no.getSelectedItem().equals("Select One")|| service.getSelectedItem().equals("Select One") || watch.getText().equals("") || watch_star.getText().equals("") || reg_date.getDate().equals(null) ){
             JOptionPane.showMessageDialog(null, "Please Fill all the blanks");              
        }
        else{
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
        date = sm.format(reg_date.getDate());
            String oper = "insert";
            String sql = "call cusHomes_pro('"+ cusNo+"','"+HmNum+"','"+date+"','"+watch.getText()+"','"+watch_star.getText()+"','"+service.getSelectedItem()+"','"+oper+"',null)";
            co.setSQL(sql);  
            clear();
        }
    }//GEN-LAST:event_saveActionPerformed

    private void update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update1ActionPerformed
       if(id== null){
            JOptionPane.showMessageDialog(null, "Please Search Valid Id, Then delete");
        }else{
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
        date = sm.format(reg_date.getDate());
            String oper = "update";
            String sql = "call cusHomes_pro('"+cusNo+"','"+HmNum+"','"+date+"','"+watch.getText()+"','"+watch_star.getText()+"','"+service.getSelectedItem()+"','"+oper+"','"+id+"')";
            co.setSQL(sql);      
            clear(); 
       }
    }//GEN-LAST:event_update1ActionPerformed

    private void deletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletActionPerformed
        // TODO add your handling code here:
        if(id == null){
        JOptionPane.showMessageDialog(null, "Please Search Valid ID,Then Delete");
        }else{
            if (JOptionPane.showConfirmDialog(null, "Mahubtaa!") == JOptionPane.YES_OPTION) {
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
        date = sm.format(reg_date.getDate());
        
        String oper = "delete";
        String sql = "call cusHomes_pro('"+cusNo+"','"+HmNum+"','"+date+"','"+watch.getText()+"','"+watch_star.getText()+"','"+service.getSelectedItem()+"','"+oper+"','"+id+"')";
        co.setSQL(sql);      
        clear();
        }
        }
          
    }//GEN-LAST:event_deletActionPerformed

    private void serActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serActionPerformed
        String sql = "select cus_h_no, concat(people_no,',',name) as customer, h_no,reg_date,watch,W_starts,ser_name from  people p,customer_homes ch  where p.people_no = ch.cust_no and cus_h_no ='"+serTex.getText()+"'";
        co.search(sql);
        //SimpleDateFormat sm = new SimpleDateFormat("yyyy-mm-dd");
        //date = sm.format(reg_date.getDate());
        try{

            if(co.rs.next()){
                id = co.rs.getString("cus_h_no");
                String selected = co.rs.getString("customer");
                cus_no.setSelectedItem(selected);
                String selected1 = co.rs.getString("h_no");
                ho_no.setSelectedItem(selected1);
                reg_date.setDate(co.rs.getDate("reg_date"));
                watch.setText(co.rs.getString("watch"));
                watch_star.setText(co.rs.getString("w_starts"));
                String selected2 = co.rs.getString("ser_name");
                service.setSelectedItem(selected2);
                serTex.setText("");
                
            }else{
                JOptionPane.showMessageDialog(null, "record not found");
            }
        }catch(Exception exp){
            JOptionPane.showMessageDialog(null,exp.getMessage());
        }
    }//GEN-LAST:event_serActionPerformed

    private void serTexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serTexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serTexActionPerformed

    private void cus_noItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cus_noItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cus_noItemStateChanged

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
            java.util.logging.Logger.getLogger(c_homes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(c_homes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(c_homes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(c_homes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new c_homes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JComboBox<String> cus_no;
    private javax.swing.JButton delet;
    private javax.swing.JComboBox<String> ho_no;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser reg_date;
    private javax.swing.JButton save;
    private javax.swing.JButton ser;
    private javax.swing.JTextField serTex;
    private javax.swing.JComboBox<String> service;
    private javax.swing.JButton update1;
    private javax.swing.JTextField watch;
    private javax.swing.JTextField watch_star;
    // End of variables declaration//GEN-END:variables
}