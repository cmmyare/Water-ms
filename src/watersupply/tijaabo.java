/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watersupply;

import javax.swing.JFrame;

/**
 *
 * @author Deere
 */
public class tijaabo extends javax.swing.JFrame {
     Codes co = new Codes();
     
    public String doc;
    /**
     * Creates new form tijaabo
     */
    public tijaabo() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("People Registration");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        String sql = "SELECT acc_name as accName FROM accounts ORDER BY acc_no ASC";
        String col = "accName";
        co.updateComo(tijaabo,sql,col);
        
        doc = tijaabo.getSelectedItem().toString();
        jLabel1.setText(doc);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tijaabo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tijaabo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tijaaboActionPerformed(evt);
            }
        });
        getContentPane().add(tijaabo, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 135, 200, 35));

        jLabel1.setText("0");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 150, 50));

        jButton1.setText("Save");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 190, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tijaaboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tijaaboActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tijaaboActionPerformed

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
            java.util.logging.Logger.getLogger(tijaabo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tijaabo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tijaabo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tijaabo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tijaabo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> tijaabo;
    // End of variables declaration//GEN-END:variables
}