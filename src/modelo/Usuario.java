/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Objects;

/**
 *
 * @author Andrés
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

    public Usuario(String login) {
        this.login = login;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.login);
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
        final Usuario other = (Usuario) obj;
        return Objects.equals(this.login, other.login);
    }
    
    
    
    
}
