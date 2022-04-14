/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PRISMA
 */
@Entity
@Table(name = "fakultas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fakultas.findAll", query = "SELECT f FROM Fakultas f"),
    @NamedQuery(name = "Fakultas.findByKode", query = "SELECT f FROM Fakultas f WHERE f.kode = :kode"),
    @NamedQuery(name = "Fakultas.findByNama", query = "SELECT f FROM Fakultas f WHERE f.nama = :nama")})
public class Fakultas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kode")
    private Integer kode;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;

    public Fakultas() {
    }

    public Fakultas(Integer kode) {
        this.kode = kode;
    }

    public Fakultas(Integer kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    public Integer getKode() {
        return kode;
    }

    public void setKode(Integer kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kode != null ? kode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fakultas)) {
            return false;
        }
        Fakultas other = (Fakultas) object;
        if ((this.kode == null && other.kode != null) || (this.kode != null && !this.kode.equals(other.kode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Fakultas[ kode=" + kode + " ]";
    }
    
}
