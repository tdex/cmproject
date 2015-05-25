CREATE TABLE `cmproject`.`Visitante` (
  `idVisitante` INT NOT NULL,
  `nome` VARCHAR(100) NOT NULL,
  `telefone` INT NULL,
  `email` VARCHAR(255) NOT NULL,
  `senha` VARCHAR(15) NOT NULL,
  `endereco` VARCHAR(255) NULL,
  PRIMARY KEY (`idVisitante`));
