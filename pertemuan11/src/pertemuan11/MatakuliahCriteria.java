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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class MatakuliahCriteria extends AbstractORMCriteria {
	public final IntegerExpression idmatakuliah;
	public final StringExpression namamatakuliah;
	public final CollectionExpression mahasiswa;
	
	public MatakuliahCriteria(Criteria criteria) {
		super(criteria);
		idmatakuliah = new IntegerExpression("idmatakuliah", this);
		namamatakuliah = new StringExpression("namamatakuliah", this);
		mahasiswa = new CollectionExpression("ORM_Mahasiswa", this);
	}
	
	public MatakuliahCriteria(PersistentSession session) {
		this(session.createCriteria(Matakuliah.class));
	}
	
	public MatakuliahCriteria() throws PersistentException {
		this(Pertemuan11PersistentManager.instance().getSession());
	}
	
	public MahasiswaCriteria createMahasiswaCriteria() {
		return new MahasiswaCriteria(createCriteria("ORM_Mahasiswa"));
	}
	
	public Matakuliah uniqueMatakuliah() {
		return (Matakuliah) super.uniqueResult();
	}
	
	public Matakuliah[] listMatakuliah() {
		java.util.List list = super.list();
		return (Matakuliah[]) list.toArray(new Matakuliah[list.size()]);
	}
}

