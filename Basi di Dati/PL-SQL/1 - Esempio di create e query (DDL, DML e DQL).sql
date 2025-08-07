DROP TABLE IF EXISTS filiale CASCADE;
CREATE TABLE filiale(
	numero_filiale INT PRIMARY KEY NOT NULL,
	nome VARCHAR(50) NOT NULL,
	sede VARCHAR(50) NOT NULL,
	numero_dipendenti INT NOT NULL
);

DROP TABLE IF EXISTS editore CASCADE;
CREATE TABLE editore(
	codice VARCHAR(50) PRIMARY KEY NOT NULL,
	nome VARCHAR(50) NOT NULL,
	citta VARCHAR(50) NOT NULL,
	stato VARCHAR(50) NOT NULL
);

DROP TABLE IF EXISTS autore CASCADE;
CREATE TABLE autore(
	numero_autore INT PRIMARY KEY NOT NULL,
	nome VARCHAR(50) NOT NULL,
	cognome VARCHAR(50)
);

DROP TABLE IF EXISTS libro CASCADE
CREATE TABLE libro(
	codice VARCHAR(50) PRIMARY KEY NOT NULL,
	titolo VARCHAR(50) NOT NULL,
	codice_editore VARCHAR(50) NOT NULL,
	tipo VARCHAR(50) NOT NULL,
	prezzo FLOAT NOT NULL,
	paperback CHAR NOT NULL,
	FOREIGN KEY (codice_editore) REFERENCES editore(codice)
);

DROP TABLE IF EXISTS hascritto CASCADE;
CREATE TABLE hascritto(
	codice_libro VARCHAR(50) NOT NULL,
	numero_autore INT NOT NULL,
	numero_sequenziale INT NOT NULL,
	PRIMARY KEY(codice_libro, numero_autore),
	FOREIGN KEY(codice_libro) REFERENCES libro(codice),
	FOREIGN KEY(numero_autore) REFERENCES autore(numero_autore)
);

DROP TABLE IF EXISTS scorta CASCADE;
CREATE TABLE scorta(
	codice_libro VARCHAR(50) NOT NULL,
	numero_filiale INT NOT NULL,
	numero_copie_disponibili INT NOT NULL,
	PRIMARY KEY(codice_libro, numero_filiale),
	FOREIGN KEY(codice_libro) REFERENCES libro(codice),
	FOREIGN KEY(numero_filiale) REFERENCES filiale(numero_filiale)
);

INSERT INTO FILIALE VALUES ( 1,'Henry Downtown','16 Riverview',10 );
INSERT INTO FILIALE VALUES ( 2,'Henry On the Hill','1289 Bedford',06 );
INSERT INTO FILIALE VALUES ( 3,'Henry Brentwood','Brentwood Mall',15 );
INSERT INTO FILIALE VALUES ( 4,'Henry Eastshore','Eastshore Mall',09 );


INSERT INTO EDITORE VALUES ( 'AH','Arkham House Publ.','Sauk City','WI' );
INSERT INTO EDITORE VALUES ( 'AP','Arcade Publishing','New York','NY' );
INSERT INTO EDITORE VALUES ( 'AW','Addison Wesley','Reading','MA' );
INSERT INTO EDITORE VALUES ( 'BB','Bantam Books','New York','NY' );
INSERT INTO EDITORE VALUES ( 'BF','Best and Furrow','Boston','MA' );
INSERT INTO EDITORE VALUES ( 'JT','Jeremy P. Tarcher','Los Angeles','CA' );
INSERT INTO EDITORE VALUES ( 'MP','McPherson and Co.','Kinston','NY' );
INSERT INTO EDITORE VALUES ( 'PB','Pocket Books','New York','NY' );
INSERT INTO EDITORE VALUES ( 'RH','Random House','New York','NY' );
INSERT INTO EDITORE VALUES ( 'RZ','Rizzoli','New York','NY' );
INSERT INTO EDITORE VALUES ( 'SB','Schoken Books','New York','NY' );
INSERT INTO EDITORE VALUES ( 'SI','Signet','New York','NY' );
INSERT INTO EDITORE VALUES ( 'TH','Thames and Hudson','New York','NY' );
INSERT INTO EDITORE VALUES ( 'WN','W.W. Norton and Co.','New York','NY' );


INSERT INTO AUTORE VALUES ( 01,'Archer','Jeffrey' );
INSERT INTO AUTORE VALUES ( 02,'Christie','Agatha' );
INSERT INTO AUTORE VALUES ( 03,'Clarke','Arthur C.' );
INSERT INTO AUTORE VALUES ( 04,'Francis','Dick' );
INSERT INTO AUTORE VALUES ( 05,'Cussler','Clive' );
INSERT INTO AUTORE VALUES ( 06,'King','Stephen' );
INSERT INTO AUTORE VALUES ( 07,'Pratt','Philip' );
INSERT INTO AUTORE VALUES ( 08,'Adamski','Joseph' );
INSERT INTO AUTORE VALUES ( 10,'Harmon','Willis' );
INSERT INTO AUTORE VALUES ( 11,'Rheingold','Howard' );
INSERT INTO AUTORE VALUES ( 12,'Owen','Barbara' );
INSERT INTO AUTORE VALUES ( 13,'Williams','Peter' );
INSERT INTO AUTORE VALUES ( 14,'Kafka','Franz' );
INSERT INTO AUTORE VALUES ( 15,'Novalis',NULL );
INSERT INTO AUTORE VALUES ( 16,'Lovecraft','H.P.' );
INSERT INTO AUTORE VALUES ( 17,'Paz','Octavio' );
INSERT INTO AUTORE VALUES ( 18,'Camus','Albert' );
INSERT INTO AUTORE VALUES ( 19,'Castleman','Riva' );
INSERT INTO AUTORE VALUES ( 20,'Zimbardo','Philip' );
INSERT INTO AUTORE VALUES ( 21,'Gimferrer','Pere' );
INSERT INTO AUTORE VALUES ( 22,'Southworth','Rod' );
INSERT INTO AUTORE VALUES ( 23,'Wray','Robert' );


INSERT INTO LIBRO VALUES ( '0180','Shyness','BB','PSY',7.65,'Y' );
INSERT INTO LIBRO VALUES ( '0189','Kane and Abel','PB','FIC',5.55,'Y' );
INSERT INTO LIBRO VALUES ( '0200','Stranger','BB','FIC',8.75,'Y' );
INSERT INTO LIBRO VALUES ( '0378','Dunwich Horror and Others','PB','HOR',19.75,'N' );
INSERT INTO LIBRO VALUES ( '079X','Smokescreen','PB','MYS',4.55,'Y' );
INSERT INTO LIBRO VALUES ( '0808','Knockdown','PB','MYS',4.75,'Y' );
INSERT INTO LIBRO VALUES ( '1351','Cujo','SI','HOR',6.65,'Y' );
INSERT INTO LIBRO VALUES ( '1382','Marcel Duchamp','PB','ART',11.25,'Y' );
INSERT INTO LIBRO VALUES ( '138X','Death on the Nil','BB','MYS',3.95,'Y' );
INSERT INTO LIBRO VALUES ( '2226','Ghost from the Grand Banks','BB','SFI',19.95,'N' );
INSERT INTO LIBRO VALUES ( '2281','Prints of the 20th Century','PB','ART',13.25,'Y' );
INSERT INTO LIBRO VALUES ( '2766','Prodigal Daughter','PB','FIC',5.45,'Y' );
INSERT INTO LIBRO VALUES ( '2908','Hymns to the Night','BB','POE',6.75,'Y' );
INSERT INTO LIBRO VALUES ( '3350','Higher Creativity','PB','PSY',9.75,'Y' );
INSERT INTO LIBRO VALUES ( '3743','First Among Equals','PB','FIC',3.95,'Y' );
INSERT INTO LIBRO VALUES ( '3906','Vortex','BB','SUS',5.45,'Y' );
INSERT INTO LIBRO VALUES ( '5163','Organ','SI','MUS',16.95,'Y' );
INSERT INTO LIBRO VALUES ( '5790','Database Systems','BF','CS',54.95,'N' );
INSERT INTO LIBRO VALUES ( '6128','Evil Under the Sun','PB','MYS',4.45,'Y' );
INSERT INTO LIBRO VALUES ( '6328','Vixen 07','BB','SUS',5.55,'Y' );
INSERT INTO LIBRO VALUES ( '669X','A Guide to SQL','BF','CS',23.95,'Y' );
INSERT INTO LIBRO VALUES ( '6908','DOS Essentials','BF','CS',20.50,'Y' );
INSERT INTO LIBRO VALUES ( '7405','Night Probe','BB','SUS',5.65,'Y' );
INSERT INTO LIBRO VALUES ( '7443','Carrie','SI','HOR',6.75,'Y' );
INSERT INTO LIBRO VALUES ( '7559','Risk','PB','MYS',3.95,'Y' );
INSERT INTO LIBRO VALUES ( '7947','dBASE Programming','BF','CS',39.90,'Y' );
INSERT INTO LIBRO VALUES ( '8092','Magritte','SI','ART',21.95,'N' );
INSERT INTO LIBRO VALUES ( '8720','Castle','BB','FIC',12.15,'Y' );
INSERT INTO LIBRO VALUES ( '9611','Amerika','BB','FIC',10.95,'Y' );


INSERT INTO HASCRITTO VALUES ( '0180',20,1 );
INSERT INTO HASCRITTO VALUES ( '0189',01,1 );
INSERT INTO HASCRITTO VALUES ( '0200',18,1 );
INSERT INTO HASCRITTO VALUES ( '0378',16,1 );
INSERT INTO HASCRITTO VALUES ( '079X',04,1 );
INSERT INTO HASCRITTO VALUES ( '0808',04,1 );
INSERT INTO HASCRITTO VALUES ( '1351',06,1 );
INSERT INTO HASCRITTO VALUES ( '1382',17,1 );
INSERT INTO HASCRITTO VALUES ( '138X',02,1 );
INSERT INTO HASCRITTO VALUES ( '2226',03,1 );
INSERT INTO HASCRITTO VALUES ( '2281',19,1 );
INSERT INTO HASCRITTO VALUES ( '2766',01,1 );
INSERT INTO HASCRITTO VALUES ( '2908',15,1 );
INSERT INTO HASCRITTO VALUES ( '3350',10,1 );
INSERT INTO HASCRITTO VALUES ( '3350',11,2 );
INSERT INTO HASCRITTO VALUES ( '3743',01,1 );
INSERT INTO HASCRITTO VALUES ( '3906',05,1 );
INSERT INTO HASCRITTO VALUES ( '5163',12,2 );
INSERT INTO HASCRITTO VALUES ( '5163',13,1 );
INSERT INTO HASCRITTO VALUES ( '5790',07,1 );
INSERT INTO HASCRITTO VALUES ( '5790',08,2 );
INSERT INTO HASCRITTO VALUES ( '6128',02,1 );
INSERT INTO HASCRITTO VALUES ( '6328',05,1 );
INSERT INTO HASCRITTO VALUES ( '669X',07,1 );
INSERT INTO HASCRITTO VALUES ( '6908',22,1 );
INSERT INTO HASCRITTO VALUES ( '7405',05,1 );
INSERT INTO HASCRITTO VALUES ( '7443',06,1 );
INSERT INTO HASCRITTO VALUES ( '7559',04,1 );
INSERT INTO HASCRITTO VALUES ( '7947',07,1 );
INSERT INTO HASCRITTO VALUES ( '7947',23,2 );
INSERT INTO HASCRITTO VALUES ( '8092',21,1 );
INSERT INTO HASCRITTO VALUES ( '8720',14,1 );
INSERT INTO HASCRITTO VALUES ( '9611',14,1 );


INSERT INTO SCORTA VALUES ( '0180',1,2 );
INSERT INTO SCORTA VALUES ( '0189',2,2 );
INSERT INTO SCORTA VALUES ( '0200',1,1 );
INSERT INTO SCORTA VALUES ( '0200',2,3 );
INSERT INTO SCORTA VALUES ( '079X',2,1 );
INSERT INTO SCORTA VALUES ( '079X',3,2 );
INSERT INTO SCORTA VALUES ( '079X',4,3 );
INSERT INTO SCORTA VALUES ( '1351',1,1 );
INSERT INTO SCORTA VALUES ( '1351',2,4 );
INSERT INTO SCORTA VALUES ( '1351',3,2 );
INSERT INTO SCORTA VALUES ( '138X',2,3 );
INSERT INTO SCORTA VALUES ( '2226',1,3 );
INSERT INTO SCORTA VALUES ( '2226',3,2 );
INSERT INTO SCORTA VALUES ( '2226',4,1 );
INSERT INTO SCORTA VALUES ( '2281',4,3 );
INSERT INTO SCORTA VALUES ( '2766',3,2 );
INSERT INTO SCORTA VALUES ( '2908',1,3 );
INSERT INTO SCORTA VALUES ( '2908',4,1 );
INSERT INTO SCORTA VALUES ( '3350',1,2 );
INSERT INTO SCORTA VALUES ( '3906',2,1 );
INSERT INTO SCORTA VALUES ( '3906',3,2 );
INSERT INTO SCORTA VALUES ( '5163',1,1 );
INSERT INTO SCORTA VALUES ( '5790',4,2 );
INSERT INTO SCORTA VALUES ( '6128',2,4 );
INSERT INTO SCORTA VALUES ( '6128',3,3 );
INSERT INTO SCORTA VALUES ( '6328',2,2 );
INSERT INTO SCORTA VALUES ( '669X',1,1 );
INSERT INTO SCORTA VALUES ( '6908',2,2 );
INSERT INTO SCORTA VALUES ( '7405',3,2 );
INSERT INTO SCORTA VALUES ( '7559',2,2 );
INSERT INTO SCORTA VALUES ( '7947',2,2 );
INSERT INTO SCORTA VALUES ( '8092',3,1 );
INSERT INTO SCORTA VALUES ( '8720',1,3 );
INSERT INTO SCORTA VALUES ( '9611',1,2 );

/* 1 - Elencare tutti i libri presenti inseriti nella tabella LIBRI */
SELECT *
FROM libro;

/* 2 - Elencare il nome di ciascun editore */
SELECT nome 
FROM editore;

/* 3 - Elencare il nome di ciascuna filiale che ha almeno 10 dipendenti */
SELECT nome
FROM filiale
WHERE numero_dipendenti >= 10;

/* 4 - Elencare il codice e il titolo di tutti i libri */
SELECT codice, titolo
FROM libro;

/* 5 - Listare per intero la tabella EDITORI */
SELECT *
FROM editore;

/* 6 - Elencare i nomi di tutti gli editori che risiedono nello stato di New York */
SELECT nome
FROM editore
WHERE stato = 'NY';

/* 7 - Elencare i nomi di tutti gli editori che non risiedono nello stato di New York */
/* Altre soluzioni oltre al WHERE NOT sono <> e WHERE stato NOT LIKE */
SELECT nome
FROM editore
WHERE NOT stato = 'NY';

/* 8 - Elencare i nomi di ogni filiale che abbia almeno 10 dipendenti */
SELECT nome
FROM filiale
WHERE numero_dipendenti >= 10;

/* 9 - Elencare il codice e il titolo di tutti i libri il cui tipo sia HOR */
SELECT codice, titolo
FROM libro
WHERE tipo = 'HOR';

/* 10 - Elencare il codice e il titolo di tutti i libri il cui tipo sia HOR e che siano paperback */
SELECT codice, titolo
FROM libro
WHERE tipo = 'HOR' AND paperback = 'Y';

/* 11 - Elencare il codice e il titolo di tutti i libri il cui tipo sia HOR oppure che abbiano PB come codice editore */
SELECT codice, titolo
FROM libro
WHERE tipo = 'HOR' OR codice_editore = 'PB';

/* 12 - Elencare codice, titolo e prezzo di ciascun libro che abbia un prezzo compreso tra 10 e 20 Euro */
SELECT codice, titolo, prezzo
FROM libro
WHERE prezzo BETWEEN 10 AND 20;

/* 13 - Elencare il codice e il titolo di ciascun libro il cui tipo sia MYS e che abbia un prezzo inferiore a 20 Euro */
SELECT codice, titolo
FROM libro
WHERE tipo = 'MYS' AND prezzo < 20;

/* 14 - Per ogni libro, elencare codice libro, titolo, codice editore e nome dell'editore */
SELECT libro.codice AS codice_libro, titolo AS titolo_editore, editore.codice AS codice_editore, nome AS nome_editore
FROM libro
INNER JOIN editore
ON editore.codice = libro.codice_editore;

/* 15 - Per ogni libro pubblicato da Signet, elencare titolo e prezzo */
SELECT titolo, prezzo
FROM libro
INNER JOIN editore
ON editore.codice = libro.codice_editore
WHERE nome = 'Signet';

/* 16 -  Elencare titolo e codice di ogni libro pubblicato da Bantam Books il cui prezzo sia maggiore di 10 Euro */
SELECT libro.codice, titolo
FROM libro
INNER JOIN editore
ON editore.codice = libro.codice_editore
WHERE nome = 'Bantam Books' AND prezzo > 10;

/* 17 - Elencare codice, titolo e copie disponibili di ogni libro esistente nella filiale numero 3 */
SELECT libro.codice, titolo, numero_copie_disponibili
FROM libro
INNER JOIN scorta
ON scorta.codice_libro = libro.codice
INNER JOIN filiale
ON filiale.numero_filiale = scorta.numero_filiale
WHERE filiale.numero_filiale = 3;

/* 18 -  Elencare i titoli di ogni libro di tipo PSY che sia stato pubblicato da “Best and Furrow” */
SELECT titolo
FROM libro
INNER JOIN editore
ON editore.codice = libro.codice_editore
WHERE tipo = 'PSY' AND nome = 'Best and Furrow'; 

/* 19 -  Elencare i titoli di tutti i libri scritti dall'autore 01. Utilizzare l'operatore IN nella formulazione */
SELECT titolo
FROM libro
INNER JOIN hascritto
ON hascritto.codice_libro = libro.codice
INNER JOIN autore
ON autore.numero_autore = hascritto.numero_autore
WHERE autore.numero_autore IN (01);

/* 20 -  Ripetere l'esercizio 4 utilizzando EXISTS nella formulazione */
SELECT libro.codice, titolo, numero_copie_disponibili
FROM libro
INNER JOIN scorta
ON scorta.codice_libro = libro.codice
INNER JOIN filiale
ON filiale.numero_filiale = scorta.numero_filiale
WHERE EXISTS(
	SELECT *
	FROM filiale
	WHERE filiale.numero_filiale = 3 AND filiale.numero_filiale = scorta.numero_filiale
);