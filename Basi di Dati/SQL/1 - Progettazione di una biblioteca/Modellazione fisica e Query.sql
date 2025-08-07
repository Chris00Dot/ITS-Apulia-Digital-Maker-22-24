-- MODELLAZIONE FISICA:

CREATE DATABASE Biblioteca;

CREATE TABLE IF NOT EXISTS Utenti (
    id_utente INT PRIMARY KEY NOT NULL,  
	id_libro INT NOT NULL,
    nome VARCHAR(100) NOT NULL,                
    cognome VARCHAR(100) NOT NULL,                      
    email VARCHAR(100) NOT NULL,
	data_nascita DATE NOT NULL,
	indirizzo VARCHAR(255) NOT NULL,
	telefono VARCHAR(15) NOT NULL 
);

CREATE TABLE IF NOT EXISTS Libri (
    id_libro INT PRIMARY KEY NOT NULL,
	id_utente INT NOT NULL,
    titolo VARCHAR(255) NOT NULL,                
    tipo VARCHAR(100) NOT NULL,                      
    prezzo FLOAT NOT NULL                               
);

CREATE TABLE IF NOT EXISTS Prestiti (
    id_libro INT NOT NULL,
    id_utente INT NOT NULL,
    data_prestito DATE NOT NULL,
    data_scadenza DATE NOT NULL,
    FOREIGN KEY (id_libro) REFERENCES Libri(id_libro),
    FOREIGN KEY (id_utente) REFERENCES Utenti(id_utente)
);

CREATE TABLE IF NOT EXISTS Autori (
    id_autore INT PRIMARY KEY,   
	id_libro INT,
    nome VARCHAR(100),               
    cognome VARCHAR(100),            
    data_nascita DATE,               
    nazionalita VARCHAR(50),
	FOREIGN KEY (id_libro) REFERENCES Libri(id_libro)
);

CREATE TABLE IF NOT EXISTS Categorie (
    id_categoria INT PRIMARY KEY,  
	id_libro INT,
    nome_categoria VARCHAR(100),     
    descrizione VARCHAR(500),
	FOREIGN KEY (id_libro) REFERENCES Libri(id_libro)
);

INSERT INTO Utenti (id_utente, id_libro, nome, cognome, email, data_nascita, indirizzo, telefono)
VALUES
(1, 1, 'Giovanni', 'Rossi', 'giovanni.rossi@email.com', '1990-05-10', 'Via Roma 1, Milano', '1234567890'),
(2, 2, 'Laura', 'Bianchi', 'laura.bianchi@email.com', '1985-07-20', 'Via Milano 3, Roma', '0987654321'),
(3, 3, 'Marco', 'Verdi', 'marco.verdi@email.com', '1992-03-15', 'Via Napoli 7, Napoli', '1112233445');

INSERT INTO Libri (id_libro, id_utente, titolo, tipo, prezzo)
VALUES
(1, 1, 'Il Grande Gatsby', 'Romanzo', 15.99),
(2, 2, '1984', 'Distopico', 12.50),
(3, 3, 'La Divina Commedia', 'Classico', 20.00);

INSERT INTO Prestiti (id_libro, id_utente, data_prestito, data_scadenza)
VALUES
(1, 1, '2024-12-01', '2024-12-15'),
(2, 2, '2024-11-20', '2024-11-25'),
(3, 3, '2024-12-03', '2024-12-17');

INSERT INTO Autori (id_autore, id_libro, nome, cognome, data_nascita, nazionalita)
VALUES
(1, 1, 'F. Scott', 'Fitzgerald', '1896-09-24', 'Americana'),
(2, 2, 'George', 'Orwell', '1903-06-25', 'Britannica'),
(3, 3, 'Dante', 'Alighieri', '1265-06-01', 'Italiana');

INSERT INTO Categorie (id_categoria, id_libro, nome_categoria, descrizione)
VALUES
(1, 1, 'Narrativa', 'Romanzi e racconti di narrativa moderna'),
(2, 2, 'Fiction', 'Libri di narrativa con temi futuri e distopici'),
(3, 3, 'Poesia', 'Opere poetiche e liriche classiche italiane');

-- QUERY:

-- a
SELECT *
FROM Libri

-- b
SELECT L.id_libro, L.titolo, L.tipo, L.prezzo
FROM Libri AS L
INNER JOIN Autori AS A 
ON L.id_libro = A.id_libro
WHERE A.nome = 'George' AND A.cognome = 'Orwell';

-- c
SELECT U.nome, L.titolo
FROM Prestiti AS P
INNER JOIN Utenti AS U 
ON P.id_utente = U.id_utente
INNER JOIN Libri AS L 
ON P.id_libro = L.id_libro
WHERE P.data_scadenza < '2024-12-04';

-- d
SELECT COUNT(L.id_libro) AS numero_libri
FROM Libri AS L
INNER JOIN Categorie AS C
ON L.id_libro = C.id_libro
WHERE nome_categoria = 'Narrativa';

-- e
SELECT U.id_utente, U.nome, U.cognome, U.email, U.data_nascita, U.indirizzo, U.telefono
FROM Utenti AS U
INNER JOIN Prestiti AS P 
ON U.id_utente = P.id_utente
INNER JOIN Libri AS L 
ON P.id_libro = L.id_libro
INNER JOIN Categorie AS C 
ON L.id_libro = C.id_libro
WHERE C.nome_categoria = 'Poesia';

-- f
SELECT A.id_autore, A.nome, A.cognome, A.data_nascita, A.nazionalita, COUNT(L.id_libro) AS numero_libri
FROM Autori AS A
INNER JOIN Libri AS L
ON A.id_libro = L.id_libro
GROUP BY A.id_autore;

-- g
SELECT L.id_libro, L.titolo, L.tipo, L.prezzo
FROM Libri AS L
INNER JOIN Prestiti AS P 
ON L.id_libro = P.id_libro
WHERE P.data_scadenza >= '2024-12-04';




