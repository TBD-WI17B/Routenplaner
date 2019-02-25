-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Erstellungszeit: 25. Feb 2019 um 12:21
-- Server-Version: 10.1.35-MariaDB
-- PHP-Version: 7.2.9

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

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `adresse`
--

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
-- Daten für Tabelle `adresse`
--

INSERT INTO `adresse` (`adressId`, `plz`, `stadt`, `straße`, `hausnummer`, `adresszusatz`, `lat`, `lon`) VALUES
(1, '74613', 'Öhringen', 'Ehrenpreisweg', '3', '', NULL, NULL),
(2, '74821', 'Mosbach', 'Lohrtalweg', '11', '', NULL, NULL),
(3, '12345', 'Test', 'Muster', '5', '', NULL, NULL),
(17, '', '', '', '', '', NULL, NULL),
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
(40, '74821', 'Mosbach', 'Lohrtalweg', '11', NULL, '9.150468', '49.355679');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `auftrag`
--

CREATE TABLE `auftrag` (
  `auftragId` int(11) NOT NULL,
  `zielAdresseId` int(11) DEFAULT NULL,
  `startAdresseId` int(11) DEFAULT NULL,
  `kundenId` int(11) DEFAULT NULL,
  `entfernung` float NOT NULL DEFAULT '0',
  `datumDerFahrt` timestamp NULL DEFAULT NULL,
  `letztesÄnderungsDatum` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `auftrag`
--

INSERT INTO `auftrag` (`auftragId`, `zielAdresseId`, `startAdresseId`, `kundenId`, `entfernung`, `datumDerFahrt`, `letztesÄnderungsDatum`) VALUES
(1, 38, 40, 1, 43402.6, '2019-02-26 14:00:00', '2019-02-25 10:55:37'),
(2, 2, 3, 13, 0, '2019-02-25 23:00:00', '2019-02-23 19:38:39'),
(7, NULL, NULL, NULL, 0, NULL, '2019-02-24 20:51:12');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `auftragzuroute`
--

CREATE TABLE `auftragzuroute` (
  `id` int(11) NOT NULL,
  `routenId` int(11) NOT NULL,
  `auftragId` int(11) NOT NULL,
  `position` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `fahrer`
--

CREATE TABLE `fahrer` (
  `fahrerId` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `status` tinyint(1) NOT NULL,
  `standortId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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

CREATE TABLE `fahrzeug` (
  `fahrzuegId` int(11) NOT NULL,
  `anzahlSitze` int(11) NOT NULL,
  `status` tinyint(1) NOT NULL,
  `rollstuhltauglich` tinyint(1) NOT NULL,
  `standortId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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

CREATE TABLE `kunde` (
  `kundenId` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `vorname` varchar(255) NOT NULL,
  `telefon` varchar(20) NOT NULL,
  `handicap` tinyint(1) NOT NULL,
  `adressId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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

CREATE TABLE `route` (
  `routenId` int(11) NOT NULL,
  `farherId` int(11) NOT NULL,
  `fahrzeugId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `standort`
--

CREATE TABLE `standort` (
  `standortId` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `adressId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `standort`
--

INSERT INTO `standort` (`standortId`, `name`, `adressId`) VALUES
(1, 'Neckarbischofsheim im Ort', 1),
(2, 'Mosbach an der DHBW', 2);

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
  ADD PRIMARY KEY (`id`);

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
  MODIFY `adressId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;

--
-- AUTO_INCREMENT für Tabelle `auftrag`
--
ALTER TABLE `auftrag`
  MODIFY `auftragId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT für Tabelle `auftragzuroute`
--
ALTER TABLE `auftragzuroute`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

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
  MODIFY `routenId` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT für Tabelle `standort`
--
ALTER TABLE `standort`
  MODIFY `standortId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
