/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import controlador.Banco;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrés
 */
public class GerenteAlta extends javax.swing.JPanel {

    Banco banco;

    /**
     * Creates new form CajeroAlta
     */
    public GerenteAlta(Banco banco) {
        initComponents();
        this.banco = banco;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtDNI = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(850, 480));

        jLabel1.setText("DNI");

        jButton1.setText("Cancelar");

        jButton2.setText("Aceptar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel3.setText("Dirección");

        jLabel4.setText("E-mail");

        txtEmail.setToolTipText("");
        txtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(280, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDNI, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(261, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(100, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        altaTitular();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * Gurarda los datos en el caso de que sean correctos.
     */
    private void altaTitular() {
        String dni = txtDNI.getText().trim();
        String nombre = txtNombre.getText().trim();
        String direccion = txtDireccion.getText().trim();
        String email = txtEmail.getText().trim();

        if (contenidoComprobado(dni, nombre, direccion, email)) {
            if (!banco.titularExiste(dni)) {
                banco.guardarTitular(dni, nombre, direccion, email);
                ventanaInformacion("Titular agregado", "Informacion");
            } else {
                ventanaAdvertencia("Titular existente", "Información");
            }
        }
    }

    /**
     * Comprueba que los datos sean correctos.
     *
     * @param dni DNI
     * @param nombre Nombre
     * @param direccion Direccion
     * @param email Email
     * @return False si los datos no son correctos, True si son correctos.
     */
    private boolean contenidoComprobado(String dni, String nombre, String direccion, String email) {
        boolean valido;

        if (camposVacios(dni, nombre, direccion, email)) {
            valido = false;
        } else if (contenidoValido(dni)) {
            valido = true;
        } else {
            valido = false;
        }

        return valido;
    }

    /**
     * Comprueba si los campos tienen texto en ellos.
     *
     * @param dni DNI
     * @param nombre Nombre
     * @param direccion Direccion
     * @param email Email
     * @return True si tienen texto en ellos
     */
    private boolean camposVacios(String dni, String nombre, String direccion, String email) {
        boolean vacio;

        if (dni.isEmpty()) {
            ventanaAdvertencia("Completa el campo DNI", "Error");
            vacio = true;
        } else if (nombre.isEmpty()) {
            ventanaAdvertencia("Completa el campo Nombre", "Error");
            vacio = true;
        } else if (direccion.isEmpty()) {
            ventanaAdvertencia("Completa el campo Direccion", "Error");
            vacio = true;
        } else if (email.isEmpty()) {
            ventanaAdvertencia("Completa el campo E-mail", "Error");
            vacio = true;
        } else {
            vacio = false;
        }

        return vacio;
    }

    /**
     * Valida que los datos cumplan una estructura correcta.
     *
     * @param dni DNI
     * @return True si los datos son validos, False si los datos no son validos.
     */
    private boolean contenidoValido(String dni) {
        boolean valido;

        if (banco.dniValido(dni)) {

            valido = true;
        } else {
            ventanaAdvertencia("DNI no válido.", "Error");
            valido = false;
        }

        return valido;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    /**
     * Muestra una ventana de advertencia con un determinado titulo y mensaje.
     *
     * @param mensaje Mensaje de la ventana.
     * @param titulo Titulo de la ventana.
     */
    private void ventanaAdvertencia(String mensaje, String titulo) {
        String rutaImagen = "src/images/advertencia.png";
        ImageIcon icono = new ImageIcon(rutaImagen);
        JOptionPane.showMessageDialog(this, mensaje, titulo, JOptionPane.WARNING_MESSAGE, icono);
    }
    
    /**
     * Muestra una ventana de informacion con un determinado titulo y mensaje.
     *
     * @param mensaje Mensaje de la ventana.
     * @param titulo Titulo de la ventana.
     */
    public void ventanaInformacion(String mensaje, String titulo) {
        String rutaImagen = "src/images/informacion.png";
        ImageIcon icono = new ImageIcon(rutaImagen);
        JOptionPane.showMessageDialog(this, mensaje, titulo, JOptionPane.WARNING_MESSAGE, icono);
    }

}
