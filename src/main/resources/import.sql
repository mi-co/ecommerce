insert into BRANDS  values (1, 'ZARA');
insert into BRANDS  values (2, 'OTRA MARCA');

insert into PRODUCTS values (35455, 'PRODUCTO 1');
insert into PRODUCTS values (35000, 'PRODUCTO 2');

insert into PRICES (BRAND_ID, PRODUCT_ID, START_DATE, END_DATE, PRICE_LIST, PRIORITY, PRICE,CURR) values (1, 35455, parsedatetime('2020-06-14 00:00:00', 'yyyy-MM-dd hh:mm:ss'), parsedatetime('2020-12-31 23:59:59', 'yyyy-MM-dd hh:mm:ss'), 1, 0, '35.50', 'EUR');
insert into PRICES (BRAND_ID, PRODUCT_ID, START_DATE, END_DATE, PRICE_LIST, PRIORITY, PRICE,CURR) values (1, 35455, parsedatetime('2020-06-14 15:00:00', 'yyyy-MM-dd hh:mm:ss'), parsedatetime('2020-06-14 18:30:00', 'yyyy-MM-dd hh:mm:ss'), 2, 1, '25.45', 'EUR');
insert into PRICES (BRAND_ID, PRODUCT_ID, START_DATE, END_DATE, PRICE_LIST, PRIORITY, PRICE,CURR) values (1, 35455, parsedatetime('2020-06-15 00:00:00', 'yyyy-MM-dd hh:mm:ss'), parsedatetime('2020-06-15 11:00:00', 'yyyy-MM-dd hh:mm:ss'), 3, 1, '30.50', 'EUR');
insert into PRICES ( BRAND_ID, PRODUCT_ID, START_DATE, END_DATE, PRICE_LIST, PRIORITY, PRICE,CURR) values (1, 35455, parsedatetime('2020-06-15 16:00:00', 'yyyy-MM-dd hh:mm:ss'), parsedatetime('2020-12-31 23:59:59', 'yyyy-MM-dd hh:mm:ss'), 4, 1, '38.95', 'EUR');






