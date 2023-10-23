/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuradedatos_proyecto;

public class Pokemon{
    
    Tipo t;
    
    private Tipo tipo;
    private String nombre;
    private int id;
    
    public Pokemon(String tipo, String nombre, int id){
        this.nombre = nombre;
        this.id = id;
        switch(tipo){
            case "Normal":
                this.tipo = t.getNormal();
                break;
            case "Agua":
                this.tipo = t.getAgua();
                break;
            case "Fuego":
                this.tipo = t.getFuego();
                break;
            default:
                this.tipo = t.getNormal();
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
        return "Pokemon{" + "tipo=" + tipo + ", nombre=" + nombre + '}';
    }
    
    // Estos dos metodos hacen que se puedan igualar las variables de la clase lista
    // sin estos el codigo ve como diferentes a las variables
    

    
}
