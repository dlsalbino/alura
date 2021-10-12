-- DROP TABLE IF EXISTS tbl_info_supplier;
--
-- CREATE TABLE tbl_info_supplier
-- (
--     id      INT AUTO_INCREMENT PRIMARY KEY,
--     name    VARCHAR(250) NOT NULL,
--     state   VARCHAR(2)   NOT NULL,
--     address VARCHAR(250) DEFAULT NULL
-- );

INSERT INTO tbl_info_supplier (name, state, address)
VALUES ('Lindas Flores', 'GO', 'Rua das Flores'),
       ('Margarida Floricultura ', 'SP', 'Rua das Margaridas'),
       ('Orquidario', 'SC', 'Rua das Orquideas');

INSERT INTO tbl_product (name, state, description, price)
VALUES ('Orquidea', 'RS', 'Orquidea Lilás', 90.00),
('Rosa', 'SP', 'Rosas Amarelas de Holambra', 15.00),
('Rosa', 'SP', 'Rosas Vermelhas de Holambra', 10.00),
('Begônia', 'RJ', 'Begônias Amarelas', 30.00),
('Cactus', 'CE', 'Cactus Deserticus', 10.00);

-- private String name;
-- private String state;
-- private String description;
-- private BigDecimal price;
