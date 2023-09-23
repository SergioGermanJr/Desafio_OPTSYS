CREATE TABLE Pessoa (
    id INT PRIMARY KEY IDENTITY(1,1),
    nome NVARCHAR(255) NOT NULL,
    idade INT
);

CREATE TABLE Cargos (
    id INT PRIMARY KEY IDENTITY(1,1),
    nome_cargo NVARCHAR(255) NOT NULL
);

CREATE TABLE Funcionario (
    id INT PRIMARY KEY,
    pessoa_id INT,
    cargo_id INT,
    FOREIGN KEY (pessoa_id) REFERENCES Pessoa(id),
    FOREIGN KEY (cargo_id) REFERENCES Cargos(id)
);

SET IDENTITY_INSERT Pessoa ON;

INSERT INTO Pessoa (id, nome, idade)
VALUES
    (1, 'Sergio', 30),
    (2, 'Simone', 25),
    (3, 'Thaisa', 28),
    (4, 'Saara', 32),
    (5, 'Ryan', 27),
    (6, 'Pedro', 29),
    (7, 'Rafael', 35),
    (8, 'Julia', 24),
    (9, 'Mário', 40),
    (10, 'Lucas', 22);

SET IDENTITY_INSERT Pessoa OFF;

SET IDENTITY_INSERT Cargos ON;

INSERT INTO Cargos (id, nome_cargo)
VALUES
    (1, 'Assistente'),
    (2, 'Programador'),
    (3, 'Gerente');

SET IDENTITY_INSERT Cargos OFF;

INSERT INTO Funcionario (id, pessoa_id, cargo_id)
VALUES
    (1, 1, 1),
    (2, 2, 2),
    (3, 3, 2),
    (4, 4, 3),
    (5, 5, 2),
    (6, 6, 1),
    (7, 7, 3),
    (8, 8, 1),
    (9, 9, 3),
    (10, 10, 2);

SELECT nome_cargo,
       COUNT(FUN.id) as quantidade_pessoas
FROM Cargos
LEFT JOIN Funcionario AS FUN
ON Cargos.id = FUN.cargo_id
GROUP BY Cargos.id, Cargos.nome_cargo;


