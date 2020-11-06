package condicionescompetenciafinal;
import condicionescompetenciafinal.Hilo;
import javax.swing.JOptionPane;

public class CondicionesCompetencias extends javax.swing.JFrame {
    public static Hilo h1,h2,h3,h4;
    private RCompartido rc;    
    public CondicionesCompetencias() {
        setTitle("La cena de los perritos");
        initComponents();
        rc = new RCompartido();
        h1 = new Hilo(area1,rc);
        h1.setName("Perro 1");
        h2 = new Hilo(area2,rc);
        h2.setName("Perro 2");
        h3 = new Hilo(area3,rc);
        h3.setName("Perro 3");
        h4 = new Hilo(area4,rc);
        h4.setName("Perro 4");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jButtonRun = new javax.swing.JButton();
        jButtonKill = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        area2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        area3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        area4 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemCC = new javax.swing.JMenuItem();
        jMenuItemDI = new javax.swing.JMenuItem();
        jMenuItemVC = new javax.swing.JMenuItem();
        jMenuItemDKK = new javax.swing.JMenuItem();
        jMenuItemDJK = new javax.swing.JMenuItem();
        jMenuItemMXA = new javax.swing.JMenuItem();
        jMenuItemMXT = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Desactivación de interrupciones"); // NOI18N

        jButtonRun.setText("Correr");
        jButtonRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRunActionPerformed(evt);
            }
        });

        jButtonKill.setText("Kill -9");
        jButtonKill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKillActionPerformed(evt);
            }
        });

        area1.setColumns(20);
        area1.setRows(5);
        jScrollPane1.setViewportView(area1);

        area2.setColumns(20);
        area2.setRows(5);
        jScrollPane2.setViewportView(area2);

        area3.setColumns(20);
        area3.setRows(5);
        jScrollPane3.setViewportView(area3);

        area4.setColumns(20);
        area4.setRows(5);
        jScrollPane4.setViewportView(area4);

        jLabel1.setText("Plato 1");

        jLabel2.setText("Plato 2");

        jLabel3.setText("Plato 3");

        jLabel4.setText("Plato 4");

        jButton1.setText("Again");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu4.setText("Algoritmos");

        jMenuItemCC.setText("Condiciones Competencia");
        jMenuItemCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCCActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemCC);

        jMenuItemDI.setText("Desactivación de interrupciones");
        jMenuItemDI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDIActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemDI);

        jMenuItemVC.setText("Variable de Cerradura");
        jMenuItemVC.setActionCommand("PetersonCommand");
        jMenuItemVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVCActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemVC);

        jMenuItemDKK.setText("Dekker");
        jMenuItemDKK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDKKActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemDKK);

        jMenuItemDJK.setText("Dijkstra");
        jMenuItemDJK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDJKActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemDJK);

        jMenuItemMXA.setText("Mutex API");
        jMenuItemMXA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMXAActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemMXA);

        jMenuItemMXT.setText("Mutex Tradicional");
        jMenuItemMXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMXTActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemMXT);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("File");

        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRun)
                    .addComponent(jButtonKill)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel1)
                .addGap(127, 127, 127)
                .addComponent(jLabel2)
                .addGap(101, 101, 101)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jButtonRun)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonKill)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4))))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButtonRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRunActionPerformed
        if(h1.getAlgoritmo()!=0){
        h1.start();
        h2.start();
        h3.start();
        h4.start();
        
        }else{
            JOptionPane.showMessageDialog(null, "Imposible. Seleccione algoritmo");
        }
    }//GEN-LAST:event_jButtonRunActionPerformed

    private void jButtonKillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKillActionPerformed
        int id = (int)(Math.random()*3);
        
        
        if(h1.getAlgoritmo()!=0){
        switch(id){
            case 0:
                try{
                    h1.setDead(true);
                    JOptionPane.showMessageDialog(null, "Kill primer proceso");
                }catch(Exception e){JOptionPane.showMessageDialog(null, "Error");}
                break;
            case 1:
                try{
                    h2.setDead(true);
                    JOptionPane.showMessageDialog(null, "Kill segundo proceso");
                }catch(Exception e){JOptionPane.showMessageDialog(null, "Error");}
                break;
            case 2:
                try{
                    h3.setDead(true);
                    JOptionPane.showMessageDialog(null, "Kill tercer proceso");
                }catch(Exception e){JOptionPane.showMessageDialog(null, "Error");}
                break;
            case 3:
                try{
                    h4.setDead(true);
                    JOptionPane.showMessageDialog(null, "Kill cuarto proceso");
                }catch(Exception e){JOptionPane.showMessageDialog(null, "Error");}
                break;
            default:
        }
        
        }
        else{
            JOptionPane.showMessageDialog(null, "Imposible. Seleccione algoritmo");
        }
    }//GEN-LAST:event_jButtonKillActionPerformed

    private void jMenuItemDIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDIActionPerformed
        h1.setAlgoritmo(2);
        h2.setAlgoritmo(2);
        h3.setAlgoritmo(2);
        h4.setAlgoritmo(2);
        jButtonKill.setVisible(true);
    }//GEN-LAST:event_jMenuItemDIActionPerformed

    private void jMenuItemCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCCActionPerformed
        h1.setAlgoritmo(1);
        h2.setAlgoritmo(1);
        h3.setAlgoritmo(1);
        h4.setAlgoritmo(1);
        jButtonKill.setVisible(false);
    }//GEN-LAST:event_jMenuItemCCActionPerformed
        
    private void jMenuItemVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVCActionPerformed
        h1.setAlgoritmo(3);
        h2.setAlgoritmo(3);
        h3.setAlgoritmo(3);
        h4.setAlgoritmo(3);
        jButtonKill.setVisible(true);
    }//GEN-LAST:event_jMenuItemVCActionPerformed

    private void jMenuItemDKKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDKKActionPerformed
        h1.setAlgoritmo(4);
        h2.setAlgoritmo(4);
        h3.setAlgoritmo(4);
        h4.setAlgoritmo(4);
        jButtonKill.setVisible(true);
    }//GEN-LAST:event_jMenuItemDKKActionPerformed

    private void jMenuItemDJKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDJKActionPerformed
        h1.setAlgoritmo(5);
        h1.setID(0);
        h2.setAlgoritmo(5);
        h2.setID(1);
        h3.setAlgoritmo(5);
        h3.setID(2);
        h4.setAlgoritmo(5);
        h4.setID(3);
        jButtonKill.setVisible(true);
    }//GEN-LAST:event_jMenuItemDJKActionPerformed

    private void jMenuItemMXAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMXAActionPerformed
        h1.setAlgoritmo(6);
        h2.setAlgoritmo(6);
        h3.setAlgoritmo(6);
        h4.setAlgoritmo(6);
        jButtonKill.setVisible(true);
    }//GEN-LAST:event_jMenuItemMXAActionPerformed

    private void jMenuItemMXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMXTActionPerformed
        h1.setAlgoritmo(7);
        h2.setAlgoritmo(7);
        h3.setAlgoritmo(7);
        h4.setAlgoritmo(7);
        jButtonKill.setVisible(true);
    }//GEN-LAST:event_jMenuItemMXTActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
new CondicionesCompetencias().setVisible(true);
        this.setVisible(false); 
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // Exit
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CondicionesCompetencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CondicionesCompetencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CondicionesCompetencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CondicionesCompetencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CondicionesCompetencias().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area1;
    private javax.swing.JTextArea area2;
    private javax.swing.JTextArea area3;
    private javax.swing.JTextArea area4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonKill;
    private javax.swing.JButton jButtonRun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItemCC;
    private javax.swing.JMenuItem jMenuItemDI;
    private javax.swing.JMenuItem jMenuItemDJK;
    private javax.swing.JMenuItem jMenuItemDKK;
    private javax.swing.JMenuItem jMenuItemMXA;
    private javax.swing.JMenuItem jMenuItemMXT;
    private javax.swing.JMenuItem jMenuItemVC;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
