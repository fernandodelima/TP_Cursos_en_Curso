/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Model.ComboNuevoCursante;
import Model.GestorCurso;
import Model.GestorInscripcion;
import Model.VMNombreDocumento;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Yasmin
 */
public class ConsultaInscripcion extends javax.swing.JFrame {

    GestorCurso g;
    
    public ConsultaInscripcion() {
        initComponents();
        g = new GestorCurso();
        try {
            cargarComboCurso(g.ComboCursoProximoyActuales());
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaInscripcion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConsultaInscripcion.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setLocationRelativeTo(null);
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
        cmbCursos = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jltListado = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta Inscripcion");
        setAlwaysOnTop(true);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(500, 350));
        setPreferredSize(new java.awt.Dimension(500, 350));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Curso");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(24, 14, 36, 17);

        cmbCursos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCursosActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCursos);
        cmbCursos.setBounds(78, 11, 392, 23);

        jltListado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(jltListado);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 52, 494, 270);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/purple-polygonal-960x540.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 510, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCursosActionPerformed
        //Consulta con parametro de curso, solo miestra inscriptos en el curso
        GestorInscripcion gi = new GestorInscripcion();
        DefaultListModel lm = new DefaultListModel();
        try {
            for (VMNombreDocumento elemento : gi.listado(((ComboNuevoCursante)cmbCursos.getSelectedItem()).getId())) {
                lm.addElement(elemento.toString());
            }
            jltListado.setModel(lm);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConsultaInscripcion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaInscripcion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbCursosActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       MenuPrincipal.vConsultaInscripcion = false;
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(ConsultaInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaInscripcion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbCursos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList jltListado;
    // End of variables declaration//GEN-END:variables
    public void cargarComboCurso(ArrayList listaGenerica) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();

        for (Object elemento : listaGenerica) {
            model.addElement(elemento);
        }

        cmbCursos.setModel(model);
    }

}
