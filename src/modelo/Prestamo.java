/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author Andrés
 */
public class Prestamo {
    private double monto;
    private double tasaInteres;
    private LocalDate plazo;
    private boolean activo;

    public Prestamo() {
        activo = false;
    }
    
    public Prestamo(double monto, double tasaInteres, LocalDate plazo) {
        this.monto = monto;
        this.tasaInteres = tasaInteres;
        this.plazo = plazo;
        activo = true;
    }

    public double getMonto() {
        return monto;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public LocalDate getPlazo() {
        return plazo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
    
    
    
}
