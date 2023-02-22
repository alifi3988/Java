--Criação da tabela usuários
CREATE TABLE tb_usuarios(
	id_usuario		INT,
	nome_usuario	VARCHAR(60) CONSTRAINT nn_nome NOT NULL,
	usuario			VARCHAR(15) CONSTRAINT nn_usuario NOT NULL,
	senha			VARCHAR(20) CONSTRAINT nn_senha NOT NULL,
	estado			BOOL CONSTRAINT nn_estado NOT NULL,
	CONSTRAINT pk_tb_usuarios PRIMARY KEY(id_usuario)
);
--Finalização da criação da tabela