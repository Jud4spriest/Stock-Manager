
DROP TABLE IF EXISTS cadastro;
DROP TABLE IF EXISTS cadastrorfid;

INSERT INTO arduino (var, value, product) VALUES
  ('STATE_ARDUINO', 0, 0);

INSERT INTO cadastro_rfid (rfid, productId, posX, posY) VALUES
(123, 2000, 1, 1),
(4556, 100, 2, 2);

INSERT INTO produto (id, nome, descricao, categoria, cor, fabricante, fornecedor, modelo, peso, investimento, preco, qtd) VALUES
  (2000, 'Tênis Adidas', null, 'calçado', 'branco', 'adidas','seu madruga ltda', 'Sport', 300, 100, 200, 0),
  (100, 'Placa de video RTX 1080 Ti 12 GB', null, 'placa de vídeo', null, 'intel', 'kabuum informática', 'RTX 1080 ti', 50, 10000, 200, 0);