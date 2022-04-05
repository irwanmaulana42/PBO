-- Adminer 4.8.1 MySQL 5.7.33 dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

CREATE DATABASE `kampus` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `kampus`;

DROP TABLE IF EXISTS `mahasiwa`;
CREATE TABLE `mahasiwa` (
  `nrp` varchar(9) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `angkatan` int(11) NOT NULL,
  `sekolah_asal` text NOT NULL,
  PRIMARY KEY (`nrp`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `mahasiwa` (`nrp`, `nama`, `angkatan`, `sekolah_asal`) VALUES
('110101',	'Irwan M',	2019,	'SMA 96 Jakarta'),
('20166984',	'Irwan M',	2019,	'SMK TELKOM JAKARTA');

-- 2022-04-05 18:49:42
