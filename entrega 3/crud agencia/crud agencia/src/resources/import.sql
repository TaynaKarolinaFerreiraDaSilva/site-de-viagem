INSERT INTO cliente (id_cliente, nome, email, cpf, nasc, contato, endereco)
VALUES("1", "shayllon edward","shayllon@.com.br", "12345678910", "20190712", "81999999999", "rua do amor,numero:4")

INSERT INTO cliente (id_cliente, nome, email, cpf, nasc, contato, endereco)
VALUES("2","marley lorenzo", "marley@.com.br", "09876543210", "20201017", "81988888888","rua das trelas ,numero:8")

INSERT INTO cliente (id_cliente, nome, email, cpf, nasc, contato, endereco)
VALUES("3", "miley ferreira","miley@.com.br","65432178901","20140115","81977777777","rua dos coelhinhos,numero:7")

INSERT INTO destino(id_destino ,ida_e_volta ,id_cliente)
VALUES("1" ," nova york" ,"1")

INSERT INTO destino(id_destino, ida, id_cliente)
VALUES("2", "florida", "2")

INSERT INTO destino(id_destino, multidestino, id_cliente)
VALUES("3" , "rio de janeiro" , "3")

INSERT INTO passageiro((id_passageiro, adulto, tipo_da_classe, id_classe)
VALUES("1", "24","executiva bussines","1")

INSERT INTO passageiro (id_passageiro,menores ,tipo_da_classe, id_classe)
VALUES("2", "17", "premium economica", "2")

INSERT INTO passageiro(id_passageiro, adulto, tipo_da_classe, id_classe)
VALUES("3", "34" ,"economica" ,"3")

INSERT INTO periodo(id_periodo, duracao_da_viagem,id_passageiro)
VALUES("1", "10", "1")

INSERT INTO periodo(id_periodo, duracao_da_viagem,id_passageiro)
VALUES("2", "15", "2")

INSERT INTO periodo(id_periodo, duracao_da_viagem,id_passageiro)
VALUES("3", "30", "3")