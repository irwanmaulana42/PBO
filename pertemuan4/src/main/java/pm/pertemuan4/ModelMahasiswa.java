/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm.pertemuan4;

/**
 *
 * @author PRISMA
 */
public class ModelMahasiswa {
    private String nim;
    private String nama;
    private int tinggi;
    private boolean pindahan;

    public ModelMahasiswa(){
        
    }

    public ModelMahasiswa(String nim, String nama, int tinggi, boolean pindahan){
//        this(nim, nama, tinggi, pindahan);
        this.nim = nim;
        this.nama = nama;
        this.tinggi = tinggi;
        this.pindahan = pindahan;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public boolean isPindahan() {
        return pindahan;
    }

    public void setPindahan(boolean pindahan) {
        this.pindahan = pindahan;
    }
}
