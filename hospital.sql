-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 19, 2020 at 11:05 AM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 7.2.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospital`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `count` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`count`, `username`, `password`) VALUES
(1, 'Martin', 'martin12'),
(2, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `billing`
--

CREATE TABLE `billing` (
  `Bill_No` int(25) NOT NULL,
  `Date` varchar(25) NOT NULL,
  `Admission_Date` varchar(25) NOT NULL,
  `Discharge_Date` varchar(25) NOT NULL,
  `Patient_ID` varchar(25) NOT NULL,
  `Name` tinytext NOT NULL,
  `P_Address` varchar(100) NOT NULL,
  `P_Age` int(15) NOT NULL,
  `P_RoomType` varchar(50) NOT NULL,
  `BirthDate` varchar(50) NOT NULL,
  `Doctor_Name` varchar(40) NOT NULL,
  `Discount` varchar(15) NOT NULL,
  `Gender` varchar(25) NOT NULL,
  `Patient_Type` varchar(25) NOT NULL,
  `Room_Charges` int(25) NOT NULL,
  `Doctors_Fee` int(25) NOT NULL,
  `Lab_Fee` int(25) NOT NULL,
  `Miscellanous` int(25) NOT NULL,
  `Test_Fee` int(25) NOT NULL,
  `PhilHealth_ID` varchar(25) NOT NULL,
  `PhilHealth_Deduct` int(25) NOT NULL,
  `Total` decimal(15,2) NOT NULL,
  `subtotal` decimal(15,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `billing`
--

INSERT INTO `billing` (`Bill_No`, `Date`, `Admission_Date`, `Discharge_Date`, `Patient_ID`, `Name`, `P_Address`, `P_Age`, `P_RoomType`, `BirthDate`, `Doctor_Name`, `Discount`, `Gender`, `Patient_Type`, `Room_Charges`, `Doctors_Fee`, `Lab_Fee`, `Miscellanous`, `Test_Fee`, `PhilHealth_ID`, `PhilHealth_Deduct`, `Total`, `subtotal`) VALUES
(1, '2020-03-09', '2019-12-28', '2020-03-09', 'PID2812192', 'Joshua Tirona', '101 Jones St. Kalalake, Olongapo City, Zambales', 52, 'Single Deluxe Room', 'July 5 1911', 'James Henry Cruz', '20%', '52', 'In Patient', 2500, 5000, 2500, 2500, 2500, '00-000000000-0', 0, '12000.00', '15000.00'),
(2, '2020-03-12', '2020-03-12', '2020-03-12', 'PID0903205', 'Steven Paul', '22 Kessing St, New Kalalake, Olongapo City, Zambales', 23, 'Intensive Care Unit (ICU)', 'May 5 1994', 'Sarah Dee Greed', '0', '23', 'In Patient', 2500, 6000, 300, 3000, 3000, '00-000000000-0', 0, '14800.00', '14800.00'),
(3, '2020-03-15', '2020-03-15', '2020-03-15', 'PID0903205', 'Steven Paul', '22 Kessing St, New Kalalake, Olongapo City, Zambales', 23, 'Intensive Care Unit (ICU)', 'May 5 1994', 'James Henry Cruz', '20%', '23', 'In Patient', 25000, 5000, 500, 2500, 5000, '00-000000000-0', 0, '30400.00', '38000.00'),
(6, '2020-03-10', '2020-03-09', '2020-03-10', 'PID0903204', 'Vanessa Pelaez', '103 Irving St East Tapinac, Olongapo City, Zambales', 20, 'None', 'January 5 1910', 'Kyrie Lee Irving', '0', '20', 'Out Patient', 2500, 3500, 2500, 2500, 2500, '12-164595698-1', 5000, '8500.00', '13500.00'),
(7, '2020-03-10', '2020-02-21', '2020-03-10', 'PID2102203', 'Gerald Pagsuyoin', '98 Fendler st, East Tapinac, Olongapo City, Zambales', 25, 'Single Deluxe Room', 'January 12 2018', 'Kyrie Lee Irving', '0', '25', 'In Patient', 2500, 3500, 1500, 3000, 1500, '25-243734916-1', 5000, '7000.00', '12000.00'),
(8, '2020-03-12', '2019-12-28', '2020-03-12', 'PID2812191', 'Albert Barrera', '102 Irving St. Kalalake, Olongapo City, Zambales', 20, 'Single Deluxe Room', 'April 16 1998', 'Kyrie Lee Irving', '0', '20', 'In Patient', 1, 3500, 1, 1, 1, '2343535353', 0, '3504.00', '3504.00'),
(9, '2020-03-12', '2019-12-28', '2020-03-12', 'PID2812192', 'Joshua Tirona', '101 Jones St. Kalalake, Olongapo City, Zambales', 52, 'Single Deluxe Room', 'July 5 1911', 'Kyrie Lee Irving', '20%', '52', 'In Patient', 1, 3500, 1, 1, 1, '12312312312312', 4, '2799.20', '3504.00'),
(10, '2020-03-13', '2019-12-28', '2020-03-13', 'PID2812192', 'Joshua Tirona', '101 Jones St. Kalalake, Olongapo City, Zambales', 52, 'Single Deluxe Room', 'July 5 1911', 'Sarah Dee Greed', '0', '52', 'In Patient', 100, 6000, 200, 100, 300, '22-0163763-21', 400, '6300.00', '6700.00'),
(11, '2020-04-12', '2020-04-12', '2020-04-12', 'PID1204206', 'Jane Kathleen', '12 Ohio Upper Kalaklan, Olongapo City, Zambales', 20, 'VIP Suite', 'April 4 1999', 'James Henry Cruz', '0', '20', 'In Patient', 10, 5000, 10, 10, 10, '00-000000000-0', 0, '5040.00', '5040.00'),
(12, '2020-04-12', '2020-03-09', '2020-04-12', 'PID0903204', 'Vanessa Pelaez', '103 Irving St East Tapinac, Olongapo City, Zambales', 20, 'None', 'January 5 1910', 'Kyrie Lee Irving', '0', '20', 'Out Patient', 11, 3500, 11, 11, 11, '00-000000000-0', 0, '3544.00', '3544.00'),
(13, '2020-05-06', '2020-05-06', '2020-05-06', 'PID1204206', 'Jane Kathleen', '123, oc, oc', 20, 'Single Deluxe Room', 'April 4 1999', 'Kyrie Lee Irving', '0', '20', 'In Patient', 100, 3500, 100, 100, 100, '00-000000000-0', 0, '3900.00', '3900.00');

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `Doctor_ID` int(25) NOT NULL,
  `Date` varchar(10) NOT NULL,
  `FName` text NOT NULL,
  `MName` text NOT NULL,
  `LName` text NOT NULL,
  `BMonth` text NOT NULL,
  `BDay` int(25) NOT NULL,
  `BYear` int(25) NOT NULL,
  `gender` varchar(8) NOT NULL,
  `blood` varchar(4) NOT NULL,
  `dept` varchar(20) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `Prof_Fee` int(25) NOT NULL,
  `St_Address` varchar(50) NOT NULL,
  `C_Address` varchar(50) NOT NULL,
  `Pr_Address` varchar(50) NOT NULL,
  `email` varchar(30) NOT NULL,
  `status` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`Doctor_ID`, `Date`, `FName`, `MName`, `LName`, `BMonth`, `BDay`, `BYear`, `gender`, `blood`, `dept`, `phone`, `Prof_Fee`, `St_Address`, `C_Address`, `Pr_Address`, `email`, `status`) VALUES
(201901, '2019-11-30', 'Kyrie', 'Lee', 'Irving', 'May', 4, 1909, 'Male', 'A', 'Gynaecology', '+631231231232', 3500, '99 irving street, Kalalake', 'Olongapo City', 'Zambales', 'kyrie@yahoo.com', 'Married'),
(201902, '2020-03-09', 'James', 'Henry', 'Cruz', 'January', 5, 1999, 'Male', 'B', 'Cardiology', '+639694679', 5000, '99 Hansen St, East Tapinac', 'Olongapo City', 'Zambales', 'jameshenry@gmail.com', 'Single'),
(201903, '2020-03-09', 'Sarah', 'Dee', 'Greed', 'April', 1, 1999, 'Female', 'O', 'Neurology', '+6394954978', 6000, '53 Murphy St, New Kalalake', 'Olongapo City', 'Zambales', 'jane@gmail.com', 'Single');

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `Count` int(25) NOT NULL,
  `Patient_ID` varchar(50) NOT NULL,
  `date` varchar(25) NOT NULL,
  `FName` char(30) NOT NULL,
  `LName` text NOT NULL,
  `BMonth` varchar(50) NOT NULL,
  `BDay` int(25) NOT NULL,
  `BYear` int(25) NOT NULL,
  `age` int(15) NOT NULL,
  `Patient_Type` varchar(35) NOT NULL,
  `blood` varchar(25) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `St_Address` varchar(50) NOT NULL,
  `C_Address` varchar(50) NOT NULL,
  `Pr_Address` varchar(50) NOT NULL,
  `phone` int(20) NOT NULL,
  `Patient_Case` varchar(20) NOT NULL,
  `room` varchar(15) NOT NULL,
  `Room_Type` varchar(25) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`Count`, `Patient_ID`, `date`, `FName`, `LName`, `BMonth`, `BDay`, `BYear`, `age`, `Patient_Type`, `blood`, `gender`, `St_Address`, `C_Address`, `Pr_Address`, `phone`, `Patient_Case`, `room`, `Room_Type`) VALUES
(8, 'PID2812192', '2019-12-28', 'Joshua', 'Tirona', 'July', 5, 1911, 52, 'In Patient', 'O', 'Male', '101 Jones St. Kalalake', 'Olongapo City', 'Zambales', 632435365, 'Injury', '04', 'Single Deluxe Room'),
(7, 'PID2812191', '2019-12-28', 'Albert', 'Barrera', 'April', 16, 1998, 20, 'In Patient', 'B', 'Male', '102 Irving St. Kalalake', 'Olongapo City', 'Zambales', 63246575, 'Injury', '05', 'Single Deluxe Room'),
(9, 'PID2102203', '2020-02-21', 'Gerald', 'Pagsuyoin', 'January', 12, 2018, 25, 'In Patient', 'B', 'Male', '98 Fendler st, East Tapinac', 'Olongapo City', 'Zambales', 638686868, 'Fever', '04', 'Single Deluxe Room'),
(11, 'PID0903204', '2020-03-09', 'Vanessa', 'Pelaez', 'January', 5, 1910, 20, 'Out Patient', 'B', 'Female', '103 Irving St East Tapinac', 'Olongapo City', 'Zambales', 63959595, 'Fever', '03', 'None'),
(12, 'PID0903205', '2020-03-09', 'Steven', 'Paul', 'May', 5, 1994, 23, 'In Patient', 'B', 'Male', '22 Kessing St, New Kalalake', 'Olongapo City', 'Zambales', 639959595, 'Pneumonia', '04', 'Intensive Care Unit (ICU)'),
(13, 'PID1204206', '2020-04-12', 'Jane', 'Kathleen', 'April', 4, 1999, 20, 'In Patient', 'B', 'Female', '12 Ohio Upper Kalaklan', 'Olongapo City', 'Zambales', 1214124141, 'X-ray', '01', 'VIP Suite'),
(14, 'PID1204206', '2020-05-06', 'Jane', 'Kathleen', 'April', 4, 1999, 20, 'In Patient', 'B', 'Female', '123', 'oc', 'oc', 63920710, 'xray', '01', 'Single Deluxe Room');

-- --------------------------------------------------------

--
-- Table structure for table `receptionist`
--

CREATE TABLE `receptionist` (
  `Recep_ID` int(50) NOT NULL,
  `Date` varchar(15) NOT NULL,
  `FName` varchar(30) NOT NULL,
  `MName` varchar(30) NOT NULL,
  `LName` varchar(30) NOT NULL,
  `BMonth` varchar(25) NOT NULL,
  `BDay` int(25) NOT NULL,
  `BYear` int(25) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `blood` varchar(4) NOT NULL,
  `email` varchar(40) NOT NULL,
  `Security_Quest` longtext NOT NULL,
  `Security_Answer` varchar(50) NOT NULL,
  `phone` varchar(17) NOT NULL,
  `St_Address` varchar(50) NOT NULL,
  `C_Address` varchar(50) NOT NULL,
  `Pr_Address` varchar(50) NOT NULL,
  `status` varchar(10) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `receptionist`
--

INSERT INTO `receptionist` (`Recep_ID`, `Date`, `FName`, `MName`, `LName`, `BMonth`, `BDay`, `BYear`, `gender`, `blood`, `email`, `Security_Quest`, `Security_Answer`, `phone`, `St_Address`, `C_Address`, `Pr_Address`, `status`, `username`, `password`) VALUES
(20190002, '2019-11-30', 'Joshua', 'Gualva', 'Tirona', 'June', 15, 1999, 'Male', 'O', 'joshua@yahoo.com', 'What\'s your favorite color?', 'Black', '+6398689596', '103 Sta Rita', 'Olongapo City', 'Zambales', 'Single', 'Joshua12', 'joshua'),
(20190003, '2019-12-22', 'Martin', 'Berula', 'Ditalo', 'July', 29, 1998, 'Male', 'A', 'martin@yahoo.com', 'What\'s your favorite color?', 'Blue', '+6398686598', '103 Hansen Steet East Tapinac', 'Olongapo City', 'Zambales', 'Single', 'Martin12', 'martin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`count`);

--
-- Indexes for table `billing`
--
ALTER TABLE `billing`
  ADD PRIMARY KEY (`Bill_No`);

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`Doctor_ID`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`Count`);

--
-- Indexes for table `receptionist`
--
ALTER TABLE `receptionist`
  ADD PRIMARY KEY (`Recep_ID`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `count` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `billing`
--
ALTER TABLE `billing`
  MODIFY `Bill_No` int(25) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `doctor`
--
ALTER TABLE `doctor`
  MODIFY `Doctor_ID` int(25) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=201904;

--
-- AUTO_INCREMENT for table `patient`
--
ALTER TABLE `patient`
  MODIFY `Count` int(25) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `receptionist`
--
ALTER TABLE `receptionist`
  MODIFY `Recep_ID` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20190004;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
