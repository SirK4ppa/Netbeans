/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usuarios;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author heyit
 */
public class jfrUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form jfrUsuarios
     */
    public jfrUsuarios() {
        initComponents();
        
        setIconImage(getIconImage());
    }
    
    @Override
    public Image getIconImage(){
        
    Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Images/UserIcon.png"));
    
    return retValue;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jlbPFP = new javax.swing.JLabel();
        jlbNombre = new javax.swing.JLabel();
        jlbTelefono = new javax.swing.JLabel();
        jlbSexo = new javax.swing.JLabel();
        jrdM = new javax.swing.JRadioButton();
        jdrF = new javax.swing.JRadioButton();
        jlbDireccion = new javax.swing.JLabel();
        jlbCoach = new javax.swing.JLabel();
        jlbEtapa = new javax.swing.JLabel();
        jlbVencimiento = new javax.swing.JLabel();
        jbnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Usuario");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jlbPFP.setForeground(new java.awt.Color(255, 255, 255));
        jlbPFP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User.png"))); // NOI18N
        jlbPFP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jlbNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlbNombre.setForeground(new java.awt.Color(255, 255, 255));
        jlbNombre.setText("Nombre del miembro (Usuario)");
        jlbNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jlbTelefono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlbTelefono.setForeground(new java.awt.Color(255, 255, 255));
        jlbTelefono.setText("Número de teléfono");
        jlbTelefono.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jlbSexo.setBackground(new java.awt.Color(51, 51, 51));
        jlbSexo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlbSexo.setForeground(new java.awt.Color(255, 255, 255));
        jlbSexo.setText("Sexo");
        jlbSexo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jrdM.setBackground(new java.awt.Color(51, 51, 51));
        Sexo.add(jrdM);
        jrdM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrdM.setForeground(new java.awt.Color(255, 255, 255));
        jrdM.setText("Masculino");
        jrdM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jdrF.setBackground(new java.awt.Color(51, 51, 51));
        Sexo.add(jdrF);
        jdrF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jdrF.setForeground(new java.awt.Color(255, 255, 255));
        jdrF.setText("Femenino");
        jdrF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jlbDireccion.setBackground(new java.awt.Color(51, 51, 51));
        jlbDireccion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlbDireccion.setForeground(new java.awt.Color(255, 255, 255));
        jlbDireccion.setText("Dirección");
        jlbDireccion.setToolTipText("");
        jlbDireccion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jlbCoach.setBackground(new java.awt.Color(51, 51, 51));
        jlbCoach.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlbCoach.setForeground(new java.awt.Color(255, 255, 255));
        jlbCoach.setText("Coach asignado");
        jlbCoach.setToolTipText("");
        jlbCoach.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jlbEtapa.setBackground(new java.awt.Color(51, 51, 51));
        jlbEtapa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlbEtapa.setForeground(new java.awt.Color(255, 255, 255));
        jlbEtapa.setText("Étapa en la que se encuentre");
        jlbEtapa.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jlbVencimiento.setBackground(new java.awt.Color(51, 51, 51));
        jlbVencimiento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlbVencimiento.setForeground(new java.awt.Color(255, 255, 255));
        jlbVencimiento.setText("Fecha de vencimiento");
        jlbVencimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jbnBack.setBackground(new java.awt.Color(153, 0, 51));
        jbnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbnBack.setForeground(new java.awt.Color(255, 255, 255));
        jbnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N
        jbnBack.setText("    Atrás");
        jbnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlbPFP))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jbnBack)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jrdM)
                        .addGap(18, 18, 18)
                        .addComponent(jdrF))
                    .addComponent(jlbSexo)
                    .addComponent(jlbDireccion)
                    .addComponent(jlbCoach)
                    .addComponent(jlbEtapa)
                    .addComponent(jlbVencimiento))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlbPFP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jbnBack)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlbNombre)
                        .addGap(18, 18, 18)
                        .addComponent(jlbTelefono)
                        .addGap(18, 18, 18)
                        .addComponent(jlbSexo)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrdM)
                            .addComponent(jdrF))
                        .addGap(18, 18, 18)
                        .addComponent(jlbDireccion)
                        .addGap(18, 18, 18)
                        .addComponent(jlbCoach)
                        .addGap(18, 18, 18)
                        .addComponent(jlbEtapa)
                        .addGap(18, 18, 18)
                        .addComponent(jlbVencimiento)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(jfrUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Sexo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbnBack;
    private javax.swing.JRadioButton jdrF;
    private javax.swing.JLabel jlbCoach;
    private javax.swing.JLabel jlbDireccion;
    private javax.swing.JLabel jlbEtapa;
    private javax.swing.JLabel jlbNombre;
    private javax.swing.JLabel jlbPFP;
    private javax.swing.JLabel jlbSexo;
    private javax.swing.JLabel jlbTelefono;
    private javax.swing.JLabel jlbVencimiento;
    private javax.swing.JRadioButton jrdM;
    // End of variables declaration//GEN-END:variables
}
