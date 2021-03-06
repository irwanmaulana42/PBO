/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pm.pertemuan3;

import java.util.regex.Pattern;

/**
 *
 * @author PRISMA
 */
public class Pertemuan3 extends javax.swing.JFrame {
    private int panjang, lebar, tinggi;
    /**
     * Creates new form Pertemuan3
     */
    public Pertemuan3() {
        initComponents();
    }
    
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }
    
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    public int getPanjang() {
        return this.panjang;
    }
    
    public int getLebar() {
        return this.lebar;
    }
    
    public int getTinggi() {
        return this.tinggi;
    }
    
    public int getSum() {
        return (this.getPanjang() * this.getLebar() * this.getTinggi());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textPanjang = new javax.swing.JTextField();
        textTinggi = new javax.swing.JTextField();
        textLebar = new javax.swing.JTextField();
        buttonHitung = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        sumVolume = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Hitung Volume Persegi Panjang");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setText("Tinggi");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setText("Panjang");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setText("Lebar");

        textPanjang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textPanjangKeyReleased(evt);
            }
        });

        textTinggi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textTinggiKeyReleased(evt);
            }
        });

        textLebar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textLebarKeyReleased(evt);
            }
        });

        buttonHitung.setText("Hitung");
        buttonHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHitungActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setText("Hasil Volume");

        sumVolume.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sumVolume.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textTinggi, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textPanjang, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textLebar, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonHitung))
                        .addContainerGap(79, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(sumVolume)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(152, 152, 152))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPanjang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textLebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTinggi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(buttonHitung)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(sumVolume))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHitungActionPerformed
        // TODO add your handling code here:
        System.out.println("CLICK HITUNG: P = " + this.getPanjang() + " ; L =  " + this.getLebar() + " ; T = " + this.getTinggi());
        int sum = this.getSum();
        sumVolume.setText(String.format("%,d", sum));
    }//GEN-LAST:event_buttonHitungActionPerformed

    private void textTinggiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTinggiKeyReleased
        // TODO add your handling code here:
        String inputTinggi = textTinggi.getText();
        System.out.println("Tinggi: " + inputTinggi);
        if(!inputTinggi.isEmpty() && isNumeric(inputTinggi)){
            this.setTinggi(Integer.parseInt(inputTinggi));
        }else{
            if(inputTinggi.isEmpty()){
                textTinggi.setText("");
                this.setTinggi(0);
            }else{
                textTinggi.setText(Integer.toString(this.getTinggi()));
            }
        }
    }//GEN-LAST:event_textTinggiKeyReleased

    private void textLebarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textLebarKeyReleased
        // TODO add your handling code here:
         String inputLebar = textLebar.getText();
        if(!inputLebar.isEmpty() && isNumeric(inputLebar)){
            System.out.println("Lebar: " + inputLebar);
            this.setLebar(Integer.parseInt(inputLebar));   
        }else{
            if(inputLebar.isEmpty()){
                textLebar.setText("");
                this.setLebar(0);
            }else{
                textLebar.setText(Integer.toString(this.getLebar()));   
            }
        }
    }//GEN-LAST:event_textLebarKeyReleased

    private void textPanjangKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPanjangKeyReleased
        // TODO add your handling code here:
        String inputPanjang = textPanjang.getText();
        if(!inputPanjang.isEmpty() && isNumeric(inputPanjang)){
            System.out.println("Panjang: " + inputPanjang);
            this.setPanjang(Integer.parseInt(inputPanjang));
        }else{
            if(inputPanjang.isEmpty()){
                textPanjang.setText("");
                this.setPanjang(0);
            }else{
                textPanjang.setText(Integer.toString(this.getPanjang()));   
            }
        }
    }//GEN-LAST:event_textPanjangKeyReleased
    
    public static boolean isNumeric(String string) {
        // Checks if the provided string
        // is a numeric by applying a regular
        // expression on it.
        String regex = "[0-9]+[\\.]?[0-9]*";
        return Pattern.matches(regex, string);
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
            java.util.logging.Logger.getLogger(Pertemuan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pertemuan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pertemuan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pertemuan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pertemuan3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonHitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel sumVolume;
    private javax.swing.JTextField textLebar;
    private javax.swing.JTextField textPanjang;
    private javax.swing.JTextField textTinggi;
    // End of variables declaration//GEN-END:variables
}
