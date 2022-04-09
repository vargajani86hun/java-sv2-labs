-- Az összes pizza név szerint csökkenő (fordított ABC?) sorrendben
SELECT * FROM pizza
ORDER BY nev DESC;

-- Az összes futár száma, akinek nem 'G'-vel kezdődik a neve
SELECT COUNT(*) FROM futar
WHERE NOT nev LIKE 'G%';

-- Egyes napok rendeléseinek száma
SELECT rendeles.datum, COUNT(datum) AS rendeles_db
FROM rendeles
GROUP BY datum;

-- Délelőtti rendelések
SELECT * FROM rendeles
WHERE ido < 12;

-- Pizzák átlagos ára
SELECT ROUND(AVG(pizza.ar), 1) AS Atlag
FROM pizza;

-- Az összes megrendelés ideje, a megrendelő azonosítója és neve
SELECT rendeles.ido, vevo.id, vevo.nev
FROM rendeles JOIN vevo
ON rendeles.vevo_id = vevo.id;

-- Új oszlop (telefon VARCHAR(9)) beszúrása a 'vevo' táblába
ALTER TABLE vevo 
ADD telefon VARCHAR(9);

-- Új rekord a vevo táblába
SELECT @last_id := MAX(vevo.id) FROM vevo;
INSERT INTO vevo (id, nev, cim, telefon)
VALUE (@last_id + 1, 'Tigris', '100 holdas pagony', '503225566');

-- Pizzafutárok név szerint csökkenő(fordított ABC?) sorrendben
SELECT * FROM futar
ORDER BY futar.nev DESC;

-- Nem 'S'-betűvel kezdődő nevű vásárlók száma
SELECT COUNT(vevo.nev) AS 'vevők_száma(not_start_S)'
FROM vevo
WHERE vevo.nev NOT LIKE 'S%';

-- Délutáni rendelések
SELECT COUNT(*) AS delutani_rendelesek_db
FROM rendeles
WHERE ido > 12;

-- Rendelések átlagos időpontja
SELECT ROUND(AVG(rendeles.ido), 1) AS Atlag
FROM rendeles;

-- Összes megrendelés azonosítója, ideje és a megrendelő neve
SELECT rendeles.id, rendeles.ido, vevo.nev
FROM rendeles JOIN vevo
ON rendeles.vevo_id = vevo.id;

-- Születési év mező beszúrása a futár táblába
ALTER TABLE futar
ADD szuletesi_ev INT(4);

-- Új rekord a futar táblába
SELECT @last_id := MAX(futar.id) FROM futar;
INSERT INTO futar (id, nev, telefon, szuletesi_ev)
VALUE ((@last_id + 1), 'Turbócsiga', 703122289, 1993);

-- Vásárlók név szerint csökkenő(frodított ABC?) sorrendben
SELECT * FROM vevo
ORDER BY vevo.nev DESC;

-- Egy alkalommal rendelt pizzák átlagos száma
CREATE VIEW osszevont_tetel AS
SELECT SUM(db) AS db_per_rendeles
FROM tetel
GROUP BY rendeles_id;
		
SELECT ROUND(
	AVG(db_per_rendeles), 1
) AS Atlag
FROM osszevont_tetel

-- Az összes megrendelés azonosítója, megrendelő azonosítója és megrendelő neve
SELECT rendeles.id, rendeles.vevo_id, vevo.nev
FROM rendeles JOIN vevo
ON rendeles.vevo_id = vevo.id;

-- Átmérő mező beszúrása a pizza táblába
ALTER TABLE pizza
ADD atmero INT(4);

-- Új pizza rekord beszúrása
SELECT @last_id := MAX(id) FROM pizza;
INSERT INTO pizza
VALUES ((@last_id + 1), 'Margherita', 720, 32);
