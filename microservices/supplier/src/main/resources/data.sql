DROP TABLE IF EXISTS supplier;

CREATE TABLE supplier
(
    id      INT AUTO_INCREMENT PRIMARY KEY,
    name    VARCHAR(250) NOT NULL,
    state   VARCHAR(2)   NOT NULL,
    address VARCHAR(250) DEFAULT NULL
);

INSERT INTO supplier (name, state, address)
VALUES ('Lindas Flores', 'GO', 'Rua das Flores'),
       ('Margarida Floricultura ', 'SP', 'Rua das Margaridas'),
       ('Orquidario', 'SC', 'Rua das Orquideas');
