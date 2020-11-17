### MSD19 - SW Design

## OODesign Principles - Assignment 

This repo contains a exercice/assignment for the SOLID principles


# Abgabe Refactor to SOLID

BlockchainApp hat zwei verschiedene Blockchains implementiert, Coind und Grading 


**Problem** 
Analyse des Codes, stellen Sie fest wo die Prinzipien von SOLID verletzt werden und wie die SOLID Prinzipien besser angewendet werden können.

### Aufgaben 

#### 1. Analyse der BlockchainApp-Anwendung

**ISP**
wo findet man eine Verletzung diese Prinzips, wie kann dies geändert werden

**OCP**
wo findet man eine Verletzung diese Prinzips, wie kann dies geändert werden

**DIP**
wo findet man eine Verletzung diese Prinzips, wie kann dies geändert werden





**TODO 1**:

Wo befinden sich die genannten Schwachstellen?

Erstellen sie ein Dokument (pdf) mit der Beschreibung (welcher Codeteil, Screenshot, Begründung)    


    	
####  2. Refactor to SOLID

1. ISP - Wie geht man damit um, dass nicht alle Funktionen des Interfaces genutzt werden?
  
2. OCP - In den Klassen *...* befindet sich doppelter Code, wie kann dies vermieden werden?
	
3. DIP - In der Klasse *..* finden sich Instanzen der *..*, wie kann dies vermieden werden? 

Die Klasse *BlockChainMain* bleibt unverändert und die Ausgabe soll in etwa so aussehen
	
 	 =====  Blockchain App  =====
	Block{ Payment:null -> null: 0.0, hash=923521, prevHash=0}
	Block{ Payment:Elmar -> Michael: 50.0, hash=961042610, prevHash=923521}
	Block{ Payment:Harald -> Andi: 100.0, hash=-1023239995, prevHash=961042610}
	chain valid: true

	Block{Grading:Elmar, SWdesign: 2, hash=-461580854, prevHash=0}
	Block{Grading:Andi, Scrum: 1, hash=-361221582, prevHash=-461580854}
	Block{Grading:null, null: 0, hash=-360298061, prevHash=-361221582}
	chain valid: true

    

**TODO 2**:

- Ändern Sie den Source-Code 
- Erstellen sie ein Dokument (pdf) mit der Beschreibung der Änderungen (welcher Codeteil, Screenshot, Begründung)    

Abgabe via Moodle




 