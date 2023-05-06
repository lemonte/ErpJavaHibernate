/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author geandersonlemonte
 */
public class Usuario {
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private int idUsuario;   
    
    @Column (name="nomeUsuario", length = 250, nullable = false)
    private String nomeUsuario;

    @Column (name="administrador",nullable = false)
    private boolean administrador;

    @Override
    public String toString() {
        return "Usuario{" + "nomeUsuario=" + nomeUsuario + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        return this.idUsuario == other.idUsuario;
    }

    
    public Usuario(int idUsuario, String nomeUsuario, boolean administrador) {
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.administrador = administrador;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }
    
    
    
}
