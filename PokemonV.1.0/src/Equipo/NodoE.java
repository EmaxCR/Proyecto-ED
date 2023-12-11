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
public class NodoE {
    private Pokemon pkmn;
    private NodoE next;
    private NodoE back;

    public NodoE(Pokemon pkmn) {
        this.pkmn = pkmn;
    }
    
    public Pokemon getDato() {
        return pkmn;
    }

    public void setDato(Pokemon pkmn) {
        this.pkmn = pkmn;
    }

    public NodoE getNext() {
        return next;
    }

    public void setNext(NodoE next) {
        this.next = next;
    }

    public NodoE getBack() {
        return back;
    }

    public void setBack(NodoE back) {
        this.back = back;
    }
    
    @Override
    public String toString() {
        return ""+pkmn;
    }
    
    
}
