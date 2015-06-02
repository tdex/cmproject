CREATE TABLE `cmproject`.`Colaborador` (
  `idColaborador` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NOT NULL,
  `telefone` INT NULL,
  `cpf` VARCHAR(14) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `senha` VARCHAR(15) NOT NULL,
  `endereco` VARCHAR(255) NULL,
  `tipoAcesso` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`idColaborador`));
