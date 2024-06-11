package com.bluraystore.gui;

import com.bluraystore.koneksi;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class cashier extends javax.swing.JFrame {

    public cashier() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgPay = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnTotal = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        rbCash = new javax.swing.JRadioButton();
        rbCard = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        btnPay = new javax.swing.JButton();
        rbWallet = new javax.swing.JRadioButton();
        cbType = new javax.swing.JComboBox<>();
        txtPrice = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        txtPay = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(22, 52, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins ExtraBold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 30));

        jPanel2.setBackground(new java.awt.Color(249, 210, 105));

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(19, 118, 130));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BLURAYFLIX");

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel3.setText("DVD Type");

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Purchase Amount");

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel5.setText("Price");

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        btnTotal.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnTotal.setText("TOTAL");
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel7.setText("Total Payment");

        rbCash.setBackground(new java.awt.Color(249, 210, 105));
        btgPay.add(rbCash);
        rbCash.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        rbCash.setText("Cash");

        rbCard.setBackground(new java.awt.Color(249, 210, 105));
        btgPay.add(rbCard);
        rbCard.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        rbCard.setText("Card");

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel9.setText("Payment Method");

        btnPay.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnPay.setText("PAY");
        btnPay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPayMouseClicked(evt);
            }
        });

        rbWallet.setBackground(new java.awt.Color(249, 210, 105));
        btgPay.add(rbWallet);
        rbWallet.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        rbWallet.setText("E-Wallet");

        cbType.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        cbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Film", "Series", "Soundtrack" }));

        txtPrice.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        txtAmount.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        txtPay.setEditable(false);
        txtPay.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        btnCancel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel8.setText("ID DVD");

        txtId.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(466, 466, 466)
                .addComponent(jLabel6))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnCancel))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(75, 75, 75)
                        .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(108, 108, 108)
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rbCash)
                                .addGap(18, 18, 18)
                                .addComponent(rbCard)
                                .addGap(18, 18, 18)
                                .addComponent(rbWallet))
                            .addComponent(txtPay, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(7, 7, 7)
                .addComponent(jLabel6)
                .addGap(16, 16, 16)
                .addComponent(btnTotal)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCard)
                    .addComponent(rbCash)
                    .addComponent(rbWallet)
                    .addComponent(jLabel9))
                .addGap(19, 19, 19)
                .addComponent(btnPay)
                .addGap(9, 9, 9)
                .addComponent(btnCancel))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 600, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
        try {
            int harga = Integer.parseInt(txtPrice.getText());
            int jumlah = Integer.parseInt(txtAmount.getText());

            int total = harga * jumlah;

            txtPay.setText(String.valueOf(total));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Input must be a number.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnTotalActionPerformed

    private void btnPayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPayMouseClicked
        txtIdActionPerformed(null);
        dispose();
    }//GEN-LAST:event_btnPayMouseClicked

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        try {
            int harga = Integer.parseInt(txtPrice.getText());
            int jumlah = Integer.parseInt(txtAmount.getText());
            int total = Integer.parseInt(txtPay.getText());
            String metode = "";
            if (rbCash.isSelected()) {
                metode = "Cash";
            } else if (rbCard.isSelected()) {
                metode = "Card";
            } else if (rbWallet.isSelected()) {
                metode = "E-Wallet";
            }
            int idDvd = Integer.parseInt(txtId.getText());

            String sql = "UPDATE store SET stok = stok - '" + jumlah + "' WHERE id_dvd = '" + idDvd + "'";

            try (java.sql.Connection conn = koneksi.getConnection(); java.sql.PreparedStatement pstmt = conn.prepareStatement(sql)) {
                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    new invoice(harga, jumlah, total, metode).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "There is no DVD with that ID.");
                    this.dispose();
                    new cashier().setVisible(true);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            ex.printStackTrace();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error: ID must be a number.");
        }
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();
        new login().setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cashier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgPay;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnTotal;
    public javax.swing.JComboBox<String> cbType;
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
    public javax.swing.JRadioButton rbCard;
    public javax.swing.JRadioButton rbCash;
    public javax.swing.JRadioButton rbWallet;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtId;
    public javax.swing.JTextField txtPay;
    public javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
