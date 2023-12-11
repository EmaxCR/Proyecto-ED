/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Equipo;

import Pokemones.Pokemon;

/**
 *
 * @author cesar
 */
public class ListaDC {
    private NodoE cabeza;
    private NodoE ultimo;
    
    public void inserta(Pokemon p){
        if (cabeza == null){
            cabeza = new NodoE(p);
            ultimo = cabeza;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        } else{
            NodoE aux = cabeza;
            
            while (aux.getNext()!=cabeza){
                aux = aux.getNext();
            }
            NodoE temp = new NodoE(p);
            ultimo.setNext(temp);
            temp.setNext(cabeza);
            temp.setBack(ultimo);
            ultimo = temp;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        }
    }
    
    public String toString() {
        NodoE aux = cabeza;
        String s = "Lista: ";
        
        if (aux!= null){
            s+= aux+ ", ";
            aux = aux.getNext();
            while (aux != cabeza){
                s+= aux+ ", ";
                aux = aux.getNext();
            }
        } else{
            s = "Vacia";
        }
        return s;
    }

    
}
