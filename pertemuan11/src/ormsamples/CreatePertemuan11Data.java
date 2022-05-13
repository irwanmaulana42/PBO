/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class CreatePertemuan11Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = pertemuan11.Pertemuan11PersistentManager.instance().getSession().beginTransaction();
		try {
			pertemuan11.Mahasiswa lpertemuan11Mahasiswa = pertemuan11.Mahasiswa.createMahasiswa();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : matakuliahidmatakuliah
			lpertemuan11Mahasiswa.save();
			pertemuan11.Matakuliah lpertemuan11Matakuliah = pertemuan11.Matakuliah.createMatakuliah();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : mahasiswa
			lpertemuan11Matakuliah.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreatePertemuan11Data createPertemuan11Data = new CreatePertemuan11Data();
			try {
				createPertemuan11Data.createTestData();
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
