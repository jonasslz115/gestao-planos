CREATE TABLE doenca (
    id                BIGINT(18) NOT NULL AUTO_INCREMENT,
    codigo            VARCHAR(20) NOT NULL,
    descricao         VARCHAR(100) NOT NULL
);

ALTER TABLE doenca
    ADD PRIMARY KEY (id);
