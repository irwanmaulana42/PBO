-- Adminer 4.8.1 MySQL 5.7.33 dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

CREATE DATABASE `universitas` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `universitas`;

DROP TABLE IF EXISTS `dosen`;
CREATE TABLE `dosen` (
  `kode` int(11) NOT NULL,
  `nama` varchar(255) NOT NULL,
  PRIMARY KEY (`kode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `dosen` (`kode`, `nama`) VALUES
(98,	'Giring'),
(99,	'Rocky Gerung');

DROP TABLE IF EXISTS `fakultas`;
CREATE TABLE `fakultas` (
  `kode` int(11) NOT NULL,
  `nama` varchar(255) NOT NULL,
  PRIMARY KEY (`kode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `fakultas` (`kode`, `nama`) VALUES
(12,	'Psikologi'),
(89,	'Teknik Nuklir');

DROP TABLE IF EXISTS `mahasiswa`;
CREATE TABLE `mahasiswa` (
  `nrp` varchar(255) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `angkatan` int(11) NOT NULL,
  `kode_fakultas` int(11) NOT NULL,
  `kode_dosen` int(11) NOT NULL,
  PRIMARY KEY (`nrp`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `mahasiswa` (`nrp`, `nama`, `angkatan`, `kode_fakultas`, `kode_dosen`) VALUES
('123',	'hahahihi',	2019,	12,	99),
('20166984',	'Irwan M',	2019,	89,	98);

-- 2022-04-14 06:33:43
