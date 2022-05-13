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

public class Matakuliah {
	public Matakuliah() {
	}
	
	public static Matakuliah loadMatakuliahByORMID(int idmatakuliah) throws PersistentException {
		try {
			PersistentSession session = Pertemuan11PersistentManager.instance().getSession();
			return loadMatakuliahByORMID(session, idmatakuliah);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Matakuliah getMatakuliahByORMID(int idmatakuliah) throws PersistentException {
		try {
			PersistentSession session = Pertemuan11PersistentManager.instance().getSession();
			return getMatakuliahByORMID(session, idmatakuliah);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Matakuliah loadMatakuliahByORMID(int idmatakuliah, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Pertemuan11PersistentManager.instance().getSession();
			return loadMatakuliahByORMID(session, idmatakuliah, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Matakuliah getMatakuliahByORMID(int idmatakuliah, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Pertemuan11PersistentManager.instance().getSession();
			return getMatakuliahByORMID(session, idmatakuliah, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Matakuliah loadMatakuliahByORMID(PersistentSession session, int idmatakuliah) throws PersistentException {
		try {
			return (Matakuliah) session.load(pertemuan11.Matakuliah.class, Integer.valueOf(idmatakuliah));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Matakuliah getMatakuliahByORMID(PersistentSession session, int idmatakuliah) throws PersistentException {
		try {
			return (Matakuliah) session.get(pertemuan11.Matakuliah.class, Integer.valueOf(idmatakuliah));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Matakuliah loadMatakuliahByORMID(PersistentSession session, int idmatakuliah, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Matakuliah) session.load(pertemuan11.Matakuliah.class, Integer.valueOf(idmatakuliah), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Matakuliah getMatakuliahByORMID(PersistentSession session, int idmatakuliah, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Matakuliah) session.get(pertemuan11.Matakuliah.class, Integer.valueOf(idmatakuliah), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMatakuliah(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Pertemuan11PersistentManager.instance().getSession();
			return queryMatakuliah(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMatakuliah(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Pertemuan11PersistentManager.instance().getSession();
			return queryMatakuliah(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Matakuliah[] listMatakuliahByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Pertemuan11PersistentManager.instance().getSession();
			return listMatakuliahByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Matakuliah[] listMatakuliahByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Pertemuan11PersistentManager.instance().getSession();
			return listMatakuliahByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMatakuliah(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pertemuan11.Matakuliah as Matakuliah");
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
	
	public static List queryMatakuliah(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pertemuan11.Matakuliah as Matakuliah");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Matakuliah", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Matakuliah[] listMatakuliahByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMatakuliah(session, condition, orderBy);
			return (Matakuliah[]) list.toArray(new Matakuliah[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Matakuliah[] listMatakuliahByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMatakuliah(session, condition, orderBy, lockMode);
			return (Matakuliah[]) list.toArray(new Matakuliah[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Matakuliah loadMatakuliahByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Pertemuan11PersistentManager.instance().getSession();
			return loadMatakuliahByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Matakuliah loadMatakuliahByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Pertemuan11PersistentManager.instance().getSession();
			return loadMatakuliahByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Matakuliah loadMatakuliahByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Matakuliah[] matakuliahs = listMatakuliahByQuery(session, condition, orderBy);
		if (matakuliahs != null && matakuliahs.length > 0)
			return matakuliahs[0];
		else
			return null;
	}
	
	public static Matakuliah loadMatakuliahByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Matakuliah[] matakuliahs = listMatakuliahByQuery(session, condition, orderBy, lockMode);
		if (matakuliahs != null && matakuliahs.length > 0)
			return matakuliahs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMatakuliahByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Pertemuan11PersistentManager.instance().getSession();
			return iterateMatakuliahByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMatakuliahByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Pertemuan11PersistentManager.instance().getSession();
			return iterateMatakuliahByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMatakuliahByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pertemuan11.Matakuliah as Matakuliah");
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
	
	public static java.util.Iterator iterateMatakuliahByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pertemuan11.Matakuliah as Matakuliah");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Matakuliah", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Matakuliah loadMatakuliahByCriteria(MatakuliahCriteria matakuliahCriteria) {
		Matakuliah[] matakuliahs = listMatakuliahByCriteria(matakuliahCriteria);
		if(matakuliahs == null || matakuliahs.length == 0) {
			return null;
		}
		return matakuliahs[0];
	}
	
	public static Matakuliah[] listMatakuliahByCriteria(MatakuliahCriteria matakuliahCriteria) {
		return matakuliahCriteria.listMatakuliah();
	}
	
	public static Matakuliah createMatakuliah() {
		return new pertemuan11.Matakuliah();
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
			pertemuan11.Mahasiswa[] lMahasiswas = mahasiswa.toArray();
			for(int i = 0; i < lMahasiswas.length; i++) {
				lMahasiswas[i].setMatakuliahidmatakuliah(null);
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
			pertemuan11.Mahasiswa[] lMahasiswas = mahasiswa.toArray();
			for(int i = 0; i < lMahasiswas.length; i++) {
				lMahasiswas[i].setMatakuliahidmatakuliah(null);
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
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_MATAKULIAH_MAHASISWA) {
			return ORM_mahasiswa;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idmatakuliah;
	
	private String namamatakuliah;
	
	private java.util.Set ORM_mahasiswa = new java.util.HashSet();
	
	private void setIdmatakuliah(int value) {
		this.idmatakuliah = value;
	}
	
	public int getIdmatakuliah() {
		return idmatakuliah;
	}
	
	public int getORMID() {
		return getIdmatakuliah();
	}
	
	public void setNamamatakuliah(String value) {
		this.namamatakuliah = value;
	}
	
	public String getNamamatakuliah() {
		return namamatakuliah;
	}
	
	private void setORM_Mahasiswa(java.util.Set value) {
		this.ORM_mahasiswa = value;
	}
	
	private java.util.Set getORM_Mahasiswa() {
		return ORM_mahasiswa;
	}
	
	public final pertemuan11.MahasiswaSetCollection mahasiswa = new pertemuan11.MahasiswaSetCollection(this, _ormAdapter, ORMConstants.KEY_MATAKULIAH_MAHASISWA, ORMConstants.KEY_MAHASISWA_MATAKULIAHIDMATAKULIAH, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdmatakuliah());
	}
	
}
