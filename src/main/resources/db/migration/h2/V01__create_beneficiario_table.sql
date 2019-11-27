CREATE TABLE beneficiario (
    id                BIGINT(18) NOT NULL AUTO_INCREMENT,
    nome              VARCHAR(70) NOT NULL,
    data_nascimento   DATE NOT NULL
);

ALTER TABLE beneficiario
    ADD PRIMARY KEY (id);
