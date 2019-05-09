DROP TABLE IF EXISTS user;

DROP SEQUENCE IF EXISTS seq_customer_id;

CREATE SEQUENCE IF NOT EXISTS seq_customer_id START WITH 1 INCREMENT BY 1;

CREATE TABLE IF NOT EXISTS user(
  id INTEGER DEFAULT nextval('seq_customer_id') PRIMARY KEY,
  first_name VARCHAR(32) NOT NULL,
  last_name VARCHAR(32) NOT NULL,
  email VARCHAR(128) NOT NULL,
  birthday DATE NOT NULL
);