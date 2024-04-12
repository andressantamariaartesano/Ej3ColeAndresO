/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author dam
 */
public class Cuenta {
    private String numero;
    private String dni;
    private double saldo;

    public Cuenta(String numero, String dni, double saldo) {
        this.numero = numero;
        this.dni = dni;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public String getDni() {
        return dni;
    }

    public double getSaldo() {
        return saldo;
    }
    
    
}
