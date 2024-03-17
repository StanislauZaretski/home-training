INSERT INTO customers (NAME) VALUES ('Michael Johnson');
INSERT INTO customers (NAME) VALUES ('Sarah Davis');
INSERT INTO customers (NAME) VALUES ('Jessica Smith');
INSERT INTO customers (NAME) VALUES ('Jacob Martinez');

INSERT INTO orders (customer_id , order_details , order_status) VALUES ((SELECT customer_id FROM customers WHERE name = 'Jessica Smith'),'Iphone 15 pro','NOT_STARTED');
INSERT INTO orders (customer_id , order_details , order_status) VALUES ((SELECT customer_id FROM customers WHERE name = 'Jacob Martinez'),'Iphone X','IN_PROGRESS');