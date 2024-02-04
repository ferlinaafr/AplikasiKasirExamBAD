/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectuts;

/**
 *
 * @author Amir
 */
public class MenuUI extends BaseUI {

    /**
     * Creates new form MenuUi
     */
    public cPakaian[] arrayPakaian;

    public MenuUI() {
        initComponents();
    }

    public MenuUI(cPakaian[] cPakaian) {
        if (cPakaian != null) {
            this.arrayPakaian = cPakaian;
        }
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

        jPanel1 = new javax.swing.JPanel();
        jLabelTitleMenu = new javax.swing.JLabel();
        jButtonPakaianMenu = new javax.swing.JButton();
        jButtonTransaksiMenu = new javax.swing.JButton();
        jButtonSelesaiMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 146));

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(694, 666));

        jLabelTitleMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalprojectuts/res/menu/ic_menu.png"))); // NOI18N

        jButtonPakaianMenu.setBackground(new java.awt.Color(135, 199, 244));
        jButtonPakaianMenu.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jButtonPakaianMenu.setForeground(new java.awt.Color(97, 97, 41));
        jButtonPakaianMenu.setText("TRANSAKSI");
        jButtonPakaianMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPakaianMenuActionPerformed(evt);
            }
        });

        jButtonTransaksiMenu.setBackground(new java.awt.Color(135, 199, 244));
        jButtonTransaksiMenu.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jButtonTransaksiMenu.setForeground(new java.awt.Color(97, 97, 41));
        jButtonTransaksiMenu.setText("SELESAI");
        jButtonTransaksiMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTransaksiMenuActionPerformed(evt);
            }
        });

        jButtonSelesaiMenu.setBackground(new java.awt.Color(135, 199, 244));
        jButtonSelesaiMenu.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jButtonSelesaiMenu.setForeground(new java.awt.Color(97, 97, 41));
        jButtonSelesaiMenu.setText("PAKAIAN");
        jButtonSelesaiMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelesaiMenuActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PAKAIANID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(267, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonPakaianMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(jButtonSelesaiMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonTransaksiMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(235, 235, 235))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabelTitleMenu))
                        .addGap(275, 275, 275))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addComponent(jLabelTitleMenu)
                .addGap(78, 78, 78)
                .addComponent(jButtonSelesaiMenu)
                .addGap(30, 30, 30)
                .addComponent(jButtonPakaianMenu)
                .addGap(28, 28, 28)
                .addComponent(jButtonTransaksiMenu)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTransaksiMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTransaksiMenuActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonTransaksiMenuActionPerformed

    private void jButtonSelesaiMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelesaiMenuActionPerformed
        PakaianUI menuPakaian = new PakaianUI(arrayPakaian);
        menuPakaian.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonSelesaiMenuActionPerformed

    private void jButtonPakaianMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPakaianMenuActionPerformed
        PenjualanUI menuPenjualan = new PenjualanUI(arrayPakaian);
        menuPenjualan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonPakaianMenuActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {

        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPakaianMenu;
    private javax.swing.JButton jButtonSelesaiMenu;
    private javax.swing.JButton jButtonTransaksiMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelTitleMenu;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
