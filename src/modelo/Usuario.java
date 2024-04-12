/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author dam
 */
public class Usuario {
    private String login;
    private String contrasenna;
    private Tipo tipo;
    private int codigo;

    public Usuario(String login, String contrasenna, Tipo tipo, int codigo) {
        this.login = login;
        this.contrasenna = contrasenna;
        this.tipo = tipo;
        this.codigo = codigo;
    }

    public String getLogin() {
        return login;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public int getCodigo() {
        return codigo;
    }
    
    
    
    
}
