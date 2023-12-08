/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entrenador;

/**
 *
 * @author cesar
 */
public class ListaT {
    
    private NodoT cabeza;
    
    public void inserta(Entrenador p) {
        if (duplicados(p)) {
            // La persona ya existe, no la agregamos nuevamente.
            return;
        }

        if (cabeza == null) {
            cabeza = new NodoT(p);
        } else if (p.getId() < cabeza.getDato().getId()) {
            NodoT aux = new NodoT(p);
            aux.setNext(cabeza);
            cabeza = aux;
        } else if (cabeza.getNext() == null) {
            cabeza.setNext(new NodoT(p));
        } else {
            NodoT aux = cabeza;

            while (aux.getNext() != null && aux.getNext().getDato().getId() < p.getId()) {
                aux = aux.getNext();
            }

            NodoT temp = new NodoT(p);
            temp.setNext(aux.getNext());
            aux.setNext(temp);
        }
    }

    
    
    public boolean duplicados(Entrenador p) {
    NodoT aux = cabeza;

    while (aux != null) {
        if (aux.getDato().equals(p)) {

            return true;
        }
        aux = aux.getNext();
    }

    return false;
    }
    
    public void invertir() {
    NodoT prev = null;    // Indicará el nodo anterior
    NodoT actual = cabeza;   // Indicará el nodo actual
    NodoT siguiente = null;  // Indicará el nodo siguiente

    while (actual != null) {
        siguiente = actual.getNext();
        actual.setNext(prev);
        prev = actual;
        actual = siguiente;
    }

    cabeza = prev; // La nueva cabeza es el último nodo.
    }

    public Entrenador buscar(int id){
        
        NodoT aux = cabeza;

        while (aux != null) {
            if (aux.getDato().getId() == id) {
                return aux.getDato(); // Se encontró la coincidencia, devuelve el Pokemon
            }
            aux = aux.getNext();
        }
        
        return null;
    }
    


    @Override
    public String toString() {
        NodoT aux = cabeza;
        String s = "Lista: ";
        while (aux != null){
            s += aux + ", ";
            aux = aux.getNext();
        }
        return s;
    }
    
    
}
