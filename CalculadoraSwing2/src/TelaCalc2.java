/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author lucas
 */
public class TelaCalc2 extends javax.swing.JFrame {

    /**
     * Creates new form TelaCalc2
     */
    public TelaCalc2() {
        initComponents();
        panCalc.setVisible(false);
        lblCalc.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panCalc = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblRestDiv = new javax.swing.JLabel();
        lblElevC = new javax.swing.JLabel();
        lblRaisQ = new javax.swing.JLabel();
        lblRaizC = new javax.swing.JLabel();
        lblValorAbs = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnClick = new javax.swing.JButton();
        choseNum = new javax.swing.JSpinner();
        lblCalc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(255, 51, 51));
        setIconImages(null);
        setResizable(false);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Raiz C³");

        lblRestDiv.setBackground(new java.awt.Color(57, 0, 112));
        lblRestDiv.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblRestDiv.setForeground(new java.awt.Color(204, 0, 0));
        lblRestDiv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRestDiv.setText("0");

        lblElevC.setBackground(new java.awt.Color(57, 0, 112));
        lblElevC.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblElevC.setForeground(new java.awt.Color(204, 0, 0));
        lblElevC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblElevC.setText("0");

        lblRaisQ.setBackground(new java.awt.Color(57, 0, 112));
        lblRaisQ.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblRaisQ.setForeground(new java.awt.Color(204, 0, 0));
        lblRaisQ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRaisQ.setText("0");

        lblRaizC.setBackground(new java.awt.Color(57, 0, 112));
        lblRaizC.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblRaizC.setForeground(new java.awt.Color(204, 0, 0));
        lblRaizC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRaizC.setText("0");

        lblValorAbs.setBackground(new java.awt.Color(57, 0, 112));
        lblValorAbs.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblValorAbs.setForeground(new java.awt.Color(204, 0, 0));
        lblValorAbs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValorAbs.setText("0");

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Resto Div p2");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Elevado ao c³");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Raiz V²");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Valor Abs");

        javax.swing.GroupLayout panCalcLayout = new javax.swing.GroupLayout(panCalc);
        panCalc.setLayout(panCalcLayout);
        panCalcLayout.setHorizontalGroup(
            panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCalcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblElevC, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(lblRestDiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRaisQ, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRaizC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblValorAbs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55))
        );
        panCalcLayout.setVerticalGroup(
            panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCalcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRestDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCalcLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblElevC))
                    .addGroup(panCalcLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)))
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCalcLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblRaisQ, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panCalcLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRaizC, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValorAbs, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 153));
        jLabel11.setText("Super Calculadora");

        btnClick.setFont(new java.awt.Font("Gentium Book Basic", 1, 18)); // NOI18N
        btnClick.setForeground(new java.awt.Color(0, 0, 255));
        btnClick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calcular.png"))); // NOI18N
        btnClick.setText("CalcSupClick");
        btnClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClickActionPerformed(evt);
            }
        });

        choseNum.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        choseNum.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 1.0d));

        lblCalc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calculadoraamr.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panCalc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(choseNum, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(btnClick))
                        .addGap(8, 8, 8)))
                .addGap(18, 18, 18)
                .addComponent(lblCalc)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCalc)
                        .addGap(82, 82, 82))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(choseNum, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClick, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panCalc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClickActionPerformed
       
        double num = Double.parseDouble(choseNum.getValue().toString());

        // Resto Div por 2
        double rest = num % 2;
        lblRestDiv.setText(Double.toString(rest));

        // Elevado ao cubo
        double cub = Math.pow(num, 3);
        lblElevC.setText(Double.toString(cub));

        // Raiz Quadrada
        double raiz = Math.sqrt(num);
        lblRaisQ.setText(String.format(" %.3f",raiz));

        // Raiz Cubica
        double raizc = Math.cbrt(num);
        lblRaizC.setText(String.format(" %.3f",raizc));

        // Valor Abs
        double abs = Math.abs(num);
        lblValorAbs.setText(Double.toString(abs));
        
        panCalc.setVisible(true);
        lblCalc.setVisible(true);
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
            java.util.logging.Logger.getLogger(TelaCalc2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCalc2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCalc2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCalc2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalc2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClick;
    private javax.swing.JSpinner choseNum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblCalc;
    private javax.swing.JLabel lblElevC;
    private javax.swing.JLabel lblRaisQ;
    private javax.swing.JLabel lblRaizC;
    private javax.swing.JLabel lblRestDiv;
    private javax.swing.JLabel lblValorAbs;
    private javax.swing.JPanel panCalc;
    // End of variables declaration//GEN-END:variables
}


/*
        int num = Integer.parseInt(choseNum.getValue().toString());

        // Resto Div por 2
        int rest = num % 2;
        lblRestDiv.setText(Integer.toString(rest));

        // Elevado ao cubo
        double cub = Math.pow(num, 3);
        lblElevC.setText(Double.toString(cub));

        // Raiz Quadrada
        double raiz = Math.sqrt(num);
        lblRaisQ.setText(String.format(" %.3f",raiz));

        // Raiz Cubica
        double raizc = Math.cbrt(num);
        lblRaizC.setText(String.format(" %.3f",raizc));

        // Valor Abs
        int abs = Math.abs(num);
        lblValorAbs.setText(Integer.toString(abs));
*/