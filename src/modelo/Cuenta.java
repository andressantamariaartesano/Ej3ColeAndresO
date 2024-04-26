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
    private Titular titular;
    private double saldo;

    public Cuenta(String numero, Titular titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public Titular getDni() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
    
    
}
