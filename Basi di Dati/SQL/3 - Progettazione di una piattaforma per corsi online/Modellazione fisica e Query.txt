-- MODELLAZIONE FISICA:

CREATE DATABASE Piattaforma;
DROP DATABASE Piattaforma;

DROP TABLE Istruttori;
CREATE TABLE IF NOT EXISTS Istruttori 
(
    id_istruttore INT PRIMARY KEY NOT NULL,
    nome VARCHAR(100) NOT NULL,
    cognome VARCHAR(100) NOT NULL,
    area_competenza VARCHAR(255) NOT NULL
);

DROP TABLE Studenti;
CREATE TABLE IF NOT EXISTS Studenti 
(
    id_studente INT PRIMARY KEY NOT NULL,
    nome VARCHAR(100) NOT NULL,
    cognome VARCHAR(100) NOT NULL,
    email VARCHAR(255) NOT NULL
);

DROP TABLE Corsi;
CREATE TABLE IF NOT EXISTS Corsi 
(
    id_corso INT PRIMARY KEY NOT NULL,
	id_istruttore INT NOT NULL,
    titolo VARCHAR(255) NOT NULL,
    descrizione VARCHAR(500) NOT NULL,
	categoria VARCHAR(100) NOT NULL,
	FOREIGN KEY (id_istruttore) REFERENCES Istruttori(id_istruttore)
);

DROP TABLE Iscrizioni;
CREATE TABLE IF NOT EXISTS Iscrizioni 
(
    id_studente INT NOT NULL,
    id_corso INT NOT NULL,
    FOREIGN KEY (id_studente) REFERENCES Studenti(id_studente),
    FOREIGN KEY (id_corso) REFERENCES Corsi(id_corso)
);

DROP TABLE Recensioni;
CREATE TABLE IF NOT EXISTS Recensioni 
(
    id_recensione INT PRIMARY KEY NOT NULL,
	id_corso INT NOT NULL,
    valutazione INT CHECK (valutazione BETWEEN 1 AND 5), 
    commento VARCHAR(500) NOT NULL,
	FOREIGN KEY (id_corso) REFERENCES Corsi(id_corso)
);

DROP DATABASE Lezioni;
CREATE TABLE IF NOT EXISTS Lezioni 
(
    id_lezione INT PRIMARY KEY NOT NULL,
    id_corso INT NOT NULL,
    titolo VARCHAR(255) NOT NULL,
    durata INT NOT NULL,
    FOREIGN KEY (id_corso) REFERENCES Corsi(id_corso)
);

INSERT INTO Istruttori (id_istruttore, nome, cognome, area_competenza) VALUES
(1, 'Carlo', 'Rinaldi', 'Programmazione'),
(2, 'Elena', 'Galli', 'Design'),
(3, 'Paolo', 'Esposito', 'Marketing'),
(4, 'Marco', 'Lucarelli', 'Gestione Progetti');

INSERT INTO Studenti (id_studente, nome, cognome, email) VALUES
(1, 'Giovanni', 'Rossi', 'giovanni.rossi@example.com'),
(2, 'Maria', 'Bianchi', 'maria.bianchi@example.com'),
(3, 'Luca', 'Verdi', 'luca.verdi@example.com'),
(4, 'Anna', 'Neri', 'anna.neri@example.com');

INSERT INTO Corsi (id_corso, id_istruttore, titolo, descrizione, categoria) VALUES
(1, 1, 'Introduzione alla Programmazione', 'Corso base di programmazione con Python.', 'Programmazione'),
(2, 2, 'Design Grafico con Photoshop', 'Corso completo su Photoshop, dal livello base a quello avanzato.', 'Design'),
(3, 3, 'Marketing Digitale', 'Corso per apprendere le strategie di marketing online.', 'Business');

-- Giovanni -> "Introduzione alla Programmazione";
-- Maria -> "Design Grafico con Photoshop";
-- Luca -> "Introduzione alla Programmazione";
-- Anna -> "Design Grafico con Photoshop";
-- Maria -> "Introduzione alla Programmazione".
INSERT INTO Iscrizioni (id_studente, id_corso) VALUES
(1, 1), 
(2, 2), 
(3, 1), 
(4, 2), 
(2, 1); 

INSERT INTO Recensioni (id_recensione, id_corso, valutazione, commento)
VALUES
(1, 1, 5, 'Corso molto interessante e ben strutturato.'),
(2, 2, 2, 'Buon corso, ma alcuni concetti potrebbero essere approfonditi.'),
(3, 2, 3, 'Il corso è utile, ma la qualità del materiale didattico può essere migliorata.');

INSERT INTO Lezioni (id_lezione, id_corso, titolo, durata) VALUES
(1, 1, 'Introduzione al linguaggio Python', 60),  
(2, 1, 'Variabili e Tipi di Dati', 45),             
(3, 1, 'Controllo del flusso (if, for, while)', 50),
(4, 2, 'Introduzione a Photoshop', 90),              
(5, 2, 'Strumenti di selezione e ritocco', 75),   
(6, 2, 'Lavorare con i livelli', 80),
(7, 3, 'Fondamenti di Marketing Online', 120),        
(8, 3, 'SEO e SEM', 90),                             
(9, 3, 'Social Media Marketing', 100),
(10, 1, 'Operatori', 50),
(11, 1, 'Array 2D o Multidimensionali', 60),
(12, 1, 'Wrapper Classes', 40);

-- QUERY:

-- 1. Elencare tutti i corsi insieme al nome dell'istruttore e alla categoria del corso.
SELECT C.titolo AS titolo_corso, C.categoria AS categoria_corso, I.nome AS nome_istruttore 
FROM Corsi AS C
INNER JOIN Istruttori AS I
ON C.id_istruttore = I.id_istruttore;

-- 2. Visualizzare tutti gli studenti iscritti a un determinato corso. 
-- La query deve mostrare il titolo del corso e i nomi degli studenti.
SELECT C.titolo AS titolo_corso, S.nome AS nome_studente
FROM Iscrizioni AS I
INNER JOIN Corsi AS C
ON I.id_corso = C.id_corso
INNER JOIN Studenti AS S
ON I.id_studente = S.id_studente
WHERE C.titolo = 'Introduzione alla Programmazione';

-- 3. Visualizzare il numero di studenti iscritti per ogni corso. 
-- Utilizzate una LEFT JOIN per includere anche i corsi a cui nessuno si è iscritto.
SELECT C.titolo AS titolo_corso, COUNT(I.id_studente) AS numero_studenti
FROM Corsi AS C
LEFT JOIN Iscrizioni AS I
ON C.id_corso = I.id_corso
GROUP BY C.titolo;

-- 4. Visualizzare le valutazioni medie dei corsi. 
-- La query deve mostrare il titolo del corso e la valutazione media (se presente).
SELECT C.titolo AS titolo_corso, AVG(R.valutazione) AS valutazione_media
FROM Corsi AS C
LEFT JOIN Recensioni AS R
ON C.id_corso = R.id_corso
GROUP BY C.titolo;

-- 5. Elencare tutti i corsi che non hanno ancora ricevuto recensioni. 
-- Utilizzate un LEFT JOIN tra la tabella Corsi e la tabella Recensioni.
SELECT C.titolo AS titolo_corso
FROM Corsi AS C
LEFT JOIN Recensioni AS R
ON C.id_corso = R.id_corso
WHERE R.id_recensione IS NULL;

-- 6. Visualizzare tutti i corsi e il numero totale di ore di lezione per ciascun corso. 
-- Utilizzate una funzione di aggregazione per sommare la durata delle lezioni.
-- Appunto: Utilizzo la funzione di aggregazione SUM per sommare la durata di tutte le lezioni per ogni corso, 
-- e divido per 60 per ottenere il totale in ore, perchè la colonna durata (INT) l'ho ragionata in minuti.
SELECT C.titolo AS titolo_corso, SUM(L.durata)/60 AS totale_ore
FROM Corsi AS C
INNER JOIN Lezioni AS L
ON C.id_corso = L.id_corso
GROUP BY C.id_corso;

-- 7. Visualizzare gli istruttori e il numero di corsi che tengono. 
-- Mostrate anche gli istruttori che attualmente non tengono alcun corso.
SELECT I.nome AS nome_istruttore, I.cognome AS cognome_istruttore, COUNT(C.id_corso) AS numero_corsi
FROM Istruttori AS I
LEFT JOIN Corsi AS C
ON I.id_istruttore = C.id_istruttore
GROUP BY I.nome, I.cognome;

-- 8. Visualizzare tutti i corsi che hanno una valutazione media superiore a 4. 
-- Utilizzate una subquery per calcolare la valutazione media di ogni corso.
SELECT C.titolo AS titolo_corso
FROM Corsi AS C
WHERE C.id_corso IN 
(
	SELECT R.id_corso
	FROM Recensioni AS R
	GROUP BY R.id_corso
	HAVING AVG(R.valutazione) > 4
);

-- 9. Visualizzare i corsi e il numero di studenti iscritti che hanno lasciato una recensione.
-- Utilizzate JOIN multiple tra Iscrizioni , Recensioni e Corsi.
-- Appunto: Utilizzo la distinct per evitare che il singolo studente lasci più recensioni per lo stesso corso, 
-- essendo presente più di una volta nella tabella Iscrzioni, e quindi gestiamo la ridondanza.
SELECT C.titolo AS titolo_corso, COUNT(DISTINCT I.id_studente) AS numero_studenti_con_recensione
FROM Corsi AS C
INNER JOIN Iscrizioni AS I
ON C.id_corso = I.id_corso
INNER JOIN Recensioni AS R
ON C.id_corso = R.id_corso
GROUP BY C.titolo;

-- 10. Visualizzare i dettagli dei corsi, inclusi titolo, nome dell'istruttore, e numero di lezioni, per i
-- corsi che contengono più di 5 lezioni.
SELECT C.titolo AS titolo_corso, I.nome AS nome_istruttore, COUNT(L.id_lezione) AS numero_lezioni
FROM Corsi AS C
INNER JOIN Istruttori AS I
ON C.id_istruttore = I.id_istruttore
INNER JOIN Lezioni AS L
ON C.id_corso = L.id_corso
GROUP BY C.titolo, I.nome
HAVING COUNT(L.id_lezione) > 5;