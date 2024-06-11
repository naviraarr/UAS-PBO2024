package com.bluraystore.gui;

import com.bluraystore.koneksi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class adminpage extends javax.swing.JFrame {

    public adminpage() {
        initComponents();
        loadData();
    }

    private int idDvd;

    private void cls() {
        txtJudul.setText("");
        txtDirektur.setText("");
        txtAktor.setText("");
        txtBahasa.setText("");
        txtSub.setText("");
        txtHarga.setText("");
        btgRating.clearSelection();
        ckAksi.setSelected(false);
        ckKomedi.setSelected(false);
        ckRom.setSelected(false);
        ckDrama.setSelected(false);
    }

    public void loadData() {
        DefaultTableModel model = new DefaultTableModel();
        model.setRowCount(0);
        model.addColumn("ID");
        model.addColumn("Title");
        model.addColumn("Director");
        model.addColumn("Actor");
        model.addColumn("Language");
        model.addColumn("Subtitle");
        model.addColumn("Price");
        model.addColumn("Rating");
        model.addColumn("Genre");
        model.addColumn("Stock");
        readData.setModel(model);

        String query = "SELECT id_dvd, judul, direktur, aktor, bahasa, subtitle, harga, rating, genre, stok FROM store";

        try (Connection conn = koneksi.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                String id_dvd = rs.getString("id_dvd");
                String judul = rs.getString("judul");
                String direktur = rs.getString("direktur");
                String aktor = rs.getString("aktor");
                String bahasa = rs.getString("bahasa");
                String subtitle = rs.getString("subtitle");
                String harga = rs.getString("harga");
                String rating = rs.getString("rating");
                String genre = rs.getString("genre");
                String stok = rs.getString("stok");

                model.addRow(new Object[]{id_dvd, judul, direktur, aktor, bahasa, subtitle, harga, rating, genre, stok});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        txtJudul.setText("");
        txtDirektur.setText("");
        txtAktor.setText("");
        txtBahasa.setText("");
        txtSub.setText("");
        txtHarga.setText("");
        txtStok.setText("");
        btgRating.clearSelection();
        ckAksi.setSelected(false);
        ckKomedi.setSelected(false);
        ckRom.setSelected(false);
        ckDrama.setSelected(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgRating = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtDirektur = new javax.swing.JTextField();
        txtAktor = new javax.swing.JTextField();
        txtBahasa = new javax.swing.JTextField();
        txtSub = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtJudul = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rbPG13 = new javax.swing.JRadioButton();
        rbPG = new javax.swing.JRadioButton();
        rbNC17 = new javax.swing.JRadioButton();
        rbR = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        ckAksi = new javax.swing.JCheckBox();
        ckRom = new javax.swing.JCheckBox();
        ckDrama = new javax.swing.JCheckBox();
        ckKomedi = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        readData = new javax.swing.JTable();
        btnTambah = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtStok = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(113, 202, 213));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(980, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(249, 210, 105));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins ExtraBold", 0, 14)); // NOI18N
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, -1));

        jPanel2.setBackground(new java.awt.Color(113, 202, 213));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDirektur.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtDirektur.setForeground(new java.awt.Color(22, 52, 51));
        txtDirektur.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel2.add(txtDirektur, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 181, -1));

        txtAktor.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtAktor.setForeground(new java.awt.Color(22, 52, 51));
        txtAktor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel2.add(txtAktor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 181, -1));

        txtBahasa.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtBahasa.setForeground(new java.awt.Color(22, 52, 51));
        txtBahasa.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel2.add(txtBahasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 181, -1));

        txtSub.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtSub.setForeground(new java.awt.Color(22, 52, 51));
        txtSub.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel2.add(txtSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 181, -1));

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(22, 52, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Title");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 54, -1));

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(22, 52, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Director");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 61, -1));

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(22, 52, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Actor");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 53, -1));

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(22, 52, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Language");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 70, -1));

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(22, 52, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Subtitle");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 62, -1));

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(22, 52, 51));
        jLabel8.setText("Price");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 62, -1));

        txtJudul.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtJudul.setForeground(new java.awt.Color(22, 52, 51));
        txtJudul.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJudulActionPerformed(evt);
            }
        });
        jPanel2.add(txtJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 181, -1));

        txtHarga.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtHarga.setForeground(new java.awt.Color(22, 52, 51));
        txtHarga.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel2.add(txtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 181, -1));

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(22, 52, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Rating");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 66, 30));

        rbPG13.setBackground(new java.awt.Color(113, 202, 213));
        btgRating.add(rbPG13);
        rbPG13.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        rbPG13.setForeground(new java.awt.Color(22, 52, 51));
        rbPG13.setText("PG-13");
        jPanel2.add(rbPG13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 74, 30));

        rbPG.setBackground(new java.awt.Color(113, 202, 213));
        btgRating.add(rbPG);
        rbPG.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        rbPG.setForeground(new java.awt.Color(22, 52, 51));
        rbPG.setText("PG");
        rbPG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPGActionPerformed(evt);
            }
        });
        jPanel2.add(rbPG, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, 30));

        rbNC17.setBackground(new java.awt.Color(113, 202, 213));
        btgRating.add(rbNC17);
        rbNC17.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        rbNC17.setForeground(new java.awt.Color(22, 52, 51));
        rbNC17.setText("NC-17");
        rbNC17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNC17ActionPerformed(evt);
            }
        });
        jPanel2.add(rbNC17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, -1, 30));

        rbR.setBackground(new java.awt.Color(113, 202, 213));
        btgRating.add(rbR);
        rbR.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        rbR.setForeground(new java.awt.Color(22, 52, 51));
        rbR.setText("R");
        rbR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRActionPerformed(evt);
            }
        });
        jPanel2.add(rbR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 74, 30));

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(22, 52, 51));
        jLabel9.setText("Genre");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 156, 30));

        ckAksi.setBackground(new java.awt.Color(113, 202, 213));
        ckAksi.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        ckAksi.setForeground(new java.awt.Color(22, 52, 51));
        ckAksi.setText("Action");
        ckAksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckAksiActionPerformed(evt);
            }
        });
        jPanel2.add(ckAksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 85, 30));

        ckRom.setBackground(new java.awt.Color(113, 202, 213));
        ckRom.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        ckRom.setForeground(new java.awt.Color(22, 52, 51));
        ckRom.setText("Romance");
        jPanel2.add(ckRom, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 97, 30));

        ckDrama.setBackground(new java.awt.Color(113, 202, 213));
        ckDrama.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        ckDrama.setForeground(new java.awt.Color(22, 52, 51));
        ckDrama.setText("Drama");
        jPanel2.add(ckDrama, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 85, 30));

        ckKomedi.setBackground(new java.awt.Color(113, 202, 213));
        ckKomedi.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        ckKomedi.setForeground(new java.awt.Color(22, 52, 51));
        ckKomedi.setText("Comedy");
        jPanel2.add(ckKomedi, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, 30));

        readData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            }
        ));
        jScrollPane1.setViewportView(readData);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 650, 183));

        btnTambah.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(22, 52, 51));
        btnTambah.setText("ADD");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        jPanel2.add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));

        btnUpdate.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(22, 52, 51));
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 93, -1));

        jButton3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(22, 52, 51));
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 93, -1));

        jButton4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(22, 52, 51));
        jButton4.setText("CANCEL");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 93, -1));

        jLabel10.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(22, 52, 51));
        jLabel10.setText("Stock");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 283, -1, -1));

        txtStok.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtStok.setForeground(new java.awt.Color(22, 52, 51));
        jPanel2.add(txtStok, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 181, -1));

        jButton1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(22, 52, 51));
        jButton1.setText("LOGOUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(835, 400, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 31, 980, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJudulActionPerformed

    private void rbPGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbPGActionPerformed

    private void rbNC17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNC17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbNC17ActionPerformed

    private void rbRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbRActionPerformed

    private void ckAksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckAksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckAksiActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        String judul = txtJudul.getText();
        String direktur = txtDirektur.getText();
        String aktor = txtAktor.getText();
        String bahasa = txtBahasa.getText();
        String subtitle = txtSub.getText();
        String harga = txtHarga.getText();
        String stok = txtStok.getText();
        String rating = "";
        if (rbPG13.isSelected()) {
            rating = "PG-13";
        } else if (rbPG.isSelected()) {
            rating = "PG";
        } else if (rbR.isSelected()) {
            rating = "R";
        } else if (rbNC17.isSelected()) {
            rating = "NC-17";
        }
        StringBuilder genreBuilder = new StringBuilder();
        if (ckAksi.isSelected()) {
            genreBuilder.append("Aksi,");
        }
        if (ckKomedi.isSelected()) {
            genreBuilder.append("Komedi,");
        }
        if (ckRom.isSelected()) {
            genreBuilder.append("Romance,");
        }
        if (ckDrama.isSelected()) {
            genreBuilder.append("Drama,");
        }

        String genre = genreBuilder.toString();

        if (genre.endsWith(",")) {
            genre = genre.substring(0, genre.length() - 1);
        }

        if (judul.isEmpty() || direktur.isEmpty() || aktor.isEmpty() || bahasa.isEmpty() || subtitle.isEmpty() || harga.isEmpty() || !btgRating.getSelection().isSelected() || genre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all columns");
            return;
        }

        String query = "INSERT INTO store (judul, direktur, aktor, bahasa, subtitle, harga, rating, genre, stok) VALUES ('" + judul + "', '" + direktur + "', '" + aktor + "', '" + bahasa + "', '" + subtitle + "', '" + harga + "', '" + rating + "', '" + genre + "', '" + stok + "')";

        try (Connection conn = koneksi.getConnection(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Successfully added DVD.");
            cls();
            loadData();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int selectedRow = readData.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Select the data that will be updated first");
            return;
        }

        String judul = readData.getValueAt(selectedRow, 1).toString();
        String direktur = readData.getValueAt(selectedRow, 2).toString();
        String aktor = readData.getValueAt(selectedRow, 3).toString();
        String bahasa = readData.getValueAt(selectedRow, 4).toString();
        String subtitle = readData.getValueAt(selectedRow, 5).toString();
        String harga = readData.getValueAt(selectedRow, 6).toString();
        String rating = readData.getValueAt(selectedRow, 7).toString();
        String genre = readData.getValueAt(selectedRow, 8).toString();
        String stok = readData.getValueAt(selectedRow, 9).toString();

        txtJudul.setText(judul);
        txtDirektur.setText(direktur);
        txtAktor.setText(aktor);
        txtBahasa.setText(bahasa);
        txtSub.setText(subtitle);
        txtHarga.setText(harga);
        txtStok.setText(stok);

        switch (rating) {
            case "PG-13":
                rbPG13.setSelected(true);
                break;
            case "PG":
                rbPG.setSelected(true);
                break;
            case "R":
                rbR.setSelected(true);
                break;
            case "NC-17":
                rbNC17.setSelected(true);
                break;
        }

        String[] genreArray = genre.split(",");
        ckAksi.setSelected(false);
        ckKomedi.setSelected(false);
        ckRom.setSelected(false);
        ckDrama.setSelected(false);
        for (String g : genreArray) {
            switch (g) {
                case "Aksi":
                    ckAksi.setSelected(true);
                    break;
                case "Komedi":
                    ckKomedi.setSelected(true);
                    break;
                case "Romance":
                    ckRom.setSelected(true);
                    break;
                case "Drama":
                    ckDrama.setSelected(true);
                    break;
            }
        }

        for (ActionListener al : btnUpdate.getActionListeners()) {
            btnUpdate.removeActionListener(al);
        }

        btnUpdate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String judul = txtJudul.getText();
                String direktur = txtDirektur.getText();
                String aktor = txtAktor.getText();
                String bahasa = txtBahasa.getText();
                String subtitle = txtSub.getText();
                String harga = txtHarga.getText();
                String stok = txtStok.getText();
                String rating = "";
                if (rbPG13.isSelected()) {
                    rating = "PG-13";
                } else if (rbPG.isSelected()) {
                    rating = "PG";
                } else if (rbR.isSelected()) {
                    rating = "R";
                } else if (rbNC17.isSelected()) {
                    rating = "NC-17";
                }
                StringBuilder genreBuilder = new StringBuilder();
                if (ckAksi.isSelected()) {
                    genreBuilder.append("Aksi,");
                }
                if (ckKomedi.isSelected()) {
                    genreBuilder.append("Komedi,");
                }
                if (ckRom.isSelected()) {
                    genreBuilder.append("Romance,");
                }
                if (ckDrama.isSelected()) {
                    genreBuilder.append("Drama,");
                }

                String genre = genreBuilder.toString();
                if (genre.endsWith(",")) {
                    genre = genre.substring(0, genre.length() - 1);
                }

                if (judul.isEmpty() || direktur.isEmpty() || aktor.isEmpty() || bahasa.isEmpty() || subtitle.isEmpty() || harga.isEmpty() || !btgRating.getSelection().isSelected() || genre.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill in all columns");
                    return;
                }

                int idDvd = Integer.parseInt(readData.getValueAt(selectedRow, 0).toString());
                String query = "UPDATE store SET judul = ?, direktur = ?, aktor = ?, bahasa = ?, subtitle = ?, harga = ?, rating = ?, genre = ?, stok = ? WHERE id_dvd = ?";

                try (Connection conn = koneksi.getConnection(); PreparedStatement pstmt = conn.prepareStatement(query)) {
                    pstmt.setString(1, judul);
                    pstmt.setString(2, direktur);
                    pstmt.setString(3, aktor);
                    pstmt.setString(4, bahasa);
                    pstmt.setString(5, subtitle);
                    pstmt.setString(6, harga);
                    pstmt.setString(7, rating);
                    pstmt.setString(8, genre);
                    pstmt.setString(9, stok);
                    pstmt.setInt(10, idDvd);

                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Successfully updated the DVD.");
                    cls();
                    loadData();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
                }
            }
        });
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int selectedRow = readData.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Select the data to delete first.");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this data?", "Confirm Erase Data", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            DefaultTableModel model = (DefaultTableModel) readData.getModel();
            idDvd = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());

            String query = "DELETE FROM store WHERE id_dvd=" + idDvd;

            try (Connection conn = koneksi.getConnection(); PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Successfully erased the DVD.");
                cls();
                loadData();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        cls();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        new login().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgRating;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox ckAksi;
    private javax.swing.JCheckBox ckDrama;
    private javax.swing.JCheckBox ckKomedi;
    private javax.swing.JCheckBox ckRom;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbNC17;
    private javax.swing.JRadioButton rbPG;
    private javax.swing.JRadioButton rbPG13;
    private javax.swing.JRadioButton rbR;
    private javax.swing.JTable readData;
    private javax.swing.JTextField txtAktor;
    private javax.swing.JTextField txtBahasa;
    private javax.swing.JTextField txtDirektur;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtStok;
    private javax.swing.JTextField txtSub;
    // End of variables declaration//GEN-END:variables
}
