package vista;

import controlador.Banco;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Tipo;
import modelo.Usuario;
import utilidades.Algoritmos;

/**
 *
 * @author Andrés
 */
public class Ventana extends javax.swing.JFrame {

    Banco banco;
    GerenteAlta gerenteAlta;
    GerenteConsulta gerenteConsulta;
    GerenteModificacion gerenteModificacion;
    GerenteAperturaCuentas gerenteAperturaCuentas;
    GerentePrestamos gerentePrestamos;
    CajeroTransacciones cajeroTransacciones;
    CajeroPrestamos cajeroPrestamos;
    /**
     * Creates new form Window
     */
    public Ventana() {
        initComponents();
        banco = new Banco();
        jMenuBar1.setVisible(false);
    }
    
    public Ventana(Banco banco) {
        initComponents();
        this.banco = banco;
        jMenuBar1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pswContrasenna = new javax.swing.JPasswordField();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuTitulares = new javax.swing.JMenu();
        mnuAltaTitulares = new javax.swing.JMenuItem();
        mnuConsultaTitulares = new javax.swing.JMenuItem();
        mnuModificacionTitulares = new javax.swing.JMenuItem();
        mnuAperturaCuentas = new javax.swing.JMenu();
        mnuGestionPrestamos = new javax.swing.JMenu();
        mnuTransacciones = new javax.swing.JMenu();
        mnuPrestamos = new javax.swing.JMenu();
        mnuCerrarSesion = new javax.swing.JMenu();
        mnuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion Bancaria");
        setSize(new java.awt.Dimension(850, 480));

        jLabel1.setText("Usuario");

        jLabel2.setText("Contraseña");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAceptar))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(144, 144, 144)
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuario)
                            .addComponent(pswContrasenna, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(268, Short.MAX_VALUE))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pswContrasenna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        getContentPane().add(panelLogin, java.awt.BorderLayout.CENTER);

        jMenuBar1.setName(""); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(70, 30));

        mnuTitulares.setText("Titulares");
        mnuTitulares.setFocusable(false);

        mnuAltaTitulares.setText("Alta");
        mnuAltaTitulares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAltaTitularesActionPerformed(evt);
            }
        });
        mnuTitulares.add(mnuAltaTitulares);

        mnuConsultaTitulares.setText("Consulta");
        mnuConsultaTitulares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultaTitularesActionPerformed(evt);
            }
        });
        mnuTitulares.add(mnuConsultaTitulares);

        mnuModificacionTitulares.setText("Modificacion");
        mnuModificacionTitulares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuModificacionTitularesActionPerformed(evt);
            }
        });
        mnuTitulares.add(mnuModificacionTitulares);

        jMenuBar1.add(mnuTitulares);

        mnuAperturaCuentas.setText("Apertura de Cuentas");
        mnuAperturaCuentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuAperturaCuentasMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnuAperturaCuentas);

        mnuGestionPrestamos.setText("Gestion de préstamos");
        mnuGestionPrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuGestionPrestamosMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnuGestionPrestamos);

        mnuTransacciones.setText("Transacciones");
        mnuTransacciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuTransaccionesMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnuTransacciones);

        mnuPrestamos.setText("Prestamos");
        mnuPrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuPrestamosMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnuPrestamos);

        mnuCerrarSesion.setText("Cerrar sesión");
        mnuCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuCerrarSesionMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnuCerrarSesion);

        mnuSalir.setText("Salir");
        mnuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnuSalir);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuConsultaTitularesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultaTitularesActionPerformed
        eliminarPaneles();

        gerenteConsulta = new GerenteConsulta(banco);
        add(gerenteConsulta).setVisible(true);
        pack();
    }//GEN-LAST:event_mnuConsultaTitularesActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        validarLogin();
    }//GEN-LAST:event_btnAceptarActionPerformed

    /**
     * Comprueba si el login es correcto o no. En el caso de que el login y/o la
     * contraseña estén vacios lanza una ventana de error En el caso de que no
     * sea correcto lanza una ventana de error. En el caso de que sea correcto
     * inicia sesión.
     */
    private void validarLogin() {
        String usuario = this.txtUsuario.getText();
        String contrasenna = Algoritmos.getMD5(new String(this.pswContrasenna.getPassword()));

        if (loginVacio()) {
            ventanaAdvertencia("Usario y/o contraseña vacío(s).", "Error de acceso");
        } else if (banco.loginCorrecto(usuario, contrasenna)) {
            int posicionUsuario = banco.getUsuarios().indexOf(new Usuario(usuario));

            iniciarSesion(banco.getUsuarios().get(posicionUsuario).getTipo());
        } else {
            ventanaAdvertencia("Usario y/o contraseña incorrecto(s).", "Error de acceso");
        }
    }

    /**
     * Comprueba si el login esta vacio
     *
     * @return Ralse si tiene contenido el login y contraseña, true si esta
     * vacio el login y contraseña.
     */
    private boolean loginVacio() {
        boolean vacio = false;

        if (this.txtUsuario.getText().isEmpty() || new String(this.pswContrasenna.getPassword()).isEmpty()) {
            vacio = true;
        }

        return vacio;
    }

    /**
     * Inicia sesión según el tipo de usuario que se ha logueado.
     *
     * @param tipo Tipo de usuario que se ha logueado.
     */
    private void iniciarSesion(Tipo tipo) {
        remove(panelLogin);
        this.jMenuBar1.setVisible(true);
        switch (tipo.getDenominacion()) {
            case "Gerente" -> {
                mostrarMenuGerente();
            }
            case "Cajero" -> {
                mostrarMenuCajero();
            }
        }
    }

    /**
     * Muestra los elementos del menú pertenecientes al gerente.
     */
    private void mostrarMenuGerente() {
        mnuTransacciones.setVisible(false);
        mnuPrestamos.setVisible(false);
    }

    /**
     * Muestra los elementos del menú pertenecientes al cajero.
     */
    private void mostrarMenuCajero() {
        mnuTitulares.setVisible(false);
        mnuAperturaCuentas.setVisible(false);
        mnuGestionPrestamos.setVisible(false);
    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.txtUsuario.setText("");
        this.pswContrasenna.setText("");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void mnuAltaTitularesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAltaTitularesActionPerformed
        eliminarPaneles();

        gerenteAlta = new GerenteAlta(banco);
        add(gerenteAlta).setVisible(true);
        pack();
    }//GEN-LAST:event_mnuAltaTitularesActionPerformed

    private void mnuModificacionTitularesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuModificacionTitularesActionPerformed
        eliminarPaneles();
        
        gerenteModificacion = new GerenteModificacion(banco);
        add(gerenteModificacion).setVisible(true);
        pack();
    }//GEN-LAST:event_mnuModificacionTitularesActionPerformed

    private void mnuAperturaCuentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuAperturaCuentasMouseClicked
        eliminarPaneles();

        gerenteAperturaCuentas = new GerenteAperturaCuentas(banco);
        add(gerenteAperturaCuentas).setVisible(true);
        pack();
    }//GEN-LAST:event_mnuAperturaCuentasMouseClicked

    private void mnuGestionPrestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuGestionPrestamosMouseClicked
        eliminarPaneles();

        gerentePrestamos = new GerentePrestamos(banco);
        add(gerentePrestamos).setVisible(true);
        pack();
    }//GEN-LAST:event_mnuGestionPrestamosMouseClicked

    private void mnuCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuCerrarSesionMouseClicked
        dispose();
        new Ventana(banco).setVisible(true);
    }//GEN-LAST:event_mnuCerrarSesionMouseClicked

    private void mnuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_mnuSalirMouseClicked

    private void mnuTransaccionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuTransaccionesMouseClicked
        eliminarPaneles();

        cajeroTransacciones = new CajeroTransacciones(banco);
        add(cajeroTransacciones).setVisible(true);
        pack();
    }//GEN-LAST:event_mnuTransaccionesMouseClicked

    private void mnuPrestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuPrestamosMouseClicked
        eliminarPaneles();
        
        cajeroPrestamos = new CajeroPrestamos(banco);
        add(cajeroPrestamos).setVisible(true);
        pack();
    }//GEN-LAST:event_mnuPrestamosMouseClicked

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuAltaTitulares;
    private javax.swing.JMenu mnuAperturaCuentas;
    private javax.swing.JMenu mnuCerrarSesion;
    private javax.swing.JMenuItem mnuConsultaTitulares;
    private javax.swing.JMenu mnuGestionPrestamos;
    private javax.swing.JMenuItem mnuModificacionTitulares;
    private javax.swing.JMenu mnuPrestamos;
    private javax.swing.JMenu mnuSalir;
    private javax.swing.JMenu mnuTitulares;
    private javax.swing.JMenu mnuTransacciones;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPasswordField pswContrasenna;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    /**
     * Muestra una ventana de advertencia con un determinado titulo y mensaje.
     *
     * @param mensaje Mensaje de la ventana.
     * @param titulo Titulo de la ventana.
     */
    public void ventanaAdvertencia(String mensaje, String titulo) {
        String rutaImagen = "src/images/advertencia.png";
        ImageIcon icono = new ImageIcon(rutaImagen);
        JOptionPane.showMessageDialog(this, mensaje, titulo, JOptionPane.WARNING_MESSAGE, icono);
    }

    /**
     * Elimina cualquier panel que se esté ejecutando en la ventana.
     */
    private void eliminarPaneles() {
        try {
            remove(gerenteAlta);
            pack();
        } catch (java.lang.NullPointerException ex) {
        }
        try {
            remove(gerenteConsulta);
            pack();
        } catch (java.lang.NullPointerException ex) {
        }
        try {
            remove(gerenteModificacion);
            pack();
        } catch (java.lang.NullPointerException ex) {
        }
        try {
            remove(gerenteAperturaCuentas);
            pack();
        } catch (java.lang.NullPointerException ex) {
        }
        try {
            remove(gerentePrestamos);
            pack();
        } catch (java.lang.NullPointerException ex) {
        }
        try {
            remove(cajeroTransacciones);
            pack();
        } catch (java.lang.NullPointerException ex) {
        }
        try {
            remove(cajeroPrestamos);
            pack();
        } catch (java.lang.NullPointerException ex) {
        }
    }
}
