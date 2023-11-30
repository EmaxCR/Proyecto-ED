/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import Battle.BattleLogic;

/**
 *
 * @author cesar
 */
public class MainMenu extends javax.swing.JFrame {
   
    
    
    
    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
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

        JPMainMenu = new javax.swing.JPanel();
        JBStart = new javax.swing.JButton();
        JLImgPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPMainMenu.setBackground(new java.awt.Color(153, 153, 153));
        JPMainMenu.setForeground(new java.awt.Color(0, 102, 51));

        JBStart.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        JBStart.setText("Start");
        JBStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBStartActionPerformed(evt);
            }
        });

        JLImgPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLImgPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MainImg-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout JPMainMenuLayout = new javax.swing.GroupLayout(JPMainMenu);
        JPMainMenu.setLayout(JPMainMenuLayout);
        JPMainMenuLayout.setHorizontalGroup(
            JPMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPMainMenuLayout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addGroup(JPMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPMainMenuLayout.createSequentialGroup()
                        .addComponent(JBStart, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(237, 237, 237))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPMainMenuLayout.createSequentialGroup()
                        .addComponent(JLImgPrincipal)
                        .addGap(180, 180, 180))))
        );
        JPMainMenuLayout.setVerticalGroup(
            JPMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPMainMenuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(JLImgPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBStart)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBStartActionPerformed
        BattleLogic battle = new BattleLogic();
        
        battle.setUp();
        battle.start();
    }//GEN-LAST:event_JBStartActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBStart;
    private javax.swing.JLabel JLImgPrincipal;
    private javax.swing.JPanel JPMainMenu;
    // End of variables declaration//GEN-END:variables
}
