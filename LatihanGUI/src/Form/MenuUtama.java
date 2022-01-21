/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form;

import javax.swing.JFrame;

/**
 *
 * @author Rasyid_
 */
public class MenuUtama extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
        initComponents();
        this.setState(JFrame.MAXIMIZED_BOTH);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        JmenuBarUtama = new javax.swing.JMenuBar();
        JmenuMaster = new javax.swing.JMenu();
        JmItemDataPelanggan = new javax.swing.JMenuItem();
        JmItemDataProduk = new javax.swing.JMenuItem();
        JmenuTransaksi = new javax.swing.JMenu();
        JmenuLaporan = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
        );

        JmenuMaster.setText("Master");

        JmItemDataPelanggan.setText("Master Data Pelanggan");
        JmItemDataPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmItemDataPelangganActionPerformed(evt);
            }
        });
        JmenuMaster.add(JmItemDataPelanggan);

        JmItemDataProduk.setText("Master Data Produk");
        JmItemDataProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmItemDataProdukActionPerformed(evt);
            }
        });
        JmenuMaster.add(JmItemDataProduk);

        JmenuBarUtama.add(JmenuMaster);

        JmenuTransaksi.setText("Transaksi");
        JmenuTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JmenuTransaksiMouseClicked(evt);
            }
        });
        JmenuTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmenuTransaksiActionPerformed(evt);
            }
        });
        JmenuBarUtama.add(JmenuTransaksi);

        JmenuLaporan.setText("Laporan");
        JmenuLaporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JmenuLaporanMouseClicked(evt);
            }
        });
        JmenuBarUtama.add(JmenuLaporan);

        setJMenuBar(JmenuBarUtama);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JmItemDataPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmItemDataPelangganActionPerformed
        // TODO add your handling code here:
        //new DataPelanggan().setVisible(true);
        DataPelanggan DP = new DataPelanggan();
        DP.show();
        jDesktopPane1.add(DP);
    }//GEN-LAST:event_JmItemDataPelangganActionPerformed

    private void JmItemDataProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmItemDataProdukActionPerformed
        // TODO add your handling code here:
        DataProduk DPR = new DataProduk();
        DPR.show();
        jDesktopPane1.add(DPR);
    }//GEN-LAST:event_JmItemDataProdukActionPerformed

    private void JmenuTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmenuTransaksiActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_JmenuTransaksiActionPerformed

    private void JmenuTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JmenuTransaksiMouseClicked
        // TODO add your handling code here:
        Transaksi T = new Transaksi();
        T.show();
        jDesktopPane1.add(T);
    }//GEN-LAST:event_JmenuTransaksiMouseClicked

    private void JmenuLaporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JmenuLaporanMouseClicked
        // TODO add your handling code here:
        LaporanTransaksi LT = new LaporanTransaksi();
        LT.show();
        jDesktopPane1.add(LT);
    }//GEN-LAST:event_JmenuLaporanMouseClicked

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JmItemDataPelanggan;
    private javax.swing.JMenuItem JmItemDataProduk;
    private javax.swing.JMenuBar JmenuBarUtama;
    private javax.swing.JMenu JmenuLaporan;
    private javax.swing.JMenu JmenuMaster;
    private javax.swing.JMenu JmenuTransaksi;
    private javax.swing.JDesktopPane jDesktopPane1;
    // End of variables declaration//GEN-END:variables
}
