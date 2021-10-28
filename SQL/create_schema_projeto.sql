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

ALTER TABLE next_rest_api_schema.projeto
ADD CONSTRAINT ck_status CHECK (status_projeto IN ('Iniciado', 'On-hold', 'Finalizado', 'Atrasado'));

ALTER TABLE next_rest_api_schema.projeto
ADD CONSTRAINT ck_flag CHECK (flag_projeto IN ('Vermelho', 'Amarelo', 'Verde'));

ALTER TABLE next_rest_api_schema.projeto
ADD CONSTRAINT ck_centro_custo_projeto CHECK (centro_custo_projeto IN ('ADM/FINANCEIRO', 'MKT/COMERCIAL', 'OPERAÇÕES'));