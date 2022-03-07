/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm.pertemuan1;

import java.util.Scanner;

/**
 *
 * @author PRISMA
 */
public class InputWithScanner {

    public void scanner() {
        String myCampus, myName, joinCampus, nim;
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("======================================");
        System.out.println("Tampilan input data");
        System.out.print("Masukkan nama Kampus: ");
        myCampus = input.next();
        System.out.print("Masukkan nama Anda: ");
        myName = input.next();
        System.out.print("Masukkan NIM: ");
        nim = input.next();
        System.out.print("Tanggal masuk ke Kampus: ");
        joinCampus = input.next();
        System.out.println("======================================");
        System.out.println("Data yang ditampilkan");
        System.out.println("Kampus: " + myCampus);
        System.out.println("Nama: " + myName);
        System.out.println("NIM: " + nim);
        System.out.println("Join Kampus: " + joinCampus);
    }
}
