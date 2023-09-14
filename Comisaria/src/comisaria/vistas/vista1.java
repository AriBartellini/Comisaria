
package comisaria.vistas;

public class vista1 extends javax.swing.JFrame {

    public vista1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        menuPersona = new javax.swing.JMenu();
        menuAgregarPersona = new javax.swing.JMenuItem();
        menuBuscarPersona = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        menuAgregarObjeto = new javax.swing.JMenuItem();
        menuBuscarObjeto = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        MenuAgegarCaso = new javax.swing.JMenuItem();
        menuBuscarCaso = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        menuBusquedaSinFiltros = new javax.swing.JMenuItem();
        menuBusquedaConFiltros = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 741, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );

        jMenu1.setText("Administracion");

        jMenuItem9.setText("Personal");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem10.setText("Noticias");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuItem11.setText("Informes");
        jMenu1.add(jMenuItem11);

        jMenuItem12.setText("Configuracion");
        jMenu1.add(jMenuItem12);

        jMenuBar1.add(jMenu1);

        menuPersona.setText("Personas");
        menuPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPersonaActionPerformed(evt);
            }
        });

        menuAgregarPersona.setText("Agregar");
        menuAgregarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgregarPersonaActionPerformed(evt);
            }
        });
        menuPersona.add(menuAgregarPersona);

        menuBuscarPersona.setText("Buscar");
        menuBuscarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscarPersonaActionPerformed(evt);
            }
        });
        menuPersona.add(menuBuscarPersona);

        jMenuBar1.add(menuPersona);

        jMenu5.setText("Objetos");

        menuAgregarObjeto.setText("Agregar");
        menuAgregarObjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgregarObjetoActionPerformed(evt);
            }
        });
        jMenu5.add(menuAgregarObjeto);

        menuBuscarObjeto.setText("Buscar");
        menuBuscarObjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscarObjetoActionPerformed(evt);
            }
        });
        jMenu5.add(menuBuscarObjeto);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Casos");

        MenuAgegarCaso.setText("Agregar");
        jMenu6.add(MenuAgegarCaso);

        menuBuscarCaso.setText("Buscar");
        jMenu6.add(menuBuscarCaso);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Busqueda");

        menuBusquedaSinFiltros.setText("Deseame suerte!");
        jMenu7.add(menuBusquedaSinFiltros);

        menuBusquedaConFiltros.setText("Por filtros");
        jMenu7.add(menuBusquedaConFiltros);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuAgregarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgregarPersonaActionPerformed
       escritorio.removeAll();
        escritorio.repaint();
        agregarPersona ap = new agregarPersona();
        ap.setVisible(true);
        escritorio.add(ap);
        escritorio.moveToFront(ap);
    }//GEN-LAST:event_menuAgregarPersonaActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

  
        
    private void menuPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPersonaActionPerformed
        
    }//GEN-LAST:event_menuPersonaActionPerformed

    private void menuBuscarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscarPersonaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        buscarPersona bp = new buscarPersona();
        bp.setVisible(true);
        escritorio.add(bp);
        escritorio.moveToFront(bp);
    }//GEN-LAST:event_menuBuscarPersonaActionPerformed

    private void menuAgregarObjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgregarObjetoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        agregarObjeto ao = new agregarObjeto();
        ao.setVisible(true);
        escritorio.add(ao);
        escritorio.moveToFront(ao);
    }//GEN-LAST:event_menuAgregarObjetoActionPerformed

    private void menuBuscarObjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscarObjetoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        buscarObjeto bo = new buscarObjeto();
        bo.setVisible(true);
        escritorio.add(bo);
        escritorio.moveToFront(bo);
    }//GEN-LAST:event_menuBuscarObjetoActionPerformed

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
            java.util.logging.Logger.getLogger(vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuAgegarCaso;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem menuAgregarObjeto;
    private javax.swing.JMenuItem menuAgregarPersona;
    private javax.swing.JMenuItem menuBuscarCaso;
    private javax.swing.JMenuItem menuBuscarObjeto;
    private javax.swing.JMenuItem menuBuscarPersona;
    private javax.swing.JMenuItem menuBusquedaConFiltros;
    private javax.swing.JMenuItem menuBusquedaSinFiltros;
    private javax.swing.JMenu menuPersona;
    // End of variables declaration//GEN-END:variables
}
