/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package pertemuan11;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class Mahasiswa {
	public Mahasiswa() {
	}
	
	public static Mahasiswa loadMahasiswaByORMID(int idmahasiswa) throws PersistentException {
		try {
			PersistentSession session = Pertemuan11PersistentManager.instance().getSession();
			return loadMahasiswaByORMID(session, idmahasiswa);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mahasiswa getMahasiswaByORMID(int idmahasiswa) throws PersistentException {
		try {
			PersistentSession session = Pertemuan11PersistentManager.instance().getSession();
			return getMahasiswaByORMID(session, idmahasiswa);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mahasiswa loadMahasiswaByORMID(int idmahasiswa, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Pertemuan11PersistentManager.instance().getSession();
			return loadMahasiswaByORMID(session, idmahasiswa, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mahasiswa getMahasiswaByORMID(int idmahasiswa, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Pertemuan11PersistentManager.instance().getSession();
			return getMahasiswaByORMID(session, idmahasiswa, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mahasiswa loadMahasiswaByORMID(PersistentSession session, int idmahasiswa) throws PersistentException {
		try {
			return (Mahasiswa) session.load(pertemuan11.Mahasiswa.class, Integer.valueOf(idmahasiswa));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mahasiswa getMahasiswaByORMID(PersistentSession session, int idmahasiswa) throws PersistentException {
		try {
			return (Mahasiswa) session.get(pertemuan11.Mahasiswa.class, Integer.valueOf(idmahasiswa));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mahasiswa loadMahasiswaByORMID(PersistentSession session, int idmahasiswa, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Mahasiswa) session.load(pertemuan11.Mahasiswa.class, Integer.valueOf(idmahasiswa), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mahasiswa getMahasiswaByORMID(PersistentSession session, int idmahasiswa, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Mahasiswa) session.get(pertemuan11.Mahasiswa.class, Integer.valueOf(idmahasiswa), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMahasiswa(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Pertemuan11PersistentManager.instance().getSession();
			return queryMahasiswa(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMahasiswa(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Pertemuan11PersistentManager.instance().getSession();
			return queryMahasiswa(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mahasiswa[] listMahasiswaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Pertemuan11PersistentManager.instance().getSession();
			return listMahasiswaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mahasiswa[] listMahasiswaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Pertemuan11PersistentManager.instance().getSession();
			return listMahasiswaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMahasiswa(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pertemuan11.Mahasiswa as Mahasiswa");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMahasiswa(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pertemuan11.Mahasiswa as Mahasiswa");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Mahasiswa", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mahasiswa[] listMahasiswaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMahasiswa(session, condition, orderBy);
			return (Mahasiswa[]) list.toArray(new Mahasiswa[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mahasiswa[] listMahasiswaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMahasiswa(session, condition, orderBy, lockMode);
			return (Mahasiswa[]) list.toArray(new Mahasiswa[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mahasiswa loadMahasiswaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Pertemuan11PersistentManager.instance().getSession();
			return loadMahasiswaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mahasiswa loadMahasiswaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Pertemuan11PersistentManager.instance().getSession();
			return loadMahasiswaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mahasiswa loadMahasiswaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Mahasiswa[] mahasiswas = listMahasiswaByQuery(session, condition, orderBy);
		if (mahasiswas != null && mahasiswas.length > 0)
			return mahasiswas[0];
		else
			return null;
	}
	
	public static Mahasiswa loadMahasiswaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Mahasiswa[] mahasiswas = listMahasiswaByQuery(session, condition, orderBy, lockMode);
		if (mahasiswas != null && mahasiswas.length > 0)
			return mahasiswas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMahasiswaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Pertemuan11PersistentManager.instance().getSession();
			return iterateMahasiswaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMahasiswaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Pertemuan11PersistentManager.instance().getSession();
			return iterateMahasiswaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMahasiswaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pertemuan11.Mahasiswa as Mahasiswa");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMahasiswaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pertemuan11.Mahasiswa as Mahasiswa");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Mahasiswa", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mahasiswa loadMahasiswaByCriteria(MahasiswaCriteria mahasiswaCriteria) {
		Mahasiswa[] mahasiswas = listMahasiswaByCriteria(mahasiswaCriteria);
		if(mahasiswas == null || mahasiswas.length == 0) {
			return null;
		}
		return mahasiswas[0];
	}
	
	public static Mahasiswa[] listMahasiswaByCriteria(MahasiswaCriteria mahasiswaCriteria) {
		return mahasiswaCriteria.listMahasiswa();
	}
	
	public static Mahasiswa createMahasiswa() {
		return new pertemuan11.Mahasiswa();
	}
	
	public boolean save() throws PersistentException {
		try {
			Pertemuan11PersistentManager.instance().saveObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete() throws PersistentException {
		try {
			Pertemuan11PersistentManager.instance().deleteObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh() throws PersistentException {
		try {
			Pertemuan11PersistentManager.instance().getSession().refresh(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict() throws PersistentException {
		try {
			Pertemuan11PersistentManager.instance().getSession().evict(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			if(getMatakuliahidmatakuliah() != null) {
				getMatakuliahidmatakuliah().mahasiswa.remove(this);
			}
			
			return delete();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(org.orm.PersistentSession session)throws PersistentException {
		try {
			if(getMatakuliahidmatakuliah() != null) {
				getMatakuliahidmatakuliah().mahasiswa.remove(this);
			}
			
			try {
				session.delete(this);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_MAHASISWA_MATAKULIAHIDMATAKULIAH) {
			this.matakuliahidmatakuliah = (pertemuan11.Matakuliah) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private pertemuan11.Matakuliah matakuliahidmatakuliah;
	
	private int idmahasiswa;
	
	private String namamahasiswa;
	
	private String kodeMatakuliah;
	
	private void setIdmahasiswa(int value) {
		this.idmahasiswa = value;
	}
	
	public int getIdmahasiswa() {
		return idmahasiswa;
	}
	
	public int getORMID() {
		return getIdmahasiswa();
	}
	
	public void setNamamahasiswa(String value) {
		this.namamahasiswa = value;
	}
	
	public String getNamamahasiswa() {
		return namamahasiswa;
	}
	
	public void setKodeMatakuliah(String value) {
		this.kodeMatakuliah = value;
	}
	
	public String getKodeMatakuliah() {
		return kodeMatakuliah;
	}
	
	public void setMatakuliahidmatakuliah(pertemuan11.Matakuliah value) {
		if (matakuliahidmatakuliah != null) {
			matakuliahidmatakuliah.mahasiswa.remove(this);
		}
		if (value != null) {
			value.mahasiswa.add(this);
		}
	}
	
	public pertemuan11.Matakuliah getMatakuliahidmatakuliah() {
		return matakuliahidmatakuliah;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Matakuliahidmatakuliah(pertemuan11.Matakuliah value) {
		this.matakuliahidmatakuliah = value;
	}
	
	private pertemuan11.Matakuliah getORM_Matakuliahidmatakuliah() {
		return matakuliahidmatakuliah;
	}
	
	public String toString() {
		return String.valueOf(getIdmahasiswa());
	}
	
}
