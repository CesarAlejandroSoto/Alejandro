/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uis.edu.co.banco_de_sangre.vista;

import java.util.List;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import uis.edu.co.banco_de_sangre.controlador.CUnidadesDeSangre;
import uis.edu.co.banco_de_sangre.modelo.UnidadesDeSangre;

/**
 *
 * @author HP
 */
public class VUnidadesDeSangre extends javax.swing.JFrame {

    /**
     * Creates new form VUnidadesDeSangre
     */
    public VUnidadesDeSangre() {
        initComponents();
        
    // Configurar las columnas de la tabla
    DefaultTableModel modelo = (DefaultTableModel) tblUnidades.getModel();
    modelo.setColumnIdentifiers(new Object[]{"ID Unidad", "Nombre", "Apellido", "Tipo Componente", "Estado", "Fecha Procesamiento"});
    
    // Inicializar los combobox con los valores correspondientes
    //inicializarComboBoxes();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdUnidadesDeSangre = new javax.swing.JTextField();
        txtIdDonacion = new javax.swing.JTextField();
        txtFechaDeProcesamiento = new javax.swing.JTextField();
        cmbIdTipoComponenteSanguineo = new javax.swing.JComboBox<>();
        cmbIdEstado = new javax.swing.JComboBox<>();
        btnConsultar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnSeleccionarDonante = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUnidades = new javax.swing.JTable();
        btnVerUnidadesDisponibles = new javax.swing.JButton();
        btnUnidadesEnProceso = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Id_Unidad");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Donacion");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Id_ComponenteSanguineo");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Estado");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FechaProcesamiento");

        cmbIdTipoComponenteSanguineo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1. \"Plasma\"", "2. \"Globulos Rojos\"", "3. \"Plaquetas\"" }));
        cmbIdTipoComponenteSanguineo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIdTipoComponenteSanguineoActionPerformed(evt);
            }
        });

        cmbIdEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1. \"En proceso de analisis\"", "2. \"Disponible\"", "3. \"En proceso de Distribucion\"" }));
        cmbIdEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIdEstadoActionPerformed(evt);
            }
        });

        btnConsultar.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Escritorio\\Bases de Datos\\Iconos\\consultar.png")); // NOI18N
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnRegistrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Escritorio\\Bases de Datos\\Iconos\\registrar.png")); // NOI18N
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Escritorio\\Bases de Datos\\Iconos\\eliminar.png")); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCerrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Escritorio\\Bases de Datos\\Iconos\\cerrar.png")); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnSeleccionarDonante.setBackground(new java.awt.Color(255, 102, 102));
        btnSeleccionarDonante.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSeleccionarDonante.setForeground(new java.awt.Color(255, 255, 255));
        btnSeleccionarDonante.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Escritorio\\Bases de Datos\\Iconos\\INFO.png")); // NOI18N
        btnSeleccionarDonante.setText("INFO DONANTE");
        btnSeleccionarDonante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarDonanteActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("UNIDADES DE SANGRE");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CONSULTAR");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("REGISTRAR");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ELIMINAR");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CERRAR");

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Escritorio\\Bases de Datos\\Iconos\\CRUZ ROJA 1.png")); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Escritorio\\Bases de Datos\\Iconos\\CRUZ ROJA 1.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtIdUnidadesDeSangre)
                    .addComponent(txtIdDonacion, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbIdTipoComponenteSanguineo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFechaDeProcesamiento)
                    .addComponent(cmbIdEstado, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE))
                .addGap(80, 80, 80))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSeleccionarDonante)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel8)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdUnidadesDeSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdDonacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbIdTipoComponenteSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbIdEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFechaDeProcesamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(btnSeleccionarDonante, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 354, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));

        tblUnidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblUnidades);

        btnVerUnidadesDisponibles.setBackground(new java.awt.Color(102, 102, 255));
        btnVerUnidadesDisponibles.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnVerUnidadesDisponibles.setForeground(new java.awt.Color(255, 255, 255));
        btnVerUnidadesDisponibles.setText("VER UNIDADES \"DISPONIBLES\"");
        btnVerUnidadesDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerUnidadesDisponiblesActionPerformed(evt);
            }
        });

        btnUnidadesEnProceso.setBackground(new java.awt.Color(102, 102, 255));
        btnUnidadesEnProceso.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnUnidadesEnProceso.setForeground(new java.awt.Color(255, 255, 255));
        btnUnidadesEnProceso.setText("VER UNIDADES EN \"PROCESO\"");
        btnUnidadesEnProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnidadesEnProcesoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Goudy Old Style", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CESAR ALEJANDRO SOTO");

        jLabel12.setFont(new java.awt.Font("Goudy Old Style", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("GABRIEL VERA MORENO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(btnVerUnidadesDisponibles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUnidadesEnProceso)
                .addGap(82, 82, 82))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVerUnidadesDisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(btnUnidadesEnProceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 214, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbIdTipoComponenteSanguineoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIdTipoComponenteSanguineoActionPerformed
        // TODO add your handling code here:
        String opcionSeleccionada = cmbIdTipoComponenteSanguineo.getSelectedItem().toString();
    }//GEN-LAST:event_cmbIdTipoComponenteSanguineoActionPerformed

    private void cmbIdEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIdEstadoActionPerformed
        // TODO add your handling code here:
        String opcionSeleccionada = cmbIdEstado.getSelectedItem().toString();
    }//GEN-LAST:event_cmbIdEstadoActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
 // Obtener el ID de la unidad de sangre a consultar
    String idUnidadTexto = txtIdUnidadesDeSangre.getText();
    
    // Verificar que el campo no esté vacío
    if (idUnidadTexto.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese el ID de la unidad de sangre a consultar.");
        return;
    }
    
    // Convertir el ID a entero
    int idUnidad = Integer.parseInt(idUnidadTexto);
    
    // Consultar la base de datos para obtener la información de la unidad de sangre
    CUnidadesDeSangre controlador = new CUnidadesDeSangre();
    UnidadesDeSangre unidad = controlador.consultarUnidadDeSangrePorId(idUnidad);
    
    // Cargar la unidad de sangre consultada en la tabla o en los campos correspondientes de tu interfaz
    if (unidad != null) {
        // Si se encontró la unidad de sangre, la cargamos en la tabla
        controlador.cargarUnidadEnTabla(tblUnidades, unidad);
    } else {
        // Si no se encontró la unidad de sangre, mostramos un mensaje
        JOptionPane.showMessageDialog(this, "No se encontró ninguna unidad de sangre con el ID proporcionado.");
    }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
// Verificar si los campos requeridos no están vacíos
    if (txtIdDonacion.getText().isEmpty() || txtFechaDeProcesamiento.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
        return; // Salir del método si algún campo está vacío
    }
    
    try {
        // Obtener los valores de los campos de texto y combobox
        int donacion = Integer.parseInt(txtIdDonacion.getText());
        int tipoComponenteId = cmbIdTipoComponenteSanguineo.getSelectedIndex() + 1; // Asume que el índice corresponde al ID
        int estadoId = cmbIdEstado.getSelectedIndex() + 1; // Asume que el índice corresponde al ID
        String fechaProcesamiento = txtFechaDeProcesamiento.getText();

        // Crear un objeto UnidadesDeSangre con los datos ingresados
        UnidadesDeSangre unidad = new UnidadesDeSangre(0, donacion, tipoComponenteId, estadoId, fechaProcesamiento);

        // Crear un objeto del controlador CUnidadesDeSangre
        CUnidadesDeSangre controlador = new CUnidadesDeSangre();

        // Registrar la unidad de sangre en la base de datos
        if (controlador.registrarUnidadDeSangre(unidad)) {
            JOptionPane.showMessageDialog(this, "Unidad de sangre registrada exitosamente.");

            // Recargar todas las unidades de sangre en la tabla
            controlador.cargarTodasLasUnidadesEnTabla(tblUnidades);
        } else {
            JOptionPane.showMessageDialog(this, "Error al registrar la unidad de sangre.");
        }

        // Limpiar los campos del formulario después de registrar
        limpiarCampos();
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Error de formato en los campos: " + ex.getMessage());
    }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
 // Verificar si se ha ingresado un ID de unidad de sangre para eliminar
    if (txtIdUnidadesDeSangre.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese el ID de la unidad de sangre a eliminar.");
        return; // Salir del método si el campo está vacío
    }
    
    // Obtener el ID de la unidad de sangre a eliminar
    int idUnidad = Integer.parseInt(txtIdUnidadesDeSangre.getText());
    
    // Crear un objeto del controlador CUnidadesDeSangre
    CUnidadesDeSangre controlador = new CUnidadesDeSangre();
    
    // Intentar eliminar la unidad de sangre y mostrar un mensaje de éxito o error
    if (controlador.eliminarUnidadDeSangre(idUnidad)) {
        JOptionPane.showMessageDialog(this, "Unidad de sangre eliminada exitosamente.");
        
        // Recargar la tabla de unidades de sangre
        controlador.cargarTodasLasUnidadesEnTabla(tblUnidades);
    } else {
        JOptionPane.showMessageDialog(this, "Error al eliminar la unidad de sangre.");
    }
    limpiarCampos();
   
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas cerrar la interfaz?", "Cerrar interfaz", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
        // Cerrar la interfaz
        dispose(); // Cierra la ventana actual
    }
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnVerUnidadesDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerUnidadesDisponiblesActionPerformed
        // TODO add your handling code here:
    CUnidadesDeSangre controlador = new CUnidadesDeSangre();
    controlador.cargarTodasLasUnidadesDEnTabla(tblUnidades);
    }//GEN-LAST:event_btnVerUnidadesDisponiblesActionPerformed

    private void btnSeleccionarDonanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarDonanteActionPerformed
        // TODO add your handling code here:
    // Obtener el controlador de unidades de sangre
    
    CUnidadesDeSangre controlador = new CUnidadesDeSangre();
    
    // Cargar los datos de los donantes en la tabla
    controlador.cargarDonantesEnTabla(tblUnidades);
    }//GEN-LAST:event_btnSeleccionarDonanteActionPerformed

    private void btnUnidadesEnProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnidadesEnProcesoActionPerformed
        // TODO add your handling code here:
    CUnidadesDeSangre controlador = new CUnidadesDeSangre();
    controlador.cargarUnidadesEnProcesoDeAnalisisYDistribucion(tblUnidades);
    }//GEN-LAST:event_btnUnidadesEnProcesoActionPerformed

private void limpiarCampos() {
    txtIdUnidadesDeSangre.setText("");
    txtIdDonacion.setText("");
    txtFechaDeProcesamiento.setText("");
    cmbIdTipoComponenteSanguineo.setSelectedIndex(0);
    cmbIdEstado.setSelectedIndex(0);
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
            java.util.logging.Logger.getLogger(VUnidadesDeSangre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VUnidadesDeSangre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VUnidadesDeSangre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VUnidadesDeSangre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VUnidadesDeSangre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSeleccionarDonante;
    private javax.swing.JButton btnUnidadesEnProceso;
    private javax.swing.JButton btnVerUnidadesDisponibles;
    private javax.swing.JComboBox<String> cmbIdEstado;
    private javax.swing.JComboBox<String> cmbIdTipoComponenteSanguineo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUnidades;
    private javax.swing.JTextField txtFechaDeProcesamiento;
    private javax.swing.JTextField txtIdDonacion;
    private javax.swing.JTextField txtIdUnidadesDeSangre;
    // End of variables declaration//GEN-END:variables
}
