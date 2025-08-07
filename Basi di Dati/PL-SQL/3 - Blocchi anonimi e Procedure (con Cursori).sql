CREATE TABLE attori (
	cod_attore integer PRIMARY KEY,
	nome varchar (40),
	cognome varchar (40),
	anno_nascita integer,
	nazionalita varchar (40)
);

CREATE TABLE film (
	cod_film integer PRIMARY KEY,
	titolo varchar (400),
	anno_produzione integer,
	nazionalita varchar (40),
	regista varchar (40),
	genere varchar (30)
);

CREATE TABLE sale (
	cod_sala integer PRIMARY KEY,
	posti integer,
	nome varchar (40),
	citta varchar (40)
);

CREATE TABLE recita (
	cod_attore integer,	
	cod_film integer,	
	PRIMARY KEY (cod_attore, cod_film),	
	FOREIGN KEY (cod_attore) REFERENCES attori(cod_attore) ON DELETE CASCADE ON UPDATE CASCADE, FOREIGN KEY (cod_film) REFERENCES film(cod_film) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE proiezioni (
	cod_proiezione integer PRIMARY KEY,
	cod_film integer,
	cod_sala integer,
	incasso integer,
	data_proiezione date,
	FOREIGN KEY (cod_sala) REFERENCES sale (cod_sala) ON DELETE CASCADE ON UPDATE CASCADE, FOREIGN KEY (cod_film) REFERENCES film (cod_film) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO attori (cod_attore, nome, cognome, anno_nascita, nazionalita)
VALUES
(1, 'Tom', 'Hanks', 1956, 'USA'),
(2, 'Meryl', 'Streep', 1949, 'USA'),
(3, 'Leonardo', 'DiCaprio', 1974, 'USA'),
(4, 'Julia', 'Roberts', 1967, 'USA'),
(5, 'Brad', 'Pitt', 1963, 'USA'),
(6, 'Natalie', 'Portman', 1981, 'USA'),
(7, 'Johnny', 'Depp', 1963, 'USA'),
(8, 'Cate', 'Blanchett', 1969, 'Australia'),
(9, 'Denzel', 'Washington', 1954, 'USA'),
(10, 'Angelina', 'Jolie', 1975, 'USA'),
(11, 'Scarlett', 'Johansson', 1984, 'USA'),
(12, 'Javier', 'Bardem', 1969, 'Spain'),
(13, 'Emma', 'Stone', 1988, 'USA'),
(14, 'Hugh', 'Jackman', 1968, 'Australia'),
(15, 'Anne', 'Hathaway', 1982, 'USA')
;



INSERT INTO film (cod_film, titolo, anno_produzione, nazionalita, regista, genere)
VALUES
(1, 'Forrest Gump', 1994, 'USA', 'Robert Zemeckis', 'Drama'),
(2, 'The Devil Wears Prada', 2006, 'USA', 'David Frankel', 'Comedy'),
(3, 'Inception', 2010, 'USA', 'Christopher Nolan', 'Sci-Fi'),
(4, 'Gladiator', 2000, 'USA', 'Ridley Scott', 'Action'),
(5, 'Titanic', 1997, 'USA', 'James Cameron', 'Romance'),
(6, 'Pirates of the Caribbean: The Curse of the Black Pearl', 2003, 'USA', 'Gore Verbinski', 'Adventure'),
(7, 'La La Land', 2016, 'USA', 'Damien Chazelle', 'Musical'),
(8, 'The Matrix', 1999, 'USA', 'Lana Wachowski', 'Sci-Fi'),
(9, 'The Dark Knight', 2008, 'USA', 'Christopher Nolan', 'Action'),
(10, 'Inglourious Basterds', 2009, 'USA', 'Quentin Tarantino', 'War'),
(11, 'Black Swan', 2010, 'USA', 'Darren Aronofsky', 'Drama'),
(12, 'No Country for Old Men', 2007, 'USA', 'Joel Coen', 'Crime'),
(13, 'La La Land', 2016, 'USA', 'Damien Chazelle', 'Musical'),
(14, 'Avatar', 2009, 'USA', 'James Cameron', 'Adventure'),
(15, 'The Shawshank Redemption', 1994, 'USA', 'Frank Darabont', 'Drama')
;



INSERT INTO sale (cod_sala, posti, nome, citta)
VALUES
(1, 100, 'Sala 1', 'New York'),
(2, 120, 'Sala 2', 'Los Angeles'),
(3, 80, 'Sala 3', 'Chicago'),
(4, 150, 'Sala 4', 'San Francisco'),
(5, 90, 'Sala 5', 'Miami'),
(6, 110, 'Sala 6', 'Las Vegas'),
(7, 130, 'Sala 7', 'Boston'),
(8, 100, 'Sala 8', 'Seattle'),
(9, 120, 'Sala 9', 'Houston'),
(10, 80, 'Sala 10', 'Dallas'),
(11, 100, 'Sala 11', 'Phoenix'),
(12, 120, 'Sala 12', 'Denver'),
(13, 80, 'Sala 13', 'Atlanta'),
(14, 150, 'Sala 14', 'Philadelphia'),
(15, 90, 'Sala 15', 'Detroit')
;



INSERT INTO recita (cod_attore, cod_film)
VALUES
(1, 1),
(1, 5),
(2, 4),
(2, 7),
(3, 3),
(3, 8),
(4, 2),
(4, 11),
(5, 6),
(5, 10),
(6, 12),
(6, 13),
(7, 9),
(7, 14),
(8, 15),
(8, 1),
(9, 2),
(9, 5),
(10, 3),
(10, 7)
;



INSERT INTO proiezioni (cod_proiezione, cod_film, cod_sala, incasso, data_proiezione)
VALUES
(1, 1, 1, 1000, '2023-09-01'),
(2, 2, 2, 1200, '2023-09-02'),
(3, 3, 3, 800, '2023-09-03'),
(4, 4, 4, 1500, '2023-09-04'),
(5, 5, 5, 900, '2023-09-05'),
(6, 6, 6, 1100, '2023-09-06'),
(7, 7, 7, 1300, '2023-09-07'),
(8, 8, 8, 1000, '2023-09-08'),
(9, 9, 9, 1200, '2023-09-09'),
(10, 10, 10, 800, '2023-09-10'),
(11, 11, 11, 1000, '2023-09-11'),
(12, 12, 12, 1200, '2023-09-12'),
(13, 13, 13, 800, '2023-09-13'),
(14, 14, 14, 1500, '2023-09-14'),
(15, 15, 15, 900, '2023-09-15');

-- 1) Stampare il numero totale degli attori italiani (esempio di blocco anonimo)
DO
LANGUAGE plpgsql
$$

DECLARE
v_attori attori.cod_attore%TYPE;

BEGIN
SELECT COUNT(cod_attore)
INTO v_attori
FROM attori
WHERE nazionalita = 'USA';
RAISE NOTICE 'Ci sono % attori americani', v_attori;

END
$$;


-- 2) Selezionare titolo dei film con il codice 1210 (utilizzare il row type) 
DO
LANGUAGE plpgsql
$$

DECLARE
v_titolo film%ROWTYPE;

BEGIN
SELECT *
INTO v_titolo
FROM film
WHERE cod_film = 12;
RAISE NOTICE 'Il titolo del film è %', v_titolo.titolo;

END
$$;


-- 3a) Stampare titolo e nazionalità dei film con codice 1004 e poimil nome e numero di posti della sala codice 3 con il type
DO
LANGUAGE plpgsql
$$
DECLARE

v_titolo film.titolo%TYPE;
v_nazionalita film.nazionalita%TYPE;
v_nome sale.nome%TYPE;
v_posti sale.posti%TYPE;

BEGIN

SELECT titolo, nazionalita
INTO v_titolo, v_nazionalita
FROM film
WHERE cod_film = 10;


SELECT nome, posti
INTO v_nome, v_posti
FROM sale
WHERE cod_sala = 2;

RAISE NOTICE 'Titolo film: %, Nazionalità film: %, Nome sale: %, Posti sale: %', v_titolo, v_nazionalita, v_nome, v_posti;

END
$$;

-- 3b) Stampare titolo e nazionalità dei film con codice 1004 e poimil nome e numero di posti della sala codice 3 con il record
DO
LANGUAGE plpgsql
$$
DECLARE

rec1 record;
rec2 record;

BEGIN

SELECT *
INTO rec1
FROM film
WHERE cod_film = 10;


SELECT *
INTO rec2
FROM sale
WHERE cod_sala = 2;

RAISE NOTICE 'Titolo film: %, Nazionalita film: %, Nome sale: %, Posti sale: %', rec1.titolo, rec1.nazionalita, rec2.nome, rec2.posti;

END
$$;

-- 4) Stampare la città ed il numero totale dei posti delle sale di Napoli
DO
LANGUAGE plpgsql
$$

DECLARE 
rec record;

BEGIN 
SELECT citta , SUM(posti) AS numero_totale_posti
INTO rec
FROM sale
WHERE citta = 'Los Angeles'
GROUP BY sale.citta;

RAISE NOTICE 'Città: %', rec.citta;
RAISE NOTICE 'Numero posti: %', rec.numero_totale_posti;

END
$$;

-- 5) FACENDO RIFERIMENTO AL DB CINEMA... scrivere un blocco anonimo che stampi titolo ed incasso del film che ha incassato di più
DO
LANGUAGE plpgsql
$$
DECLARE 
	titolo_film VARCHAR;
	incasso_film VARCHAR;	
BEGIN 
	SELECT titolo, MAX(incasso)
	INTO titolo_film, incasso_film
	FROM film
	INNER JOIN proiezioni
	ON proiezioni.cod_film = film.cod_film
	GROUP BY film.titolo, proiezioni.incasso
	ORDER BY incasso DESC
	LIMIT 1;
	RAISE NOTICE 'titolo film: % - incasso film: %', titolo_film, incasso_film;
END
$$;

-- Esempio di procedura
CREATE OR REPLACE PROCEDURE insert(num_posti INTEGER, nome VARCHAR, citta VARCHAR)
LANGUAGE plpgsql
AS
$$

BEGIN
     INSERT INTO sale VALUES ((
		 SELECT MAX(cod_sala) + 1 FROM sale),
		 num_posti, 
		 nome, 
		 citta);
END
$$;
CALL insert (100, 'lovins', 'Napoli');

SELECT *
FROM sale;



-- 6) Creare una procedura che dato l'anno di produzione di un film stampi i titoli di film di quell'anno e la lunghezza dei caratteri del titolo (con il record)
CREATE OR REPLACE PROCEDURE stampa(anno INTEGER)
LANGUAGE plpgsql
AS
$$
DECLARE
rec record;
BEGIN
FOR rec IN
    SELECT titolo, LENGTH(titolo) AS lunghezza_caratteri_titolo
	FROM film
	WHERE anno = anno_produzione
LOOP
    RAISE NOTICE 'titolo del film: % - lunghezza dei caratteri del titolo: %', rec.titolo, rec.lunghezza_caratteri_titolo;
END LOOP;
END
$$;
CALL stampa(1994);

-- 7) Scrivere una procedura che prenda in input la misura della temperatura corporea
CREATE OR REPLACE PROCEDURE misuraTemperatura(temperatura FLOAT)
LANGUAGE plpgsql
AS
$$
DECLARE
messaggio VARCHAR;
BEGIN
  IF temperatura >= 35 AND temperatura < 37 THEN
    messaggio := 'Senza febbre';
  ELSIF temperatura >= 37 AND temperatura < 38 THEN
    messaggio := 'Febbre lieve';
  ELSIF temperatura > 38 AND temperatura <= 40 THEN
    messaggio := 'Febbre alta';
  ELSEIF temperatura > 40 THEN
    messaggio := 'Emergenza medica';
  ELSEIF temperatura < 35 THEN
    messaggio := 'Ripetere la misurazione';
  END IF;
  RAISE NOTICE 'Messaggio: %', messaggio;
END 
$$;

CALL misuraTemperatura(33.6);

-- 8) Creare una procedura che dato l'anno di produzione di un film stampi i titoli di film di quell'anno e la lunghezza dei caratteri del titolo (con il record e cursore)
CREATE OR REPLACE PROCEDURE stampa(anno INTEGER)
LANGUAGE plpgsql
AS
$$
DECLARE
    target_row record;
	film_cursor CURSOR FOR
	    SELECT titolo, LENGTH(titolo) AS lunghezza_caratteri_titolo
	    FROM film
	    WHERE anno = anno_produzione;
BEGIN
OPEN film_cursor;
LOOP
     -- Ottengo la riga successiva dal cursore e la assegno ad una variabile target
    FETCH NEXT FROM film_cursor INTO target_row;
	-- Se non mi rileva l'anno specifico inserito, salto alla prossima riga della tabella
	EXIT WHEN NOT FOUND;
    RAISE NOTICE 'titolo del film: % - lunghezza dei caratteri del titolo: %', target_row.titolo, target_row.lunghezza_caratteri_titolo;
END LOOP;
CLOSE film_cursor;
END
$$;
CALL stampa(1994);