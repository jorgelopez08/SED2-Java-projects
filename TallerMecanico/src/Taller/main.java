
package Taller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class main extends javax.swing.JFrame {

    File file;
    Usuarios cts;
    public main() {
        initComponents();
        file=new File();
               jTabbedPane1.setEnabledAt(jTabbedPane1.indexOfComponent(jPanel2),true); 
               jTabbedPane1.setEnabledAt(jTabbedPane1.indexOfComponent(jPanel3),false);
               jTabbedPane1.setEnabledAt(jTabbedPane1.indexOfComponent(jPanel4),false);
               jTabbedPane1.setEnabledAt(jTabbedPane1.indexOfComponent(jPanel5),false); 
               jTabbedPane1.setEnabledAt(jTabbedPane1.indexOfComponent(jPanel6),false);
               jTabbedPane1.setEnabledAt(jTabbedPane1.indexOfComponent(jPanel7),false); 
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        lblUsuarioL = new javax.swing.JLabel();
        txtUsuarioL = new javax.swing.JTextField();
        lblPasswordL = new javax.swing.JLabel();
        txtPasswordL = new javax.swing.JTextField();
        btnAutentificar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblDato = new javax.swing.JLabel();
        txtDato = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblApellidoP = new javax.swing.JLabel();
        txtApellidoP = new javax.swing.JTextField();
        lblApellidoM = new javax.swing.JLabel();
        txtApellidoM = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblPasswordU = new javax.swing.JLabel();
        txtPasswordU = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        lblPerfil = new javax.swing.JLabel();
        btnPerfil = new javax.swing.JComboBox<>();
        lblEstado = new javax.swing.JLabel();
        txtEstado = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUsuarioL.setText("Usuario:");

        lblPasswordL.setText("Password:");

        btnAutentificar.setText("Autentificar");
        btnAutentificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutentificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPasswordL)
                            .addComponent(lblUsuarioL))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuarioL, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(txtPasswordL)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(btnAutentificar)))
                .addContainerGap(455, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuarioL)
                    .addComponent(txtUsuarioL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPasswordL)
                    .addComponent(txtPasswordL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(btnAutentificar)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Login", jPanel2);

        lblDato.setText("Ingrese ID a Buscar:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblID.setText("ID:");

        lblNombre.setText("Nombre:");

        lblApellidoP.setText("Apellido Paterno:");

        txtApellidoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoPActionPerformed(evt);
            }
        });

        lblApellidoM.setText("Apellido Materno:");

        lblTelefono.setText("Telefono:");

        lblUserName.setText("User Name:");

        lblDireccion.setText("Direccion:");

        lblPasswordU.setText("Password:");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        lblPerfil.setText("Perfil:");

        btnPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Mecanico", "Cliente" }));
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });

        lblEstado.setText("Estado:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtID))
                            .addComponent(lblDato))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDato, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellidoM)
                    .addComponent(lblApellidoP)
                    .addComponent(lblTelefono)
                    .addComponent(lblUserName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtApellidoP, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(txtApellidoM)
                            .addComponent(txtTelefono)
                            .addComponent(txtUserName))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDireccion)
                            .addComponent(lblPasswordU)
                            .addComponent(lblPerfil)
                            .addComponent(lblEstado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                .addComponent(txtPasswordU)
                                .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEstado)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)))
                .addGap(352, 352, 352))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDato)
                    .addComponent(txtDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtID))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidoP)
                    .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidoM)
                    .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPerfil)
                    .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDireccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPasswordU)
                    .addComponent(txtPasswordU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado)
                    .addComponent(txtEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );

        jTabbedPane1.addTab("Usuarios", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 909, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Clientes", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 909, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Vehiculos", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 909, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Reparaciones", jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 909, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Piezas", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoPActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       try {
            cts=new Usuarios();
            cts.setId(Integer.parseInt(txtDato.getText()));
            cts=file.FileSearch(cts);
            txtID.setText(String.valueOf(cts.getId()));
            txtNombre.setText(String.valueOf(cts.getNombre()));
            txtApellidoP.setText(String.valueOf(cts.getAp()));
            txtApellidoM.setText(String.valueOf(cts.getAm()));
            btnPerfil.setSelectedItem(cts.getPerfil()); 
            txtTelefono.setText(String.valueOf(cts.getTelefono()));
            txtDireccion.setText(String.valueOf(cts.getDireccion()));
            txtUserName.setText(String.valueOf(cts.getUsername()));
            txtPasswordU.setText(String.valueOf(cts.getPassword()));
            txtEstado.setText(String.valueOf(cts.getEstado()));
            
               txtNombre.setEnabled(true);
               txtApellidoP.setEnabled(true);
               txtApellidoM.setEnabled(true);
               txtTelefono.setEnabled(true);
               txtDireccion.setEnabled(true);
               txtUserName.setEnabled(true);
               txtPasswordU.setEnabled(true);
               
               btnSalvar.setEnabled(false);
               btnNuevo.setEnabled(false);
               btnEditar.setEnabled(true);
               btnCancelar.setEnabled(true);
               btnRemover.setEnabled(true);
        } catch (IOException ex) {
}
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
       try{
         file.FileMaxID();
         txtID.setText(String.valueOf(file.FileMaxID()));
         txtDato.setText("");
         txtNombre.setText("");
         txtApellidoP.setText("");
         txtApellidoM.setText("");
         txtTelefono.setText("");
         txtDireccion.setText("");
         txtUserName.setText("");
         txtPasswordU.setText("");
         txtEstado.setText("Activo");
         
               txtNombre.setEnabled(true);
               txtApellidoP.setEnabled(true);
               txtApellidoM.setEnabled(true);
               txtTelefono.setEnabled(true);
               txtDireccion.setEnabled(true);
               txtUserName.setEnabled(true);
               txtPasswordU.setEnabled(true);
               //txtDato.setEnabled(false);
               
               btnSalvar.setEnabled(true);
               btnNuevo.setEnabled(false);
               btnEditar.setEnabled(false);
               btnCancelar.setEnabled(true);
               btnRemover.setEnabled(false);
               //btnBuscar.setEnabled(false);
               
     } catch (IOException ex){
         
     }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
         try {
            cts=new Usuarios();
            cts.setId(Integer.parseInt(txtID.getText()));
            cts.setNombre(txtNombre.getText());
            cts.setAp(txtApellidoP.getText());
            cts.setAm(txtApellidoM.getText());
            //String perfil=btnPerfil.getSelectedItem().toString();
            cts.setPerfil(btnPerfil.getSelectedItem().toString());
            cts.setTelefono(Integer.parseInt(txtTelefono.getText()));
            cts.setDireccion(txtDireccion.getText());
            cts.setUsername(txtUserName.getText());
            cts.setPassword(txtPasswordU.getText());
            cts.setEstado(txtEstado.getText());
            
            file.FileWrite(cts);
            txtDato.setText("");
            txtID.setText("");
            txtNombre.setText("");
            txtApellidoP.setText("");
            txtApellidoM.setText("");
            txtTelefono.setText("");
            txtDireccion.setText("");
            txtUserName.setText("");
            txtPasswordU.setText("");
            txtEstado.setText("");
            
               txtNombre.setEnabled(false);
               txtApellidoP.setEnabled(false);
               txtApellidoM.setEnabled(false);
               txtTelefono.setEnabled(false);
               txtDireccion.setEnabled(false);
               txtUserName.setEnabled(false);
               txtPasswordU.setEnabled(false);
               
               btnNuevo.setEnabled(true);
               btnSalvar.setEnabled(false);
               btnCancelar.setEnabled(false);
               btnEditar.setEnabled(false);
               btnRemover.setEnabled(false);
            
        } catch (IOException ex) {
}
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
            txtDato.setText("");
            txtID.setText("");
            txtNombre.setText("");
            txtApellidoP.setText("");
            txtApellidoM.setText("");
            txtTelefono.setText("");
            txtDireccion.setText("");
            txtUserName.setText("");
            txtPasswordU.setText("");
            txtEstado.setText("");
            
               txtNombre.setEnabled(false);
               txtApellidoP.setEnabled(false);
               txtApellidoM.setEnabled(false);
               txtTelefono.setEnabled(false);
               txtDireccion.setEnabled(false);
               txtUserName.setEnabled(false);
               txtPasswordU.setEnabled(false);
               
               btnNuevo.setEnabled(true);
               btnSalvar.setEnabled(false);
               btnCancelar.setEnabled(false);
               btnEditar.setEnabled(false);
               btnRemover.setEnabled(false);
               
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
   try {
            cts=new Usuarios();
            cts.setId(Integer.parseInt(txtID.getText()));
            cts.setNombre(txtNombre.getText());
            cts.setAp(txtApellidoP.getText());
            cts.setAm(txtApellidoM.getText());
            cts.setPerfil(btnPerfil.getSelectedItem().toString());
            cts.setTelefono(Integer.parseInt(txtTelefono.getText()));
            cts.setDireccion(txtDireccion.getText());
            cts.setUsername(txtUserName.getText());
            cts.setPassword(txtPasswordU.getText());
            cts.setEstado(txtEstado.getText());
        
            file.FileEdit(cts);
            txtDato.setText("");
            txtID.setText("");
            txtNombre.setText("");
            txtApellidoP.setText("");
            txtApellidoM.setText("");
            txtTelefono.setText("");
            txtDireccion.setText("");
            txtUserName.setText("");
            txtPasswordU.setText("");
            txtEstado.setText("");
            
               txtNombre.setEnabled(false);
               txtApellidoP.setEnabled(false);
               txtApellidoM.setEnabled(false);
               txtTelefono.setEnabled(false);
               txtDireccion.setEnabled(false);
               txtUserName.setEnabled(false);
               txtPasswordU.setEnabled(false);
               
               btnNuevo.setEnabled(true);
               btnSalvar.setEnabled(false);
               btnCancelar.setEnabled(false);
               btnEditar.setEnabled(false);
               btnRemover.setEnabled(false);
            
            
        } catch (IOException ex) {
}
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
       cts=new Usuarios();
        cts.setId(Integer.parseInt(txtDato.getText()));
        file.FileDeleteDato(cts);
            txtDato.setText("");
            txtID.setText("");
            txtNombre.setText("");
            txtApellidoP.setText("");
            txtApellidoM.setText("");
            txtTelefono.setText("");
            txtDireccion.setText("");
            txtUserName.setText("");
            txtPasswordU.setText("");
            txtEstado.setText("");
            
               txtNombre.setEnabled(false);
               txtApellidoP.setEnabled(false);
               txtApellidoM.setEnabled(false);
               txtTelefono.setEnabled(false);
               txtDireccion.setEnabled(false);
               txtUserName.setEnabled(false);
               txtPasswordU.setEnabled(false);
               
               btnNuevo.setEnabled(true);
               btnSalvar.setEnabled(false);
               btnCancelar.setEnabled(false);
               btnEditar.setEnabled(false);
               btnRemover.setEnabled(false);
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnAutentificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutentificarActionPerformed
        cts=new Usuarios();
        cts.setUsername(txtUsuarioL.getText());
        cts.setPassword(txtPasswordL.getText());
        try {
            if(file.FileSearchAcceso(cts)==true){
                
               jTabbedPane1.setEnabledAt(jTabbedPane1.indexOfComponent(jPanel2),false); 
               jTabbedPane1.setEnabledAt(jTabbedPane1.indexOfComponent(jPanel3),true);
               jTabbedPane1.setEnabledAt(jTabbedPane1.indexOfComponent(jPanel4),true);
               jTabbedPane1.setEnabledAt(jTabbedPane1.indexOfComponent(jPanel5),true); 
               jTabbedPane1.setEnabledAt(jTabbedPane1.indexOfComponent(jPanel6),true);
               jTabbedPane1.setEnabledAt(jTabbedPane1.indexOfComponent(jPanel7),true); 
               
               txtNombre.setEnabled(false);
               txtApellidoP.setEnabled(false);
               txtApellidoM.setEnabled(false);
               txtTelefono.setEnabled(false);
               txtDireccion.setEnabled(false);
               txtUserName.setEnabled(false);
               txtPasswordU.setEnabled(false);
               
               btnSalvar.setEnabled(false);
               
            }
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_btnAutentificarActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAutentificar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> btnPerfil;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblApellidoM;
    private javax.swing.JLabel lblApellidoP;
    private javax.swing.JLabel lblDato;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPasswordL;
    private javax.swing.JLabel lblPasswordU;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUsuarioL;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtDato;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JLabel txtEstado;
    private javax.swing.JLabel txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPasswordL;
    private javax.swing.JTextField txtPasswordU;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtUsuarioL;
    // End of variables declaration//GEN-END:variables
}
