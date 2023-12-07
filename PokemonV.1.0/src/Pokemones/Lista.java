/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pokemones;

/**
 *
 * @author cesar
 */
public class Lista {
    
    private Nodo cabeza;
    
    public void inserta(Pokemon p) {
        if (duplicados(p)) {
            // La persona ya existe, no la agregamos nuevamente.
            return;
        }

        if (cabeza == null) {
            cabeza = new Nodo(p);
        } else if (p.getId() < cabeza.getDato().getId()) {
            Nodo aux = new Nodo(p);
            aux.setNext(cabeza);
            cabeza = aux;
        } else if (cabeza.getNext() == null) {
            cabeza.setNext(new Nodo(p));
        } else {
            Nodo aux = cabeza;

            while (aux.getNext() != null && aux.getNext().getDato().getId() < p.getId()) {
                aux = aux.getNext();
            }

            Nodo temp = new Nodo(p);
            temp.setNext(aux.getNext());
            aux.setNext(temp);
        }
    }

    public Pokemon buscar(int id){
        
        Nodo aux = cabeza;

        while (aux != null) {
            if (aux.getDato().getId() == id) {
                return aux.getDato(); // Se encontró la coincidencia, devuelve el Pokemon
            }
            aux = aux.getNext();
        }

        return null;
    }
    
    public boolean duplicados(Pokemon p) {
    Nodo aux = cabeza;

    while (aux != null) {
        if (aux.getDato().equals(p)) {

            return true;
        }
        aux = aux.getNext();
    }

    return false;
    }
    
    public void invertir() {
    Nodo prev = null;    // Indicará el nodo anterior
    Nodo actual = cabeza;   // Indicará el nodo actual
    Nodo siguiente = null;  // Indicará el nodo siguiente

    while (actual != null) {
        siguiente = actual.getNext();
        actual.setNext(prev);
        prev = actual;
        actual = siguiente;
    }

    cabeza = prev; // La nueva cabeza es el último nodo.
    }


    


    @Override
    public String toString() {
        Nodo aux = cabeza;
        String s = "Lista: ";
        while (aux != null){
            s += aux + ", ";
            aux = aux.getNext();
        }
        return s;
    }
    
}
