INSERT INTO brands(name) VALUES('Brand 1');

INSERT INTO products(id,name) VALUES(35455,'Product 1');

INSERT INTO prices(brand_id,start_date,end_date,product_id,priority,price,currency) VALUES(1,'2020-06-14T00.00.00','2020-12-31T23.59.59',35455,0,35.50,'EUR');
INSERT INTO prices(brand_id,start_date,end_date,product_id,priority,price,currency) VALUES(1,'2020-06-14T15.00.00','2020-06-14T18.30.00',35455,1,25.45,'EUR');
INSERT INTO prices(brand_id,start_date,end_date,product_id,priority,price,currency) VALUES(1,'2020-06-15T00.00.00','2020-06-15T11.00.00',35455,1,30.50,'EUR');
INSERT INTO prices(brand_id,start_date,end_date,product_id,priority,price,currency) VALUES(1,'2020-06-15T16.00.00','2020-12-31T23.59.59',35455,1,38.95,'EUR');