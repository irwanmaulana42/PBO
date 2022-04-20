/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewer;

import controller.PerpustakaanJpaController;
import controller.exceptions.NonexistentEntityException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Perpustakaan;

/**
 *
 * @author Rudi Hartono
 */
public class viewBuku {

    /**
     * @param args the command line arguments
     */
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    static EntityManagerFactory objFactory = Persistence.createEntityManagerFactory("Tm7aPU");
    static PerpustakaanJpaController jpa = new PerpustakaanJpaController(objFactory);
    static Perpustakaan perpus = new Perpustakaan();
    static DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {
            showMenu();
        }
    }

    static void showMenu() {
        System.out.println("\n========= MENU UTAMA =========");
        System.out.println("1. Insert Data");
        System.out.println("2. Show Data");
        System.out.println("3. Edit Data");
        System.out.println("4. Delete Data");
        System.out.println("0. Keluar");
        System.out.println("");
        System.out.print("PILIHAN> ");

        try {
            int pilihan = Integer.parseInt(input.readLine());

            switch (pilihan) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    insertBuku();
                    break;
                case 2:
                    showData();
                    break;
                case 3:
                    updateBuku();
                    break;
                case 4:
                    deleteBuku();
                    break;
                default:
                    System.out.println("Pilihan salah!");
            }
        } catch (IOException | NumberFormatException e) {
        }
    }

    static void insertBuku() {
        try {
            System.out.print("Judul: ");
            String judul = input.readLine().trim();
            System.out.print("Pengarang: ");
            String pengarang = input.readLine().trim();
            System.out.print("ISBN: ");
            String isbn = input.readLine().trim();
            System.out.print("Tahun Terbit: ");
            Date tahunTerbit = formatter.parse(input.readLine().trim());
            perpus.setJudul(judul);
            perpus.setPengarang(pengarang);
            perpus.setIsbn(isbn);
            perpus.setTahunTerbit(tahunTerbit);
            jpa.create(perpus);
            System.out.print("Data berhasil di insert !");
        } catch (IOException | ParseException e) {
            Logger.getLogger(viewBuku.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    static void showData() {
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("%5s %10s %13s %10s %20s", "ID BUKU", "JUDUL", "PENGARANG", "ISBN", "TAHUN TERBIT");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------");
        for (Perpustakaan data : jpa.findPerpustakaanEntities()) {
            System.out.format("%5s %12s %10s %13s %20s",
                    data.getIdBuku(),
                    data.getJudul(),
                    data.getPengarang(),
                    data.getIsbn(),
                    formatter.format(data.getTahunTerbit())
            );
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------------------------------------");
    }

    static void updateBuku() {
        try {
            System.out.print("Id Buku: ");
            int id_buku = Integer.parseInt(input.readLine().trim());
            System.out.print("Judul: ");
            String judul = input.readLine().trim();
            System.out.print("Pengarang: ");
            String pengarang = input.readLine().trim();
            System.out.print("ISBN: ");
            String isbn = input.readLine().trim();
            System.out.print("Tahun Terbit: ");
            Date tahunTerbit = formatter.parse(input.readLine().trim());

            perpus.setIdBuku(id_buku);
            perpus.setJudul(judul);
            perpus.setPengarang(pengarang);
            perpus.setIsbn(isbn);
            perpus.setTahunTerbit(tahunTerbit);
            jpa.edit(perpus);
            System.out.print("Data berhasil di edit !");
        } catch (ParseException e) {
            Logger.getLogger(viewBuku.class.getName()).log(Level.SEVERE, null, e);
        } catch (Exception ex) {
            Logger.getLogger(viewBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static void deleteBuku() {
        try {
            System.out.print("Id Buku: ");
            int id_buku = Integer.parseInt(input.readLine().trim());
            jpa.findPerpustakaan(id_buku);
            jpa.destroy(id_buku);
            System.out.print("Data berhasil di hapus !");
        } catch (NullPointerException | IOException | NonexistentEntityException ex) {
            System.out.println("Data tidak ditemukan ☹");
            deleteBuku();
        }
    }
}
