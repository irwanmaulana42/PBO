ALTER TABLE Mahasiswa DROP FOREIGN KEY FKMahasiswa374144;
DROP TABLE IF EXISTS Matakuliah;
DROP TABLE IF EXISTS Mahasiswa;
CREATE TABLE Matakuliah (idmatakuliah int(10) NOT NULL AUTO_INCREMENT, namamatakuliah varchar(50), PRIMARY KEY (idmatakuliah));
CREATE TABLE Mahasiswa (Matakuliahidmatakuliah int(10) NOT NULL, idmahasiswa int(10) NOT NULL AUTO_INCREMENT, namamahasiswa varchar(50), PRIMARY KEY (idmahasiswa));
ALTER TABLE Mahasiswa ADD CONSTRAINT FKMahasiswa374144 FOREIGN KEY (Matakuliahidmatakuliah) REFERENCES Matakuliah (idmatakuliah);
