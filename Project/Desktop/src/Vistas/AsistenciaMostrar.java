/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Model.ComboCurso;
import Model.Curso;
import Model.DatosGenerales;
import Model.GestorAsistencia;
import Model.GestorCurso;
import Model.GestorDatosGenerales;
import Model.VMCertificado;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import com.itextpdf.text.*;
import com.itextpdf.text.Font.FontStyle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPHeaderCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfString;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yasmin
 */
public class AsistenciaMostrar extends javax.swing.JFrame {

    GestorCurso g;
    GestorDatosGenerales gd;
    ArrayList<ArrayList<String>> lista;
    ArrayList<VMCertificado> vc;
    GestorAsistencia ga;
    private int interfas;

    public AsistenciaMostrar() {
        initComponents();
        g = new GestorCurso();
        gd = new GestorDatosGenerales();
        ga = new GestorAsistencia();
        try {
            cargarComboCurso(g.ComboCursosActuales());
        } catch (SQLException ex) {
            Logger.getLogger(AsistenciaMostrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AsistenciaMostrar.class.getName()).log(Level.SEVERE, null, ex);
        }
        cargarDiaCombo();
        cargaCmb();
        this.setLocationRelativeTo(null);
    }

    public AsistenciaMostrar(int x) {
        initComponents();
        cargarDiaCombo();
        cargaCmb();
        g = new GestorCurso();
        ga = new GestorAsistencia();
        try {

            cargarComboCurso(g.ComboCursosActuales());
        } catch (SQLException ex) {
            Logger.getLogger(AsistenciaRegistrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AsistenciaRegistrar.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setLocationRelativeTo(null);

        interfas = x;
        switch (interfas) {
            case 1: //Curso
                cmbCursos.setEnabled(true);
                cmbAnio.setEnabled(false);
                cmbMes.setEnabled(false);
                cmbDia.setEnabled(false);
                txtMail.setEnabled(false);
                break;
            case 2: //Curso & Fecha
                cmbCursos.setEnabled(true);
                cmbAnio.setEnabled(true);
                cmbMes.setEnabled(true);
                cmbDia.setEnabled(true);
                txtMail.setEnabled(false);
                break;
            case 3://Curso & Alumno
                cmbCursos.setEnabled(true);
                cmbAnio.setEnabled(false);
                cmbMes.setEnabled(false);
                cmbDia.setEnabled(false);
                txtMail.setEnabled(true);
                break;
        }

    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Imagenes/IconoDefinitivo.jpg"));
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaAsistencias = new javax.swing.JTable();
        cmbCursos = new javax.swing.JComboBox();
        btnGenerarCertificado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbAnio = new javax.swing.JComboBox();
        cmbMes = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        cmbDia = new javax.swing.JComboBox();
        txtMail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Asistencias (Vista)");
        setAlwaysOnTop(true);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(695, 475));
        setPreferredSize(new java.awt.Dimension(695, 475));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jtTablaAsistencias.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtTablaAsistencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Alumno", "Fercha 1", "Fercha 2", "Fercha 3"
            }
        ));
        jtTablaAsistencias.setPreferredSize(new java.awt.Dimension(400, 288));
        jScrollPane1.setViewportView(jtTablaAsistencias);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 80, 690, 330);

        cmbCursos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCursosActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCursos);
        cmbCursos.setBounds(60, 10, 350, 23);

        btnGenerarCertificado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGenerarCertificado.setText("Generar Certificado");
        btnGenerarCertificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarCertificadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerarCertificado);
        btnGenerarCertificado.setBounds(530, 410, 150, 25);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Curso");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 20, 36, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Fecha");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(426, 14, 36, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("/");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(520, 14, 7, 17);

        cmbAnio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbAnio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2017" }));
        cmbAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAnioActionPerformed(evt);
            }
        });
        getContentPane().add(cmbAnio);
        cmbAnio.setBounds(590, 10, 70, 23);

        cmbMes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1" }));
        cmbMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMesActionPerformed(evt);
            }
        });
        getContentPane().add(cmbMes);
        cmbMes.setBounds(526, 10, 50, 23);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("/");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(580, 10, 7, 17);

        cmbDia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1" }));
        getContentPane().add(cmbDia);
        cmbDia.setBounds(466, 11, 50, 23);

        txtMail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtMail);
        txtMail.setBounds(61, 45, 520, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Mail");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(22, 48, 21, 17);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/images.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 300, 170);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Filtrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(590, 40, 70, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/images.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(600, 0, 300, 170);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/images.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(300, 0, 300, 170);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/images.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 280, 300, 170);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/images.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(300, 280, 300, 170);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/images.jpg"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(600, 280, 300, 170);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAnioActionPerformed
        cargarDiaCombo();
    }//GEN-LAST:event_cmbAnioActionPerformed

    private void cmbMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMesActionPerformed
        cargarDiaCombo();
    }//GEN-LAST:event_cmbMesActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        MenuPrincipal.vAsistenciasMostrar = false;
    }//GEN-LAST:event_formWindowClosing

    private void btnGenerarCertificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarCertificadoActionPerformed

        try {
            vc = ga.obtenerDatosCertificado();
            for (VMCertificado c : vc) {
                String alumno = c.getAlumno();
                String documento = c.getDocumento();
                String fechaInicio = c.getFechaInicio();
                String fechaFinal = c.getFechaFinal();
                String horas = c.getHoras();
                String nombreCurso = c.getNombreCurso();

                generarCertificado(alumno, documento, fechaInicio, fechaFinal, horas, nombreCurso);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AsistenciaMostrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AsistenciaMostrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGenerarCertificadoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        switch (interfas) {
            case 1: //Curso
                cargarCurso();
                break;
            case 2: {
                try {
                    //Curso & Fecha
                    cargarCursoYFecha();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AsistenciaMostrar.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(AsistenciaMostrar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case 3://Curso & Alumno
                cargarCursoCursante();
                break;
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmbCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCursosActionPerformed
    }//GEN-LAST:event_cmbCursosActionPerformed

    public void generarCertificado(String alumno, String documento, String fechaInicio, String fechaCierre, String horas, String curso) {
        try {
            Document doc = new Document(PageSize.A4.rotate());
            PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("C:\\Users\\Gabriel\\Desktop\\Carpeta Recibos\\Certificado" + alumno + ".pdf"));

            doc.open();

//            //seteamos el titulo
//            Font letraTitulo = FontFactory.getFont("Verdana", 24, Font.UNDERLINE);
//            Paragraph title = new Paragraph("Certificado", letraTitulo);
//            title.setAlignment(Element.ALIGN_CENTER);
            //seteamos la imagen de certificado que utilizaremos
            com.itextpdf.text.Image certificado = com.itextpdf.text.Image.getInstance("src/Imagenes/certificado.jpg");
            float width = doc.getPageSize().getWidth();
            float height = doc.getPageSize().getHeight();
            writer.getDirectContentUnder().addImage(certificado, width, 0, 0, height, 0, 0);

            //seteamos el contenido del mensaje
            Font letraContenido = FontFactory.getFont(FontFactory.TIMES_ROMAN, 20, Font.ITALIC);
            Paragraph contenido = new Paragraph("  ", letraContenido);
            Paragraph contenido1 = new Paragraph("Se hace constar que el alumno " + alumno + ", con Documento Nro: " + documento + "\n Asistió y aprobó el curso " + curso, letraContenido);
            contenido1.setIndentationLeft(90);
            contenido1.setSpacingBefore(120);

            //seteamos el contenido del mensaje
            Font letraContenido2 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 20, Font.ITALIC);
            Paragraph contenido2 = new Paragraph("con una duracion de " + horas + " horas semanales  \n desde: " + fechaInicio + "hasta: " + fechaCierre, letraContenido2);
            contenido2.setIndentationLeft(0);
            contenido2.setSpacingBefore(70);
            contenido2.setAlignment(Element.ALIGN_CENTER);

            //pasamos al documento (por orden) las cosas que deseamos mostrar
            doc.add(contenido);
            doc.add(contenido1);
            doc.add(contenido2);

            doc.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (DocumentException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

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
            java.util.logging.Logger.getLogger(AsistenciaMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsistenciaMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsistenciaMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsistenciaMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AsistenciaMostrar().setVisible(true);
            }
        });
    }

    private void cargaCmb() {
        DefaultComboBoxModel modelAnio = new DefaultComboBoxModel();
        DefaultComboBoxModel modelMes = new DefaultComboBoxModel();

        int anio = 1900;
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
        cmbMes.setModel(modelMes);

    }

    private void cargarDiaCombo() {
        DefaultComboBoxModel modelDia = new DefaultComboBoxModel();
        int dia = 1;
        int mes = cmbMes.getSelectedIndex() + 1;

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarCertificado;
    private javax.swing.JComboBox cmbAnio;
    private javax.swing.JComboBox cmbCursos;
    private javax.swing.JComboBox cmbDia;
    private javax.swing.JComboBox cmbMes;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtTablaAsistencias;
    private javax.swing.JTextField txtMail;
    // End of variables declaration//GEN-END:variables
public void cargarComboCurso(ArrayList listaGenerica) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();

        for (Object elemento : listaGenerica) {
            model.addElement(elemento);
        }

        cmbCursos.setModel(model);
    }

    private void cargarCursoYFecha() throws ClassNotFoundException, SQLException {
        String fecha = cmbAnio.getSelectedItem().toString() + "/" + cmbMes.getSelectedItem().toString() + "/" + cmbDia.getSelectedItem().toString();
        lista = ga.obtenerAsistenciasPorCursoPorFecha(((ComboCurso) cmbCursos.getSelectedItem()).getId(), fecha);
        DefaultTableModel model = new DefaultTableModel();
        Object[] nombreColumna = new Object[lista.size()];//new ArrayList[lista.get(1).size()];
        Object[] contenido = new Object[lista.get(0).size()];
        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.get(0).size(); j++) {
                if (j == 0) {
                    nombreColumna[i] = lista.get(i).get(j);
                }
            }
        }
        model.setColumnIdentifiers(nombreColumna);

        for (int j = 0; j < lista.get(0).size(); j++) {
            for (int i = 0; i < lista.size(); i++) {/*
                    if (i == 0 && j != 0) {
                        contenido[j-1] = lista.get(i).get(j);
                    } else if(j!= 0) {
                        contenido[j-1] = lista.get(i).get(j);
                    }*/
                if (j != 0) {
                    contenido[i] = lista.get(i).get(j);
                }

                System.out.println("" + j + "   -   " + lista.get(i).get(j));
            }
            if (j != 0) {
                model.addRow(contenido);
            }
        }
        jtTablaAsistencias.setModel(model);//new JTable(model);
        //JOptionPane.showMessageDialog(null, new JScrollPane(tRegistrarAsistencia));       
    }

    public void cargarCurso() {
        try {
            lista = ga.obtenerAsistenciasPorCurso(((ComboCurso) cmbCursos.getSelectedItem()).getId());
            DefaultTableModel model = new DefaultTableModel();
            Object[] nombreColumna = new Object[lista.size()];//new ArrayList[lista.get(1).size()];
            Object[] contenido = new Object[lista.get(0).size()];
            for (int i = 0; i < lista.size(); i++) {
                for (int j = 0; j < lista.get(0).size(); j++) {
                    if (j == 0) {
                        nombreColumna[i] = lista.get(i).get(j);
                    }
                }
            }
            model.setColumnIdentifiers(nombreColumna);

            for (int j = 0; j < lista.get(0).size(); j++) {
                for (int i = 0; i < lista.size(); i++) {/*
                    if (i == 0 && j != 0) {
                        contenido[j-1] = lista.get(i).get(j);
                    } else if(j!= 0) {
                        contenido[j-1] = lista.get(i).get(j);
                    }*/
                    if (j != 0) {
                        contenido[i] = lista.get(i).get(j);
                    }

                    System.out.println("" + j + "   -   " + lista.get(i).get(j));
                }
                if (j != 0) {
                    model.addRow(contenido);
                }
            }
            jtTablaAsistencias.setModel(model);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AsistenciaMostrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AsistenciaMostrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cargarCursoCursante() {
        try {
            lista = ga.obtenerAsistenciasPorCursoPorMail(((ComboCurso) cmbCursos.getSelectedItem()).getId(), txtMail.getText());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AsistenciaMostrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AsistenciaMostrar.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultTableModel model = new DefaultTableModel();
        Object[] nombreColumna = new Object[lista.size()];//new ArrayList[lista.get(1).size()];
        Object[] contenido = new Object[lista.get(0).size()];
        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.get(0).size(); j++) {
                if (j == 0) {
                    nombreColumna[i] = lista.get(i).get(j);
                }
            }
        }
        model.setColumnIdentifiers(nombreColumna);

        for (int j = 0; j < lista.get(0).size(); j++) {
            for (int i = 0; i < lista.size(); i++) {/*
                    if (i == 0 && j != 0) {
                        contenido[j-1] = lista.get(i).get(j);
                    } else if(j!= 0) {
                        contenido[j-1] = lista.get(i).get(j);
                    }*/
                if (j != 0) {
                    contenido[i] = lista.get(i).get(j);
                }

                System.out.println("" + j + "   -   " + lista.get(i).get(j));
            }
            if (j != 0) {
                model.addRow(contenido);
            }
        }
    }
}
