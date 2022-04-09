-- 1000Ft-nál drágább termékek
SELECT * FROM termek WHERE ar > 1000;

-- Morgó rendeléseinek száma
SELECT COUNT(vasarlo_id) AS "Morgó rendelései" 
FROM rendeles WHERE vasarlo_id = 
(SELECT id FROM vasarlo WHERE nev = "Morgó");

-- Ki vásárolta meg az egyes rendeléseket?
SELECT rendeles.id, vasarlo.nev AS "ugyfel"
FROM rendeles INNER JOIN vasarlo
ON rendeles.vasarlo_id = vasarlo.id

-- Összes rendelt mennyiség a termékekből árral
SELECT termek.id, termek.nev, 
SUM(tetel.db) AS "összes_db", termek.ar
FROM tetel RIGHT JOIN termek
ON tetel.termek_id = termek.id
GROUP BY termek.id;

-- Délutáni rendelések
SELECT rendeles.id, rendeles.vasarlo_id, rendeles.elado_id,
rendeles.datum, rendeles.ido, tetel.termek_id, termek.nev
FROM ((rendeles INNER JOIN tetel ON rendeles.id = tetel.rendeles_id)
INNER JOIN termek ON tetel.termek_id = termek.id)
WHERE rendeles.ido > 12;

-- A legolcsóbb termék
SELECT termek.id, termek.nev, MIN(termek.ar) AS ar
FROM termek;

-- Az 1000Ft-nál olcsóbb termékek
SELECT * FROM termek
WHERE termek.ar < 1000;

-- Szende rendeléseinek száma
SELECT COUNT(vasarlo_id) AS "Szende rendelései" FROM rendeles
WHERE vasarlo_id = 
	(SELECT id FROM vasarlo 
	WHERE nev = "Szende");

-- Rendelések értékesítője
SELECT rendeles.*, elado.nev AS "elado"
FROM rendeles INNER JOIN elado
ON rendeles.elado_id = elado.id;

-- Összes rendelt mennyiség a termékekből termék névvel
SELECT SUM(tetel.db) AS "összes_db", termek.nev
FROM tetel INNER JOIN termek
ON tetel.termek_id = termek.id
GROUP BY tetel.termek_id;

-- Délelőtti rendelések és termékeik neve
SELECT rendeles.*, termek.nev
FROM (rendeles INNER JOIN
	(tetel INNER JOIN termek
		ON tetel.termek_id = termek.id)
	ON rendeles.id = tetel.rendeles_id
)
WHERE rendeles.ido < 12;

-- Legdrágább termék
SELECT termek.id, termek.nev, MAX(termek.ar) AS ar
FROM termek;

-- Eddig még nem értékesített termékek
SELECT termek.*, SUM(tetel.db) AS db
FROM termek LEFT JOIN tetel ON tetel.termek_id = termek.id
GROUP BY termek.id
HAVING SUM(tetel.db) IS NULL;
