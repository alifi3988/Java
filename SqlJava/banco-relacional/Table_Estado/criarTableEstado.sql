-- Criando a tabela estado
CREATE TABLE tb_estado(
    id_estado       INTEGER UNSIGNED AUTO_INCREMENT,
    nome            VARCHAR(45) NOT NULL,
    sigla           VARCHAR(2) NOT NULL,
    regiao          ENUM('Norte', 'Nordeste', 'Centro-Oeste', 'Sudeste', 'Sul') NOT NULL,
    populacao       DECIMAL(5,2),
    CONSTRAINT tb_estado_pk PRIMARY KEY(id_estado),
    UNIQUE KEY (nome),
    UNIQUE KEY (sigla)
);