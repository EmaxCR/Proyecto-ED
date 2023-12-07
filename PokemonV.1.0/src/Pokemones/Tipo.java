/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pokemones;


/**
 *
 * @author cesar
 */
public class Tipo {
    
    private Tipo tipo;
    private String tipoString;
    
    private double hp;
    private double ataque;
    private double defensa;
    private double ataq_esp;
    private double def_esp;

    public Tipo(double hp, double ataque, double defensa, double ataq_esp, double def_esp) {
        this.hp = hp;
        this.ataque = ataque;
        this.defensa = defensa;
        this.ataq_esp = ataq_esp;
        this.def_esp = def_esp;
    }

    public Tipo() {
    }
    
    

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public double getDefensa() {
        return defensa;
    }

    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }

    public double getAtaq_esp() {
        return ataq_esp;
    }

    public void setAtaq_esp(double ataq_esp) {
        this.ataq_esp = ataq_esp;
    }

    public double getDef_esp() {
        return def_esp;
    }

    public void setDef_esp(double def_esp) {
        this.def_esp = def_esp;
    }

    public String getTipoString() {
        return tipoString;
    }

    public void setTipoString(String tipoString) {
        this.tipoString = tipoString;
    }

    
    
    public Tipo getNormal(){
        this.tipo = new Tipo(150,50,35,70,60);
        tipoString = "Normal";
        return tipo;
    }
    
    public Tipo getFuego(){
        this.tipo = new Tipo(115,70,45,80,60);
        tipoString = "Fuego";
        return tipo;
    }
    
    public Tipo getAgua(){
        this.tipo = new Tipo(190,55,45,75,65);
        tipoString = "Agua";
        return tipo;
    }

    @Override
    public String toString() {        
        return tipoString;
    }
    
    
    
}
