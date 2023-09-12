CREATE TABLE brands(
    id bigint auto_increment,
    name varchar(50) not null,
    CONSTRAINT pk_brands PRIMARY KEY(id)
);
CREATE TABLE products(
    id bigint,
    name varchar(50) not null,
    CONSTRAINT pk_products PRIMARY KEY(id)
);

CREATE TABLE prices(
    id bigint auto_increment,
    priority int not null,
    price float not null,
    currency varchar(10) not null,
    start_date datetime not null,
    end_date datetime not null,
    brand_id bigint not null,
    product_id bigint not null,
    CONSTRAINT pk_prices PRIMARY KEY(id),
    CONSTRAINT fk_prices_brands FOREIGN KEY(brand_id) REFERENCES brands(id),
    CONSTRAINT fk_prices_products FOREIGN KEY(product_id) REFERENCES products(id)
);