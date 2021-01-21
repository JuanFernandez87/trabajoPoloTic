package Logica;

import Persistencia.ControladoraPersistencia;

import java.util.ArrayList;
import java.util.List;

public class Controladora {
        
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
   
    public void crearJuego (String nombre, String dia, String inicio, String fin, int capacidad){
        
        Horario hora = new Horario();
        hora.setDia_semana(dia);
        hora.setHora_inicio(inicio);
        hora.setHora_fin(fin);
        controlPersis.crearHorario(hora);
        
        Juego jue = new Juego();
        jue.setNombre(nombre);
        jue.setCapacidad(capacidad);
        jue.setHorario(hora); 
        controlPersis.crearJuego(jue);
    }
    
    public boolean crearEntrada(String nombre, String dia, String horaEntrada) {
        Entrada ent = new Entrada(); 
       
        boolean aux = false;        
        int hora = Integer.parseInt(horaEntrada);
        
        List <Juego> listaJuegos = new ArrayList <Juego>();
        listaJuegos = controlPersis.getJuego();
        for(Juego jue:listaJuegos){
            if(jue.getNombre().equals(nombre) && (jue.getCapacidad()>0)){
                if((Integer.parseInt(jue.getHorario().getHora_inicio()) <= hora) && (Integer.parseInt(jue.getHorario().getHora_fin()) >= hora) && (jue.getHorario().getDia_semana().equals(dia))){
                        ent.setUnJuego(jue);
                        ent.setHorario(jue.getHorario());                
                
                        controlPersis.crearEntrada(ent); 
                        controlPersis.actualizarDisponibilidad(jue.getId_juego());
                        aux = true;
                        return aux;
                }
            }
        }
        return aux;
        }   
                       

     public boolean ConsultarJuego(String nombre) {
        boolean aux = false;        
        
        List <Juego> listaJuegos = new ArrayList <Juego>();        
        listaJuegos = controlPersis.getJuego();       
        for(Juego jue:listaJuegos){
            if(jue.getNombre().equals(nombre)){
                aux = true;
                return aux;
            }
        }
        return aux;
    }       
    
    public boolean comprobarIngreso(String usuario, String contra) {
        boolean aux = false;        
        
        List <Usuario> listaUsuarios = new ArrayList <Usuario>();
        
        listaUsuarios = controlPersis.getUsuarios();
        
        for(Usuario usu:listaUsuarios){
            if(usu.getNombreUsuario().equals(usuario) && usu.getContrasenia().equals(contra)){
                aux = true;
                return aux;
            }
        }
        return aux;
    }

    public boolean BorrarJuego(String nombre) {
        boolean aux = false;        
        
        List <Juego> listaJuegos = new ArrayList <Juego>();
        
        listaJuegos = controlPersis.getJuego();
        
        for(Juego jue:listaJuegos){
            if(jue.getNombre().equals(nombre)){
                int id = jue.getId_juego();
                controlPersis.eliminarJuego(id);
                aux = true;
                return aux;
            }
        }
        return aux;
    }           

    public int informarPorFecha(String diaSemana) {
        int aux = 0;
        
        List <Entrada> listaEntradas = new ArrayList <Entrada>();        
        listaEntradas = controlPersis.getEntrada();       
        for(Entrada ent:listaEntradas){
            if(ent.getHorario().getDia_semana().equals(diaSemana)){
                aux++;
            }
        }       
        return aux;   

    }

    public int informarPorNombreYFecha(String nombre, String fecha) {
        int aux = 0;
        /*int id = 0;        
        List <Juego> listaJuegos = new ArrayList <Juego>();        
        listaJuegos = controlPersis.getJuego();       
        for(Juego jue:listaJuegos){
            if(jue.getNombre().equals(nombre)){
                id = jue.getId_juego();
            }
        }*/
        
        List <Entrada> listaEntradas = new ArrayList <Entrada>();        
        listaEntradas = controlPersis.getEntrada();       
        for(Entrada ent:listaEntradas){
            if((ent.getUnJuego().getHorario().getDia_semana().equals(fecha)) && (ent.getUnJuego().getNombre().equals(nombre))){
                aux++;
            }
        }       
        return aux;   

    }

    }


    
