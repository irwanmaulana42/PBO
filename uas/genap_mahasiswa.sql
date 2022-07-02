-- Adminer 4.8.1 MySQL 5.7.33 dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

CREATE DATABASE `genap` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `genap`;

DROP TABLE IF EXISTS `genap_mahasiswa`;
CREATE TABLE `genap_mahasiswa` (
  `Nim` bigint(20) NOT NULL,
  `Nama_mhs` varchar(40) NOT NULL,
  `Tanggal_lahir` date NOT NULL,
  `Mata_kuliah` varchar(40) NOT NULL,
  PRIMARY KEY (`Nim`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


-- 2022-07-02 03:54:18
