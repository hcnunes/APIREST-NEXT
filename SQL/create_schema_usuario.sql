CREATE TABLE IF NOT EXISTS next_rest_api_schema.usuario (
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    primeiro_nome VARCHAR(100) NOT NULL,
    ultimo_nome VARCHAR(100) NOT NULL,
    matricula VARCHAR(4) NOT NULL,
    data_nascimento DATE NOT NULL,
    ativo VARCHAR(10) NOT NULL,
    centro_custo VARCHAR(50) NOT NULL,
    id_cargo INT UNSIGNED NOT NULL,
    CONSTRAINT fk_id_cargo FOREIGN KEY (id_cargo) REFERENCES cargo(id),
    CONSTRAINT pk_usuario PRIMARY KEY (id),
    CONSTRAINT uk_matricula UNIQUE KEY (matricula),    
    CONSTRAINT only_numbers_matricula CHECK (matricula REGEXP '^[0-9]{4}$')
);