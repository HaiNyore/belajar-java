/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Form;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author Rasyid_
 */
public class Transaksi extends javax.swing.JInternalFrame {

    /**
     * Creates new form DataLaporan
     */
    Connection conn = null;
    PreparedStatement pst = null;
    Statement stat;
    ResultSet rs = null;
    int idTransaksi, idProduk, harga, jumlah, totalHitung, totalItem, totalBayar, stok, sisastok;
    String NamaBarang;
    String Nama;
    
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    DefaultTableModel tableModel1 = new DefaultTableModel(
	new Object[][]{},
	new String[]{
		"List Pelanggan"
	}
    );
    
    DefaultTableModel tableModel2 = new DefaultTableModel(
            new Object[][]{},
            new String[]{
                "Nama Produk", "Harga", "Stok"
            }
    );
    
    DefaultTableModel tableModel3 = new DefaultTableModel(
            new Object[][]{},
            new String[]{
                "Daftar Belanja","Jumlah"
            }
    );
    
    public Transaksi() {
        initComponents();
        setLocation(d.width/2 - getWidth()/2, d.height/2 - getHeight()/2);
        jTableListPelanggan.setModel(tableModel1);
        jTableListProduk.setModel(tableModel2);
        jTableDaftarBelanja.setModel(tableModel3);
        getListPelanggan();
        getListProduk();
        getDaftarBelanja();
        
    }
    
    private void getListPelanggan() {
        tableModel1.getDataVector().removeAllElements();
        tableModel1.fireTableDataChanged();
        try{
            stat = (Statement) ctrlKoneksi.mariaDB().createStatement();
            String sql = "SELECT Nama FROM datapelanggan ORDER BY Nama ASC";
            rs = stat.executeQuery(sql);
            while(rs.next()){
                Object[] obj = new Object[1];
                //obj[0] = rs.getString("idPelanggan");
                obj[0] = rs.getString("Nama");
                tableModel1.addRow(obj);
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    private void getListProduk() {
        tableModel2.getDataVector().removeAllElements();
        tableModel2.fireTableDataChanged();
        try{
            stat = (Statement) ctrlKoneksi.mariaDB().createStatement();
            String sql = "SELECT * FROM dataproduk ORDER BY NamaProduk ASC";
            rs = stat.executeQuery(sql);
            while(rs.next()){
                Object[] obj = new Object[3];
                obj[0] = rs.getString("NamaProduk");
                obj[1] = rs.getString("HargaProduk");
                obj[2] = rs.getString("StokBarang");
                tableModel2.addRow(obj);
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    private void getDaftarBelanja() {
        tableModel3.getDataVector().removeAllElements();
        tableModel3.fireTableDataChanged();
        try {
            stat = (Statement) ctrlKoneksi.mariaDB().createStatement();
            String sql = "SELECT * FROM transaksi ORDER BY NamaProduk ASC";
            rs = stat.executeQuery(sql);
            while (rs.next()) {
                Object[] obj = new Object[2];
                obj[0] = rs.getString("NamaProduk");
                obj[1] = rs.getString("total");
                tableModel3.addRow(obj);
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaLapTransaksi = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableListPelanggan = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableListProduk = new javax.swing.JTable();
        jButtonTambahkan = new javax.swing.JButton();
        jTextFieldJumlah = new javax.swing.JTextField();
        jLabeljumlah = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableDaftarBelanja = new javax.swing.JTable();
        jButtonBayar = new javax.swing.JButton();
        jButtonHapus = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Transaksi");

        jTextAreaLapTransaksi.setEditable(false);
        jTextAreaLapTransaksi.setColumns(20);
        jTextAreaLapTransaksi.setRows(5);
        jTextAreaLapTransaksi.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTextAreaLapTransaksiComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(jTextAreaLapTransaksi);

        jTableListPelanggan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "List Pelanggan"
            }
        ));
        jTableListPelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListPelangganMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableListPelanggan);

        jTableListProduk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nama Produk", "Harga", "Stok"
            }
        ));
        jTableListProduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListProdukMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableListProduk);

        jButtonTambahkan.setText("Tambahkan");
        jButtonTambahkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambahkanActionPerformed(evt);
            }
        });

        jTextFieldJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldJumlahActionPerformed(evt);
            }
        });

        jLabeljumlah.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabeljumlah.setText("Jumlah");

        jTableDaftarBelanja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Daftar Belanja", "Jumlah"
            }
        ));
        jTableDaftarBelanja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDaftarBelanjaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableDaftarBelanja);

        jButtonBayar.setText("BAYAR");
        jButtonBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBayarActionPerformed(evt);
            }
        });

        jButtonHapus.setText("HAPUS");
        jButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusActionPerformed(evt);
            }
        });

        jButtonClear.setText("Keluar");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("TOTAL");

        jTextFieldTotal.setEditable(false);
        jTextFieldTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonTambahkan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldTotal)
                                .addGap(106, 106, 106)
                                .addComponent(jButtonClear))
                            .addComponent(jScrollPane4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonBayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldJumlah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabeljumlah, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabeljumlah)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButtonTambahkan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonClear)
                            .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableListPelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListPelangganMouseClicked
        // TODO add your handling code here:
        int row = jTableListPelanggan.getSelectedRow();
        Nama = tableModel1.getValueAt(row, 0).toString();
    }//GEN-LAST:event_jTableListPelangganMouseClicked

    private void jTextFieldJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldJumlahActionPerformed

    private void jTextFieldTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotalActionPerformed
        // TODO add your handling code here:
        try{
            stat = (Statement) ctrlKoneksi.mariaDB().createStatement();
            String sql = "SELECT total FROM transaksi ORDER BY NamaProduk ASC";
            rs = stat.executeQuery(sql);
            while(rs.next()){
                Object[] obj = new Object[1];
                obj[0] = rs.getString("total");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jTextFieldTotalActionPerformed

    private void jTableListProdukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListProdukMouseClicked
        // TODO add your handling code here:
        
        if(evt.getClickCount()==1){
            int row = jTableListProduk.getSelectedRow();
            NamaBarang = tableModel2.getValueAt(row, 0).toString();
            harga = Integer.parseInt(tableModel2.getValueAt(row, 1).toString());
            
        }
    }//GEN-LAST:event_jTableListProdukMouseClicked

    private void jButtonTambahkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambahkanActionPerformed
        int row = jTableListProduk.getSelectedRow();
        jumlah = Integer.parseInt(jTextFieldJumlah.getText());
        harga = Integer.parseInt(tableModel2.getValueAt(row, 1).toString());
        totalHitung = jumlah * harga;
        
        try{
            conn = ctrlKoneksi.mariaDB();
            String sql = "INSERT INTO transaksi (Nama,NamaProduk,JumlahBeli,total) VALUES ("
            + "'"+Nama+"',"
            + "'"+NamaBarang+"',"
            + "'"+jumlah+"',"
            + "'"+totalHitung+"'"
            + ")";
            pst = conn.prepareStatement(sql);
            pst.execute();
            pst.close();
            JOptionPane.showMessageDialog(null, "Berhasil ditambahkan!");
            getDaftarBelanja();
        } catch (Exception e){
            jTextPane1.showMessageDialog(this, e.getMessage());
        }
        getDaftarBelanja();
    }//GEN-LAST:event_jButtonTambahkanActionPerformed

    private void jTableDaftarBelanjaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDaftarBelanjaMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==1){
            int row = jTableDaftarBelanja.getSelectedRow();
            tableModel3.getValueAt(row, 0);
            totalBayar = Integer.parseInt(tableModel3.getValueAt(row, 1).toString());
            jTextFieldTotal.setText(Integer.toString(totalBayar));
        }
    }//GEN-LAST:event_jTableDaftarBelanjaMouseClicked

    private void jButtonBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBayarActionPerformed
        // TODO add your handling code here:
        int row = jTableListProduk.getSelectedRow();
        String messageArea = "----------> DATA TRANSAKSI <----------\n"
                + "Nama Pelangan: " +Nama+ "\n"
                + "Jumlah beli: " +jumlah+ "\n"
                + "Status: BERHASIL!";
        stok = Integer.parseInt(tableModel2.getValueAt(row, 2).toString());
        sisastok = stok - jumlah;
        try{
            conn = ctrlKoneksi.mariaDB();
            String sql = "INSERT INTO laporantransaki (Nama,NamaProduk,JumlahBeli,total) VALUES ("
            + "'"+Nama+"',"
            + "'"+NamaBarang+"',"
            + "'"+jumlah+"',"
            + "'"+totalHitung+"'"
            + ")";
            pst = conn.prepareStatement(sql);
            pst.execute();
            getDaftarBelanja();
            
            jTextAreaLapTransaksi.setText(messageArea);
            conn = ctrlKoneksi.mariaDB();
            sql = "UPDATE dataproduk SET "
            + " StokBarang='"+sisastok+"'"
            + " WHERE NamaProduk='"+NamaBarang+"';";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Transaksi Berhasil!");
            getDaftarBelanja();
            
            conn = ctrlKoneksi.mariaDB();
            sql = "DELETE FROM transaksi WHERE NamaProduk='"+tableModel3.getValueAt(row, 0)+"'";
            pst = conn.prepareStatement(sql);
            pst.execute();
            getDaftarBelanja();
        } catch (Exception e){
            jTextPane1.showMessageDialog(this, e.getMessage());
        }
        getListProduk();
    }//GEN-LAST:event_jButtonBayarActionPerformed

    private void jTextAreaLapTransaksiComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTextAreaLapTransaksiComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAreaLapTransaksiComponentAdded

    private void jButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusActionPerformed
        // TODO add your handling code here:
        int row = jTableDaftarBelanja.getSelectedRow();
        try{
            conn = ctrlKoneksi.mariaDB();
            String sql = "DELETE FROM transaksi WHERE NamaProduk='"+tableModel3.getValueAt(row, 0)+"'";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
            getDaftarBelanja();
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        getDaftarBelanja();
    }//GEN-LAST:event_jButtonHapusActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonClearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBayar;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonTambahkan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabeljumlah;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableDaftarBelanja;
    private javax.swing.JTable jTableListPelanggan;
    private javax.swing.JTable jTableListProduk;
    private javax.swing.JTextArea jTextAreaLapTransaksi;
    private javax.swing.JTextField jTextFieldJumlah;
    private javax.swing.JTextField jTextFieldTotal;
    // End of variables declaration//GEN-END:variables

    private static class jTextPane1 {

        private static void showMessageDialog(Object object, String data_Berhasil_Disimpan) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public jTextPane1() {
        }
    }
}