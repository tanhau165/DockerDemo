CREATE TABLE product (
  code   VARCHAR(40)                        NOT NULL ,
  name    VARCHAR(40)                        NULL,
  price  INT(5)                             NULL,
  primary key(code)
) ENGINE = INNODB;

INSERT INTO product (code, name,price)
VALUES ('001', 'Big Mac', 1000),
       ('002', 'Lucky Stretch', 1000);
