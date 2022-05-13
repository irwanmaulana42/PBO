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

public class MatakuliahDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idmatakuliah;
	public final StringExpression namamatakuliah;
	public final CollectionExpression mahasiswa;
	
	public MatakuliahDetachedCriteria() {
		super(pertemuan11.Matakuliah.class, pertemuan11.MatakuliahCriteria.class);
		idmatakuliah = new IntegerExpression("idmatakuliah", this.getDetachedCriteria());
		namamatakuliah = new StringExpression("namamatakuliah", this.getDetachedCriteria());
		mahasiswa = new CollectionExpression("ORM_Mahasiswa", this.getDetachedCriteria());
	}
	
	public MatakuliahDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, pertemuan11.MatakuliahCriteria.class);
		idmatakuliah = new IntegerExpression("idmatakuliah", this.getDetachedCriteria());
		namamatakuliah = new StringExpression("namamatakuliah", this.getDetachedCriteria());
		mahasiswa = new CollectionExpression("ORM_Mahasiswa", this.getDetachedCriteria());
	}
	
	public MahasiswaDetachedCriteria createMahasiswaCriteria() {
		return new MahasiswaDetachedCriteria(createCriteria("ORM_Mahasiswa"));
	}
	
	public Matakuliah uniqueMatakuliah(PersistentSession session) {
		return (Matakuliah) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Matakuliah[] listMatakuliah(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Matakuliah[]) list.toArray(new Matakuliah[list.size()]);
	}
}

