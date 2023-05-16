-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Dec 09, 2022 at 08:19 AM
-- Server version: 5.7.36
-- PHP Version: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sport_game`
--

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE IF NOT EXISTS `login` (
  `User_Name` int(20) NOT NULL,
  `Password` varchar(20) NOT NULL,
  PRIMARY KEY (`Password`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `score`
--

DROP TABLE IF EXISTS `score`;
CREATE TABLE IF NOT EXISTS `score` (
  `e-mail` varchar(50) NOT NULL,
  `score` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `score`
--

INSERT INTO `score` (`e-mail`, `score`) VALUES
('qwe@gmail.com', 150),
('samal@gmail.com', 150),
('Samal@gmail.com', 150),
('Samal@gmail.com', 150),
('zxc@gmail.com', 150),
('Wipun@gmail.com', 120),
('Kasun@gmail.com', 140),
('manul@gmail.com', 150),
('Laki@gmail,com', 130),
('test@gmail.com', 150),
('test@gmail.com', 150),
('user1@gmail.com', 140),
('malith@gmail.com', 110),
('tinuka@gmail.com', 110),
('amila@gmail.com', 110),
('wimuka@gmail.com', 140),
('janaka@gmail.com', 150),
('hiruni@gmail.com', 150),
('vikum@gmail.com', 150),
('sachintha@gmail.com', 150),
('sachin@gmail.com', 140),
('reshan@gmail.com', 140),
('minula@gmail.com', 140),
('yenuka@gmail.com', 130),
('ramitha@gmail.com', 110),
('sublis@gmail.com', 130),
('widura@gmail.com', 140);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `username` varchar(100) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(15) NOT NULL,
  PRIMARY KEY (`email`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`username`, `email`, `password`) VALUES
('tinuka', 'tinuka@gmail.com', 'tinuka'),
('Avishka', 'Avishka@gmail.com', 'aviya'),
('vinod', 'vinod@gmail.com', 'vinod'),
('Kasun', 'Kasun@gmail.com', 'Kasun'),
('manul', 'manul@gmail.com', 'qazwsx'),
('tes', 'test@gmail.com', 'qwe'),
('User1', 'user1@gmail.com', 'user'),
('Malith', 'Malith@gmail.com', 'malith'),
('Asa', 'Asanka@gmail.com', 'Asa'),
('amila', 'amila@gmail.com', 'amila'),
('Wimukthi', 'wimuka@gmail.com', 'wimuka'),
('janaka', 'janaka@gmail.com', 'janaka'),
('imanka', 'imaka@gmail.com', 'imanka'),
('hiruni', 'hiruni@gmail.com', 'hiruni'),
('vikum', 'vikum@gmail.com', 'vikum'),
('Sachintha', 'Sachintha@gmail.com', 'sachiya'),
('sachin', 'sachin@gmail.com', 'sachin'),
('reshan', 'reshan@gmail.com', 'reshan'),
('mali', 'mali@gmail.com', 'mali'),
('minula', 'minula@gmail.com', 'minula'),
('yenuka', 'yenuka@gmail.com', 'yenuka'),
('pasidu', 'pasidu@gmail.com', 'pasindu'),
('ramitha', 'ramitha@gmail.com', 'ramitha'),
('sublis', 'sublis@gmail.com', 'sublis'),
('widura', 'widura@gmail.com', 'widura');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
