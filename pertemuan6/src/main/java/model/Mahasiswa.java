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
@Table(name = "mahasiswa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mahasiswa.findAll", query = "SELECT m FROM Mahasiswa m"),
    @NamedQuery(name = "Mahasiswa.findByNrp", query = "SELECT m FROM Mahasiswa m WHERE m.nrp = :nrp"),
    @NamedQuery(name = "Mahasiswa.findByNama", query = "SELECT m FROM Mahasiswa m WHERE m.nama = :nama"),
    @NamedQuery(name = "Mahasiswa.findByAngkatan", query = "SELECT m FROM Mahasiswa m WHERE m.angkatan = :angkatan"),
    @NamedQuery(name = "Mahasiswa.findByKodeFakultas", query = "SELECT m FROM Mahasiswa m WHERE m.kodeFakultas = :kodeFakultas"),
    @NamedQuery(name = "Mahasiswa.findByKodeDosen", query = "SELECT m FROM Mahasiswa m WHERE m.kodeDosen = :kodeDosen")})
public class Mahasiswa implements Serializable {

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
    @Column(name = "kode_fakultas")
    private int kodeFakultas;
    @Basic(optional = false)
    @Column(name = "kode_dosen")
    private int kodeDosen;

    public Mahasiswa() {
    }

    public Mahasiswa(String nrp) {
        this.nrp = nrp;
    }

    public Mahasiswa(String nrp, String nama, int angkatan, int kodeFakultas, int kodeDosen) {
        this.nrp = nrp;
        this.nama = nama;
        this.angkatan = angkatan;
        this.kodeFakultas = kodeFakultas;
        this.kodeDosen = kodeDosen;
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

    public int getKodeFakultas() {
        return kodeFakultas;
    }

    public void setKodeFakultas(int kodeFakultas) {
        this.kodeFakultas = kodeFakultas;
    }

    public int getKodeDosen() {
        return kodeDosen;
    }

    public void setKodeDosen(int kodeDosen) {
        this.kodeDosen = kodeDosen;
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
        if (!(object instanceof Mahasiswa)) {
            return false;
        }
        Mahasiswa other = (Mahasiswa) object;
        if ((this.nrp == null && other.nrp != null) || (this.nrp != null && !this.nrp.equals(other.nrp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Mahasiswa[ nrp=" + nrp + " ]";
    }
    
}
