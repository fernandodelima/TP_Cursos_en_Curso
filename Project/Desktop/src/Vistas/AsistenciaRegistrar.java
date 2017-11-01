/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Model.Asistencia;
import Model.ComboCurso;
import Model.Curso;
import Model.GestorAsistencia;
import Model.GestorCurso;
import Model.GestorInscripcion;
import Model.Inscripcion;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yasmin
 */
public class AsistenciaRegistrar extends javax.swing.JFrame {

    GestorCurso g;
    GestorAsistencia ga;
    GestorInscripcion gi;
    Calendar fecha;
    ArrayList<Inscripcion> inscriptos;
    String fechaString;
    int esPresente;
    int anio;
    int mes;
    int dia;

    public AsistenciaRegistrar() throws ClassNotFoundException, SQLException {

        initComponents();
        ga = new GestorAsistencia();
        gi = new GestorInscripcion();
        g = new GestorCurso();
        try {
            cargarComboCurso(g.ComboCursosActuales());
        } catch (SQLException ex) {
            Logger.getLogger(AsistenciaRegistrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AsistenciaRegistrar.class.getName()).log(Level.SEVERE, null, ex);
        }
        cargarTablaAsistencia();
        fecha = new GregorianCalendar();
        anio = fecha.get(Calendar.YEAR);
        mes = fecha.get(Calendar.MONTH);
        dia = fecha.get(Calendar.DAY_OF_MONTH);
        fechaString = "" + dia + "-" + (mes + 1) + "-" + anio;
        lblDiaAsistencia.setText(fechaString);

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
        cmbCurso = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tRegistrarAsistencia = new javax.swing.JTable();
        btRegistrar = new javax.swing.JButton();
        lblDiaAsistencia = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        cmbInscripto = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registra Asistencia");
        setAlwaysOnTop(true);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(405, 397));
        setPreferredSize(new java.awt.Dimension(405, 397));
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
        jLabel3.setBounds(10, 23, 36, 17);

        cmbCurso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCursoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCurso);
        cmbCurso.setBounds(64, 20, 283, 23);

        tRegistrarAsistencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tRegistrarAsistencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Alumno", "Presente"
            }
        ));
        jScrollPane1.setViewportView(tRegistrarAsistencia);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 61, 399, 256);

        btRegistrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/arrow.png"))); // NOI18N
        btRegistrar.setText("Registrar");
        btRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btRegistrar);
        btRegistrar.setBounds(280, 330, 107, 25);

        lblDiaAsistencia.setText("Asistencia para el dia");
        lblDiaAsistencia.setToolTipText("");
        getContentPane().add(lblDiaAsistencia);
        lblDiaAsistencia.setBounds(10, 335, 101, 14);

        btnModificar.setText("Modificar");
        getContentPane().add(btnModificar);
        btnModificar.setBounds(190, 330, 75, 23);

        cmbInscripto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbInscripto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbInscriptoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbInscripto);
        cmbInscripto.setBounds(340, 40, 56, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/images.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(300, 0, 100, 170);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/images.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 300, 170);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/images.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(300, 200, 100, 170);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/images.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 200, 300, 170);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        MenuPrincipal.vAsistenciasRegistrar = false;
    }//GEN-LAST:event_formWindowClosing

    private void btRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarActionPerformed
        int fila = tRegistrarAsistencia.getRowCount();

        Asistencia a = new Asistencia();
        for (int i = 0; i < fila; i++) {
            try {
                cmbInscripto.setSelectedItem(i);
                a.setInscripcion(((Inscripcion) cmbInscripto.getSelectedItem()).getIdInscripcion());
                a.setEstaPresente((boolean) tRegistrarAsistencia.getValueAt(i, 1));
                if (a.isEstaPresente()) {
                    esPresente = 1;
                } else {
                    esPresente = 0;
                }

                a.setFechaAsistencia(fechaString);
                ga.agregarAsistencia(a);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AsistenciaRegistrar.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(AsistenciaRegistrar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btRegistrarActionPerformed

    private void cmbCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCursoActionPerformed
        try {
            // TODO add your handling code here:
            cargarTablaAsistencia();

            cargarComboInscripto(gi.obtenerIdDeTodosInscriptosPorCurso(((Curso) cmbCurso.getSelectedItem()).getIdCurso()));

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AsistenciaRegistrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AsistenciaRegistrar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_cmbCursoActionPerformed

    private void cmbInscriptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbInscriptoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbInscriptoActionPerformed
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
            java.util.logging.Logger.getLogger(AsistenciaRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsistenciaRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsistenciaRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsistenciaRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AsistenciaRegistrar().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AsistenciaRegistrar.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(AsistenciaRegistrar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRegistrar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox cmbCurso;
    private javax.swing.JComboBox<String> cmbInscripto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDiaAsistencia;
    private javax.swing.JTable tRegistrarAsistencia;
    // End of variables declaration//GEN-END:variables

    public void cargarTablaAsistencia() throws ClassNotFoundException, SQLException {
        int count = 0;
        count = ga.obtenerCursantesPorCursoCantidad(((ComboCurso) (cmbCurso.getSelectedItem())).getId());
        Object[][] data = new Object[count][2];
        int i = 0;
        for (String s : ga.obtenerCursantesPorCurso(((ComboCurso) (cmbCurso.getSelectedItem())).getId())) {
            data[i][0] = s;
            data[i][1] = false;
            i++;
        }

        String[] cols = {"Alumnos", "Presente"};
        DefaultTableModel model = new DefaultTableModel(data, cols) {
            @Override
            public Class<?> getColumnClass(int column) {
                if (column == 1) {
                    return Boolean.class;
                } else {
                    return String.class;
                }
            }
        };

        tRegistrarAsistencia.setModel(model);//new JTable(model);
        //JOptionPane.showMessageDialog(null, new JScrollPane(tRegistrarAsistencia));

    }

    public void cargarComboCurso(ArrayList listaGenerica) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();

        for (Object elemento : listaGenerica) {
            model.addElement(elemento);
        }

        cmbCurso.setModel(model);
    }

    public void cargarComboInscripto(ArrayList listaGenerica) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();

        for (Object elemento : listaGenerica) {
            model.addElement(elemento);
        }

        cmbInscripto.setModel(model);
    }
}
