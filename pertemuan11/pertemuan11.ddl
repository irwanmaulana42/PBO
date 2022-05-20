ALTER TABLE mahasiswa DROP FOREIGN KEY FKMahasiswa374144;
DROP TABLE IF EXISTS mahasiswa;
DROP TABLE IF EXISTS matakuliah;
CREATE TABLE mahasiswa (Matakuliahidmatakuliah int(10) NOT NULL, idmahasiswa int(10) NOT NULL AUTO_INCREMENT, namamahasiswa varchar(50), KodeMatakuliah char(2), PRIMARY KEY (idmahasiswa));
CREATE TABLE matakuliah (idmatakuliah int(10) NOT NULL AUTO_INCREMENT, namamatakuliah varchar(50), PRIMARY KEY (idmatakuliah));
ALTER TABLE mahasiswa ADD CONSTRAINT FKMahasiswa374144 FOREIGN KEY (Matakuliahidmatakuliah) REFERENCES matakuliah (idmatakuliah) ON UPDATE Restrict ON DELETE Restrict;
