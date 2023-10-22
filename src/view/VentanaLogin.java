package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Login;

public class VentanaLogin extends javax.swing.JFrame {
        private static VentanaLogin ventana;

        public VentanaLogin() {
                initComponents();
        }

        private void initComponents() {

                jcMousePanel1 = new jcMousePanel.jcMousePanel();
                txtUsuario = new org.edisoncor.gui.textField.TextFieldRound();
                txtPassword = new org.edisoncor.gui.passwordField.PasswordFieldRoundBackground();
                buttonAction1 = new org.edisoncor.gui.button.ButtonAction();
                buttonAction2 = new org.edisoncor.gui.button.ButtonAction();
                labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
                labelMetric2 = new org.edisoncor.gui.label.LabelMetric();
                labelMetric3 = new org.edisoncor.gui.label.LabelMetric();
                labelMetric4 = new org.edisoncor.gui.label.LabelMetric();
                labelMetric5 = new org.edisoncor.gui.label.LabelMetric();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jcMousePanel1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 11)); // NOI18N
                jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ddd.jpg"))); // NOI18N

                txtUsuario.setToolTipText("");
                txtUsuario.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtUsuarioActionPerformed(evt);
                        }
                });

                txtPassword.setDescripcion("Digíta tu contraseña");

                buttonAction1.setBorder(new javax.swing.border.MatteBorder(null));
                buttonAction1.setText("INICIAR");
                buttonAction1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
                buttonAction1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                buttonAction1ActionPerformed(evt);
                        }
                });

                buttonAction2.setText("SALIR");
                buttonAction2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
                buttonAction2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                buttonAction2ActionPerformed(evt);
                        }
                });

                labelMetric1.setText("Sistema de Emisión de Recibos JRJ.");
                labelMetric1.setFont(new java.awt.Font("Gayathri", 0, 24)); // NOI18N

                labelMetric2.setText("Usuario:");
                labelMetric2.setFont(new java.awt.Font("Garuda", 0, 14)); // NOI18N

                labelMetric3.setText("Contraseña: ");
                labelMetric3.setFont(new java.awt.Font("Garuda", 0, 14)); // NOI18N

                labelMetric4.setText("Tu Puedes Ser Lo Que Quieras Ser.");
                labelMetric4.setFont(new java.awt.Font("Gurajada", 3, 24)); // NOI18N

                labelMetric5.setText("- Barbie");
                labelMetric5.setFont(new java.awt.Font("Gurajada", 3, 24)); // NOI18N

                javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
                jcMousePanel1.setLayout(jcMousePanel1Layout);
                jcMousePanel1Layout.setHorizontalGroup(
                                jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                                                .addGroup(jcMousePanel1Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jcMousePanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(50, 50, 50)
                                                                                                .addComponent(labelMetric1,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE))
                                                                                .addGroup(jcMousePanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(116, 116, 116)
                                                                                                .addComponent(labelMetric4,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                346,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                                .addContainerGap())
                                                .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                                                .addGroup(jcMousePanel1Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jcMousePanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(89, 89, 89)
                                                                                                .addComponent(labelMetric5,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                346,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jcMousePanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(58, 58, 58)
                                                                                                .addGroup(jcMousePanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(labelMetric2,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                116,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(labelMetric3,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(jcMousePanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(txtPassword,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                158,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(txtUsuario,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                158,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(58, 58, 58)
                                                                                                .addGroup(jcMousePanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(buttonAction2,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(buttonAction1,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addContainerGap(52, Short.MAX_VALUE)));
                jcMousePanel1Layout.setVerticalGroup(
                                jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                                                .addGap(20, 20, 20)
                                                                .addComponent(labelMetric1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jcMousePanel1Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jcMousePanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(labelMetric2,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(txtUsuario,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                30,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(buttonAction1,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(jcMousePanel1Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jcMousePanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(3, 3, 3)
                                                                                                .addGroup(jcMousePanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(labelMetric3,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(txtPassword,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                30,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addGroup(jcMousePanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(buttonAction2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(47, 47, 47)
                                                                .addComponent(labelMetric4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(labelMetric5,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(73, 73, 73)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jcMousePanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jcMousePanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                294,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        public static VentanaLogin getInstance() {
                if (ventana == null) {
                        ventana = new VentanaLogin();
                }
                return ventana;
        }

        public void showLoginWindow() {
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setVisible(true);
        }

        private void buttonAction1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonAction1ActionPerformed
                // CALL THE CLASS Logging1
                Login login = new Login();
                // The trim() method in java string checks this unicode value before and after
                // the string,
                // if it exists then removes the white spaces and returns the omitted string.
                boolean mens = login.loginUsuario(txtUsuario.getText().trim(), txtPassword.getPassword());

                if (mens) {
                        JOptionPane.showMessageDialog(null, mens);
                        new VentanaMenu().setVisible(true);
                        dispose();
                } else {
                        JOptionPane.showMessageDialog(null, mens);
                }
        }// GEN-LAST:event_buttonAction1ActionPerformed

        private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtUsuarioActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_txtUsuarioActionPerformed

        private void buttonAction2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonAction2ActionPerformed
                // TODO add your handling code here:
                dispose();
        }// GEN-LAST:event_buttonAction2ActionPerformed

        /**
         * @param args the command line arguments
         */

        // Variables declaration - do not modify//GEN-BEGIN:variables
        public org.edisoncor.gui.button.ButtonAction buttonAction1;
        private org.edisoncor.gui.button.ButtonAction buttonAction2;
        private jcMousePanel.jcMousePanel jcMousePanel1;
        private org.edisoncor.gui.label.LabelMetric labelMetric1;
        private org.edisoncor.gui.label.LabelMetric labelMetric2;
        private org.edisoncor.gui.label.LabelMetric labelMetric3;
        private org.edisoncor.gui.label.LabelMetric labelMetric4;
        private org.edisoncor.gui.label.LabelMetric labelMetric5;
        public org.edisoncor.gui.passwordField.PasswordFieldRoundBackground txtPassword;
        public org.edisoncor.gui.textField.TextFieldRound txtUsuario;
        // End of variables declaration//GEN-END:variables
}
