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
        
        Imagenes img = new Imagenes();
        
        laLista.inserta(new Pokemon("Agua", "Squirtle", 1, img.Squirtle));
        laLista.inserta(new Pokemon("Fuego", "Charmander", 2,img.Charmander));
        laLista.inserta(new Pokemon("Normal", "Snorlax", 3, img.Snorlax));
        laLista.inserta(new Pokemon("Agua", "Magikarp", 4, img.Magikarp));
        laLista.inserta(new Pokemon("Fuego", "Slugma", 5, img.Slugma));
        laLista.inserta(new Pokemon("Normal", "Meowth", 6, img.Meowth));
        laLista.inserta(new Pokemon("Agua", "Lapras", 7, img.Lapras));
        laLista.inserta(new Pokemon("Fuego", "Arcanine", 8, img.Arcanine));
        laLista.inserta(new Pokemon("Normal", "Eevee", 9, img.Eevee));
        
        System.out.println(laLista.toString());
        System.out.println("Setup complete");
        
    }
    
    public void start(){
        MainBattle battle = new MainBattle();
        battle.show();
    }
}
