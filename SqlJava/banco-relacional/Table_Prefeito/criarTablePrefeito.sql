-- CRIAÇÃO DA TABLE PREFEITOS
CREATE TABLE IF NOT EXISTS tb_prefeito(
    id_prefeito             INTEGER AUTO_INCREMENT,
    nome                    VARCHAR(255) NOT NULL,
    id_cidade               INTEGER NOT NULL,
    CONSTRAINT tb_prefeito_pk PRIMARY KEY(id_prefeito),
    CONSTRAINT tb_prefeito_fk FOREIGN KEY(id_cidade) 
        REFERENCES tb_cidade (id_cidade),
    UNIQUE KEY (id_cidade)
);