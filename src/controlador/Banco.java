/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.Cuenta;
import modelo.Tipo;
import modelo.Titular;
import modelo.Usuario;
import utilidades.Algoritmos;

/**
 *
 * @author dam
 */
public class Banco {
    private ArrayList<Tipo> tipos;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Titular> titulares;
    private ArrayList<Cuenta> cuentas;

    public Banco() {
        tipos = new ArrayList();
        usuarios = new ArrayList();
        titulares = new ArrayList();
        cuentas = new ArrayList();
        
        annadirTipos();
        annadirUsuarios();
    }

    private void annadirTipos() {
        tipos.add(new Tipo(1, "Gerente"));
        tipos.add(new Tipo(2, "Cajero"));
    }
    
    private void annadirUsuarios() {
        usuarios.add(new Usuario("admin", Algoritmos.getMD5("admin"), tipos.get(0), 1));
        usuarios.add(new Usuario("andres", Algoritmos.getMD5("1234"), tipos.get(1), 2));
    }
    
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public ArrayList<Titular> getTitulares() {
        return titulares;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    
    
    
}
