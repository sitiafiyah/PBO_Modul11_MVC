/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.view;
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.util.ArrayList; 
import java.util.List; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import javax.swing.JButton; 
import javax.swing.JComboBox; 
import javax.swing.JOptionPane; 
import javax.swing.JTable; 
import javax.swing.JTextField; 
import javax.swing.table.DefaultTableModel; 
import pack.control.c_koneksi; 
import pack.control.controllerToko; 
import pack.model.m_toko; 
/**
 *
 * @author Siti Afiyah
 */
public class home extends javax.swing.JFrame {
    controllerToko ctoko;
    List<m_toko>listdata = new ArrayList<>();
    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        ctoko = new controllerToko(this);
        ctoko.isiTable();
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
        txtadmin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Btn_Keluar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Btn_Simpan = new javax.swing.JButton();
        Btn_Ubah = new javax.swing.JButton();
        Btn_Bersih = new javax.swing.JButton();
        Btn_Hapus = new javax.swing.JButton();
        txtharga = new javax.swing.JTextField();
        txtkode = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        cbjenis = new javax.swing.JComboBox<>();
        cbKategoriBrg = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        CbCariKategori = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(null);

        txtadmin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtadmin);
        txtadmin.setBounds(70, 40, 150, 30);

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Data Barang Di Toko");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(260, 10, 470, 60);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Admin Toko");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 10, 150, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 920, 100);

        jPanel6.setBackground(new java.awt.Color(153, 153, 255));
        jPanel6.setLayout(null);

        Btn_Keluar.setBackground(new java.awt.Color(255, 102, 153));
        Btn_Keluar.setText("Exit");
        Btn_Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_KeluarActionPerformed(evt);
            }
        });
        jPanel6.add(Btn_Keluar);
        Btn_Keluar.setBounds(780, 350, 120, 30);

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setLayout(null);

        jLabel2.setText("Harga");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 210, 100, 30);

        jLabel5.setText("Kode Barang");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(30, 50, 100, 30);

        jLabel6.setText("Nama Barang");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(30, 90, 100, 30);

        jLabel7.setText("Kategori Barang");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(30, 130, 100, 30);

        jLabel8.setText("Jenis Packaging");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(30, 170, 100, 30);

        Btn_Simpan.setBackground(new java.awt.Color(204, 204, 204));
        Btn_Simpan.setText("Simpan");
        Btn_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SimpanActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_Simpan);
        Btn_Simpan.setBounds(310, 260, 80, 30);

        Btn_Ubah.setBackground(new java.awt.Color(204, 204, 204));
        Btn_Ubah.setText("Ubah");
        Btn_Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_UbahActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_Ubah);
        Btn_Ubah.setBounds(220, 260, 80, 30);

        Btn_Bersih.setBackground(new java.awt.Color(204, 204, 204));
        Btn_Bersih.setText("Bersihkan");
        Btn_Bersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BersihActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_Bersih);
        Btn_Bersih.setBounds(120, 260, 90, 30);

        Btn_Hapus.setBackground(new java.awt.Color(204, 204, 204));
        Btn_Hapus.setText("Hapus");
        Btn_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_HapusActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_Hapus);
        Btn_Hapus.setBounds(30, 260, 80, 30);
        jPanel2.add(txtharga);
        txtharga.setBounds(170, 210, 220, 30);

        txtkode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkodeActionPerformed(evt);
            }
        });
        jPanel2.add(txtkode);
        txtkode.setBounds(170, 50, 220, 30);
        jPanel2.add(txtnama);
        txtnama.setBounds(170, 90, 220, 30);

        cbjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pack", "Sachet" }));
        jPanel2.add(cbjenis);
        cbjenis.setBounds(170, 170, 220, 30);

        cbKategoriBrg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Minuman", "Snack", "Bumbu" }));
        jPanel2.add(cbKategoriBrg);
        cbKategoriBrg.setBounds(170, 130, 220, 30);

        jPanel5.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.add(jPanel5);
        jPanel5.setBounds(-20, 330, 390, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Masukan Data Barang");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 0, 270, 40);

        jPanel6.add(jPanel2);
        jPanel2.setBounds(20, 20, 430, 310);

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));
        jPanel4.setLayout(null);

        CbCariKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Minuman", "Snack", "Bumbu", " " }));
        jPanel4.add(CbCariKategori);
        CbCariKategori.setBounds(40, 40, 130, 30);

        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(180, 40, 80, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Pencarian Berdasarkan Kateori Makanan");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(40, 10, 230, 30);

        jPanel6.add(jPanel4);
        jPanel4.setBounds(530, 20, 310, 80);

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));
        jPanel3.setLayout(null);

        Tabel1.setBackground(new java.awt.Color(102, 102, 255));
        Tabel1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Kategori", "Packaging", "Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel1);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(20, 30, 400, 162);

        jPanel6.add(jPanel3);
        jPanel3.setBounds(460, 110, 440, 220);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 100, 920, 400);

        setBounds(0, 0, 931, 527);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_HapusActionPerformed
        ctoko.Hapus();
        ctoko.isiTable();
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_HapusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ctoko.CariKategori();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Btn_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SimpanActionPerformed
        ctoko.SimpanData();
        ctoko.isiTable();
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_SimpanActionPerformed

    private void Btn_UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_UbahActionPerformed
        ctoko.Ubah();
        ctoko.isiTable();
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_UbahActionPerformed

    private void Btn_BersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BersihActionPerformed
        ctoko.Reset();
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_BersihActionPerformed

    private void Btn_KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_KeluarActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_KeluarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String user1 = login.user;
        txtadmin.setText(user1);
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void txtkodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkodeActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
       
//  TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void Tabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel1MouseClicked
       int baris = Tabel1.getSelectedRow();
        if(baris != 1){
            txtkode.setText(Tabel1.getValueAt(baris, 0).toString());
            txtnama.setText(Tabel1.getValueAt(baris, 1).toString());
            cbKategoriBrg.setSelectedItem(Tabel1.getValueAt(baris, 2).toString());
            cbjenis.setSelectedItem(Tabel1.getValueAt(baris, 3).toString());
            txtharga.setText(Tabel1.getValueAt(baris, 4).toString());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_Tabel1MouseClicked

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Bersih;
    private javax.swing.JButton Btn_Hapus;
    private javax.swing.JButton Btn_Keluar;
    private javax.swing.JButton Btn_Simpan;
    private javax.swing.JButton Btn_Ubah;
    private javax.swing.JComboBox<String> CbCariKategori;
    private javax.swing.JTable Tabel1;
    private javax.swing.JComboBox<String> cbKategoriBrg;
    private javax.swing.JComboBox<String> cbjenis;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtadmin;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
    
    public JTextField getTxtKode(){ 
        return txtkode; 
    } 
    public JTextField getTxtNama(){ 
        return txtnama; 
    } 
    public JTextField getTxtHarga(){ 
        return txtharga; 
    } 
    public JComboBox getCbKategori(){ 
        return cbKategoriBrg; 
    } 
    public JComboBox getCbJenis(){ 
        return cbjenis; 
    } 
    public JComboBox getCbCariKategori(){ 
        return CbCariKategori; 
    } 
    public JButton getButtonHapus(){ 
        return Btn_Hapus; 
    } 
     
    public JButton getButtonBersih(){ 
        return Btn_Bersih; 
    } 
    public JButton getButtonSimpan(){ 
        return Btn_Simpan; 
    } 
    public JButton getButtonUbah(){ 
        return Btn_Ubah; 
    } 
    public JButton getButtonKeluar(){ 
        return Btn_Keluar; 
    } 
    public JTable getTableData(){ 
        return Tabel1; 
    } 
}

