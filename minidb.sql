-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 16, 2024 at 07:33 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `minidb`
--

-- --------------------------------------------------------

--
-- Table structure for table `council`
--

CREATE TABLE `council` (
  `cid` int(10) NOT NULL,
  `nam` varchar(50) NOT NULL,
  `age` int(2) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `grade` int(10) NOT NULL,
  `sport` varchar(50) NOT NULL,
  `hobby` varchar(50) NOT NULL,
  `emails` varchar(50) NOT NULL,
  `talent` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `council`
--

INSERT INTO `council` (`cid`, `nam`, `age`, `gender`, `grade`, `sport`, `hobby`, `emails`, `talent`) VALUES
(4, 'Jalani', 22, 'female', 3, 'vooly ball', 'collecting stamp', 'Akila@gmail.com', 'Music'),
(6, 'Dulan', 14, 'male', 12, 'Carom', 'watchin move', 'dulan@gmail.com', 'Dancing');

-- --------------------------------------------------------

--
-- Table structure for table `register`
--

CREATE TABLE `register` (
  `sid` int(15) NOT NULL,
  `name` varchar(100) NOT NULL,
  `age` int(3) NOT NULL,
  `address` varchar(150) NOT NULL,
  `phone` int(10) NOT NULL,
  `gender` varchar(6) NOT NULL,
  `lan` varchar(10) NOT NULL,
  `religon` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `register`
--

INSERT INTO `register` (`sid`, `name`, `age`, `address`, `phone`, `gender`, `lan`, `religon`) VALUES
(9, 'Jalani', 23, 'kaluthara', 714179485, 'female', 'English', 'Buddish'),
(10, 'Wasantha', 14, 'polgahawela', 714173465, 'male', 'Sinhala', 'Buddhist'),
(11, 'Sunitha', 16, 'kaduwela', 704321675, 'female', 'English', 'Hindu');

-- --------------------------------------------------------

--
-- Table structure for table `singin`
--

CREATE TABLE `singin` (
  `username` varchar(15) NOT NULL,
  `password` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `singin`
--

INSERT INTO `singin` (`username`, `password`) VALUES
('Akila', '1234'),
('AkilaSrimantha', '123456');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `council`
--
ALTER TABLE `council`
  ADD PRIMARY KEY (`cid`);

--
-- Indexes for table `register`
--
ALTER TABLE `register`
  ADD PRIMARY KEY (`sid`);

--
-- Indexes for table `singin`
--
ALTER TABLE `singin`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `council`
--
ALTER TABLE `council`
  MODIFY `cid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `register`
--
ALTER TABLE `register`
  MODIFY `sid` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
