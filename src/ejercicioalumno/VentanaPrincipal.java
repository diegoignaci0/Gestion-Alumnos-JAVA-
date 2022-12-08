/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioalumno;

import javax.swing.JOptionPane;

/**
 *
 * @author sonia
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    Manejadora mane=new Manejadora();
    public VentanaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIngresar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnNotaFinal = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuIngresar = new javax.swing.JMenuItem();
        mnuEliminar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuTodo = new javax.swing.JMenuItem();
        mnuNotaFinal = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnIngresar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(0, 0, 153));
        btnIngresar.setText("Ingresar Alumno");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnMostrar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnMostrar.setForeground(new java.awt.Color(0, 0, 153));
        btnMostrar.setText("Mostrar Todo");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnNotaFinal.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnNotaFinal.setForeground(new java.awt.Color(0, 0, 153));
        btnNotaFinal.setText("Nota Final y Situación");
        btnNotaFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotaFinalActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 153));
        btnEliminar.setText("Eliminar Alumno");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jMenu1.setText("Alumno");

        mnuIngresar.setText("Ingresar");
        mnuIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuIngresarActionPerformed(evt);
            }
        });
        jMenu1.add(mnuIngresar);

        mnuEliminar.setText("Eliminar");
        mnuEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEliminarActionPerformed(evt);
            }
        });
        jMenu1.add(mnuEliminar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Mostrar");

        mnuTodo.setText("Todo");
        mnuTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTodoActionPerformed(evt);
            }
        });
        jMenu2.add(mnuTodo);

        mnuNotaFinal.setText("Nota Final");
        mnuNotaFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNotaFinalActionPerformed(evt);
            }
        });
        jMenu2.add(mnuNotaFinal);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNotaFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(btnIngresar)
                .addGap(18, 18, 18)
                .addComponent(btnMostrar)
                .addGap(18, 18, 18)
                .addComponent(btnNotaFinal)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        VentanaIngreso ven=new VentanaIngreso(mane);
        ven.setVisible(true);
        ven.setLocationRelativeTo(null);
        ven.setTitle("Ingreso");
        ven.setResizable(false);
        ven.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        VentanaMostrar ven=new VentanaMostrar(mane);
        ven.setVisible(true);
        ven.setLocationRelativeTo(null);
        ven.setTitle("Mostrar");
        ven.setResizable(false);
        ven.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnNotaFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotaFinalActionPerformed
        String rut=JOptionPane.showInputDialog(this, "Ingrese Rut");
        int pos=mane.buscarAlumno(rut);
        if(pos==-1)
            JOptionPane.showMessageDialog(this, "Alumno no existe");
        else
        {
            double ne=Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese nota examen"));
            JOptionPane.showMessageDialog(this, "Nota Final: "+
                    mane.getAlumnos().get(pos).notaFinal(ne)+
                    mane.getAlumnos().get(pos).situacion(ne));
        }
        
    }//GEN-LAST:event_btnNotaFinalActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String rut=JOptionPane.showInputDialog(this, "ingrese Rut");
        JOptionPane.showMessageDialog(this, mane.eliminarAlumno(rut));
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void mnuIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuIngresarActionPerformed
        btnIngresarActionPerformed(evt);
    }//GEN-LAST:event_mnuIngresarActionPerformed

    private void mnuEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEliminarActionPerformed
        btnEliminarActionPerformed(evt);
    }//GEN-LAST:event_mnuEliminarActionPerformed

    private void mnuTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTodoActionPerformed
        btnMostrarActionPerformed(evt);
    }//GEN-LAST:event_mnuTodoActionPerformed

    private void mnuNotaFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNotaFinalActionPerformed
        btnNotaFinalActionPerformed(evt);
    }//GEN-LAST:event_mnuNotaFinalActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnNotaFinal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuEliminar;
    private javax.swing.JMenuItem mnuIngresar;
    private javax.swing.JMenuItem mnuNotaFinal;
    private javax.swing.JMenuItem mnuTodo;
    // End of variables declaration//GEN-END:variables
}