/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PRISMA
 */
@Entity
@Table(name = "perpustakaan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Perpustakaan.findAll", query = "SELECT p FROM Perpustakaan p"),
    @NamedQuery(name = "Perpustakaan.findByIdBuku", query = "SELECT p FROM Perpustakaan p WHERE p.idBuku = :idBuku"),
    @NamedQuery(name = "Perpustakaan.findByJudul", query = "SELECT p FROM Perpustakaan p WHERE p.judul = :judul"),
    @NamedQuery(name = "Perpustakaan.findByPengarang", query = "SELECT p FROM Perpustakaan p WHERE p.pengarang = :pengarang"),
    @NamedQuery(name = "Perpustakaan.findByIsbn", query = "SELECT p FROM Perpustakaan p WHERE p.isbn = :isbn"),
    @NamedQuery(name = "Perpustakaan.findByTahunTerbit", query = "SELECT p FROM Perpustakaan p WHERE p.tahunTerbit = :tahunTerbit")})
public class Perpustakaan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_buku")
    private Integer idBuku;
    @Basic(optional = false)
    @Column(name = "judul")
    private String judul;
    @Basic(optional = false)
    @Column(name = "pengarang")
    private String pengarang;
    @Basic(optional = false)
    @Column(name = "isbn")
    private String isbn;
    @Basic(optional = false)
    @Column(name = "tahun_terbit")
    @Temporal(TemporalType.DATE)
    private Date tahunTerbit;

    public Perpustakaan() {
    }

    public Perpustakaan(Integer idBuku) {
        this.idBuku = idBuku;
    }

    public Perpustakaan(Integer idBuku, String judul, String pengarang, String isbn, Date tahunTerbit) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.pengarang = pengarang;
        this.isbn = isbn;
        this.tahunTerbit = tahunTerbit;
    }

    public Integer getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(Integer idBuku) {
        this.idBuku = idBuku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(Date tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBuku != null ? idBuku.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Perpustakaan)) {
            return false;
        }
        Perpustakaan other = (Perpustakaan) object;
        if ((this.idBuku == null && other.idBuku != null) || (this.idBuku != null && !this.idBuku.equals(other.idBuku))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Perpustakaan[ idBuku=" + idBuku + " ]";
    }
    
}
