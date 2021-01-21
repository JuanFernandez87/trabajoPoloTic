package Logica;

import java.util.Date;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Persona {
    @Id
    String dni;
    String nombre;
    String apellido;
    String direccion;
    @Temporal(TemporalType.DATE)
    Date fecha_nac;

    public Persona() {
    }
       
    public Persona(String dni, String nombre, String apellido, String direccion, Date fecha_nac) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.fecha_nac = fecha_nac;
    }
    
    public abstract String getDni();
    public abstract void setDni(String dni);
    
    public abstract String getNombre();
    public abstract void setNombre(String nombre);

    public abstract String getApellido();
    public abstract void setApellido(String apellido);

    public abstract String getDireccion();
    public abstract void setDireccion(String direccion);
    
    public abstract Date getfecha_nac();
    public abstract void setfecha_nac(Date fecha_nac);

}