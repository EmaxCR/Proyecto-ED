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
public class NodoC {
    private Pokemon pkmn; // Info que quiero guardar
    private NodoC atras; // Fija la referencia que sigue en la cola

    public NodoC(Pokemon dato) {
        this.pkmn = pkmn;
    }

    public Pokemon getDato() {
        return pkmn;
    }

    public void setDato(Pokemon dato) {
        this.pkmn = dato;
    }

    public NodoC getAtras() {
        return atras;
    }

    public void setAtras(NodoC atras) {
        this.atras = atras;
    }

    @Override
    public String toString() {
        return "NodoC: "+ pkmn;
    }

    
    
    
    
}
