CREATE TABLE usuario (
    id INTEGER PRIMARY KEY,
    nome VARCHAR(255),
    email VARCHAR(255),
    senha VARCHAR(255)
);

CREATE TABLE pagamento (
    id INTEGER PRIMARY KEY,
    valor DECIMAL(10, 2),
    data_pagamento DATE,
    tipo_pagamento VARCHAR(255)
);

CREATE TABLE reserva (
    id INTEGER PRIMARY KEY,
    fk_usuario INTEGER,
    fk_acomodacao INTEGER
);

CREATE TABLE acomodacao (
    id INTEGER PRIMARY KEY,
    nome VARCHAR(255),
    status VARCHAR(255),
    valor_diaria DECIMAL(10, 2),
    fk_hospede INTEGER
);

CREATE TABLE hospede (
    id INTEGER PRIMARY KEY,
    nome VARCHAR(255),
    cpf VARCHAR(255),
    telefone INTEGER,
    data_entrada DATE,
    data_saida DATE,
    servico_quarto BOOLEAN,
    fk_acomodacao INTEGER,
    fk_pagamento INTEGER
);