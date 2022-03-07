/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm.pertemuan1;

import java.io.IOException;
import java.io.Console;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PRISMA
 */
public class Pertemuan1 {

    public static void main(String[] args) {
//        Class Scanner
//        InputWithScanner withScanner = new InputWithScanner();
//        withScanner.scanner();

//        Class BufferedReader
//        InputWithBufferReader withBuffered = new InputWithBufferReader();
//        try {
//            withBuffered.bufferReader();
//        } catch (IOException ex) {
//            System.out.println("Message " + ex);
//        }
//        Class Console
        InputWithConsole withConsole = new InputWithConsole();
        try {
            withConsole.console();
        } catch (IOException ex) {
            Logger.getLogger(Pertemuan1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
