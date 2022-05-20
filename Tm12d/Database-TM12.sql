-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.4.21-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             11.2.0.6213
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for tm12
CREATE DATABASE IF NOT EXISTS `tm12` /*!40100 DEFAULT CHARACTER SET armscii8 COLLATE armscii8_bin */;
USE `tm12`;

-- Dumping structure for table tm12.dosen
CREATE TABLE IF NOT EXISTS `dosen` (
  `nid` varchar(16) COLLATE armscii8_bin NOT NULL,
  `nama_ds` varchar(50) COLLATE armscii8_bin NOT NULL,
  PRIMARY KEY (`nid`)
) ENGINE=InnoDB DEFAULT CHARSET=armscii8 COLLATE=armscii8_bin;

-- Dumping data for table tm12.dosen: ~1 rows (approximately)
/*!40000 ALTER TABLE `dosen` DISABLE KEYS */;
INSERT INTO `dosen` (`nid`, `nama_ds`) VALUES
	('01', 'Rudi Hartono');
/*!40000 ALTER TABLE `dosen` ENABLE KEYS */;

-- Dumping structure for table tm12.mahasiswa
CREATE TABLE IF NOT EXISTS `mahasiswa` (
  `nim` varchar(16) COLLATE armscii8_bin NOT NULL,
  `nama_mh` varchar(50) COLLATE armscii8_bin NOT NULL,
  `kode_mk` varchar(3) COLLATE armscii8_bin NOT NULL,
  PRIMARY KEY (`nim`)
) ENGINE=InnoDB DEFAULT CHARSET=armscii8 COLLATE=armscii8_bin;

-- Dumping data for table tm12.mahasiswa: ~0 rows (approximately)
/*!40000 ALTER TABLE `mahasiswa` DISABLE KEYS */;
INSERT INTO `mahasiswa` (`nim`, `nama_mh`, `kode_mk`) VALUES
	('123456', 'Putra', '01');
/*!40000 ALTER TABLE `mahasiswa` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
