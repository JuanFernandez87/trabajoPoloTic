package Logica;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Entrada implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id_codigo; 

    @OneToOne //relacion de 1 a 1 con un juego
    Juego unJuego;
    @OneToOne //relacion de 1 a 1 con un juego
    Horario horario;

    public Entrada() {
    }

    public Entrada(int id_codigo, Juego unJuego, Horario unHorario) {
        this.id_codigo = id_codigo;
        this.unJuego = unJuego;
        this.horario = unHorario;
    }

    public int getId_codigo() {
        return id_codigo;
    }

    public void setId_codigo(int id_codigo) {
        this.id_codigo = id_codigo;
    }

    public Juego getUnJuego() {
        return unJuego;
    }

    public void setUnJuego(Juego unJuego) {
        this.unJuego = unJuego;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    
    
}