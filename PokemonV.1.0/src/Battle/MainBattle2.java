/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Battle;

import Equipo.Cola;
import Equipo.NodoC;
import TorneoMain.Torneo;

/**
 *
 * @author cesar
 */
public class MainBattle2 extends javax.swing.JFrame {

    Torneo tor = new Torneo();

    int muertos = 0;
    int count = 1;
    int entrenadoresDerrotados = 0;

    boolean ataca = true;
    boolean atacap = true;

    Cola player;
    Cola trainer;
    Cola trainer2;
    Cola trainer3;

    NodoC pkmnplayer;
    NodoC pkmnplayer1;
    NodoC pkmnplayer2;
    NodoC pkmnplayer3;
    NodoC pkmnplayer4;

    NodoC pkmnrival;

    public void battleSetup(Cola Player, Cola Trainer, Cola Trainer2, Cola Trainer3) {

        this.player = Player;
        this.trainer = Trainer;
        this.trainer2 = Trainer2;
        this.trainer3 = Trainer3;

        pkmnplayer1 = player.enfrenta();
        pkmnplayer2 = player.enfrenta();
        pkmnplayer3 = player.enfrenta();
        pkmnplayer4 = player.enfrenta();

        player.encola(pkmnplayer1);
        player.encola(pkmnplayer2);
        player.encola(pkmnplayer3);
        player.encola(pkmnplayer4);

        pkmnplayer = pkmnplayer1;

        pkmnrival = trainer.enfrenta();

        // Solucion temporal a imagenes
        JLPkmnPlayer.setText(pkmnplayer.getDato().getNombre() + " " + pkmnplayer.getDato().getTipo());
        JLPokmnTrainer.setText(pkmnrival.getDato().getNombre() + " " + pkmnrival.getDato().getTipo());

        System.out.println(pkmnplayer.getDato().getImg());
        JLPkmnPlayer.setIcon(pkmnplayer.getDato().getImg());
        JLPokmnTrainer.setIcon(pkmnrival.getDato().getImg());

        JLVidaPlayer.setText(String.valueOf(pkmnplayer.getDato().getTipo().getHp()));
        JLVidaTrainer.setText(String.valueOf(pkmnrival.getDato().getTipo().getHp()));

        tor.show();

        JBPokemon1.setText(pkmnplayer1.getDato().getNombre());
        JBPokemon2.setText(pkmnplayer2.getDato().getNombre());
        JBPokemon3.setText(pkmnplayer3.getDato().getNombre());
        JBPokemon4.setText(pkmnplayer4.getDato().getNombre());
    }

    /**
     * Creates new form MainBattle
     */
    public MainBattle2() {
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
        JLAtaqueEsp = new javax.swing.JLabel();
        JLAtaqueEspR = new javax.swing.JLabel();
        JLInfo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        JBAtaque = new javax.swing.JButton();
        JBAtaqueEsp = new javax.swing.JButton();
        JBPokmn = new javax.swing.JButton();
        JPPokemon = new javax.swing.JPanel();
        JBPokemon1 = new javax.swing.JButton();
        JBPokemon3 = new javax.swing.JButton();
        JBPokemon2 = new javax.swing.JButton();
        JBPokemon4 = new javax.swing.JButton();
        JLPkmnDeb = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        JLPkmnPlayer.setToolTipText("");

        JLVidaPlayerTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLVidaPlayerTitle.setText("Vida:");

        JLVidaPlayer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLVidaPlayer.setText("0");

        JLVidaTrainerTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLVidaTrainerTitle.setText("Vida:");

        JLVidaTrainer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLVidaTrainer.setText("0");

        JLInfo.setText("Combate 1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JLVidaPlayerTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JLVidaPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JLAtaqueEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(JLVidaTrainerTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(JLVidaTrainer, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addComponent(JLPokmnTrainer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JLPkmnPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLAtaqueEspR, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(JLAtaqueEspR, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLVidaTrainer)
                    .addComponent(JLVidaTrainerTitle, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(JLAtaqueEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLVidaPlayerTitle)
                            .addComponent(JLVidaPlayer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLPkmnPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLPokmnTrainer, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 81, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JLInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

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

        JBPokemon4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPokemon4ActionPerformed(evt);
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
                    .addComponent(JBPokemon2, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(JBPokemon4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBPokemon3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(JPPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(JLPkmnDeb, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(JPPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JLPkmnDeb, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JBAtaqueEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBPokmn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBAtaqueEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAtaqueEspActionPerformed
        // Turno 1

        if (pkmnrival == null) {
            entrenadoresDerrotados++;
            switch (entrenadoresDerrotados) {
                case 1:
                    tor.JLTorneo.setIcon(new javax.swing.ImageIcon("src/TorneoImg/Torneo2.png"));

                    pkmnplayer1 = player.enfrenta();
                    pkmnplayer2 = player.enfrenta();
                    pkmnplayer3 = player.enfrenta();
                    pkmnplayer4 = player.enfrenta();

                    player.encola(pkmnplayer1);
                    player.encola(pkmnplayer2);
                    player.encola(pkmnplayer3);
                    player.encola(pkmnplayer4);

                    trainer.encola(trainer2.enfrenta());
                    trainer.encola(trainer2.enfrenta());
                    trainer.encola(trainer2.enfrenta());
                    trainer.encola(trainer2.enfrenta());

                    pkmnrival = trainer.enfrenta();
                    pkmnplayer = pkmnplayer1;

                    // Se actualizan los graficos
                    JLVidaTrainer.setText(String.valueOf(pkmnrival.getDato().getTipo().getHp()));
                    JLPokmnTrainer.setIcon(pkmnrival.getDato().getImg());

                    JLVidaPlayer.setText(String.valueOf(pkmnplayer.getDato().getTipo().getHp()));
                    JLPkmnPlayer.setIcon(pkmnplayer.getDato().getImg());

                    JLInfo.setText("Combate 2");
                    break;
                case 2:
                    tor.JLTorneo.setIcon(new javax.swing.ImageIcon("src/TorneoImg/Torneo3.png"));

                    pkmnplayer1 = player.enfrenta();
                    pkmnplayer2 = player.enfrenta();
                    pkmnplayer3 = player.enfrenta();
                    pkmnplayer4 = player.enfrenta();

                    player.encola(pkmnplayer1);
                    player.encola(pkmnplayer2);
                    player.encola(pkmnplayer3);
                    player.encola(pkmnplayer4);

                    trainer.encola(trainer3.enfrenta());
                    trainer.encola(trainer3.enfrenta());
                    trainer.encola(trainer3.enfrenta());
                    trainer.encola(trainer3.enfrenta());

                    pkmnrival = trainer.enfrenta();
                    pkmnplayer = pkmnplayer1;

                    // Se actualizan los graficos
                    JLVidaTrainer.setText(String.valueOf(pkmnrival.getDato().getTipo().getHp()));
                    JLPokmnTrainer.setIcon(pkmnrival.getDato().getImg());

                    JLVidaPlayer.setText(String.valueOf(pkmnplayer.getDato().getTipo().getHp()));
                    JLPkmnPlayer.setIcon(pkmnplayer.getDato().getImg());
                    JLInfo.setText("Combate 3");
                    break;
                case 3:
                    tor.JLTorneo.setIcon(new javax.swing.ImageIcon("src/TorneoImg/Winner.png"));
                    this.setVisible(false);
                    break;
            }
        } else {
            if (pkmnrival.getDato().getTipo().getHp() <= 0) {
                pkmnrival = trainer.enfrenta();
                if (pkmnrival == null) {
                    entrenadoresDerrotados++;
                    switch (entrenadoresDerrotados) {
                        case 1:
                            tor.JLTorneo.setIcon(new javax.swing.ImageIcon("src/TorneoImg/Torneo2.png"));

                            pkmnplayer1 = player.enfrenta();
                            pkmnplayer2 = player.enfrenta();
                            pkmnplayer3 = player.enfrenta();
                            pkmnplayer4 = player.enfrenta();

                            player.encola(pkmnplayer1);
                            player.encola(pkmnplayer2);
                            player.encola(pkmnplayer3);
                            player.encola(pkmnplayer4);

                            trainer.encola(trainer2.enfrenta());
                            trainer.encola(trainer2.enfrenta());
                            trainer.encola(trainer2.enfrenta());
                            trainer.encola(trainer2.enfrenta());

                            pkmnrival = trainer.enfrenta();
                            pkmnplayer = pkmnplayer1;

                            // Se actualizan los graficos
                            JLVidaTrainer.setText(String.valueOf(pkmnrival.getDato().getTipo().getHp()));
                            JLPokmnTrainer.setIcon(pkmnrival.getDato().getImg());

                            JLVidaPlayer.setText(String.valueOf(pkmnplayer.getDato().getTipo().getHp()));
                            JLPkmnPlayer.setIcon(pkmnplayer.getDato().getImg());

                            JLInfo.setText("Combate 2");
                            break;
                        case 2:
                            tor.JLTorneo.setIcon(new javax.swing.ImageIcon("src/TorneoImg/Torneo3.png"));

                            pkmnplayer1 = player.enfrenta();
                            pkmnplayer2 = player.enfrenta();
                            pkmnplayer3 = player.enfrenta();
                            pkmnplayer4 = player.enfrenta();

                            player.encola(pkmnplayer1);
                            player.encola(pkmnplayer2);
                            player.encola(pkmnplayer3);
                            player.encola(pkmnplayer4);

                            trainer.encola(trainer3.enfrenta());
                            trainer.encola(trainer3.enfrenta());
                            trainer.encola(trainer3.enfrenta());
                            trainer.encola(trainer3.enfrenta());

                            pkmnrival = trainer.enfrenta();
                            pkmnplayer = pkmnplayer1;

                            // Se actualizan los graficos
                            JLVidaTrainer.setText(String.valueOf(pkmnrival.getDato().getTipo().getHp()));
                            JLPokmnTrainer.setIcon(pkmnrival.getDato().getImg());

                            JLVidaPlayer.setText(String.valueOf(pkmnplayer.getDato().getTipo().getHp()));
                            JLPkmnPlayer.setIcon(pkmnplayer.getDato().getImg());
                            JLInfo.setText("Combate 3");
                            break;
                        case 3:
                            tor.JLTorneo.setIcon(new javax.swing.ImageIcon("src/TorneoImg/Winner.png"));
                            this.setVisible(false);
                            break;
                    }
                }
            }

            if (atacap == true) {

                int defiende = (int) (Math.random() * 3) + 1;

                double ataqueEsp = pkmnplayer.getDato().getTipo().getAtaq_esp();
                double vidaR = pkmnrival.getDato().getTipo().getHp();
                double defensaEspR = pkmnrival.getDato().getTipo().getDef_esp();

                String tipoR = pkmnrival.getDato().getTipo().getTipoString();
                String tipop = pkmnplayer.getDato().getTipo().getTipoString();

                defiende = (int) (Math.random() * 3) + 1;

                if (tipoR.equals("Normal") && tipop.equals("Agua")) {
                    ataqueEsp += 5;
                } else if (tipop.equals("Normal") && tipoR.equals("Agua")) {
                    defensaEspR += 5;

                } else if (tipoR.equals("Fuego") && tipop.equals("Normal")) {
                    ataqueEsp += 5;

                } else if (tipop.equals("Normal") && tipoR.equals("Fuego")) {
                    defensaEspR += 10;

                } else if (tipoR.equals("Agua") && tipop.equals("Fuego")) {
                    ataqueEsp += 10;

                } else if (tipop.equals("Fuego") && tipoR.equals("Agua")) {
                    defensaEspR += 10;
                }

                if (defiende == 1) {
                    pkmnrival.getDato().getTipo().setHp(vidaR - Math.abs(defensaEspR - ataqueEsp));
                    ataca = false;
                    JLAtaqueEsp.setText("El ataque necesita recargarse");
                    atacap = false;

                    // Comprueba si el Otro entrenador pierde
                    if (pkmnrival.getDato().getTipo().getHp() <= 0) {
                        pkmnrival = trainer.enfrenta();
                        if (pkmnrival.getDato().getTipo().getHp() <= 0) {
                            pkmnrival = trainer.enfrenta();
                            if (pkmnrival == null) {
                                entrenadoresDerrotados++;
                                switch (entrenadoresDerrotados) {
                                    case 1:
                                        tor.JLTorneo.setIcon(new javax.swing.ImageIcon("src/TorneoImg/Torneo2.png"));

                                        pkmnplayer1 = player.enfrenta();
                                        pkmnplayer2 = player.enfrenta();
                                        pkmnplayer3 = player.enfrenta();
                                        pkmnplayer4 = player.enfrenta();

                                        player.encola(pkmnplayer1);
                                        player.encola(pkmnplayer2);
                                        player.encola(pkmnplayer3);
                                        player.encola(pkmnplayer4);

                                        trainer.encola(trainer2.enfrenta());
                                        trainer.encola(trainer2.enfrenta());
                                        trainer.encola(trainer2.enfrenta());
                                        trainer.encola(trainer2.enfrenta());

                                        pkmnrival = trainer.enfrenta();
                                        pkmnplayer = pkmnplayer1;

                                        // Se actualizan los graficos
                                        JLVidaTrainer.setText(String.valueOf(pkmnrival.getDato().getTipo().getHp()));
                                        JLPokmnTrainer.setIcon(pkmnrival.getDato().getImg());

                                        JLVidaPlayer.setText(String.valueOf(pkmnplayer.getDato().getTipo().getHp()));
                                        JLPkmnPlayer.setIcon(pkmnplayer.getDato().getImg());

                                        JLInfo.setText("Combate 2");
                                        break;
                                    case 2:
                                        tor.JLTorneo.setIcon(new javax.swing.ImageIcon("src/TorneoImg/Torneo3.png"));

                                        pkmnplayer1 = player.enfrenta();
                                        pkmnplayer2 = player.enfrenta();
                                        pkmnplayer3 = player.enfrenta();
                                        pkmnplayer4 = player.enfrenta();

                                        player.encola(pkmnplayer1);
                                        player.encola(pkmnplayer2);
                                        player.encola(pkmnplayer3);
                                        player.encola(pkmnplayer4);

                                        trainer.encola(trainer3.enfrenta());
                                        trainer.encola(trainer3.enfrenta());
                                        trainer.encola(trainer3.enfrenta());
                                        trainer.encola(trainer3.enfrenta());

                                        pkmnrival = trainer.enfrenta();
                                        pkmnplayer = pkmnplayer1;

                                        // Se actualizan los graficos
                                        JLVidaTrainer.setText(String.valueOf(pkmnrival.getDato().getTipo().getHp()));
                                        JLPokmnTrainer.setIcon(pkmnrival.getDato().getImg());

                                        JLVidaPlayer.setText(String.valueOf(pkmnplayer.getDato().getTipo().getHp()));
                                        JLPkmnPlayer.setIcon(pkmnplayer.getDato().getImg());
                                        JLInfo.setText("Combate 3");
                                        break;
                                    case 3:
                                        tor.JLTorneo.setIcon(new javax.swing.ImageIcon("src/TorneoImg/Winner.png"));
                                        this.setVisible(false);
                                        break;
                                }
                            }
                        }
                    }

                } else {
                    pkmnrival.getDato().getTipo().setHp(vidaR - ataqueEsp);
                    ataca = false;
                    JLAtaqueEsp.setText("El ataque necesita recargarse");
                    atacap = false;

                    // Comprueba si el Otro entrenador pierde
                    if (pkmnrival.getDato().getTipo().getHp() <= 0) {
                        pkmnrival = trainer.enfrenta();
                        if (pkmnrival.getDato().getTipo().getHp() <= 0) {
                            pkmnrival = trainer.enfrenta();
                            if (pkmnrival == null) {
                                entrenadoresDerrotados++;
                                switch (entrenadoresDerrotados) {
                                    case 1:
                                        tor.JLTorneo.setIcon(new javax.swing.ImageIcon("src/TorneoImg/Torneo2.png"));

                                        pkmnplayer1 = player.enfrenta();
                                        pkmnplayer2 = player.enfrenta();
                                        pkmnplayer3 = player.enfrenta();
                                        pkmnplayer4 = player.enfrenta();

                                        player.encola(pkmnplayer1);
                                        player.encola(pkmnplayer2);
                                        player.encola(pkmnplayer3);
                                        player.encola(pkmnplayer4);

                                        trainer.encola(trainer2.enfrenta());
                                        trainer.encola(trainer2.enfrenta());
                                        trainer.encola(trainer2.enfrenta());
                                        trainer.encola(trainer2.enfrenta());

                                        pkmnrival = trainer.enfrenta();
                                        pkmnplayer = pkmnplayer1;

                                        // Se actualizan los graficos
                                        JLVidaTrainer.setText(String.valueOf(pkmnrival.getDato().getTipo().getHp()));
                                        JLPokmnTrainer.setIcon(pkmnrival.getDato().getImg());

                                        JLVidaPlayer.setText(String.valueOf(pkmnplayer.getDato().getTipo().getHp()));
                                        JLPkmnPlayer.setIcon(pkmnplayer.getDato().getImg());

                                        JLInfo.setText("Combate 2");
                                        break;
                                    case 2:
                                        tor.JLTorneo.setIcon(new javax.swing.ImageIcon("src/TorneoImg/Torneo3.png"));

                                        pkmnplayer1 = player.enfrenta();
                                        pkmnplayer2 = player.enfrenta();
                                        pkmnplayer3 = player.enfrenta();
                                        pkmnplayer4 = player.enfrenta();

                                        player.encola(pkmnplayer1);
                                        player.encola(pkmnplayer2);
                                        player.encola(pkmnplayer3);
                                        player.encola(pkmnplayer4);

                                        trainer.encola(trainer3.enfrenta());
                                        trainer.encola(trainer3.enfrenta());
                                        trainer.encola(trainer3.enfrenta());
                                        trainer.encola(trainer3.enfrenta());

                                        pkmnrival = trainer.enfrenta();
                                        pkmnplayer = pkmnplayer1;

                                        // Se actualizan los graficos
                                        JLVidaTrainer.setText(String.valueOf(pkmnrival.getDato().getTipo().getHp()));
                                        JLPokmnTrainer.setIcon(pkmnrival.getDato().getImg());

                                        JLVidaPlayer.setText(String.valueOf(pkmnplayer.getDato().getTipo().getHp()));
                                        JLPkmnPlayer.setIcon(pkmnplayer.getDato().getImg());
                                        JLInfo.setText("Combate 3");
                                        break;
                                    case 3:
                                        tor.JLTorneo.setIcon(new javax.swing.ImageIcon("src/TorneoImg/Winner.png"));
                                        this.setVisible(false);
                                        break;
                                }
                            }
                        }
                    }
                }
            } else {
                atacap = true;
            }
            JLVidaTrainer.setText(String.valueOf(pkmnrival.getDato().getTipo().getHp()));
            //JLPokmnTrainer.setText(pkmnrival.getDato().getNombre()+" "+pkmnrival.getDato().getTipo());
            JLPokmnTrainer.setIcon(pkmnrival.getDato().getImg());

            // Turno 2
            if (ataca == true) {

                int rivalA = (int) (Math.random() * 2) + 1;

                if (rivalA == 1) {
                    double ataqueR = pkmnrival.getDato().getTipo().getAtaque();
                    double vida = pkmnplayer.getDato().getTipo().getHp();
                    double defensa = pkmnplayer.getDato().getTipo().getDefensa();

                    int defiende = (int) (Math.random() * 3) + 1;

                    if (defiende == 1) {
                        pkmnplayer.getDato().getTipo().setHp(vida - Math.abs(defensa - ataqueR));
                        if (pkmnplayer.getDato().getTipo().getHp() <= 0) {
                            pkmnplayer = player.enfrenta();
                            if (pkmnplayer == null) {
                                tor.JLTorneo.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/TorneoImg/Game_Over.png")));
                                this.setVisible(false);
                            }
                        }
                    } else {
                        pkmnplayer.getDato().getTipo().setHp(vida - ataqueR);
                        if (pkmnplayer.getDato().getTipo().getHp() <= 0) {
                            pkmnplayer = player.enfrenta();
                            if (pkmnplayer == null) {
                                tor.JLTorneo.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/TorneoImg/Game_Over.png")));
                                this.setVisible(false);
                            }
                        }
                    }
                } else {
                    double ataqueEspR = pkmnrival.getDato().getTipo().getAtaq_esp();
                    double vida = pkmnplayer.getDato().getTipo().getHp();
                    double defensaEsp = pkmnplayer.getDato().getTipo().getDef_esp();

                    String tipoR = pkmnrival.getDato().getTipo().getTipoString();
                    String tipop = pkmnplayer.getDato().getTipo().getTipoString();

                    int defiende = (int) (Math.random() * 3) + 1;

                    if (tipoR.equals("Normal") && tipop.equals("Agua")) {
                        ataqueEspR += 5;
                    } else if (tipop.equals("Normal") && tipoR.equals("Agua")) {
                        defensaEsp += 5;
                    } else if (tipoR.equals("Fuego") && tipop.equals("Normal")) {
                        ataqueEspR += 5;
                    } else if (tipop.equals("Normal") && tipoR.equals("Fuego")) {
                        defensaEsp += 10;
                    } else if (tipoR.equals("Agua") && tipop.equals("Fuego")) {
                        ataqueEspR += 10;
                    } else if (tipop.equals("Fuego") && tipoR.equals("Agua")) {
                        defensaEsp += 10;
                    }

                    if (defiende == 1) {
                        pkmnplayer.getDato().getTipo().setHp(vida - Math.abs(defensaEsp - ataqueEspR));
                        ataca = false;

                        JLAtaqueEspR.setText("El ataque necesita recargarse");
                        // Comprueba si el jugador pierde

                        if (pkmnplayer.getDato().getTipo().getHp() <= 0) {
                            muertos++;
                            switch (muertos) {
                                case 1:
                                    pkmnplayer = pkmnplayer2;
                                    break;
                                case 2:
                                    pkmnplayer = pkmnplayer3;
                                    break;
                                case 3:
                                    pkmnplayer = pkmnplayer4;
                                    break;
                                default:
                                    tor.JLTorneo.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/TorneoImg/Game_Over.png")));
                                    this.setVisible(false);
                                    break;
                            }
                        }

                    } else {
                        pkmnplayer.getDato().getTipo().setHp(vida - ataqueEspR);
                        ataca = false;
                        JLAtaqueEspR.setText("El ataque necesita recargarse");

                        // Comprueba si el jugador pierde
                        if (pkmnplayer.getDato().getTipo().getHp() <= 0) {
                            muertos++;
                            switch (muertos) {
                                case 1:
                                    pkmnplayer = pkmnplayer2;
                                    break;
                                case 2:
                                    pkmnplayer = pkmnplayer3;
                                    break;
                                case 3:
                                    pkmnplayer = pkmnplayer4;
                                    break;
                                default:
                                    tor.JLTorneo.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/TorneoImg/Game_Over.png")));
                                    this.setVisible(false);
                                    break;
                            }
                        }
                    }

                }

                JLVidaPlayer.setText(String.valueOf(pkmnplayer.getDato().getTipo().getHp()));
                JLPkmnPlayer.setText(pkmnplayer.getDato().getNombre() + " " + pkmnplayer.getDato().getTipo());
                JLPkmnPlayer.setIcon(pkmnplayer.getDato().getImg());

            } else {
                ataca = true;
                JLAtaqueEspR.setText("");
            }
        }
    }//GEN-LAST:event_JBAtaqueEspActionPerformed

    private void JBAtaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAtaqueActionPerformed

        if (pkmnrival == null) {
            entrenadoresDerrotados++;
            switch (entrenadoresDerrotados) {
                case 1:
                    tor.JLTorneo.setIcon(new javax.swing.ImageIcon("src/TorneoImg/Torneo2.png"));

                    pkmnplayer1 = player.enfrenta();
                    pkmnplayer2 = player.enfrenta();
                    pkmnplayer3 = player.enfrenta();
                    pkmnplayer4 = player.enfrenta();

                    player.encola(pkmnplayer1);
                    player.encola(pkmnplayer2);
                    player.encola(pkmnplayer3);
                    player.encola(pkmnplayer4);

                    trainer.encola(trainer2.enfrenta());
                    trainer.encola(trainer2.enfrenta());
                    trainer.encola(trainer2.enfrenta());
                    trainer.encola(trainer2.enfrenta());

                    pkmnrival = trainer.enfrenta();
                    pkmnplayer = pkmnplayer1;

                    // Se actualizan los graficos
                    JLVidaTrainer.setText(String.valueOf(pkmnrival.getDato().getTipo().getHp()));
                    JLPokmnTrainer.setIcon(pkmnrival.getDato().getImg());

                    JLVidaPlayer.setText(String.valueOf(pkmnplayer.getDato().getTipo().getHp()));
                    JLPkmnPlayer.setIcon(pkmnplayer.getDato().getImg());

                    JLInfo.setText("Combate 2");
                    break;
                case 2:
                    tor.JLTorneo.setIcon(new javax.swing.ImageIcon("src/TorneoImg/Torneo3.png"));

                    pkmnplayer1 = player.enfrenta();
                    pkmnplayer2 = player.enfrenta();
                    pkmnplayer3 = player.enfrenta();
                    pkmnplayer4 = player.enfrenta();

                    player.encola(pkmnplayer1);
                    player.encola(pkmnplayer2);
                    player.encola(pkmnplayer3);
                    player.encola(pkmnplayer4);

                    trainer.encola(trainer3.enfrenta());
                    trainer.encola(trainer3.enfrenta());
                    trainer.encola(trainer3.enfrenta());
                    trainer.encola(trainer3.enfrenta());

                    pkmnrival = trainer.enfrenta();
                    pkmnplayer = pkmnplayer1;

                    // Se actualizan los graficos
                    JLVidaTrainer.setText(String.valueOf(pkmnrival.getDato().getTipo().getHp()));
                    JLPokmnTrainer.setIcon(pkmnrival.getDato().getImg());

                    JLVidaPlayer.setText(String.valueOf(pkmnplayer.getDato().getTipo().getHp()));
                    JLPkmnPlayer.setIcon(pkmnplayer.getDato().getImg());
                    JLInfo.setText("Combate 3");
                    break;
                case 3:
                    tor.JLTorneo.setIcon(new javax.swing.ImageIcon("src/TorneoImg/Winner.png"));
                    this.setVisible(false);
                    break;
            }
        } else {
            if (pkmnrival.getDato().getTipo().getHp() <= 0) {
                pkmnrival = trainer.enfrenta();
                if (pkmnrival == null) {
                    entrenadoresDerrotados++;
                    switch (entrenadoresDerrotados) {
                        case 1:
                            tor.JLTorneo.setIcon(new javax.swing.ImageIcon("src/TorneoImg/Torneo2.png"));

                            pkmnplayer1 = player.enfrenta();
                            pkmnplayer2 = player.enfrenta();
                            pkmnplayer3 = player.enfrenta();
                            pkmnplayer4 = player.enfrenta();

                            player.encola(pkmnplayer1);
                            player.encola(pkmnplayer2);
                            player.encola(pkmnplayer3);
                            player.encola(pkmnplayer4);

                            trainer.encola(trainer2.enfrenta());
                            trainer.encola(trainer2.enfrenta());
                            trainer.encola(trainer2.enfrenta());
                            trainer.encola(trainer2.enfrenta());

                            pkmnrival = trainer.enfrenta();
                            pkmnplayer = pkmnplayer1;

                            // Se actualizan los graficos
                            JLVidaTrainer.setText(String.valueOf(pkmnrival.getDato().getTipo().getHp()));
                            JLPokmnTrainer.setIcon(pkmnrival.getDato().getImg());

                            JLVidaPlayer.setText(String.valueOf(pkmnplayer.getDato().getTipo().getHp()));
                            JLPkmnPlayer.setIcon(pkmnplayer.getDato().getImg());

                            JLInfo.setText("Combate 2");
                            break;
                        case 2:
                            tor.JLTorneo.setIcon(new javax.swing.ImageIcon("src/TorneoImg/Torneo3.png"));

                            pkmnplayer1 = player.enfrenta();
                            pkmnplayer2 = player.enfrenta();
                            pkmnplayer3 = player.enfrenta();
                            pkmnplayer4 = player.enfrenta();

                            player.encola(pkmnplayer1);
                            player.encola(pkmnplayer2);
                            player.encola(pkmnplayer3);
                            player.encola(pkmnplayer4);

                            trainer.encola(trainer3.enfrenta());
                            trainer.encola(trainer3.enfrenta());
                            trainer.encola(trainer3.enfrenta());
                            trainer.encola(trainer3.enfrenta());

                            pkmnrival = trainer.enfrenta();
                            pkmnplayer = pkmnplayer1;

                            // Se actualizan los graficos
                            JLVidaTrainer.setText(String.valueOf(pkmnrival.getDato().getTipo().getHp()));
                            JLPokmnTrainer.setIcon(pkmnrival.getDato().getImg());

                            JLVidaPlayer.setText(String.valueOf(pkmnplayer.getDato().getTipo().getHp()));
                            JLPkmnPlayer.setIcon(pkmnplayer.getDato().getImg());
                            JLInfo.setText("Combate 3");
                            break;
                        case 3:
                            tor.JLTorneo.setIcon(new javax.swing.ImageIcon("src/TorneoImg/Winner.png"));
                            this.setVisible(false);
                            break;
                    }
                }
            }

            double ataque = pkmnplayer.getDato().getTipo().getAtaque();
            double vidaR = pkmnrival.getDato().getTipo().getHp();
            double defensaR = pkmnrival.getDato().getTipo().getDefensa();

            int defiende = (int) (Math.random() * 3) + 1;

            if (atacap == true) {

                // Turno 1
                if (defiende == 1) {
                    pkmnrival.getDato().getTipo().setHp(vidaR - Math.abs(defensaR - ataque));

                    if (pkmnrival.getDato().getTipo().getHp() <= 0) {
                        pkmnrival = trainer.enfrenta();
                        if (pkmnrival.getDato().getTipo().getHp() <= 0) {
                            pkmnrival = trainer.enfrenta();
                            if (pkmnrival == null) {
                                entrenadoresDerrotados++;
                                switch (entrenadoresDerrotados) {
                                    case 1:
                                        tor.JLTorneo.setIcon(new javax.swing.ImageIcon("src/TorneoImg/Torneo2.png"));

                                        pkmnplayer1 = player.enfrenta();
                                        pkmnplayer2 = player.enfrenta();
                                        pkmnplayer3 = player.enfrenta();
                                        pkmnplayer4 = player.enfrenta();

                                        player.encola(pkmnplayer1);
                                        player.encola(pkmnplayer2);
                                        player.encola(pkmnplayer3);
                                        player.encola(pkmnplayer4);

                                        trainer.encola(trainer2.enfrenta());
                                        trainer.encola(trainer2.enfrenta());
                                        trainer.encola(trainer2.enfrenta());
                                        trainer.encola(trainer2.enfrenta());

                                        pkmnrival = trainer.enfrenta();
                                        pkmnplayer = pkmnplayer1;

                                        // Se actualizan los graficos
                                        JLVidaTrainer.setText(String.valueOf(pkmnrival.getDato().getTipo().getHp()));
                                        JLPokmnTrainer.setIcon(pkmnrival.getDato().getImg());

                                        JLVidaPlayer.setText(String.valueOf(pkmnplayer.getDato().getTipo().getHp()));
                                        JLPkmnPlayer.setIcon(pkmnplayer.getDato().getImg());

                                        JLInfo.setText("Combate 2");
                                        break;
                                    case 2:
                                        tor.JLTorneo.setIcon(new javax.swing.ImageIcon("src/TorneoImg/Torneo3.png"));

                                        pkmnplayer1 = player.enfrenta();
                                        pkmnplayer2 = player.enfrenta();
                                        pkmnplayer3 = player.enfrenta();
                                        pkmnplayer4 = player.enfrenta();

                                        player.encola(pkmnplayer1);
                                        player.encola(pkmnplayer2);
                                        player.encola(pkmnplayer3);
                                        player.encola(pkmnplayer4);

                                        trainer.encola(trainer3.enfrenta());
                                        trainer.encola(trainer3.enfrenta());
                                        trainer.encola(trainer3.enfrenta());
                                        trainer.encola(trainer3.enfrenta());

                                        pkmnrival = trainer.enfrenta();
                                        pkmnplayer = pkmnplayer1;

                                        // Se actualizan los graficos
                                        JLVidaTrainer.setText(String.valueOf(pkmnrival.getDato().getTipo().getHp()));
                                        JLPokmnTrainer.setIcon(pkmnrival.getDato().getImg());

                                        JLVidaPlayer.setText(String.valueOf(pkmnplayer.getDato().getTipo().getHp()));
                                        JLPkmnPlayer.setIcon(pkmnplayer.getDato().getImg());
                                        JLInfo.setText("Combate 3");
                                        break;
                                    case 3:
                                        tor.JLTorneo.setIcon(new javax.swing.ImageIcon("src/TorneoImg/Winner.png"));
                                        this.setVisible(false);
                                        break;
                                }
                            }
                        }
                    }
                } else {
                    pkmnrival.getDato().getTipo().setHp(vidaR - ataque);

                    if (pkmnrival.getDato().getTipo().getHp() <= 0) {
                        pkmnrival = trainer.enfrenta();
                        if (pkmnrival.getDato().getTipo().getHp() <= 0) {
                            pkmnrival = trainer.enfrenta();
                            if (pkmnrival == null) {
                                entrenadoresDerrotados++;
                                switch (entrenadoresDerrotados) {
                                    case 1:
                                        tor.JLTorneo.setIcon(new javax.swing.ImageIcon("src/TorneoImg/Torneo2.png"));

                                        pkmnplayer1 = player.enfrenta();
                                        pkmnplayer2 = player.enfrenta();
                                        pkmnplayer3 = player.enfrenta();
                                        pkmnplayer4 = player.enfrenta();

                                        player.encola(pkmnplayer1);
                                        player.encola(pkmnplayer2);
                                        player.encola(pkmnplayer3);
                                        player.encola(pkmnplayer4);

                                        trainer.encola(trainer2.enfrenta());
                                        trainer.encola(trainer2.enfrenta());
                                        trainer.encola(trainer2.enfrenta());
                                        trainer.encola(trainer2.enfrenta());

                                        pkmnrival = trainer.enfrenta();
                                        pkmnplayer = pkmnplayer1;

                                        // Se actualizan los graficos
                                        JLVidaTrainer.setText(String.valueOf(pkmnrival.getDato().getTipo().getHp()));
                                        JLPokmnTrainer.setIcon(pkmnrival.getDato().getImg());

                                        JLVidaPlayer.setText(String.valueOf(pkmnplayer.getDato().getTipo().getHp()));
                                        JLPkmnPlayer.setIcon(pkmnplayer.getDato().getImg());

                                        JLInfo.setText("Combate 2");
                                        break;
                                    case 2:
                                        tor.JLTorneo.setIcon(new javax.swing.ImageIcon("src/TorneoImg/Torneo3.png"));

                                        pkmnplayer1 = player.enfrenta();
                                        pkmnplayer2 = player.enfrenta();
                                        pkmnplayer3 = player.enfrenta();
                                        pkmnplayer4 = player.enfrenta();

                                        player.encola(pkmnplayer1);
                                        player.encola(pkmnplayer2);
                                        player.encola(pkmnplayer3);
                                        player.encola(pkmnplayer4);

                                        trainer.encola(trainer3.enfrenta());
                                        trainer.encola(trainer3.enfrenta());
                                        trainer.encola(trainer3.enfrenta());
                                        trainer.encola(trainer3.enfrenta());

                                        pkmnrival = trainer.enfrenta();
                                        pkmnplayer = pkmnplayer1;

                                        // Se actualizan los graficos
                                        JLVidaTrainer.setText(String.valueOf(pkmnrival.getDato().getTipo().getHp()));
                                        JLPokmnTrainer.setIcon(pkmnrival.getDato().getImg());

                                        JLVidaPlayer.setText(String.valueOf(pkmnplayer.getDato().getTipo().getHp()));
                                        JLPkmnPlayer.setIcon(pkmnplayer.getDato().getImg());
                                        JLInfo.setText("Combate 3");
                                        break;
                                    case 3:
                                        tor.JLTorneo.setIcon(new javax.swing.ImageIcon("src/TorneoImg/Winner.png"));
                                        this.setVisible(false);
                                        break;
                                }
                            }
                        }
                    }
                }

                // Se actualizan las imagenes
                JLVidaTrainer.setText(String.valueOf(pkmnrival.getDato().getTipo().getHp()));
                JLPokmnTrainer.setIcon(pkmnrival.getDato().getImg());

            } else {
                atacap = true;
                JLAtaqueEsp.setText("");
            }

            // Turno 2
            if (ataca == true) {

                int rivalA = (int) (Math.random() * 2) + 1;

                // Ataque fisico
                if (rivalA == 1) {
                    double ataqueR = pkmnrival.getDato().getTipo().getAtaque();
                    double vida = pkmnplayer.getDato().getTipo().getHp();
                    double defensa = pkmnplayer.getDato().getTipo().getDefensa();

                    defiende = (int) (Math.random() * 3) + 1;

                    if (defiende == 1) {
                        pkmnplayer.getDato().getTipo().setHp(vida - Math.abs(defensa - ataqueR));

                        if (pkmnplayer.getDato().getTipo().getHp() <= 0) {
                            muertos++;
                            switch (muertos) {
                                case 1:
                                    pkmnplayer = pkmnplayer2;
                                    break;
                                case 2:
                                    pkmnplayer = pkmnplayer3;
                                    break;
                                case 3:
                                    pkmnplayer = pkmnplayer4;
                                    break;
                                default:
                                    tor.JLTorneo.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/TorneoImg/Game_Over.png")));
                                    this.setVisible(false);
                                    break;
                            }
                        }
                    } else {
                        pkmnplayer.getDato().getTipo().setHp(vida - ataque);
                        if (pkmnplayer.getDato().getTipo().getHp() <= 0) {
                            muertos++;
                            switch (muertos) {
                                case 1:
                                    pkmnplayer = pkmnplayer2;
                                    break;
                                case 2:
                                    pkmnplayer = pkmnplayer3;
                                    break;
                                case 3:
                                    pkmnplayer = pkmnplayer4;
                                    break;
                                default:
                                    tor.JLTorneo.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/TorneoImg/Game_Over.png")));
                                    this.setVisible(false);
                                    break;
                            }
                        }
                    }

                    // Ataque especial
                } else {
                    double ataqueEspR = pkmnrival.getDato().getTipo().getAtaq_esp();
                    double vida = pkmnplayer.getDato().getTipo().getHp();
                    double defensaEsp = pkmnplayer.getDato().getTipo().getDef_esp();

                    String tipoR = pkmnrival.getDato().getTipo().getTipoString();
                    String tipop = pkmnplayer.getDato().getTipo().getTipoString();

                    defiende = (int) (Math.random() * 3) + 1;

                    if (tipoR.equals("Normal") && tipop.equals("Agua")) {
                        ataqueEspR += 5;
                    } else if (tipop.equals("Normal") && tipoR.equals("Agua")) {
                        defensaEsp += 5;
                    } else if (tipoR.equals("Fuego") && tipop.equals("Normal")) {
                        ataqueEspR += 5;
                    } else if (tipop.equals("Normal") && tipoR.equals("Fuego")) {
                        defensaEsp += 10;
                    } else if (tipoR.equals("Agua") && tipop.equals("Fuego")) {
                        ataqueEspR += 10;
                    } else if (tipop.equals("Fuego") && tipoR.equals("Agua")) {
                        defensaEsp += 10;
                    }

                    if (defiende == 1) {
                        pkmnplayer.getDato().getTipo().setHp(vida - Math.abs(defensaEsp - ataqueEspR));
                        ataca = false;

                        JLAtaqueEspR.setText("El ataque necesita recargarse");
                        // Comprueba si el jugador pierde
                        if (pkmnplayer.getDato().getTipo().getHp() <= 0) {
                            muertos++;
                            switch (muertos) {
                                case 1:
                                    pkmnplayer = pkmnplayer2;
                                    break;
                                case 2:
                                    pkmnplayer = pkmnplayer3;
                                    break;
                                case 3:
                                    pkmnplayer = pkmnplayer4;
                                    break;
                                default:
                                    tor.JLTorneo.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/TorneoImg/Game_Over.png")));
                                    this.setVisible(false);
                                    break;
                            }
                        }
                    } else {
                        pkmnplayer.getDato().getTipo().setHp(vida - ataqueEspR);
                        ataca = false;
                        JLAtaqueEspR.setText("El ataque necesita recargarse");
                        // Comprueba si el jugador pierde
                        if (pkmnplayer.getDato().getTipo().getHp() <= 0) {
                            muertos++;
                            switch (muertos) {
                                case 1:
                                    pkmnplayer = pkmnplayer2;
                                    break;
                                case 2:
                                    pkmnplayer = pkmnplayer3;
                                    break;
                                case 3:
                                    pkmnplayer = pkmnplayer4;
                                    break;
                                default:
                                    tor.JLTorneo.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/TorneoImg/Game_Over.png")));
                                    this.setVisible(false);
                                    break;
                            }
                        }
                    }

                }

                JLVidaPlayer.setText(String.valueOf(pkmnplayer.getDato().getTipo().getHp()));
                JLPkmnPlayer.setIcon(pkmnplayer.getDato().getImg());

            } else {
                ataca = true;
                JLAtaqueEspR.setText("");
            }
        }
    }//GEN-LAST:event_JBAtaqueActionPerformed

    private void JBPokmnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPokmnActionPerformed
        count++;
        // Lista lista = BattleLogic.laLista;
        if (count % 2 == 0) {
            JPPokemon.setVisible(true);
        } else {
            JPPokemon.setVisible(false);
        }


    }//GEN-LAST:event_JBPokmnActionPerformed

    private void JBPokemon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPokemon1ActionPerformed
        // TODO add your handling code here:
        if (pkmnplayer1.getDato().getTipo().getHp() <= 0) {
            JLPkmnDeb.setText("No se puede cambiar a un pokemon debilitado");
        } else {
            JLPkmnDeb.setText("");
            pkmnplayer = pkmnplayer1;

            JLVidaPlayer.setText(String.valueOf(pkmnplayer.getDato().getTipo().getHp()));
            JLPkmnPlayer.setIcon(pkmnplayer.getDato().getImg());
        }
    }//GEN-LAST:event_JBPokemon1ActionPerformed

    private void JBPokemon2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPokemon2ActionPerformed
        // TODO add your handling code here:
        if (pkmnplayer2.getDato().getTipo().getHp() <= 0) {
            JLPkmnDeb.setText("No se puede cambiar a un pokemon debilitado");
        } else {
            JLPkmnDeb.setText("");
            pkmnplayer = pkmnplayer2;

            JLVidaPlayer.setText(String.valueOf(pkmnplayer.getDato().getTipo().getHp()));
            JLPkmnPlayer.setIcon(pkmnplayer.getDato().getImg());
        }
    }//GEN-LAST:event_JBPokemon2ActionPerformed

    private void JBPokemon3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPokemon3ActionPerformed
        // TODO add your handling code here:
        if (pkmnplayer3.getDato().getTipo().getHp() <= 0) {
            JLPkmnDeb.setText("No se puede cambiar a un pokemon debilitado");
        } else {
            JLPkmnDeb.setText("");
            pkmnplayer = pkmnplayer3;

            JLVidaPlayer.setText(String.valueOf(pkmnplayer.getDato().getTipo().getHp()));
            JLPkmnPlayer.setIcon(pkmnplayer.getDato().getImg());
        }
    }//GEN-LAST:event_JBPokemon3ActionPerformed

    private void JBPokemon4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPokemon4ActionPerformed
        // TODO add your handling code here:
        if (pkmnplayer4.getDato().getTipo().getHp() <= 0) {
            JLPkmnDeb.setText("No se puede cambiar a un pokemon debilitado");
        } else {
            JLPkmnDeb.setText("");
            pkmnplayer = pkmnplayer4;

            JLVidaPlayer.setText(String.valueOf(pkmnplayer.getDato().getTipo().getHp()));
            JLPkmnPlayer.setIcon(pkmnplayer.getDato().getImg());
        }
    }//GEN-LAST:event_JBPokemon4ActionPerformed

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
    private javax.swing.JLabel JLAtaqueEsp;
    private javax.swing.JLabel JLAtaqueEspR;
    private javax.swing.JLabel JLInfo;
    private javax.swing.JLabel JLPkmnDeb;
    public javax.swing.JLabel JLPkmnPlayer;
    public javax.swing.JLabel JLPokmnTrainer;
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
