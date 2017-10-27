/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Model.ComboNuevoCursante;
import Model.DatosGenerales;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import Model.GestorCurso;
import Model.GestorInscripcion;
import Model.GestorTipoDni;
import Model.TipoDni;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yasmin
 */
public class RegistrarInscripto extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarInscripto
     */
    private int instancia;
    GestorCurso g;
    
    public RegistrarInscripto() {
        initComponents();
        cargaCmb();
        cargarDiaCombo();
        this.setLocationRelativeTo(null);
    }
    
    public RegistrarInscripto (int x) {
        initComponents();
        cargaCmb();
        cargarDiaCombo();
        g = new GestorCurso();
        GestorTipoDni gtd = new GestorTipoDni();
        try {            
            cargarComboCurso(g.ComboCursosIncribir());
            cargarComboTipoDni(gtd.obtenerTodos());

        } catch (SQLException ex) {
            Logger.getLogger(RegistrarInscripto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrarInscripto.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setLocationRelativeTo(null);
        
        instancia = x;
        switch (instancia){
            case 1://matriculado
                txtLegajo.setEnabled(true);
                txtProfecion.setEnabled(false);
                txtNombre.setEnabled(false);
                txtApellido.setEnabled(false);
                txtDocumento.setEnabled(false);
                cmbTipoDocumento.setEnabled(false);
                cmbAnio.setEnabled(false);
                cmbDia.setEnabled(false);
                cmbMes.setEnabled(false);
                txtMail.setEnabled(false);
                txtTelefono.setEnabled(false);
                break;
            case 2://Familiar
                txtProfecion.setEnabled(false);
                txtLegajo.setEnabled(true);
                break;
            case 3://Otro
                txtProfecion.setEnabled(false);
                txtLegajo.setEnabled(false);
                break;
        }
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

        cmbMes = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        cmbAnio = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        cmbCursos = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnCarcgar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtProfecion = new javax.swing.JTextField();
        cmbDia = new javax.swing.JComboBox();
        txtApellido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtLegajo = new javax.swing.JTextField();
        cmbTipoDocumento = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Inscripción");
        setAlwaysOnTop(true);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(600, 320));
        setPreferredSize(new java.awt.Dimension(680, 320));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        cmbMes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 112;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 4, 0, 0);
        getContentPane().add(cmbMes, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Mail");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 17, 0, 0);
        getContentPane().add(jLabel9, gridBagConstraints);

        cmbAnio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAnioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 114;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 4, 0, 0);
        getContentPane().add(cmbAnio, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 17, 0, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Curso");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 7, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("/");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 111;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 4, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 157;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 15, 0, 0);
        getContentPane().add(txtTelefono, gridBagConstraints);

        cmbCursos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 70;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 197;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 209;
        gridBagConstraints.insets = new java.awt.Insets(7, 6, 0, 19);
        getContentPane().add(cmbCursos, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Apellido");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 20;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 7, 0, 0);
        getContentPane().add(jLabel4, gridBagConstraints);

        txtDocumento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 117;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 6, 0, 0);
        getContentPane().add(txtDocumento, gridBagConstraints);

        txtMail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 112;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 461;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 15, 0, 0);
        getContentPane().add(txtMail, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Documento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 17, 0, 0);
        getContentPane().add(jLabel6, gridBagConstraints);

        btnCarcgar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCarcgar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/arrow.png"))); // NOI18N
        btnCarcgar.setText("Cargar");
        btnCarcgar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarcgarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 112;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 155;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 11, 19);
        getContentPane().add(btnCarcgar, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Profecion");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 20, 0, 0);
        getContentPane().add(jLabel10, gridBagConstraints);

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 157;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 4, 0, 0);
        getContentPane().add(txtNombre, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Fecha de Nacimiento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 26;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 45;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 4, 0, 0);
        getContentPane().add(jLabel7, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Legajo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 17, 0, 0);
        getContentPane().add(jLabel5, gridBagConstraints);

        txtProfecion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 70;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 154;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 203;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 24, 0, 0);
        getContentPane().add(txtProfecion, gridBagConstraints);

        cmbDia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 110;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 10, 0, 0);
        getContentPane().add(cmbDia, gridBagConstraints);

        txtApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 45;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 70;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 237;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 4, 0, 0);
        getContentPane().add(txtApellido, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Telfeono");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 17, 0, 0);
        getContentPane().add(jLabel8, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("/");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 113;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 4, 0, 0);
        getContentPane().add(jLabel12, gridBagConstraints);

        txtLegajo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 157;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 4, 0, 0);
        getContentPane().add(txtLegajo, gridBagConstraints);

        cmbTipoDocumento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 33;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 4, 0, 0);
        getContentPane().add(cmbTipoDocumento, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarcgarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarcgarActionPerformed
        GestorInscripcion gi = new GestorInscripcion();
        switch (instancia){
            case 1://matriculado
                if (esValidoM()){
                    try {
                        gi.agregarInscripcionMatriculado(Integer.parseInt(txtLegajo.getText()), ((ComboNuevoCursante)cmbCursos.getSelectedItem()).getId());
                        limpiarControles();
                    } catch (ClassNotFoundException ex) {
                    }
                }
            break;
            case 2://Familiar
                if (esValidoF()){
                    try {
                        DatosGenerales dg = new DatosGenerales();
                        dg.setNombre(txtNombre.getText());
                        dg.setApellido(txtApellido.getText());
                        dg.setTipoDni(((TipoDni)cmbTipoDocumento.getSelectedItem()).getId());
                        dg.setDni(Integer.parseInt(txtDocumento.getText()));
                        dg.setFechaNacimiento(cmbMes.getSelectedItem().toString() + "/" + cmbDia.getSelectedItem().toString() + "/" + cmbAnio.getSelectedItem().toString());
                        dg.setEmail(txtMail.getText());
                        dg.setTelefono(txtTelefono.getText());
                        gi.agregarInscripcionFamiliar(dg, Integer.parseInt(txtLegajo.getText()), ((ComboNuevoCursante)cmbCursos.getSelectedItem()).getId());
                        limpiarControles();
                    } catch (ClassNotFoundException ex) {
                    } catch (SQLException ex) {
                    }
                }
            break;
            case 3://Otro
                if (esValidoO()){
                    try {
                        DatosGenerales dg = new DatosGenerales();
                        dg.setNombre(txtNombre.getText());
                        dg.setApellido(txtApellido.getText());
                        dg.setTipoDni(((TipoDni)cmbTipoDocumento.getSelectedItem()).getId());
                        dg.setDni(Integer.parseInt(txtDocumento.getText()));
                        dg.setFechaNacimiento(cmbMes.getSelectedItem().toString() + "/" + cmbDia.getSelectedItem().toString() + "/" + cmbAnio.getSelectedItem().toString());
                        dg.setEmail(txtMail.getText());
                        dg.setTelefono(txtTelefono.getText());
                        JOptionPane.showMessageDialog(null, dg.getTipoDni() + " ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- " + ((TipoDni)cmbTipoDocumento.getSelectedItem()).getId());
                        gi.agregarInscripcionOtro(dg, ((ComboNuevoCursante)cmbCursos.getSelectedItem()).getId());
                        limpiarControles();
                    } catch (ClassNotFoundException ex) {
                    }
                }
            break;
        }
    }//GEN-LAST:event_btnCarcgarActionPerformed

    private void cmbAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAnioActionPerformed
        cargarDiaCombo();
    }//GEN-LAST:event_cmbAnioActionPerformed

    private void cmbMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMesActionPerformed
        cargarDiaCombo();
    }//GEN-LAST:event_cmbMesActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        MenuPrincipal.vRegistrarInscripcion = false;
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
            java.util.logging.Logger.getLogger(RegistrarInscripto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarInscripto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarInscripto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarInscripto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarInscripto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarcgar;
    private javax.swing.JComboBox cmbAnio;
    private javax.swing.JComboBox<String> cmbCursos;
    private javax.swing.JComboBox cmbDia;
    private javax.swing.JComboBox cmbMes;
    private javax.swing.JComboBox<String> cmbTipoDocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtLegajo;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtProfecion;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
    
    
    private void cargaCmb() {
        DefaultComboBoxModel modelAnio = new DefaultComboBoxModel();
        DefaultComboBoxModel modelMes = new DefaultComboBoxModel();
        
        int anio = 1900;
        int mes = 1;
 
        Calendar cal= Calendar.getInstance(); 
        int year = cal.get(Calendar.YEAR); 
        
        while (anio <= year) {            
            modelAnio.addElement(anio);
            anio++;
        }
        cmbAnio.setModel(modelAnio);
        
        while (mes <= 12) {            
            modelMes.addElement(mes);
            mes++;
        }
        cmbMes.setModel(modelMes);
        
    }

    private void cargarDiaCombo() {
        DefaultComboBoxModel modelDia = new DefaultComboBoxModel();
        int dia = 1;
        int mes = cmbMes.getSelectedIndex()+1;

        while (dia <= 28) {            
            modelDia.addElement(dia);
            dia++;
        } 
        
        if(mes == 2){
            if((int)cmbAnio.getSelectedItem()%4 == 0 && ((int)cmbAnio.getSelectedItem()%100 != 0 || (int)cmbAnio.getSelectedItem()%400 == 0)){
                modelDia.addElement(dia);
            }
        }else if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
            while (dia <= 31) {            
                modelDia.addElement(dia);
                dia++;
            }
        }else{
            while (dia <= 30) {            
                modelDia.addElement(dia);
                dia++;
            }
        }
        cmbDia.setModel(modelDia);
    }
    
    public void cargarComboCurso(ArrayList listaGenerica)
    {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        
        for (Object elemento : listaGenerica) {
            model.addElement(elemento);
        }
        
        cmbCursos.setModel(model);
    }

    private boolean esValidoM() {
        try {
            Integer.parseInt(txtLegajo.getText());
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "El legajo debe ser un numero");
            return false;            
        }
        if (cmbCursos.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null, "Seleccione un curso!");
            return false;            
        }
        return true;
    }

    private boolean esValidoF() {
        try{
            Integer.parseInt(txtDocumento.getText());
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "El documento debe ser un numero");
            return false;
        }
        try{
            Integer.parseInt(txtLegajo.getText());
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "El legajo debe ser un numero");
            return false;
        }
        if (txtNombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo nombre no debe estar vacio");
            return false;
        }
        if (txtApellido.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo apellido no debe estar vacio");
            return false;
        }
        if (txtMail.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo mail no debe estar vacio");
            return false;
        }
        if (txtTelefono.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo telefono no debe estar vacio");
            return false;
        }
        if (cmbTipoDocumento.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null, "Seleccione un tipo de documento!");
            return false;
        }
        if (cmbCursos.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null, "Seleccione un curso!");
            return false;
        }
        return true;
    }

    private void cargarComboTipoDni(ArrayList<TipoDni> obtenerTodos) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        
        for (Object elemento : obtenerTodos) {
            model.addElement(elemento);
        }
        
        cmbTipoDocumento.setModel(model);
    }

    private boolean esValidoO() {
        try{
            Integer.parseInt(txtDocumento.getText());
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "El documento debe ser un numero");
            return false;
        }
        if (txtNombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo nombre no debe estar vacio");
            return false;
        }
        if (txtApellido.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo apellido no debe estar vacio");
            return false;
        }
        if (txtMail.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo mail no debe estar vacio");
            return false;
        }
        if (txtTelefono.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo telefono no debe estar vacio");
            return false;
        }
        if (cmbTipoDocumento.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null, "Seleccione un tipo de documento!");
            return false;
        }
        if (cmbCursos.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null, "Seleccione un curso!");
            return false;
        }
        return true;
    }

    private void limpiarControles() {
        txtApellido.setText("");
        txtDocumento.setText("");
        txtLegajo.setText("");
        txtMail.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
        cmbTipoDocumento.setSelectedIndex(-1);
        cmbCursos.setSelectedIndex(-1);
        cmbAnio.setSelectedIndex(0);
        cmbMes.setSelectedIndex(0);
        cmbDia.setSelectedIndex(0);
    }
}
