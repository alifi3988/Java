
--SUM E GROUP BY
SELECT
    regiao AS "Região",
    SUM(populacao) AS "Total"
FROM tb_estado
GROUP BY regiao
ORDER BY "Total" desc;

--SOMATÓRIO
SELECT
    SUM(populacao) AS "Soma Total da População"
FROM tb_estado;

-- MÉDIA
SELECT
    AVG(populacao) AS "Média da População"
FROM tb_estado;