package entityGanjil;
// Generated Jul 2, 2022 10:25:55 AM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * GanjilMahasiswa generated by hbm2java
 */
@Entity
@Table(name="ganjil_mahasiswa"
    ,catalog="ganjil"
)
public class GanjilMahasiswa  implements java.io.Serializable {


     private int nim;
     private String namaMhs;
     private Date tanggalLahir;
     private String mataKuliah;

    public GanjilMahasiswa() {
    }

    public GanjilMahasiswa(int nim, String namaMhs, Date tanggalLahir, String mataKuliah) {
       this.nim = nim;
       this.namaMhs = namaMhs;
       this.tanggalLahir = tanggalLahir;
       this.mataKuliah = mataKuliah;
    }
   
     @Id 

    
    @Column(name="Nim", unique=true, nullable=false)
    public int getNim() {
        return this.nim;
    }
    
    public void setNim(int nim) {
        this.nim = nim;
    }

    
    @Column(name="Nama_mhs", nullable=false, length=40)
    public String getNamaMhs() {
        return this.namaMhs;
    }
    
    public void setNamaMhs(String namaMhs) {
        this.namaMhs = namaMhs;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="Tanggal_lahir", nullable=false, length=10)
    public Date getTanggalLahir() {
        return this.tanggalLahir;
    }
    
    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    
    @Column(name="Mata_kuliah", nullable=false, length=40)
    public String getMataKuliah() {
        return this.mataKuliah;
    }
    
    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }




}


