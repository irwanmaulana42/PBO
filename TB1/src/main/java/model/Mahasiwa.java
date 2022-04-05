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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PRISMA
 */
@Entity
@Table(name = "mahasiwa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mahasiwa.findAll", query = "SELECT m FROM Mahasiwa m"),
    @NamedQuery(name = "Mahasiwa.findByNrp", query = "SELECT m FROM Mahasiwa m WHERE m.nrp = :nrp"),
    @NamedQuery(name = "Mahasiwa.findByNama", query = "SELECT m FROM Mahasiwa m WHERE m.nama = :nama"),
    @NamedQuery(name = "Mahasiwa.findByAngkatan", query = "SELECT m FROM Mahasiwa m WHERE m.angkatan = :angkatan")})
public class Mahasiwa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nrp")
    private String nrp;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "angkatan")
    private int angkatan;
    @Basic(optional = false)
    @Lob
    @Column(name = "sekolah_asal")
    private String sekolahAsal;

    public Mahasiwa() {
    }

    public Mahasiwa(String nrp) {
        this.nrp = nrp;
    }

    public Mahasiwa(String nrp, String nama, int angkatan, String sekolahAsal) {
        this.nrp = nrp;
        this.nama = nama;
        this.angkatan = angkatan;
        this.sekolahAsal = sekolahAsal;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    public String getSekolahAsal() {
        return sekolahAsal;
    }

    public void setSekolahAsal(String sekolahAsal) {
        this.sekolahAsal = sekolahAsal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nrp != null ? nrp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mahasiwa)) {
            return false;
        }
        Mahasiwa other = (Mahasiwa) object;
        if ((this.nrp == null && other.nrp != null) || (this.nrp != null && !this.nrp.equals(other.nrp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Mahasiwa[ nrp=" + nrp + " ]";
    }
    
}
