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
public class StartJFrame extends javax.swing.JFrame {

    /**
     * Creates new form StartJFrame
     */
    public StartJFrame() {
        initComponents();
        setSize(1004, 630);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btncadastrar = new javax.swing.JButton();
        btnentrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/GRILL HALL.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 510, 410));

        btncadastrar.setBackground(new java.awt.Color(51, 47, 45));
        btncadastrar.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        btncadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btncadastrar.setText("CADASTRAR");
        btncadastrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btncadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, 200, 50));

        btnentrar.setBackground(new java.awt.Color(51, 47, 45));
        btnentrar.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        btnentrar.setForeground(new java.awt.Color(255, 255, 255));
        btnentrar.setText("ENTRAR");
        btnentrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnentrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnentrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 200, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1004, 591));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnentrarActionPerformed
        // TODO add your handling code here:
        LoginJFrame frm = new LoginJFrame();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnentrarActionPerformed

    private void btncadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadastrarActionPerformed
        // TODO add your handling code here:
        CadastroJFrame frm = new CadastroJFrame();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(StartJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncadastrar;
    private javax.swing.JButton btnentrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
