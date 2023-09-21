CREATE TABLE `seller` (
  `idseller` INT NOT NULL AUTO_INCREMENT,
  `provider` VARCHAR(45) NULL,
  `contact` VARCHAR(45) NULL,
  `whatsapp` TINYINT NULL,
PRIMARY KEY (`idseller`));

CREATE TABLE `products` (
  `idproducts` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `priceproducts` DECIMAL(20,2) NULL,
  `descr` VARCHAR(45) NULL,
  `vendor` INT NOT NULL,
  PRIMARY KEY (`idproducts`),
  FOREIGN KEY (`vendor`) REFERENCES `seller`(`idseller`));


INSERT INTO `seller` (`idseller`, `provider`, `contact`, `whatsapp`) VALUES ('1', 'John','9999-9999', '0');
INSERT INTO `seller` (`idseller`, `provider`, `contact`, `whatsapp`) VALUES ('2', 'Rutty', '9999-9998', '0');
INSERT INTO `seller` (`idseller`, `provider`, `contact`, `whatsapp`) VALUES ('3', 'Tutt', '9999-9997', '1');
INSERT INTO `seller` (`idseller`, `provider`, `contact`, `whatsapp`) VALUES ('4', 'Larah', '9999-9996', '0');

INSERT INTO `products` (`idproducts`, `name`, `priceproducts`, `descr`, `vendor`) VALUES ('1', 'Shovel', '10.10', 'A shovel', '1');
INSERT INTO `products` (`idproducts`, `name`, `priceproducts`, `descr`, `vendor`) VALUES ('2', 'Bottle of Ink', '5.00', 'A bottle of ink', '2');
INSERT INTO `products` (`idproducts`, `name`, `priceproducts`, `descr`, `vendor`) VALUES ('3', 'Dog', '100.00', 'A dog', '1');
INSERT INTO `products` (`idproducts`, `name`, `priceproducts`, `descr`, `vendor`) VALUES ('4', 'Needles', '0.20', 'A pack of needles', '3');
INSERT INTO `products` (`idproducts`, `name`, `priceproducts`, `descr`, `vendor`) VALUES ('5', 'Flashlight', '7.50', 'A blue flashlight', '1');
INSERT INTO `products` (`idproducts`, `name`, `priceproducts`, `descr`, `vendor`) VALUES ('6', 'Bracelet', '15.00', 'A Bracelet', '2');
INSERT INTO `products` (`idproducts`, `name`, `priceproducts`, `descr`, `vendor`) VALUES ('7', 'Pen', '0.50', 'A pen', '1');
INSERT INTO `products` (`idproducts`, `name`, `priceproducts`, `descr`, `vendor`) VALUES ('8', 'Socks', '4.00', 'A pack of Socks', '3');
INSERT INTO `products` (`idproducts`, `name`, `priceproducts`, `descr`, `vendor`) VALUES ('9', 'Canteen', '7.00', 'A canteen', '3');
INSERT INTO `products` (`idproducts`, `name`, `priceproducts`, `descr`, `vendor`) VALUES ('10', 'Banana', '2.00', 'A banana', '2');
