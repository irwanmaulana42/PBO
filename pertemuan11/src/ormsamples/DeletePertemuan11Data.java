/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class DeletePertemuan11Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = pertemuan11.Pertemuan11PersistentManager.instance().getSession().beginTransaction();
		try {
			pertemuan11.Mahasiswa lpertemuan11Mahasiswa = pertemuan11.Mahasiswa.loadMahasiswaByQuery(null, null);
			lpertemuan11Mahasiswa.delete();
			pertemuan11.Matakuliah lpertemuan11Matakuliah = pertemuan11.Matakuliah.loadMatakuliahByQuery(null, null);
			lpertemuan11Matakuliah.delete();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeletePertemuan11Data deletePertemuan11Data = new DeletePertemuan11Data();
			try {
				deletePertemuan11Data.deleteTestData();
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
