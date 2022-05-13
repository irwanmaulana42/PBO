-- Adminer 4.8.1 MySQL 5.7.33 dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

CREATE DATABASE `tm9` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `tm9`;

DROP TABLE IF EXISTS `mahasiswa`;
CREATE TABLE `mahasiswa` (
  `Matakuliahidmatakuliah` int(10) NOT NULL,
  `idmahasiswa` int(10) NOT NULL AUTO_INCREMENT,
  `namamahasiswa` varchar(50) DEFAULT NULL,
  `KodeMatakuliah` char(2) DEFAULT NULL,
  PRIMARY KEY (`idmahasiswa`),
  KEY `FKMahasiswa374144` (`Matakuliahidmatakuliah`),
  CONSTRAINT `FKMahasiswa374144` FOREIGN KEY (`Matakuliahidmatakuliah`) REFERENCES `matakuliah` (`idmatakuliah`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `matakuliah`;
CREATE TABLE `matakuliah` (
  `idmatakuliah` int(10) NOT NULL AUTO_INCREMENT,
  `namamatakuliah` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idmatakuliah`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


-- 2022-05-13 12:55:51
