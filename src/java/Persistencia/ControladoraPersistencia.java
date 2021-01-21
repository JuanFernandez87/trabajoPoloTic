package Persistencia;

import Logica.Entrada;
import Logica.Horario;
import Logica.Juego;
import Logica.Usuario;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    //Crea las tablas
    ClienteJpaController jpaCliente = new ClienteJpaController();
    EmpleadoJpaController jpaEmpleado = new EmpleadoJpaController();
    EntradaJpaController jpaEntrada = new EntradaJpaController();
    HorarioJpaController jpaHorario = new HorarioJpaController();
    JuegoJpaController jpaJuego = new JuegoJpaController();
    UsuarioJpaController jpaUsuario = new UsuarioJpaController(); 
    

    public List<Usuario> getUsuarios() {
        return jpaUsuario.findUsuarioEntities();
    }
    
    public void crearHorario(Horario hora){  
        jpaHorario.create(hora);
    } 
        
    public void crearJuego(Juego jue){  
        jpaJuego.create(jue);
    } 
    
    public void crearEntrada(Entrada ent){  
        jpaEntrada.create(ent);
    } 
    
    
    public void eliminarJuego(int idJuego){  
        try {
            jpaJuego.destroy(idJuego);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    public void actualizarDisponibilidad(int idJuego) {
        jpaJuego.decrementarCantidad(idJuego);
    }
    
    public List<Juego> getJuego() {
        return jpaJuego.findJuegoEntities();
    }    
    
    public List<Entrada> getEntrada() {
        return jpaEntrada.findEntradaEntities();
    } 

    public void BuscarJuego(int id) {
        jpaJuego.findJuego(id);
        
    }


 }           

    
