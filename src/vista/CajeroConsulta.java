/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import controlador.Banco;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dam
 */
public class CajeroConsulta extends javax.swing.JPanel {
    Banco banco;
    DefaultTableModel tablaTitulares;
    
    /**
     * Creates new form CajeroConsulta
     */
    public CajeroConsulta(Banco banco) {
        this.banco = banco;
        inicializarModeloTabla();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(850, 480));

        jTable1.setModel(tablaTitulares);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void inicializarModeloTabla() {
        String[][] datos = {};
        String[] columnas = {"DNI", "Nombre", "Direccion", "e-mail"}; 
        tablaTitulares = new DefaultTableModel(datos, columnas);
        annadirFilas();
        
    }

    private void annadirFilas() {
        String[] fila;
        String dni, nombre, direccion, email;
        
        for (int i = 0; i < banco.getTitulares().size(); i++) {
            dni = banco.getTitulares().get(i).getDni();
            nombre = banco.getTitulares().get(i).getNombre();
            direccion = banco.getTitulares().get(i).getDireccion();
            email = banco.getTitulares().get(i).getEmail();
            
            fila = new String[]{dni, nombre, direccion, email};
            
            tablaTitulares.addRow(fila);
        }
        
    }
}
