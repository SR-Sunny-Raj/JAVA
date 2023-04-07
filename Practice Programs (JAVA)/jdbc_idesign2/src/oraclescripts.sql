begin execute immediate 'drop table travel_class';
exception
when others then null;
end;
/ create table travel_class(
    id number(10) not null,
    name VARCHAR2(45) not null,
    description CLOB not null,
    primary key(id)
);
insert into travel_class(id, name, description)
values (1, 'First Class', 'Limited Seats and Luxurious.');
insert into travel_class(id, name, description)
values (
        2,
        'Business Class',
        'Intermediate level of service between economy class and first class.'
    );
insert into travel_class(id, name, description)
values (
        3,
        'Premium Economy Class',
        'Positioning in price, comfort, and amenities, this travel class is leveled between economy class and business class.'
    );
insert into travel_class(id, name, description)
values (
        4,
        'Economy Class',
        'Lowest travel class of seating in air travel.'
    );