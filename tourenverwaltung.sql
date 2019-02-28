-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Erstellungszeit: 28. Feb 2019 um 23:11
-- Server-Version: 10.1.36-MariaDB
-- PHP-Version: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `tourenverwaltung`
--
CREATE DATABASE IF NOT EXISTS `tourenverwaltung` DEFAULT CHARACTER SET latin1 COLLATE latin1_general_ci;
USE `tourenverwaltung`;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `adresse`
--

DROP TABLE IF EXISTS `adresse`;
CREATE TABLE `adresse` (
  `adressId` int(11) NOT NULL,
  `plz` varchar(5) NOT NULL,
  `stadt` varchar(255) NOT NULL,
  `straße` varchar(255) NOT NULL,
  `hausnummer` varchar(4) NOT NULL,
  `adresszusatz` varchar(255) DEFAULT NULL,
  `lat` varchar(20) DEFAULT NULL,
  `lon` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- TRUNCATE Tabelle vor dem Einfügen `adresse`
--

TRUNCATE TABLE `adresse`;
--
-- Daten für Tabelle `adresse`
--

INSERT INTO `adresse` (`adressId`, `plz`, `stadt`, `straße`, `hausnummer`, `adresszusatz`, `lat`, `lon`) VALUES
(1, '74613', 'Öhringen', 'Ehrenpreisweg', '3', '', NULL, NULL),
(2, '74821', 'Mosbach', 'Lohrtalweg', '11', '', NULL, NULL),
(3, '12345', 'Test', 'Muster', '5', '', NULL, NULL),
(4, '74613', 'Öhringen', 'Kastellstraße', '4', NULL, ' 9.498805', '49.205309'),
(5, '74821', 'Mosbach', 'Knopfweg', '1', NULL, '9.152894', '49.355755'),
(6, '74924', 'Neckarbischofsheim', 'Alexandergasse', '2', NULL, '8.961527', '49.292141'),
(18, '7392', 'Routenbach', 'null', '42', '', NULL, NULL),
(19, '7392', 'Routenbach', 'Hauptstraße', '42', '', NULL, NULL),
(20, '7392', 'Routenbach', 'Hauptstraße', '42', '', NULL, NULL),
(21, '7392', 'Routenbach', 'Hauptstraße', '42', '', NULL, NULL),
(22, '7392', 'Routenbach', 'Hauptstraße', '42', '', NULL, NULL),
(23, '7392', 'Routenbach', 'Hauptstraße', '42', '', NULL, NULL),
(24, '07392', 'Routenbacher', 'Hauptweg', '14', '', NULL, NULL),
(25, '08254', 'Mosbach', 'Lohrtalstraße', '12', '', NULL, NULL),
(26, '07392', 'Routenbacher', 'Hauptweg', '14', '', NULL, NULL),
(27, '07392', 'Routenbacher', 'Hauptweg', '14', '', NULL, NULL),
(28, '07392', 'Routenbach', 'Hauptweg', '14', '', NULL, NULL),
(29, '74821', 'Mosbach', 'Lohrtalweg', '12', '', NULL, NULL),
(30, '74821', 'Mosbach', 'Lohrtalweg', '11', '', NULL, NULL),
(31, '74821', 'Mosbach', 'Lohrtalweg', '12', '', NULL, NULL),
(32, '74821', 'Mosbach', 'Lohrtalweg', '11', '', NULL, NULL),
(33, '74821', 'Mosbach', 'Lohrtalweg', '12', '', '49.351393', ''),
(34, '74821', 'Mosbach', 'Lohrtalweg', '11', NULL, '9.150468', '49.355679'),
(35, '74821', 'Mosbach', 'Lohrtalweg', '12', NULL, '9.156615', '49.351393'),
(36, '74821', 'Mosbach', 'Lohrtalweg', '11', NULL, '9.150468', '49.355679'),
(37, '74821', 'Mosbach', 'Lohrtalweg', '11', NULL, '9.150468', '49.355679'),
(38, '74613', 'Öhringen', 'Ehrenpreisweg', '1', NULL, '9.490089', '49.211523'),
(39, '74821', 'Mosbach', 'Lohrtalweg', '12', NULL, '9.156615', '49.351393'),
(40, '74821', 'Mosbach', 'Lohrtalweg', '11', NULL, '9.150468', '49.355679'),
(41, '74613', 'Öhringen', 'Ehrenpreisweg', '3', NULL, '9.489839', '49.21148'),
(42, '74229', 'Oedheim', 'Ratsstraße', '1', NULL, '9.25733', '49.239581'),
(43, '74613', 'Öhringen', 'Ehrenpreisweg', '3', NULL, '9.489839', '49.21148'),
(44, '74229', 'Oedheim', 'Ratsstraße', '1', NULL, '9.25733', '49.239581'),
(45, '74613', 'Öhringen', 'Ehrenpreisweg', '3', NULL, '9.489839', '49.21148'),
(46, '74229', 'Oedheim', 'Ratsstraße', '1', NULL, '9.25733', '49.239581'),
(47, '74613', 'Öhringen', 'Ehrenpreisweg', '3', NULL, '9.489839', '49.21148'),
(48, '74229', 'Oedheim', 'Ratsstraße', '1', NULL, '9.25733', '49.239581'),
(49, '74613', 'Öhringen', 'Ehrenpreisweg', '3', NULL, '9.489839', '49.21148'),
(50, '74229', 'Oedheim', 'Ratsstraße', '1', NULL, '9.25733', '49.239581'),
(51, '74613', 'Öhringen', 'Ehrenpreisweg', '3', NULL, '9.489839', '49.21148'),
(52, '74229', 'Oedheim', 'Ratsstraße', '1', NULL, '9.25733', '49.239581'),
(53, '74229', 'Oedheim', 'Uhlandstraße', '16', NULL, '9.246089', '49.241895'),
(54, '74177', 'Bad Friedrichshall', 'Kreßbacher Str.', '3', NULL, '9.216365', '49.222457'),
(55, '74229', 'Oedheim', 'Uhlandstraße', '16', NULL, '9.246089', '49.241895'),
(56, '74177', 'Bad Friedrichshall', 'Kreßbacher Str.', '3', NULL, '9.216365', '49.222457'),
(57, '74229', 'Oedheim', 'Uhlandstraße', '16', NULL, '9.246089', '49.241895'),
(58, '74177', 'Bad Friedrichshall', 'Kreßbacher Str.', '3', NULL, '9.216365', '49.222457'),
(59, '74177', 'Bad Friedrichshall', 'Obere Dorfstraße', '12', NULL, '9.216365', '49.222457'),
(60, '74821', 'Mosbach', 'Alte Bergsteige', '7', NULL, '9.149863', '49.353233'),
(61, '74613', 'Öhringen', 'Ehrenpreisweg', '3', NULL, '9.489839', '49.21148'),
(62, '74613', 'Öhringen', 'Ehrenpreisweg', '3', NULL, '9.489839', '49.21148');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `auftrag`
--

DROP TABLE IF EXISTS `auftrag`;
CREATE TABLE `auftrag` (
  `auftragId` int(11) NOT NULL,
  `zielAdresseId` int(11) DEFAULT NULL,
  `startAdresseId` int(11) DEFAULT NULL,
  `kundenId` int(11) DEFAULT NULL,
  `entfernung` float NOT NULL DEFAULT '0',
  `datumDerFahrt` timestamp NULL DEFAULT NULL,
  `letztesÄnderungsDatum` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `dauer` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- TRUNCATE Tabelle vor dem Einfügen `auftrag`
--

TRUNCATE TABLE `auftrag`;
--
-- Daten für Tabelle `auftrag`
--

INSERT INTO `auftrag` (`auftragId`, `zielAdresseId`, `startAdresseId`, `kundenId`, `entfernung`, `datumDerFahrt`, `letztesÄnderungsDatum`, `dauer`) VALUES
(1, 62, 40, 1, 43413, '2019-02-26 14:00:00', '2019-02-28 15:03:31', 2837.7),
(2, 2, 3, 13, 0, '2019-02-25 23:00:00', '2019-02-23 19:38:39', NULL),
(9, 52, 51, 13, 19172.2, '2020-12-20 11:00:00', '2019-02-28 14:18:39', NULL),
(10, 58, 57, 13, 4246.3, '2020-12-20 11:30:00', '2019-02-28 21:44:13', NULL),
(11, 60, 59, 2, 22004.8, '2020-12-20 12:00:00', '2019-02-28 14:23:27', NULL);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `auftragzuroute`
--

DROP TABLE IF EXISTS `auftragzuroute`;
CREATE TABLE `auftragzuroute` (
  `routenId` int(11) NOT NULL,
  `auftragId` int(11) NOT NULL,
  `position` int(11) NOT NULL,
  `entfernung` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- TRUNCATE Tabelle vor dem Einfügen `auftragzuroute`
--

TRUNCATE TABLE `auftragzuroute`;
--
-- Daten für Tabelle `auftragzuroute`
--

INSERT INTO `auftragzuroute` (`routenId`, `auftragId`, `position`, `entfernung`) VALUES
(1, 1, 1, '50'),
(1, 2, 2, '22'),
(29, 9, 0, NULL),
(29, 10, 1, NULL),
(29, 11, 2, NULL);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `fahrer`
--

DROP TABLE IF EXISTS `fahrer`;
CREATE TABLE `fahrer` (
  `fahrerId` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `status` tinyint(1) NOT NULL,
  `standortId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- TRUNCATE Tabelle vor dem Einfügen `fahrer`
--

TRUNCATE TABLE `fahrer`;
--
-- Daten für Tabelle `fahrer`
--

INSERT INTO `fahrer` (`fahrerId`, `name`, `status`, `standortId`) VALUES
(1, 'Sven Müller', 1, 2),
(2, 'Peter Sauer', 1, 2),
(3, 'Emilia Wagenbauer', 1, 1);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `fahrzeug`
--

DROP TABLE IF EXISTS `fahrzeug`;
CREATE TABLE `fahrzeug` (
  `fahrzuegId` int(11) NOT NULL,
  `anzahlSitze` int(11) NOT NULL,
  `status` tinyint(1) NOT NULL,
  `rollstuhltauglich` tinyint(1) NOT NULL,
  `standortId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- TRUNCATE Tabelle vor dem Einfügen `fahrzeug`
--

TRUNCATE TABLE `fahrzeug`;
--
-- Daten für Tabelle `fahrzeug`
--

INSERT INTO `fahrzeug` (`fahrzuegId`, `anzahlSitze`, `status`, `rollstuhltauglich`, `standortId`) VALUES
(1, 5, 1, 0, 2),
(2, 8, 1, 0, 2),
(3, 5, 1, 1, 2),
(4, 5, 1, 1, 1);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `kunde`
--

DROP TABLE IF EXISTS `kunde`;
CREATE TABLE `kunde` (
  `kundenId` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `vorname` varchar(255) NOT NULL,
  `telefon` varchar(20) NOT NULL,
  `handicap` tinyint(1) NOT NULL,
  `adressId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- TRUNCATE Tabelle vor dem Einfügen `kunde`
--

TRUNCATE TABLE `kunde`;
--
-- Daten für Tabelle `kunde`
--

INSERT INTO `kunde` (`kundenId`, `name`, `vorname`, `telefon`, `handicap`, `adressId`) VALUES
(1, 'Müller', 'Andrea', '0764224521', 0, 3),
(2, 'Jimek', 'Paul', '0664321527', 0, 2),
(3, 'Müller', 'Heinz', '0464222521', 1, 3),
(13, 'Peterson', 'Klaus', '', 0, 17);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `route`
--

DROP TABLE IF EXISTS `route`;
CREATE TABLE `route` (
  `routenId` int(11) NOT NULL,
  `fahrerId` int(11) DEFAULT NULL,
  `fahrzeugId` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- TRUNCATE Tabelle vor dem Einfügen `route`
--

TRUNCATE TABLE `route`;
--
-- Daten für Tabelle `route`
--

INSERT INTO `route` (`routenId`, `fahrerId`, `fahrzeugId`) VALUES
(1, 2, 2);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `standort`
--

DROP TABLE IF EXISTS `standort`;
CREATE TABLE `standort` (
  `standortId` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `adressId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- TRUNCATE Tabelle vor dem Einfügen `standort`
--

TRUNCATE TABLE `standort`;
--
-- Daten für Tabelle `standort`
--

INSERT INTO `standort` (`standortId`, `name`, `adressId`) VALUES
(1, 'Neckarbischofsheim im Ort', 5),
(2, 'Mosbach an der DHBW', 6),
(3, 'Öhringen', 4);

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `adresse`
--
ALTER TABLE `adresse`
  ADD PRIMARY KEY (`adressId`);

--
-- Indizes für die Tabelle `auftrag`
--
ALTER TABLE `auftrag`
  ADD PRIMARY KEY (`auftragId`);

--
-- Indizes für die Tabelle `auftragzuroute`
--
ALTER TABLE `auftragzuroute`
  ADD PRIMARY KEY (`routenId`,`auftragId`);

--
-- Indizes für die Tabelle `fahrer`
--
ALTER TABLE `fahrer`
  ADD PRIMARY KEY (`fahrerId`);

--
-- Indizes für die Tabelle `fahrzeug`
--
ALTER TABLE `fahrzeug`
  ADD PRIMARY KEY (`fahrzuegId`);

--
-- Indizes für die Tabelle `kunde`
--
ALTER TABLE `kunde`
  ADD PRIMARY KEY (`kundenId`);

--
-- Indizes für die Tabelle `route`
--
ALTER TABLE `route`
  ADD PRIMARY KEY (`routenId`);

--
-- Indizes für die Tabelle `standort`
--
ALTER TABLE `standort`
  ADD PRIMARY KEY (`standortId`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `adresse`
--
ALTER TABLE `adresse`
  MODIFY `adressId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=63;

--
-- AUTO_INCREMENT für Tabelle `auftrag`
--
ALTER TABLE `auftrag`
  MODIFY `auftragId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT für Tabelle `fahrer`
--
ALTER TABLE `fahrer`
  MODIFY `fahrerId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT für Tabelle `fahrzeug`
--
ALTER TABLE `fahrzeug`
  MODIFY `fahrzuegId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT für Tabelle `kunde`
--
ALTER TABLE `kunde`
  MODIFY `kundenId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT für Tabelle `route`
--
ALTER TABLE `route`
  MODIFY `routenId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- AUTO_INCREMENT für Tabelle `standort`
--
ALTER TABLE `standort`
  MODIFY `standortId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
