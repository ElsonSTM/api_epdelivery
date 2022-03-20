INSERT INTO td_user (name, email, phone, password) VALUES ('Ana Maria', 'amaria@gmail.com', '93 9 9191-1421', '123456');
INSERT INTO td_user (name, email, phone, password) VALUES ('Elson Pinheiro', 'engelp@gmail.com', '93 9 9191-2234', '123456');

INSERT INTO tb_product (name, price, image_Uri, description) VALUES ('Churrasquinho', 10.0, 'https://raw.githubusercontent.com/ElsonSTM/epdelivery/main/imagens/espetinho.jpg', 'Espetinho de frango com mussarela, orégano, molho especial e tempero da casa.');
INSERT INTO tb_product (name, price, image_Uri, description) VALUES ('Copo Amendoin', 9.0, 'https://raw.githubusercontent.com/ElsonSTM/epdelivery/main/imagens/amendoin.jpg', 'Copo de amendoin, bem torradinho.');
INSERT INTO tb_product (name, price, image_Uri, description) VALUES ('Suco de lanranja', 8.0, 'https://raw.githubusercontent.com/ElsonSTM/epdelivery/main/imagens/suco_laranja.png', 'Suco de laranja, geladinho e bem doce');
INSERT INTO tb_product (name, price, image_Uri, description) VALUES ('Pastel de frango', 7.0, 'https://raw.githubusercontent.com/ElsonSTM/epdelivery/main/imagens/pastel_de_frango.jpg', 'Pastel frito com recheio cremoso de frango');
INSERT INTO tb_product (name, price, image_Uri, description) VALUES ('Tapioca comum', 5.0, 'https://raw.githubusercontent.com/ElsonSTM/epdelivery/main/imagens/tapioca_simples.png', 'Tapioca finininha com manteiga');
INSERT INTO tb_product (name, price, image_Uri, description) VALUES ('Tapica com queijo', 7.0, 'https://raw.githubusercontent.com/ElsonSTM/epdelivery/main/imagens/tapioca_queijo.jpg', 'Tapioca com queijo derretido');
INSERT INTO tb_product (name, price, image_Uri, description) VALUES ('Tapioca com carne seca', 15.0, 'https://raw.githubusercontent.com/ElsonSTM/epdelivery/main/imagens/tapioca_carne_seca.jpg', 'Tapioca com recheio de carne seca.');
INSERT INTO tb_product (name, price, image_Uri, description) VALUES ('Tapioca com queijo e presunto', 7.90, 'https://raw.githubusercontent.com/ElsonSTM/epdelivery/main/imagens/tapioca_queijo_presunto.jpg', 'Tapioca com queijo e presunto');

INSERT INTO tb_order (status, latitude, longitude, address, moment, client_id) VALUES (0, -23.561680, -46.656139, 'Avenida Mendonça furtado, 1300', TIMESTAMP WITH TIME ZONE '2021-01-01T10:00:00Z', 1);
INSERT INTO tb_order (status, latitude, longitude, address, moment, client_id) VALUES (1, -22.946779, -43.217753, 'Avenida Mendonça furtado, 1300', TIMESTAMP WITH TIME ZONE '2021-01-01T15:00:00Z', 1);
INSERT INTO tb_order (status, latitude, longitude, address, moment, client_id) VALUES (0, -25.439787, -49.237759, 'Avenida Mendonça furtado, 1300', TIMESTAMP WITH TIME ZONE '2021-01-01T16:00:00Z', 1);
INSERT INTO tb_order (status, latitude, longitude, address, moment, client_id) VALUES (0, -23.561680, -46.656139, 'Avenida Mendonça furtado, 1300', TIMESTAMP WITH TIME ZONE '2021-01-01T12:00:00Z', 1);
INSERT INTO tb_order (status, latitude, longitude, address, moment, client_id) VALUES (1, -23.561680, -46.656139, 'Avenida Mendonça furtado, 1300', TIMESTAMP WITH TIME ZONE '2021-01-01T08:00:00Z', 2);
INSERT INTO tb_order (status, latitude, longitude, address, moment, client_id) VALUES (0, -23.561680, -46.656139, 'Avenida Mendonça furtado, 1300', TIMESTAMP WITH TIME ZONE '2021-01-01T14:00:00Z', 2);
INSERT INTO tb_order (status, latitude, longitude, address, moment, client_id) VALUES (0, -23.561680, -46.656139, 'Avenida Mendonça furtado, 1300', TIMESTAMP WITH TIME ZONE '2021-01-01T09:00:00Z', 2);

INSERT INTO tb_order_product (order_id, product_id) VALUES (1 , 1);
INSERT INTO tb_order_product (order_id, product_id) VALUES (1 , 4);
INSERT INTO tb_order_product (order_id, product_id) VALUES (2 , 2);
INSERT INTO tb_order_product (order_id, product_id) VALUES (2 , 5);
INSERT INTO tb_order_product (order_id, product_id) VALUES (2 , 8);
INSERT INTO tb_order_product (order_id, product_id) VALUES (3 , 3);
INSERT INTO tb_order_product (order_id, product_id) VALUES (3 , 4);
INSERT INTO tb_order_product (order_id, product_id) VALUES (4 , 2);
INSERT INTO tb_order_product (order_id, product_id) VALUES (4 , 6);
INSERT INTO tb_order_product (order_id, product_id) VALUES (5 , 4);
INSERT INTO tb_order_product (order_id, product_id) VALUES (5 , 6);
INSERT INTO tb_order_product (order_id, product_id) VALUES (6 , 5);
INSERT INTO tb_order_product (order_id, product_id) VALUES (6 , 1);
INSERT INTO tb_order_product (order_id, product_id) VALUES (7 , 7);
INSERT INTO tb_order_product (order_id, product_id) VALUES (7 , 5);