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
        
        inicializarTipos();
        inicializarUsuarios();
    }

    private void inicializarTipos() {
        tipos.add(new Tipo(1, "Gerente"));
        tipos.add(new Tipo(2, "Cajero"));
    }
    
    private void inicializarUsuarios() {
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

    
    /**
     * Comprueba la existencia de un usuario
     * @param usuario Login del usuario
     * @param contrasenna Contraseña de el usuario
     * @return True si el usuario existe y la contraseña coincide con ese usuario.
     * False si el usuario no existe o la contraseña es incorrecta;
     */
    public boolean loginCorrecto(String usuario, String contrasenna) {
        boolean correcto;
        
        if (!usuarios.contains(new Usuario(usuario))) {
            correcto = false;
        } else if (contrasennaCorrecta(usuario, contrasenna)){
            correcto = true;
        } else {
            correcto = false;
        }
        
        return correcto;
    }
    
    /**
     * Metodo para comprobar si una contraseña coincide con la contraseña de un usuario ya existente.
     * @param usuario Login del usuario
     * @param contrasenna Contraseña del usuario
     * @return True si la contraseña es correcta. False si la contraseña es incorrecta.
     */
    private boolean contrasennaCorrecta(String usuario, String contrasenna) {
        int posicionUsuario = usuarios.indexOf(new Usuario(usuario));
        boolean correcto;
        
        if (usuarios.get(posicionUsuario).getContrasenna().equals(contrasenna)) {
            correcto = true;
        } else {
            correcto = false;
        }
        
        return correcto;
    }

    
    
    
}
