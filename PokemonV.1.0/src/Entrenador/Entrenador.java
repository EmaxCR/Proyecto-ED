
package Entrenador;

import Equipo.Cola;

public class Entrenador {
    
    private int id;
    private String nombre;
    private Cola equipo;
    
    public Entrenador(int id, String nombre, Cola equipo) {
        this.id = id;
        this.nombre = nombre;
        this.equipo = equipo;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Cola getEquipo() {
        return equipo;
    }
    
    public void setEquipo(Cola equipo) {
        this.equipo = equipo;
    }
    
}
