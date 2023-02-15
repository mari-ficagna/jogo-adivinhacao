
import java.awt.Font;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Mari (48) 99618-5728
 */
public class TelaJogo extends javax.swing.JFrame {

    /**
     * Creates new form TelaJogo
     */
    public TelaJogo() {
        initComponents();
        lblFrase.setText("<html>Vou pensar em um valor entre <strong>1 e 5</strong>. Tente advinhar...<html>");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        lblFrase = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtValor = new javax.swing.JSpinner();
        btnPalpite = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Genio.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        lblFrase.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFrase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFrase.setText("Frase");
        lblFrase.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblFrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 130, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Balão.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 334, 275));

        jLabel4.setText("Palpite");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        txtValor.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));

        btnPalpite.setText("Advinhar");
        btnPalpite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPalpiteActionPerformed(evt);
            }
        });
        getContentPane().add(btnPalpite, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPalpiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPalpiteActionPerformed
        // TODO add your handling code here:
        /*int valor = Integer.parseInt(txtValor.getValue().toString());
        double aleatorio = Math.random();
        int genio = (int) (1 + aleatorio *(5-1));
        int resultado;
        resultado = valor == genio ? "Parabéns, você acertou!":"Você errou!";*/
        
        double n = 1 + Math.random() * (6-1);
        int valor = (int) n;
        
        int num = Integer.parseInt(txtValor.getValue().toString());
        
        String f1 = "ACERTOU!";
        //String f2 = "<html>ERROU! Eu pensei no valor <html>"+ valor;
        String f2 = "<html>ERROU! Eu pensei no valor "+ valor + "</html>";
        
        String res = (valor == num)?f1:f2;
        
        lblFrase.setFont(new Font("Arial Black", Font.PLAIN, 18));
        
        lblFrase.setText(res);
        
                
        
        
        
        
        
        
        
    }//GEN-LAST:event_btnPalpiteActionPerformed

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
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPalpite;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblFrase;
    private javax.swing.JSpinner txtValor;
    // End of variables declaration//GEN-END:variables
}
