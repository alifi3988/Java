-- CONSULTA EM MULTIPLAS TABELAS COM WHERE
SELECT 
    e.nome "Nome do Estado",
    c.nome "Nome da Cidade",
    e.regiao " Região"
FROM tb_estado e, tb_cidade c
WHERE e.id_estado = c.id_estado;

-- CONSULTA EM MULTIPLAS TABELAS COM INNER JOIN
SELECT
    e.nome "Nome do Estado",
    c.nome "Nome da Cidade",
    e.regiao "Região"
FROM tb_estado e
INNER JOIN tb_cidade c ON (e.id_estado = c.id_estado)
ORDER BY e.nome;
