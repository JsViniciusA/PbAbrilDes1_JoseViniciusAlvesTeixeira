CREATE DATABASE cenario2;

USE cenario2;
-- Script de criação das tabelas Gondola e Pessoa

-- Tabela Gondola
CREATE TABLE Gondola (
    id INT PRIMARY KEY AUTO_INCREMENT,
    numero INT NOT NULL,
    assento_1 INT NOT NULL,
    assento_2 INT NOT NULL,
    id_pessoa INT,
    FOREIGN KEY (id_pessoa) REFERENCES Pessoa(id)
);

-- Tabela Pessoa
CREATE TABLE Pessoa (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    idade INT,
    FOREIGN KEY (id_gondola) REFERENCES Gondola(id)
);
 -- Inserindo dados na tabela Gondola
INSERT INTO Gondola (assento_1, assento_2,numero) VALUES
(1, 1,0),
(2, 1,1),
(3, 1,1),
(4, 1,0),
(5, 0,0);

-- Inserindo dados na tabela Pessoa
INSERT INTO Pessoa (nome, idade, numero) VALUES
('Paulo', 42, 1),
('João', 5, 2),
('Maria', 12, 3),
('Pedro', 13, 4),
('Henrique', 10, 5);
