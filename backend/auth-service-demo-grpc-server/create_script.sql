--
-- PostgreSQL database dump
--

-- Dumped from database version 15.0
-- Dumped by pg_dump version 15.0

-- Started on 2023-07-15 21:33:33

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 6 (class 2615 OID 41063)
-- Name: auth; Type: SCHEMA; Schema: -; Owner: lukadj
--

CREATE SCHEMA auth;


ALTER SCHEMA auth OWNER TO postgres;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 216 (class 1259 OID 41064)
-- Name: Korisnik; Type: TABLE; Schema: auth; Owner: lukadj
--

CREATE TABLE auth.Korisnik (
    username text NOT NULL,
    password text NOT NULL
);


ALTER TABLE auth.Korisnik OWNER TO postgres;

INSERT INTO auth.Korisnik(username, password)
VALUES('lukadj','lukadj');

--
-- TOC entry 215 (class 1259 OID 41056)
-- Name: Korisnik; Type: TABLE; Schema: public; Owner: lukadj
--

CREATE TABLE public.Korisnik (
    username text NOT NULL,
    password text NOT NULL
);


ALTER TABLE public.Korisnik OWNER TO postgres;

--
-- TOC entry 3324 (class 0 OID 41064)
-- Dependencies: 216
-- Data for Name: Korisnik; Type: TABLE DATA; Schema: auth; Owner: lukadj
--

COPY auth.Korisnik (username, password) FROM stdin;
\.


--
-- TOC entry 3323 (class 0 OID 41056)
-- Dependencies: 215
-- Data for Name: Korisnik; Type: TABLE DATA; Schema: public; Owner: lukadj
--

COPY public.Korisnik (username, password) FROM stdin;
\.


--
-- TOC entry 3180 (class 2606 OID 41070)
-- Name: Korisnik Korisnik_pkey; Type: CONSTRAINT; Schema: auth; Owner: lukadj
--

ALTER TABLE ONLY auth.Korisnik
    ADD CONSTRAINT "Korisnik_pkey" PRIMARY KEY (username);


--
-- TOC entry 3178 (class 2606 OID 41062)
-- Name: Korisnik Korisnik_pkey; Type: CONSTRAINT; Schema: public; Owner: lukadj
--

ALTER TABLE ONLY public.Korisnik
    ADD CONSTRAINT "Korisnik_pkey" PRIMARY KEY (username);


-- Completed on 2023-07-15 21:33:33

--
-- PostgreSQL database dump complete
--

