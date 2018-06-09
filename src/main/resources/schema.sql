DROP TABLE pokemon IF EXISTS;
CREATE TABLE pokemon (id SERIAL, name VARCHAR(100), type VARCHAR(100));
DROP TABLE pokemon_caught IF EXISTS;
CREATE TABLE pokemon_caught (pokemon_id SERIAL, date DATETIME, location VARCHAR(100));