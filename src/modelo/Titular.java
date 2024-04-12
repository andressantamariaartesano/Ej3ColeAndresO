/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author dam
 */
public class Titular {
    private String dni;
    private String nombre;
    private String direccion;
    private Prestamo prestamo;

    public Titular(String dni, String nombre, String direccion, Prestamo prestamo) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.prestamo = prestamo;
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
    
    
}
