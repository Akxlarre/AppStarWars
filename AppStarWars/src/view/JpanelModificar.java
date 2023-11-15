/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import models.Personaje;

/**
 *
 * @author akxlarre
 */
public class JpanelModificar extends javax.swing.JPanel {

    /**
     * Creates new form JpanelModificar
     */
    public JpanelModificar() {
        initComponents();
        for (Personaje pj : Principal2.db.mostrarPj()) {
            comboboxPJ.addItem(pj.getNombre());
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        cboxl = new javax.swing.JCheckBox();
        cboxll = new javax.swing.JCheckBox();
        cboxlV = new javax.swing.JCheckBox();
        cboxV = new javax.swing.JCheckBox();
        cboxlll = new javax.swing.JCheckBox();
        cboxVl = new javax.swing.JCheckBox();
        cboxlX = new javax.swing.JCheckBox();
        cboxVll = new javax.swing.JCheckBox();
        cboxVlll = new javax.swing.JCheckBox();
        btnLimpiar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtPlaneta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jComboBoxBando = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        comboboxPJ = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1190, 920));
        setPreferredSize(new java.awt.Dimension(1190, 920));

        jPanel1.setMinimumSize(new java.awt.Dimension(1190, 920));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setFont(new java.awt.Font("Keraleeyam", 1, 36)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(219, 169, 13));
        btnSalir.setText("SALIR");
        btnSalir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(219, 169, 13), 5, true));
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 810, 150, 70));

        btnModificar.setBackground(new java.awt.Color(0, 0, 0));
        btnModificar.setFont(new java.awt.Font("Keraleeyam", 1, 36)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(219, 169, 13));
        btnModificar.setText("Modificar");
        btnModificar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(219, 169, 13), 5, true));
        btnModificar.setContentAreaFilled(false);
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 810, 150, 70));

        cboxl.setForeground(new java.awt.Color(0, 255, 255));
        cboxl.setText("Star Wars: Episodio I - La amenaza fantasma");
        cboxl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxlActionPerformed(evt);
            }
        });
        jPanel2.add(cboxl, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, 320, -1));

        cboxll.setForeground(new java.awt.Color(0, 255, 255));
        cboxll.setText("Star Wars: Episodio II - El ataque de los clones");
        jPanel2.add(cboxll, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 550, -1, -1));

        cboxlV.setForeground(new java.awt.Color(0, 255, 255));
        cboxlV.setText("Star Wars: Episodio IV - Una nueva esperanza");
        jPanel2.add(cboxlV, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 610, -1, -1));

        cboxV.setForeground(new java.awt.Color(0, 255, 255));
        cboxV.setText("Star Wars: Episodio V - El Imperio contraataca");
        jPanel2.add(cboxV, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 640, -1, -1));

        cboxlll.setForeground(new java.awt.Color(0, 255, 255));
        cboxlll.setText("Star Wars: Episodio III - La venganza de los Sith");
        jPanel2.add(cboxlll, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 580, -1, -1));

        cboxVl.setForeground(new java.awt.Color(0, 255, 255));
        cboxVl.setText("Star Wars: Episode VI - Return of the Jedi");
        jPanel2.add(cboxVl, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 670, -1, -1));

        cboxlX.setForeground(new java.awt.Color(0, 255, 255));
        cboxlX.setText("Star Wars: Episodio IX - El ascenso de Skywalker");
        jPanel2.add(cboxlX, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 760, -1, -1));

        cboxVll.setForeground(new java.awt.Color(0, 255, 255));
        cboxVll.setText("Star Wars: Episodio VII - El despertar de la Fuerza");
        jPanel2.add(cboxVll, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 700, -1, -1));

        cboxVlll.setForeground(new java.awt.Color(0, 255, 255));
        cboxVlll.setText("Star Wars: Episodio VIII - Los últimos Jedi");
        jPanel2.add(cboxVlll, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 730, -1, -1));

        btnLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setFont(new java.awt.Font("Keraleeyam", 1, 36)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(219, 169, 13));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(219, 169, 13), 5, true));
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 810, 150, 70));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Keraleeyam", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(219, 169, 13));
        jLabel5.setText("de origen");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Keraleeyam", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(219, 169, 13));
        jLabel4.setText("Bando");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Keraleeyam", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(219, 169, 13));
        jLabel7.setText("Películas");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Keraleeyam", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(219, 169, 13));
        jLabel6.setText("Planeta");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Keraleeyam", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(219, 169, 13));
        jLabel2.setText("ID");

        txtNombre.setBackground(new java.awt.Color(0, 0, 0));
        txtNombre.setForeground(new java.awt.Color(0, 255, 255));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 255, 0)));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Keraleeyam", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(219, 169, 13));
        jLabel3.setText("Nombre");

        txtID.setBackground(new java.awt.Color(0, 0, 0));
        txtID.setForeground(new java.awt.Color(0, 255, 255));
        txtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 255, 0)));
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtPlaneta.setBackground(new java.awt.Color(0, 0, 0));
        txtPlaneta.setForeground(new java.awt.Color(0, 255, 255));
        txtPlaneta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPlaneta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 255, 0)));
        txtPlaneta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlanetaActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Keraleeyam", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(219, 169, 13));
        jLabel8.setText("Edad");

        txtEdad.setBackground(new java.awt.Color(0, 0, 0));
        txtEdad.setForeground(new java.awt.Color(0, 255, 255));
        txtEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEdad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 255, 0)));
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });

        jComboBoxBando.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Imperio", "Neutral", "Rebelde" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPlaneta, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBoxBando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel7)))))
                .addContainerGap(248, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(txtPlaneta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addComponent(jComboBoxBando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 610, 400));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Keraleeyam", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(219, 169, 13));
        jLabel9.setText("Personajes Agregados");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));

        comboboxPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxPJActionPerformed(evt);
            }
        });
        jPanel2.add(comboboxPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, -1, -1));

        btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscar.setFont(new java.awt.Font("Keraleeyam", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(219, 169, 13));
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(219, 169, 13), 5, true));
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 80, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Personaje pjSeleccionado = Principal2.db.buscarPJ((String) comboboxPJ.getSelectedItem());

        if (!txtID.getText().equals(String.valueOf(pjSeleccionado.getId()))) {
            for (Personaje pjDb : Principal2.db.mostrarPj()) {
                if (txtID.getText().equals(String.valueOf(pjDb.getId()))) {
                    JOptionPane.showMessageDialog(txtNombre, "ID  ya ocupada");
                    return;
                }
            }
        }

        //PREGUNTAR SI ES NECESARIO QUE NO SE REPITA EL NOMBRE
        pjSeleccionado.setNombre(txtNombre.getText());
        try {
            pjSeleccionado.setEdad(Integer.parseInt(txtEdad.getText()));
        } catch (NumberFormatException ex) {
            throw new NumberFormatException("La edad debe ser numérica");
        }
        try {
            pjSeleccionado.setId(Integer.parseInt(txtID.getText()));
        } catch (NumberFormatException ex) {
            throw new NumberFormatException("La Id debe ser numérica");
        }
        pjSeleccionado.setPlanetaOrigen(txtPlaneta.getText());
        pjSeleccionado.setBando(jComboBoxBando.getSelectedItem().toString());

        ArrayList<String> pelis = new ArrayList();
        for (JCheckBox checkbox : Arrays.asList(cboxl, cboxll, cboxlll, cboxlV, cboxV, cboxVl, cboxVll, cboxVlll, cboxlX)) {
            if (checkbox.isSelected()) {
                pelis.add(checkbox.getText());
            }
        }
        pjSeleccionado.setPeliculas(pelis);

        JOptionPane.showMessageDialog(txtNombre, "pj modificado");
    }//GEN-LAST:event_btnModificarActionPerformed

    private void cboxlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxlActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtPlanetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlanetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlanetaActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void comboboxPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboboxPJActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        Personaje personaje = Principal2.db.buscarPJ((String) comboboxPJ.getSelectedItem());
        txtNombre.setText(personaje.getNombre());
        txtID.setText(String.valueOf(personaje.getId()));
        txtEdad.setText(String.valueOf(personaje.getEdad()));
        txtPlaneta.setText(personaje.getPlanetaOrigen());
        String bando = personaje.getBando();
        for(int i = 0; i<jComboBoxBando.getItemCount();i++){
            if(bando.equals(jComboBoxBando.getItemAt(i))){
                jComboBoxBando.setSelectedIndex(i);
            }
        }
        ArrayList<String> peliculas = personaje.getPeliculas();
        for (JCheckBox checkbox : Arrays.asList(cboxl, cboxll, cboxlll, cboxlV, cboxV, cboxVl, cboxVll, cboxVlll, cboxlX)) {
            if (peliculas.contains(checkbox.getText())) {
                checkbox.setSelected(true);
            }
        }

    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox cboxV;
    private javax.swing.JCheckBox cboxVl;
    private javax.swing.JCheckBox cboxVll;
    private javax.swing.JCheckBox cboxVlll;
    private javax.swing.JCheckBox cboxl;
    private javax.swing.JCheckBox cboxlV;
    private javax.swing.JCheckBox cboxlX;
    private javax.swing.JCheckBox cboxll;
    private javax.swing.JCheckBox cboxlll;
    private javax.swing.JComboBox<String> comboboxPJ;
    private javax.swing.JComboBox<String> jComboBoxBando;
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
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPlaneta;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
