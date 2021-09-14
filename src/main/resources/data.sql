
DROP TABLE IF EXISTS cadastro;
DROP TABLE IF EXISTS cadastrorfid;

INSERT INTO arduino (var, value, product) VALUES
  ('STATE_ARDUINO', 0, 0);

INSERT INTO cadastro_rfid (rfid, productId, posX, posY) VALUES
  (123, 1, 0, 0),
  (4556, 2, 0, 1);
