/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Battle;


/**
 *
 * @author cesar
 */
public class MainBattle extends javax.swing.JFrame {
    
    
    
    /**
     * Creates new form MainBattle
     */
    public MainBattle() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        JLPkmnPlayer = new javax.swing.JLabel();
        JLVidaPlayerTitle = new javax.swing.JLabel();
        JLVidaPlayer = new javax.swing.JLabel();
        JLVidaTrainerTitle = new javax.swing.JLabel();
        JLVidaTrainer = new javax.swing.JLabel();
        JLPokmnTrainer = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        JBAtaque = new javax.swing.JButton();
        JBAtaqueEsp = new javax.swing.JButton();
        JBPokmn = new javax.swing.JButton();
        JPPokemon = new javax.swing.JPanel();
        JBPokemon1 = new javax.swing.JButton();
        JBPokemon3 = new javax.swing.JButton();
        JBPokemon2 = new javax.swing.JButton();
        JBPokemon4 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        JLPkmnPlayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PokemonSpritesB/Charmander B.png"))); // NOI18N
        JLPkmnPlayer.setToolTipText("");

        JLVidaPlayerTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLVidaPlayerTitle.setText("Vida:");

        JLVidaPlayer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLVidaPlayer.setText("0");

        JLVidaTrainerTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLVidaTrainerTitle.setText("Vida:");

        JLVidaTrainer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLVidaTrainer.setText("0");

        JLPokmnTrainer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PokemonSpritesF/Meowth.png"))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JBAtaque.setText("Ataque");
        JBAtaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAtaqueActionPerformed(evt);
            }
        });

        JBAtaqueEsp.setText("Ataque Especial");
        JBAtaqueEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAtaqueEspActionPerformed(evt);
            }
        });

        JBPokmn.setText("Pokémon");
        JBPokmn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPokmnActionPerformed(evt);
            }
        });

        JPPokemon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JBPokemon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPokemon1ActionPerformed(evt);
            }
        });

        JBPokemon3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPokemon3ActionPerformed(evt);
            }
        });

        JBPokemon2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPokemon2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPPokemonLayout = new javax.swing.GroupLayout(JPPokemon);
        JPPokemon.setLayout(JPPokemonLayout);
        JPPokemonLayout.setHorizontalGroup(
            JPPokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPPokemonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBPokemon1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBPokemon2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBPokemon3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBPokemon4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JPPokemonLayout.setVerticalGroup(
            JPPokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPPokemonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPPokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JBPokemon1, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addGroup(JPPokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(JBPokemon2, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                        .addComponent(JBPokemon4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBPokemon3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBPokmn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(JBAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBAtaqueEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JPPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JBAtaqueEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBPokmn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JLPkmnPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JLVidaPlayerTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JLVidaPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLPokmnTrainer)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JLVidaTrainerTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(JLVidaTrainer, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLVidaTrainer)
                    .addComponent(JLVidaTrainerTitle, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLPokmnTrainer)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JLVidaPlayerTitle)
                        .addComponent(JLVidaPlayer)))
                .addGap(23, 23, 23)
                .addComponent(JLPkmnPlayer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBAtaqueEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAtaqueEspActionPerformed
        
        
        
    }//GEN-LAST:event_JBAtaqueEspActionPerformed

    private void JBAtaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAtaqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBAtaqueActionPerformed

    private void JBPokmnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPokmnActionPerformed
        
        // Lista lista = BattleLogic.laLista;
        JPPokemon.setVisible(true);
    }//GEN-LAST:event_JBPokmnActionPerformed

    private void JBPokemon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPokemon1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBPokemon1ActionPerformed

    private void JBPokemon2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPokemon2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBPokemon2ActionPerformed

    private void JBPokemon3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPokemon3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBPokemon3ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAtaque;
    private javax.swing.JButton JBAtaqueEsp;
    private javax.swing.JButton JBPokemon1;
    private javax.swing.JButton JBPokemon2;
    private javax.swing.JButton JBPokemon3;
    private javax.swing.JButton JBPokemon4;
    private javax.swing.JButton JBPokmn;
    private javax.swing.JLabel JLPkmnPlayer;
    private javax.swing.JLabel JLPokmnTrainer;
    private javax.swing.JLabel JLVidaPlayer;
    private javax.swing.JLabel JLVidaPlayerTitle;
    private javax.swing.JLabel JLVidaTrainer;
    private javax.swing.JLabel JLVidaTrainerTitle;
    public javax.swing.JPanel JPPokemon;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
