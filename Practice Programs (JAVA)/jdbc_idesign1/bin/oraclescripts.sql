begin execute immediate 'drop table book';
exception
when others then null;
end;
/ create table book(
    id number(10) not null,
    title VARCHAR2(45) not null,
    category VARCHAR2(45) not null,
    author VARCHAR2(45) not null,
    price binary_double not null,
    primary key(id)
);
insert into book(id, title, category, author, price)
values (1, 'Vampire Dairy', 'Fiction', 'Chetan', 150);
insert into book(id, title, category, author, price)
values (2, 'Harry potter', 'Witchcraft', 'Rowling', 450);