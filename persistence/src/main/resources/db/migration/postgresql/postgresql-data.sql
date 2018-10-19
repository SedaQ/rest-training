--
-- PostgreSQL database dump
--

-- Dumped from database version 10.4
-- Dumped by pg_dump version 10.4

-- Started on 2018-09-08 21:38:47

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 2239 (class 0 OID 18014)
-- Dependencies: 196
-- Data for Name: address; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (1, 'Holice', 315, 'Nad Splavem', '53401');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (2, 'Holice', 325, 'Nad Splavem', '53401');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (3, 'Pardubice', 972, 'Emy Destinnové', '53201');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (4, 'Praha', 136, 'Boženy Němcové', '14100');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (5, 'Vsetín', 6, 'Sedličky', '75501');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (6, 'Hradec Králové', 182, 'Pražské předměstí', '50006');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (7, 'Pardubice', 467, 'Revoluční', '53201');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (8, 'Brno', 2, 'Technická', '61669');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (9, 'Brno', 95, 'Babí', '61400');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (10, 'Holice', 232, 'Husova', '53401');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (11, 'Plzeň', 20, 'Škroupova', '30632');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (12, 'Plzeň', 150, 'Blodkova', '30632');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (13, 'Plzeň', 152, 'Blodkova', '30632');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (14, 'Plzeň', 47, 'Kaštanová', '30632');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (15, 'Plzeň', 289, 'Husova', '30632');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (16, 'Plzeň', 932, 'Tikova', '30632');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (17, 'Plzeň', 491, 'Husova', '30632');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (18, 'Plzeň', 974, 'Školní', '30632');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (19, 'Plzeň', 976, 'Školní', '30632');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (20, 'Plzeň', 657, 'Hronova', '30632');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (21, 'Plzeň', 114, 'Na Poříčí', '30632');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (22, 'Hradec Králové', 196, 'Pražské předměstí', '50006');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (23, 'Hradec Králové', 754, 'Nový Hradec', '50006');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (24, 'Hradec Králové', 97, 'Pardubická', '50006');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (25, 'Hradec Králové', 628, 'Govorova', '50006');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (26, 'Hradec Králové', 159, 'Rokycanova', '50006');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (27, 'Lanškroun', 514, 'Pod Lípou', '56301');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (28, 'Lanškroun', 154, 'Pražské předměstí', '56301');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (29, 'Lanškroun', 419, 'Zámecká', '56301');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (30, 'Lanškroun', 708, 'Jiráskova', '56301');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (31, 'Pardubice', 1530, 'Mahonova', '53201');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (32, 'Pardubice', 1284, 'Přemyslova', '53201');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (33, 'Pardubice', 485, 'Albertova', '53201');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (34, 'Pardubice', 71, 'Tyršova', '53201');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (35, 'Pardubice', 829, 'Kladská', '53201');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (36, 'Prachatice', 103, 'Pražská', '38301');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (37, 'Albrechtice nad Orlicí', 128, 'V Kopečku', '51722');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (38, 'Albrechtice nad Orlicí', 824, 'Nad Stávkem', '51722');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (39, 'Albrechtice nad Orlicí', 228, 'Na Pomezí', '51722');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (40, 'Albrechtice nad Orlicí', 128, 'T. G. Masaryka', '51722');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (41, 'Brno', 7, 'Masarykova 4', '234asd');
INSERT INTO public.address (id_address, city, house_number, street, zip_code) VALUES (42, 'Brno', 7, 'Masarykova 4', '234asd');


--
-- TOC entry 2243 (class 0 OID 18024)
-- Dependencies: 200
-- Data for Name: contact_type; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.contact_type (id_contact_type, title) VALUES (1, 'icq');
INSERT INTO public.contact_type (id_contact_type, title) VALUES (4, 'mail');
INSERT INTO public.contact_type (id_contact_type, title) VALUES (2, 'skype');
INSERT INTO public.contact_type (id_contact_type, title) VALUES (3, 'tel');


--
-- TOC entry 2247 (class 0 OID 18037)
-- Dependencies: 204
-- Data for Name: person; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (1, 64, '1968-09-06', 'radek.kruta@seznam.cz', 'Radek', 'kruťas', '$2a$06$.6R1EE2VOaiiyua8Po1AGuln9RmDQwJCCFune0gw5qzoM05kwXsnC', 'Krůta', 34);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (2, 24, '1984-12-06', 'tomas.lorenc@seznam.cz', 'Tomáš', 'Lorenc', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Lorenc', 2);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (3, 25, '1982-01-20', 'milan.hruda@seznam.cz', 'Milan', 'Hrudík', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Hruda', 3);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (4, 28, '1983-05-25', 'david.kunz@seznam.cz', 'David', 'Smeták', '$2a$06$5egRMk4kGsT.AOEYqmriie/Win7xtL/m5Q2Yg8WN8khZ15siuOJqe', 'Kunz', 4);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (5, 31, '1980-03-09', 'michal.zednik@seznam.cz', 'Michal', 'Zedňas', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Zedník', 5);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (6, 40, '1982-10-20', 'jaroslav.zemek@seznam.cz', 'Jaroslav', 'Zemák', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Zemek', 6);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (7, 38, '1979-10-11', 'tomas.tomasik@seznam.cz', 'Tomáš', 'Tomák', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Tomašík', 7);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (8, 16, '1986-04-29', 'radek.veleba@seznam.cz', 'Radek', 'Velebník', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Veleba', 8);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (9, 14, '1982-02-24', 'radovan.stupka@seznam.cz', 'Radovan', 'Stupík', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Stupka', 9);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (10, 13, '1981-05-13', 'jaroslav.mencik@seznam.cz', 'Jaroslav', 'Menča', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Menčík', 10);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (11, 15, '1984-06-14', 'miroslav.malinka@seznam.cz', 'Miroslav', 'Malina', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Malinka', 11);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (12, 17, '1985-07-27', 'lubomir.latal@seznam.cz', 'Lubomír', 'Látoš', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Látal', 10);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (13, 20, '1964-10-09', 'tomas.kubala@seznam.cz', 'Tomáš', 'Kubík', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Kubala', 12);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (14, 21, '1974-11-29', 'david.kalivoda@seznam.cz', 'David', 'Kalík', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Kalivoda', 13);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (15, 20, '1989-12-01', 'tomas.janda@seznam.cz', 'Tomáš', 'Smeták', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Janda', 14);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (16, 22, '1952-11-02', 'lubomir.fuchs@seznam.cz', 'Lubomír', 'Fucha', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Fuchs', 15);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (17, 21, '1980-12-20', 'stanislav.bartos@seznam.cz', 'Stanislav', 'Bárt', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Bartoš', 16);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (18, 28, '1942-07-16', 'svatoplu.benes@seznam.cz', 'Svatopluk', 'Beník', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Beneš', 17);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (19, 24, '1946-01-15', 'ondrej.ambros@seznam.cz', 'Ondřej', 'Ambřík', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Ambros', 18);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (20, 26, '1979-09-30', 'jaroslav.cermak@seznam.cz', 'Jaroslav', 'Čerma', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Čermák', 19);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (21, 25, '1982-06-19', 'jaroslava.cermakova@seznam.cz', 'Jaroslava', 'Jarča', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Čermáková', 19);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (22, 25, '1968-08-21', 'svatopluk.dupal@seznam.cz', 'Svatopluk', 'Dupi', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Dupal', 20);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (23, 25, '1975-11-18', 'ludek.hopersona@seznam.cz', 'Luděk', 'Hoperson', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Hopersona', 21);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (24, 24, '1978-05-26', 'lucie.hopersonova@seznam.cz', 'Lucie', 'Lusi', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Hopersonová', 21);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (25, 23, '1985-11-09', 'marketa.dankova@seznam.cz', 'Markéta', 'Daník', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Daňková', 22);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (26, 43, '1971-01-12', 'klara.judexova@seznam.cz', 'Klára', 'Emicka111', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Judexová', 23);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (27, 42, '1972-02-15', 'kristyna.kadlcikova@seznam.cz', 'Kristýna', 'Emiii4x4', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Kadlčíková', 24);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (28, 41, '1973-03-18', 'lada.kanyzova@seznam.cz', 'Lada', 'Helusska', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Kanýzová', 24);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (29, 45, '1974-04-25', 'lenka.kocmanova@seznam.cz', 'Lenka', 'hilary', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Kocmanová', 25);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (30, 46, '1975-05-01', 'lenka.kollarikova@seznam.cz', 'Lenka', 'Igneess', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Kollariková', 26);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (31, 41, '1981-10-24', 'lenka.kollmanova@seznam.cz', 'Lenka', 'katulka68', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Kollmannová', 27);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (32, 38, '1976-11-28', 'lenka.kovackova@seznam.cz', 'Lenka', 'kiikushka', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Kovačková', 28);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (33, 34, '1977-12-21', 'andrea.kollmanova@seznam.cz', 'Andrea', 'anďa', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Kollmannová', 29);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (34, 36, '1978-06-30', 'lenka.kozilkova@seznam.cz', 'Lenka', 'Kiiny', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Kozílková', 30);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (35, 38, '1979-12-31', 'lucie.kyzlinkova@seznam.cz', 'Lucie', 'kikin14', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Kyzlinková', 31);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (36, 36, '1980-05-16', 'lucie.macova@seznam.cz', 'Lucie', 'klokinka', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Mácová', 32);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (37, 34, '1965-02-12', 'eva.dolezalova@seznam.cz', 'Eva', 'barca.baran', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Doležalová', 33);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (38, 34, '1966-03-16', 'ilona.edinova@seznam.cz', 'Ilona', 'Barusha.K', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Edinová', 34);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (39, 35, '1967-09-08', 'jana.flochova@seznam.cz', 'Jana', 'Bedruna009', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Flochová', 35);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (40, 36, '1986-05-11', 'jana.formankova@seznam.cz', 'Jana', 'bedrunka6', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Formánková', 36);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (41, 32, '1982-07-07', 'jana.galiova@seznam.cz', 'Jana', 'brachysegra', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Galiová', 37);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (42, 31, '1985-01-13', 'katerina.hrdlickova@seznam.cz', 'Kateřina', 'Diddelinka', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Hrdličková', 39);
INSERT INTO public.person (id_person, age, birthday, email, first_name, nickname, pwd, surname, id_address) VALUES (43, 32, '1980-05-16', 'katerina.hruskova@seznam.cz', 'Kateřina', 'Dvarfka', '$2a$06$cjXTOlpy.GZULB/atthy3.i/QkJjwBkUxXYAsdGoIHBo9lMm9x6te', 'Hrušková', 40);


--
-- TOC entry 2241 (class 0 OID 18019)
-- Dependencies: 198
-- Data for Name: contact; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (62, 'radekruta', 2, 1);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (1, 'radekruta@seznam.cz', 4, 1);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (63, 'tomas.lorenc', 2, 2);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (2, 'tomas.lorenc@gmail.com', 4, 2);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (64, 'hruda.milan', 2, 3);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (3, 'hruda.milan@gmail.com', 4, 3);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (65, 'smetak', 2, 4);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (4, 'smetak@email.cz', 4, 4);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (66, 'zednik.michal', 2, 5);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (5, 'zednik.michal@seznam.cz', 4, 5);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (67, 'zemek', 2, 6);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (6, 'zemek@centrum.cz', 4, 6);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (68, 'tomasik', 2, 7);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (7, 'tomasik.tom@centrum.cz', 4, 7);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (86, '72448217', 1, 8);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (69, 'velebnik', 2, 8);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (35, '724548217', 3, 8);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (8, 'velebnik@gmail.com', 4, 8);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (87, '72552711', 1, 9);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (70, 'stupik', 2, 9);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (36, '725852711', 3, 9);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (9, 'stupik@gmail.com', 4, 9);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (88, '96525542', 1, 10);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (71, 'jarda', 2, 10);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (37, '773525542', 3, 10);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (10, 'jarda.menca@centrum.cz', 4, 10);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (89, '845428485', 1, 11);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (38, '776828485', 3, 11);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (11, 'malinka.mir@centrum.cz', 4, 11);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (90, '855458369', 1, 12);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (39, '723258369', 3, 12);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (12, 'latal.liba@verizon.com', 4, 12);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (91, '77423475', 1, 13);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (40, '774123475', 3, 13);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (13, 'kubala@seznam.cz', 4, 13);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (92, '522252756', 1, 14);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (41, '735252756', 3, 14);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (14, 'kalivodavid@seznam.cz', 4, 14);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (93, '438424666', 1, 15);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (42, '728424666', 3, 15);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (15, 'smetak.janda@gmail.com', 4, 15);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (94, '856587663', 1, 16);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (43, '726587663', 3, 16);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (16, 'fucha@seznam.cz', 4, 16);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (95, '996548723', 1, 17);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (44, '726548723', 3, 17);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (17, 'bartostanda@seznam.cz', 4, 17);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (45, '724963797', 3, 18);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (18, 'svatopluk.benes@centrum.cz', 4, 18);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (46, '774564320', 3, 19);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (19, 'ambrosik@seznam.cz', 4, 19);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (96, '875545965', 1, 20);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (47, '775545965', 3, 20);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (20, 'cermi.jarda@node.mendelu.cz', 4, 20);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (97, '322264852', 1, 21);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (72, 'jarca.cermakova', 2, 21);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (48, '772264852', 3, 21);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (21, 'jarca.cermakova@gmail.com', 4, 21);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (98, '7413542', 1, 22);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (73, 'dupalsvata', 2, 22);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (49, '721253542', 3, 22);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (22, 'dupalsvata@centrum.cz', 4, 22);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (99, '654626512', 1, 23);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (74, 'hopersona', 2, 23);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (50, '722654752', 3, 23);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (23, 'hopersona@seznam.cz', 4, 23);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (100, '651238214', 1, 24);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (75, 'luckahopersonova', 2, 24);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (51, '731765214', 3, 24);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (24, 'luckahopersonova@email.cz', 4, 24);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (76, 'marki', 2, 25);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (52, '774251714', 3, 25);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (25, 'marki@seznam.cz', 4, 25);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (77, 'judex.kristl', 2, 26);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (53, '774954246', 3, 26);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (26, 'judex.kristl@gmail.com', 4, 26);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (78, 'kadlcikovakristynka', 2, 27);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (54, '732725825', 3, 27);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (27, 'kadlcikovakristynka@seznam.cz', 4, 27);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (101, '105984462', 1, 28);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (79, 'ladenka', 2, 28);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (55, '734821462', 3, 28);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (28, 'ladenka@centrum.cz', 4, 28);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (102, '80554654', 1, 29);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (80, 'kocmankalenka', 2, 29);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (56, '732654654', 3, 29);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (29, 'kocmankalenka@gmail.com', 4, 29);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (103, '225421254', 1, 30);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (81, 'kollarikova', 2, 30);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (57, '775828254', 3, 30);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (30, 'kollarikova@seznam.cz', 4, 30);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (82, 'kollmannova.lena', 2, 31);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (58, '774741524', 3, 31);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (31, 'kollmannova.lena@verizon.com', 4, 31);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (104, '651325419', 1, 32);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (83, 'kovackovaleni', 2, 32);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (59, '775595419', 3, 32);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (32, 'kovackovaleni@cenrtum.cz', 4, 32);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (105, '651321179', 1, 33);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (84, 'andakollmann', 2, 33);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (60, '723654179', 3, 33);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (33, 'andakollmann@vutbr.cz', 4, 33);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (106, '35653578', 1, 34);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (85, 'kiiny', 2, 34);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (61, '776853578', 3, 34);
INSERT INTO public.contact (id_contact, contact, id_contact_type, id_person) VALUES (34, 'kiiny@idnes.cz', 4, 34);


--
-- TOC entry 2245 (class 0 OID 18029)
-- Dependencies: 202
-- Data for Name: meeting; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.meeting (id_meeting, duration, note, place, start_time) VALUES (1, 12312, 'brusle', 'náměstí', '2007-10-17 01:42:49');
INSERT INTO public.meeting (id_meeting, duration, note, place, start_time) VALUES (2, 12312, NULL, 'park', '2007-10-27 15:00:00');
INSERT INTO public.meeting (id_meeting, duration, note, place, start_time) VALUES (3, 12312, NULL, 'škola', '2007-11-13 10:00:00');
INSERT INTO public.meeting (id_meeting, duration, note, place, start_time) VALUES (4, 12312, NULL, 'kino', '2007-10-14 20:00:00');
INSERT INTO public.meeting (id_meeting, duration, note, place, start_time) VALUES (5, 12312, 'květina', 'pod hodinami', '2007-10-18 22:00:00');
INSERT INTO public.meeting (id_meeting, duration, note, place, start_time) VALUES (6, 12312, NULL, 'divadlo', '2007-10-24 19:00:00');
INSERT INTO public.meeting (id_meeting, duration, note, place, start_time) VALUES (7, 12312, 'Bláhovka', 'Brno', '2007-12-30 10:45:00');
INSERT INTO public.meeting (id_meeting, duration, note, place, start_time) VALUES (8, 12312, 'Bláhovka', 'Brno', '2007-10-25 15:45:00');
INSERT INTO public.meeting (id_meeting, duration, note, place, start_time) VALUES (9, 12312, 'oběd', 'doma', '2007-11-26 12:00:00');
INSERT INTO public.meeting (id_meeting, duration, note, place, start_time) VALUES (10, 12312, NULL, 'park', '2007-12-17 16:30:00');
INSERT INTO public.meeting (id_meeting, duration, note, place, start_time) VALUES (11, 12312, 'Bláhovka', 'Brno', '2007-10-25 17:20:00');
INSERT INTO public.meeting (id_meeting, duration, note, place, start_time) VALUES (12, 12312, NULL, 'škola', '2007-10-28 06:50:00');
INSERT INTO public.meeting (id_meeting, duration, note, place, start_time) VALUES (13, 12312, 'Mendlák', 'Brno', '2008-01-10 15:45:00');
INSERT INTO public.meeting (id_meeting, duration, note, place, start_time) VALUES (14, 12312, 'BVV', 'Brno', '2007-11-02 20:20:00');
INSERT INTO public.meeting (id_meeting, duration, note, place, start_time) VALUES (15, 12312, 'oběd', 'doma', '2008-01-13 12:00:00');
INSERT INTO public.meeting (id_meeting, duration, note, place, start_time) VALUES (16, 12312, NULL, 'park', '2008-02-17 16:30:00');
INSERT INTO public.meeting (id_meeting, duration, note, place, start_time) VALUES (17, 12312, 'Bláhovka', 'Brno', '2008-01-15 17:00:00');
INSERT INTO public.meeting (id_meeting, duration, note, place, start_time) VALUES (18, 12312, NULL, 'škola', '2008-03-03 06:00:00');


--
-- TOC entry 2248 (class 0 OID 18043)
-- Dependencies: 205
-- Data for Name: person_has_meeting; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.person_has_meeting (id_person, id_meeting) VALUES (1, 1);
INSERT INTO public.person_has_meeting (id_person, id_meeting) VALUES (2, 1);
INSERT INTO public.person_has_meeting (id_person, id_meeting) VALUES (3, 1);
INSERT INTO public.person_has_meeting (id_person, id_meeting) VALUES (4, 1);
INSERT INTO public.person_has_meeting (id_person, id_meeting) VALUES (5, 1);
INSERT INTO public.person_has_meeting (id_person, id_meeting) VALUES (2, 2);
INSERT INTO public.person_has_meeting (id_person, id_meeting) VALUES (3, 2);
INSERT INTO public.person_has_meeting (id_person, id_meeting) VALUES (4, 3);


--
-- TOC entry 2255 (class 0 OID 18061)
-- Dependencies: 212
-- Data for Name: role; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.person_role (id_person, role) VALUES (1, 'ADMIN');
INSERT INTO public.person_role (id_person, role) VALUES (2, 'PERSON');
INSERT INTO public.person_role (id_person, role) VALUES (3, 'FIRST_LINE_MANAGER');
INSERT INTO public.person_role (id_person, role) VALUES (4, 'SECOND_LINE_MANAGER');
INSERT INTO public.person_role (id_person, role) VALUES (5, 'PERSON');
INSERT INTO public.person_role (id_person, role) VALUES (6, 'PERSON');
INSERT INTO public.person_role (id_person, role) VALUES (8, 'ADMIN');
INSERT INTO public.person_role (id_person, role) VALUES (9, 'PERSON');
INSERT INTO public.person_role (id_person, role) VALUES (10, 'FIRST_LINE_MANAGER');
INSERT INTO public.person_role (id_person, role) VALUES (11, 'SECOND_LINE_MANAGER');
INSERT INTO public.person_role (id_person, role) VALUES (12, 'PERSON');
INSERT INTO public.person_role (id_person, role) VALUES (13, 'PERSON');
INSERT INTO public.person_role (id_person, role) VALUES (14, 'PERSON');
INSERT INTO public.person_role (id_person, role) VALUES (15, 'ADMIN');
INSERT INTO public.person_role (id_person, role) VALUES (16, 'PERSON');
INSERT INTO public.person_role (id_person, role) VALUES (17, 'FIRST_LINE_MANAGER');
INSERT INTO public.person_role (id_person, role) VALUES (18, 'SECOND_LINE_MANAGER');
INSERT INTO public.person_role (id_person, role) VALUES (19, 'PERSON');
INSERT INTO public.person_role (id_person, role) VALUES (20, 'PERSON');
INSERT INTO public.person_role (id_person, role) VALUES (21, 'PERSON');
INSERT INTO public.person_role (id_person, role) VALUES (22, 'ADMIN');
INSERT INTO public.person_role (id_person, role) VALUES (23, 'PERSON');
INSERT INTO public.person_role (id_person, role) VALUES (24, 'FIRST_LINE_MANAGER');
INSERT INTO public.person_role (id_person, role) VALUES (25, 'SECOND_LINE_MANAGER');
INSERT INTO public.person_role (id_person, role) VALUES (26, 'PERSON');
INSERT INTO public.person_role (id_person, role) VALUES (27, 'PERSON');
INSERT INTO public.person_role (id_person, role) VALUES (28, 'PERSON');
INSERT INTO public.person_role (id_person, role) VALUES (29, 'ADMIN');
INSERT INTO public.person_role (id_person, role) VALUES (30, 'PERSON');
INSERT INTO public.person_role (id_person, role) VALUES (31, 'FIRST_LINE_MANAGER');
INSERT INTO public.person_role (id_person, role) VALUES (32, 'SECOND_LINE_MANAGER');
INSERT INTO public.person_role (id_person, role) VALUES (33, 'PERSON');
INSERT INTO public.person_role (id_person, role) VALUES (34, 'PERSON');
INSERT INTO public.person_role (id_person, role) VALUES (35, 'PERSON');
INSERT INTO public.person_role (id_person, role) VALUES (36, 'PERSON');
INSERT INTO public.person_role (id_person, role) VALUES (37, 'FIRST_LINE_MANAGER');
INSERT INTO public.person_role (id_person, role) VALUES (38, 'SECOND_LINE_MANAGER');
INSERT INTO public.person_role (id_person, role) VALUES (39, 'CEO');
INSERT INTO public.person_role (id_person, role) VALUES (40, 'CTO');
INSERT INTO public.person_role (id_person, role) VALUES (41, 'PERSON');
INSERT INTO public.person_role (id_person, role) VALUES (42, 'PERSON');


--
-- TOC entry 2253 (class 0 OID 18056)
-- Dependencies: 210
-- Data for Name: relationship_type; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.relationship_type (id_relationship_type, title) VALUES (4, 'friends');
INSERT INTO public.relationship_type (id_relationship_type, title) VALUES (8, 'married couple');
INSERT INTO public.relationship_type (id_relationship_type, title) VALUES (6, 'lovers');
INSERT INTO public.relationship_type (id_relationship_type, title) VALUES (2, 'enemies');
INSERT INTO public.relationship_type (id_relationship_type, title) VALUES (3, 'partners');
INSERT INTO public.relationship_type (id_relationship_type, title) VALUES (7, 'family');
INSERT INTO public.relationship_type (id_relationship_type, title) VALUES (5, 'acquaintance');


--
-- TOC entry 2251 (class 0 OID 18051)
-- Dependencies: 208
-- Data for Name: relationship; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (1, NULL, 20, 21, 8);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (2, NULL, 23, 24, 8);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (3, NULL, 1, 39, 8);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (4, NULL, 3, 37, 8);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (5, NULL, 5, 36, 8);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (6, NULL, 6, 3, 8);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (7, NULL, 20, 12, 7);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (8, NULL, 18, 16, 7);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (9, NULL, 10, 29, 7);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (10, NULL, 11, 30, 7);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (11, NULL, 11, 35, 7);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (12, NULL, 14, 24, 7);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (13, NULL, 3, 25, 7);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (14, NULL, 1, 24, 4);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (15, NULL, 1, 25, 4);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (16, NULL, 2, 26, 4);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (17, NULL, 2, 30, 4);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (18, NULL, 2, 35, 4);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (19, NULL, 2, 6, 4);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (20, NULL, 2, 8, 4);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (21, NULL, 3, 16, 4);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (22, NULL, 3, 24, 4);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (23, NULL, 3, 32, 4);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (24, NULL, 3, 36, 4);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (25, NULL, 4, 15, 4);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (26, NULL, 4, 21, 4);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (27, NULL, 4, 23, 4);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (28, NULL, 4, 12, 4);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (29, NULL, 5, 17, 4);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (30, NULL, 5, 19, 4);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (31, NULL, 5, 22, 4);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (32, NULL, 5, 29, 4);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (33, NULL, 5, 32, 4);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (34, NULL, 5, 34, 4);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (35, NULL, 6, 17, 4);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (36, NULL, 6, 19, 4);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (37, NULL, 8, 22, 4);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (38, NULL, 11, 35, 6);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (39, NULL, 11, 36, 6);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (40, NULL, 5, 34, 6);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (41, NULL, 6, 36, 6);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (42, NULL, 1, 30, 6);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (43, NULL, 15, 29, 6);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (73, NULL, 17, 34, 5);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (74, NULL, 18, 37, 5);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (75, NULL, 18, 22, 5);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (76, NULL, 18, 29, 5);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (77, NULL, 19, 31, 5);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (78, NULL, 19, 38, 5);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (79, NULL, 20, 27, 5);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (80, NULL, 21, 27, 5);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (81, NULL, 31, 34, 5);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (82, NULL, 1, 21, 2);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (83, NULL, 3, 23, 2);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (84, NULL, 5, 24, 2);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (85, NULL, 6, 28, 2);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (86, NULL, 7, 32, 2);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (87, NULL, 7, 34, 2);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (88, NULL, 6, 34, 2);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (89, NULL, 5, 34, 2);
INSERT INTO public.relationship (id_relationship, note, id_person1, id_person2, id_relationship_type) VALUES (90, NULL, 1, 24, 2);


--
-- TOC entry 2262 (class 0 OID 0)
-- Dependencies: 197
-- Name: address_id_address_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.address_id_address_seq', 42, true);


--
-- TOC entry 2263 (class 0 OID 0)
-- Dependencies: 199
-- Name: contact_id_contact_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.contact_id_contact_seq', 106, false);


--
-- TOC entry 2264 (class 0 OID 0)
-- Dependencies: 201
-- Name: contact_type_id_contact_type_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.contact_type_id_contact_type_seq', 4, false);


--
-- TOC entry 2265 (class 0 OID 0)
-- Dependencies: 203
-- Name: meeting_id_meeting_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.meeting_id_meeting_seq', 18, false);


--
-- TOC entry 2266 (class 0 OID 0)
-- Dependencies: 207
-- Name: person_id_person_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.person_id_person_seq', 43, false);


--
-- TOC entry 2267 (class 0 OID 0)
-- Dependencies: 209
-- Name: relationship_id_relationship_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.relationship_id_relationship_seq', 90, false);


--
-- TOC entry 2268 (class 0 OID 0)
-- Dependencies: 211
-- Name: relationship_type_id_relationship_type_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.relationship_type_id_relationship_type_seq', 8, false);


-- Completed on 2018-09-08 21:38:47

--
-- PostgreSQL database dump complete
--

