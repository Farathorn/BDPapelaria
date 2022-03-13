INSERT INTO Franquia (Cofre, Endereço)
VALUES (50290.23, "São Paulo");
INSERT INTO Franquia (Cofre, Endereço)
VALUES (3800.34, "Cuiabá");
INSERT INTO Franquia (Cofre, Endereço)
VALUES (5921.98, "Goiânia");

INSERT INTO Funcionário (CPF, Nome, Carteira_de_Trabalho, Cargo, Expediente, Salário_Base, Faltas, Venda_do_Mês, Ticket_Médio, Franquia)
VALUES ("12345678910", "Angela Rezende Kumakura", "222222222222", "Vendedor(a)", "13:45-22:00", 1180.00, 3, 22392.41, 80.85, 2);
INSERT INTO Funcionário (CPF, Nome, Carteira_de_Trabalho, Cargo, Expediente, Salário_Base, Faltas, Venda_do_Mês, Ticket_Médio, Franquia)
VALUES ("45612378910", "Maikon", "333333333333", "Vendedor(a)", "09:45-18:00", 1180.00, 0, 17392.41, 115.23, 2);
INSERT INTO Funcionário (CPF, Nome, Carteira_de_Trabalho, Cargo, Expediente, Salário_Base, Faltas, Venda_do_Mês, Ticket_Médio, Franquia)
VALUES ("78912345610", "Magna", "111111111111", "Gerente", "09:45-18:00", 1500.00, 0, 200.39, 50.15, 2);

INSERT INTO Funcionário (CPF, Nome, Carteira_de_Trabalho, Cargo, Expediente, Salário_Base, Faltas, Venda_do_Mês, Ticket_Médio, Franquia)
VALUES ("45678912310", "Andressa", "444444444444", "Vendedor(a)", "13:45-22:00", 1180.00, 2, 19322.41, 90.21, 1);
INSERT INTO Funcionário (CPF, Nome, Carteira_de_Trabalho, Cargo, Expediente, Salário_Base, Faltas, Venda_do_Mês, Ticket_Médio, Franquia)
VALUES ("78945612310", "Felipe", "555555555555", "Vendedor(a)", "09:45-18:00", 1180.00, 1, 21402.32, 105.85, 1);
INSERT INTO Funcionário (CPF, Nome, Carteira_de_Trabalho, Cargo, Expediente, Salário_Base, Faltas, Venda_do_Mês, Ticket_Médio, Franquia)
VALUES ("12345678911", "Lucas", "666666666666", "Gerente", "09:45-18:00", 1500.00, 3, 590.13, 90.13, 1);

INSERT INTO Funcionário (CPF, Nome, Carteira_de_Trabalho, Cargo, Expediente, Salário_Base, Faltas, Venda_do_Mês, Ticket_Médio, Franquia)
VALUES ("12345678912", "Jackeline", "777777777777", "Vendedor(a)", "13:45-22:00", 1180.00, 5, 15964.41, 69.96, 3);
INSERT INTO Funcionário (CPF, Nome, Carteira_de_Trabalho, Cargo, Expediente, Salário_Base, Faltas, Venda_do_Mês, Ticket_Médio, Franquia)
VALUES ("12345678913", "Pedro", "888888888888", "Vendedor(a)", "09:45-18:00", 1180.00, 1, 18411.91, 130.41, 3);
INSERT INTO Funcionário (CPF, Nome, Carteira_de_Trabalho, Cargo, Expediente, Salário_Base, Faltas, Venda_do_Mês, Ticket_Médio, Franquia)
VALUES ("12345678914", "José", "999999999999", "Gerente", "09:45-18:00", 1500.00, 1, 310.13, 82.23, 3);

INSERT INTO Cliente (CPF, Nome, Telefone, Gasto_Total)
VALUES ("11111111111", "João", "4444444444", 1232.40);
INSERT INTO Cliente (CPF, Nome, Telefone, Gasto_Total)
VALUES ("22222222222", "Maria", "55555555555", 122.35);
INSERT INTO Cliente (CPF, Nome, Telefone, Gasto_Total)
VALUES ("33333333333", "Caio", "66666666666", 242.99);
INSERT INTO Cliente (CPF, Nome, Telefone, Gasto_Total)
VALUES ("66666666666", "Amanda", "4444444444", 5.99);
INSERT INTO Cliente (CPF, Nome, Gasto_Total)
VALUES ("77777777777", "Joaquim", 39.99);

INSERT INTO Estoque (Contato, Endereço)
VALUES ("emailemail@email.com", "Cuiabá");
INSERT INTO Estoque (Contato, Endereço)
VALUES ("emailemailado@email.com", "São Paulo");
INSERT INTO Estoque (Contato, Endereço)
VALUES ("emailadoemail@email.com", "Goiânia");

INSERT INTO Shopping (Nome, Endereço, Aluguel)
VALUES ("Shopping Estação Cuiabá", "Cuiabá", 5000.00);
INSERT INTO Shopping (Nome, Endereço, Aluguel)
VALUES ("Shopping Novo Mundo", "Goiânia", 6000.00);
INSERT INTO Shopping (Nome, Endereço, Aluguel)
VALUES ("Shopping Paulista", "São Paulo", 7000.00);

INSERT INTO Fornecedor (Contato, Endereço)
VALUES ("123123123", "Cuiabá");
INSERT INTO Fornecedor (Contato, Endereço)
VALUES ("321321321", "Goiânia");
INSERT INTO Fornecedor (Contato, Endereço)
VALUES ("345345345", "São Paulo");

INSERT INTO Produto (Quantidade, Descrição, Preço_Unitário, Preço_Total, Estoque)
VALUES (5000, "Papel A4", 0.10, 500.00, 1);
INSERT INTO Produto (Quantidade, Descrição, Preço_Unitário, Preço_Total, Estoque)
VALUES (200, "Lapis FaberCastel", 1.25, 250.00, 1);
INSERT INTO Produto (Quantidade, Descrição, Preço_Unitário, Preço_Total, Estoque)
VALUES (5000, "Papel A4", 0.10, 500.00, 2);
INSERT INTO Produto (Quantidade, Descrição, Preço_Unitário, Preço_Total, Estoque)
VALUES (200, "Lapis FaberCastel", 1.25, 250.00, 2);
INSERT INTO Produto (Quantidade, Descrição, Preço_Unitário, Preço_Total, Estoque)
VALUES (5000, "Papel A4", 0.10, 500.00, 3);
INSERT INTO Produto (Quantidade, Descrição, Preço_Unitário, Preço_Total, Estoque)
VALUES (200, "Lapis FaberCastel", 1.25, 250.00, 3);

INSERT INTO Venda (Tipo, Valor, Forma_de_Pagamento, Parcelamento, Funcionário, Cliente, Franquia)
VALUES ("Loja", 139.99, "Cartão", "2x", "12345678910", "11111111111", "2");