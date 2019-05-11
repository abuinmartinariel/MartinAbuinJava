CREATE TABLE `java`.`usuario` (
  `idusuario` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(100) NOT NULL,
  `apellido` VARCHAR(100) NOT NULL,
  `edad` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`idusuario`))
COMMENT = 'Tabla de ususarios';
