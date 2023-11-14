/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuradedatos_proyecto;

/*

 * @author cesar

 */
public class EstructuraDeDatos_Proyecto {

    public static void main(String[] args) {
        Lista laLista= new Lista();
        
        laLista.inserta(new Pokemon("Agua", "Squirtle", 1));
        laLista.inserta(new Pokemon("Fuego", "Charmander", 2));
        laLista.inserta(new Pokemon("Normal", "Bulbasaur", 3));
        
        System.out.println(laLista.toString());
        
    }
    
}
