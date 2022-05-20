-- Adminer 4.8.1 MySQL 5.7.33 dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

CREATE DATABASE `tm12` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `tm12`;

DROP TABLE IF EXISTS `dosen`;
CREATE TABLE `dosen` (
  `nid` varchar(16) COLLATE armscii8_bin NOT NULL,
  `nama_ds` varchar(50) COLLATE armscii8_bin NOT NULL,
  PRIMARY KEY (`nid`)
) ENGINE=InnoDB DEFAULT CHARSET=armscii8 COLLATE=armscii8_bin;

INSERT INTO `dosen` (`nid`, `nama_ds`) VALUES
('01',	'Rudi Hartono');

DROP TABLE IF EXISTS `mahasiswa`;
CREATE TABLE `mahasiswa` (
  `nim` varchar(16) COLLATE armscii8_bin NOT NULL,
  `nama_mh` varchar(50) COLLATE armscii8_bin NOT NULL,
  `kode_mk` varchar(3) COLLATE armscii8_bin NOT NULL,
  `nid_ds` varchar(16) COLLATE armscii8_bin NOT NULL,
  PRIMARY KEY (`nim`)
) ENGINE=InnoDB DEFAULT CHARSET=armscii8 COLLATE=armscii8_bin;


-- 2022-05-20 12:43:07
