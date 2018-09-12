use master;
create database negocio;
use negocio;

create table login(
usuario varchar(20) primary key not null,
senha varchar(20) not null
);


select * from login;

create table configuracao(
usuario varchar(20) not null,
bruto decimal(5, 3) not null,
liquido decimal(5, 3) not null, 
aposentadoria decimal(5, 3) not null,
reserva decimal(5, 3) not null,
foreign key (usuario) references login(usuario)
);

insert into configuracao values('bruna', 0, 0,0,0);

select * from configuracao;

