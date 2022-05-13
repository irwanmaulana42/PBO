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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class MahasiswaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression matakuliahidmatakuliahId;
	public final AssociationExpression matakuliahidmatakuliah;
	public final IntegerExpression idmahasiswa;
	public final StringExpression namamahasiswa;
	public final StringExpression kodeMatakuliah;
	
	public MahasiswaDetachedCriteria() {
		super(pertemuan11.Mahasiswa.class, pertemuan11.MahasiswaCriteria.class);
		matakuliahidmatakuliahId = new IntegerExpression("matakuliahidmatakuliah.idmatakuliah", this.getDetachedCriteria());
		matakuliahidmatakuliah = new AssociationExpression("matakuliahidmatakuliah", this.getDetachedCriteria());
		idmahasiswa = new IntegerExpression("idmahasiswa", this.getDetachedCriteria());
		namamahasiswa = new StringExpression("namamahasiswa", this.getDetachedCriteria());
		kodeMatakuliah = new StringExpression("kodeMatakuliah", this.getDetachedCriteria());
	}
	
	public MahasiswaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, pertemuan11.MahasiswaCriteria.class);
		matakuliahidmatakuliahId = new IntegerExpression("matakuliahidmatakuliah.idmatakuliah", this.getDetachedCriteria());
		matakuliahidmatakuliah = new AssociationExpression("matakuliahidmatakuliah", this.getDetachedCriteria());
		idmahasiswa = new IntegerExpression("idmahasiswa", this.getDetachedCriteria());
		namamahasiswa = new StringExpression("namamahasiswa", this.getDetachedCriteria());
		kodeMatakuliah = new StringExpression("kodeMatakuliah", this.getDetachedCriteria());
	}
	
	public MatakuliahDetachedCriteria createMatakuliahidmatakuliahCriteria() {
		return new MatakuliahDetachedCriteria(createCriteria("matakuliahidmatakuliah"));
	}
	
	public Mahasiswa uniqueMahasiswa(PersistentSession session) {
		return (Mahasiswa) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Mahasiswa[] listMahasiswa(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Mahasiswa[]) list.toArray(new Mahasiswa[list.size()]);
	}
}

