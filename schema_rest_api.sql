#DROP DATABASE IF EXISTS next_rest_api_schema;
DROP TABLE IF EXISTS next_rest_api_schema.projeto;
DROP TABLE IF EXISTS next_rest_api_schema.usuario;

CREATE DATABASE IF NOT EXISTS next_rest_api_schema;

CREATE TABLE IF NOT EXISTS next_rest_api_schema.usuario (
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    primeiro_nome VARCHAR(100) NOT NULL,
    ultimo_nome VARCHAR(100) NOT NULL,
    matricula VARCHAR(4) NOT NULL,
    data_nascimento DATE NOT NULL,
    ativo VARCHAR(10) NOT NULL,
    centro_custo VARCHAR(50) NOT NULL,
    CONSTRAINT pk_usuario PRIMARY KEY (id),
    CONSTRAINT uk_matricula UNIQUE KEY (matricula),    
    CONSTRAINT only_numbers_matricula CHECK (matricula REGEXP '^[0-9]{4}$')
);

CREATE TABLE IF NOT EXISTS next_rest_api_schema.projeto (
	id_projeto INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nome_projeto VARCHAR(100) NOT NULL,
    gerente_projeto INT UNSIGNED NOT NULL,
    centro_custo_projeto VARCHAR(100) NOT NULL,
    data_inicio_projeto DATE NOT NULL,
    data_termino_projeto DATE NOT NULL,
    status_projeto VARCHAR(50) NOT NULL,
    flag_projeto VARCHAR(50) NOT NULL,
    CONSTRAINT pk_projeto PRIMARY KEY (id_projeto),
    CONSTRAINT fk_projeto_usuario FOREIGN KEY (gerente_projeto) REFERENCES usuario(id)
);

INSERT INTO next_rest_api_schema.usuario(primeiro_nome, ultimo_nome, matricula, data_nascimento, ativo, centro_custo) VALUES ('Bruno', 'Paes', '2500', '1984-01-25', 'Ativo', 'Operações');
INSERT INTO next_rest_api_schema.usuario(primeiro_nome, ultimo_nome, matricula, data_nascimento, ativo, centro_custo) VALUES ('Hygor', 'Nunes', '2501', '1991-01-01', 'Ativo', 'Operações');

INSERT INTO next_rest_api_schema.projeto(nome_projeto, gerente_projeto, centro_custo_projeto, data_inicio_projeto, data_termino_projeto, status_projeto, flag_projeto) VALUES ('Primeiro', (SELECT id FROM next_rest_api_schema.usuario WHERE primeiro_nome = 'Bruno'), 'ADM', '2021-01-01', '2022-02-02', 'Em andamento', 'Red');



DROP TABLE IF EXISTS next_rest_api_schema.cargo;
CREATE TABLE IF NOT EXISTS next_rest_api_schema.cargo (
id INT UNSIGNED NOT NULL AUTO_INCREMENT,
nome VARCHAR(100) NOT NULL,
CONSTRAINT pk_cargo PRIMARY KEY (id),
CONSTRAINT uk_cargo UNIQUE KEY (nome)
);

INSERT INTO next_rest_api_schema.cargo(nome) VALUES ('Gerente');
INSERT INTO next_rest_api_schema.cargo(nome) VALUES ('Analista');