/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entrenador;

/**
 *
 * @author cesar
 */
public class NodoT {
        
    private Entrenador dato;
    private NodoT next;    // almacenar la referencia al siguiente objeto

    public NodoT(Entrenador dato) {
        this.dato = dato;
        
    }

    public Entrenador getDato() {
        return dato;
    }

    public void setDato(Entrenador dato) {
        this.dato = dato;
    }

    public NodoT getNext() {
        return next;
    }

    public void setNext(NodoT next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }
    
}
