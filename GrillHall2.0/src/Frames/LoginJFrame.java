/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

/**
 *
 * @author Larissa
 */
public class LoginJFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginJFrame
     */
    public LoginJFrame() {
        initComponents();
         setSize(1020, 633);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passwordtxt = new javax.swing.JPasswordField();
        usertxt = new javax.swing.JTextField();
        btnsair = new javax.swing.JButton();
        btnentrar = new javax.swing.JButton();
        recuperarsenhatxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordtxt.setBackground(java.awt.SystemColor.control);
        passwordtxt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        passwordtxt.setForeground(new java.awt.Color(0, 0, 0));
        passwordtxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(passwordtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 310, 40));

        usertxt.setBackground(java.awt.SystemColor.control);
        usertxt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        usertxt.setForeground(new java.awt.Color(0, 0, 0));
        usertxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        usertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usertxtActionPerformed(evt);
            }
        });
        getContentPane().add(usertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 310, 40));

        btnsair.setBackground(new java.awt.Color(51, 47, 45));
        btnsair.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btnsair.setForeground(new java.awt.Color(255, 255, 255));
        btnsair.setText("SAIR");
        btnsair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });
        getContentPane().add(btnsair, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, 120, 30));

        btnentrar.setBackground(new java.awt.Color(51, 47, 45));
        btnentrar.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btnentrar.setForeground(new java.awt.Color(255, 255, 255));
        btnentrar.setText("ENTRAR");
        btnentrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnentrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnentrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, 120, 30));

        recuperarsenhatxt.setBackground(new java.awt.Color(255, 255, 255));
        recuperarsenhatxt.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 14)); // NOI18N
        recuperarsenhatxt.setForeground(new java.awt.Color(255, 255, 255));
        recuperarsenhatxt.setText("Esqueceu a senha?");
        getContentPane().add(recuperarsenhatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 150, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LOGIN.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1020, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usertxtActionPerformed

    private void btnentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnentrarActionPerformed
        // TODO add your handling code here:
        MenuJFrame frm = new MenuJFrame();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnentrarActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        // TODO add your handling code here:
        StartJFrame frm = new StartJFrame();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnsairActionPerformed

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
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnentrar;
    private javax.swing.JButton btnsair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField passwordtxt;
    private javax.swing.JLabel recuperarsenhatxt;
    private javax.swing.JTextField usertxt;
    // End of variables declaration//GEN-END:variables
}
