CREATE TYPE ORDER_STATUS as enum('NOT_STARTED',
    'COMPLETED',
    'CANCELED',
    'IN_PROGRESS');

CREATE TABLE customers(
    customer_id  bigint auto_increment primary key,
    name         varchar(64)  not null
);

CREATE TABLE orders(
    order_id  bigint auto_increment primary key,
    customer_id bigint not null,
    order_details   varchar(64)  not null,
    order_status   ORDER_STATUS
);

ALTER TABLE orders ADD FOREIGN KEY (customer_id) REFERENCES customers(customer_id);