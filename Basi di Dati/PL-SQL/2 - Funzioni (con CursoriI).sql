CREATE TABLE account (
	user_id serial PRIMARY KEY,
	username varchar (100),
	password varchar (100),
	created_on timestamp,
	last_login timestamp,
	amount numeric(10,2)
);

SET DATESTYLE = 'ISO,DMY';

INSERT INTO account (username, password, created_on, last_login, amount) VALUES
('userA', 'abcde', '03/05/2022', '03/05/2022',10.2),
('userC', '12345', '06/05/2022', '06/05/2022', 5),
('userB', 'qwerty', '10/05/2022', '12/05/2022', 17.5),
('userD', 'abcde', '12/05/2022', '14/05/2022', 14.6),
('Mario', 'abcde', '25/05/2022', '27/05/2022', 17.5),
('Luca', 'password', '28/05/2022', '30/05/2022', 6),
('Anna', 'abcde', '03/06/2022', '12/06/2022', 11);

-- 1) Creare una funzione 'output_password' che stampi in output il nome utente e la relativa password di ogni utente in un'unica stringa. Utilizzare cursore
CREATE OR REPLACE FUNCTION output_password()
RETURNS TEXT
LANGUAGE plpgsql
AS $$
DECLARE
    output_string TEXT := '';
    target_username VARCHAR;
    target_password VARCHAR;
    account_cursor CURSOR FOR
        SELECT username, password
	    FROM account;
BEGIN 
OPEN account_cursor;
LOOP
    FETCH NEXT FROM account_cursor INTO target_username, target_password;
	EXIT WHEN NOT FOUND;
    output_string := output_string || '(' || target_username || ' ' || target_password || '), ';
END LOOP;
    RETURN output_string;
CLOSE account_cursor;
END
$$;

SELECT output_password();


/* 2) Creare una funzione 'aggiorna_password' che effettui l'aggiornamento dell'utente Mario con la nuova password 'qzerty'.
Utilizzare una struttura di controllo e una stringa esplicativa come output. */
CREATE OR REPLACE FUNCTION aggiorna_password()
RETURNS TEXT 
LANGUAGE plpgsql
AS $$
DECLARE 
    output_string TEXT := '';
	password_aggiornata TEXT := 'qzerty';
BEGIN
    UPDATE account
    SET password = password_aggiornata
    WHERE username = 'Mario';
IF FOUND THEN
    output_string := 'La password di Mario è stata aggiornata con: ' || password_aggiornata || '.';
  ELSE
    output_string := 'Nessun utente di nome Mario trovato.';
END IF;
  RETURN output_string;
END;
$$;

SELECT aggiorna_password();

-- 3) Creare una funzione 'concat_row_count' che, passati tabella, colonna e password 'abcde', restituisca il conteggio delle righe con la stessa password 
CREATE OR REPLACE FUNCTION concat_row_count()
RETURNS TEXT 
LANGUAGE plpgsql
AS
$$
DECLARE
    password_aggiornata TEXT :=  'abcde';
    conteggio_row INTEGER;
    output_string TEXT := '';
BEGIN
    SELECT COUNT(*)
	INTO conteggio_row
	FROM account
	WHERE password = password_aggiornata;
IF FOUND THEN
    output_string := conteggio_row;
ELSE
    output_string := 'Nessuna password "abcde" trovata';
END IF;
    RETURN output_string;
END;
$$;

SELECT concat_row_count();

/* 4) Creare funzione chiamata ‘calcolo_iva’ che passato un importo netto
e il tipo di prodotto tra alimentari, servizi base e altri prodotti
(identificati dalle corrispondenti aliquote) ritorni l'iva da applicare su
tale importo. Fornire in output una stringa che specifichi l’aliquota
applicata al prodotto e il suo prezzo ivato finale */
CREATE OR REPLACE FUNCTION calcolo_iva(importo_netto INTEGER, tipo_prodotto VARCHAR)
RETURNS TEXT 
LANGUAGE plpgsql
AS
$$
DECLARE
importo_ivato INTEGER;
aliquota FLOAT;
BEGIN
    CASE tipo_prodotto
        WHEN 'alimentari' THEN
            aliquota := 0.1;      -- Aliquota IVA per prodotti alimentari (10%)
        WHEN 'servizi base' THEN
            aliquota := 0.2;      -- Aliquota IVA per servizi base (20%)
        WHEN 'altri prodotti' THEN
            aliquota := 0.22;     -- Aliquota IVA per altri prodotti (22%)
        ELSE
            RAISE EXCEPTION 'Tipo di prodotto non valido';
    END CASE;
    
    importo_ivato := importo_netto + (importo_netto * aliquota);
    RETURN 'Aliquota IVA: ' || (aliquota * 100)::text || '%, Prezzo ivato finale: ' || importo_ivato::text;
END;
$$

SELECT calcolo_iva(1000, 'servizi base');









