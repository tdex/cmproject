CREATE TABLE `cmproject`.`Veiculos` (
  `idVeiculos` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `modelo` VARCHAR(45) NULL,
  `tipo` VARCHAR(45) NOT NULL,
  `categoria` VARCHAR(45) NOT NULL,
  `status` CHAR NOT NULL,
  `descricao` VARCHAR(450) NOT NULL,
  PRIMARY KEY (`idVeiculos`));
