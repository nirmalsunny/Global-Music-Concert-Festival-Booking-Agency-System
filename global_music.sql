-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 14, 2019 at 10:16 PM
-- Server version: 5.7.19
-- PHP Version: 7.1.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `global_music`
--

-- --------------------------------------------------------

--
-- Table structure for table `agent_details`
--

DROP TABLE IF EXISTS `agent_details`;
CREATE TABLE IF NOT EXISTS `agent_details` (
  `agent_ID` int(11) NOT NULL,
  `agency_name` varchar(50) DEFAULT NULL,
  `first_name` text,
  `last_name` text,
  `add_line_1` text,
  `add_line_2` text,
  `town` varchar(100) DEFAULT NULL,
  `postcode` varchar(50) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `contact_number` varchar(15) DEFAULT NULL,
  `band_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`agent_ID`),
  KEY `band_ID` (`band_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `band_details`
--

DROP TABLE IF EXISTS `band_details`;
CREATE TABLE IF NOT EXISTS `band_details` (
  `band_ID` int(11) NOT NULL,
  `band_name` text,
  `concert_ID` int(11) DEFAULT NULL,
  `agent_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`band_ID`),
  KEY `band_details` (`agent_ID`),
  KEY `concert_ID` (`concert_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `booking_details`
--

DROP TABLE IF EXISTS `booking_details`;
CREATE TABLE IF NOT EXISTS `booking_details` (
  `booking_ID` int(11) NOT NULL,
  `quantity` int(11) DEFAULT NULL,
  `date_of_booking` text,
  `ticket_type_ID` int(11) DEFAULT NULL,
  `cancellation` tinyint(1) DEFAULT NULL,
  `concert_ID` int(11) DEFAULT NULL,
  `customer_ID` int(11) DEFAULT NULL,
  `agent_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`booking_ID`),
  KEY `agent_ID` (`agent_ID`),
  KEY `concert_ID` (`concert_ID`),
  KEY `customer_ID` (`customer_ID`),
  KEY `ticket_type_ID` (`ticket_type_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `concert_details`
--

DROP TABLE IF EXISTS `concert_details`;
CREATE TABLE IF NOT EXISTS `concert_details` (
  `concert_ID` int(11) NOT NULL,
  `concert_name` varchar(50) DEFAULT NULL,
  `concert_description` varchar(200) DEFAULT NULL,
  `concert_date` date DEFAULT NULL,
  `venue` text,
  `ticket_type_ID` int(11) DEFAULT NULL,
  `band_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`concert_ID`),
  KEY `band_ID` (`band_ID`),
  KEY `concert_details_ibfk_1` (`ticket_type_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `customer_details`
--

DROP TABLE IF EXISTS `customer_details`;
CREATE TABLE IF NOT EXISTS `customer_details` (
  `customer_ID` int(11) NOT NULL,
  `title` varchar(10) DEFAULT NULL,
  `first_name` text,
  `last_name` text,
  `add_line_1` text,
  `add_line_2` text,
  `town` text,
  `postcode` text,
  `email` text,
  `mobile_number` varchar(20) DEFAULT NULL,
  `website` varchar(50) DEFAULT NULL,
  `org_name` varchar(50) DEFAULT NULL,
  `ticket_ID` int(11) DEFAULT NULL,
  `payment_ID` int(11) DEFAULT NULL,
  `user_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`customer_ID`),
  KEY `payment_ID` (`payment_ID`),
  KEY `ticket_ID` (`ticket_ID`),
  KEY `user_ID` (`user_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `login_table`
--

DROP TABLE IF EXISTS `login_table`;
CREATE TABLE IF NOT EXISTS `login_table` (
  `user_ID` int(11) NOT NULL,
  `username` text,
  `password` text,
  `isAdmin` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`user_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
CREATE TABLE IF NOT EXISTS `payment` (
  `payment_ID` int(11) NOT NULL AUTO_INCREMENT,
  `payment_method` text,
  `bank_account_name` text,
  `bank_account_number` text,
  `bank_sort_code` text,
  `customer_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`payment_ID`),
  KEY `customer_ID` (`customer_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `ticket_types`
--

DROP TABLE IF EXISTS `ticket_types`;
CREATE TABLE IF NOT EXISTS `ticket_types` (
  `ticket_type_ID` int(11) NOT NULL AUTO_INCREMENT,
  `ticket_type` text,
  `ticket_price` text,
  `concert_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ticket_type_ID`),
  KEY `concert_ID` (`concert_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ticket_types`
--

INSERT INTO `ticket_types` (`ticket_type_ID`, `ticket_type`, `ticket_price`, `concert_ID`) VALUES
(1, 'elite', '100', NULL);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `agent_details`
--
ALTER TABLE `agent_details`
  ADD CONSTRAINT `agent_details_ibfk_1` FOREIGN KEY (`band_ID`) REFERENCES `band_details` (`band_ID`);

--
-- Constraints for table `band_details`
--
ALTER TABLE `band_details`
  ADD CONSTRAINT `band_details_ibfk_1` FOREIGN KEY (`agent_ID`) REFERENCES `agent_details` (`agent_ID`),
  ADD CONSTRAINT `band_details_ibfk_2` FOREIGN KEY (`concert_ID`) REFERENCES `concert_details` (`concert_ID`);

--
-- Constraints for table `booking_details`
--
ALTER TABLE `booking_details`
  ADD CONSTRAINT `booking_details_ibfk_1` FOREIGN KEY (`agent_ID`) REFERENCES `agent_details` (`agent_ID`),
  ADD CONSTRAINT `booking_details_ibfk_2` FOREIGN KEY (`concert_ID`) REFERENCES `concert_details` (`concert_ID`),
  ADD CONSTRAINT `booking_details_ibfk_3` FOREIGN KEY (`customer_ID`) REFERENCES `customer_details` (`customer_ID`),
  ADD CONSTRAINT `booking_details_ibfk_4` FOREIGN KEY (`ticket_type_ID`) REFERENCES `ticket_types` (`ticket_type_ID`);

--
-- Constraints for table `concert_details`
--
ALTER TABLE `concert_details`
  ADD CONSTRAINT `concert_details_ibfk_1` FOREIGN KEY (`ticket_type_ID`) REFERENCES `ticket_types` (`ticket_type_ID`);

--
-- Constraints for table `customer_details`
--
ALTER TABLE `customer_details`
  ADD CONSTRAINT `customer_details_ibfk_1` FOREIGN KEY (`payment_ID`) REFERENCES `payment` (`payment_ID`),
  ADD CONSTRAINT `customer_details_ibfk_2` FOREIGN KEY (`ticket_ID`) REFERENCES `ticket_types` (`ticket_type_ID`),
  ADD CONSTRAINT `customer_details_ibfk_3` FOREIGN KEY (`user_ID`) REFERENCES `login_table` (`user_ID`);

--
-- Constraints for table `payment`
--
ALTER TABLE `payment`
  ADD CONSTRAINT `payment_ibfk_1` FOREIGN KEY (`customer_ID`) REFERENCES `customer_details` (`customer_ID`);

--
-- Constraints for table `ticket_types`
--
ALTER TABLE `ticket_types`
  ADD CONSTRAINT `ticket_types_ibfk_1` FOREIGN KEY (`concert_ID`) REFERENCES `concert_details` (`concert_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
