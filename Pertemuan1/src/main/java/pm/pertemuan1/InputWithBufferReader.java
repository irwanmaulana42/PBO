/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm.pertemuan1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author PRISMA
 */
public class InputWithBufferReader {

    public void bufferReader() throws IOException {
        String myCampus, myName, joinCampus, nim;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(isr);

        System.out.println("======================================");
        System.out.println("Tampilan input data");
        System.out.print("Masukkan nama Kampus: ");
        myCampus = input.readLine();
        System.out.print("Masukkan nama Anda: ");
        myName = input.readLine();
        System.out.print("Masukkan NIM: ");
        nim = input.readLine();
        System.out.print("Tanggal masuk ke Kampus: ");
        joinCampus = input.readLine();
        System.out.println("======================================");
        System.out.println("Data yang ditampilkan");
        System.out.println("Kampus: " + myCampus);
        System.out.println("Nama: " + myName);
        System.out.println("NIM: " + nim);
        System.out.println("Join Kampus: " + joinCampus);
    }
}
