-- MODELLAZIONE FISICA:

CREATE DATABASE Piattaforma_Ecommerce;

CREATE TABLE IF NOT EXISTS Prodotti 
(
	id_prodotto INT PRIMARY KEY NOT NULL,
    nome VARCHAR(100) NOT NULL,
    descrizione VARCHAR(500) NOT NULL,
    prezzo FLOAT NOT NULL,
    quantita_magazzino INT NOT NULL
);

CREATE TABLE IF NOT EXISTS Categorie
(
	id_categoria INT PRIMARY KEY NOT NULL,
    nome VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS Categorie_Prodotti
(
    id_categoria INT NOT NULL,
    id_prodotto INT NOT NULL,
    FOREIGN KEY (id_categoria) REFERENCES Categorie(id_categoria),
    FOREIGN KEY (id_prodotto) REFERENCES Prodotti(id_prodotto)
);

CREATE TABLE IF NOT EXISTS Clienti
(
	id_cliente INT PRIMARY KEY NOT NULL,
    nome VARCHAR(100) NOT NULL,
	cognome VARCHAR(100) NOT NULL,
	email VARCHAR(255) NOT NULL UNIQUE,
    indirizzo_spedizione VARCHAR(255) NOT NULL 
);

CREATE TABLE IF NOT EXISTS Ordini
(
	id_ordine INT PRIMARY KEY NOT NULL,
	id_cliente INT NOT NULL,
    nome VARCHAR(100) NOT NULL,
	data_ordine DATE NOT NULL,
    stato_ordine VARCHAR(100) NOT NULL,
    totale FLOAT NOT NULL,
	FOREIGN KEY (id_cliente) REFERENCES Clienti(id_cliente)
);

CREATE TABLE IF NOT EXISTS Ordini_Prodotti
(
    id_ordine INT NOT NULL,
    id_prodotto INT NOT NULL,
    FOREIGN KEY (id_ordine) REFERENCES Ordini(id_ordine),
    FOREIGN KEY (id_prodotto) REFERENCES Prodotti(id_prodotto)
);

CREATE TABLE IF NOT EXISTS Spedizioni
(
	id_spedizione INT PRIMARY KEY NOT NULL,
	id_ordine INT NOT NULL,
    numero_tracking VARCHAR(100) NOT NULL,
    data_spedizione DATE NOT NULL,
    corriere VARCHAR(100) NOT NULL,
    FOREIGN KEY(id_ordine) REFERENCES Ordini(id_ordine)
);

CREATE TABLE IF NOT EXISTS Magazzini
(
	id_magazzino INT PRIMARY KEY NOT NULL,
    posizione VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS Magazzini_Prodotti
(
    id_magazzino INT NOT NULL,
    id_prodotto INT NOT NULL,
    FOREIGN KEY (id_magazzino) REFERENCES Magazzini(id_magazzino),
    FOREIGN KEY (id_prodotto) REFERENCES Prodotti(id_prodotto)
);

CREATE TABLE Pagamenti 
(
    id_pagamento INT PRIMARY KEY NOT NULL,
	id_cliente INT,
    importo FLOAT NOT NULL,
    metodo_pagamento VARCHAR(100) NOT NULL,
    data_pagamento DATE NOT NULL,
    FOREIGN KEY (id_cliente) REFERENCES Clienti(id_cliente)
);

CREATE TABLE Fornitori 
(
    id_fornitore INT PRIMARY KEY NOT NULL,
	id_prodotto INT NOT NULL,
    nome VARCHAR(100) NOT NULL,
    dettagli_contatto VARCHAR(500),
	FOREIGN KEY(id_prodotto) REFERENCES Prodotti(id_prodotto)
);

CREATE TABLE Recensioni 
(
    id_recensione INT PRIMARY KEY,
    id_cliente INT,
    valutazione INT NOT NULL CHECK (valutazione BETWEEN 1 AND 5),
    commento VARCHAR(500),
    FOREIGN KEY (id_cliente) REFERENCES Clienti(id_cliente)
);

INSERT INTO Prodotti (id_prodotto, nome, descrizione, prezzo, quantita_magazzino) 
VALUES
(1, 'Smartphone', 'Smartphone con display da 6.5 pollici', 499.99, 100),
(2, 'Laptop', 'Laptop con processore Intel i7', 999.99, 50),
(3, 'Cuffie', 'Cuffie bluetooth senza fili', 79.99, 200),
(4, 'Tablet', 'Tablet da 10 pollici con 4GB di RAM', 299.99, 30),
(5, 'Computer', 'Computer da 1TB di Hard Disk e 8GB di RAM', 1299.99, 300),
(6, 'Iphone', 'Melafonino', 899.99, 300);

INSERT INTO Categorie (id_categoria, nome) 
VALUES
(1, 'Elettronica'),
(2, 'Informatica'),
(3, 'Accessori');

-- 1: Smartphone, 2: Laptop, 3: Cuffie, 4: Tablet
INSERT INTO Categorie_Prodotti (id_categoria, id_prodotto)
VALUES
(1, 1),  
(2, 2),  
(3, 3),  
(2, 4);

INSERT INTO Clienti (id_cliente, nome, cognome, email, indirizzo_spedizione)
VALUES
(1, 'Mario', 'Rossi', 'mario.rossi@example.com', 'Via Roma, 10, Milano'),
(2, 'Giulia', 'Bianchi', 'giulia.bianchi@example.com', 'Via Milano, 20, Roma'),
(3, 'Roberto', 'Parente', 'roberto.parente@example.com', 'Via Napoli, 30, Napoli');

INSERT INTO Ordini (id_ordine, id_cliente, nome, data_ordine, stato_ordine, totale)
VALUES
(1, 1, 'Ordine 1', '2024-11-20', 'In elaborazione', 499.99),
(2, 2, 'Ordine 2', '2024-12-01', 'Spedito', 1099.99),
(3, 2, 'Ordine 3', '2023-11-05', 'Spedito', 699.99);

-- 1: Smartphone, 2: Laptop, 3: Cuffie, 4: Tablet
INSERT INTO Ordini_Prodotti (id_ordine, id_prodotto)
VALUES
(1, 1),  
(1, 3), 
(2, 2),  
(2, 4),
(3, 1),
(3, 2),
(3, 3),
(3, 4),
(3, 5),
(3, 6);

INSERT INTO Spedizioni (id_spedizione, id_ordine, numero_tracking, data_spedizione, corriere)
VALUES
(1, 1, 'TRACK123', '2024-11-22', 'DHL'),
(2, 2, 'TRACK456', '2024-12-02', 'FedEx');

INSERT INTO Magazzini (id_magazzino, posizione)
VALUES
(1, 'Magazzino A'),
(2, 'Magazzino B'),
(3, 'Magazzino C');

-- 1: Smartphone, 2: Laptop, 3: Cuffie, 4: Tablet
INSERT INTO Magazzini_Prodotti (id_magazzino, id_prodotto)
VALUES
(1, 1),  
(1, 2),  
(2, 3),  
(2, 4);  

INSERT INTO Pagamenti (id_pagamento, id_cliente, importo, metodo_pagamento, data_pagamento)
VALUES
(1, 1, 579.98, 'Carta di credito', '2024-11-20'),
(2, 2, 1099.99, 'PayPal', '2024-12-01');

INSERT INTO Fornitori (id_fornitore, id_prodotto, nome, dettagli_contatto)
VALUES
(1, 1, 'Fornitore A', 'contatto@fornitorea.com'),
(2, 2, 'Fornitore B', 'contatto@fornitoreb.com'),
(3, 3, 'Fornitore C', 'contatto@fornitorec.com'),
(4, 4, 'Fornitore D', 'contatto@fornitorerd.com'),
(5, 1, 'Fornitore E', 'contatto@fornitoree.com');

INSERT INTO Recensioni (id_recensione, id_cliente, valutazione, commento)
VALUES
(1, 1, 5, 'Ottimo smartphone, molto soddisfatto!'),
(2, 2, 2, 'Il tablet è lento, mi aspettavo di meglio.');

-- QUERY

-- 1. Visualizzare tutti i prodotti insieme ai nomi dei fornitori 
-- e ai magazzini in cui sono disponibili
SELECT p.nome AS prodotto, f.nome AS fornitore, m.posizione AS magazzino
FROM Prodotti AS p
INNER JOIN Magazzini_Prodotti AS mp 
ON p.id_prodotto = mp.id_prodotto
INNER JOIN Magazzini AS m 
ON mp.id_magazzino = m.id_magazzino
INNER JOIN Fornitori AS f 
ON p.id_prodotto = f.id_prodotto;

-- 2. Elencare gli ordini effettuati da un cliente specifico, 
-- includendo i dettagli del pagamento e lo stato della spedizione
SELECT o.id_ordine, o.data_ordine, o.stato_ordine, p.importo, p.metodo_pagamento, s.numero_tracking, s.corriere
FROM Ordini AS o
INNER JOIN Pagamenti AS p 
ON o.id_cliente = p.id_cliente
INNER JOIN Spedizioni AS s 
ON o.id_ordine = s.id_ordine
WHERE o.id_cliente = 1;  

-- 3. Visualizzare tutti i clienti che hanno effettuato almeno 
-- un ordine con un valore totale superiore a una certa soglia
-- APPUNTO: Uso la DISTINCT perchè, in questo caso, l'utente in questione effettua due ordini!
SELECT DISTINCT c.nome, c.cognome
FROM Clienti AS c
INNER JOIN Ordini AS o
ON o.id_cliente = c.id_cliente
WHERE totale > 500;

-- 4. Visualizzare il numero totale di prodotti disponibili in ogni magazzino. 
-- Utilizzare LEFT JOIN per includere anche i magazzini senza prodotti
SELECT m.posizione, COUNT(mp.id_prodotto)
FROM Magazzini AS m
LEFT JOIN Magazzini_Prodotti AS mp 
ON m.id_magazzino = mp.id_magazzino
GROUP BY m.posizione;

-- 5. Elencare i prodotti che sono stati recensiti con una valutazione inferiore a 3. 
-- Includere il commento della recensione e il nome del cliente
SELECT p.nome AS prodotto, r.valutazione, r.commento, c.nome AS nome_cliente, c.cognome AS cognome_cliente
FROM Recensioni AS r
INNER JOIN Prodotti AS p 
ON r.id_cliente = p.id_prodotto
INNER JOIN Clienti AS c 
ON r.id_cliente = c.id_cliente
WHERE r.valutazione < 3;

-- 6. Visualizzare i prodotti che sono forniti da più di un fornitore. 
-- Utilizzare una funzione di COUNT e un HAVING per filtrare i risultati
SELECT p.nome AS prodotto, COUNT(f.id_fornitore) AS numero_fornitori
FROM Prodotti p
INNER JOIN Fornitori f 
ON p.id_prodotto = f.id_prodotto
GROUP BY p.id_prodotto
HAVING COUNT(f.id_fornitore) > 1;

-- 7. Visualizzare il totale delle vendite per ogni categoria di prodotto. 
-- Utilizzare JOIN tra prodotti, categorie e ordini
SELECT c.nome AS categoria, SUM(o.totale) AS totale_vendite
FROM Categorie AS c
INNER JOIN Categorie_Prodotti AS cp 
ON c.id_categoria = cp.id_categoria
INNER JOIN Prodotti p 
ON cp.id_prodotto = p.id_prodotto
INNER JOIN Ordini_Prodotti op 
ON p.id_prodotto = op.id_prodotto
INNER JOIN Ordini o 
ON op.id_ordine = o.id_ordine
GROUP BY c.nome;

-- 8. Visualizzare gli ordini che contengono più di 5 prodotti diversi. 
-- Utilizzare una subquery per contare il numero di prodotti in ogni ordine
SELECT id_ordine
FROM 
(
    SELECT id_ordine, COUNT(id_prodotto) AS num_prodotti
    FROM Ordini_Prodotti
    GROUP BY id_ordine
)
WHERE num_prodotti > 5;

-- 9. Elencare tutti i clienti che non hanno ancora lasciato recensioni per nessuno dei prodotti acquistati. 
-- Utilizzare una LEFT JOIN tra ordini e recensioni
-- APPUNTO: Non funzionante a livello logico...
SELECT DISTINCT c.nome, c.cognome
FROM Clienti AS c
LEFT JOIN Ordini AS o 
ON c.id_cliente = o.id_cliente
LEFT JOIN Ordini_Prodotti AS op 
ON o.id_ordine = op.id_ordine
LEFT JOIN Recensioni AS r 
ON r.id_cliente = c.id_cliente;

-- 10. Visualizzare i dettagli di spedizione per tutti gli ordini effettuati negli ultimi 30 giorni. 
-- Includere il nome del corriere e lo stato della spedizione
SELECT o.id_ordine, s.numero_tracking, s.data_spedizione, s.corriere, o.stato_ordine
FROM Ordini AS o
INNER JOIN Spedizioni AS s 
ON o.id_ordine = s.id_ordine
WHERE o.data_ordine >= CURRENT_DATE - 30;

-- 11. Visualizzare la quantità totale di ogni prodotto venduto, ordinata per la quantità decrescente. 
-- Utilizzare una JOIN tra ordini e prodotti, e una funzione di SUM
SELECT p.nome AS prodotto, SUM(p.id_prodotto) AS quantita_totale_venduta
FROM Prodotti AS p
INNER JOIN Ordini_Prodotti AS op 
ON p.id_prodotto = op.id_prodotto
INNER JOIN Ordini AS o 
ON op.id_ordine = o.id_ordine
GROUP BY p.nome
ORDER BY quantita_totale_venduta DESC;

-- 12. Calcolare il tempo medio di consegna degli ordini, 
-- partendo dalla data dell'ordine fino alla data di spedizione
-- APPUNTO: Non funzionante a livello logico...
SELECT AVG(s.data_spedizione - o.data_ordine) AS tempo_medio_consegna
FROM Ordini AS o
INNER JOIN Spedizioni AS s 
ON o.id_ordine = s.id_ordine;