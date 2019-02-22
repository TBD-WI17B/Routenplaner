-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Erstellungszeit: 22. Feb 2019 um 18:43
-- Server-Version: 10.1.38-MariaDB
-- PHP-Version: 7.3.2

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

DROP TABLE IF EXISTS `adresse`;
CREATE TABLE `adresse` (
  `adressId` int(11) NOT NULL,
  `plz` int(11) NOT NULL,
  `stadt` varchar(255) NOT NULL,
  `straße` varchar(255) NOT NULL,
  `hausnummer` int(11) NOT NULL,
  `adresszusatz` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `adresse`
--

INSERT INTO `adresse` (`adressId`, `plz`, `stadt`, `straße`, `hausnummer`, `adresszusatz`) VALUES
(1, 7392, 'Routenbach', 'Hauptstraße', 42, ''),
(2, 74821, 'Mosbach', 'Lohrtalweg', 11, ''),
(3, 12345, 'Test', 'Muster', 5, ''),
(4, 54321, 'Muster', 'Test', 2, '');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `auftrag`
--

DROP TABLE IF EXISTS `auftrag`;
CREATE TABLE `auftrag` (
  `auftragId` int(11) NOT NULL,
  `zielAdressId` int(11) NOT NULL,
  `kundenId` int(11) NOT NULL,
  `entfernung` float NOT NULL,
  `datum` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `auftrag`
--

INSERT INTO `auftrag` (`auftragId`, `zielAdressId`, `kundenId`, `entfernung`, `datum`) VALUES
(1, 2, 2, 0, '2019-02-22 00:00:00');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `auftragzuroute`
--

DROP TABLE IF EXISTS `auftragzuroute`;
CREATE TABLE `auftragzuroute` (
  `id` int(11) NOT NULL,
  `routenId` int(11) NOT NULL,
  `auftragId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
-- Daten für Tabelle `kunde`
--

INSERT INTO `kunde` (`kundenId`, `name`, `vorname`, `telefon`, `handicap`, `adressId`) VALUES
(1, 'Müller', 'Andrea', '0764224521', 0, 3),
(2, 'Jimek', 'Paul', '0664321527', 0, 4),
(3, 'Müller', 'Heinz', '0464222521', 1, 3);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `route`
--

DROP TABLE IF EXISTS `route`;
CREATE TABLE `route` (
  `routenId` int(11) NOT NULL,
  `farherId` int(11) NOT NULL,
  `fahrzeugId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
  MODIFY `adressId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT für Tabelle `auftrag`
--
ALTER TABLE `auftrag`
  MODIFY `auftragId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

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
  MODIFY `kundenId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

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
