CREATE DATABASE dipendenti;

CREATE TABLE dipendenti (
	id SERIAL PRIMARY KEY,
	nome varchar (255),
	data varchar (255),
	email varchar (255),
	nazione varchar (100)
);

INSERT INTO dipendenti (nome,data,email,nazione) VALUES
('Iliana English','26/07/1982','nascetur.ridiculus@aol.org','Brazil'),
('Scarlet Slater','02/08/1998','tempus.scelerisque@hotmail.couk','New Zealand'),
('Phyllis Fox','13/09/1987','cursus.luctus.ipsum@hotmail.com','India'),
('Zia Clemons','30/05/1996','nulla.aliquet@protonmail.edu','Turkey'),
('Leroy Wolf','27/11/1991','donec.dignissim@icloud.org','Spain'),
('Tanisha Bradley','06/03/1981','nec.metus.facilisis@protonmail.org','United States'),
('Dean Drake','20/10/1993','a@aol.com','Mexico'),
('Urielle Sweet','16/01/1993','lacus@aol.ca','Australia'),
('Liberty Puckett','19/02/1984','sollicitudin@protonmail.edu','Russian Federation'),
('Bell Horne','26/03/1997','luctus@hotmail.ca','Ireland'),
('Giselle Norris','19/08/1983','aliquam.enim@aol.edu','Turkey'),
('Blaze Lowery','08/08/1993','odio.sagittis@icloud.com','Russian Federation'),
('Mannix Whitney','24/05/1983','ac.risus@google.net','Belgium'),
('Indira Chaney','06/05/1983','imperdiet.nec.leo@protonmail.com','France'),
('Slade Wheeler','13/07/1986','gravida.non@hotmail.org','New Zealand');



1) CREATE TABLE controllo_dipendenti (
	operazione CHAR (1),
	dataOperazione TIMESTAMP,
	nomeUtente varchar
);



2) CREATE OR REPLACE FUNCTION processo_controllo_dipendenti() 
RETURNS TRIGGER 
LANGUAGE PLPGSQL
AS $controllo$
BEGIN

	IF (TG_OP = 'DELETE') THEN INSERT INTO controllo_dipendenti SELECT 'D', now(), user;
	ELSIF (TG_OP = 'UPDATE') THEN INSERT INTO controllo_dipendenti SELECT 'U', now(), user;
	ELSIF (TG_OP = 'INSERT') THEN INSERT INTO controllo_dipendenti SELECT 'I', now(), user;
	END IF;
	RETURN NULL;
END
$controllo$;



3) CREATE TRIGGER controllo
AFTER INSERT OR UPDATE OR DELETE ON dipendenti
FOR EACH ROW EXECUTE FUNCTION processo_controllo_dipendenti();



4) INSERT INTO dipendenti (nome,data,email,nazione) VALUES
('Keaton Dudley','11/10/1996','cras.convallis@hotmail.ca','United Kingdom');

UPDATE dipendenti SET nome = 'Studente ITS' WHERE nome = 'Urielle Sweet';

SELECT *
FROM dipendenti;

DELETE FROM dipendenti WHERE nome = 'Studente ITS';