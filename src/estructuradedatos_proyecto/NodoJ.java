/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuradedatos_proyecto;

/**
 *
 * @author emaa
 */
public class NodoJ {
    
    private Jugador dato;
    private NodoJ next;    // almacenar la referencia al siguiente objeto

    public NodoJ(Jugador dato) {
        this.dato = dato;
        
    }

    public Jugador getDato() {
        return dato;
    }

    public void setDato(Jugador dato) {
        this.dato = dato;
    }

    public NodoJ getNext() {
        return next;
    }

    public void setNext(NodoJ next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }
    
}


