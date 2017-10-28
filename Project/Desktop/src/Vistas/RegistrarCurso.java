/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Model.Curso;
import Model.GestorCurso;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Yasmin
 */
public class RegistrarCurso extends javax.swing.JFrame {

    GestorCurso g = new GestorCurso();
    String nombre;
    String descripcion;
    String tema;
    int duracion;
    String fecha;
    String aula;
    int cupo;
    double precio;
    String hora;
    int cargaHoraria;

    public RegistrarCurso() {
        initComponents();
        cargaCmb();
        cargarDiaCombo();
        CargaHoraMinutos();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaTema = new javax.swing.JTextArea();
        txtDuracion = new javax.swing.JTextField();
        txtAula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbMes1 = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        cmbDia = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        cmbAnio = new javax.swing.JComboBox();
        txtCupo = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        txtCargaHoraria = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaDescripcion = new javax.swing.JTextArea();
        cmbHora = new javax.swing.JComboBox();
        cmbMinutos = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Curso");
        setAlwaysOnTop(true);
        setIconImage(getIconImage());
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(580, 400));
        setPreferredSize(new java.awt.Dimension(580, 400));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        btnRegistrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/arrow.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(450, 330, 107, 25);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 20, 49, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Descripcion");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 60, 70, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Temas");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 150, 51, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Costo $");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(240, 290, 48, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Duracion en Semanas");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 250, 140, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Aula");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 290, 25, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Cupo");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(130, 290, 33, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Carga Horaria");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 330, 83, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Hora");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(380, 290, 29, 17);

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtNombre);
        txtNombre.setBounds(90, 20, 470, 23);

        txtaTema.setColumns(20);
        txtaTema.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtaTema.setRows(5);
        jScrollPane1.setViewportView(txtaTema);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(90, 140, 470, 80);

        txtDuracion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtDuracion);
        txtDuracion.setBounds(150, 250, 90, 23);

        txtAula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtAula);
        txtAula.setBounds(50, 290, 70, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Fecha de Inicio");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(250, 250, 90, 17);

        cmbMes1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbMes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMes1ActionPerformed(evt);
            }
        });
        getContentPane().add(cmbMes1);
        cmbMes1.setBounds(420, 250, 58, 23);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("/");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(480, 250, 8, 17);

        cmbDia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(cmbDia);
        cmbDia.setBounds(350, 250, 54, 23);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("/");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(410, 250, 8, 17);

        cmbAnio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbAnio.setAutoscrolls(true);
        cmbAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAnioActionPerformed(evt);
            }
        });
        getContentPane().add(cmbAnio);
        cmbAnio.setBounds(490, 250, 70, 23);

        txtCupo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtCupo);
        txtCupo.setBounds(170, 290, 60, 23);

        txtCosto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtCosto);
        txtCosto.setBounds(300, 290, 70, 23);

        txtCargaHoraria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtCargaHoraria);
        txtCargaHoraria.setBounds(110, 330, 80, 23);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText(":");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(490, 290, 8, 17);

        txtaDescripcion.setColumns(20);
        txtaDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtaDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtaDescripcion);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(90, 60, 470, 70);

        cmbHora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(cmbHora);
        cmbHora.setBounds(430, 290, 57, 23);

        cmbMinutos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbMinutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMinutosActionPerformed(evt);
            }
        });
        getContentPane().add(cmbMinutos);
        cmbMinutos.setBounds(500, 290, 60, 23);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoRegistrar.jpg"))); // NOI18N
        jLabel15.setText("jLabel1");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(80, 0, 500, 380);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoRegistrar.jpg"))); // NOI18N
        jLabel16.setText("jLabel1");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(0, 0, 240, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbMes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMes1ActionPerformed
        cargarDiaCombo();
    }//GEN-LAST:event_cmbMes1ActionPerformed

    private void cmbAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAnioActionPerformed
        cargarDiaCombo();
    }//GEN-LAST:event_cmbAnioActionPerformed

    private void cmbMinutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMinutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMinutosActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            if (esValido()){
                nombre = txtNombre.getText();
                descripcion = txtaDescripcion.getText();
                tema = txtaTema.getText();
                duracion = Integer.parseInt(txtDuracion.getText());
                fecha = cmbMes1.getSelectedItem().toString() + "/" + cmbDia.getSelectedItem().toString() + "/" + cmbAnio.getSelectedItem().toString();
                aula = txtAula.getText();
                cupo = Integer.parseInt(txtCupo.getText());
                precio = Double.parseDouble(txtCosto.getText());
                hora = cmbHora.getSelectedItem().toString() + ":" + cmbMinutos.getSelectedItem().toString();
                cargaHoraria = Integer.parseInt(txtCargaHoraria.getText());
                Curso c = new Curso(nombre, descripcion, fecha, tema, duracion, precio, cupo, aula, hora, cargaHoraria);
                g.agregar(c);
            }
        } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        MenuPrincipal.vRegistrarCurso = false;
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
            java.util.logging.Logger.getLogger(RegistrarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarCurso().setVisible(true);
            }
        });
    }

    private void cargaCmb() {
        DefaultComboBoxModel modelAnio = new DefaultComboBoxModel();
        DefaultComboBoxModel modelMes = new DefaultComboBoxModel();

        int anio = 2015;
        int mes = 1;

        Calendar cal = Calendar.getInstance();
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
        cmbMes1.setModel(modelMes);

    }

    private void cargarDiaCombo() {
        DefaultComboBoxModel modelDia = new DefaultComboBoxModel();
        int dia = 1;
        int mes = cmbMes1.getSelectedIndex() + 1;

        while (dia <= 28) {
            modelDia.addElement(dia);
            dia++;
        }

        if (mes == 2) {
            if ((int) cmbAnio.getSelectedItem() % 4 == 0 && ((int) cmbAnio.getSelectedItem() % 100 != 0 || (int) cmbAnio.getSelectedItem() % 400 == 0)) {
                modelDia.addElement(dia);
            }
        } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            while (dia <= 31) {
                modelDia.addElement(dia);
                dia++;
            }
        } else {
            while (dia <= 30) {
                modelDia.addElement(dia);
                dia++;
            }
        }
        cmbDia.setModel(modelDia);
    }

    private void CargaHoraMinutos() {
        DefaultComboBoxModel modelH = new DefaultComboBoxModel();
        DefaultComboBoxModel modelM = new DefaultComboBoxModel();

        int hora = 0;
        int min = 0;

        while (hora < 24) {
            modelH.addElement(hora);
            hora++;
        }
        cmbHora.setModel(modelH);

        while (min < 60) {
            modelM.addElement(min);
            min++;
        }
        cmbMinutos.setModel(modelM);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox cmbAnio;
    private javax.swing.JComboBox cmbDia;
    private javax.swing.JComboBox cmbHora;
    private javax.swing.JComboBox cmbMes1;
    private javax.swing.JComboBox cmbMinutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtAula;
    private javax.swing.JTextField txtCargaHoraria;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtCupo;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtaDescripcion;
    private javax.swing.JTextArea txtaTema;
    // End of variables declaration//GEN-END:variables

    private boolean esValido() {
        if (txtNombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo nombre no debe estar vacio!");
            return false;
        }
        if (txtaDescripcion.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo descripcion no debe estar vacio!");
            return false;
        }
        if (txtaTema.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo tema no debe estar vacio!");
            return false;
        }
        if (txtAula.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo aula no debe estar vacio!");
            return false;
        }
        try {
            Integer.parseInt(txtDuracion.getText());
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "El campo duracion debe ser un numero!");
            return false;
        }
        try {
            Integer.parseInt(txtCargaHoraria.getText());
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "El campo carga horaria debe ser un numero!");
            return false;
        }
        try {
            Integer.parseInt(txtCupo.getText());
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "El campo cupo debe ser un numero!");
            return false;
        }
        try {
            Double.parseDouble(txtCosto.getText());
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "El campo costo debe ser un numero!");
            return false;
        }
        return true;
    }
}
