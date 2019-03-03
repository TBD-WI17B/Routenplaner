# Tourenverwaltung

## Installation (XAMPP)

Das Programm benötigt einen MySQL Server und wurde nur unter XAMPP/phpMyAdmin getestet.

1. Installieren Sie die neuste Version von XAMPP.
2. Öfnnen ie das XAMPP Dashboard und starten Sie dort das Apache und das MySQL Modul.
3. Öffnen Sie die phpMyAdmin Oberfläche in ihrem Brwoser, in dem Sie auf die Schaltfläche 'Admin' neben MySQL klicken.
4. Wählen Sie oben de Reiter "SQL" aus.
5. Kopieren Sie dort den Inhalt der Datei "tourenverwaltung_Demo_DB.sql" in das Textfeld und drücken Sie anschließend OK.
  >Das Skript beinhaltet ein DROP-TABLE und ist zum Hardreset gedacht.
6. Kopieren Sie anshcließend den Inhalt der Datei "MySQL_rechte.sql" in das Textfeld unf klicken Sie wieder anschließend auf OK.
  >Dadurch werden benötigt Rechte auf die Datenbank gesetzt, sodass das Progamm zugriff auf diese hat.
7. Führen Sie die Tourenverwaltung.jar aus.
  >Falls es beim Start zu einem Fehler kommen sollte, probieren Sie Schritt 6 mit der Datei "MySQL_Rechte_root.sql" noch einmal.
  
  ## Momentane Funkionen
  Im Augenblick ist nur die Auftrags-, Routen- und Kundenverwaltung implementiert.
