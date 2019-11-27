CREATE TABLE beneficiario_doenca (
    id                BIGINT(18) NOT NULL AUTO_INCREMENT,
    beneficiario_id   BIGINT(18) NOT NULL,
    doenca_id         BIGINT(18) NOT NULL
);

ALTER TABLE beneficiario_doenca
    ADD PRIMARY KEY (id);
    
ALTER TABLE beneficiario_doenca 
    ADD CONSTRAINT fk_beneficiario_doenca_beneficiario
    FOREIGN KEY (beneficiario_id) REFERENCES beneficiario (id);
    
ALTER TABLE beneficiario_doenca 
    ADD CONSTRAINT fk_beneficiario_doenca_doenca
    FOREIGN KEY (doenca_id) REFERENCES doenca (id);
