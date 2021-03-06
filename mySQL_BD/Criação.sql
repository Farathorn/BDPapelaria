CREATE DATABASE Papel_E_Art;

CREATE TABLE Franquia (
	Código INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    Endereço VARCHAR(500) NOT NULL,
    Cofre FLOAT8 NOT NULL
);

CREATE TABLE Shopping (
	Código INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    Nome VARCHAR(100) NOT NULL,
    Endereço VARCHAR(500) NOT NULL UNIQUE KEY,
    Aluguel FLOAT8 NOT NULL
);

CREATE TABLE Estoque (
	Código INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    Contato VARCHAR(120) NOT NULL,
    Endereço VARCHAR(500) NOT NULL
);

CREATE TABLE Fornecedor (
	Código INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    Contato VARCHAR(120) NOT NULL,
    Endereço VARCHAR(500) NOT NULL
);

CREATE TABLE Funcionário (
	CPF VARCHAR(11) NOT NULL PRIMARY KEY,
    Nome VARCHAR(120) NOT NULL,
    Carteira_de_Trabalho VARCHAR(12) NOT NULL UNIQUE KEY,
    Cargo VARCHAR(25) NOT NULL,
    Expediente VARCHAR(25) NOT NULL,
    Salário_Base FLOAT8 NOT NULL,
    Faltas INTEGER NOT NULL,
    Venda_do_Mês FLOAT8 NOT NULL,
    Ticket_Médio FLOAT8 NOT NULL,
    Franquia INTEGER NOT NULL,
    CONSTRAINT FOREIGN KEY (Franquia) REFERENCES Franquia(Código)
);

CREATE TABLE Custo_Direto (
	Valor FLOAT8 NOT NULL,
    Descrição VARCHAR(200),
    Shopping INTEGER NOT NULL,
    CONSTRAINT FOREIGN KEY (Shopping) REFERENCES Shopping(Código)
);

CREATE TABLE Custo_Indireto (
	Valor FLOAT8 NOT NULL,
    Descrição VARCHAR(200),
    Fornecedor INTEGER,
    Estoque INTEGER,
    CONSTRAINT Fornecedor FOREIGN KEY (Fornecedor) REFERENCES Fornecedor(Código),
    CONSTRAINT Estoque FOREIGN KEY (Estoque) REFERENCES Estoque(Código)
);

CREATE TABLE Pagamento (
	Valor FLOAT8 NOT NULL,
    Descrição VARCHAR(200),
    Tipo VARCHAR(50) NOT NULL,
    Funcionário VARCHAR(11) NOT NULL,
	CONSTRAINT FOREIGN KEY (Funcionário) REFERENCES Funcionário(CPF)
);

CREATE TABLE Produto (
	Código INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    Quantidade INTEGER NOT NULL,
    Descrição VARCHAR(400) NOT NULL,
    Preço_Unitário FLOAT8 NOT NULL,
    Preço_Total FLOAT8 NOT NULL,
    Estoque INTEGER NOT NULL,
    CONSTRAINT FOREIGN KEY (Estoque) REFERENCES Estoque(Código)
);

CREATE TABLE Cliente (
	CPF VARCHAR(11) NOT NULL PRIMARY KEY,
    Nome VARCHAR(120) NOT NULL,
    Telefone VARCHAR(21),
    Gasto_Total FLOAT8 NOT NULL
);

CREATE TABLE Fornece (
	Código INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    Quantidade INTEGER NOT NULL,
    Valor FLOAT8 NOT NULL,
    Fornecedor INTEGER NOT NULL,
    CONSTRAINT FOREIGN KEY (Fornecedor) REFERENCES Fornecedor(Código),
    Produto INTEGER NOT NULL,
    CONSTRAINT FOREIGN KEY (Produto) REFERENCES Produto(Código)
);

CREATE TABLE Venda (
	Código INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    Tipo VARCHAR(25) NOT NULL,
    Valor FLOAT8 NOT NULL,
    Forma_de_Pagamento VARCHAR(60) NOT NULL,
    Parcelamento VARCHAR(4) NOT NULL,
    Funcionário VARCHAR(11) NOT NULL,
    CONSTRAINT FOREIGN KEY (Funcionário) REFERENCES Funcionário(CPF),
    Cliente VARCHAR(11),
    CONSTRAINT FOREIGN KEY (Cliente) REFERENCES Cliente(CPF),
    Franquia INTEGER NOT NULL,
    CONSTRAINT FOREIGN KEY (Franquia) REFERENCES Franquia(Código)
);

CREATE TABLE Itens_da_Venda (
	Item INTEGER NOT NULL,
    CONSTRAINT FOREIGN KEY (Item) REFERENCES Produto(Código),
    Venda INTEGER NOT NULL,
    CONSTRAINT FOREIGN KEY (Venda) REFERENCES Venda(Código),
    Quantidade INTEGER NOT NULL
);