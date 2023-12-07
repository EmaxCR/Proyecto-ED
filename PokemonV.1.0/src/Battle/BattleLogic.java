/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Battle;

import Entrenador.Entrenador;
import Entrenador.ListaT;
import Equipo.Cola;
import Pokemones.Pokemon;
import Pokemones.Lista;
import framemenu.Menu;

/**
 *
 * @author cesar
 */
public class BattleLogic {
    public static Lista laListap= new Lista();
    public static Lista laListat= new Lista();
    
    public static ListaT listaTrainer = new ListaT();
    
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
        
        
        Cola eq1 = new Cola();
        
        Menu menuS = new Menu();
        menuS.show();
        
        Cola eq2 = new Cola();
        
        
        
        Cola eq3 = new Cola();
        
        
        
        Cola eq4 = new Cola();
        
        
        
        
        listaTrainer.inserta(new Entrenador(1, "Paco", eq1));
        listaTrainer.inserta(new Entrenador(2, "Andrés", eq2));
        listaTrainer.inserta(new Entrenador(3, "Gojo", eq3));
        
        
        System.out.println("Setup complete");
        
    }

}
