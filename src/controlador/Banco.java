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
 * @author Andrés
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
        titulares.add(new Titular("98003826K", "Andres", "asdf", "asdf"));
        cuentas.add(new Cuenta("123", titulares.get(0), 123.0));
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
    
    public Titular getTitular(String dni){
        int posicionTitular = titulares.indexOf(new Titular(dni));
        
        return titulares.get(posicionTitular);
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    /**
     * Comprueba la existencia de un usuario
     *
     * @param usuario Login del usuario
     * @param contrasenna Contraseña de el usuario
     * @return True si el usuario existe y la contraseña coincide con ese
     * usuario. False si el usuario no existe o la contraseña es incorrecta;
     */
    public boolean loginCorrecto(String usuario, String contrasenna) {
        boolean correcto;

        if (!usuarios.contains(new Usuario(usuario))) {
            correcto = false;
        } else if (contrasennaCorrecta(usuario, contrasenna)) {
            correcto = true;
        } else {
            correcto = false;
        }

        return correcto;
    }

    /**
     * Metodo para comprobar si una contraseña coincide con la contraseña de un
     * usuario ya existente.
     *
     * @param usuario Login del usuario
     * @param contrasenna Contraseña del usuario
     * @return True si la contraseña es correcta. False si la contraseña es
     * incorrecta.
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

    public void guardarTitular(String dni, String nombre, String direccion, String email) {
        titulares.add(new Titular(dni, nombre, direccion, email));
    }

    /**
     * Verifica que el dni es válido
     *
     * @param dni DNI
     * @return False si no es correcto, True si es correcto
     */
    public boolean dniValido(String dni) {
        boolean valido;
        String regexDni = "[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]";

        if (dni.matches(regexDni)) {
            if (letraCorrecta(dni)) {
                valido = true;
            } else {
                valido = false;
            }
        } else {
            valido = false;
        }

        return valido;
    }

    /**
     * Comprueba que la letra del dni sea correcta
     *
     * @param dni DNI
     * @return False si no es correcto, True si es correcto
     */
    private boolean letraCorrecta(String dni) {
        boolean correcto;
        int resto;
        char letraObtenida;
        char[] letrasPosibles = "TRWAGMYFPDXBNJZSQVHLCKE".toCharArray();
        int numeros = Integer.parseInt(dni.substring(0, 8));
        char letraActual = dni.charAt(8);

        // calculo el resto del dni
        resto = numeros % 23;
        // obtengo la letra correspondiente a ese dni
        letraObtenida = letrasPosibles[resto];
        // compruebo que la letra obtenida que le corresponde a ese resto coincida con la estipulada
        if (letraActual == letraObtenida) {
            correcto = true;
        } else {
            correcto = false;
        }

        return correcto;
    }

    /**
     * Comprueba si un titular existe.
     * @param dni DNI del titular
     * @return True si existe, false si no existe.
     */
    public boolean titularExiste(String dni) {
        boolean existe;

        existe = titulares.contains(new Titular(dni));

        return existe;
    }

    /**
     * Guarda la cuenta.
     * @param numeroCuenta Numero de cuenta
     * @param dni DNI del titular
     * @param saldo Saldo
     */
    public void guardarCuenta(String numeroCuenta, String dni, double saldo) {
        Titular titular = titulares.get(titulares.indexOf(new Titular(dni)));
        
        cuentas.add(new Cuenta(numeroCuenta, titular, saldo));
    }

    /**
     * Comprueba si una cuenta existe.
     * @param numeroCuenta
     * @return True si la cuenta existe, false si la cuenta no existe.
     */
    public boolean cuentaExistente(String numeroCuenta) {
        boolean existe;

        existe = cuentas.contains(new Cuenta(numeroCuenta));

        return existe;
    }

}
