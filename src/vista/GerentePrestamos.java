/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import controlador.Banco;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Titular;

/**
 *
 * @author Andrés
 */
public class GerentePrestamos extends javax.swing.JPanel {

    DefaultComboBoxModel modeloComboTitulares;
    Banco banco;

    /**
     * Creates new form GerentePrestamos
     *
     * @param banco
     */
    public GerentePrestamos(Banco banco) {
        this.banco = banco;
        inicializarComboTitulares();
        initComponents();
    }

    /**
     * Inicializa el combo box de los titulares.
     */
    private void inicializarComboTitulares() {
        Vector listaTitulares = new Vector(banco.getTitulares());
        modeloComboTitulares = new DefaultComboBoxModel(listaTitulares);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbTitular = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtInteres = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPlazo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(850, 480));

        cmbTitular.setModel(modeloComboTitulares);
        cmbTitular.setSelectedIndex(-1);

        jLabel1.setText("Titular");

        jLabel2.setText("Monto");

        jLabel3.setText("Tasa Interés");

        jLabel4.setText("Plazo");

        jLabel5.setText("Hasta:");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(258, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancelar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)))
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPlazo, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                        .addComponent(cmbTitular, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMonto)
                        .addComponent(txtInteres))
                    .addComponent(btnAceptar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(270, 270, 270))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtInteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap(97, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        tramitarPrestamo();
    }//GEN-LAST:event_btnAceptarActionPerformed

    /**
     * Tramita el préstamo si los datos son correctos.
     */
    private void tramitarPrestamo() {
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("d/M/y");
        Titular titular = (Titular) cmbTitular.getSelectedItem(); // convierto el item seleccionado de un Object a un Titular, lo "casteo"
        String monto = txtMonto.getText().trim();
        String interes = txtInteres.getText().trim();
        String plazo = txtPlazo.getText().trim();

        if (camposValidos(titular, monto, interes, plazo)) {
            titular.guardarPrestamo(Double.parseDouble(monto), Double.parseDouble(interes), LocalDate.parse(plazo, formatoFecha));
            ventanaInformacion("Prestamo tramitado", "Informacion");
            limpiarCampos();
        }

    }

    /**
     * Comprueba si los campos son váidos.
     *
     * @param titular Titular
     * @param monto Monto
     * @param interes Interes
     * @param plazo Plazo
     * @return True si con sorrectos, False si no son correctos.
     */
    private boolean camposValidos(Titular titular, String monto, String interes, String plazo) {
        boolean valido;

        if (!titularValido(titular)) {
            valido = false;
        } else if (!montoValido(monto)) {
            valido = false;
        } else if (!interesValido(interes)) {
            valido = false;
        } else if (!plazoValido(plazo)) {
            valido = false;
        } else {
            valido = true;
        }

        return valido;
    }

    /**
     * Valida si el titular es válido
     *
     * @param titular Titular
     * @return True si el titular es válido, false si el titular no es válido.
     */
    private boolean titularValido(Titular titular) {
        boolean valido;

        if (titular == null) {
            ventanaAdvertencia("Selecciona un titular", "Error");
            valido = false;
        } else if (titular.getPrestamo().isActivo()) {
            ventanaAdvertencia(titular.toString() + " ya tiene un préstamo a su nombre.", "Error");
            valido = false;
        } else {
            valido = true;
        }

        return valido;
    }

    /**
     * Valida si el monto es válido.
     *
     * @param monto Monto
     * @return True si el monto es válido, false si el monto no es válido.
     */
    private boolean montoValido(String monto) {
        boolean valido;

        if (monto.equals("")) {
            ventanaAdvertencia("Introduce un monto", "Error");
            valido = false;
        } else if (!esDouble(monto)) {
            ventanaAdvertencia("El monto no es un número", "Error");
            valido = false;
        } else if (Double.parseDouble(monto) < 0) {
            ventanaAdvertencia("El monto tiene que ser positivo", "Error");
            valido = false;
        } else {
            valido = true;
        }

        return valido;
    }

    /**
     * Valida si el interés es válido.
     *
     * @param interes Interés
     * @return True si el interes es válido, false si el interes no es válido.
     */
    private boolean interesValido(String interes) {
        boolean valido;

        if (interes.equals("")) {
            ventanaAdvertencia("Introduce un interes", "Error");
            valido = false;
        } else if (!esDouble(interes)) {
            ventanaAdvertencia("El interes no es un número", "Error");
            valido = false;
        } else if (Double.parseDouble(interes) <= 0 && Double.parseDouble(interes) >= 1) {
            ventanaAdvertencia("El interes tiene que ser positivo", "Error");
            valido = false;
        } else {
            valido = true;
        }

        return valido;
    }

    /**
     * Valida si un valor es double o no.
     *
     * @param valor
     * @return
     */
    private boolean esDouble(String valor) {
        boolean valido;

        try {
            Double.valueOf(valor);
            valido = true;
        } catch (NumberFormatException ex) {
            valido = false;
        }

        return valido;
    }

    /**
     * Valida si un plazo es válido.
     *
     * @param plazo Plazo
     * @return True si el plazo es válido, false si no es válido.
     */
    private boolean plazoValido(String plazo) {
        boolean valido;
        if (plazo.isEmpty()) {
            ventanaAdvertencia("Introduce un plazo", "Error");
            valido = false;
        } else if (!fechaValida(plazo)) {
            ventanaAdvertencia("Introduce una fecha con el formato dd/mm/aaaa", "Error");
            valido = false;
        } else if (!fechaMayorActual(plazo)) {
            ventanaAdvertencia("La fecha no puede ser menor a hoy", "Error");
            valido = false;
        } else {
            valido = true;
        }
        return valido;
    }

    /**
     * Valida si una fecha cumple un formato o no.
     *
     * @param plazo
     * @return True si es válida, false si no es válida.
     */
    private boolean fechaValida(String plazo) {
        boolean valido;
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("d/M/y");

        try {
            LocalDate.parse(plazo, formatoFecha);
            valido = true;
        } catch (DateTimeParseException ex) {
            valido = false;
        }

        return valido;
    }

    /**
     * Valida si una fecha es mayor a la actual.
     *
     * @param plazo Fecha en cuestion.
     * @return True si la fecha es mayor a la actual, false si es menor a la
     * actual.
     */
    private boolean fechaMayorActual(String plazo) {
        boolean valido;
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("d/M/y");
        LocalDate hoy = LocalDate.now();
        LocalDate fechaPlazo = LocalDate.parse(plazo, formatoFecha);

        if (hoy.compareTo(fechaPlazo) < 0) {
            valido = true;
        } else {
            valido = false;
        }

        return valido;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cmbTitular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtInteres;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtPlazo;
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
    
    /**
     * Limpia todos los campos.
     */
    private void limpiarCampos() {
        cmbTitular.setSelectedIndex(-1);
        txtMonto.setText("");
        txtInteres.setText("");
        txtPlazo.setText("");
    }

}
