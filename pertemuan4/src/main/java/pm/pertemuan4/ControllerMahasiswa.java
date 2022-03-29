/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm.pertemuan4;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PRISMA
 */
public class ControllerMahasiswa {

    ArrayList<ModelMahasiswa> listData;
    DefaultTableModel tabelModel;

    public ControllerMahasiswa() {
        listData = new ArrayList<>();
    }

    public void insertData(String nim, String nama, int tinggi, boolean pindahan) {
        ModelMahasiswa mhs = new ModelMahasiswa(nim, nama, tinggi, pindahan);
        listData.add(mhs);
    }

    public DefaultTableModel showData() {
        String[] kolom = {"NIM","Nama","Tinggi","Pindahan"};
        Object[][] objData = new Object[listData.size()][4]; // 3 merupakan jumlah kolom
        System.out.println("SIZE: " + listData.size());
        int i = 0;
        
        for(ModelMahasiswa n : listData){
            String[] arrData = {n.getNim(), n.getNama(), String.valueOf(n.getTinggi()), (n.isPindahan()) ? "Ya" : "Tidak"};
            objData[i] = arrData;
            i++;
        }
        
        tabelModel = new DefaultTableModel(objData,kolom){
            //membuat tabel tidak bisa diedit saat diklik
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        
        return tabelModel;
    }
}
