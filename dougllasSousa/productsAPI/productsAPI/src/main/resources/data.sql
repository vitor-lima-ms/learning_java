create table tb_product (
    id varchar(255) not null primary key,
    productName varchar(50) not null,
    productDescription varchar(300),
    productPrice numeric(18, 2)
);