/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pm.pertemuan14;

import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import Warna.*;

/**
 *
 * @author PRISMA
 */
public class TampilkanGambar extends javax.swing.JFrame {

    File file;
    File input;
    BufferedImage img;
    private static final int baseSize = 128;
    private static final String basePath = "/images/fimage";

    /**
     * Creates new form TampilkanGambar
     */
    public TampilkanGambar() {
        initComponents();
//        System.out.println("Working Directory = " + System.getProperty("user.dir"));
//        String path = Paths.get("").toAbsolutePath().toString();
//        System.out.println("PATH: " + path);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrayScale = new javax.swing.JButton();
        btnFlip = new javax.swing.JButton();
        btnBrowse = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        showImage = new javax.swing.JLabel();
        btnSepia = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGrayScale.setText("Gray Scale");
        btnGrayScale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrayScaleActionPerformed(evt);
            }
        });

        btnFlip.setText("Flip");
        btnFlip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlipActionPerformed(evt);
            }
        });

        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showImage)
                .addContainerGap(609, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showImage)
                .addContainerGap(408, Short.MAX_VALUE))
        );

        btnSepia.setText("Sepia");
        btnSepia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSepiaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Display Image");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(218, 218, 218))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(btnGrayScale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBrowse)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSepia)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnFlip)))))
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(btnBrowse)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGrayScale)
                    .addComponent(btnSepia)
                    .addComponent(btnFlip))
                .addGap(18, 18, 18)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGrayScaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrayScaleActionPerformed
        // TODO add your handling code here:

        GrayScale gs = new GrayScale(img, file);
        try {
            if (!gs.getPath().isEmpty()) {
                System.out.println("NEW PATH: " + gs.getPath());
                input = new File(gs.getPath());
                img = ImageIO.read(input);
                ImageIcon icon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT));
                showImage.setIcon(icon);
            } // Oops!
            else {
                JOptionPane.showMessageDialog(null,
                        "You must select one image to be the reference.", "Aborting...",
                        JOptionPane.WARNING_MESSAGE);
            }
        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnGrayScaleActionPerformed

    private void btnFlipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlipActionPerformed
        // TODO add your handling code here:
        Flip gs = new Flip(img, file);

        try {
            if (!gs.getPath().isEmpty()) {
                System.out.println("NEW PATH: " + gs.getPath());
                input = new File(gs.getPath());
                img = ImageIO.read(input);
                ImageIcon icon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT));
                showImage.setIcon(icon);
            } // Oops!
            else {
                JOptionPane.showMessageDialog(null,
                        "You must select one image to be the reference.", "Aborting...",
                        JOptionPane.WARNING_MESSAGE);
            }
        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnFlipActionPerformed

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser(basePath);
        int res = fc.showOpenDialog(null);
        try {
            if (res == JFileChooser.APPROVE_OPTION) {
                file = fc.getSelectedFile();
                input = new File(file.toString());
                img = ImageIO.read(input);

                ImageIcon icon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT));
                showImage.setIcon(icon);
            } else {
                JOptionPane.showMessageDialog(null, "You must select one image to be the reference.", "Aborted...", JOptionPane.WARNING_MESSAGE);
            }
        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void btnSepiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSepiaActionPerformed
        // TODO add your handling code here:
        Sepia gs = new Sepia(img, file);

        try {
            if (!gs.getPath().isEmpty()) {
                System.out.println("NEW PATH: " + gs.getPath());
                input = new File(gs.getPath());
                img = ImageIO.read(input);
                ImageIcon icon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT));
                showImage.setIcon(icon);
            } // Oops!
            else {
                JOptionPane.showMessageDialog(null,
                        "You must select one image to be the reference.", "Aborting...",
                        JOptionPane.WARNING_MESSAGE);
            }
        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnSepiaActionPerformed

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
            java.util.logging.Logger.getLogger(TampilkanGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilkanGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilkanGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilkanGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TampilkanGambar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnFlip;
    private javax.swing.JButton btnGrayScale;
    private javax.swing.JButton btnSepia;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel showImage;
    // End of variables declaration//GEN-END:variables
}
