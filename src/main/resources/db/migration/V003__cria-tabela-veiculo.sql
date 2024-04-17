CREATE TABLE veiculo (
	id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    proprietario_id BIGINT NOT NULL,
    marca VARCHAR(20) NOT NULL,
    modelo VARCHAR(20) NOT NULL,
    placa VARCHAR(7) NOT NULL UNIQUE,
    status VARCHAR(20) NOT NULL,
    data_cadastro DATETIME NOT NULL,
    data_apreensao DATETIME
);

ALTER TABLE veiculo ADD CONSTRAINT fk_veiculo_proprietario
   FOREIGN KEY (proprietario_id) REFERENCES proprietario (id);