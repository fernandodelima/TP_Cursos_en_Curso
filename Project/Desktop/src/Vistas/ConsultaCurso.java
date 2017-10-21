/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JRadioButton;

/**
 *
 * @author Yasmin
 */
public class ConsultaCurso extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaCurso
     */
    public ConsultaCurso() {
        initComponents();
        truFalsRaddio(1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        rbtTodos = new javax.swing.JRadioButton();
        rbtProximo = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jltListado = new javax.swing.JList();
        rbtActuales = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta Curso");
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        rbtTodos.setSelected(true);
        rbtTodos.setText("Todos");
        rbtTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtTodosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 31, 0, 0);
        getContentPane().add(rbtTodos, gridBagConstraints);

        rbtProximo.setText("proximos");
        rbtProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtProximoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 2, 0, 0);
        getContentPane().add(rbtProximo, gridBagConstraints);

        jScrollPane1.setViewportView(jltListado);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 567;
        gridBagConstraints.ipady = 284;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        rbtActuales.setText("Actuales");
        rbtActuales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtActualesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 2, 0, 0);
        getContentPane().add(rbtActuales, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtTodosActionPerformed
        truFalsRaddio(1);
        //Llamar a la consulta que muestre todos los cursos
    }//GEN-LAST:event_rbtTodosActionPerformed

    private void rbtProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtProximoActionPerformed
        truFalsRaddio(2);
        //Llamar a la consulta cursos proximos
    }//GEN-LAST:event_rbtProximoActionPerformed

    private void rbtActualesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtActualesActionPerformed
        truFalsRaddio(3);
        //Llamar a la consulta cursos Actuales
    }//GEN-LAST:event_rbtActualesActionPerformed

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Imagenes/IconoDefinitivo.jpg"));
        return retValue;
    }
    
    
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
            java.util.logging.Logger.getLogger(ConsultaCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaCurso().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList jltListado;
    private javax.swing.JRadioButton rbtActuales;
    private javax.swing.JRadioButton rbtProximo;
    private javax.swing.JRadioButton rbtTodos;
    // End of variables declaration//GEN-END:variables

    private void truFalsRaddio ( int x){
       switch (x){
           case 1:
               rbtProximo.setSelected(false);
               rbtTodos.setSelected(true);
               rbtActuales.setSelected(false);
               break;
            case 2:
                rbtProximo.setSelected(true);
                rbtTodos.setSelected(false);
                rbtActuales.setSelected(false);
                break;
            case 3:
                rbtProximo.setSelected(false);
                rbtTodos.setSelected(false);
                rbtActuales.setSelected(true);
                break;
       }
    }
}
