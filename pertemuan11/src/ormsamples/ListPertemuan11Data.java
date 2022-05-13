/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class ListPertemuan11Data {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Mahasiswa...");
		pertemuan11.Mahasiswa[] pertemuan11Mahasiswas = pertemuan11.Mahasiswa.listMahasiswaByQuery(null, null);
		int length = Math.min(pertemuan11Mahasiswas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(pertemuan11Mahasiswas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Matakuliah...");
		pertemuan11.Matakuliah[] pertemuan11Matakuliahs = pertemuan11.Matakuliah.listMatakuliahByQuery(null, null);
		length = Math.min(pertemuan11Matakuliahs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(pertemuan11Matakuliahs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Mahasiswa by Criteria...");
		pertemuan11.MahasiswaCriteria lpertemuan11MahasiswaCriteria = new pertemuan11.MahasiswaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lpertemuan11MahasiswaCriteria.idmahasiswa.eq();
		lpertemuan11MahasiswaCriteria.setMaxResults(ROW_COUNT);
		pertemuan11.Mahasiswa[] pertemuan11Mahasiswas = lpertemuan11MahasiswaCriteria.listMahasiswa();
		int length =pertemuan11Mahasiswas== null ? 0 : Math.min(pertemuan11Mahasiswas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(pertemuan11Mahasiswas[i]);
		}
		System.out.println(length + " Mahasiswa record(s) retrieved."); 
		
		System.out.println("Listing Matakuliah by Criteria...");
		pertemuan11.MatakuliahCriteria lpertemuan11MatakuliahCriteria = new pertemuan11.MatakuliahCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lpertemuan11MatakuliahCriteria.idmatakuliah.eq();
		lpertemuan11MatakuliahCriteria.setMaxResults(ROW_COUNT);
		pertemuan11.Matakuliah[] pertemuan11Matakuliahs = lpertemuan11MatakuliahCriteria.listMatakuliah();
		length =pertemuan11Matakuliahs== null ? 0 : Math.min(pertemuan11Matakuliahs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(pertemuan11Matakuliahs[i]);
		}
		System.out.println(length + " Matakuliah record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListPertemuan11Data listPertemuan11Data = new ListPertemuan11Data();
			try {
				listPertemuan11Data.listTestData();
				//listPertemuan11Data.listByCriteria();
			}
			finally {
				pertemuan11.Pertemuan11PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
