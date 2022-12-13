INSERT INTO tb_cidade (nome, id_estado, area)
VALUES
('Campinas', 23, 795),
('Niterói', 25, 133.9);

-- INSERIRNDO COM SELEÇÃO

INSERT INTO tb_cidade(nome, id_estado, area)
VALUES ('Caruaru', (SELECT id_estado FROM `tb_estado` WHERE sigla = 'PE'), 920.6)

INSERT INTO tb_cidade(nome, id_estado, area)
VALUES ('Juazeiro do Norte', (SELECT id_estado FROM `tb_estado` WHERE sigla = 'CE'), 248.2)

SELECT * FROM `tb_cidade`;