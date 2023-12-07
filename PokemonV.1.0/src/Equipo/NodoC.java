/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Equipo;


/**
 *
 * @author cesar
 */
public class NodoC {
    private Equipo dato; // Info que quiero guardar
    private NodoC atras; // Fija la referencia que sigue en la cola

    public NodoC(Equipo dato, NodoC atras) {
        this.dato = dato;
    }

    public Equipo getDato() {
        return dato;
    }

    public void setDato(Equipo dato) {
        this.dato = dato;
    }

    public NodoC getAtras() {
        return atras;
    }

    public void setAtras(NodoC atras) {
        this.atras = atras;
    }

    @Override
    public String toString() {
        return "NodoC: "+ dato;
    }
    
    
    
    
}
