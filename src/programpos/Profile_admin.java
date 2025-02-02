/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package programpos;

//import Config.Koneksi;
import com.sun.jdi.connect.spi.Connection;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Profile_admin extends javax.swing.JFrame {
    Profile P;

    static DefaultTableModel pr;
    static DefaultTableModel dd;

  
    

    /**
     * Creates new form Profile
     */

    
        public Profile_admin() {
        initComponents();
        
        settingTable(); 

        viewData("");
      

    }

    public Profile_admin(Profile P) {
        initComponents();
        labelName.setText("Selamat Datang" + " " + P.getFullname() + "(" + P.getrole() + ")");
        settingTable();  
        viewData("");
        viewDataProduk("");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_logout = new javax.swing.JButton();
        labelName = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        tambahuser = new javax.swing.JToggleButton();
        ubahuser = new javax.swing.JToggleButton();
        hapususer = new javax.swing.JToggleButton();
        refresh = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pencarian = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelUser = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        tbltambahproduk = new javax.swing.JToggleButton();
        tblubahproduk = new javax.swing.JToggleButton();
        tblhapusproduk = new javax.swing.JToggleButton();
        tblrefreshproduk = new javax.swing.JToggleButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pencarianproduk = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelProduk = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();

        jLabel1.setText("jLabel1");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(236, 236, 236));

        jPanel2.setBackground(new java.awt.Color(0, 126, 189));

        btn_logout.setText("Logout");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        labelName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelName.setForeground(new java.awt.Color(255, 255, 255));
        labelName.setText("Selamat Datang");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(248, 248, 248));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(434, 434, 434)
                .addComponent(labelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_logout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelName)
                    .addComponent(btn_logout))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 157, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(102, 0, 255));

        tambahuser.setBackground(new java.awt.Color(153, 102, 0));
        tambahuser.setForeground(new java.awt.Color(255, 255, 255));
        tambahuser.setText("Tambah");
        tambahuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahuserActionPerformed(evt);
            }
        });

        ubahuser.setBackground(new java.awt.Color(153, 102, 0));
        ubahuser.setForeground(new java.awt.Color(255, 255, 255));
        ubahuser.setText("Ubah");
        ubahuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahuserActionPerformed(evt);
            }
        });

        hapususer.setBackground(new java.awt.Color(153, 102, 0));
        hapususer.setForeground(new java.awt.Color(255, 255, 255));
        hapususer.setText("Hapus");
        hapususer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapususerActionPerformed(evt);
            }
        });

        refresh.setBackground(new java.awt.Color(153, 102, 0));
        refresh.setForeground(new java.awt.Color(255, 255, 255));
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/programpos/Search.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        pencarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencarianActionPerformed(evt);
            }
        });
        pencarian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pencarianKeyReleased(evt);
            }
        });
        jPanel3.add(pencarian, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 40));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tambahuser, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ubahuser, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hapususer, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(521, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tambahuser)
                        .addComponent(refresh)
                        .addComponent(ubahuser)
                        .addComponent(hapususer))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        tabelUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "no", "id_akun", "fullname", "username", "password", "role"
            }
        ));
        jScrollPane1.setViewportView(tabelUser);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        jTabbedPane1.addTab("Data User", jPanel5);

        jPanel9.setBackground(new java.awt.Color(102, 0, 255));

        tbltambahproduk.setBackground(new java.awt.Color(153, 102, 0));
        tbltambahproduk.setForeground(new java.awt.Color(255, 255, 255));
        tbltambahproduk.setText("Tambah");
        tbltambahproduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbltambahprodukActionPerformed(evt);
            }
        });

        tblubahproduk.setBackground(new java.awt.Color(153, 102, 0));
        tblubahproduk.setForeground(new java.awt.Color(255, 255, 255));
        tblubahproduk.setText("Ubah");
        tblubahproduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblubahprodukActionPerformed(evt);
            }
        });

        tblhapusproduk.setBackground(new java.awt.Color(153, 102, 0));
        tblhapusproduk.setForeground(new java.awt.Color(255, 255, 255));
        tblhapusproduk.setText("Hapus");
        tblhapusproduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblhapusprodukActionPerformed(evt);
            }
        });

        tblrefreshproduk.setBackground(new java.awt.Color(153, 102, 0));
        tblrefreshproduk.setForeground(new java.awt.Color(255, 255, 255));
        tblrefreshproduk.setText("Refresh");
        tblrefreshproduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblrefreshprodukActionPerformed(evt);
            }
        });

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/programpos/Search.png"))); // NOI18N
        jPanel11.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        pencarianproduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencarianprodukActionPerformed(evt);
            }
        });
        pencarianproduk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pencarianprodukKeyReleased(evt);
            }
        });
        jPanel11.add(pencarianproduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 40));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tbltambahproduk, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tblubahproduk, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tblhapusproduk, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(tblrefreshproduk, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tbltambahproduk)
                        .addComponent(tblrefreshproduk)
                        .addComponent(tblubahproduk)
                        .addComponent(tblhapusproduk)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        tabelProduk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "no", "id produk", "nama produk", "kode produk", "harga beli", "harga jual", "stok", "deskripsi"
            }
        ));
        jScrollPane2.setViewportView(tabelProduk);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Data Produk", jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1246, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Data Transaksi", jPanel7);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTabbedPane1)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void pencarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencarianActionPerformed
        String key = pencarian.getText().trim();
        if (!key.isEmpty()) {
            viewData(key);
        }else{
            viewData("");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_pencarianActionPerformed

    private void tambahuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahuserActionPerformed
       tambahdata T = new tambahdata(this, true);
       T.setVisible(true); 
    }//GEN-LAST:event_tambahuserActionPerformed

    private void hapususerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapususerActionPerformed
      int n = tabelUser.getSelectedRow();
        if(n != -1){
            int id = Integer.parseInt(tabelUser.getValueAt(n, 1).toString());
            System.out.println(id);
            String fullname = tabelUser.getValueAt(n, 2).toString();

            int opsi = JOptionPane.showConfirmDialog(this, 
                    "Apakah Anda yakin ingin menghapus data "+fullname+"?", 
                    "Hapus Data", 
                    JOptionPane.YES_NO_OPTION);
            if(opsi == 0){
                String Q = "DELETE FROM akun "
                        + "WHERE id_akun="+id;
                System.out.println(Q);
                try {
                    java.sql.Connection K = connect.konek();
                    Statement S = K.createStatement();
                    S.executeUpdate(Q);
                    viewData(""); 
                    JOptionPane.showMessageDialog(this, "Data "+fullname+" telah terhapus");
                } catch (SQLException e) {
                }
            }
            
        }else {
            JOptionPane.showMessageDialog(this, "Anda belum memilih data");
        }
    }//GEN-LAST:event_hapususerActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        viewData("");
    }//GEN-LAST:event_refreshActionPerformed

    private void ubahuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahuserActionPerformed
       int n = tabelUser.getSelectedRow();
        if(n != -1){
            int id = Integer.parseInt(tabelUser.getValueAt(n, 1).toString());
            String fullname = tabelUser.getValueAt(n, 2).toString();
            String username = tabelUser.getValueAt(n, 3).toString();
            String password = tabelUser.getValueAt(n, 4).toString();
            String level = tabelUser.getValueAt(n, 5).toString();
            ubahdata U = new ubahdata(this, true);
            U.setId_akun(id); 
            U.setFullname(fullname);
            U.setUsername(username);
            U.setPassword(password); 
            U.setrole(level); 
            U.setVisible(true); 
            
        }else {
            JOptionPane.showMessageDialog(this, "Anda belum memilih data");
        }
    
    }//GEN-LAST:event_ubahuserActionPerformed

    private void tbltambahprodukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbltambahprodukActionPerformed
        tambahproduk TP = new tambahproduk(this, true);
        TP.setVisible(true); 
                                  // TODO add your handling code here:
    }//GEN-LAST:event_tbltambahprodukActionPerformed

    private void tblubahprodukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblubahprodukActionPerformed
                                              
    int n = tabelProduk.getSelectedRow();
        if(n != -1){
            int id = Integer.parseInt(tabelProduk.getValueAt(n, 1).toString());
            String nama_product = tabelProduk.getValueAt(n, 2).toString();
            String kode_produk = tabelProduk.getValueAt(n, 3).toString();
            int harga_beli = Integer.parseInt(tabelProduk.getValueAt(n, 4).toString());
            int harga_jual = Integer.parseInt(tabelProduk.getValueAt(n, 5).toString());
            int stok = Integer.parseInt(tabelProduk.getValueAt(n, 6).toString());
            String deskripsi = tabelProduk.getValueAt(n, 7).toString();
            ubahproduk U = new ubahproduk(this, true);
            U.setId(id); 
            U.setNama_produk(nama_product);
            U.setKode_produk(kode_produk);
            U.setHarga_beli(harga_beli);
            U.setHarga_jual(harga_jual); 
            U.setStok(stok);
            U.setDeskripsi(deskripsi);
            U.setVisible(true); 
            
        }else {
            JOptionPane.showMessageDialog(this, "Anda belum memilih produk");
        }
    

         // TODO add your handling code here:
    }//GEN-LAST:event_tblubahprodukActionPerformed

    private void tblhapusprodukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblhapusprodukActionPerformed
 int n = tabelProduk.getSelectedRow();
        if(n != -1){
            int id = Integer.parseInt(tabelProduk.getValueAt(n, 1).toString());
            System.out.println(id);
            String fullname = tabelProduk.getValueAt(n, 2).toString();

            int opsi = JOptionPane.showConfirmDialog(this, 
                    "Apakah Anda yakin ingin menghapus data "+fullname+"?", 
                    "Hapus Data", 
                    JOptionPane.YES_NO_OPTION);
            if(opsi == 0){
                String Q = "DELETE FROM produk "
                        + "WHERE id_produk="+id;
                System.out.println(Q);
                try {
                    java.sql.Connection K = connect.konek();
                    Statement S = K.createStatement();
                    S.executeUpdate(Q);
                    viewData(""); 
                    JOptionPane.showMessageDialog(this, "Data "+fullname+" telah terhapus");
                } catch (SQLException e) {
                }
            }
            
        }else {
            JOptionPane.showMessageDialog(this, "Anda belum memilih data");
        }     // TODO add your handling code here:
    }//GEN-LAST:event_tblhapusprodukActionPerformed

    private void tblrefreshprodukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblrefreshprodukActionPerformed
        // TODO add your handling code here:
        viewDataProduk("");
    }//GEN-LAST:event_tblrefreshprodukActionPerformed

    private void pencarianKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pencarianKeyReleased
String key = pencarian.getText();
        String where = "WHERE "
                + "fullname LIKE '%" + key + "%' OR "
                + "username LIKE '%" + key + "%' OR "
                + "password LIKE '%" + key + "%' OR "
                + "role LIKE '%" + key + "%'";
        viewData(where);        // TODO add your handling code here:
    }//GEN-LAST:event_pencarianKeyReleased

    private void pencarianprodukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencarianprodukActionPerformed
        // TODO add your handling code here:
       String key = pencarianproduk.getText().trim();
        if (!key.isEmpty()) {
            viewDataProduk(key);
        }else{
            viewDataProduk("");
        }        // TODO add yo
    }//GEN-LAST:event_pencarianprodukActionPerformed

    private void pencarianprodukKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pencarianprodukKeyReleased
String key = pencarianproduk.getText();
        String where = "WHERE "
                + "nama_produk LIKE '%" + key + "%' OR "
                + "kode_produk LIKE '%" + key + "%' OR "
                + "harga_beli LIKE '%" + key + "%' OR "
                + "harga_jual LIKE '%" + key + "%' OR "
                + "stok LIKE '%" + key + "%' OR "
                + "deskripsi LIKE '%" + key + "%'";
        viewDataProduk(where);        // TODO add your handling code here:
    }//GEN-LAST:event_pencarianprodukKeyReleased

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
            java.util.logging.Logger.getLogger(Profile_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new Profile_admin().setVisible(true);
            }
        });
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_logout;
    private javax.swing.JToggleButton hapususer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelName;
    private javax.swing.JTextField pencarian;
    private javax.swing.JTextField pencarianproduk;
    private javax.swing.JToggleButton refresh;
    private javax.swing.JTable tabelProduk;
    private javax.swing.JTable tabelUser;
    private javax.swing.JToggleButton tambahuser;
    private javax.swing.JToggleButton tblhapusproduk;
    private javax.swing.JToggleButton tblrefreshproduk;
    private javax.swing.JToggleButton tbltambahproduk;
    private javax.swing.JToggleButton tblubahproduk;
    private javax.swing.JToggleButton ubahuser;
    // End of variables declaration//GEN-END:variables
    public static void viewData(String where) {
        try {
           
            for (int i = pr.getRowCount()-1; i >=0; i--) {
                pr.removeRow(i);
            }

            java.sql.Connection K = connect.konek();
            Statement S = K.createStatement();
            String Q = "SELECT * FROM akun " + where;
            ResultSet R = S.executeQuery(Q);
            int no = 1;
            while (R.next()) {
                int id_akun = R.getInt("id_akun");
                String fullname = R.getString("fullname");
                String username = R.getString("username");
                String password = R.getString("password");
                String role = R.getString("role");

                Object[] D = {no, id_akun, fullname, username, password, role};
                pr.addRow(D);

                no++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     
     
    public static void viewDataProduk(String where) {
        try {
            for (int i = dd.getRowCount()-1; i >=0; i--) {
                dd.removeRow(i);
            }
            
            java.sql.Connection K = connect.konek();
            Statement S = K.createStatement();
            String Q = "SELECT * FROM produk " + where;
            ResultSet R = S.executeQuery(Q);


            int no = 1;
            while (R.next()) {
                int id_produk = R.getInt("id_produk");
                String nama_produk = R.getString("nama_produk");
                String kode_produk = R.getString("kode_produk");
                int harga_beli = R.getInt("harga_beli");
                int harga_jual = R.getInt("harga_jual");
                int stok = R.getInt("stok");
                String deskripsi= R.getString("deskripsi");

                Object[] G = {
                    no,id_produk,nama_produk,kode_produk,harga_beli, 
                    harga_jual,stok,deskripsi};
                dd.addRow(G);

                no++;  
            }
        } catch (SQLException e) {
           e.printStackTrace();
        }
    }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
        
//    public static void viewDataProduk(String where) {
//        try {
//            //kode kita
//            for (int i = mod_p.getRowCount()-1; i >=0; i--) {
//                mod_p.removeRow(i);
//            }
            
//             for (int i = 0; i < mod_p.getRowCount(); i++) {
//                mod_p.removeRow(i);
//            }

//            java.sql.Connection K = connect.konek();
//            Statement S = K.createStatement();
//            String Q = "SELECT * FROM produk WHERE "
//                + "id_produk LIKE '%" + where + "%' OR "
//                + "nama_produk LIKE '%" + where + "%' OR "
//                + "harga_beli  LIKE '%" + where + "%' OR "
//                + "harga_jual LIKE '%" + where + "%' OR "
//                + "stok LIKE '%" + where + "%' OR "
//                + "deskripsi LIKE '%" + where + "%'";
//            ResultSet R = S.executeQuery(Q);
//            int no = 1;
//            while (R.next()) {
//                int id_produk = R.getInt("id_produk");
//                String nama_produk = R.getString("nama produk");
//                int harga_beli = R.getInt("harga beli");
//                int harga_jual = R.getInt("harga jual");
//                int stok = R.getInt("stok");
//                String deskripsi= R.getString("deskripsi");
//              
//
//                Object[] G = {
//                    no,id_produk,nama_produk,harga_beli, 
//                    harga_jual,stok,deskripsi};
//                mod_p.addRow(G);
//
//                no++;
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//            //ereror handling
//        }
//    }
     
     
      private void settingTable() {
        pr = (DefaultTableModel) tabelUser.getModel();        
        tabelUser.getColumnModel().getColumn(0).setMinWidth(50);
        tabelUser.getColumnModel().getColumn(0).setMaxWidth(70);

        tabelUser.getColumnModel().getColumn(1).setMinWidth(0);
        tabelUser.getColumnModel().getColumn(1).setMaxWidth(0);

        tabelUser.getColumnModel().getColumn(2).setMinWidth(350);
        tabelUser.getColumnModel().getColumn(2).setMaxWidth(500);
        
        
        dd= (DefaultTableModel) tabelProduk.getModel();        
        tabelProduk.getColumnModel().getColumn(0).setMinWidth(50);
        tabelProduk.getColumnModel().getColumn(0).setMaxWidth(70);

        tabelUser.getColumnModel().getColumn(1).setMinWidth(0);
        tabelUser.getColumnModel().getColumn(1).setMaxWidth(0);

        tabelProduk.getColumnModel().getColumn(2).setMinWidth(350);
        tabelProduk.getColumnModel().getColumn(2).setMaxWidth(500);
      }
      
//       private void settingTableP() {
//
//      }
}


