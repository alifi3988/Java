CREATE TABLE IF NOT EXISTS tb_empresa(
    id_empresa          INT UNSIGNED AUTO_INCREMENT,
    nome                VARCHAR(255) NOT NULL,
    cnpj                INT UNSIGNED,
    CONSTRAINT tb_empresa_pk PRIMARY KEY tb_empresa(id_empresa),
    UNIQUE KEY(cnpj)
);


-- Cidade - empresa
CREATE TABLE IF NOT EXISTS tb_empresa_unidades(
    id_empresa          INT UNSIGNED,
    id_cidade           INTEGER,
    sede                TINYINT(1) NOT NULL,
    CONSTRAINT tb_emp_unid_pk PRIMARY KEY (id_empresa, id_cidade),
    CONSTRAINT tb_empreunid_fk_em FOREIGN KEY (id_empresa) REFERENCES tb_empresa(id_empresa),
    CONSTRAINT tb_empreunid_fk_cid FOREIGN KEY (id_cidade) REFERENCES tb_cidade(id_cidade)
);
