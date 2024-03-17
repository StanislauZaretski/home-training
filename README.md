# home-training

Build
```
mvn spring-boot:run
```

# Run mode
- dev
    
    `database` : h2 embedded http://localhost:8080/h2-console
- prod

    `database` : postgres http://localhost:5432/


dev runs by default

to run prod
```agsl
mvn clean install

java -DenvTarget=prod -jar C:\Git\home-training\target\domen-0.0.1-SNAPSHOT.jar
```




Postgres syntax
```SQL
CREATE TYPE ORDER_STATUS AS ENUM (
    'NOT_STARTED',
    'COMPLETED',
    'CANCELED',
    'IN_PROGRESS'
);

CREATE TABLE customers (
    customer_id SERIAL PRIMARY KEY,
    name VARCHAR(64) NOT NULL
);

CREATE TABLE orders (
    order_id SERIAL PRIMARY KEY,
    customer_id BIGINT NOT NULL,
    order_details VARCHAR(64) NOT NULL,
    order_status ORDER_STATUS,
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);
```