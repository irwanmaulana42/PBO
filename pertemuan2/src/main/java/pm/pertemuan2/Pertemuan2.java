/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package pm.pertemuan2;

import javax.swing.*;

/**
 *
 * @author PRISMA
 */
public class Pertemuan2 {
    Float panjang, lebar;

    public static void main(String[] args) {
        Pertemuan2 pm2 = new Pertemuan2();
        pm2.display();
    }

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    public float getPanjang() {
        return this.panjang;
    }

    public float getLebar() {
        return this.lebar;
    }

    public void sum() {
        Float sum = (this.getPanjang() * this.getLebar());
        JOptionPane.showMessageDialog(null, ""
                + "LUAS PERSEGI PANJANG"
                + "\nPanjang: " + this.getPanjang()
                + "\n Lebar: " + this.getLebar()
                + "\n Rumus: panjang x lebar "
                + "\n Hasil: "
                + this.getPanjang() + " x " + this.getLebar() + " = " + sum);
    }

    public void display() {
//        JOptionPane.showInputDialog(null, "Masukkan Panjang");
        Float insertPanjang = Float.parseFloat(JOptionPane.showInputDialog(null, "Masukkan Panjang: "));
        Float insertLebar = Float.parseFloat(JOptionPane.showInputDialog(null, "Masukkan Lebar: "));
        this.setPanjang(insertPanjang);
        this.setLebar(insertLebar);
        this.sum();
    }

}
