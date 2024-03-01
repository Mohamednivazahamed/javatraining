insert into user1( id, username, password, active, roles)
values (1, 'bond','james',1, 'USER');
 
insert into user1( id, username, password, active, roles)
values (2, 'poo','bear',1, 'ADMIN');


insert into authorities (username, authority)
values ('bond','ROLE_USER');

insert into authorities (username, authority)
values ('poo','ROLE_ADMIN');
