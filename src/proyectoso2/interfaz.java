/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoso2;

/**
 *
 * @author mkferrerteran
 */
public class interfaz extends javax.swing.JFrame {

    /**
     * Creates new form interfaz
     */
    public interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        PuntajeL = new javax.swing.JTextField();
        PuntajeB = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        P2Bug = new javax.swing.JTextField();
        P1Bug = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        P1Lam = new javax.swing.JTextField();
        ReparandoB = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        P2Lam = new javax.swing.JTextField();
        ReparandoL = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        P3Bug = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        P3Lam = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 340, 300));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bugatti VS Lamborghini");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Puntaje");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 436, -1, 30));

        jTextField1.setBackground(new java.awt.Color(0, 51, 51));
        jTextField1.setForeground(new java.awt.Color(0, 51, 51));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 436, 90, 30));

        PuntajeL.setForeground(new java.awt.Color(0, 51, 51));
        PuntajeL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(PuntajeL, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 60, -1));

        PuntajeB.setForeground(new java.awt.Color(0, 51, 51));
        PuntajeB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(PuntajeB, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, 60, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Prioridad 1");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Prioridad 3");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, -1, -1));

        P2Bug.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(P2Bug, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 130, -1));

        P1Bug.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(P1Bug, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 130, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Prioridad 1");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Prioridad 2");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 220, 80, -1));

        P1Lam.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(P1Lam, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, 130, -1));

        ReparandoB.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(ReparandoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 130, -1));

        jLabel8.setBackground(new java.awt.Color(0, 51, 51));
        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Prioridad 2");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Reparando");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 360, -1, -1));

        P2Lam.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(P2Lam, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 240, 130, -1));

        ReparandoL.setForeground(new java.awt.Color(0, 51, 51));
        ReparandoL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReparandoLActionPerformed(evt);
            }
        });
        getContentPane().add(ReparandoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 380, 130, -1));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Prioridad 3");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        P3Bug.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(P3Bug, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 130, -1));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Reparando");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        P3Lam.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(P3Lam, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 310, 130, -1));

        jTextField3.setBackground(new java.awt.Color(0, 51, 51));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 214, 90, -1));

        jTextField4.setBackground(new java.awt.Color(0, 51, 51));
        jTextField4.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 216, 90, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Captura de pantalla 2023-06-14 a la(s) 9.20.54 p. m..png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void ReparandoLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReparandoLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReparandoLActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField P1Bug;
    private javax.swing.JTextField P1Lam;
    private javax.swing.JTextField P2Bug;
    private javax.swing.JTextField P2Lam;
    private javax.swing.JTextField P3Bug;
    private javax.swing.JTextField P3Lam;
    private javax.swing.JTextField PuntajeB;
    private javax.swing.JTextField PuntajeL;
    private javax.swing.JTextField ReparandoB;
    private javax.swing.JTextField ReparandoL;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
