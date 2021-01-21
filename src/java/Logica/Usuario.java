package Logica;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id_usuario;
    
    @Basic
    String nombreUsuario;
    String contrasenia;
    
    public Usuario() {
    }

    public Usuario(int id_usuario, String nombreUsuario, String contrasenia) {
        this.id_usuario = id_usuario;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
    }    

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
       
    
}
