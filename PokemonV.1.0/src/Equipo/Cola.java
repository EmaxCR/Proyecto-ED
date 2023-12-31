/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Equipo;

/**
 *
 * @author cesar
 */
public class Cola {
    private NodoC frente; // primer objeto que entra a la cola
    private NodoC ultimo;
    
    public void encola(NodoC d){
        if (frente == null){
            frente = d;
            ultimo =d;
        }
        else{
            ultimo.setAtras(d);
            ultimo = d;
        }
    }
    
    public NodoC enfrenta(){
        NodoC aux = frente;
        if (frente != null){
            frente = frente.getAtras();
            aux.setAtras(null);
        }
        return aux;
    }
    
    public String toString(){
        String s = "";
        NodoC aux = frente;
        while (aux!=null){
            s+=aux+"\n";
            aux = aux.getAtras();
        }
        return s;
    }
    
    
}
