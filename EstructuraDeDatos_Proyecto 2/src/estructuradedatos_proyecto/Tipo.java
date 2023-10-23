/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuradedatos_proyecto;


public class Tipo {
    
    private Tipo normal;
    private Tipo fuego;
    private Tipo agua;
    
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

    public Tipo getNormal(){
        this.normal = new Tipo(1,1,1,1,1);
        return normal;
    }
    
    public Tipo getFuego(){
        this.fuego = new Tipo(1,1,1,1,1);
        return fuego;
    }
    
    public Tipo getAgua(){
        this.agua = new Tipo(1,1,1,1,1);
        return agua;
    }
    
}
