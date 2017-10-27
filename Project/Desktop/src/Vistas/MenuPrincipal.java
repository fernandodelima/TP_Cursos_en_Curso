/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import javafx.scene.layout.Background;
import javax.swing.JFrame;

/**
 *
 * @author Yasmin
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public static boolean vRegistrarMatriculado = false;
    public static boolean vRegistrarInscripcion = false;//3
    public static boolean vRegistrarCurso = false;
    public static boolean vRegistrarPago = false;
    
    public static boolean vEditarMatriculado = false;
    public static boolean vEditarInscripcion = false;//3
    public static boolean vEditarCurso = false;
    
    public static boolean vAsistenciasRegistrar = false;
    public static boolean vAsistenciasMostrar = false;//3
    
    public static boolean vConsultaCurso = false;
    public static boolean vConsultaPreInscripcion = false;
    public static boolean vConsultaInscripcion = false;
    public static boolean vConsultaPago = false;
    
    public MenuPrincipal() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
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

        jMenu2 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        lblImagen = new javax.swing.JLabel();
        jmbBarraMenu = new javax.swing.JMenuBar();
        jmRegistrar = new javax.swing.JMenu();
        jmiRegistrarMatriculaddo = new javax.swing.JMenuItem();
        jmiRegistrarInscripto = new javax.swing.JMenu();
        jmiRegistrarInscriptoMatriculado = new javax.swing.JMenuItem();
        jmiRegistrarInscriptoFamilia = new javax.swing.JMenuItem();
        jmiRegistrarInscriptoOtro = new javax.swing.JMenuItem();
        jmiRegistrarCurso = new javax.swing.JMenuItem();
        jmiRegistrarPago = new javax.swing.JMenuItem();
        jmAsistencia = new javax.swing.JMenu();
        jmiAsistenciaRegistrar = new javax.swing.JMenuItem();
        jmiRegistrarInscripto1 = new javax.swing.JMenu();
        jmiAsistenciaMostrarXCurso = new javax.swing.JMenuItem();
        jmiAsistenciaMostrarXFecha = new javax.swing.JMenuItem();
        jmiAsistenciaMostrarXCursante = new javax.swing.JMenuItem();
        jmEditar = new javax.swing.JMenu();
        jmiEditarMatriculado = new javax.swing.JMenuItem();
        jmiEditarIscripcion = new javax.swing.JMenu();
        jmiEditarIscripcionMatriculado = new javax.swing.JMenuItem();
        jmiEditarIscripcionFamilia = new javax.swing.JMenuItem();
        jmiEditarIscripcionOtro = new javax.swing.JMenuItem();
        jmiEditarCurso = new javax.swing.JMenuItem();
        jmConsulta = new javax.swing.JMenu();
        jmiConsultaCursos = new javax.swing.JMenuItem();
        jmiConsultaPreInscripcion = new javax.swing.JMenuItem();
        jmiConsultaInscripto = new javax.swing.JMenuItem();
        jmiConsultaPagos = new javax.swing.JMenuItem();

        jMenu2.setText("jMenu2");

        setTitle("Principal");
        setIconImage(getIconImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoPrincipal.jpg"))); // NOI18N

        jmbBarraMenu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jmRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add (2).png"))); // NOI18N
        jmRegistrar.setText("Registar");
        jmRegistrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jmiRegistrarMatriculaddo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jmiRegistrarMatriculaddo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user.png"))); // NOI18N
        jmiRegistrarMatriculaddo.setText("Matriculado");
        jmiRegistrarMatriculaddo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRegistrarMatriculaddoActionPerformed(evt);
            }
        });
        jmRegistrar.add(jmiRegistrarMatriculaddo);

        jmiRegistrarInscripto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/}.png"))); // NOI18N
        jmiRegistrarInscripto.setText("Inscripción");
        jmiRegistrarInscripto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jmiRegistrarInscriptoMatriculado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jmiRegistrarInscriptoMatriculado.setText("Matriculado");
        jmiRegistrarInscriptoMatriculado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRegistrarInscriptoMatriculadoActionPerformed(evt);
            }
        });
        jmiRegistrarInscripto.add(jmiRegistrarInscriptoMatriculado);

        jmiRegistrarInscriptoFamilia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jmiRegistrarInscriptoFamilia.setText("Familiar");
        jmiRegistrarInscriptoFamilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRegistrarInscriptoFamiliaActionPerformed(evt);
            }
        });
        jmiRegistrarInscripto.add(jmiRegistrarInscriptoFamilia);

        jmiRegistrarInscriptoOtro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jmiRegistrarInscriptoOtro.setText("Otro");
        jmiRegistrarInscriptoOtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRegistrarInscriptoOtroActionPerformed(evt);
            }
        });
        jmiRegistrarInscripto.add(jmiRegistrarInscriptoOtro);

        jmRegistrar.add(jmiRegistrarInscripto);

        jmiRegistrarCurso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jmiRegistrarCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/document.png"))); // NOI18N
        jmiRegistrarCurso.setText("Curso");
        jmiRegistrarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRegistrarCursoActionPerformed(evt);
            }
        });
        jmRegistrar.add(jmiRegistrarCurso);

        jmiRegistrarPago.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jmiRegistrarPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/send.png"))); // NOI18N
        jmiRegistrarPago.setText("Pago");
        jmiRegistrarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRegistrarPagoActionPerformed(evt);
            }
        });
        jmRegistrar.add(jmiRegistrarPago);

        jmbBarraMenu.add(jmRegistrar);

        jmAsistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calender (1).png"))); // NOI18N
        jmAsistencia.setText("Asistencia");
        jmAsistencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jmiAsistenciaRegistrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jmiAsistenciaRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/document (1).png"))); // NOI18N
        jmiAsistenciaRegistrar.setText("Registrar");
        jmiAsistenciaRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAsistenciaRegistrarActionPerformed(evt);
            }
        });
        jmAsistencia.add(jmiAsistenciaRegistrar);

        jmiRegistrarInscripto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/list2.png"))); // NOI18N
        jmiRegistrarInscripto1.setText("Mostrar");
        jmiRegistrarInscripto1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jmiAsistenciaMostrarXCurso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jmiAsistenciaMostrarXCurso.setText("Por Curso");
        jmiAsistenciaMostrarXCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAsistenciaMostrarXCursoActionPerformed(evt);
            }
        });
        jmiRegistrarInscripto1.add(jmiAsistenciaMostrarXCurso);

        jmiAsistenciaMostrarXFecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jmiAsistenciaMostrarXFecha.setText("Por Curso/Fecha ");
        jmiAsistenciaMostrarXFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAsistenciaMostrarXFechaActionPerformed(evt);
            }
        });
        jmiRegistrarInscripto1.add(jmiAsistenciaMostrarXFecha);

        jmiAsistenciaMostrarXCursante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jmiAsistenciaMostrarXCursante.setText("Por Curso/Cursante");
        jmiAsistenciaMostrarXCursante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAsistenciaMostrarXCursanteActionPerformed(evt);
            }
        });
        jmiRegistrarInscripto1.add(jmiAsistenciaMostrarXCursante);

        jmAsistencia.add(jmiRegistrarInscripto1);

        jmbBarraMenu.add(jmAsistencia);

        jmEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gear.png"))); // NOI18N
        jmEditar.setText("Editar");
        jmEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jmiEditarMatriculado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jmiEditarMatriculado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user.png"))); // NOI18N
        jmiEditarMatriculado.setText("Matriculado");
        jmiEditarMatriculado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEditarMatriculadoActionPerformed(evt);
            }
        });
        jmEditar.add(jmiEditarMatriculado);

        jmiEditarIscripcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/}.png"))); // NOI18N
        jmiEditarIscripcion.setText("Inscripción");
        jmiEditarIscripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jmiEditarIscripcionMatriculado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jmiEditarIscripcionMatriculado.setText("Matriculado");
        jmiEditarIscripcionMatriculado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEditarIscripcionMatriculadoActionPerformed(evt);
            }
        });
        jmiEditarIscripcion.add(jmiEditarIscripcionMatriculado);

        jmiEditarIscripcionFamilia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jmiEditarIscripcionFamilia.setText("Familiar");
        jmiEditarIscripcionFamilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEditarIscripcionFamiliaActionPerformed(evt);
            }
        });
        jmiEditarIscripcion.add(jmiEditarIscripcionFamilia);

        jmiEditarIscripcionOtro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jmiEditarIscripcionOtro.setText("Otro");
        jmiEditarIscripcionOtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEditarIscripcionOtroActionPerformed(evt);
            }
        });
        jmiEditarIscripcion.add(jmiEditarIscripcionOtro);

        jmEditar.add(jmiEditarIscripcion);

        jmiEditarCurso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jmiEditarCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/document.png"))); // NOI18N
        jmiEditarCurso.setText("Curso");
        jmiEditarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEditarCursoActionPerformed(evt);
            }
        });
        jmEditar.add(jmiEditarCurso);

        jmbBarraMenu.add(jmEditar);

        jmConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        jmConsulta.setText("Consultas");
        jmConsulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jmiConsultaCursos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jmiConsultaCursos.setText("Cursos");
        jmiConsultaCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultaCursosActionPerformed(evt);
            }
        });
        jmConsulta.add(jmiConsultaCursos);

        jmiConsultaPreInscripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jmiConsultaPreInscripcion.setText("Pre_inscriptos");
        jmiConsultaPreInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultaPreInscripcionActionPerformed(evt);
            }
        });
        jmConsulta.add(jmiConsultaPreInscripcion);

        jmiConsultaInscripto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jmiConsultaInscripto.setText("Inscriptos");
        jmiConsultaInscripto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultaInscriptoActionPerformed(evt);
            }
        });
        jmConsulta.add(jmiConsultaInscripto);

        jmiConsultaPagos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jmiConsultaPagos.setText("Pagos");
        jmiConsultaPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultaPagosActionPerformed(evt);
            }
        });
        jmConsulta.add(jmiConsultaPagos);

        jmbBarraMenu.add(jmConsulta);

        setJMenuBar(jmbBarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblImagen)
                .addGap(0, 31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblImagen)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiRegistrarMatriculaddoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRegistrarMatriculaddoActionPerformed
        if (vRegistrarMatriculado == false) {
            vRegistrarMatriculado = true;
            RegistrarMatriculado rm = new RegistrarMatriculado();
            rm.setVisible(true);
        }
    }//GEN-LAST:event_jmiRegistrarMatriculaddoActionPerformed

    private void jmiRegistrarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRegistrarCursoActionPerformed
        if (vRegistrarCurso == false) {
            vRegistrarCurso = true;
            RegistrarCurso rc = new RegistrarCurso();
            rc.setVisible(true);
        }
    }//GEN-LAST:event_jmiRegistrarCursoActionPerformed

    private void jmiRegistrarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRegistrarPagoActionPerformed
        if (vRegistrarPago == false) {
            vRegistrarPago = true;
            RegistrarPago rp = new RegistrarPago();
            rp.setVisible(true);
        }
    }//GEN-LAST:event_jmiRegistrarPagoActionPerformed

    private void jmiAsistenciaRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAsistenciaRegistrarActionPerformed
        if (vAsistenciasRegistrar == false) {
            vAsistenciasRegistrar = true;
            AsistenciaRegistrar ar = new AsistenciaRegistrar();
            ar.setVisible(true);
        }
    }//GEN-LAST:event_jmiAsistenciaRegistrarActionPerformed

    private void jmiEditarMatriculadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEditarMatriculadoActionPerformed
        if (vEditarMatriculado == false) {
            vEditarMatriculado = true;
            EditarMatriculado em = new EditarMatriculado();
            em.setVisible(true);
        }
      
    }//GEN-LAST:event_jmiEditarMatriculadoActionPerformed

    private void jmiEditarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEditarCursoActionPerformed
        if (vEditarCurso == false) {
            vEditarCurso = true;
            EditarCurso ec = new EditarCurso();
            ec.setVisible(true);
        }
    }//GEN-LAST:event_jmiEditarCursoActionPerformed

    private void jmiConsultaCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultaCursosActionPerformed
        if (vConsultaCurso == false) {
            vConsultaCurso = true;
            ConsultaCurso cc = new ConsultaCurso();
            cc.setVisible(true);
        }
    }//GEN-LAST:event_jmiConsultaCursosActionPerformed

    private void jmiConsultaPreInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultaPreInscripcionActionPerformed
        if (vConsultaPreInscripcion == false) {
            vConsultaPreInscripcion = true;
            ConsultaPreInscripcion cpi = new ConsultaPreInscripcion();
            cpi.setVisible(true);
        }
    }//GEN-LAST:event_jmiConsultaPreInscripcionActionPerformed

    private void jmiConsultaInscriptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultaInscriptoActionPerformed
        if (vConsultaInscripcion == false) {
            vConsultaInscripcion = true;
            ConsultaInscripcion ci = new ConsultaInscripcion();
            ci.setVisible(true);
        }
    }//GEN-LAST:event_jmiConsultaInscriptoActionPerformed

    private void jmiConsultaPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultaPagosActionPerformed
        if (vConsultaPago == false) {
            vConsultaPago = true;
            ConsultaPago cp = new ConsultaPago();
            cp.setVisible(true);
        }
    }//GEN-LAST:event_jmiConsultaPagosActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        VentanaCerrarSesion vp = new VentanaCerrarSesion();
        this.setVisible(false);
        vp.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void jmiRegistrarInscriptoMatriculadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRegistrarInscriptoMatriculadoActionPerformed
        if (vRegistrarInscripcion == false) {
            vRegistrarInscripcion = true;
            RegistrarInscripto ri = new RegistrarInscripto(1);//Matriculado
            ri.setVisible(true);
        }
    }//GEN-LAST:event_jmiRegistrarInscriptoMatriculadoActionPerformed

    private void jmiRegistrarInscriptoFamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRegistrarInscriptoFamiliaActionPerformed
        if (vRegistrarInscripcion == false) {
            vRegistrarInscripcion = true;
            RegistrarInscripto ri = new RegistrarInscripto(2);//Familiar
            ri.setVisible(true);
        }
    }//GEN-LAST:event_jmiRegistrarInscriptoFamiliaActionPerformed

    private void jmiRegistrarInscriptoOtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRegistrarInscriptoOtroActionPerformed
        if (vRegistrarInscripcion == false) {
            vRegistrarInscripcion = true;
            RegistrarInscripto ri = new RegistrarInscripto(3);//Otro
            ri.setVisible(true);
        }
    }//GEN-LAST:event_jmiRegistrarInscriptoOtroActionPerformed

    private void jmiEditarIscripcionMatriculadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEditarIscripcionMatriculadoActionPerformed
        if (vEditarInscripcion == false) {
            vEditarInscripcion = true;
            EditarInscripcion ei = new EditarInscripcion(1);//Matriculado
            ei.setVisible(true);
        }
    }//GEN-LAST:event_jmiEditarIscripcionMatriculadoActionPerformed

    private void jmiEditarIscripcionFamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEditarIscripcionFamiliaActionPerformed
        if (vEditarInscripcion == false) {
            vEditarInscripcion = true;
            EditarInscripcion ei = new EditarInscripcion(2);//Familiar
            ei.setVisible(true);
        }
    }//GEN-LAST:event_jmiEditarIscripcionFamiliaActionPerformed

    private void jmiEditarIscripcionOtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEditarIscripcionOtroActionPerformed
        if (vEditarInscripcion == false) {
            vEditarInscripcion = true;
            EditarInscripcion ei = new EditarInscripcion(3);//Otro
            ei.setVisible(true);
        }
    }//GEN-LAST:event_jmiEditarIscripcionOtroActionPerformed

    private void jmiAsistenciaMostrarXCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAsistenciaMostrarXCursoActionPerformed
        if (vAsistenciasMostrar == false) {
            vAsistenciasMostrar = true;
            AsistenciaMostrar am = new AsistenciaMostrar (1);
            am.setVisible(true);
        }
    }//GEN-LAST:event_jmiAsistenciaMostrarXCursoActionPerformed

    private void jmiAsistenciaMostrarXFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAsistenciaMostrarXFechaActionPerformed
        if (vAsistenciasMostrar == false) {
            vAsistenciasMostrar = true;
            AsistenciaMostrar am = new AsistenciaMostrar (2);
            am.setVisible(true);
        }
    }//GEN-LAST:event_jmiAsistenciaMostrarXFechaActionPerformed

    private void jmiAsistenciaMostrarXCursanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAsistenciaMostrarXCursanteActionPerformed
        if (vAsistenciasMostrar == false) {
            vAsistenciasMostrar = true;
            AsistenciaMostrar am = new AsistenciaMostrar (3);
            am.setVisible(true);
        }
    }//GEN-LAST:event_jmiAsistenciaMostrarXCursanteActionPerformed

    
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JMenu jmAsistencia;
    private javax.swing.JMenu jmConsulta;
    private javax.swing.JMenu jmEditar;
    private javax.swing.JMenu jmRegistrar;
    private javax.swing.JMenuBar jmbBarraMenu;
    private javax.swing.JMenuItem jmiAsistenciaMostrarXCursante;
    private javax.swing.JMenuItem jmiAsistenciaMostrarXCurso;
    private javax.swing.JMenuItem jmiAsistenciaMostrarXFecha;
    private javax.swing.JMenuItem jmiAsistenciaRegistrar;
    private javax.swing.JMenuItem jmiConsultaCursos;
    private javax.swing.JMenuItem jmiConsultaInscripto;
    private javax.swing.JMenuItem jmiConsultaPagos;
    private javax.swing.JMenuItem jmiConsultaPreInscripcion;
    private javax.swing.JMenuItem jmiEditarCurso;
    private javax.swing.JMenu jmiEditarIscripcion;
    private javax.swing.JMenuItem jmiEditarIscripcionFamilia;
    private javax.swing.JMenuItem jmiEditarIscripcionMatriculado;
    private javax.swing.JMenuItem jmiEditarIscripcionOtro;
    private javax.swing.JMenuItem jmiEditarMatriculado;
    private javax.swing.JMenuItem jmiRegistrarCurso;
    private javax.swing.JMenu jmiRegistrarInscripto;
    private javax.swing.JMenu jmiRegistrarInscripto1;
    private javax.swing.JMenuItem jmiRegistrarInscriptoFamilia;
    private javax.swing.JMenuItem jmiRegistrarInscriptoMatriculado;
    private javax.swing.JMenuItem jmiRegistrarInscriptoOtro;
    private javax.swing.JMenuItem jmiRegistrarMatriculaddo;
    private javax.swing.JMenuItem jmiRegistrarPago;
    private javax.swing.JLabel lblImagen;
    // End of variables declaration//GEN-END:variables
}
