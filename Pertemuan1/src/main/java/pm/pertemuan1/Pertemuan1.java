/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm.pertemuan1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PRISMA
 */
public class Pertemuan1 {

    public static void main(String[] args) {
//        Class Scanner
        System.out.println("CLASS SCANNER");
        System.out.println("===================================");
        InputWithScanner withScanner = new InputWithScanner();
        withScanner.scanner();
        System.out.println("===================================");
        
//        Class BufferedReader
        System.out.println("CLASS BUFFERED READER");
        System.out.println("===================================");
        InputWithBufferReader withBuffered = new InputWithBufferReader();
        try {
            withBuffered.bufferReader();
        } catch (IOException ex) {
            System.out.println("Message " + ex);
        }
        System.out.println("===================================");
        
        
//        Class Console
        System.out.println("CLASS CONSOLE");
        System.out.println("===================================");
        InputWithConsole withConsole = new InputWithConsole();
        try {
            withConsole.console();
        } catch (IOException ex) {
            System.out.println("Message " + ex);
        }
        System.out.println("===================================");
    }
}
