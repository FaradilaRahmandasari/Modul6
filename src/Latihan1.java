/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Latihan1 extends javax.swing.JFrame {

    /**
     * Creates new form Latihan1
     */
    public Latihan1() {
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
        Alamat1 = new javax.swing.JTextField();
        Nama1 = new javax.swing.JTextField();
        Kelas1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Alamat2 = new javax.swing.JTextField();
        Nama2 = new javax.swing.JTextField();
        Kelas2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Alamat");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 110, 41, 16);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 30, 50, 16);

        jLabel3.setText("Kelas");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 70, 41, 16);

        jLabel4.setText("Formulir");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(180, 10, 50, 16);

        Alamat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alamat1ActionPerformed(evt);
            }
        });
        getContentPane().add(Alamat1);
        Alamat1.setBounds(160, 110, 190, 30);

        Nama1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nama1ActionPerformed(evt);
            }
        });
        getContentPane().add(Nama1);
        Nama1.setBounds(160, 30, 190, 30);

        Kelas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kelas1ActionPerformed(evt);
            }
        });
        getContentPane().add(Kelas1);
        Kelas1.setBounds(160, 70, 190, 30);

        jButton1.setText("Proses");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(140, 150, 71, 25);

        jLabel5.setText("Alamat");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 260, 41, 16);

        jLabel6.setText("Nama");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 180, 50, 16);

        jLabel7.setText("Kelas");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 220, 41, 16);

        Alamat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alamat2ActionPerformed(evt);
            }
        });
        getContentPane().add(Alamat2);
        Alamat2.setBounds(160, 260, 190, 30);

        Nama2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nama2ActionPerformed(evt);
            }
        });
        getContentPane().add(Nama2);
        Nama2.setBounds(160, 180, 190, 30);

        Kelas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kelas2ActionPerformed(evt);
            }
        });
        getContentPane().add(Kelas2);
        Kelas2.setBounds(160, 220, 190, 30);

        setBounds(0, 0, 418, 347);
    }// </editor-fold>//GEN-END:initComponents

    private void Alamat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alamat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Alamat1ActionPerformed

    private void Nama1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nama1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nama1ActionPerformed

    private void Kelas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kelas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Kelas1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nama = Nama1.getText();
        Nama2.setText(nama);
        String kelas = Kelas1.getText();
        Kelas2.setText(kelas);
        String alamat = Alamat1.getText();
        Alamat2.setText(alamat);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Alamat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alamat2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Alamat2ActionPerformed

    private void Nama2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nama2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nama2ActionPerformed

    private void Kelas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kelas2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Kelas2ActionPerformed

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
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alamat1;
    private javax.swing.JTextField Alamat2;
    private javax.swing.JTextField Kelas1;
    private javax.swing.JTextField Kelas2;
    private javax.swing.JTextField Nama1;
    private javax.swing.JTextField Nama2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}