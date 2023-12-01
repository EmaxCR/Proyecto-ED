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
    public static Lista laListap= new Lista();
    
    public void setUp(){
        
        Imagenes img = new Imagenes();
        
        laListap.inserta(new Pokemon("Agua", "Squirtle", 1, img.Squirtle));
        laListap.inserta(new Pokemon("Fuego", "Charmander", 2,img.Charmander));
        laListap.inserta(new Pokemon("Normal", "Snorlax", 3, img.Snorlax));
        laListap.inserta(new Pokemon("Agua", "Magikarp", 4, img.Magikarp));
        laListap.inserta(new Pokemon("Fuego", "Slugma", 5, img.Slugma));
        laListap.inserta(new Pokemon("Normal", "Meowth", 6, img.Meowth));
        laListap.inserta(new Pokemon("Agua", "Lapras", 7, img.Lapras));
        laListap.inserta(new Pokemon("Fuego", "Arcanine", 8, img.Arcanine));
        laListap.inserta(new Pokemon("Normal", "Eevee", 9, img.Eevee));
        
        System.out.println(laListap.toString());
        System.out.println("Setup complete");
        
    }
    
    public void start(){
        MainBattle battle = new MainBattle();
        battle.show();
    }
}
