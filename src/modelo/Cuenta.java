/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Objects;

/**
 *
 * @author dam
 */
public class Cuenta {
    private final String numero;
    private Titular titular;
    private double saldo;

    public Cuenta(String numero, Titular titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Cuenta(String numero) {
        this.numero = numero;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.numero);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cuenta other = (Cuenta) obj;
        return Objects.equals(this.numero, other.numero);
    }
    
    
    
}
