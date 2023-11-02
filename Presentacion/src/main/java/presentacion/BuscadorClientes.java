/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import dominio.Persona;
import fachada.Fachada;
import fachada.IFachada;
import java.util.LinkedList;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Paul Alejandro Vazquez Cervantes
 * @author Santiago Bojorquez Leyva
 * @author Alejandra Miranda
 */
public class BuscadorClientes extends javax.swing.JFrame {

    IFachada fachada;
    List<Persona> personas = new LinkedList<>();
    public Persona persona;
    String rfc;

    /**
     * Creates new form BuscadorClientes
     */
    public BuscadorClientes() {
        initComponents();
        this.tblPersonas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.fachada = new Fachada();
        this.personas = fachada.obtenerAllPersonas();
        this.cargarTablaDefecto();

    }

    public void cargarTablaDefecto() {
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblPersonas.getModel();
        //Limpia tabla anterior
        modeloTabla.setRowCount(0);
        personas.forEach(persona -> {
            Object[] fila = {
                persona.getRfc(),
                persona.getNombres(),
                persona.getApellido_paterno(),
                persona.getApellido_materno(),
                persona.getCurp(),
                persona.getFechaNacimiento().getTime(),
                persona.getTelefono(),
                persona.getDiscapacidad()
            };
            modeloTabla.addRow(fila);
        });
    }

    public void cargarTablaBuscador(String tipo) {
        this.personas = fachada.obtenerAllPersonas();
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblPersonas.getModel();
        //Limpia tabla anterior
        modeloTabla.setRowCount(0);
        personas.forEach(persona -> {
            Object[] fila = {
                persona.getRfc(),
                persona.getNombres(),
                persona.getApellido_paterno(),
                persona.getApellido_materno(),
                persona.getCurp(),
                persona.getFechaNacimiento().getTime(),
                persona.getTelefono(),
                persona.getDiscapacidad()
            };
            if (tipo.equals("Nombre")) {
                String nombre = persona.getNombres() + " " + persona.getApellido_paterno() + " " + persona.getApellido_materno();
                String textoBuscar = txtBuscar.getText();
                if (textoBuscar != null && nombre.toLowerCase().contains(textoBuscar.toLowerCase())) {
                    modeloTabla.addRow(fila);
                }

            }

        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbxFiltro = new javax.swing.JComboBox<>();
        txtBuscar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonas = new javax.swing.JTable();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(185, 70, 69));
        jPanel2.setPreferredSize(new java.awt.Dimension(119, 35));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Encontrar cliente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Buscar por");

        cbxFiltro.setBackground(new java.awt.Color(255, 255, 255));
        cbxFiltro.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        cbxFiltro.setForeground(new java.awt.Color(0, 0, 0));
        cbxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "RFC" }));
        cbxFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFiltroActionPerformed(evt);
            }
        });

        txtBuscar.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscar.setForeground(new java.awt.Color(0, 0, 0));
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Clientes");

        tblPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RFC", "Nombres", "Apellido_Materno", "Apellido_Paterno", "Curp", "Fecha Nacimiento", "Telefono", "Discapacidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPersonas.setPreferredSize(new java.awt.Dimension(375, 200));
        tblPersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPersonasMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblPersonasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblPersonas);

        btnAceptar.setBackground(new java.awt.Color(255, 255, 255));
        btnAceptar.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(0, 0, 0));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxFiltro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtBuscar))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel3)))
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(339, 339, 339))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnAceptar)
                .addContainerGap(56, Short.MAX_VALUE))
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

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void cbxFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxFiltroActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        // TODO add your handling code here:
        String tipo = (String) this.cbxFiltro.getSelectedItem();
        this.cargarTablaBuscador(tipo);
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        persona = this.fachada.obtenerPersona(rfc);
        PrimPlacasForm placasPantall = new PrimPlacasForm(persona);
        placasPantall.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void tblPersonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPersonasMouseClicked
        // TODO add your handling code here:
        int seleccionar = tblPersonas.rowAtPoint(evt.getPoint());
        rfc = String.valueOf(tblPersonas.getValueAt(seleccionar, 0));
    }//GEN-LAST:event_tblPersonasMouseClicked

    private void tblPersonasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPersonasMousePressed
        // TODO add your handling code here:
        int seleccionar = tblPersonas.rowAtPoint(evt.getPoint());
        rfc = String.valueOf(tblPersonas.getValueAt(seleccionar, 0));
    }//GEN-LAST:event_tblPersonasMousePressed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptar;
    private javax.swing.JComboBox<String> cbxFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPersonas;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
