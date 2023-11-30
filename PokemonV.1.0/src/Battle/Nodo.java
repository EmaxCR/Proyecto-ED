/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Battle;



/**
 *
 * @author cesar
 */
public class Nodo {
    
    private Pokemon dato;
    private Nodo next;    // almacenar la referencia al siguiente objeto

    public Nodo(Pokemon dato) {
        this.dato = dato;
        
    }

    public Pokemon getDato() {
        return dato;
    }

    public void setDato(Pokemon dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }
    
}
