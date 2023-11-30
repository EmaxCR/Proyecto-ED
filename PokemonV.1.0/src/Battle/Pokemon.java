/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Battle;

import javax.swing.ImageIcon;

/**
 *
 * @author cesar
 */
public class Pokemon{
    
    Tipo t = new Tipo();
    
    private Tipo tipo;
    private String nombre;
    private int id;
    private ImageIcon img;
    
    public Pokemon(String tipo, String nombre, int id,ImageIcon img){
        this.nombre = nombre;
        this.id = id;
        this.img = img;
        switch(tipo){
            case "Normal":
                this.tipo = t.getNormal();
                this.tipo.setTipoString("Normal");
                break;
            case "Agua":
                this.tipo = t.getAgua();
                this.tipo.setTipoString("Agua");
                break;
            case "Fuego":
                this.tipo = t.getFuego();
                this.tipo.setTipoString("Fuego");
                break;
            default:
                this.tipo = t.getNormal();
                this.tipo.setTipoString("Normal");
                break;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Pokemon(){}

    public Tipo getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "tipo=" + tipo.toString() + ", nombre=" + nombre + '}';
    }
    
}
