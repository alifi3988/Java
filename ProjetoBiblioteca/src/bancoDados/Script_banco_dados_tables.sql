--Criação da tabela usuários
CREATE TABLE tb_usuarios(
	id_usuario		SERIAL,
	nome_usuario	VARCHAR(60) CONSTRAINT nn_nome NOT NULL,
	usuario			VARCHAR(15) CONSTRAINT nn_usuario NOT NULL,
	senha			VARCHAR(20) CONSTRAINT nn_senha NOT NULL,
	estado			BOOL CONSTRAINT nn_estado NOT NULL,
	CONSTRAINT pk_tb_usuarios PRIMARY KEY(id_usuario)
);
--Finalização da criação da tabela

--Criação da tabela leitores
CREATE TABLE tb_leitores(
	id_leitor		SERIAL,
	nome			VARCHAR(60) CONSTRAINT nn_nome NOT NULL,
	dataNascimento 	VARCHAR(10) CONSTRAINT nn_dataNascimento NOT NULL,
	cpf				VARCHAR(11) CONSTRAINT nn_cpf NOT NULL,
	rg 				VARCHAR(9),
	sexo			VARCHAR(10),
	cep 			VARCHAR(8) constraint nn_cep NOT NULL,
	bairro 			VARCHAR(60) CONSTRAINT nn_bairro NOT NULL,
	complemento		VARCHAR(15),
	endereco		VARCHAR(60) CONSTRAINT nn_endereco NOT NULL,
	numero			VARCHAR(10) CONSTRAINT nn_numero NOT NULL,
	estado			VARCHAR(10),
	telefone		VARCHAR(11) CONSTRAINT nn_telefone NOT NULL,
	CONSTRAINT pk_tb_leitores_id PRIMARY KEY(id_leitor)	
);
--finalização d contrução da tabela