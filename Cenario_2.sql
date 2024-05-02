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
    idade INT
);

