/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package becomeajavaprogrammer;

/**
 *
 * @author lucas
 */
public class TelaGenio extends javax.swing.JFrame {

    /**
     * Creates new form TelaGenio
     */
    public TelaGenio() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnClick = new javax.swing.JButton();
        spnN = new javax.swing.JSpinner();
        lblTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/aladin.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 330));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/balão de texto quadrado.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 300, 100));

        btnClick.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        btnClick.setForeground(new java.awt.Color(0, 0, 204));
        btnClick.setText("Let's Magick");
        btnClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClickActionPerformed(evt);
            }
        });
        getContentPane().add(btnClick, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, 35));

        spnN.setModel(new javax.swing.SpinnerNumberModel());
        getContentPane().add(spnN, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        lblTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTxt.setForeground(new java.awt.Color(0, 102, 102));
        lblTxt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTxt.setText("<html>Você consegue advinhar o numero <br> que estou pensando entre 1 e 10?</html>");
        lblTxt.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 270, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClickActionPerformed
        // TODO add your handling code here:
        int num =(int) spnN.getValue();
        double n= 1 + Math.random() *(10 - 1);
        int valor = (int) n;
        
        String f1 = "Você Acertou";
        String f2 = "Errou, eu pensei no Num:  " +valor;
        
        String res = (valor == num)? f1:f2;
        lblTxt.setText(res);
    }//GEN-LAST:event_btnClickActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGenio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClick;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblTxt;
    private javax.swing.JSpinner spnN;
    // End of variables declaration//GEN-END:variables
}
