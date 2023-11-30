/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Battle;

/**
 *
 * @author cesar
 */
public class BattleLogic {
    public static Lista laLista= new Lista();
    
    public void setUp(){
        laLista.inserta(new Pokemon("Agua", "Squirtle", 1));
        laLista.inserta(new Pokemon("Fuego", "Charmander", 2));
        laLista.inserta(new Pokemon("Normal", "Snorlax", 3));
        laLista.inserta(new Pokemon("Agua", "Magikarp", 4));
        laLista.inserta(new Pokemon("Fuego", "Slugma", 5));
        laLista.inserta(new Pokemon("Normal", "Meowth", 6));
        laLista.inserta(new Pokemon("Agua", "Lapras", 7));
        laLista.inserta(new Pokemon("Fuego", "Arcanine", 8));
        laLista.inserta(new Pokemon("Normal", "Eevee", 9));
        
        System.out.println(laLista.toString());
        System.out.println("Setup complete");
        
    }
    
    public void start(){
        MainBattle battle = new MainBattle();
        battle.show();
    }
}
