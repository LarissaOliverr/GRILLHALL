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
public class MenuJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MenuJFrame
     */
    public MenuJFrame() {
        initComponents();
          setSize(1020, 629);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnfinanceiro = new javax.swing.JButton();
        btnprincipal = new javax.swing.JButton();
        btnprodutos = new javax.swing.JButton();
        btnvoltar = new javax.swing.JButton();
        btnsair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnfinanceiro.setBackground(new java.awt.Color(51, 47, 45));
        btnfinanceiro.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        btnfinanceiro.setForeground(new java.awt.Color(255, 255, 255));
        btnfinanceiro.setText("FINANCEIRO");
        btnfinanceiro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnfinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfinanceiroActionPerformed(evt);
            }
        });
        getContentPane().add(btnfinanceiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 270, 30));

        btnprincipal.setBackground(new java.awt.Color(51, 47, 45));
        btnprincipal.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        btnprincipal.setForeground(new java.awt.Color(255, 255, 255));
        btnprincipal.setText("PRINCIPAL");
        btnprincipal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnprincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprincipalActionPerformed(evt);
            }
        });
        getContentPane().add(btnprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 270, 30));

        btnprodutos.setBackground(new java.awt.Color(51, 47, 45));
        btnprodutos.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        btnprodutos.setForeground(new java.awt.Color(255, 255, 255));
        btnprodutos.setText("PRODUTOS");
        btnprodutos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnprodutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprodutosActionPerformed(evt);
            }
        });
        getContentPane().add(btnprodutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 270, 30));

        btnvoltar.setBackground(new java.awt.Color(51, 47, 45));
        btnvoltar.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btnvoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnvoltar.setText("VOLTAR");
        btnvoltar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnvoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 500, 90, -1));

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
        getContentPane().add(btnsair, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 540, 90, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/MENU.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnfinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinanceiroActionPerformed
        // TODO add your handling code here:
        FinanceiroJFrame frm = new FinanceiroJFrame();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnfinanceiroActionPerformed

    private void btnvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltarActionPerformed
        // TODO add your handling code here:
        LoginJFrame frm = new LoginJFrame();
        frm.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnvoltarActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        // TODO add your handling code here:
        StartJFrame frm = new StartJFrame();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnsairActionPerformed

    private void btnprincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprincipalActionPerformed
        // TODO add your handling code here:
        PrincipalJFrame frm = new PrincipalJFrame();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnprincipalActionPerformed

    private void btnprodutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprodutosActionPerformed
        // TODO add your handling code here:
        Produtos frm = new Produtos();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnprodutosActionPerformed

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
            java.util.logging.Logger.getLogger(MenuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfinanceiro;
    private javax.swing.JButton btnprincipal;
    private javax.swing.JButton btnprodutos;
    private javax.swing.JButton btnsair;
    private javax.swing.JButton btnvoltar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
