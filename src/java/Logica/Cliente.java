package Logica;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cliente extends Persona{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) //Genera los id automaticamente
    int id_cliente;
    
    @OneToOne //relacion de 1 a 1 con un usuario
    Entrada entrada;
    
     public Cliente(String dni, String nombre, String apellido, String direccion, Date fecha_nac, Entrada unaEntrada) {
        super(dni, nombre, apellido, direccion, fecha_nac);
        this.id_cliente = id_cliente;
        this.entrada = unaEntrada;
    }   
     
     public Cliente() {
    }
     
    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Entrada getEntrada() {
        return entrada;
    }

    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }

    @Override
    public String getDni() {
        return this.dni;
    }

    @Override
    public void setDni(String unDni) {
        this.dni = unDni;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }

    @Override
    public String getApellido() {
        return this.apellido;
    }

    @Override
    public void setApellido(String unApellido) {
       this.apellido = unApellido;
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