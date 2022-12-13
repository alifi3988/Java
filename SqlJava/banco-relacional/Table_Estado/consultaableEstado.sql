-- CONSULTA SIMPLES
SELECT * FROM tb_estado;

-- CONSULTA DEFININDO AS COLUNAS DESEJADAS
SELECT nome "Nome do Estado", sigla "Sigla do Estado"
FROM tb_estado
WHERE regiao = "sul"

-- CONSULTA COM O WHERE E ORDER BY
SELECT 
    nome "Nome do Estado",
    regiao "Sigla do Estado",
    populacao "População"
FROM tb_estado
WHERE populacao >= 10
ORDER BY populacao DESC;
