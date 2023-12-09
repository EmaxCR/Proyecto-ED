/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package framemenu;

import Battle.Imagenes;
import Battle.ImagenesB;
import Battle.MainBattle;
import Entrenador.Entrenador;
import Entrenador.ListaT;
import Equipo.Cola;
import Equipo.NodoC;
import Pokemones.Lista;
import Pokemones.Pokemon;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Arturo
 */
public class Menu extends javax.swing.JFrame {
    
    static Imagenes imgf = new Imagenes();
    static ImagenesB imgb = new ImagenesB();
    
    private int contador = 0;
    static public NodoC pk1 = new NodoC(new Pokemon("Agua", "Squirtle", 1, imgb.getSquirtle()));
    static public NodoC pk2 = new NodoC(new Pokemon("Agua", "Squirtle", 1, imgb.getSquirtle()));
    static public NodoC pk3 = new NodoC(new Pokemon("Agua", "Squirtle", 1, imgb.getSquirtle()));
    static public NodoC pk4 = new NodoC(new Pokemon("Agua", "Squirtle", 1, imgb.getSquirtle()));
    
    public static Lista laListap= new Lista();
    public static Lista laListat= new Lista();
    
    
    public static Cola eq1 = new Cola();
    public static Cola eq2 = new Cola();
    public static Cola eq3 = new Cola();
    public static Cola eq4 = new Cola();
    
    
    public static ListaT listaTrainer = new ListaT();
    
    ImagenFondo ejemplo = new ImagenFondo();
    
    static public NodoC aux1 = new NodoC(new Pokemon("Agua", "Squirtle", 1, imgb.getSquirtle()));
    static public NodoC aux2 = new NodoC(new Pokemon("Agua", "Squirtle", 1, imgb.getSquirtle()));
    static public NodoC aux3 = new NodoC(new Pokemon("Agua", "Squirtle", 1, imgb.getSquirtle()));
    static public NodoC aux4 = new NodoC(new Pokemon("Agua", "Squirtle", 1, imgb.getSquirtle()));
    
    
    
    public void setUpP(){
        
        
        laListap.inserta(new Pokemon("Agua", "Squirtle", 1, imgb.getSquirtle()));
        laListap.inserta(new Pokemon("Fuego", "Charmander", 2,imgb.getCharmander()));
        laListap.inserta(new Pokemon("Normal", "Snorlax", 3, imgb.getSnorlax()));
        laListap.inserta(new Pokemon("Agua", "Magikarp", 4, imgb.getMagikarp()));
        laListap.inserta(new Pokemon("Fuego", "Slugma", 5, imgb.getSlugma()));
        laListap.inserta(new Pokemon("Normal", "Meowth", 6, imgb.getMeowth()));
        laListap.inserta(new Pokemon("Agua", "Lapras", 7, imgb.getLapras()));
        laListap.inserta(new Pokemon("Fuego", "Arcanine", 8, imgb.getArcanine()));
        laListap.inserta(new Pokemon("Normal", "Eevee", 9, imgb.getEevee()));
        
        
        
        laListat.inserta(new Pokemon("Agua", "Squirtle", 1, imgf.getSquirtle()));
        laListat.inserta(new Pokemon("Fuego", "Charmander", 2,imgf.getCharmander()));
        laListat.inserta(new Pokemon("Normal", "Snorlax", 3, imgf.getSnorlax()));
        laListat.inserta(new Pokemon("Agua", "Magikarp", 4, imgf.getMagikarp()));
        laListat.inserta(new Pokemon("Fuego", "Slugma", 5, imgf.getSlugma()));
        laListat.inserta(new Pokemon("Normal", "Meowth", 6, imgf.getMeowth()));
        laListat.inserta(new Pokemon("Agua", "Lapras", 7, imgf.getLapras()));
        laListat.inserta(new Pokemon("Fuego", "Arcanine", 8, imgf.getArcanine()));
        laListat.inserta(new Pokemon("Normal", "Eevee", 9, imgf.getEevee()));

        System.out.println(laListap);
        System.out.println(laListat);
     }
    
    public void setUpTeam(){
        
        eq1.encola(pk1);
        eq1.encola(pk2);
        eq1.encola(pk3);
        eq1.encola(pk4);
        
        System.out.println(eq1);
        
        aux1.setDato(laListat.buscar((int)(Math.random()*9+1)));
        aux2.setDato(laListat.buscar((int)(Math.random()*9+1)));
        aux3.setDato(laListat.buscar((int)(Math.random()*9+1)));
        aux4.setDato(laListat.buscar((int)(Math.random()*9+1)));
        
        
        eq2.encola(aux1);
        eq2.encola(aux2);
        eq2.encola(aux3);
        eq2.encola(aux4);
        
        System.out.println(eq2);
        
        aux1.setDato(laListat.buscar((int)(Math.random()*9+1)));
        aux2.setDato(laListat.buscar((int)(Math.random()*9+1)));
        aux3.setDato(laListat.buscar((int)(Math.random()*9+1)));
        aux4.setDato(laListat.buscar((int)(Math.random()*9+1)));
        
        
        eq3.encola(aux1);
        eq3.encola(aux2);
        eq3.encola(aux3);
        eq3.encola(aux4);
        
        System.out.println(eq3);
        
        aux1.setDato(laListat.buscar((int)(Math.random()*9+1)));
        aux2.setDato(laListat.buscar((int)(Math.random()*9+1)));
        aux3.setDato(laListat.buscar((int)(Math.random()*9+1)));
        aux4.setDato(laListat.buscar((int)(Math.random()*9+1)));
        
        
        eq4.encola(aux1);
        eq4.encola(aux2);
        eq4.encola(aux3);
        eq4.encola(aux4);
        
        System.out.println(eq4);
        
        listaTrainer.inserta(new Entrenador(1, "Player", eq1));
        listaTrainer.inserta(new Entrenador(2, "Andrés", eq2));
        listaTrainer.inserta(new Entrenador(3, "Gojo", eq3));
        listaTrainer.inserta(new Entrenador(3, "Jeager", eq3));
        
        System.out.println(listaTrainer);
        
        System.out.println("Setup complete");
        
    }
    
    public Menu() {
         
        this.setContentPane(ejemplo);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBCharmander = new javax.swing.JButton();
        JBSquirtle = new javax.swing.JButton();
        JBSnorlax = new javax.swing.JButton();
        JBSlugma = new javax.swing.JButton();
        JBArcanine = new javax.swing.JButton();
        JBLapras = new javax.swing.JButton();
        Meowth = new javax.swing.JButton();
        JBMagikarp = new javax.swing.JButton();
        JBEevee = new javax.swing.JButton();
        JLTitle = new javax.swing.JLabel();
        JLWarning = new javax.swing.JLabel();
        JBStart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JBCharmander.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/charmander.png"))); // NOI18N
        JBCharmander.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCharmanderActionPerformed(evt);
            }
        });

        JBSquirtle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/squirtle.png"))); // NOI18N
        JBSquirtle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSquirtleActionPerformed(evt);
            }
        });

        JBSnorlax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/snorlax.png"))); // NOI18N
        JBSnorlax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSnorlaxActionPerformed(evt);
            }
        });

        JBSlugma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/slugma.png"))); // NOI18N
        JBSlugma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSlugmaActionPerformed(evt);
            }
        });

        JBArcanine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/arcanine.png"))); // NOI18N
        JBArcanine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBArcanineActionPerformed(evt);
            }
        });

        JBLapras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/lapras.png"))); // NOI18N
        JBLapras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLaprasActionPerformed(evt);
            }
        });

        Meowth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/meowth.png"))); // NOI18N
        Meowth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeowthActionPerformed(evt);
            }
        });

        JBMagikarp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/magikarp.png"))); // NOI18N
        JBMagikarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMagikarpActionPerformed(evt);
            }
        });

        JBEevee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/eevee.png"))); // NOI18N
        JBEevee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEeveeActionPerformed(evt);
            }
        });

        JLTitle.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLTitle.setText("ELIGE 4 POKEMONES:");

        JLWarning.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        JLWarning.setForeground(new java.awt.Color(255, 0, 0));
        JLWarning.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        JBStart.setText("Start");
        JBStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBStartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JBStart))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLTitle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(JBSlugma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JBCharmander, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JBArcanine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JBSquirtle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JBLapras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JBMagikarp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JBSnorlax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JBEevee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Meowth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLTitle)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBCharmander)
                        .addGap(12, 12, 12)
                        .addComponent(JBSlugma, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JBSquirtle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBSnorlax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JBLapras, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBEevee))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBMagikarp, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBArcanine, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Meowth))
                .addGap(28, 28, 28)
                .addComponent(JLWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(JBStart)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCharmanderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCharmanderActionPerformed
        // TODO add your handling code here:
        contador++;
        
        switch(contador){
            case 1:
                System.out.println(laListap.buscar(2));
                pk1.setDato(laListap.buscar(2));
                System.out.println(laListap.buscar(2));
                System.out.println(pk1);
                break;
            case 2:
                pk2.setDato(laListap.buscar(2));
                break;
            case 3:
                pk3.setDato(laListap.buscar(2));
                break;
            case 4:
                pk4.setDato(laListap.buscar(2));
                break;
            default:
                JLWarning.setText("No se pueden agregar más de 4 Pokémon!");
        }
                
        
    }//GEN-LAST:event_JBCharmanderActionPerformed

    private void JBLaprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLaprasActionPerformed
        // TODO add your handling code here:
        
        contador++;
        
        switch(contador){
            case 1:
                pk1.setDato(laListap.buscar(7));
                break;
            case 2:
                pk2.setDato(laListap.buscar(7));
                break;
            case 3:
                pk3.setDato(laListap.buscar(7));
                break;
            case 4:
                pk4.setDato(laListap.buscar(7));
                break;
            default:
                JLWarning.setText("No se pueden agregar más de 4 Pokémon!");
        }
        
    }//GEN-LAST:event_JBLaprasActionPerformed

    private void JBSquirtleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSquirtleActionPerformed
        // TODO add your handling code here:
        contador++;
        
        switch(contador){
            case 1:
                pk1.setDato(laListap.buscar(1));
                break;
            case 2:
                pk2.setDato(laListap.buscar(1));
                break;
            case 3:
                pk3.setDato(laListap.buscar(1));
                break;
            case 4:
                pk4.setDato(laListap.buscar(1));
                break;
            default:
                JLWarning.setText("No se pueden agregar más de 4 Pokémon!");
        }
    }//GEN-LAST:event_JBSquirtleActionPerformed

    private void JBSnorlaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSnorlaxActionPerformed
        // TODO add your handling code here:
        
        contador++;
        
        switch(contador){
            case 1:
                pk1.setDato(laListap.buscar(3));
                break;
            case 2:
                pk2.setDato(laListap.buscar(3));
                break;
            case 3:
                pk3.setDato(laListap.buscar(3));
                break;
            case 4:
                pk4.setDato(laListap.buscar(3));
                break;
            default:
                JLWarning.setText("No se pueden agregar más de 4 Pokémon!");
        }
        
    }//GEN-LAST:event_JBSnorlaxActionPerformed

    private void JBSlugmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSlugmaActionPerformed
        // TODO add your handling code here:
        contador++;
        
        switch(contador){
            case 1:
                pk1.setDato(laListap.buscar(5));
                break;
            case 2:
                pk2.setDato(laListap.buscar(5));
                break;
            case 3:
                pk3.setDato(laListap.buscar(5));
                break;
            case 4:
                pk4.setDato(laListap.buscar(5));
                break;
            default:
                JLWarning.setText("No se pueden agregar más de 4 Pokémon!");
        }
        
    }//GEN-LAST:event_JBSlugmaActionPerformed

    private void JBEeveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEeveeActionPerformed
        // TODO add your handling code here:
        
        contador++;
        
        switch(contador){
            case 1:
                pk1.setDato(laListap.buscar(9));
                break;
            case 2:
                pk2.setDato(laListap.buscar(9));
                break;
            case 3:
                pk3.setDato(laListap.buscar(9));
                break;
            case 4:
                pk4.setDato(laListap.buscar(9));
                break;
            default:
                JLWarning.setText("No se pueden agregar más de 4 Pokémon!");
        }
        
    }//GEN-LAST:event_JBEeveeActionPerformed

    private void JBArcanineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBArcanineActionPerformed
        // TODO add your handling code here:
        
        contador++;
        
        switch(contador){
            case 1:
                pk1.setDato(laListap.buscar(8));
                break;
            case 2:
                pk2.setDato(laListap.buscar(8));
                break;
            case 3:
                pk3.setDato(laListap.buscar(8));
                break;
            case 4:
                pk4.setDato(laListap.buscar(8));
                break;
            default:
                JLWarning.setText("No se pueden agregar más de 4 Pokémon!");
        }

        
        
    }//GEN-LAST:event_JBArcanineActionPerformed

    private void JBMagikarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMagikarpActionPerformed
        // TODO add your handling code here:
        contador++;
        
        switch(contador){
            case 1:
                pk1.setDato(laListap.buscar(4));
                break;
            case 2:
                pk2.setDato(laListap.buscar(4));
                break;
            case 3:
                pk3.setDato(laListap.buscar(4));
                break;
            case 4:
                pk4.setDato(laListap.buscar(4));
                break;
            default:
                JLWarning.setText("No se pueden agregar más de 4 Pokémon!");
        }

        
    }//GEN-LAST:event_JBMagikarpActionPerformed

    private void MeowthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeowthActionPerformed
        // TODO add your handling code here:
        
        contador++;
        
        switch(contador){
            case 1:
                pk1.setDato(laListap.buscar(6));
                break;
            case 2:
                pk2.setDato(laListap.buscar(6));
                break;
            case 3:
                pk3.setDato(laListap.buscar(6));
                break;
            case 4:
                pk4.setDato(laListap.buscar(6));
                break;
            default:
                JLWarning.setText("No se pueden agregar más de 4 Pokémon!");
        }
        
    }//GEN-LAST:event_MeowthActionPerformed

    private void JBStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBStartActionPerformed
        // TODO add your handling code here:
        // this.setVisible(false);
        MainBattle battle = new MainBattle();
        battle.JPPokemon.setVisible(false);
        setUpTeam();
        battle.battleSetup(eq1, eq2);
        battle.show();
        
    }//GEN-LAST:event_JBStartActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBArcanine;
    private javax.swing.JButton JBCharmander;
    private javax.swing.JButton JBEevee;
    private javax.swing.JButton JBLapras;
    private javax.swing.JButton JBMagikarp;
    private javax.swing.JButton JBSlugma;
    private javax.swing.JButton JBSnorlax;
    private javax.swing.JButton JBSquirtle;
    private javax.swing.JButton JBStart;
    private javax.swing.JLabel JLTitle;
    private javax.swing.JLabel JLWarning;
    private javax.swing.JButton Meowth;
    // End of variables declaration//GEN-END:variables
public class ImagenFondo extends JPanel{
     
    public void paint(Graphics g){
        ImageIcon imagen = new ImageIcon(getClass().getResource("FondoMenu.jpeg"));
        g.drawImage(imagen.getImage(),0,0,getWidth(),getHeight(),this);
        setOpaque(false);
        super.paint(g);
    }
}

}
