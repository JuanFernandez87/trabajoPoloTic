package Logica;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Empleado extends Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id_empleado;

    @OneToOne
    Juego unJuego;
    @OneToOne //relacion de 1 a 1 con un usuario
    Usuario unUsuario;

    public Empleado(){
    }

    public Empleado(String dni, String nombre, String apellido, String direccion, Date fecha_nac, int id_empleado, Juego unJuego, Usuario unUsuario) {
        super(dni, nombre, apellido, direccion, fecha_nac);
        this.id_empleado = id_empleado;
        this.unJuego = unJuego;
        this.unUsuario = unUsuario;
    }
        
    public Usuario getUnUsuario() {
        return unUsuario;
    }
    
    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }
    
    public int getId_empleado() {
        return id_empleado;
    }
    
    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }
    
    @Override
    public String getDni() {
        return dni;
    }
    
    @Override
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    @Override
    public String getNombre() {
        return nombre;
    }
    
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String getApellido() {
        return apellido;
    }
    
    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String getDireccion() {
        return this.direccion;
    }

    @Override
    public void setDireccion(String unaDireccion) {
        this.direccion = unaDireccion;
    }

    @Override
    public Date getfecha_nac() {
        return this.fecha_nac;
    }

    @Override
    public void setfecha_nac(Date unafecha_nac) {
        this.fecha_nac = unafecha_nac;
    }

}
