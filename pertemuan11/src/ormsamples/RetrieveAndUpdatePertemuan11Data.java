/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdatePertemuan11Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = pertemuan11.Pertemuan11PersistentManager.instance().getSession().beginTransaction();
		try {
			pertemuan11.Mahasiswa lpertemuan11Mahasiswa = pertemuan11.Mahasiswa.loadMahasiswaByQuery(null, null);
			// Update the properties of the persistent object
			lpertemuan11Mahasiswa.save();
			pertemuan11.Matakuliah lpertemuan11Matakuliah = pertemuan11.Matakuliah.loadMatakuliahByQuery(null, null);
			// Update the properties of the persistent object
			lpertemuan11Matakuliah.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Mahasiswa by MahasiswaCriteria");
		pertemuan11.MahasiswaCriteria lpertemuan11MahasiswaCriteria = new pertemuan11.MahasiswaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lpertemuan11MahasiswaCriteria.idmahasiswa.eq();
		System.out.println(lpertemuan11MahasiswaCriteria.uniqueMahasiswa());
		
		System.out.println("Retrieving Matakuliah by MatakuliahCriteria");
		pertemuan11.MatakuliahCriteria lpertemuan11MatakuliahCriteria = new pertemuan11.MatakuliahCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lpertemuan11MatakuliahCriteria.idmatakuliah.eq();
		System.out.println(lpertemuan11MatakuliahCriteria.uniqueMatakuliah());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdatePertemuan11Data retrieveAndUpdatePertemuan11Data = new RetrieveAndUpdatePertemuan11Data();
			try {
				retrieveAndUpdatePertemuan11Data.retrieveAndUpdateTestData();
				//retrieveAndUpdatePertemuan11Data.retrieveByCriteria();
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
