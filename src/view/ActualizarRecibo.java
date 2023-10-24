package view;

import model.EmpleadoRecibo;

public class ActualizarRecibo extends javax.swing.JFrame {
        public ActualizarRecibo() {
                initComponents();
                this.setLocationRelativeTo(null); // para centrar dentro de la panatalla la aplicacion;
                // to maximize the window
                setExtendedState(MAXIMIZED_BOTH);
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel2 = new jcMousePanel.jcMousePanel();
        labelHeader1 = new org.edisoncor.gui.label.LabelHeader();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        txtName = new org.edisoncor.gui.textField.TextField();
        btnLimpiar = new org.edisoncor.gui.button.ButtonAction();
        btnVolverMenu = new org.edisoncor.gui.button.ButtonAction();
        clockFace1 = new org.edisoncor.gui.varios.ClockFace();
        labelCustom1 = new org.edisoncor.gui.label.LabelCustom();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnLimpiar1 = new org.edisoncor.gui.button.ButtonAction();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jcMousePanel2.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 24)); // NOI18N
        jcMousePanel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/menu.jpg"))); // NOI18N

        labelHeader1.setText("Actualizar Recibo.");
        labelHeader1.setFont(new java.awt.Font("Arial Unicode MS", 1, 24)); // NOI18N

        labelMetric1.setText("Digita el numero de cedula");
        labelMetric1.setDistanciaDeSombra(1);
        labelMetric1.setFont(new java.awt.Font("Abyssinica SIL", 1, 24)); // NOI18N

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(102, 0, 102));
        btnLimpiar.setText("Enter");
        btnLimpiar.setColorDeSombra(new java.awt.Color(102, 0, 102));
        btnLimpiar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnVolverMenu.setBackground(new java.awt.Color(102, 0, 102));
        btnVolverMenu.setText("VOLVER");
        btnVolverMenu.setColorDeSombra(new java.awt.Color(102, 0, 102));
        btnVolverMenu.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        btnVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverMenuActionPerformed(evt);
            }
        });

        labelCustom1.setBackground(new java.awt.Color(0, 204, 204));
        labelCustom1.setText("HORA");
        labelCustom1.setFont(new java.awt.Font("Californian FB", 1, 22)); // NOI18N

        jLabel1.setText("nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("Telefono");

        jLabel4.setText("Email");

        btnLimpiar1.setBackground(new java.awt.Color(102, 0, 102));
        btnLimpiar1.setText("Editar");
        btnLimpiar1.setColorDeSombra(new java.awt.Color(102, 0, 102));
        btnLimpiar1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jcMousePanel2Layout = new javax.swing.GroupLayout(jcMousePanel2);
        jcMousePanel2.setLayout(jcMousePanel2Layout);
        jcMousePanel2Layout.setHorizontalGroup(
            jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel2Layout.createSequentialGroup()
                .addGap(737, 737, 737)
                .addComponent(btnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnVolverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jcMousePanel2Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jcMousePanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField2))
                                .addGroup(jcMousePanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(31, 31, 31)
                                    .addComponent(jTextField3))
                                .addGroup(jcMousePanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField4))
                                .addGroup(jcMousePanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jcMousePanel2Layout.createSequentialGroup()
                                .addGap(913, 913, 913)
                                .addComponent(labelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jcMousePanel2Layout.createSequentialGroup()
                                .addGap(893, 893, 893)
                                .addComponent(clockFace1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(168, 248, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel2Layout.createSequentialGroup()
                        .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(620, 620, 620))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel2Layout.createSequentialGroup()
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(683, 683, 683))))
        );
        jcMousePanel2Layout.setVerticalGroup(
            jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(labelHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jcMousePanel2Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jcMousePanel2Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE))
                            .addGroup(jcMousePanel2Layout.createSequentialGroup()
                                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))
                    .addGroup(jcMousePanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(labelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clockFace1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiar1ActionPerformed

    private void btnVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverMenuActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

        private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSalirActionPerformed
                // TODO add your handling code here:
                dispose();
        }// GEN-LAST:event_btnSalirActionPerformed

        private void buttonAeroRound1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonAeroRound1ActionPerformed
                EmpleadoRecibo e = new EmpleadoRecibo(txtName.getText(), txtApellidos.getText(), txtDni.getText(),
                                txtDireccion.getText(),
                                Integer.parseInt(txtEdad.getText()), comboBoxeEstudios.getSelectedItem().toString(),
                                Integer.parseInt(txtAñosExperiencias.getText()),
                                Integer.parseInt(txtHorasTraba.getText()),
                                Integer.parseInt(txtPagoHora.getText()), txtRuc.getText());

                txtReporte.append(e.imprimirBoletaPago());
                e.almacenarBoletaPago();

        }// GEN-LAST:event_buttonAeroRound1ActionPerformed

        private void comboBoxeEstudiosActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_comboBoxeEstudiosActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_comboBoxeEstudiosActionPerformed

        private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnLimpiarActionPerformed
                // TODO add your handling code here:
                this.txtName.setText(" ");
                this.txtApellidos.setText(" ");
                this.txtAñosExperiencias.setText(" ");
                this.txtDireccion.setText(" ");
                this.txtDni.setText(" ");
                this.txtEdad.setText(" ");
                this.txtHorasTraba.setText(" ");
                this.txtPagoHora.setText(" ");
                this.txtReporte.setText(" ");
                this.txtRuc.setText(" ");
        }// GEN-LAST:event_btnLimpiarActionPerformed

        private void btnVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnVolverMenuActionPerformed
                // TODO add your handling code here:
                this.setVisible(false); // para que se pueda ir
                VentanaMenu m = new VentanaMenu();
                m.setVisible(true); // para que se pueda venir
        }// GEN-LAST:event_btnVolverMenuActionPerformed
         // create methods inside the program without using some buttons

        private void formWindowOpened(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowOpened
                // TODO add your handling code here:
                controlEditable();
        }// GEN-LAST:event_formWindowOpened

        private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtNameActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_txtNameActionPerformed

        /**
         * @param args the command line arguments
         */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAction btnLimpiar;
    private org.edisoncor.gui.button.ButtonAction btnLimpiar1;
    private org.edisoncor.gui.button.ButtonAction btnVolverMenu;
    private org.edisoncor.gui.varios.ClockFace clockFace1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private jcMousePanel.jcMousePanel jcMousePanel2;
    private org.edisoncor.gui.label.LabelCustom labelCustom1;
    private org.edisoncor.gui.label.LabelHeader labelHeader1;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.textField.TextField txtName;
    // End of variables declaration//GEN-END:variables

        private void controlEditable() {
                this.txtName.setEditable(true);
                this.txtApellidos.setEditable(true);
                this.txtAñosExperiencias.setEditable(true);
                this.txtDireccion.setEditable(true);
                this.txtDni.setEditable(true);
                this.txtEdad.setEditable(true);
                this.txtHorasTraba.setEditable(true);
                this.txtPagoHora.setEditable(true);
                this.txtReporte.setEditable(false);
                this.txtRuc.setEditable(true);
        }
}
