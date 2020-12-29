-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 29, 2020 at 07:19 PM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `ami`
--

-- --------------------------------------------------------

--
-- Table structure for table `registration`
--

CREATE TABLE IF NOT EXISTS `registration` (
  `no` int(5) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `firstname` varchar(20) NOT NULL,
  `lastname` varchar(20) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `address` varchar(20) NOT NULL,
  `city` varchar(20) NOT NULL,
  `mobile` varchar(20) NOT NULL,
  `email` varchar(20) NOT NULL,
  `eduction` varchar(20) NOT NULL,
  `persantage` varchar(20) NOT NULL,
  `designation` varchar(20) NOT NULL,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=124 ;

--
-- Dumping data for table `registration`
--

INSERT INTO `registration` (`no`, `username`, `password`, `firstname`, `lastname`, `gender`, `address`, `city`, `mobile`, `email`, `eduction`, `persantage`, `designation`) VALUES
(1, 'ami soni', '123', 'ami', 'soni', 'female', 'ahm', 'Ahmedabad', '671122', 'a@g.c', 'MCA', '88', 'ACC'),
(3, 'dhara soni', '789', 'dhara', 'soni', 'Female', 'amd', 'Ahmedabad', '789456123', 'd@g.c', 'MCA', '88', 'ACC'),
(4, 'aryan soni', '123', 'aryan', 'soni', 'male', 'ankur', 'Rajkot', '7894561223', 'as@g.c', 'MCA', '89', 'ACC'),
(123, 'Ami Soni', 'ami', 'ami', 'soni', 'female', 'gujarat', 'Ahmedabad', '12345678', 'ami@gmail.com', 'MCA', '89', 'MAN');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
