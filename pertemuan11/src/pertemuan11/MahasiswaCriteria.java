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

public class MahasiswaCriteria extends AbstractORMCriteria {
	public final IntegerExpression matakuliahidmatakuliahId;
	public final AssociationExpression matakuliahidmatakuliah;
	public final IntegerExpression idmahasiswa;
	public final StringExpression namamahasiswa;
	public final StringExpression kodeMatakuliah;
	
	public MahasiswaCriteria(Criteria criteria) {
		super(criteria);
		matakuliahidmatakuliahId = new IntegerExpression("matakuliahidmatakuliah.idmatakuliah", this);
		matakuliahidmatakuliah = new AssociationExpression("matakuliahidmatakuliah", this);
		idmahasiswa = new IntegerExpression("idmahasiswa", this);
		namamahasiswa = new StringExpression("namamahasiswa", this);
		kodeMatakuliah = new StringExpression("kodeMatakuliah", this);
	}
	
	public MahasiswaCriteria(PersistentSession session) {
		this(session.createCriteria(Mahasiswa.class));
	}
	
	public MahasiswaCriteria() throws PersistentException {
		this(Pertemuan11PersistentManager.instance().getSession());
	}
	
	public MatakuliahCriteria createMatakuliahidmatakuliahCriteria() {
		return new MatakuliahCriteria(createCriteria("matakuliahidmatakuliah"));
	}
	
	public Mahasiswa uniqueMahasiswa() {
		return (Mahasiswa) super.uniqueResult();
	}
	
	public Mahasiswa[] listMahasiswa() {
		java.util.List list = super.list();
		return (Mahasiswa[]) list.toArray(new Mahasiswa[list.size()]);
	}
}

