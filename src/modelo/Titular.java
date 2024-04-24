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
public class Titular {
    
    private String dni;
    private String nombre;
    private String direccion;
    private String email;
    private Prestamo prestamo;

    public Titular(String dni, String nombre, String direccion, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
    }

    public Titular(String dni) {
        this.dni = dni;
    }
    
    

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.dni);
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
        final Titular other = (Titular) obj;
        return Objects.equals(this.dni, other.dni);
    }
    
    
    
}
