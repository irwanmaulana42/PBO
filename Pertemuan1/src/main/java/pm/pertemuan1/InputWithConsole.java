/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm.pertemuan1;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author PRISMA
 */
public class InputWithConsole {
    
    public void console() throws IOException {
        String myCampus, myName, joinCampus, nim;

        Console inputc = System.console();
        System.out.println("======================================");
        if (inputc == null) {
            try {
                System.out.println("With Buffered Reader");
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader inputB = new BufferedReader(isr);
                BufferedReader input = inputB;
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
            } catch (IOException ex) {
                System.out.println("Message: " + ex);
            }

        } else {
            System.out.println("With System Console");
            Console input = inputc;
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
}
