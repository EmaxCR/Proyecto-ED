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
    public static Lista laListat= new Lista();
    
    public void setUp(){
        
        Imagenes imgf = new Imagenes();
        Imagenes imgb = new Imagenes();
       
        
        laListap.inserta(new Pokemon("Agua", "Squirtle", 1, imgb.Squirtle));
        laListap.inserta(new Pokemon("Fuego", "Charmander", 2,imgb.Charmander));
        laListap.inserta(new Pokemon("Normal", "Snorlax", 3, imgb.Snorlax));
        laListap.inserta(new Pokemon("Agua", "Magikarp", 4, imgb.Magikarp));
        laListap.inserta(new Pokemon("Fuego", "Slugma", 5, imgb.Slugma));
        laListap.inserta(new Pokemon("Normal", "Meowth", 6, imgb.Meowth));
        laListap.inserta(new Pokemon("Agua", "Lapras", 7, imgb.Lapras));
        laListap.inserta(new Pokemon("Fuego", "Arcanine", 8, imgb.Arcanine));
        laListap.inserta(new Pokemon("Normal", "Eevee", 9, imgb.Eevee));
        
        
        
        laListat.inserta(new Pokemon("Agua", "Squirtle", 1, imgf.Squirtle));
        laListat.inserta(new Pokemon("Fuego", "Charmander", 2,imgf.Charmander));
        laListat.inserta(new Pokemon("Normal", "Snorlax", 3, imgf.Snorlax));
        laListat.inserta(new Pokemon("Agua", "Magikarp", 4, imgf.Magikarp));
        laListat.inserta(new Pokemon("Fuego", "Slugma", 5, imgf.Slugma));
        laListat.inserta(new Pokemon("Normal", "Meowth", 6, imgf.Meowth));
        laListat.inserta(new Pokemon("Agua", "Lapras", 7, imgf.Lapras));
        laListat.inserta(new Pokemon("Fuego", "Arcanine", 8, imgf.Arcanine));
        laListat.inserta(new Pokemon("Normal", "Eevee", 9, imgf.Eevee));
        
        
        System.out.println(laListap.toString());
        System.out.println(laListat.toString());
        System.out.println("Setup complete");
        
    }
    
    public void start(){
        MainBattle battle = new MainBattle();
        battle.show();
    }
}
