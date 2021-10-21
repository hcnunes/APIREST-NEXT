DROP DATABASE IF EXISTS next_rest_api_schema;
CREATE DATABASE IF NOT EXISTS next_rest_api_schema;

DROP TABLE IF EXISTS next_rest_api_schema.usuario;
CREATE TABLE IF NOT EXISTS next_rest_api_schema.usuario (
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    primeiro_nome VARCHAR(100) NOT NULL,
    ultimo_nome VARCHAR(100) NOT NULL,
    matricula VARCHAR(4) NOT NULL,
    data_nascimento VARCHAR (10) NOT NULL,
    ativo VARCHAR(10) NOT NULL,
    centro_custo VARCHAR(50) NOT NULL,
    gerente BOOLEAN NOT NULL,
    CONSTRAINT pk_usuario PRIMARY KEY (id),
    CONSTRAINT uk_matricula UNIQUE KEY (matricula),
    CONSTRAINT only_numbers_matricula CHECK (matricula REGEXP '^[0-9]{4}$')
);


DROP TABLE IF EXISTS next_rest_api_schema.projeto;
CREATE TABLE IF NOT EXISTS next_rest_api_schema.projeto (
	id_projeto INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nome_projeto VARCHAR(100) NOT NULL,
    gerente_projeto VARCHAR(100) NOT NULL,
    centro_custo_projeto VARCHAR(100) NOT NULL,
    data_inicio_projeto VARCHAR(11) NOT NULL,
    data_termino_projeto INTEGER (8) NOT NULL,
    status_projeto VARCHAR(50) NOT NULL,
    flag_projeto VARCHAR(50) NOT NULL,
    CONSTRAINT pk_projeto PRIMARY KEY (id_projeto)
);

INSERT INTO next_rest_api_schema.usuario(primeiro_nome, ultimo_nome, matricula, data_nascimento, ativo, centro_custo, gerente) VALUES ('Bruno', 'Paes', '2500', '25/01/1984', 'Ativo', 'Operações', FALSE);

DROP TABLE IF EXISTS next_rest_api_schema.cargo;
CREATE TABLE IF NOT EXISTS next_rest_api_schema.cargo (
id INT UNSIGNED NOT NULL AUTO_INCREMENT,
nome VARCHAR(100) NOT NULL,
CONSTRAINT pk_cargo PRIMARY KEY (id),
CONSTRAINT uk_cargo UNIQUE KEY (nome)
);

INSERT INTO next_rest_api_schema.cargo(nome) VALUES ('Gerente');
INSERT INTO next_rest_api_schema.cargo(nome) VALUES ('Analista');