/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package viewer;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Mahasiwa;
import controller.MahasiwaJpaController;
import controller.exceptions.NonexistentEntityException;
import java.awt.HeadlessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PRISMA
 */
public class ViewMahasiswa extends javax.swing.JFrame {

    EntityManagerFactory objFactory = Persistence.createEntityManagerFactory("pm.tb1_TB1_jar_1.0-SNAPSHOTPU");
    EntityManager manager = objFactory.createEntityManager();
    Mahasiwa record = new Mahasiwa();
    MahasiwaJpaController jpa = new MahasiwaJpaController(objFactory);

    /**
     * Creates new form ViewMahasiswa
     */
    public ViewMahasiswa() {
        initComponents();
        showTables();
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
        jLabel2 = new javax.swing.JLabel();
        textFieldNRP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textFieldNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textFieldAngkatan = new javax.swing.JTextField();
        textFieldSchool = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnInput = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableList = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("DATA MAHASIWA");

        jLabel2.setText("NRP");

        textFieldNRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNRPActionPerformed(evt);
            }
        });

        jLabel3.setText("Nama");

        jLabel4.setText("Angkatan");

        jLabel5.setText("Sekolah SMA asal");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnInput.setText("Input");
        btnInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        tableList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NRP", "Nama", "Angkatan", "Sekolah SMA Asal"
            }
        ));
        tableList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldNama)
                            .addComponent(textFieldAngkatan)
                            .addComponent(textFieldSchool)
                            .addComponent(textFieldNRP, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(btnInput)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnClear)))))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(292, 292, 292))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldNRP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldAngkatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldSchool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnInput)
                    .addComponent(btnUpdate)
                    .addComponent(btnClear))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String nrp = textFieldNRP.getText();
        
        try {
            if(!nrp.isEmpty()){
                jpa.destroy(nrp);
                JOptionPane.showMessageDialog(null, "Data berhasil di hapus");
                resetForm();
                showTables();
            }else{
                JOptionPane.showMessageDialog(null, "Harap pilih data yang ingin di hapus");
            }
        } catch (NonexistentEntityException | HeadlessException ex) {
            Logger.getLogger(ex.getMessage()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputActionPerformed
        // TODO add your handling code here:        
        String nrp = textFieldNRP.getText();
        String nama = textFieldNama.getText();
        int angkatan = Integer.parseInt(textFieldAngkatan.getText());
        String sekolah_asal = textFieldSchool.getText();

        record.setNrp(nrp);
        record.setNama(nama);
        record.setAngkatan(angkatan);
        record.setSekolahAsal(sekolah_asal);

        try {
            jpa.create(record);
            JOptionPane.showMessageDialog(null, "Data berhasil di input");
            resetForm();
            showTables();
        } catch (Exception ex) {
            Logger.getLogger(ex.getMessage()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnInputActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:        
        String nrp = textFieldNRP.getText();
        String nama = textFieldNama.getText();
        int angkatan = Integer.parseInt(textFieldAngkatan.getText());
        String sekolah_asal = textFieldSchool.getText();

        record.setNrp(nrp);
        record.setNama(nama);
        record.setAngkatan(angkatan);
        record.setSekolahAsal(sekolah_asal);

        try {
            jpa.edit(record);
            JOptionPane.showMessageDialog(null, "Data berhasil di update");
            resetForm();
            showTables();
        } catch (Exception ex) {
            Logger.getLogger(ex.getMessage()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        resetForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void textFieldNRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNRPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNRPActionPerformed

    private void tableListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableListMouseClicked
        // TODO add your handling code here:
        int column = 0;
        int row = tableList.getSelectedRow();
        String value = tableList.getModel().getValueAt(row, column).toString();
        System.out.println("SELECTED ROW: " + value);
        Mahasiwa mhs = jpa.findMahasiwa(value);

        btnInput.setEnabled(false);
        textFieldNRP.setEditable(false);
        textFieldNRP.setText(mhs.getNrp());
        textFieldNama.setText(mhs.getNama());
        textFieldAngkatan.setText(Integer.toString(mhs.getAngkatan()));
        textFieldSchool.setText(mhs.getSekolahAsal());
    }//GEN-LAST:event_tableListMouseClicked
    
    private void resetForm(){
        btnInput.setEnabled(true);
        textFieldNRP.setEditable(true);
        textFieldNRP.setText("");
        textFieldNama.setText("");
        textFieldAngkatan.setText("");
        textFieldSchool.setText("");
    }
    
    private void showTables() {
        String[] kolom = {"NRP", "Nama", "Angkatan", "Sekolah SMA Asal"};
        Object[][] objData = new Object[jpa.getMahasiwaCount()][4];
        int i = 0;

        for (Mahasiwa mhs : jpa.findMahasiwaEntities()) {
            String[] arrData = {mhs.getNrp(), mhs.getNama(), String.valueOf(mhs.getAngkatan()), mhs.getSekolahAsal()};
            objData[i] = arrData;
            i++;
        }

        tableList.setModel(new DefaultTableModel(objData, kolom) {
            //membuat tabel tidak bisa diedit saat diklik
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        });
    }

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
            java.util.logging.Logger.getLogger(ViewMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInput;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableList;
    private javax.swing.JTextField textFieldAngkatan;
    private javax.swing.JTextField textFieldNRP;
    private javax.swing.JTextField textFieldNama;
    private javax.swing.JTextField textFieldSchool;
    // End of variables declaration//GEN-END:variables
}